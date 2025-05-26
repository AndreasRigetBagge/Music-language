package muslan.query.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import muslan.query.services.MuslanQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMuslanQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Artist", "Either", "Rating", "Album", "Genre", "Title", "Track", "Both", "From", "Pick", "With", "And", "Not", "Tag", "Or", "LeftParenthesis", "RightParenthesis", "Comma", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Artist=4;
    public static final int Or=18;
    public static final int Rating=6;
    public static final int Album=7;
    public static final int RULE_STRING=27;
    public static final int LessThanSign=22;
    public static final int With=14;
    public static final int RULE_SL_COMMENT=29;
    public static final int Comma=21;
    public static final int EqualsSign=23;
    public static final int LeftParenthesis=19;
    public static final int Either=5;
    public static final int EOF=-1;
    public static final int GreaterThanSign=24;
    public static final int Pick=13;
    public static final int RULE_ID=25;
    public static final int RULE_WS=30;
    public static final int RightParenthesis=20;
    public static final int Title=9;
    public static final int From=12;
    public static final int RULE_ANY_OTHER=31;
    public static final int Not=16;
    public static final int And=15;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=28;
    public static final int Genre=8;
    public static final int Tag=17;
    public static final int Track=10;
    public static final int Both=11;

    // delegates
    // delegators


        public InternalMuslanQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMuslanQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMuslanQueryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMuslanQueryParser.g"; }


    	private MuslanQueryGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("Or", "'or'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Tag", "'tag'");
    		tokenNameToValue.put("Both", "'both'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Pick", "'pick'");
    		tokenNameToValue.put("With", "'with'");
    		tokenNameToValue.put("Album", "'album'");
    		tokenNameToValue.put("Genre", "'genre'");
    		tokenNameToValue.put("Title", "'title'");
    		tokenNameToValue.put("Track", "'track'");
    		tokenNameToValue.put("Artist", "'artist'");
    		tokenNameToValue.put("Either", "'either'");
    		tokenNameToValue.put("Rating", "'rating'");
    	}

    	public void setGrammarAccess(MuslanQueryGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleQuery"
    // InternalMuslanQueryParser.g:76:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:77:1: ( ruleQuery EOF )
            // InternalMuslanQueryParser.g:78:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMuslanQueryParser.g:85:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:89:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalMuslanQueryParser.g:90:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalMuslanQueryParser.g:90:2: ( ( rule__Query__Group__0 ) )
            // InternalMuslanQueryParser.g:91:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalMuslanQueryParser.g:92:3: ( rule__Query__Group__0 )
            // InternalMuslanQueryParser.g:92:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleEString"
    // InternalMuslanQueryParser.g:101:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:102:1: ( ruleEString EOF )
            // InternalMuslanQueryParser.g:103:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMuslanQueryParser.g:110:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:114:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMuslanQueryParser.g:115:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:115:2: ( ( rule__EString__Alternatives ) )
            // InternalMuslanQueryParser.g:116:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:117:3: ( rule__EString__Alternatives )
            // InternalMuslanQueryParser.g:117:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFilterClause"
    // InternalMuslanQueryParser.g:126:1: entryRuleFilterClause : ruleFilterClause EOF ;
    public final void entryRuleFilterClause() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:127:1: ( ruleFilterClause EOF )
            // InternalMuslanQueryParser.g:128:1: ruleFilterClause EOF
            {
             before(grammarAccess.getFilterClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterClause();

            state._fsp--;

             after(grammarAccess.getFilterClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterClause"


    // $ANTLR start "ruleFilterClause"
    // InternalMuslanQueryParser.g:135:1: ruleFilterClause : ( ( rule__FilterClause__Alternatives ) ) ;
    public final void ruleFilterClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:139:2: ( ( ( rule__FilterClause__Alternatives ) ) )
            // InternalMuslanQueryParser.g:140:2: ( ( rule__FilterClause__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:140:2: ( ( rule__FilterClause__Alternatives ) )
            // InternalMuslanQueryParser.g:141:3: ( rule__FilterClause__Alternatives )
            {
             before(grammarAccess.getFilterClauseAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:142:3: ( rule__FilterClause__Alternatives )
            // InternalMuslanQueryParser.g:142:4: rule__FilterClause__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterClause"


    // $ANTLR start "entryRuleClause"
    // InternalMuslanQueryParser.g:151:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:152:1: ( ruleClause EOF )
            // InternalMuslanQueryParser.g:153:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalMuslanQueryParser.g:160:1: ruleClause : ( ( rule__Clause__Alternatives ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:164:2: ( ( ( rule__Clause__Alternatives ) ) )
            // InternalMuslanQueryParser.g:165:2: ( ( rule__Clause__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:165:2: ( ( rule__Clause__Alternatives ) )
            // InternalMuslanQueryParser.g:166:3: ( rule__Clause__Alternatives )
            {
             before(grammarAccess.getClauseAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:167:3: ( rule__Clause__Alternatives )
            // InternalMuslanQueryParser.g:167:4: rule__Clause__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleCategoryClause"
    // InternalMuslanQueryParser.g:176:1: entryRuleCategoryClause : ruleCategoryClause EOF ;
    public final void entryRuleCategoryClause() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:177:1: ( ruleCategoryClause EOF )
            // InternalMuslanQueryParser.g:178:1: ruleCategoryClause EOF
            {
             before(grammarAccess.getCategoryClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleCategoryClause();

            state._fsp--;

             after(grammarAccess.getCategoryClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategoryClause"


    // $ANTLR start "ruleCategoryClause"
    // InternalMuslanQueryParser.g:185:1: ruleCategoryClause : ( ( rule__CategoryClause__Group__0 ) ) ;
    public final void ruleCategoryClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:189:2: ( ( ( rule__CategoryClause__Group__0 ) ) )
            // InternalMuslanQueryParser.g:190:2: ( ( rule__CategoryClause__Group__0 ) )
            {
            // InternalMuslanQueryParser.g:190:2: ( ( rule__CategoryClause__Group__0 ) )
            // InternalMuslanQueryParser.g:191:3: ( rule__CategoryClause__Group__0 )
            {
             before(grammarAccess.getCategoryClauseAccess().getGroup()); 
            // InternalMuslanQueryParser.g:192:3: ( rule__CategoryClause__Group__0 )
            // InternalMuslanQueryParser.g:192:4: rule__CategoryClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CategoryClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategoryClause"


    // $ANTLR start "entryRuleArtistClause"
    // InternalMuslanQueryParser.g:201:1: entryRuleArtistClause : ruleArtistClause EOF ;
    public final void entryRuleArtistClause() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:202:1: ( ruleArtistClause EOF )
            // InternalMuslanQueryParser.g:203:1: ruleArtistClause EOF
            {
             before(grammarAccess.getArtistClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleArtistClause();

            state._fsp--;

             after(grammarAccess.getArtistClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArtistClause"


    // $ANTLR start "ruleArtistClause"
    // InternalMuslanQueryParser.g:210:1: ruleArtistClause : ( ( rule__ArtistClause__Group__0 ) ) ;
    public final void ruleArtistClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:214:2: ( ( ( rule__ArtistClause__Group__0 ) ) )
            // InternalMuslanQueryParser.g:215:2: ( ( rule__ArtistClause__Group__0 ) )
            {
            // InternalMuslanQueryParser.g:215:2: ( ( rule__ArtistClause__Group__0 ) )
            // InternalMuslanQueryParser.g:216:3: ( rule__ArtistClause__Group__0 )
            {
             before(grammarAccess.getArtistClauseAccess().getGroup()); 
            // InternalMuslanQueryParser.g:217:3: ( rule__ArtistClause__Group__0 )
            // InternalMuslanQueryParser.g:217:4: rule__ArtistClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArtistClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtistClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtistClause"


    // $ANTLR start "entryRuleTitleClause"
    // InternalMuslanQueryParser.g:226:1: entryRuleTitleClause : ruleTitleClause EOF ;
    public final void entryRuleTitleClause() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:227:1: ( ruleTitleClause EOF )
            // InternalMuslanQueryParser.g:228:1: ruleTitleClause EOF
            {
             before(grammarAccess.getTitleClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleTitleClause();

            state._fsp--;

             after(grammarAccess.getTitleClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitleClause"


    // $ANTLR start "ruleTitleClause"
    // InternalMuslanQueryParser.g:235:1: ruleTitleClause : ( ( rule__TitleClause__Group__0 ) ) ;
    public final void ruleTitleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:239:2: ( ( ( rule__TitleClause__Group__0 ) ) )
            // InternalMuslanQueryParser.g:240:2: ( ( rule__TitleClause__Group__0 ) )
            {
            // InternalMuslanQueryParser.g:240:2: ( ( rule__TitleClause__Group__0 ) )
            // InternalMuslanQueryParser.g:241:3: ( rule__TitleClause__Group__0 )
            {
             before(grammarAccess.getTitleClauseAccess().getGroup()); 
            // InternalMuslanQueryParser.g:242:3: ( rule__TitleClause__Group__0 )
            // InternalMuslanQueryParser.g:242:4: rule__TitleClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TitleClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitleClause"


    // $ANTLR start "entryRuleOrClause"
    // InternalMuslanQueryParser.g:251:1: entryRuleOrClause : ruleOrClause EOF ;
    public final void entryRuleOrClause() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:252:1: ( ruleOrClause EOF )
            // InternalMuslanQueryParser.g:253:1: ruleOrClause EOF
            {
             before(grammarAccess.getOrClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleOrClause();

            state._fsp--;

             after(grammarAccess.getOrClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrClause"


    // $ANTLR start "ruleOrClause"
    // InternalMuslanQueryParser.g:260:1: ruleOrClause : ( ( rule__OrClause__Group__0 ) ) ;
    public final void ruleOrClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:264:2: ( ( ( rule__OrClause__Group__0 ) ) )
            // InternalMuslanQueryParser.g:265:2: ( ( rule__OrClause__Group__0 ) )
            {
            // InternalMuslanQueryParser.g:265:2: ( ( rule__OrClause__Group__0 ) )
            // InternalMuslanQueryParser.g:266:3: ( rule__OrClause__Group__0 )
            {
             before(grammarAccess.getOrClauseAccess().getGroup()); 
            // InternalMuslanQueryParser.g:267:3: ( rule__OrClause__Group__0 )
            // InternalMuslanQueryParser.g:267:4: rule__OrClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrClause"


    // $ANTLR start "entryRuleOrContent"
    // InternalMuslanQueryParser.g:276:1: entryRuleOrContent : ruleOrContent EOF ;
    public final void entryRuleOrContent() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:277:1: ( ruleOrContent EOF )
            // InternalMuslanQueryParser.g:278:1: ruleOrContent EOF
            {
             before(grammarAccess.getOrContentRule()); 
            pushFollow(FOLLOW_1);
            ruleOrContent();

            state._fsp--;

             after(grammarAccess.getOrContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrContent"


    // $ANTLR start "ruleOrContent"
    // InternalMuslanQueryParser.g:285:1: ruleOrContent : ( ( rule__OrContent__Alternatives ) ) ;
    public final void ruleOrContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:289:2: ( ( ( rule__OrContent__Alternatives ) ) )
            // InternalMuslanQueryParser.g:290:2: ( ( rule__OrContent__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:290:2: ( ( rule__OrContent__Alternatives ) )
            // InternalMuslanQueryParser.g:291:3: ( rule__OrContent__Alternatives )
            {
             before(grammarAccess.getOrContentAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:292:3: ( rule__OrContent__Alternatives )
            // InternalMuslanQueryParser.g:292:4: rule__OrContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrContent"


    // $ANTLR start "entryRuleAndClause"
    // InternalMuslanQueryParser.g:301:1: entryRuleAndClause : ruleAndClause EOF ;
    public final void entryRuleAndClause() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:302:1: ( ruleAndClause EOF )
            // InternalMuslanQueryParser.g:303:1: ruleAndClause EOF
            {
             before(grammarAccess.getAndClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleAndClause();

            state._fsp--;

             after(grammarAccess.getAndClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndClause"


    // $ANTLR start "ruleAndClause"
    // InternalMuslanQueryParser.g:310:1: ruleAndClause : ( ( rule__AndClause__Group__0 ) ) ;
    public final void ruleAndClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:314:2: ( ( ( rule__AndClause__Group__0 ) ) )
            // InternalMuslanQueryParser.g:315:2: ( ( rule__AndClause__Group__0 ) )
            {
            // InternalMuslanQueryParser.g:315:2: ( ( rule__AndClause__Group__0 ) )
            // InternalMuslanQueryParser.g:316:3: ( rule__AndClause__Group__0 )
            {
             before(grammarAccess.getAndClauseAccess().getGroup()); 
            // InternalMuslanQueryParser.g:317:3: ( rule__AndClause__Group__0 )
            // InternalMuslanQueryParser.g:317:4: rule__AndClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndClause"


    // $ANTLR start "entryRuleAndContent"
    // InternalMuslanQueryParser.g:326:1: entryRuleAndContent : ruleAndContent EOF ;
    public final void entryRuleAndContent() throws RecognitionException {
        try {
            // InternalMuslanQueryParser.g:327:1: ( ruleAndContent EOF )
            // InternalMuslanQueryParser.g:328:1: ruleAndContent EOF
            {
             before(grammarAccess.getAndContentRule()); 
            pushFollow(FOLLOW_1);
            ruleAndContent();

            state._fsp--;

             after(grammarAccess.getAndContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndContent"


    // $ANTLR start "ruleAndContent"
    // InternalMuslanQueryParser.g:335:1: ruleAndContent : ( ( rule__AndContent__Alternatives ) ) ;
    public final void ruleAndContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:339:2: ( ( ( rule__AndContent__Alternatives ) ) )
            // InternalMuslanQueryParser.g:340:2: ( ( rule__AndContent__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:340:2: ( ( rule__AndContent__Alternatives ) )
            // InternalMuslanQueryParser.g:341:3: ( rule__AndContent__Alternatives )
            {
             before(grammarAccess.getAndContentAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:342:3: ( rule__AndContent__Alternatives )
            // InternalMuslanQueryParser.g:342:4: rule__AndContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AndContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAndContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndContent"


    // $ANTLR start "ruleCategorizedElementType"
    // InternalMuslanQueryParser.g:351:1: ruleCategorizedElementType : ( ( rule__CategorizedElementType__Alternatives ) ) ;
    public final void ruleCategorizedElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:355:1: ( ( ( rule__CategorizedElementType__Alternatives ) ) )
            // InternalMuslanQueryParser.g:356:2: ( ( rule__CategorizedElementType__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:356:2: ( ( rule__CategorizedElementType__Alternatives ) )
            // InternalMuslanQueryParser.g:357:3: ( rule__CategorizedElementType__Alternatives )
            {
             before(grammarAccess.getCategorizedElementTypeAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:358:3: ( rule__CategorizedElementType__Alternatives )
            // InternalMuslanQueryParser.g:358:4: rule__CategorizedElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CategorizedElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategorizedElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategorizedElementType"


    // $ANTLR start "ruleCategoryType"
    // InternalMuslanQueryParser.g:367:1: ruleCategoryType : ( ( rule__CategoryType__Alternatives ) ) ;
    public final void ruleCategoryType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:371:1: ( ( ( rule__CategoryType__Alternatives ) ) )
            // InternalMuslanQueryParser.g:372:2: ( ( rule__CategoryType__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:372:2: ( ( rule__CategoryType__Alternatives ) )
            // InternalMuslanQueryParser.g:373:3: ( rule__CategoryType__Alternatives )
            {
             before(grammarAccess.getCategoryTypeAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:374:3: ( rule__CategoryType__Alternatives )
            // InternalMuslanQueryParser.g:374:4: rule__CategoryType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CategoryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategoryTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategoryType"


    // $ANTLR start "ruleOperatorType"
    // InternalMuslanQueryParser.g:383:1: ruleOperatorType : ( ( rule__OperatorType__Alternatives ) ) ;
    public final void ruleOperatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:387:1: ( ( ( rule__OperatorType__Alternatives ) ) )
            // InternalMuslanQueryParser.g:388:2: ( ( rule__OperatorType__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:388:2: ( ( rule__OperatorType__Alternatives ) )
            // InternalMuslanQueryParser.g:389:3: ( rule__OperatorType__Alternatives )
            {
             before(grammarAccess.getOperatorTypeAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:390:3: ( rule__OperatorType__Alternatives )
            // InternalMuslanQueryParser.g:390:4: rule__OperatorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperatorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperatorType"


    // $ANTLR start "ruleRestrictedOperatorType"
    // InternalMuslanQueryParser.g:399:1: ruleRestrictedOperatorType : ( ( rule__RestrictedOperatorType__Alternatives ) ) ;
    public final void ruleRestrictedOperatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:403:1: ( ( ( rule__RestrictedOperatorType__Alternatives ) ) )
            // InternalMuslanQueryParser.g:404:2: ( ( rule__RestrictedOperatorType__Alternatives ) )
            {
            // InternalMuslanQueryParser.g:404:2: ( ( rule__RestrictedOperatorType__Alternatives ) )
            // InternalMuslanQueryParser.g:405:3: ( rule__RestrictedOperatorType__Alternatives )
            {
             before(grammarAccess.getRestrictedOperatorTypeAccess().getAlternatives()); 
            // InternalMuslanQueryParser.g:406:3: ( rule__RestrictedOperatorType__Alternatives )
            // InternalMuslanQueryParser.g:406:4: rule__RestrictedOperatorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RestrictedOperatorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedOperatorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictedOperatorType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMuslanQueryParser.g:414:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:418:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMuslanQueryParser.g:419:2: ( RULE_STRING )
                    {
                    // InternalMuslanQueryParser.g:419:2: ( RULE_STRING )
                    // InternalMuslanQueryParser.g:420:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:425:2: ( RULE_ID )
                    {
                    // InternalMuslanQueryParser.g:425:2: ( RULE_ID )
                    // InternalMuslanQueryParser.g:426:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__FilterClause__Alternatives"
    // InternalMuslanQueryParser.g:435:1: rule__FilterClause__Alternatives : ( ( ruleClause ) | ( ruleOrClause ) | ( ruleAndClause ) );
    public final void rule__FilterClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:439:1: ( ( ruleClause ) | ( ruleOrClause ) | ( ruleAndClause ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Artist:
            case Rating:
            case Genre:
            case Title:
            case Tag:
                {
                alt2=1;
                }
                break;
            case Either:
                {
                alt2=2;
                }
                break;
            case Both:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMuslanQueryParser.g:440:2: ( ruleClause )
                    {
                    // InternalMuslanQueryParser.g:440:2: ( ruleClause )
                    // InternalMuslanQueryParser.g:441:3: ruleClause
                    {
                     before(grammarAccess.getFilterClauseAccess().getClauseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClause();

                    state._fsp--;

                     after(grammarAccess.getFilterClauseAccess().getClauseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:446:2: ( ruleOrClause )
                    {
                    // InternalMuslanQueryParser.g:446:2: ( ruleOrClause )
                    // InternalMuslanQueryParser.g:447:3: ruleOrClause
                    {
                     before(grammarAccess.getFilterClauseAccess().getOrClauseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrClause();

                    state._fsp--;

                     after(grammarAccess.getFilterClauseAccess().getOrClauseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:452:2: ( ruleAndClause )
                    {
                    // InternalMuslanQueryParser.g:452:2: ( ruleAndClause )
                    // InternalMuslanQueryParser.g:453:3: ruleAndClause
                    {
                     before(grammarAccess.getFilterClauseAccess().getAndClauseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAndClause();

                    state._fsp--;

                     after(grammarAccess.getFilterClauseAccess().getAndClauseParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterClause__Alternatives"


    // $ANTLR start "rule__Clause__Alternatives"
    // InternalMuslanQueryParser.g:462:1: rule__Clause__Alternatives : ( ( ruleCategoryClause ) | ( ruleArtistClause ) | ( ruleTitleClause ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:466:1: ( ( ruleCategoryClause ) | ( ruleArtistClause ) | ( ruleTitleClause ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case Rating:
            case Genre:
            case Tag:
                {
                alt3=1;
                }
                break;
            case Artist:
                {
                alt3=2;
                }
                break;
            case Title:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMuslanQueryParser.g:467:2: ( ruleCategoryClause )
                    {
                    // InternalMuslanQueryParser.g:467:2: ( ruleCategoryClause )
                    // InternalMuslanQueryParser.g:468:3: ruleCategoryClause
                    {
                     before(grammarAccess.getClauseAccess().getCategoryClauseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCategoryClause();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getCategoryClauseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:473:2: ( ruleArtistClause )
                    {
                    // InternalMuslanQueryParser.g:473:2: ( ruleArtistClause )
                    // InternalMuslanQueryParser.g:474:3: ruleArtistClause
                    {
                     before(grammarAccess.getClauseAccess().getArtistClauseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArtistClause();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getArtistClauseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:479:2: ( ruleTitleClause )
                    {
                    // InternalMuslanQueryParser.g:479:2: ( ruleTitleClause )
                    // InternalMuslanQueryParser.g:480:3: ruleTitleClause
                    {
                     before(grammarAccess.getClauseAccess().getTitleClauseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTitleClause();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getTitleClauseParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Alternatives"


    // $ANTLR start "rule__OrClause__Alternatives_3_0"
    // InternalMuslanQueryParser.g:489:1: rule__OrClause__Alternatives_3_0 : ( ( Or ) | ( Comma ) );
    public final void rule__OrClause__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:493:1: ( ( Or ) | ( Comma ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Or) ) {
                alt4=1;
            }
            else if ( (LA4_0==Comma) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMuslanQueryParser.g:494:2: ( Or )
                    {
                    // InternalMuslanQueryParser.g:494:2: ( Or )
                    // InternalMuslanQueryParser.g:495:3: Or
                    {
                     before(grammarAccess.getOrClauseAccess().getOrKeyword_3_0_0()); 
                    match(input,Or,FOLLOW_2); 
                     after(grammarAccess.getOrClauseAccess().getOrKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:500:2: ( Comma )
                    {
                    // InternalMuslanQueryParser.g:500:2: ( Comma )
                    // InternalMuslanQueryParser.g:501:3: Comma
                    {
                     before(grammarAccess.getOrClauseAccess().getCommaKeyword_3_0_1()); 
                    match(input,Comma,FOLLOW_2); 
                     after(grammarAccess.getOrClauseAccess().getCommaKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Alternatives_3_0"


    // $ANTLR start "rule__OrContent__Alternatives"
    // InternalMuslanQueryParser.g:510:1: rule__OrContent__Alternatives : ( ( ruleClause ) | ( ruleAndClause ) );
    public final void rule__OrContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:514:1: ( ( ruleClause ) | ( ruleAndClause ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Artist||LA5_0==Rating||(LA5_0>=Genre && LA5_0<=Title)||LA5_0==Tag) ) {
                alt5=1;
            }
            else if ( (LA5_0==Both) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMuslanQueryParser.g:515:2: ( ruleClause )
                    {
                    // InternalMuslanQueryParser.g:515:2: ( ruleClause )
                    // InternalMuslanQueryParser.g:516:3: ruleClause
                    {
                     before(grammarAccess.getOrContentAccess().getClauseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClause();

                    state._fsp--;

                     after(grammarAccess.getOrContentAccess().getClauseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:521:2: ( ruleAndClause )
                    {
                    // InternalMuslanQueryParser.g:521:2: ( ruleAndClause )
                    // InternalMuslanQueryParser.g:522:3: ruleAndClause
                    {
                     before(grammarAccess.getOrContentAccess().getAndClauseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAndClause();

                    state._fsp--;

                     after(grammarAccess.getOrContentAccess().getAndClauseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrContent__Alternatives"


    // $ANTLR start "rule__AndClause__Alternatives_3_0"
    // InternalMuslanQueryParser.g:531:1: rule__AndClause__Alternatives_3_0 : ( ( And ) | ( Comma ) );
    public final void rule__AndClause__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:535:1: ( ( And ) | ( Comma ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==And) ) {
                alt6=1;
            }
            else if ( (LA6_0==Comma) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMuslanQueryParser.g:536:2: ( And )
                    {
                    // InternalMuslanQueryParser.g:536:2: ( And )
                    // InternalMuslanQueryParser.g:537:3: And
                    {
                     before(grammarAccess.getAndClauseAccess().getAndKeyword_3_0_0()); 
                    match(input,And,FOLLOW_2); 
                     after(grammarAccess.getAndClauseAccess().getAndKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:542:2: ( Comma )
                    {
                    // InternalMuslanQueryParser.g:542:2: ( Comma )
                    // InternalMuslanQueryParser.g:543:3: Comma
                    {
                     before(grammarAccess.getAndClauseAccess().getCommaKeyword_3_0_1()); 
                    match(input,Comma,FOLLOW_2); 
                     after(grammarAccess.getAndClauseAccess().getCommaKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Alternatives_3_0"


    // $ANTLR start "rule__AndContent__Alternatives"
    // InternalMuslanQueryParser.g:552:1: rule__AndContent__Alternatives : ( ( ruleClause ) | ( ruleOrClause ) );
    public final void rule__AndContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:556:1: ( ( ruleClause ) | ( ruleOrClause ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Artist||LA7_0==Rating||(LA7_0>=Genre && LA7_0<=Title)||LA7_0==Tag) ) {
                alt7=1;
            }
            else if ( (LA7_0==Either) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMuslanQueryParser.g:557:2: ( ruleClause )
                    {
                    // InternalMuslanQueryParser.g:557:2: ( ruleClause )
                    // InternalMuslanQueryParser.g:558:3: ruleClause
                    {
                     before(grammarAccess.getAndContentAccess().getClauseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClause();

                    state._fsp--;

                     after(grammarAccess.getAndContentAccess().getClauseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:563:2: ( ruleOrClause )
                    {
                    // InternalMuslanQueryParser.g:563:2: ( ruleOrClause )
                    // InternalMuslanQueryParser.g:564:3: ruleOrClause
                    {
                     before(grammarAccess.getAndContentAccess().getOrClauseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrClause();

                    state._fsp--;

                     after(grammarAccess.getAndContentAccess().getOrClauseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndContent__Alternatives"


    // $ANTLR start "rule__CategorizedElementType__Alternatives"
    // InternalMuslanQueryParser.g:573:1: rule__CategorizedElementType__Alternatives : ( ( ( Track ) ) | ( ( Album ) ) );
    public final void rule__CategorizedElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:577:1: ( ( ( Track ) ) | ( ( Album ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Track) ) {
                alt8=1;
            }
            else if ( (LA8_0==Album) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMuslanQueryParser.g:578:2: ( ( Track ) )
                    {
                    // InternalMuslanQueryParser.g:578:2: ( ( Track ) )
                    // InternalMuslanQueryParser.g:579:3: ( Track )
                    {
                     before(grammarAccess.getCategorizedElementTypeAccess().getTrackEnumLiteralDeclaration_0()); 
                    // InternalMuslanQueryParser.g:580:3: ( Track )
                    // InternalMuslanQueryParser.g:580:4: Track
                    {
                    match(input,Track,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizedElementTypeAccess().getTrackEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:584:2: ( ( Album ) )
                    {
                    // InternalMuslanQueryParser.g:584:2: ( ( Album ) )
                    // InternalMuslanQueryParser.g:585:3: ( Album )
                    {
                     before(grammarAccess.getCategorizedElementTypeAccess().getAlbumEnumLiteralDeclaration_1()); 
                    // InternalMuslanQueryParser.g:586:3: ( Album )
                    // InternalMuslanQueryParser.g:586:4: Album
                    {
                    match(input,Album,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategorizedElementTypeAccess().getAlbumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategorizedElementType__Alternatives"


    // $ANTLR start "rule__CategoryType__Alternatives"
    // InternalMuslanQueryParser.g:594:1: rule__CategoryType__Alternatives : ( ( ( Rating ) ) | ( ( Genre ) ) | ( ( Tag ) ) );
    public final void rule__CategoryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:598:1: ( ( ( Rating ) ) | ( ( Genre ) ) | ( ( Tag ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case Rating:
                {
                alt9=1;
                }
                break;
            case Genre:
                {
                alt9=2;
                }
                break;
            case Tag:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMuslanQueryParser.g:599:2: ( ( Rating ) )
                    {
                    // InternalMuslanQueryParser.g:599:2: ( ( Rating ) )
                    // InternalMuslanQueryParser.g:600:3: ( Rating )
                    {
                     before(grammarAccess.getCategoryTypeAccess().getRatingEnumLiteralDeclaration_0()); 
                    // InternalMuslanQueryParser.g:601:3: ( Rating )
                    // InternalMuslanQueryParser.g:601:4: Rating
                    {
                    match(input,Rating,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategoryTypeAccess().getRatingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:605:2: ( ( Genre ) )
                    {
                    // InternalMuslanQueryParser.g:605:2: ( ( Genre ) )
                    // InternalMuslanQueryParser.g:606:3: ( Genre )
                    {
                     before(grammarAccess.getCategoryTypeAccess().getGenreEnumLiteralDeclaration_1()); 
                    // InternalMuslanQueryParser.g:607:3: ( Genre )
                    // InternalMuslanQueryParser.g:607:4: Genre
                    {
                    match(input,Genre,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategoryTypeAccess().getGenreEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:611:2: ( ( Tag ) )
                    {
                    // InternalMuslanQueryParser.g:611:2: ( ( Tag ) )
                    // InternalMuslanQueryParser.g:612:3: ( Tag )
                    {
                     before(grammarAccess.getCategoryTypeAccess().getTagEnumLiteralDeclaration_2()); 
                    // InternalMuslanQueryParser.g:613:3: ( Tag )
                    // InternalMuslanQueryParser.g:613:4: Tag
                    {
                    match(input,Tag,FOLLOW_2); 

                    }

                     after(grammarAccess.getCategoryTypeAccess().getTagEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryType__Alternatives"


    // $ANTLR start "rule__OperatorType__Alternatives"
    // InternalMuslanQueryParser.g:621:1: rule__OperatorType__Alternatives : ( ( ( EqualsSign ) ) | ( ( Not ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) );
    public final void rule__OperatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:625:1: ( ( ( EqualsSign ) ) | ( ( Not ) ) | ( ( LessThanSign ) ) | ( ( GreaterThanSign ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt10=1;
                }
                break;
            case Not:
                {
                alt10=2;
                }
                break;
            case LessThanSign:
                {
                alt10=3;
                }
                break;
            case GreaterThanSign:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMuslanQueryParser.g:626:2: ( ( EqualsSign ) )
                    {
                    // InternalMuslanQueryParser.g:626:2: ( ( EqualsSign ) )
                    // InternalMuslanQueryParser.g:627:3: ( EqualsSign )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0()); 
                    // InternalMuslanQueryParser.g:628:3: ( EqualsSign )
                    // InternalMuslanQueryParser.g:628:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:632:2: ( ( Not ) )
                    {
                    // InternalMuslanQueryParser.g:632:2: ( ( Not ) )
                    // InternalMuslanQueryParser.g:633:3: ( Not )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1()); 
                    // InternalMuslanQueryParser.g:634:3: ( Not )
                    // InternalMuslanQueryParser.g:634:4: Not
                    {
                    match(input,Not,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:638:2: ( ( LessThanSign ) )
                    {
                    // InternalMuslanQueryParser.g:638:2: ( ( LessThanSign ) )
                    // InternalMuslanQueryParser.g:639:3: ( LessThanSign )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getLessThanEnumLiteralDeclaration_2()); 
                    // InternalMuslanQueryParser.g:640:3: ( LessThanSign )
                    // InternalMuslanQueryParser.g:640:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getLessThanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMuslanQueryParser.g:644:2: ( ( GreaterThanSign ) )
                    {
                    // InternalMuslanQueryParser.g:644:2: ( ( GreaterThanSign ) )
                    // InternalMuslanQueryParser.g:645:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getOperatorTypeAccess().getGreaterThanEnumLiteralDeclaration_3()); 
                    // InternalMuslanQueryParser.g:646:3: ( GreaterThanSign )
                    // InternalMuslanQueryParser.g:646:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorTypeAccess().getGreaterThanEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatorType__Alternatives"


    // $ANTLR start "rule__RestrictedOperatorType__Alternatives"
    // InternalMuslanQueryParser.g:654:1: rule__RestrictedOperatorType__Alternatives : ( ( ( EqualsSign ) ) | ( ( Not ) ) );
    public final void rule__RestrictedOperatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:658:1: ( ( ( EqualsSign ) ) | ( ( Not ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EqualsSign) ) {
                alt11=1;
            }
            else if ( (LA11_0==Not) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMuslanQueryParser.g:659:2: ( ( EqualsSign ) )
                    {
                    // InternalMuslanQueryParser.g:659:2: ( ( EqualsSign ) )
                    // InternalMuslanQueryParser.g:660:3: ( EqualsSign )
                    {
                     before(grammarAccess.getRestrictedOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0()); 
                    // InternalMuslanQueryParser.g:661:3: ( EqualsSign )
                    // InternalMuslanQueryParser.g:661:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestrictedOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:665:2: ( ( Not ) )
                    {
                    // InternalMuslanQueryParser.g:665:2: ( ( Not ) )
                    // InternalMuslanQueryParser.g:666:3: ( Not )
                    {
                     before(grammarAccess.getRestrictedOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1()); 
                    // InternalMuslanQueryParser.g:667:3: ( Not )
                    // InternalMuslanQueryParser.g:667:4: Not
                    {
                    match(input,Not,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestrictedOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedOperatorType__Alternatives"


    // $ANTLR start "rule__Query__Group__0"
    // InternalMuslanQueryParser.g:675:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:679:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalMuslanQueryParser.g:680:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalMuslanQueryParser.g:687:1: rule__Query__Group__0__Impl : ( () ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:691:1: ( ( () ) )
            // InternalMuslanQueryParser.g:692:1: ( () )
            {
            // InternalMuslanQueryParser.g:692:1: ( () )
            // InternalMuslanQueryParser.g:693:2: ()
            {
             before(grammarAccess.getQueryAccess().getQueryAction_0()); 
            // InternalMuslanQueryParser.g:694:2: ()
            // InternalMuslanQueryParser.g:694:3: 
            {
            }

             after(grammarAccess.getQueryAccess().getQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalMuslanQueryParser.g:702:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:706:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalMuslanQueryParser.g:707:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalMuslanQueryParser.g:714:1: rule__Query__Group__1__Impl : ( Pick ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:718:1: ( ( Pick ) )
            // InternalMuslanQueryParser.g:719:1: ( Pick )
            {
            // InternalMuslanQueryParser.g:719:1: ( Pick )
            // InternalMuslanQueryParser.g:720:2: Pick
            {
             before(grammarAccess.getQueryAccess().getPickKeyword_1()); 
            match(input,Pick,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getPickKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalMuslanQueryParser.g:729:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:733:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalMuslanQueryParser.g:734:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalMuslanQueryParser.g:741:1: rule__Query__Group__2__Impl : ( ( rule__Query__TypeAssignment_2 ) ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:745:1: ( ( ( rule__Query__TypeAssignment_2 ) ) )
            // InternalMuslanQueryParser.g:746:1: ( ( rule__Query__TypeAssignment_2 ) )
            {
            // InternalMuslanQueryParser.g:746:1: ( ( rule__Query__TypeAssignment_2 ) )
            // InternalMuslanQueryParser.g:747:2: ( rule__Query__TypeAssignment_2 )
            {
             before(grammarAccess.getQueryAccess().getTypeAssignment_2()); 
            // InternalMuslanQueryParser.g:748:2: ( rule__Query__TypeAssignment_2 )
            // InternalMuslanQueryParser.g:748:3: rule__Query__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Query__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalMuslanQueryParser.g:756:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:760:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalMuslanQueryParser.g:761:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalMuslanQueryParser.g:768:1: rule__Query__Group__3__Impl : ( From ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:772:1: ( ( From ) )
            // InternalMuslanQueryParser.g:773:1: ( From )
            {
            // InternalMuslanQueryParser.g:773:1: ( From )
            // InternalMuslanQueryParser.g:774:2: From
            {
             before(grammarAccess.getQueryAccess().getFromKeyword_3()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // InternalMuslanQueryParser.g:783:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:787:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalMuslanQueryParser.g:788:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalMuslanQueryParser.g:795:1: rule__Query__Group__4__Impl : ( ( rule__Query__CollectionAssignment_4 ) ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:799:1: ( ( ( rule__Query__CollectionAssignment_4 ) ) )
            // InternalMuslanQueryParser.g:800:1: ( ( rule__Query__CollectionAssignment_4 ) )
            {
            // InternalMuslanQueryParser.g:800:1: ( ( rule__Query__CollectionAssignment_4 ) )
            // InternalMuslanQueryParser.g:801:2: ( rule__Query__CollectionAssignment_4 )
            {
             before(grammarAccess.getQueryAccess().getCollectionAssignment_4()); 
            // InternalMuslanQueryParser.g:802:2: ( rule__Query__CollectionAssignment_4 )
            // InternalMuslanQueryParser.g:802:3: rule__Query__CollectionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Query__CollectionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getCollectionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalMuslanQueryParser.g:810:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:814:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalMuslanQueryParser.g:815:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Query__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalMuslanQueryParser.g:822:1: rule__Query__Group__5__Impl : ( With ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:826:1: ( ( With ) )
            // InternalMuslanQueryParser.g:827:1: ( With )
            {
            // InternalMuslanQueryParser.g:827:1: ( With )
            // InternalMuslanQueryParser.g:828:2: With
            {
             before(grammarAccess.getQueryAccess().getWithKeyword_5()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getWithKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__6"
    // InternalMuslanQueryParser.g:837:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:841:1: ( rule__Query__Group__6__Impl )
            // InternalMuslanQueryParser.g:842:2: rule__Query__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6"


    // $ANTLR start "rule__Query__Group__6__Impl"
    // InternalMuslanQueryParser.g:848:1: rule__Query__Group__6__Impl : ( ( rule__Query__FilterAssignment_6 ) ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:852:1: ( ( ( rule__Query__FilterAssignment_6 ) ) )
            // InternalMuslanQueryParser.g:853:1: ( ( rule__Query__FilterAssignment_6 ) )
            {
            // InternalMuslanQueryParser.g:853:1: ( ( rule__Query__FilterAssignment_6 ) )
            // InternalMuslanQueryParser.g:854:2: ( rule__Query__FilterAssignment_6 )
            {
             before(grammarAccess.getQueryAccess().getFilterAssignment_6()); 
            // InternalMuslanQueryParser.g:855:2: ( rule__Query__FilterAssignment_6 )
            // InternalMuslanQueryParser.g:855:3: rule__Query__FilterAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Query__FilterAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getFilterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6__Impl"


    // $ANTLR start "rule__CategoryClause__Group__0"
    // InternalMuslanQueryParser.g:864:1: rule__CategoryClause__Group__0 : rule__CategoryClause__Group__0__Impl rule__CategoryClause__Group__1 ;
    public final void rule__CategoryClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:868:1: ( rule__CategoryClause__Group__0__Impl rule__CategoryClause__Group__1 )
            // InternalMuslanQueryParser.g:869:2: rule__CategoryClause__Group__0__Impl rule__CategoryClause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CategoryClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CategoryClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__Group__0"


    // $ANTLR start "rule__CategoryClause__Group__0__Impl"
    // InternalMuslanQueryParser.g:876:1: rule__CategoryClause__Group__0__Impl : ( ( rule__CategoryClause__CategoryAssignment_0 ) ) ;
    public final void rule__CategoryClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:880:1: ( ( ( rule__CategoryClause__CategoryAssignment_0 ) ) )
            // InternalMuslanQueryParser.g:881:1: ( ( rule__CategoryClause__CategoryAssignment_0 ) )
            {
            // InternalMuslanQueryParser.g:881:1: ( ( rule__CategoryClause__CategoryAssignment_0 ) )
            // InternalMuslanQueryParser.g:882:2: ( rule__CategoryClause__CategoryAssignment_0 )
            {
             before(grammarAccess.getCategoryClauseAccess().getCategoryAssignment_0()); 
            // InternalMuslanQueryParser.g:883:2: ( rule__CategoryClause__CategoryAssignment_0 )
            // InternalMuslanQueryParser.g:883:3: rule__CategoryClause__CategoryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CategoryClause__CategoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryClauseAccess().getCategoryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__Group__0__Impl"


    // $ANTLR start "rule__CategoryClause__Group__1"
    // InternalMuslanQueryParser.g:891:1: rule__CategoryClause__Group__1 : rule__CategoryClause__Group__1__Impl rule__CategoryClause__Group__2 ;
    public final void rule__CategoryClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:895:1: ( rule__CategoryClause__Group__1__Impl rule__CategoryClause__Group__2 )
            // InternalMuslanQueryParser.g:896:2: rule__CategoryClause__Group__1__Impl rule__CategoryClause__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CategoryClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CategoryClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__Group__1"


    // $ANTLR start "rule__CategoryClause__Group__1__Impl"
    // InternalMuslanQueryParser.g:903:1: rule__CategoryClause__Group__1__Impl : ( ( rule__CategoryClause__OperatorAssignment_1 ) ) ;
    public final void rule__CategoryClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:907:1: ( ( ( rule__CategoryClause__OperatorAssignment_1 ) ) )
            // InternalMuslanQueryParser.g:908:1: ( ( rule__CategoryClause__OperatorAssignment_1 ) )
            {
            // InternalMuslanQueryParser.g:908:1: ( ( rule__CategoryClause__OperatorAssignment_1 ) )
            // InternalMuslanQueryParser.g:909:2: ( rule__CategoryClause__OperatorAssignment_1 )
            {
             before(grammarAccess.getCategoryClauseAccess().getOperatorAssignment_1()); 
            // InternalMuslanQueryParser.g:910:2: ( rule__CategoryClause__OperatorAssignment_1 )
            // InternalMuslanQueryParser.g:910:3: rule__CategoryClause__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CategoryClause__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryClauseAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__Group__1__Impl"


    // $ANTLR start "rule__CategoryClause__Group__2"
    // InternalMuslanQueryParser.g:918:1: rule__CategoryClause__Group__2 : rule__CategoryClause__Group__2__Impl ;
    public final void rule__CategoryClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:922:1: ( rule__CategoryClause__Group__2__Impl )
            // InternalMuslanQueryParser.g:923:2: rule__CategoryClause__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CategoryClause__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__Group__2"


    // $ANTLR start "rule__CategoryClause__Group__2__Impl"
    // InternalMuslanQueryParser.g:929:1: rule__CategoryClause__Group__2__Impl : ( ( rule__CategoryClause__ValueAssignment_2 ) ) ;
    public final void rule__CategoryClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:933:1: ( ( ( rule__CategoryClause__ValueAssignment_2 ) ) )
            // InternalMuslanQueryParser.g:934:1: ( ( rule__CategoryClause__ValueAssignment_2 ) )
            {
            // InternalMuslanQueryParser.g:934:1: ( ( rule__CategoryClause__ValueAssignment_2 ) )
            // InternalMuslanQueryParser.g:935:2: ( rule__CategoryClause__ValueAssignment_2 )
            {
             before(grammarAccess.getCategoryClauseAccess().getValueAssignment_2()); 
            // InternalMuslanQueryParser.g:936:2: ( rule__CategoryClause__ValueAssignment_2 )
            // InternalMuslanQueryParser.g:936:3: rule__CategoryClause__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CategoryClause__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCategoryClauseAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__Group__2__Impl"


    // $ANTLR start "rule__ArtistClause__Group__0"
    // InternalMuslanQueryParser.g:945:1: rule__ArtistClause__Group__0 : rule__ArtistClause__Group__0__Impl rule__ArtistClause__Group__1 ;
    public final void rule__ArtistClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:949:1: ( rule__ArtistClause__Group__0__Impl rule__ArtistClause__Group__1 )
            // InternalMuslanQueryParser.g:950:2: rule__ArtistClause__Group__0__Impl rule__ArtistClause__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ArtistClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArtistClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__Group__0"


    // $ANTLR start "rule__ArtistClause__Group__0__Impl"
    // InternalMuslanQueryParser.g:957:1: rule__ArtistClause__Group__0__Impl : ( Artist ) ;
    public final void rule__ArtistClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:961:1: ( ( Artist ) )
            // InternalMuslanQueryParser.g:962:1: ( Artist )
            {
            // InternalMuslanQueryParser.g:962:1: ( Artist )
            // InternalMuslanQueryParser.g:963:2: Artist
            {
             before(grammarAccess.getArtistClauseAccess().getArtistKeyword_0()); 
            match(input,Artist,FOLLOW_2); 
             after(grammarAccess.getArtistClauseAccess().getArtistKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__Group__0__Impl"


    // $ANTLR start "rule__ArtistClause__Group__1"
    // InternalMuslanQueryParser.g:972:1: rule__ArtistClause__Group__1 : rule__ArtistClause__Group__1__Impl rule__ArtistClause__Group__2 ;
    public final void rule__ArtistClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:976:1: ( rule__ArtistClause__Group__1__Impl rule__ArtistClause__Group__2 )
            // InternalMuslanQueryParser.g:977:2: rule__ArtistClause__Group__1__Impl rule__ArtistClause__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ArtistClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArtistClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__Group__1"


    // $ANTLR start "rule__ArtistClause__Group__1__Impl"
    // InternalMuslanQueryParser.g:984:1: rule__ArtistClause__Group__1__Impl : ( ( rule__ArtistClause__OperatorAssignment_1 ) ) ;
    public final void rule__ArtistClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:988:1: ( ( ( rule__ArtistClause__OperatorAssignment_1 ) ) )
            // InternalMuslanQueryParser.g:989:1: ( ( rule__ArtistClause__OperatorAssignment_1 ) )
            {
            // InternalMuslanQueryParser.g:989:1: ( ( rule__ArtistClause__OperatorAssignment_1 ) )
            // InternalMuslanQueryParser.g:990:2: ( rule__ArtistClause__OperatorAssignment_1 )
            {
             before(grammarAccess.getArtistClauseAccess().getOperatorAssignment_1()); 
            // InternalMuslanQueryParser.g:991:2: ( rule__ArtistClause__OperatorAssignment_1 )
            // InternalMuslanQueryParser.g:991:3: rule__ArtistClause__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArtistClause__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArtistClauseAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__Group__1__Impl"


    // $ANTLR start "rule__ArtistClause__Group__2"
    // InternalMuslanQueryParser.g:999:1: rule__ArtistClause__Group__2 : rule__ArtistClause__Group__2__Impl ;
    public final void rule__ArtistClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1003:1: ( rule__ArtistClause__Group__2__Impl )
            // InternalMuslanQueryParser.g:1004:2: rule__ArtistClause__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArtistClause__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__Group__2"


    // $ANTLR start "rule__ArtistClause__Group__2__Impl"
    // InternalMuslanQueryParser.g:1010:1: rule__ArtistClause__Group__2__Impl : ( ( rule__ArtistClause__ValueAssignment_2 ) ) ;
    public final void rule__ArtistClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1014:1: ( ( ( rule__ArtistClause__ValueAssignment_2 ) ) )
            // InternalMuslanQueryParser.g:1015:1: ( ( rule__ArtistClause__ValueAssignment_2 ) )
            {
            // InternalMuslanQueryParser.g:1015:1: ( ( rule__ArtistClause__ValueAssignment_2 ) )
            // InternalMuslanQueryParser.g:1016:2: ( rule__ArtistClause__ValueAssignment_2 )
            {
             before(grammarAccess.getArtistClauseAccess().getValueAssignment_2()); 
            // InternalMuslanQueryParser.g:1017:2: ( rule__ArtistClause__ValueAssignment_2 )
            // InternalMuslanQueryParser.g:1017:3: rule__ArtistClause__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArtistClause__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArtistClauseAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__Group__2__Impl"


    // $ANTLR start "rule__TitleClause__Group__0"
    // InternalMuslanQueryParser.g:1026:1: rule__TitleClause__Group__0 : rule__TitleClause__Group__0__Impl rule__TitleClause__Group__1 ;
    public final void rule__TitleClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1030:1: ( rule__TitleClause__Group__0__Impl rule__TitleClause__Group__1 )
            // InternalMuslanQueryParser.g:1031:2: rule__TitleClause__Group__0__Impl rule__TitleClause__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TitleClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TitleClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__Group__0"


    // $ANTLR start "rule__TitleClause__Group__0__Impl"
    // InternalMuslanQueryParser.g:1038:1: rule__TitleClause__Group__0__Impl : ( Title ) ;
    public final void rule__TitleClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1042:1: ( ( Title ) )
            // InternalMuslanQueryParser.g:1043:1: ( Title )
            {
            // InternalMuslanQueryParser.g:1043:1: ( Title )
            // InternalMuslanQueryParser.g:1044:2: Title
            {
             before(grammarAccess.getTitleClauseAccess().getTitleKeyword_0()); 
            match(input,Title,FOLLOW_2); 
             after(grammarAccess.getTitleClauseAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__Group__0__Impl"


    // $ANTLR start "rule__TitleClause__Group__1"
    // InternalMuslanQueryParser.g:1053:1: rule__TitleClause__Group__1 : rule__TitleClause__Group__1__Impl rule__TitleClause__Group__2 ;
    public final void rule__TitleClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1057:1: ( rule__TitleClause__Group__1__Impl rule__TitleClause__Group__2 )
            // InternalMuslanQueryParser.g:1058:2: rule__TitleClause__Group__1__Impl rule__TitleClause__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__TitleClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TitleClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__Group__1"


    // $ANTLR start "rule__TitleClause__Group__1__Impl"
    // InternalMuslanQueryParser.g:1065:1: rule__TitleClause__Group__1__Impl : ( ( rule__TitleClause__OperatorAssignment_1 ) ) ;
    public final void rule__TitleClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1069:1: ( ( ( rule__TitleClause__OperatorAssignment_1 ) ) )
            // InternalMuslanQueryParser.g:1070:1: ( ( rule__TitleClause__OperatorAssignment_1 ) )
            {
            // InternalMuslanQueryParser.g:1070:1: ( ( rule__TitleClause__OperatorAssignment_1 ) )
            // InternalMuslanQueryParser.g:1071:2: ( rule__TitleClause__OperatorAssignment_1 )
            {
             before(grammarAccess.getTitleClauseAccess().getOperatorAssignment_1()); 
            // InternalMuslanQueryParser.g:1072:2: ( rule__TitleClause__OperatorAssignment_1 )
            // InternalMuslanQueryParser.g:1072:3: rule__TitleClause__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TitleClause__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleClauseAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__Group__1__Impl"


    // $ANTLR start "rule__TitleClause__Group__2"
    // InternalMuslanQueryParser.g:1080:1: rule__TitleClause__Group__2 : rule__TitleClause__Group__2__Impl ;
    public final void rule__TitleClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1084:1: ( rule__TitleClause__Group__2__Impl )
            // InternalMuslanQueryParser.g:1085:2: rule__TitleClause__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TitleClause__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__Group__2"


    // $ANTLR start "rule__TitleClause__Group__2__Impl"
    // InternalMuslanQueryParser.g:1091:1: rule__TitleClause__Group__2__Impl : ( ( rule__TitleClause__ValueAssignment_2 ) ) ;
    public final void rule__TitleClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1095:1: ( ( ( rule__TitleClause__ValueAssignment_2 ) ) )
            // InternalMuslanQueryParser.g:1096:1: ( ( rule__TitleClause__ValueAssignment_2 ) )
            {
            // InternalMuslanQueryParser.g:1096:1: ( ( rule__TitleClause__ValueAssignment_2 ) )
            // InternalMuslanQueryParser.g:1097:2: ( rule__TitleClause__ValueAssignment_2 )
            {
             before(grammarAccess.getTitleClauseAccess().getValueAssignment_2()); 
            // InternalMuslanQueryParser.g:1098:2: ( rule__TitleClause__ValueAssignment_2 )
            // InternalMuslanQueryParser.g:1098:3: rule__TitleClause__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TitleClause__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTitleClauseAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__Group__2__Impl"


    // $ANTLR start "rule__OrClause__Group__0"
    // InternalMuslanQueryParser.g:1107:1: rule__OrClause__Group__0 : rule__OrClause__Group__0__Impl rule__OrClause__Group__1 ;
    public final void rule__OrClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1111:1: ( rule__OrClause__Group__0__Impl rule__OrClause__Group__1 )
            // InternalMuslanQueryParser.g:1112:2: rule__OrClause__Group__0__Impl rule__OrClause__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OrClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__0"


    // $ANTLR start "rule__OrClause__Group__0__Impl"
    // InternalMuslanQueryParser.g:1119:1: rule__OrClause__Group__0__Impl : ( Either ) ;
    public final void rule__OrClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1123:1: ( ( Either ) )
            // InternalMuslanQueryParser.g:1124:1: ( Either )
            {
            // InternalMuslanQueryParser.g:1124:1: ( Either )
            // InternalMuslanQueryParser.g:1125:2: Either
            {
             before(grammarAccess.getOrClauseAccess().getEitherKeyword_0()); 
            match(input,Either,FOLLOW_2); 
             after(grammarAccess.getOrClauseAccess().getEitherKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__0__Impl"


    // $ANTLR start "rule__OrClause__Group__1"
    // InternalMuslanQueryParser.g:1134:1: rule__OrClause__Group__1 : rule__OrClause__Group__1__Impl rule__OrClause__Group__2 ;
    public final void rule__OrClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1138:1: ( rule__OrClause__Group__1__Impl rule__OrClause__Group__2 )
            // InternalMuslanQueryParser.g:1139:2: rule__OrClause__Group__1__Impl rule__OrClause__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OrClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__1"


    // $ANTLR start "rule__OrClause__Group__1__Impl"
    // InternalMuslanQueryParser.g:1146:1: rule__OrClause__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__OrClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1150:1: ( ( LeftParenthesis ) )
            // InternalMuslanQueryParser.g:1151:1: ( LeftParenthesis )
            {
            // InternalMuslanQueryParser.g:1151:1: ( LeftParenthesis )
            // InternalMuslanQueryParser.g:1152:2: LeftParenthesis
            {
             before(grammarAccess.getOrClauseAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getOrClauseAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__1__Impl"


    // $ANTLR start "rule__OrClause__Group__2"
    // InternalMuslanQueryParser.g:1161:1: rule__OrClause__Group__2 : rule__OrClause__Group__2__Impl rule__OrClause__Group__3 ;
    public final void rule__OrClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1165:1: ( rule__OrClause__Group__2__Impl rule__OrClause__Group__3 )
            // InternalMuslanQueryParser.g:1166:2: rule__OrClause__Group__2__Impl rule__OrClause__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__OrClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrClause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__2"


    // $ANTLR start "rule__OrClause__Group__2__Impl"
    // InternalMuslanQueryParser.g:1173:1: rule__OrClause__Group__2__Impl : ( ( rule__OrClause__FilterclauseAssignment_2 ) ) ;
    public final void rule__OrClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1177:1: ( ( ( rule__OrClause__FilterclauseAssignment_2 ) ) )
            // InternalMuslanQueryParser.g:1178:1: ( ( rule__OrClause__FilterclauseAssignment_2 ) )
            {
            // InternalMuslanQueryParser.g:1178:1: ( ( rule__OrClause__FilterclauseAssignment_2 ) )
            // InternalMuslanQueryParser.g:1179:2: ( rule__OrClause__FilterclauseAssignment_2 )
            {
             before(grammarAccess.getOrClauseAccess().getFilterclauseAssignment_2()); 
            // InternalMuslanQueryParser.g:1180:2: ( rule__OrClause__FilterclauseAssignment_2 )
            // InternalMuslanQueryParser.g:1180:3: rule__OrClause__FilterclauseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrClause__FilterclauseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrClauseAccess().getFilterclauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__2__Impl"


    // $ANTLR start "rule__OrClause__Group__3"
    // InternalMuslanQueryParser.g:1188:1: rule__OrClause__Group__3 : rule__OrClause__Group__3__Impl rule__OrClause__Group__4 ;
    public final void rule__OrClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1192:1: ( rule__OrClause__Group__3__Impl rule__OrClause__Group__4 )
            // InternalMuslanQueryParser.g:1193:2: rule__OrClause__Group__3__Impl rule__OrClause__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__OrClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrClause__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__3"


    // $ANTLR start "rule__OrClause__Group__3__Impl"
    // InternalMuslanQueryParser.g:1200:1: rule__OrClause__Group__3__Impl : ( ( ( rule__OrClause__Group_3__0 ) ) ( ( rule__OrClause__Group_3__0 )* ) ) ;
    public final void rule__OrClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1204:1: ( ( ( ( rule__OrClause__Group_3__0 ) ) ( ( rule__OrClause__Group_3__0 )* ) ) )
            // InternalMuslanQueryParser.g:1205:1: ( ( ( rule__OrClause__Group_3__0 ) ) ( ( rule__OrClause__Group_3__0 )* ) )
            {
            // InternalMuslanQueryParser.g:1205:1: ( ( ( rule__OrClause__Group_3__0 ) ) ( ( rule__OrClause__Group_3__0 )* ) )
            // InternalMuslanQueryParser.g:1206:2: ( ( rule__OrClause__Group_3__0 ) ) ( ( rule__OrClause__Group_3__0 )* )
            {
            // InternalMuslanQueryParser.g:1206:2: ( ( rule__OrClause__Group_3__0 ) )
            // InternalMuslanQueryParser.g:1207:3: ( rule__OrClause__Group_3__0 )
            {
             before(grammarAccess.getOrClauseAccess().getGroup_3()); 
            // InternalMuslanQueryParser.g:1208:3: ( rule__OrClause__Group_3__0 )
            // InternalMuslanQueryParser.g:1208:4: rule__OrClause__Group_3__0
            {
            pushFollow(FOLLOW_15);
            rule__OrClause__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getOrClauseAccess().getGroup_3()); 

            }

            // InternalMuslanQueryParser.g:1211:2: ( ( rule__OrClause__Group_3__0 )* )
            // InternalMuslanQueryParser.g:1212:3: ( rule__OrClause__Group_3__0 )*
            {
             before(grammarAccess.getOrClauseAccess().getGroup_3()); 
            // InternalMuslanQueryParser.g:1213:3: ( rule__OrClause__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Artist||LA12_0==Rating||(LA12_0>=Genre && LA12_0<=Title)||LA12_0==Both||(LA12_0>=Tag && LA12_0<=Or)||LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMuslanQueryParser.g:1213:4: rule__OrClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__OrClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOrClauseAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__3__Impl"


    // $ANTLR start "rule__OrClause__Group__4"
    // InternalMuslanQueryParser.g:1222:1: rule__OrClause__Group__4 : rule__OrClause__Group__4__Impl ;
    public final void rule__OrClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1226:1: ( rule__OrClause__Group__4__Impl )
            // InternalMuslanQueryParser.g:1227:2: rule__OrClause__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrClause__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__4"


    // $ANTLR start "rule__OrClause__Group__4__Impl"
    // InternalMuslanQueryParser.g:1233:1: rule__OrClause__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__OrClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1237:1: ( ( RightParenthesis ) )
            // InternalMuslanQueryParser.g:1238:1: ( RightParenthesis )
            {
            // InternalMuslanQueryParser.g:1238:1: ( RightParenthesis )
            // InternalMuslanQueryParser.g:1239:2: RightParenthesis
            {
             before(grammarAccess.getOrClauseAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getOrClauseAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group__4__Impl"


    // $ANTLR start "rule__OrClause__Group_3__0"
    // InternalMuslanQueryParser.g:1249:1: rule__OrClause__Group_3__0 : rule__OrClause__Group_3__0__Impl rule__OrClause__Group_3__1 ;
    public final void rule__OrClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1253:1: ( rule__OrClause__Group_3__0__Impl rule__OrClause__Group_3__1 )
            // InternalMuslanQueryParser.g:1254:2: rule__OrClause__Group_3__0__Impl rule__OrClause__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__OrClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrClause__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group_3__0"


    // $ANTLR start "rule__OrClause__Group_3__0__Impl"
    // InternalMuslanQueryParser.g:1261:1: rule__OrClause__Group_3__0__Impl : ( ( rule__OrClause__Alternatives_3_0 )? ) ;
    public final void rule__OrClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1265:1: ( ( ( rule__OrClause__Alternatives_3_0 )? ) )
            // InternalMuslanQueryParser.g:1266:1: ( ( rule__OrClause__Alternatives_3_0 )? )
            {
            // InternalMuslanQueryParser.g:1266:1: ( ( rule__OrClause__Alternatives_3_0 )? )
            // InternalMuslanQueryParser.g:1267:2: ( rule__OrClause__Alternatives_3_0 )?
            {
             before(grammarAccess.getOrClauseAccess().getAlternatives_3_0()); 
            // InternalMuslanQueryParser.g:1268:2: ( rule__OrClause__Alternatives_3_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Or||LA13_0==Comma) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMuslanQueryParser.g:1268:3: rule__OrClause__Alternatives_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrClause__Alternatives_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrClauseAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group_3__0__Impl"


    // $ANTLR start "rule__OrClause__Group_3__1"
    // InternalMuslanQueryParser.g:1276:1: rule__OrClause__Group_3__1 : rule__OrClause__Group_3__1__Impl ;
    public final void rule__OrClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1280:1: ( rule__OrClause__Group_3__1__Impl )
            // InternalMuslanQueryParser.g:1281:2: rule__OrClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrClause__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group_3__1"


    // $ANTLR start "rule__OrClause__Group_3__1__Impl"
    // InternalMuslanQueryParser.g:1287:1: rule__OrClause__Group_3__1__Impl : ( ( rule__OrClause__FilterclauseAssignment_3_1 ) ) ;
    public final void rule__OrClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1291:1: ( ( ( rule__OrClause__FilterclauseAssignment_3_1 ) ) )
            // InternalMuslanQueryParser.g:1292:1: ( ( rule__OrClause__FilterclauseAssignment_3_1 ) )
            {
            // InternalMuslanQueryParser.g:1292:1: ( ( rule__OrClause__FilterclauseAssignment_3_1 ) )
            // InternalMuslanQueryParser.g:1293:2: ( rule__OrClause__FilterclauseAssignment_3_1 )
            {
             before(grammarAccess.getOrClauseAccess().getFilterclauseAssignment_3_1()); 
            // InternalMuslanQueryParser.g:1294:2: ( rule__OrClause__FilterclauseAssignment_3_1 )
            // InternalMuslanQueryParser.g:1294:3: rule__OrClause__FilterclauseAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrClause__FilterclauseAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrClauseAccess().getFilterclauseAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__Group_3__1__Impl"


    // $ANTLR start "rule__AndClause__Group__0"
    // InternalMuslanQueryParser.g:1303:1: rule__AndClause__Group__0 : rule__AndClause__Group__0__Impl rule__AndClause__Group__1 ;
    public final void rule__AndClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1307:1: ( rule__AndClause__Group__0__Impl rule__AndClause__Group__1 )
            // InternalMuslanQueryParser.g:1308:2: rule__AndClause__Group__0__Impl rule__AndClause__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AndClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__0"


    // $ANTLR start "rule__AndClause__Group__0__Impl"
    // InternalMuslanQueryParser.g:1315:1: rule__AndClause__Group__0__Impl : ( Both ) ;
    public final void rule__AndClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1319:1: ( ( Both ) )
            // InternalMuslanQueryParser.g:1320:1: ( Both )
            {
            // InternalMuslanQueryParser.g:1320:1: ( Both )
            // InternalMuslanQueryParser.g:1321:2: Both
            {
             before(grammarAccess.getAndClauseAccess().getBothKeyword_0()); 
            match(input,Both,FOLLOW_2); 
             after(grammarAccess.getAndClauseAccess().getBothKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__0__Impl"


    // $ANTLR start "rule__AndClause__Group__1"
    // InternalMuslanQueryParser.g:1330:1: rule__AndClause__Group__1 : rule__AndClause__Group__1__Impl rule__AndClause__Group__2 ;
    public final void rule__AndClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1334:1: ( rule__AndClause__Group__1__Impl rule__AndClause__Group__2 )
            // InternalMuslanQueryParser.g:1335:2: rule__AndClause__Group__1__Impl rule__AndClause__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__AndClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__1"


    // $ANTLR start "rule__AndClause__Group__1__Impl"
    // InternalMuslanQueryParser.g:1342:1: rule__AndClause__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__AndClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1346:1: ( ( LeftParenthesis ) )
            // InternalMuslanQueryParser.g:1347:1: ( LeftParenthesis )
            {
            // InternalMuslanQueryParser.g:1347:1: ( LeftParenthesis )
            // InternalMuslanQueryParser.g:1348:2: LeftParenthesis
            {
             before(grammarAccess.getAndClauseAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getAndClauseAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__1__Impl"


    // $ANTLR start "rule__AndClause__Group__2"
    // InternalMuslanQueryParser.g:1357:1: rule__AndClause__Group__2 : rule__AndClause__Group__2__Impl rule__AndClause__Group__3 ;
    public final void rule__AndClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1361:1: ( rule__AndClause__Group__2__Impl rule__AndClause__Group__3 )
            // InternalMuslanQueryParser.g:1362:2: rule__AndClause__Group__2__Impl rule__AndClause__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AndClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndClause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__2"


    // $ANTLR start "rule__AndClause__Group__2__Impl"
    // InternalMuslanQueryParser.g:1369:1: rule__AndClause__Group__2__Impl : ( ( rule__AndClause__FilterclauseAssignment_2 ) ) ;
    public final void rule__AndClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1373:1: ( ( ( rule__AndClause__FilterclauseAssignment_2 ) ) )
            // InternalMuslanQueryParser.g:1374:1: ( ( rule__AndClause__FilterclauseAssignment_2 ) )
            {
            // InternalMuslanQueryParser.g:1374:1: ( ( rule__AndClause__FilterclauseAssignment_2 ) )
            // InternalMuslanQueryParser.g:1375:2: ( rule__AndClause__FilterclauseAssignment_2 )
            {
             before(grammarAccess.getAndClauseAccess().getFilterclauseAssignment_2()); 
            // InternalMuslanQueryParser.g:1376:2: ( rule__AndClause__FilterclauseAssignment_2 )
            // InternalMuslanQueryParser.g:1376:3: rule__AndClause__FilterclauseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AndClause__FilterclauseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAndClauseAccess().getFilterclauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__2__Impl"


    // $ANTLR start "rule__AndClause__Group__3"
    // InternalMuslanQueryParser.g:1384:1: rule__AndClause__Group__3 : rule__AndClause__Group__3__Impl rule__AndClause__Group__4 ;
    public final void rule__AndClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1388:1: ( rule__AndClause__Group__3__Impl rule__AndClause__Group__4 )
            // InternalMuslanQueryParser.g:1389:2: rule__AndClause__Group__3__Impl rule__AndClause__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__AndClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndClause__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__3"


    // $ANTLR start "rule__AndClause__Group__3__Impl"
    // InternalMuslanQueryParser.g:1396:1: rule__AndClause__Group__3__Impl : ( ( ( rule__AndClause__Group_3__0 ) ) ( ( rule__AndClause__Group_3__0 )* ) ) ;
    public final void rule__AndClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1400:1: ( ( ( ( rule__AndClause__Group_3__0 ) ) ( ( rule__AndClause__Group_3__0 )* ) ) )
            // InternalMuslanQueryParser.g:1401:1: ( ( ( rule__AndClause__Group_3__0 ) ) ( ( rule__AndClause__Group_3__0 )* ) )
            {
            // InternalMuslanQueryParser.g:1401:1: ( ( ( rule__AndClause__Group_3__0 ) ) ( ( rule__AndClause__Group_3__0 )* ) )
            // InternalMuslanQueryParser.g:1402:2: ( ( rule__AndClause__Group_3__0 ) ) ( ( rule__AndClause__Group_3__0 )* )
            {
            // InternalMuslanQueryParser.g:1402:2: ( ( rule__AndClause__Group_3__0 ) )
            // InternalMuslanQueryParser.g:1403:3: ( rule__AndClause__Group_3__0 )
            {
             before(grammarAccess.getAndClauseAccess().getGroup_3()); 
            // InternalMuslanQueryParser.g:1404:3: ( rule__AndClause__Group_3__0 )
            // InternalMuslanQueryParser.g:1404:4: rule__AndClause__Group_3__0
            {
            pushFollow(FOLLOW_18);
            rule__AndClause__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getAndClauseAccess().getGroup_3()); 

            }

            // InternalMuslanQueryParser.g:1407:2: ( ( rule__AndClause__Group_3__0 )* )
            // InternalMuslanQueryParser.g:1408:3: ( rule__AndClause__Group_3__0 )*
            {
             before(grammarAccess.getAndClauseAccess().getGroup_3()); 
            // InternalMuslanQueryParser.g:1409:3: ( rule__AndClause__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=Artist && LA14_0<=Rating)||(LA14_0>=Genre && LA14_0<=Title)||LA14_0==And||LA14_0==Tag||LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMuslanQueryParser.g:1409:4: rule__AndClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AndClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAndClauseAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__3__Impl"


    // $ANTLR start "rule__AndClause__Group__4"
    // InternalMuslanQueryParser.g:1418:1: rule__AndClause__Group__4 : rule__AndClause__Group__4__Impl ;
    public final void rule__AndClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1422:1: ( rule__AndClause__Group__4__Impl )
            // InternalMuslanQueryParser.g:1423:2: rule__AndClause__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndClause__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__4"


    // $ANTLR start "rule__AndClause__Group__4__Impl"
    // InternalMuslanQueryParser.g:1429:1: rule__AndClause__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__AndClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1433:1: ( ( RightParenthesis ) )
            // InternalMuslanQueryParser.g:1434:1: ( RightParenthesis )
            {
            // InternalMuslanQueryParser.g:1434:1: ( RightParenthesis )
            // InternalMuslanQueryParser.g:1435:2: RightParenthesis
            {
             before(grammarAccess.getAndClauseAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getAndClauseAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group__4__Impl"


    // $ANTLR start "rule__AndClause__Group_3__0"
    // InternalMuslanQueryParser.g:1445:1: rule__AndClause__Group_3__0 : rule__AndClause__Group_3__0__Impl rule__AndClause__Group_3__1 ;
    public final void rule__AndClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1449:1: ( rule__AndClause__Group_3__0__Impl rule__AndClause__Group_3__1 )
            // InternalMuslanQueryParser.g:1450:2: rule__AndClause__Group_3__0__Impl rule__AndClause__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__AndClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndClause__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group_3__0"


    // $ANTLR start "rule__AndClause__Group_3__0__Impl"
    // InternalMuslanQueryParser.g:1457:1: rule__AndClause__Group_3__0__Impl : ( ( rule__AndClause__Alternatives_3_0 )? ) ;
    public final void rule__AndClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1461:1: ( ( ( rule__AndClause__Alternatives_3_0 )? ) )
            // InternalMuslanQueryParser.g:1462:1: ( ( rule__AndClause__Alternatives_3_0 )? )
            {
            // InternalMuslanQueryParser.g:1462:1: ( ( rule__AndClause__Alternatives_3_0 )? )
            // InternalMuslanQueryParser.g:1463:2: ( rule__AndClause__Alternatives_3_0 )?
            {
             before(grammarAccess.getAndClauseAccess().getAlternatives_3_0()); 
            // InternalMuslanQueryParser.g:1464:2: ( rule__AndClause__Alternatives_3_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==And||LA15_0==Comma) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMuslanQueryParser.g:1464:3: rule__AndClause__Alternatives_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AndClause__Alternatives_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndClauseAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group_3__0__Impl"


    // $ANTLR start "rule__AndClause__Group_3__1"
    // InternalMuslanQueryParser.g:1472:1: rule__AndClause__Group_3__1 : rule__AndClause__Group_3__1__Impl ;
    public final void rule__AndClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1476:1: ( rule__AndClause__Group_3__1__Impl )
            // InternalMuslanQueryParser.g:1477:2: rule__AndClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndClause__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group_3__1"


    // $ANTLR start "rule__AndClause__Group_3__1__Impl"
    // InternalMuslanQueryParser.g:1483:1: rule__AndClause__Group_3__1__Impl : ( ( rule__AndClause__FilterclauseAssignment_3_1 ) ) ;
    public final void rule__AndClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1487:1: ( ( ( rule__AndClause__FilterclauseAssignment_3_1 ) ) )
            // InternalMuslanQueryParser.g:1488:1: ( ( rule__AndClause__FilterclauseAssignment_3_1 ) )
            {
            // InternalMuslanQueryParser.g:1488:1: ( ( rule__AndClause__FilterclauseAssignment_3_1 ) )
            // InternalMuslanQueryParser.g:1489:2: ( rule__AndClause__FilterclauseAssignment_3_1 )
            {
             before(grammarAccess.getAndClauseAccess().getFilterclauseAssignment_3_1()); 
            // InternalMuslanQueryParser.g:1490:2: ( rule__AndClause__FilterclauseAssignment_3_1 )
            // InternalMuslanQueryParser.g:1490:3: rule__AndClause__FilterclauseAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AndClause__FilterclauseAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAndClauseAccess().getFilterclauseAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__Group_3__1__Impl"


    // $ANTLR start "rule__Query__TypeAssignment_2"
    // InternalMuslanQueryParser.g:1499:1: rule__Query__TypeAssignment_2 : ( ruleCategorizedElementType ) ;
    public final void rule__Query__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1503:1: ( ( ruleCategorizedElementType ) )
            // InternalMuslanQueryParser.g:1504:2: ( ruleCategorizedElementType )
            {
            // InternalMuslanQueryParser.g:1504:2: ( ruleCategorizedElementType )
            // InternalMuslanQueryParser.g:1505:3: ruleCategorizedElementType
            {
             before(grammarAccess.getQueryAccess().getTypeCategorizedElementTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCategorizedElementType();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getTypeCategorizedElementTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__TypeAssignment_2"


    // $ANTLR start "rule__Query__CollectionAssignment_4"
    // InternalMuslanQueryParser.g:1514:1: rule__Query__CollectionAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Query__CollectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1518:1: ( ( ( ruleEString ) ) )
            // InternalMuslanQueryParser.g:1519:2: ( ( ruleEString ) )
            {
            // InternalMuslanQueryParser.g:1519:2: ( ( ruleEString ) )
            // InternalMuslanQueryParser.g:1520:3: ( ruleEString )
            {
             before(grammarAccess.getQueryAccess().getCollectionMusicCollectionCrossReference_4_0()); 
            // InternalMuslanQueryParser.g:1521:3: ( ruleEString )
            // InternalMuslanQueryParser.g:1522:4: ruleEString
            {
             before(grammarAccess.getQueryAccess().getCollectionMusicCollectionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getCollectionMusicCollectionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getQueryAccess().getCollectionMusicCollectionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__CollectionAssignment_4"


    // $ANTLR start "rule__Query__FilterAssignment_6"
    // InternalMuslanQueryParser.g:1533:1: rule__Query__FilterAssignment_6 : ( ruleFilterClause ) ;
    public final void rule__Query__FilterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1537:1: ( ( ruleFilterClause ) )
            // InternalMuslanQueryParser.g:1538:2: ( ruleFilterClause )
            {
            // InternalMuslanQueryParser.g:1538:2: ( ruleFilterClause )
            // InternalMuslanQueryParser.g:1539:3: ruleFilterClause
            {
             before(grammarAccess.getQueryAccess().getFilterFilterClauseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterClause();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getFilterFilterClauseParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__FilterAssignment_6"


    // $ANTLR start "rule__CategoryClause__CategoryAssignment_0"
    // InternalMuslanQueryParser.g:1548:1: rule__CategoryClause__CategoryAssignment_0 : ( ruleCategoryType ) ;
    public final void rule__CategoryClause__CategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1552:1: ( ( ruleCategoryType ) )
            // InternalMuslanQueryParser.g:1553:2: ( ruleCategoryType )
            {
            // InternalMuslanQueryParser.g:1553:2: ( ruleCategoryType )
            // InternalMuslanQueryParser.g:1554:3: ruleCategoryType
            {
             before(grammarAccess.getCategoryClauseAccess().getCategoryCategoryTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCategoryType();

            state._fsp--;

             after(grammarAccess.getCategoryClauseAccess().getCategoryCategoryTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__CategoryAssignment_0"


    // $ANTLR start "rule__CategoryClause__OperatorAssignment_1"
    // InternalMuslanQueryParser.g:1563:1: rule__CategoryClause__OperatorAssignment_1 : ( ruleOperatorType ) ;
    public final void rule__CategoryClause__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1567:1: ( ( ruleOperatorType ) )
            // InternalMuslanQueryParser.g:1568:2: ( ruleOperatorType )
            {
            // InternalMuslanQueryParser.g:1568:2: ( ruleOperatorType )
            // InternalMuslanQueryParser.g:1569:3: ruleOperatorType
            {
             before(grammarAccess.getCategoryClauseAccess().getOperatorOperatorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperatorType();

            state._fsp--;

             after(grammarAccess.getCategoryClauseAccess().getOperatorOperatorTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__OperatorAssignment_1"


    // $ANTLR start "rule__CategoryClause__ValueAssignment_2"
    // InternalMuslanQueryParser.g:1578:1: rule__CategoryClause__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CategoryClause__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1582:1: ( ( RULE_STRING ) )
            // InternalMuslanQueryParser.g:1583:2: ( RULE_STRING )
            {
            // InternalMuslanQueryParser.g:1583:2: ( RULE_STRING )
            // InternalMuslanQueryParser.g:1584:3: RULE_STRING
            {
             before(grammarAccess.getCategoryClauseAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCategoryClauseAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CategoryClause__ValueAssignment_2"


    // $ANTLR start "rule__ArtistClause__OperatorAssignment_1"
    // InternalMuslanQueryParser.g:1593:1: rule__ArtistClause__OperatorAssignment_1 : ( ruleRestrictedOperatorType ) ;
    public final void rule__ArtistClause__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1597:1: ( ( ruleRestrictedOperatorType ) )
            // InternalMuslanQueryParser.g:1598:2: ( ruleRestrictedOperatorType )
            {
            // InternalMuslanQueryParser.g:1598:2: ( ruleRestrictedOperatorType )
            // InternalMuslanQueryParser.g:1599:3: ruleRestrictedOperatorType
            {
             before(grammarAccess.getArtistClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRestrictedOperatorType();

            state._fsp--;

             after(grammarAccess.getArtistClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__OperatorAssignment_1"


    // $ANTLR start "rule__ArtistClause__ValueAssignment_2"
    // InternalMuslanQueryParser.g:1608:1: rule__ArtistClause__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ArtistClause__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1612:1: ( ( RULE_STRING ) )
            // InternalMuslanQueryParser.g:1613:2: ( RULE_STRING )
            {
            // InternalMuslanQueryParser.g:1613:2: ( RULE_STRING )
            // InternalMuslanQueryParser.g:1614:3: RULE_STRING
            {
             before(grammarAccess.getArtistClauseAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArtistClauseAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtistClause__ValueAssignment_2"


    // $ANTLR start "rule__TitleClause__OperatorAssignment_1"
    // InternalMuslanQueryParser.g:1623:1: rule__TitleClause__OperatorAssignment_1 : ( ruleRestrictedOperatorType ) ;
    public final void rule__TitleClause__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1627:1: ( ( ruleRestrictedOperatorType ) )
            // InternalMuslanQueryParser.g:1628:2: ( ruleRestrictedOperatorType )
            {
            // InternalMuslanQueryParser.g:1628:2: ( ruleRestrictedOperatorType )
            // InternalMuslanQueryParser.g:1629:3: ruleRestrictedOperatorType
            {
             before(grammarAccess.getTitleClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRestrictedOperatorType();

            state._fsp--;

             after(grammarAccess.getTitleClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__OperatorAssignment_1"


    // $ANTLR start "rule__TitleClause__ValueAssignment_2"
    // InternalMuslanQueryParser.g:1638:1: rule__TitleClause__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TitleClause__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1642:1: ( ( RULE_STRING ) )
            // InternalMuslanQueryParser.g:1643:2: ( RULE_STRING )
            {
            // InternalMuslanQueryParser.g:1643:2: ( RULE_STRING )
            // InternalMuslanQueryParser.g:1644:3: RULE_STRING
            {
             before(grammarAccess.getTitleClauseAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTitleClauseAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleClause__ValueAssignment_2"


    // $ANTLR start "rule__OrClause__FilterclauseAssignment_2"
    // InternalMuslanQueryParser.g:1653:1: rule__OrClause__FilterclauseAssignment_2 : ( ruleOrContent ) ;
    public final void rule__OrClause__FilterclauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1657:1: ( ( ruleOrContent ) )
            // InternalMuslanQueryParser.g:1658:2: ( ruleOrContent )
            {
            // InternalMuslanQueryParser.g:1658:2: ( ruleOrContent )
            // InternalMuslanQueryParser.g:1659:3: ruleOrContent
            {
             before(grammarAccess.getOrClauseAccess().getFilterclauseOrContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrContent();

            state._fsp--;

             after(grammarAccess.getOrClauseAccess().getFilterclauseOrContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__FilterclauseAssignment_2"


    // $ANTLR start "rule__OrClause__FilterclauseAssignment_3_1"
    // InternalMuslanQueryParser.g:1668:1: rule__OrClause__FilterclauseAssignment_3_1 : ( ruleOrContent ) ;
    public final void rule__OrClause__FilterclauseAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1672:1: ( ( ruleOrContent ) )
            // InternalMuslanQueryParser.g:1673:2: ( ruleOrContent )
            {
            // InternalMuslanQueryParser.g:1673:2: ( ruleOrContent )
            // InternalMuslanQueryParser.g:1674:3: ruleOrContent
            {
             before(grammarAccess.getOrClauseAccess().getFilterclauseOrContentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrContent();

            state._fsp--;

             after(grammarAccess.getOrClauseAccess().getFilterclauseOrContentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrClause__FilterclauseAssignment_3_1"


    // $ANTLR start "rule__AndClause__FilterclauseAssignment_2"
    // InternalMuslanQueryParser.g:1683:1: rule__AndClause__FilterclauseAssignment_2 : ( ruleAndContent ) ;
    public final void rule__AndClause__FilterclauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1687:1: ( ( ruleAndContent ) )
            // InternalMuslanQueryParser.g:1688:2: ( ruleAndContent )
            {
            // InternalMuslanQueryParser.g:1688:2: ( ruleAndContent )
            // InternalMuslanQueryParser.g:1689:3: ruleAndContent
            {
             before(grammarAccess.getAndClauseAccess().getFilterclauseAndContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndContent();

            state._fsp--;

             after(grammarAccess.getAndClauseAccess().getFilterclauseAndContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__FilterclauseAssignment_2"


    // $ANTLR start "rule__AndClause__FilterclauseAssignment_3_1"
    // InternalMuslanQueryParser.g:1698:1: rule__AndClause__FilterclauseAssignment_3_1 : ( ruleAndContent ) ;
    public final void rule__AndClause__FilterclauseAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMuslanQueryParser.g:1702:1: ( ( ruleAndContent ) )
            // InternalMuslanQueryParser.g:1703:2: ( ruleAndContent )
            {
            // InternalMuslanQueryParser.g:1703:2: ( ruleAndContent )
            // InternalMuslanQueryParser.g:1704:3: ruleAndContent
            {
             before(grammarAccess.getAndClauseAccess().getFilterclauseAndContentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndContent();

            state._fsp--;

             after(grammarAccess.getAndClauseAccess().getFilterclauseAndContentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndClause__FilterclauseAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020B70L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C10000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000260B70L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000260B72L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020370L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000228370L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000228372L});

}