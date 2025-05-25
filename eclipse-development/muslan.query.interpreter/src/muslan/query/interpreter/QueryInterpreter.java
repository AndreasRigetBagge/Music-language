package muslan.query.interpreter;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import queue.QueueFactory;
import queue.Queue;
import query.Query;
import query.Clause;
import query.TitleClause;
import query.FilterClause;
import query.AndClause;
import query.ArtistClause;
import query.CategorizedElementType;
import query.CategoryClause;
import query.OperatorType;
import query.OrClause;
import musiccollection.MusicCollection;
import musiccollection.Category;
import musiccollection.CategoryType;
import musiccollection.Track;
import musiccollection.Album;
import musiccollection.CategorizedElement;

public class QueryInterpreter {
	static final List<String> emptyStringList = new ArrayList<String>();

	public static Queue interpret(Query query) throws QueryInterpreterException {
		FilterClause filter = query.getFilter();
		MusicCollection musiccollection = query.getCollection();
		Queue q = QueueFactory.eINSTANCE.createQueue();
		List<Track> tracks = q.getTracks();

		if (query.getType() == CategorizedElementType.ALBUM)
			filterAlbums(musiccollection, filter, tracks);
		else if (query.getType() == CategorizedElementType.TRACK)
			filterTracks(musiccollection, filter, tracks);
		return q;
	}

	public static void filterTracks(MusicCollection c, FilterClause f, List<Track> output) {
		List<Track> tracks = c.getCategorizedelements().stream()
				.filter(e -> (e instanceof Track) && filterElement(e, f))
				.map(e -> (Track) e)
				.toList();
		output.addAll(tracks);
	}

	public static void filterAlbums(MusicCollection c, FilterClause f, List<Track> output) {
		List<Track> tracks = c.getCategorizedelements().stream()
				.filter(e -> (e instanceof Album) && filterElement(e, f))
				.map(e -> (Album) e)
				.flatMap(a -> a.getTracks().stream())
				.toList();
		output.addAll(tracks);
	}

	public static boolean filterElement(CategorizedElement e, FilterClause f) {
		if (f instanceof Clause c) {
			List<String> values = emptyStringList;
			String u = c.getValue();

			if (f instanceof CategoryClause cc) {
				values = e.getCategory().stream()
						.filter(elem -> elem.getCategoryType() == cc.getCategory())
						.map(elem -> elem.getValue()).toList();
			} else if (f instanceof ArtistClause) {
				values = e.getArtists().stream().map(elem -> elem.getName()).toList();
			} else if (f instanceof TitleClause) {
				values = new ArrayList<String>();
				values.add(e.getName());
			}
			for (String t : values) {
				switch (c.getOperator()) {
					case OperatorType.SAME_AS:
						if (t.equals(u))
							return true;
						break;
					case OperatorType.DIFFERENT_FROM:
						if (!t.equals(u))
							return true;
						break;
					case OperatorType.GREATER_THAN:
						if (t.compareToIgnoreCase(u) > 0)
							return true;
						break;
					case OperatorType.LESS_THAN:
						if (t.compareToIgnoreCase(u) < 0)
							return true;
						break;
				}
			}
			return false;

		} else if (f instanceof AndClause andclause) {
			return filterElement(e, andclause.getFilterclause().getFirst()) &&
					filterElement(e, andclause.getFilterclause().getLast());
		} else if (f instanceof OrClause orclause) {
			return filterElement(e, orclause.getFilterclause().getFirst()) ||
					filterElement(e, orclause.getFilterclause().getLast());
		}
		return false;
	}
	/*
	 * public String interpret(StateMachine stateMachine, String interpreterInput,
	 * OutputStream interpreterOutputStream) throws QueryInterpreterException {
	 * String interpreterOutput = "";
	 * State currentState = stateMachine.getInitial();
	 * 
	 * if (currentState == null) {
	 * throw new QueryInterpreterException("State machine \"" +
	 * stateMachine.getName() + "\" does not specify an initial state.");
	 * }
	 * 
	 * println("Started interpretation of \"" + stateMachine.getName() + "\".",
	 * interpreterOutputStream);
	 * print("Output: \"", interpreterOutputStream);
	 * 
	 * while (!currentState.isIsFinal()) {
	 * List<Transition> transitions = currentState.getTransitions();
	 * List<Transition> enabledTransitions = new ArrayList<>();
	 * 
	 * //Find enabled transitions
	 * for (Transition transition : transitions) {
	 * String transitionInput = transition.getInput();
	 * 
	 * if (transitionInput == null || transitionInput.equals("") ||
	 * interpreterInput.startsWith(transitionInput)) {
	 * enabledTransitions.add(transition);
	 * }
	 * }
	 * 
	 * 
	 * int numberOfEnabledTransitions = enabledTransitions.size();
	 * 
	 * //Check for lock
	 * if (numberOfEnabledTransitions == 0) {
	 * throw new QueryInterpreterException("No enabled transitions at state \"" +
	 * currentState.getName() + "\" for input \"" + interpreterInput + "\".");
	 * }
	 * 
	 * //Check for non-determinism
	 * if (numberOfEnabledTransitions > 1) {
	 * throw new QueryInterpreterException("Non deterministics choice at state \"" +
	 * currentState.getName() + "\" for input \"" + interpreterInput + "\".");
	 * }
	 * 
	 * 
	 * //Execute transition
	 * Transition transition = enabledTransitions.get(0);
	 * State target = transition.getTarget();
	 * String transitionInput = transition.getInput();
	 * String transitionOutput = transition.getOutput();
	 * 
	 * //Consume transition input from interpreter input
	 * if (transitionInput != null && !transitionInput.equals("")) {
	 * interpreterInput = interpreterInput.substring(transitionInput.length());
	 * }
	 * 
	 * //Add transition output to interpreter output.
	 * if (transitionOutput != null) {
	 * interpreterOutput += transitionOutput;
	 * }
	 * 
	 * 
	 * //Produce transition output on interpreter output stream
	 * print(transitionOutput, interpreterOutputStream);
	 * 
	 * //Activate target state
	 * currentState = target;
	 * }
	 * 
	 * println("\".", interpreterOutputStream);
	 * println("Finished interpretation in state \"" + currentState.getName() +
	 * "\".", interpreterOutputStream);
	 * println(interpreterOutputStream);
	 * 
	 * return interpreterOutput;
	 * }
	 */

	protected static void println(OutputStream out) {
		println("", out);
	}

	protected static void println(String message, OutputStream out) {
		message += System.lineSeparator();

		print(message, out);
	}

	protected static void print(String message, OutputStream out) {
		if (message == null || out == null) {
			return;
		}

		try {
			out.write(message.getBytes());
		} catch (IOException e) {
			System.err.println("Problem writing to output stream.");
			e.printStackTrace();
		}
	}

	// private static FSMFactory factory = FSMFactory.eINSTANCE;
	//
	// public static final void main(String[] args) throws Exception {
	// FSMModel model = createExampleModel();
	//
	// FSMInterpreter interpreter = new FSMInterpreter();
	// interpreter.interpret(model, "aaaabc", System.out);
	// }
	//
	// private static FSMModel createExampleModel() {
	// FSMModel model = factory.createFSMModel();
	//
	// StateMachine stateMachine = factory.createStateMachine();
	// stateMachine.setName("State Machine 1");
	// model.getStateMachines().add(stateMachine);
	//
	// //States
	// State state1 = factory.createState();
	// state1.setName("State 1");
	// stateMachine.getStates().add(state1);
	// stateMachine.setInitial(state1);
	//
	// State state2 = factory.createState();
	// state2.setName("State 2");
	// stateMachine.getStates().add(state2);
	//
	// State finalState = factory.createState();
	// finalState.setName("Final State");
	// finalState.setIsFinal(true);
	// stateMachine.getStates().add(finalState);
	//
	//
	// //Transitions
	// createTransition(state1, state1, "a", "Really ");
	// createTransition(state1, state2, "b", "Good ");
	// createTransition(state2, finalState, "c", "Morning");
	//
	// return model;
	// }
	//
	// private static Transition createTransition(State source, State target, String
	// input, String output) {
	// Transition transition = factory.createTransition();
	// transition.setSource(source);
	// transition.setTarget(target);
	// transition.setInput(input);
	// transition.setOutput(output);
	//
	// return transition;
	// }
}
