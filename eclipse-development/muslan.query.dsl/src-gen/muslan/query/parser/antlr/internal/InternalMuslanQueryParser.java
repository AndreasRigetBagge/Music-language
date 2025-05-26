package muslan.query.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import muslan.query.services.MuslanQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMuslanQueryParser extends AbstractInternalAntlrParser {
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

        public InternalMuslanQueryParser(TokenStream input, MuslanQueryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Query";
       	}

       	@Override
       	protected MuslanQueryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuery"
    // InternalMuslanQueryParser.g:58:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalMuslanQueryParser.g:58:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalMuslanQueryParser.g:59:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMuslanQueryParser.g:65:1: ruleQuery returns [EObject current=null] : ( () otherlv_1= Pick ( (lv_type_2_0= ruleCategorizedElementType ) ) otherlv_3= From ( ( ruleEString ) ) otherlv_5= With ( (lv_filter_6_0= ruleFilterClause ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_filter_6_0 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:71:2: ( ( () otherlv_1= Pick ( (lv_type_2_0= ruleCategorizedElementType ) ) otherlv_3= From ( ( ruleEString ) ) otherlv_5= With ( (lv_filter_6_0= ruleFilterClause ) ) ) )
            // InternalMuslanQueryParser.g:72:2: ( () otherlv_1= Pick ( (lv_type_2_0= ruleCategorizedElementType ) ) otherlv_3= From ( ( ruleEString ) ) otherlv_5= With ( (lv_filter_6_0= ruleFilterClause ) ) )
            {
            // InternalMuslanQueryParser.g:72:2: ( () otherlv_1= Pick ( (lv_type_2_0= ruleCategorizedElementType ) ) otherlv_3= From ( ( ruleEString ) ) otherlv_5= With ( (lv_filter_6_0= ruleFilterClause ) ) )
            // InternalMuslanQueryParser.g:73:3: () otherlv_1= Pick ( (lv_type_2_0= ruleCategorizedElementType ) ) otherlv_3= From ( ( ruleEString ) ) otherlv_5= With ( (lv_filter_6_0= ruleFilterClause ) )
            {
            // InternalMuslanQueryParser.g:73:3: ()
            // InternalMuslanQueryParser.g:74:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQueryAccess().getQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Pick,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getPickKeyword_1());
            		
            // InternalMuslanQueryParser.g:84:3: ( (lv_type_2_0= ruleCategorizedElementType ) )
            // InternalMuslanQueryParser.g:85:4: (lv_type_2_0= ruleCategorizedElementType )
            {
            // InternalMuslanQueryParser.g:85:4: (lv_type_2_0= ruleCategorizedElementType )
            // InternalMuslanQueryParser.g:86:5: lv_type_2_0= ruleCategorizedElementType
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getTypeCategorizedElementTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_2_0=ruleCategorizedElementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"muslan.query.MuslanQuery.CategorizedElementType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,From,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getFromKeyword_3());
            		
            // InternalMuslanQueryParser.g:107:3: ( ( ruleEString ) )
            // InternalMuslanQueryParser.g:108:4: ( ruleEString )
            {
            // InternalMuslanQueryParser.g:108:4: ( ruleEString )
            // InternalMuslanQueryParser.g:109:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQueryAccess().getCollectionMusicCollectionCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,With,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getWithKeyword_5());
            		
            // InternalMuslanQueryParser.g:127:3: ( (lv_filter_6_0= ruleFilterClause ) )
            // InternalMuslanQueryParser.g:128:4: (lv_filter_6_0= ruleFilterClause )
            {
            // InternalMuslanQueryParser.g:128:4: (lv_filter_6_0= ruleFilterClause )
            // InternalMuslanQueryParser.g:129:5: lv_filter_6_0= ruleFilterClause
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getFilterFilterClauseParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_filter_6_0=ruleFilterClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"filter",
            						lv_filter_6_0,
            						"muslan.query.MuslanQuery.FilterClause");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleEString"
    // InternalMuslanQueryParser.g:150:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMuslanQueryParser.g:150:47: (iv_ruleEString= ruleEString EOF )
            // InternalMuslanQueryParser.g:151:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMuslanQueryParser.g:157:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMuslanQueryParser.g:163:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMuslanQueryParser.g:164:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMuslanQueryParser.g:164:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMuslanQueryParser.g:165:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:173:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFilterClause"
    // InternalMuslanQueryParser.g:184:1: entryRuleFilterClause returns [EObject current=null] : iv_ruleFilterClause= ruleFilterClause EOF ;
    public final EObject entryRuleFilterClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterClause = null;


        try {
            // InternalMuslanQueryParser.g:184:53: (iv_ruleFilterClause= ruleFilterClause EOF )
            // InternalMuslanQueryParser.g:185:2: iv_ruleFilterClause= ruleFilterClause EOF
            {
             newCompositeNode(grammarAccess.getFilterClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterClause=ruleFilterClause();

            state._fsp--;

             current =iv_ruleFilterClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterClause"


    // $ANTLR start "ruleFilterClause"
    // InternalMuslanQueryParser.g:191:1: ruleFilterClause returns [EObject current=null] : (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause | this_AndClause_2= ruleAndClause ) ;
    public final EObject ruleFilterClause() throws RecognitionException {
        EObject current = null;

        EObject this_Clause_0 = null;

        EObject this_OrClause_1 = null;

        EObject this_AndClause_2 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:197:2: ( (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause | this_AndClause_2= ruleAndClause ) )
            // InternalMuslanQueryParser.g:198:2: (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause | this_AndClause_2= ruleAndClause )
            {
            // InternalMuslanQueryParser.g:198:2: (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause | this_AndClause_2= ruleAndClause )
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
                    // InternalMuslanQueryParser.g:199:3: this_Clause_0= ruleClause
                    {

                    			newCompositeNode(grammarAccess.getFilterClauseAccess().getClauseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause_0=ruleClause();

                    state._fsp--;


                    			current = this_Clause_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:208:3: this_OrClause_1= ruleOrClause
                    {

                    			newCompositeNode(grammarAccess.getFilterClauseAccess().getOrClauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrClause_1=ruleOrClause();

                    state._fsp--;


                    			current = this_OrClause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:217:3: this_AndClause_2= ruleAndClause
                    {

                    			newCompositeNode(grammarAccess.getFilterClauseAccess().getAndClauseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndClause_2=ruleAndClause();

                    state._fsp--;


                    			current = this_AndClause_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterClause"


    // $ANTLR start "entryRuleClause"
    // InternalMuslanQueryParser.g:229:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalMuslanQueryParser.g:229:47: (iv_ruleClause= ruleClause EOF )
            // InternalMuslanQueryParser.g:230:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalMuslanQueryParser.g:236:1: ruleClause returns [EObject current=null] : (this_CategoryClause_0= ruleCategoryClause | this_ArtistClause_1= ruleArtistClause | this_TitleClause_2= ruleTitleClause ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryClause_0 = null;

        EObject this_ArtistClause_1 = null;

        EObject this_TitleClause_2 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:242:2: ( (this_CategoryClause_0= ruleCategoryClause | this_ArtistClause_1= ruleArtistClause | this_TitleClause_2= ruleTitleClause ) )
            // InternalMuslanQueryParser.g:243:2: (this_CategoryClause_0= ruleCategoryClause | this_ArtistClause_1= ruleArtistClause | this_TitleClause_2= ruleTitleClause )
            {
            // InternalMuslanQueryParser.g:243:2: (this_CategoryClause_0= ruleCategoryClause | this_ArtistClause_1= ruleArtistClause | this_TitleClause_2= ruleTitleClause )
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
                    // InternalMuslanQueryParser.g:244:3: this_CategoryClause_0= ruleCategoryClause
                    {

                    			newCompositeNode(grammarAccess.getClauseAccess().getCategoryClauseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CategoryClause_0=ruleCategoryClause();

                    state._fsp--;


                    			current = this_CategoryClause_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:253:3: this_ArtistClause_1= ruleArtistClause
                    {

                    			newCompositeNode(grammarAccess.getClauseAccess().getArtistClauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArtistClause_1=ruleArtistClause();

                    state._fsp--;


                    			current = this_ArtistClause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:262:3: this_TitleClause_2= ruleTitleClause
                    {

                    			newCompositeNode(grammarAccess.getClauseAccess().getTitleClauseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TitleClause_2=ruleTitleClause();

                    state._fsp--;


                    			current = this_TitleClause_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleCategoryClause"
    // InternalMuslanQueryParser.g:274:1: entryRuleCategoryClause returns [EObject current=null] : iv_ruleCategoryClause= ruleCategoryClause EOF ;
    public final EObject entryRuleCategoryClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryClause = null;


        try {
            // InternalMuslanQueryParser.g:274:55: (iv_ruleCategoryClause= ruleCategoryClause EOF )
            // InternalMuslanQueryParser.g:275:2: iv_ruleCategoryClause= ruleCategoryClause EOF
            {
             newCompositeNode(grammarAccess.getCategoryClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategoryClause=ruleCategoryClause();

            state._fsp--;

             current =iv_ruleCategoryClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategoryClause"


    // $ANTLR start "ruleCategoryClause"
    // InternalMuslanQueryParser.g:281:1: ruleCategoryClause returns [EObject current=null] : ( ( (lv_category_0_0= ruleCategoryType ) ) ( (lv_operator_1_0= ruleOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCategoryClause() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Enumerator lv_category_0_0 = null;

        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:287:2: ( ( ( (lv_category_0_0= ruleCategoryType ) ) ( (lv_operator_1_0= ruleOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMuslanQueryParser.g:288:2: ( ( (lv_category_0_0= ruleCategoryType ) ) ( (lv_operator_1_0= ruleOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMuslanQueryParser.g:288:2: ( ( (lv_category_0_0= ruleCategoryType ) ) ( (lv_operator_1_0= ruleOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMuslanQueryParser.g:289:3: ( (lv_category_0_0= ruleCategoryType ) ) ( (lv_operator_1_0= ruleOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalMuslanQueryParser.g:289:3: ( (lv_category_0_0= ruleCategoryType ) )
            // InternalMuslanQueryParser.g:290:4: (lv_category_0_0= ruleCategoryType )
            {
            // InternalMuslanQueryParser.g:290:4: (lv_category_0_0= ruleCategoryType )
            // InternalMuslanQueryParser.g:291:5: lv_category_0_0= ruleCategoryType
            {

            					newCompositeNode(grammarAccess.getCategoryClauseAccess().getCategoryCategoryTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_category_0_0=ruleCategoryType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryClauseRule());
            					}
            					set(
            						current,
            						"category",
            						lv_category_0_0,
            						"muslan.query.MuslanQuery.CategoryType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMuslanQueryParser.g:308:3: ( (lv_operator_1_0= ruleOperatorType ) )
            // InternalMuslanQueryParser.g:309:4: (lv_operator_1_0= ruleOperatorType )
            {
            // InternalMuslanQueryParser.g:309:4: (lv_operator_1_0= ruleOperatorType )
            // InternalMuslanQueryParser.g:310:5: lv_operator_1_0= ruleOperatorType
            {

            					newCompositeNode(grammarAccess.getCategoryClauseAccess().getOperatorOperatorTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_1_0=ruleOperatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryClauseRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"muslan.query.MuslanQuery.OperatorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMuslanQueryParser.g:327:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMuslanQueryParser.g:328:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMuslanQueryParser.g:328:4: (lv_value_2_0= RULE_STRING )
            // InternalMuslanQueryParser.g:329:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getCategoryClauseAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCategoryClauseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoryClause"


    // $ANTLR start "entryRuleArtistClause"
    // InternalMuslanQueryParser.g:349:1: entryRuleArtistClause returns [EObject current=null] : iv_ruleArtistClause= ruleArtistClause EOF ;
    public final EObject entryRuleArtistClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtistClause = null;


        try {
            // InternalMuslanQueryParser.g:349:53: (iv_ruleArtistClause= ruleArtistClause EOF )
            // InternalMuslanQueryParser.g:350:2: iv_ruleArtistClause= ruleArtistClause EOF
            {
             newCompositeNode(grammarAccess.getArtistClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtistClause=ruleArtistClause();

            state._fsp--;

             current =iv_ruleArtistClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtistClause"


    // $ANTLR start "ruleArtistClause"
    // InternalMuslanQueryParser.g:356:1: ruleArtistClause returns [EObject current=null] : (otherlv_0= Artist ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleArtistClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:362:2: ( (otherlv_0= Artist ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMuslanQueryParser.g:363:2: (otherlv_0= Artist ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMuslanQueryParser.g:363:2: (otherlv_0= Artist ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMuslanQueryParser.g:364:3: otherlv_0= Artist ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Artist,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArtistClauseAccess().getArtistKeyword_0());
            		
            // InternalMuslanQueryParser.g:368:3: ( (lv_operator_1_0= ruleRestrictedOperatorType ) )
            // InternalMuslanQueryParser.g:369:4: (lv_operator_1_0= ruleRestrictedOperatorType )
            {
            // InternalMuslanQueryParser.g:369:4: (lv_operator_1_0= ruleRestrictedOperatorType )
            // InternalMuslanQueryParser.g:370:5: lv_operator_1_0= ruleRestrictedOperatorType
            {

            					newCompositeNode(grammarAccess.getArtistClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_1_0=ruleRestrictedOperatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtistClauseRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"muslan.query.MuslanQuery.RestrictedOperatorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMuslanQueryParser.g:387:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMuslanQueryParser.g:388:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMuslanQueryParser.g:388:4: (lv_value_2_0= RULE_STRING )
            // InternalMuslanQueryParser.g:389:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getArtistClauseAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtistClauseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtistClause"


    // $ANTLR start "entryRuleTitleClause"
    // InternalMuslanQueryParser.g:409:1: entryRuleTitleClause returns [EObject current=null] : iv_ruleTitleClause= ruleTitleClause EOF ;
    public final EObject entryRuleTitleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleClause = null;


        try {
            // InternalMuslanQueryParser.g:409:52: (iv_ruleTitleClause= ruleTitleClause EOF )
            // InternalMuslanQueryParser.g:410:2: iv_ruleTitleClause= ruleTitleClause EOF
            {
             newCompositeNode(grammarAccess.getTitleClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitleClause=ruleTitleClause();

            state._fsp--;

             current =iv_ruleTitleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitleClause"


    // $ANTLR start "ruleTitleClause"
    // InternalMuslanQueryParser.g:416:1: ruleTitleClause returns [EObject current=null] : (otherlv_0= Title ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:422:2: ( (otherlv_0= Title ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMuslanQueryParser.g:423:2: (otherlv_0= Title ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMuslanQueryParser.g:423:2: (otherlv_0= Title ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMuslanQueryParser.g:424:3: otherlv_0= Title ( (lv_operator_1_0= ruleRestrictedOperatorType ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Title,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleClauseAccess().getTitleKeyword_0());
            		
            // InternalMuslanQueryParser.g:428:3: ( (lv_operator_1_0= ruleRestrictedOperatorType ) )
            // InternalMuslanQueryParser.g:429:4: (lv_operator_1_0= ruleRestrictedOperatorType )
            {
            // InternalMuslanQueryParser.g:429:4: (lv_operator_1_0= ruleRestrictedOperatorType )
            // InternalMuslanQueryParser.g:430:5: lv_operator_1_0= ruleRestrictedOperatorType
            {

            					newCompositeNode(grammarAccess.getTitleClauseAccess().getOperatorRestrictedOperatorTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_1_0=ruleRestrictedOperatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleClauseRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"muslan.query.MuslanQuery.RestrictedOperatorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMuslanQueryParser.g:447:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMuslanQueryParser.g:448:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMuslanQueryParser.g:448:4: (lv_value_2_0= RULE_STRING )
            // InternalMuslanQueryParser.g:449:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTitleClauseAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleClauseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitleClause"


    // $ANTLR start "entryRuleOrClause"
    // InternalMuslanQueryParser.g:469:1: entryRuleOrClause returns [EObject current=null] : iv_ruleOrClause= ruleOrClause EOF ;
    public final EObject entryRuleOrClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrClause = null;


        try {
            // InternalMuslanQueryParser.g:469:49: (iv_ruleOrClause= ruleOrClause EOF )
            // InternalMuslanQueryParser.g:470:2: iv_ruleOrClause= ruleOrClause EOF
            {
             newCompositeNode(grammarAccess.getOrClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrClause=ruleOrClause();

            state._fsp--;

             current =iv_ruleOrClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrClause"


    // $ANTLR start "ruleOrClause"
    // InternalMuslanQueryParser.g:476:1: ruleOrClause returns [EObject current=null] : (otherlv_0= Either otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleOrContent ) ) ( (otherlv_3= Or | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleOrContent ) ) )+ otherlv_6= RightParenthesis ) ;
    public final EObject ruleOrClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_filterclause_2_0 = null;

        EObject lv_filterclause_5_0 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:482:2: ( (otherlv_0= Either otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleOrContent ) ) ( (otherlv_3= Or | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleOrContent ) ) )+ otherlv_6= RightParenthesis ) )
            // InternalMuslanQueryParser.g:483:2: (otherlv_0= Either otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleOrContent ) ) ( (otherlv_3= Or | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleOrContent ) ) )+ otherlv_6= RightParenthesis )
            {
            // InternalMuslanQueryParser.g:483:2: (otherlv_0= Either otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleOrContent ) ) ( (otherlv_3= Or | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleOrContent ) ) )+ otherlv_6= RightParenthesis )
            // InternalMuslanQueryParser.g:484:3: otherlv_0= Either otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleOrContent ) ) ( (otherlv_3= Or | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleOrContent ) ) )+ otherlv_6= RightParenthesis
            {
            otherlv_0=(Token)match(input,Either,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOrClauseAccess().getEitherKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOrClauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMuslanQueryParser.g:492:3: ( (lv_filterclause_2_0= ruleOrContent ) )
            // InternalMuslanQueryParser.g:493:4: (lv_filterclause_2_0= ruleOrContent )
            {
            // InternalMuslanQueryParser.g:493:4: (lv_filterclause_2_0= ruleOrContent )
            // InternalMuslanQueryParser.g:494:5: lv_filterclause_2_0= ruleOrContent
            {

            					newCompositeNode(grammarAccess.getOrClauseAccess().getFilterclauseOrContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_filterclause_2_0=ruleOrContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrClauseRule());
            					}
            					add(
            						current,
            						"filterclause",
            						lv_filterclause_2_0,
            						"muslan.query.MuslanQuery.OrContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMuslanQueryParser.g:511:3: ( (otherlv_3= Or | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleOrContent ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Artist||LA5_0==Rating||(LA5_0>=Genre && LA5_0<=Title)||LA5_0==Both||(LA5_0>=Tag && LA5_0<=Or)||LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMuslanQueryParser.g:512:4: (otherlv_3= Or | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleOrContent ) )
            	    {
            	    // InternalMuslanQueryParser.g:512:4: (otherlv_3= Or | otherlv_4= Comma )?
            	    int alt4=3;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==Or) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==Comma) ) {
            	        alt4=2;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMuslanQueryParser.g:513:5: otherlv_3= Or
            	            {
            	            otherlv_3=(Token)match(input,Or,FOLLOW_7); 

            	            					newLeafNode(otherlv_3, grammarAccess.getOrClauseAccess().getOrKeyword_3_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMuslanQueryParser.g:518:5: otherlv_4= Comma
            	            {
            	            otherlv_4=(Token)match(input,Comma,FOLLOW_7); 

            	            					newLeafNode(otherlv_4, grammarAccess.getOrClauseAccess().getCommaKeyword_3_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMuslanQueryParser.g:523:4: ( (lv_filterclause_5_0= ruleOrContent ) )
            	    // InternalMuslanQueryParser.g:524:5: (lv_filterclause_5_0= ruleOrContent )
            	    {
            	    // InternalMuslanQueryParser.g:524:5: (lv_filterclause_5_0= ruleOrContent )
            	    // InternalMuslanQueryParser.g:525:6: lv_filterclause_5_0= ruleOrContent
            	    {

            	    						newCompositeNode(grammarAccess.getOrClauseAccess().getFilterclauseOrContentParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_filterclause_5_0=ruleOrContent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"filterclause",
            	    							lv_filterclause_5_0,
            	    							"muslan.query.MuslanQuery.OrContent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOrClauseAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrClause"


    // $ANTLR start "entryRuleOrContent"
    // InternalMuslanQueryParser.g:551:1: entryRuleOrContent returns [EObject current=null] : iv_ruleOrContent= ruleOrContent EOF ;
    public final EObject entryRuleOrContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrContent = null;


        try {
            // InternalMuslanQueryParser.g:551:50: (iv_ruleOrContent= ruleOrContent EOF )
            // InternalMuslanQueryParser.g:552:2: iv_ruleOrContent= ruleOrContent EOF
            {
             newCompositeNode(grammarAccess.getOrContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrContent=ruleOrContent();

            state._fsp--;

             current =iv_ruleOrContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrContent"


    // $ANTLR start "ruleOrContent"
    // InternalMuslanQueryParser.g:558:1: ruleOrContent returns [EObject current=null] : (this_Clause_0= ruleClause | this_AndClause_1= ruleAndClause ) ;
    public final EObject ruleOrContent() throws RecognitionException {
        EObject current = null;

        EObject this_Clause_0 = null;

        EObject this_AndClause_1 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:564:2: ( (this_Clause_0= ruleClause | this_AndClause_1= ruleAndClause ) )
            // InternalMuslanQueryParser.g:565:2: (this_Clause_0= ruleClause | this_AndClause_1= ruleAndClause )
            {
            // InternalMuslanQueryParser.g:565:2: (this_Clause_0= ruleClause | this_AndClause_1= ruleAndClause )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Artist||LA6_0==Rating||(LA6_0>=Genre && LA6_0<=Title)||LA6_0==Tag) ) {
                alt6=1;
            }
            else if ( (LA6_0==Both) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMuslanQueryParser.g:566:3: this_Clause_0= ruleClause
                    {

                    			newCompositeNode(grammarAccess.getOrContentAccess().getClauseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause_0=ruleClause();

                    state._fsp--;


                    			current = this_Clause_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:575:3: this_AndClause_1= ruleAndClause
                    {

                    			newCompositeNode(grammarAccess.getOrContentAccess().getAndClauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndClause_1=ruleAndClause();

                    state._fsp--;


                    			current = this_AndClause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrContent"


    // $ANTLR start "entryRuleAndClause"
    // InternalMuslanQueryParser.g:587:1: entryRuleAndClause returns [EObject current=null] : iv_ruleAndClause= ruleAndClause EOF ;
    public final EObject entryRuleAndClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndClause = null;


        try {
            // InternalMuslanQueryParser.g:587:50: (iv_ruleAndClause= ruleAndClause EOF )
            // InternalMuslanQueryParser.g:588:2: iv_ruleAndClause= ruleAndClause EOF
            {
             newCompositeNode(grammarAccess.getAndClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndClause=ruleAndClause();

            state._fsp--;

             current =iv_ruleAndClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndClause"


    // $ANTLR start "ruleAndClause"
    // InternalMuslanQueryParser.g:594:1: ruleAndClause returns [EObject current=null] : (otherlv_0= Both otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleAndContent ) ) ( (otherlv_3= And | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleAndContent ) ) )+ otherlv_6= RightParenthesis ) ;
    public final EObject ruleAndClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_filterclause_2_0 = null;

        EObject lv_filterclause_5_0 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:600:2: ( (otherlv_0= Both otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleAndContent ) ) ( (otherlv_3= And | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleAndContent ) ) )+ otherlv_6= RightParenthesis ) )
            // InternalMuslanQueryParser.g:601:2: (otherlv_0= Both otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleAndContent ) ) ( (otherlv_3= And | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleAndContent ) ) )+ otherlv_6= RightParenthesis )
            {
            // InternalMuslanQueryParser.g:601:2: (otherlv_0= Both otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleAndContent ) ) ( (otherlv_3= And | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleAndContent ) ) )+ otherlv_6= RightParenthesis )
            // InternalMuslanQueryParser.g:602:3: otherlv_0= Both otherlv_1= LeftParenthesis ( (lv_filterclause_2_0= ruleAndContent ) ) ( (otherlv_3= And | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleAndContent ) ) )+ otherlv_6= RightParenthesis
            {
            otherlv_0=(Token)match(input,Both,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAndClauseAccess().getBothKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAndClauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMuslanQueryParser.g:610:3: ( (lv_filterclause_2_0= ruleAndContent ) )
            // InternalMuslanQueryParser.g:611:4: (lv_filterclause_2_0= ruleAndContent )
            {
            // InternalMuslanQueryParser.g:611:4: (lv_filterclause_2_0= ruleAndContent )
            // InternalMuslanQueryParser.g:612:5: lv_filterclause_2_0= ruleAndContent
            {

            					newCompositeNode(grammarAccess.getAndClauseAccess().getFilterclauseAndContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_filterclause_2_0=ruleAndContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndClauseRule());
            					}
            					add(
            						current,
            						"filterclause",
            						lv_filterclause_2_0,
            						"muslan.query.MuslanQuery.AndContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMuslanQueryParser.g:629:3: ( (otherlv_3= And | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleAndContent ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=Artist && LA8_0<=Rating)||(LA8_0>=Genre && LA8_0<=Title)||LA8_0==And||LA8_0==Tag||LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMuslanQueryParser.g:630:4: (otherlv_3= And | otherlv_4= Comma )? ( (lv_filterclause_5_0= ruleAndContent ) )
            	    {
            	    // InternalMuslanQueryParser.g:630:4: (otherlv_3= And | otherlv_4= Comma )?
            	    int alt7=3;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==And) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==Comma) ) {
            	        alt7=2;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMuslanQueryParser.g:631:5: otherlv_3= And
            	            {
            	            otherlv_3=(Token)match(input,And,FOLLOW_14); 

            	            					newLeafNode(otherlv_3, grammarAccess.getAndClauseAccess().getAndKeyword_3_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMuslanQueryParser.g:636:5: otherlv_4= Comma
            	            {
            	            otherlv_4=(Token)match(input,Comma,FOLLOW_14); 

            	            					newLeafNode(otherlv_4, grammarAccess.getAndClauseAccess().getCommaKeyword_3_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalMuslanQueryParser.g:641:4: ( (lv_filterclause_5_0= ruleAndContent ) )
            	    // InternalMuslanQueryParser.g:642:5: (lv_filterclause_5_0= ruleAndContent )
            	    {
            	    // InternalMuslanQueryParser.g:642:5: (lv_filterclause_5_0= ruleAndContent )
            	    // InternalMuslanQueryParser.g:643:6: lv_filterclause_5_0= ruleAndContent
            	    {

            	    						newCompositeNode(grammarAccess.getAndClauseAccess().getFilterclauseAndContentParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_filterclause_5_0=ruleAndContent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"filterclause",
            	    							lv_filterclause_5_0,
            	    							"muslan.query.MuslanQuery.AndContent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAndClauseAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndClause"


    // $ANTLR start "entryRuleAndContent"
    // InternalMuslanQueryParser.g:669:1: entryRuleAndContent returns [EObject current=null] : iv_ruleAndContent= ruleAndContent EOF ;
    public final EObject entryRuleAndContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndContent = null;


        try {
            // InternalMuslanQueryParser.g:669:51: (iv_ruleAndContent= ruleAndContent EOF )
            // InternalMuslanQueryParser.g:670:2: iv_ruleAndContent= ruleAndContent EOF
            {
             newCompositeNode(grammarAccess.getAndContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndContent=ruleAndContent();

            state._fsp--;

             current =iv_ruleAndContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndContent"


    // $ANTLR start "ruleAndContent"
    // InternalMuslanQueryParser.g:676:1: ruleAndContent returns [EObject current=null] : (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause ) ;
    public final EObject ruleAndContent() throws RecognitionException {
        EObject current = null;

        EObject this_Clause_0 = null;

        EObject this_OrClause_1 = null;



        	enterRule();

        try {
            // InternalMuslanQueryParser.g:682:2: ( (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause ) )
            // InternalMuslanQueryParser.g:683:2: (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause )
            {
            // InternalMuslanQueryParser.g:683:2: (this_Clause_0= ruleClause | this_OrClause_1= ruleOrClause )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Artist||LA9_0==Rating||(LA9_0>=Genre && LA9_0<=Title)||LA9_0==Tag) ) {
                alt9=1;
            }
            else if ( (LA9_0==Either) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMuslanQueryParser.g:684:3: this_Clause_0= ruleClause
                    {

                    			newCompositeNode(grammarAccess.getAndContentAccess().getClauseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause_0=ruleClause();

                    state._fsp--;


                    			current = this_Clause_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:693:3: this_OrClause_1= ruleOrClause
                    {

                    			newCompositeNode(grammarAccess.getAndContentAccess().getOrClauseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrClause_1=ruleOrClause();

                    state._fsp--;


                    			current = this_OrClause_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndContent"


    // $ANTLR start "ruleCategorizedElementType"
    // InternalMuslanQueryParser.g:705:1: ruleCategorizedElementType returns [Enumerator current=null] : ( (enumLiteral_0= Track ) | (enumLiteral_1= Album ) ) ;
    public final Enumerator ruleCategorizedElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMuslanQueryParser.g:711:2: ( ( (enumLiteral_0= Track ) | (enumLiteral_1= Album ) ) )
            // InternalMuslanQueryParser.g:712:2: ( (enumLiteral_0= Track ) | (enumLiteral_1= Album ) )
            {
            // InternalMuslanQueryParser.g:712:2: ( (enumLiteral_0= Track ) | (enumLiteral_1= Album ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Track) ) {
                alt10=1;
            }
            else if ( (LA10_0==Album) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMuslanQueryParser.g:713:3: (enumLiteral_0= Track )
                    {
                    // InternalMuslanQueryParser.g:713:3: (enumLiteral_0= Track )
                    // InternalMuslanQueryParser.g:714:4: enumLiteral_0= Track
                    {
                    enumLiteral_0=(Token)match(input,Track,FOLLOW_2); 

                    				current = grammarAccess.getCategorizedElementTypeAccess().getTrackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategorizedElementTypeAccess().getTrackEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:721:3: (enumLiteral_1= Album )
                    {
                    // InternalMuslanQueryParser.g:721:3: (enumLiteral_1= Album )
                    // InternalMuslanQueryParser.g:722:4: enumLiteral_1= Album
                    {
                    enumLiteral_1=(Token)match(input,Album,FOLLOW_2); 

                    				current = grammarAccess.getCategorizedElementTypeAccess().getAlbumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategorizedElementTypeAccess().getAlbumEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategorizedElementType"


    // $ANTLR start "ruleCategoryType"
    // InternalMuslanQueryParser.g:732:1: ruleCategoryType returns [Enumerator current=null] : ( (enumLiteral_0= Rating ) | (enumLiteral_1= Genre ) | (enumLiteral_2= Tag ) ) ;
    public final Enumerator ruleCategoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMuslanQueryParser.g:738:2: ( ( (enumLiteral_0= Rating ) | (enumLiteral_1= Genre ) | (enumLiteral_2= Tag ) ) )
            // InternalMuslanQueryParser.g:739:2: ( (enumLiteral_0= Rating ) | (enumLiteral_1= Genre ) | (enumLiteral_2= Tag ) )
            {
            // InternalMuslanQueryParser.g:739:2: ( (enumLiteral_0= Rating ) | (enumLiteral_1= Genre ) | (enumLiteral_2= Tag ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case Rating:
                {
                alt11=1;
                }
                break;
            case Genre:
                {
                alt11=2;
                }
                break;
            case Tag:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMuslanQueryParser.g:740:3: (enumLiteral_0= Rating )
                    {
                    // InternalMuslanQueryParser.g:740:3: (enumLiteral_0= Rating )
                    // InternalMuslanQueryParser.g:741:4: enumLiteral_0= Rating
                    {
                    enumLiteral_0=(Token)match(input,Rating,FOLLOW_2); 

                    				current = grammarAccess.getCategoryTypeAccess().getRatingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCategoryTypeAccess().getRatingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:748:3: (enumLiteral_1= Genre )
                    {
                    // InternalMuslanQueryParser.g:748:3: (enumLiteral_1= Genre )
                    // InternalMuslanQueryParser.g:749:4: enumLiteral_1= Genre
                    {
                    enumLiteral_1=(Token)match(input,Genre,FOLLOW_2); 

                    				current = grammarAccess.getCategoryTypeAccess().getGenreEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCategoryTypeAccess().getGenreEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:756:3: (enumLiteral_2= Tag )
                    {
                    // InternalMuslanQueryParser.g:756:3: (enumLiteral_2= Tag )
                    // InternalMuslanQueryParser.g:757:4: enumLiteral_2= Tag
                    {
                    enumLiteral_2=(Token)match(input,Tag,FOLLOW_2); 

                    				current = grammarAccess.getCategoryTypeAccess().getTagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCategoryTypeAccess().getTagEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoryType"


    // $ANTLR start "ruleOperatorType"
    // InternalMuslanQueryParser.g:767:1: ruleOperatorType returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= GreaterThanSign ) ) ;
    public final Enumerator ruleOperatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMuslanQueryParser.g:773:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= GreaterThanSign ) ) )
            // InternalMuslanQueryParser.g:774:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= GreaterThanSign ) )
            {
            // InternalMuslanQueryParser.g:774:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= GreaterThanSign ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt12=1;
                }
                break;
            case Not:
                {
                alt12=2;
                }
                break;
            case LessThanSign:
                {
                alt12=3;
                }
                break;
            case GreaterThanSign:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMuslanQueryParser.g:775:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalMuslanQueryParser.g:775:3: (enumLiteral_0= EqualsSign )
                    // InternalMuslanQueryParser.g:776:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:783:3: (enumLiteral_1= Not )
                    {
                    // InternalMuslanQueryParser.g:783:3: (enumLiteral_1= Not )
                    // InternalMuslanQueryParser.g:784:4: enumLiteral_1= Not
                    {
                    enumLiteral_1=(Token)match(input,Not,FOLLOW_2); 

                    				current = grammarAccess.getOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMuslanQueryParser.g:791:3: (enumLiteral_2= LessThanSign )
                    {
                    // InternalMuslanQueryParser.g:791:3: (enumLiteral_2= LessThanSign )
                    // InternalMuslanQueryParser.g:792:4: enumLiteral_2= LessThanSign
                    {
                    enumLiteral_2=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getOperatorTypeAccess().getLessThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorTypeAccess().getLessThanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMuslanQueryParser.g:799:3: (enumLiteral_3= GreaterThanSign )
                    {
                    // InternalMuslanQueryParser.g:799:3: (enumLiteral_3= GreaterThanSign )
                    // InternalMuslanQueryParser.g:800:4: enumLiteral_3= GreaterThanSign
                    {
                    enumLiteral_3=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getOperatorTypeAccess().getGreaterThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorTypeAccess().getGreaterThanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperatorType"


    // $ANTLR start "ruleRestrictedOperatorType"
    // InternalMuslanQueryParser.g:810:1: ruleRestrictedOperatorType returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) ) ;
    public final Enumerator ruleRestrictedOperatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMuslanQueryParser.g:816:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) ) )
            // InternalMuslanQueryParser.g:817:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) )
            {
            // InternalMuslanQueryParser.g:817:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= Not ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EqualsSign) ) {
                alt13=1;
            }
            else if ( (LA13_0==Not) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMuslanQueryParser.g:818:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalMuslanQueryParser.g:818:3: (enumLiteral_0= EqualsSign )
                    // InternalMuslanQueryParser.g:819:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getRestrictedOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestrictedOperatorTypeAccess().getSameAsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMuslanQueryParser.g:826:3: (enumLiteral_1= Not )
                    {
                    // InternalMuslanQueryParser.g:826:3: (enumLiteral_1= Not )
                    // InternalMuslanQueryParser.g:827:4: enumLiteral_1= Not
                    {
                    enumLiteral_1=(Token)match(input,Not,FOLLOW_2); 

                    				current = grammarAccess.getRestrictedOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestrictedOperatorTypeAccess().getDifferentFromEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedOperatorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020B70L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001C10000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000260B70L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000360B70L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020370L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000228370L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000328370L});

}