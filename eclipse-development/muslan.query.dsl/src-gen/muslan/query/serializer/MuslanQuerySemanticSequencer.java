/*
 * generated by Xtext 2.38.0
 */
package muslan.query.serializer;

import com.google.inject.Inject;
import java.util.Set;
import muslan.query.services.MuslanQueryGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import query.AndClause;
import query.ArtistClause;
import query.CategoryClause;
import query.OrClause;
import query.Query;
import query.QueryPackage;
import query.TitleClause;

@SuppressWarnings("all")
public class MuslanQuerySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MuslanQueryGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == QueryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case QueryPackage.AND_CLAUSE:
				sequence_AndClause(context, (AndClause) semanticObject); 
				return; 
			case QueryPackage.ARTIST_CLAUSE:
				sequence_ArtistClause(context, (ArtistClause) semanticObject); 
				return; 
			case QueryPackage.CATEGORY_CLAUSE:
				sequence_CategoryClause(context, (CategoryClause) semanticObject); 
				return; 
			case QueryPackage.OR_CLAUSE:
				sequence_OrClause(context, (OrClause) semanticObject); 
				return; 
			case QueryPackage.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case QueryPackage.TITLE_CLAUSE:
				sequence_TitleClause(context, (TitleClause) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterClause returns AndClause
	 *     OrContent returns AndClause
	 *     AndClause returns AndClause
	 *
	 * Constraint:
	 *     (filterclause+=AndContent filterclause+=AndContent+)
	 * </pre>
	 */
	protected void sequence_AndClause(ISerializationContext context, AndClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterClause returns ArtistClause
	 *     Clause returns ArtistClause
	 *     ArtistClause returns ArtistClause
	 *     OrContent returns ArtistClause
	 *     AndContent returns ArtistClause
	 *
	 * Constraint:
	 *     (operator=RestrictedOperatorType value=STRING)
	 * </pre>
	 */
	protected void sequence_ArtistClause(ISerializationContext context, ArtistClause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.CLAUSE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.CLAUSE__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.CLAUSE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.CLAUSE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArtistClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getArtistClauseAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterClause returns CategoryClause
	 *     Clause returns CategoryClause
	 *     CategoryClause returns CategoryClause
	 *     OrContent returns CategoryClause
	 *     AndContent returns CategoryClause
	 *
	 * Constraint:
	 *     (category=CategoryType operator=OperatorType value=STRING)
	 * </pre>
	 */
	protected void sequence_CategoryClause(ISerializationContext context, CategoryClause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.CATEGORY_CLAUSE__CATEGORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.CATEGORY_CLAUSE__CATEGORY));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.CLAUSE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.CLAUSE__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.CLAUSE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.CLAUSE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCategoryClauseAccess().getCategoryCategoryTypeEnumRuleCall_0_0(), semanticObject.getCategory());
		feeder.accept(grammarAccess.getCategoryClauseAccess().getOperatorOperatorTypeEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getCategoryClauseAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterClause returns OrClause
	 *     OrClause returns OrClause
	 *     AndContent returns OrClause
	 *
	 * Constraint:
	 *     (filterclause+=OrContent filterclause+=OrContent+)
	 * </pre>
	 */
	protected void sequence_OrClause(ISerializationContext context, OrClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Query returns Query
	 *
	 * Constraint:
	 *     (type=CategorizedElementType collection=[MusicCollection|EString] filter=FilterClause)
	 * </pre>
	 */
	protected void sequence_Query(ISerializationContext context, Query semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.QUERY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.QUERY__TYPE));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.QUERY__COLLECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.QUERY__COLLECTION));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.QUERY__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.QUERY__FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQueryAccess().getTypeCategorizedElementTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getQueryAccess().getCollectionMusicCollectionEStringParserRuleCall_4_0_1(), semanticObject.eGet(QueryPackage.Literals.QUERY__COLLECTION, false));
		feeder.accept(grammarAccess.getQueryAccess().getFilterFilterClauseParserRuleCall_6_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FilterClause returns TitleClause
	 *     Clause returns TitleClause
	 *     TitleClause returns TitleClause
	 *     OrContent returns TitleClause
	 *     AndContent returns TitleClause
	 *
	 * Constraint:
	 *     (operator=RestrictedOperatorType value=STRING)
	 * </pre>
	 */
	protected void sequence_TitleClause(ISerializationContext context, TitleClause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.CLAUSE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.CLAUSE__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, QueryPackage.Literals.CLAUSE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryPackage.Literals.CLAUSE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitleClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getTitleClauseAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
