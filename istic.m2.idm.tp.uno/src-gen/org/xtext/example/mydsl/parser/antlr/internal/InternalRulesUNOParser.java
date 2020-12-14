package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.RulesUNOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesUNOParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RUno'", "'{'", "'}'", "'participant'", "'='", "'EQUIPE'", "'JOUEUR'", "';'", "'nb_joueur'", "'variantes'", "','", "'regles'", "'choix'", "'BASE'", "'DEUX_JOUEURS'", "'UNO_CHALENGE'", "'CARTES_IDENTIQUES'", "'SUITES'", "'ZERO_ECHANGE'", "'ZERO_TOURNANT'", "'ZERO_QUESTION'", "'MANCHE'", "'NB_JOUEUR'", "'NB_PARTICIPANT'", "'FINIR'", "'NOUVELLE'", "'JOUEUR_COURRANT'", "'JOUEUR_SUIVANT'", "'JOUEUR_TOUS'", "'JOUEUR_AUTRE'", "'JOUEUR_EXISTE'", "'JOUEUR_SELECTIONNE'", "'CRIER_UNO'", "'JOUER_CARTE_BASE'", "'JOUER_CARTE_JOKER'", "'JOUER_CARTE_INVERSER_SENS'", "'JOUER_CARTE_PASSE_TON_TOUR'", "'JOUER_CARTE_PLUS_2'", "'JOUER_CARTE_PLUS_4'", "'JOUER_PLUSIEURS_CARTES_IDENTIQUES'", "'JOUER_CARTE_ZERO'", "'JOUER_SUITE_DE_CARTES'", "'POSER_QUESTION'", "'REJOUER'", "'PASSER_SON_TOUR'", "'CHANGER_COULEUR'", "'CHOISIR_COULEUR'", "'PIOCHER_2_CARTES'", "'PIOCHER_4_CARTES'", "'INVERSER_SENS'", "'DONNER_CARTES_AU_JOUEUR_SUIVANT'", "'ECHANGER_JEU_AVEC_UN_ADVERSAIRE'", "'REMARQUER_ERREUR_UNO'", "'NB_CARTES'", "'PARTICIPANT_COURRANT'", "'PARTICIPANT_EXISTE'", "'PARTICIPANT_SELECTIONNE'", "'PARTICIPANT_MIN_POINTS'", "'GAGNER'", "'PERDRE'", "'ETRE_ELIMINE'", "'POINTS'", "'.'", "'()'", "'+'", "'-'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'->'", "'<->'", "'true'", "'false'", "'!'", "'if'", "'('", "')'", "'else'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalRulesUNOParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesUNOParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesUNOParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRulesUNO.g"; }



     	private RulesUNOGrammarAccess grammarAccess;

        public InternalRulesUNOParser(TokenStream input, RulesUNOGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Uno";
       	}

       	@Override
       	protected RulesUNOGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUno"
    // InternalRulesUNO.g:64:1: entryRuleUno returns [EObject current=null] : iv_ruleUno= ruleUno EOF ;
    public final EObject entryRuleUno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUno = null;


        try {
            // InternalRulesUNO.g:64:44: (iv_ruleUno= ruleUno EOF )
            // InternalRulesUNO.g:65:2: iv_ruleUno= ruleUno EOF
            {
             newCompositeNode(grammarAccess.getUnoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUno=ruleUno();

            state._fsp--;

             current =iv_ruleUno; 
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
    // $ANTLR end "entryRuleUno"


    // $ANTLR start "ruleUno"
    // InternalRulesUNO.g:71:1: ruleUno returns [EObject current=null] : (otherlv_0= 'RUno' otherlv_1= '{' ( (lv_nbJoueur_2_0= ruleNbJoueur ) ) ( (lv_participantType_3_0= ruleParticipantType ) ) ( (lv_variantes_4_0= ruleVariantes ) ) ( (lv_regles_5_0= ruleRegles ) )? otherlv_6= '}' ) ;
    public final EObject ruleUno() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_nbJoueur_2_0 = null;

        EObject lv_participantType_3_0 = null;

        EObject lv_variantes_4_0 = null;

        EObject lv_regles_5_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:77:2: ( (otherlv_0= 'RUno' otherlv_1= '{' ( (lv_nbJoueur_2_0= ruleNbJoueur ) ) ( (lv_participantType_3_0= ruleParticipantType ) ) ( (lv_variantes_4_0= ruleVariantes ) ) ( (lv_regles_5_0= ruleRegles ) )? otherlv_6= '}' ) )
            // InternalRulesUNO.g:78:2: (otherlv_0= 'RUno' otherlv_1= '{' ( (lv_nbJoueur_2_0= ruleNbJoueur ) ) ( (lv_participantType_3_0= ruleParticipantType ) ) ( (lv_variantes_4_0= ruleVariantes ) ) ( (lv_regles_5_0= ruleRegles ) )? otherlv_6= '}' )
            {
            // InternalRulesUNO.g:78:2: (otherlv_0= 'RUno' otherlv_1= '{' ( (lv_nbJoueur_2_0= ruleNbJoueur ) ) ( (lv_participantType_3_0= ruleParticipantType ) ) ( (lv_variantes_4_0= ruleVariantes ) ) ( (lv_regles_5_0= ruleRegles ) )? otherlv_6= '}' )
            // InternalRulesUNO.g:79:3: otherlv_0= 'RUno' otherlv_1= '{' ( (lv_nbJoueur_2_0= ruleNbJoueur ) ) ( (lv_participantType_3_0= ruleParticipantType ) ) ( (lv_variantes_4_0= ruleVariantes ) ) ( (lv_regles_5_0= ruleRegles ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnoAccess().getRUnoKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRulesUNO.g:87:3: ( (lv_nbJoueur_2_0= ruleNbJoueur ) )
            // InternalRulesUNO.g:88:4: (lv_nbJoueur_2_0= ruleNbJoueur )
            {
            // InternalRulesUNO.g:88:4: (lv_nbJoueur_2_0= ruleNbJoueur )
            // InternalRulesUNO.g:89:5: lv_nbJoueur_2_0= ruleNbJoueur
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getNbJoueurNbJoueurParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_nbJoueur_2_0=ruleNbJoueur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					set(
            						current,
            						"nbJoueur",
            						lv_nbJoueur_2_0,
            						"org.xtext.example.mydsl.RulesUNO.NbJoueur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRulesUNO.g:106:3: ( (lv_participantType_3_0= ruleParticipantType ) )
            // InternalRulesUNO.g:107:4: (lv_participantType_3_0= ruleParticipantType )
            {
            // InternalRulesUNO.g:107:4: (lv_participantType_3_0= ruleParticipantType )
            // InternalRulesUNO.g:108:5: lv_participantType_3_0= ruleParticipantType
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getParticipantTypeParticipantTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_participantType_3_0=ruleParticipantType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					set(
            						current,
            						"participantType",
            						lv_participantType_3_0,
            						"org.xtext.example.mydsl.RulesUNO.ParticipantType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRulesUNO.g:125:3: ( (lv_variantes_4_0= ruleVariantes ) )
            // InternalRulesUNO.g:126:4: (lv_variantes_4_0= ruleVariantes )
            {
            // InternalRulesUNO.g:126:4: (lv_variantes_4_0= ruleVariantes )
            // InternalRulesUNO.g:127:5: lv_variantes_4_0= ruleVariantes
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getVariantesVariantesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_variantes_4_0=ruleVariantes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					set(
            						current,
            						"variantes",
            						lv_variantes_4_0,
            						"org.xtext.example.mydsl.RulesUNO.Variantes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRulesUNO.g:144:3: ( (lv_regles_5_0= ruleRegles ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRulesUNO.g:145:4: (lv_regles_5_0= ruleRegles )
                    {
                    // InternalRulesUNO.g:145:4: (lv_regles_5_0= ruleRegles )
                    // InternalRulesUNO.g:146:5: lv_regles_5_0= ruleRegles
                    {

                    					newCompositeNode(grammarAccess.getUnoAccess().getReglesReglesParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_regles_5_0=ruleRegles();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnoRule());
                    					}
                    					set(
                    						current,
                    						"regles",
                    						lv_regles_5_0,
                    						"org.xtext.example.mydsl.RulesUNO.Regles");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUnoAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleUno"


    // $ANTLR start "entryRuleParticipantType"
    // InternalRulesUNO.g:171:1: entryRuleParticipantType returns [EObject current=null] : iv_ruleParticipantType= ruleParticipantType EOF ;
    public final EObject entryRuleParticipantType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantType = null;


        try {
            // InternalRulesUNO.g:171:56: (iv_ruleParticipantType= ruleParticipantType EOF )
            // InternalRulesUNO.g:172:2: iv_ruleParticipantType= ruleParticipantType EOF
            {
             newCompositeNode(grammarAccess.getParticipantTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipantType=ruleParticipantType();

            state._fsp--;

             current =iv_ruleParticipantType; 
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
    // $ANTLR end "entryRuleParticipantType"


    // $ANTLR start "ruleParticipantType"
    // InternalRulesUNO.g:178:1: ruleParticipantType returns [EObject current=null] : (otherlv_0= 'participant' otherlv_1= '=' ( ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleParticipantType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_1=null;
        Token lv_id_2_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:184:2: ( (otherlv_0= 'participant' otherlv_1= '=' ( ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) ) ) otherlv_3= ';' ) )
            // InternalRulesUNO.g:185:2: (otherlv_0= 'participant' otherlv_1= '=' ( ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) ) ) otherlv_3= ';' )
            {
            // InternalRulesUNO.g:185:2: (otherlv_0= 'participant' otherlv_1= '=' ( ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) ) ) otherlv_3= ';' )
            // InternalRulesUNO.g:186:3: otherlv_0= 'participant' otherlv_1= '=' ( ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantTypeAccess().getParticipantKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParticipantTypeAccess().getEqualsSignKeyword_1());
            		
            // InternalRulesUNO.g:194:3: ( ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) ) )
            // InternalRulesUNO.g:195:4: ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) )
            {
            // InternalRulesUNO.g:195:4: ( (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' ) )
            // InternalRulesUNO.g:196:5: (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' )
            {
            // InternalRulesUNO.g:196:5: (lv_id_2_1= 'EQUIPE' | lv_id_2_2= 'JOUEUR' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRulesUNO.g:197:6: lv_id_2_1= 'EQUIPE'
                    {
                    lv_id_2_1=(Token)match(input,16,FOLLOW_11); 

                    						newLeafNode(lv_id_2_1, grammarAccess.getParticipantTypeAccess().getIdEQUIPEKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantTypeRule());
                    						}
                    						setWithLastConsumed(current, "id", lv_id_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:208:6: lv_id_2_2= 'JOUEUR'
                    {
                    lv_id_2_2=(Token)match(input,17,FOLLOW_11); 

                    						newLeafNode(lv_id_2_2, grammarAccess.getParticipantTypeAccess().getIdJOUEURKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantTypeRule());
                    						}
                    						setWithLastConsumed(current, "id", lv_id_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParticipantTypeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleParticipantType"


    // $ANTLR start "entryRuleNbJoueur"
    // InternalRulesUNO.g:229:1: entryRuleNbJoueur returns [EObject current=null] : iv_ruleNbJoueur= ruleNbJoueur EOF ;
    public final EObject entryRuleNbJoueur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNbJoueur = null;


        try {
            // InternalRulesUNO.g:229:49: (iv_ruleNbJoueur= ruleNbJoueur EOF )
            // InternalRulesUNO.g:230:2: iv_ruleNbJoueur= ruleNbJoueur EOF
            {
             newCompositeNode(grammarAccess.getNbJoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNbJoueur=ruleNbJoueur();

            state._fsp--;

             current =iv_ruleNbJoueur; 
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
    // $ANTLR end "entryRuleNbJoueur"


    // $ANTLR start "ruleNbJoueur"
    // InternalRulesUNO.g:236:1: ruleNbJoueur returns [EObject current=null] : (otherlv_0= 'nb_joueur' otherlv_1= '=' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleNbJoueur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:242:2: ( (otherlv_0= 'nb_joueur' otherlv_1= '=' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // InternalRulesUNO.g:243:2: (otherlv_0= 'nb_joueur' otherlv_1= '=' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // InternalRulesUNO.g:243:2: (otherlv_0= 'nb_joueur' otherlv_1= '=' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ';' )
            // InternalRulesUNO.g:244:3: otherlv_0= 'nb_joueur' otherlv_1= '=' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNbJoueurAccess().getNb_joueurKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNbJoueurAccess().getEqualsSignKeyword_1());
            		
            // InternalRulesUNO.g:252:3: ( (lv_val_2_0= RULE_INT ) )
            // InternalRulesUNO.g:253:4: (lv_val_2_0= RULE_INT )
            {
            // InternalRulesUNO.g:253:4: (lv_val_2_0= RULE_INT )
            // InternalRulesUNO.g:254:5: lv_val_2_0= RULE_INT
            {
            lv_val_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_val_2_0, grammarAccess.getNbJoueurAccess().getValINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNbJoueurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNbJoueurAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleNbJoueur"


    // $ANTLR start "entryRuleVariantes"
    // InternalRulesUNO.g:278:1: entryRuleVariantes returns [EObject current=null] : iv_ruleVariantes= ruleVariantes EOF ;
    public final EObject entryRuleVariantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantes = null;


        try {
            // InternalRulesUNO.g:278:50: (iv_ruleVariantes= ruleVariantes EOF )
            // InternalRulesUNO.g:279:2: iv_ruleVariantes= ruleVariantes EOF
            {
             newCompositeNode(grammarAccess.getVariantesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariantes=ruleVariantes();

            state._fsp--;

             current =iv_ruleVariantes; 
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
    // $ANTLR end "entryRuleVariantes"


    // $ANTLR start "ruleVariantes"
    // InternalRulesUNO.g:285:1: ruleVariantes returns [EObject current=null] : ( () otherlv_1= 'variantes' otherlv_2= '{' ( ( (lv_variantes_3_0= ruleVariante ) ) (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleVariantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_variantes_3_0 = null;

        AntlrDatatypeRuleToken lv_variantes_5_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:291:2: ( ( () otherlv_1= 'variantes' otherlv_2= '{' ( ( (lv_variantes_3_0= ruleVariante ) ) (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )* )? otherlv_6= '}' ) )
            // InternalRulesUNO.g:292:2: ( () otherlv_1= 'variantes' otherlv_2= '{' ( ( (lv_variantes_3_0= ruleVariante ) ) (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )* )? otherlv_6= '}' )
            {
            // InternalRulesUNO.g:292:2: ( () otherlv_1= 'variantes' otherlv_2= '{' ( ( (lv_variantes_3_0= ruleVariante ) ) (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )* )? otherlv_6= '}' )
            // InternalRulesUNO.g:293:3: () otherlv_1= 'variantes' otherlv_2= '{' ( ( (lv_variantes_3_0= ruleVariante ) ) (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )* )? otherlv_6= '}'
            {
            // InternalRulesUNO.g:293:3: ()
            // InternalRulesUNO.g:294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariantesAccess().getVariantesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantesAccess().getVariantesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRulesUNO.g:308:3: ( ( (lv_variantes_3_0= ruleVariante ) ) (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16||(LA4_0>=24 && LA4_0<=31)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRulesUNO.g:309:4: ( (lv_variantes_3_0= ruleVariante ) ) (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )*
                    {
                    // InternalRulesUNO.g:309:4: ( (lv_variantes_3_0= ruleVariante ) )
                    // InternalRulesUNO.g:310:5: (lv_variantes_3_0= ruleVariante )
                    {
                    // InternalRulesUNO.g:310:5: (lv_variantes_3_0= ruleVariante )
                    // InternalRulesUNO.g:311:6: lv_variantes_3_0= ruleVariante
                    {

                    						newCompositeNode(grammarAccess.getVariantesAccess().getVariantesVarianteParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_variantes_3_0=ruleVariante();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariantesRule());
                    						}
                    						add(
                    							current,
                    							"variantes",
                    							lv_variantes_3_0,
                    							"org.xtext.example.mydsl.RulesUNO.Variante");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesUNO.g:328:4: (otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRulesUNO.g:329:5: otherlv_4= ',' ( (lv_variantes_5_0= ruleVariante ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getVariantesAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalRulesUNO.g:333:5: ( (lv_variantes_5_0= ruleVariante ) )
                    	    // InternalRulesUNO.g:334:6: (lv_variantes_5_0= ruleVariante )
                    	    {
                    	    // InternalRulesUNO.g:334:6: (lv_variantes_5_0= ruleVariante )
                    	    // InternalRulesUNO.g:335:7: lv_variantes_5_0= ruleVariante
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariantesAccess().getVariantesVarianteParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_variantes_5_0=ruleVariante();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariantesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variantes",
                    	    								lv_variantes_5_0,
                    	    								"org.xtext.example.mydsl.RulesUNO.Variante");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVariantesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVariantes"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRulesUNO.g:362:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRulesUNO.g:362:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRulesUNO.g:363:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRulesUNO.g:369:1: ruleDeclaration returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Condition_1= ruleCondition | this_Affectation_2= ruleAffectation ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Condition_1 = null;

        EObject this_Affectation_2 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:375:2: ( (this_Instruction_0= ruleInstruction | this_Condition_1= ruleCondition | this_Affectation_2= ruleAffectation ) )
            // InternalRulesUNO.g:376:2: (this_Instruction_0= ruleInstruction | this_Condition_1= ruleCondition | this_Affectation_2= ruleAffectation )
            {
            // InternalRulesUNO.g:376:2: (this_Instruction_0= ruleInstruction | this_Condition_1= ruleCondition | this_Affectation_2= ruleAffectation )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRulesUNO.g:377:3: this_Instruction_0= ruleInstruction
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instruction_0=ruleInstruction();

                    state._fsp--;


                    			current = this_Instruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:386:3: this_Condition_1= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_1=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:395:3: this_Affectation_2= ruleAffectation
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getAffectationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Affectation_2=ruleAffectation();

                    state._fsp--;


                    			current = this_Affectation_2;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleRegles"
    // InternalRulesUNO.g:407:1: entryRuleRegles returns [EObject current=null] : iv_ruleRegles= ruleRegles EOF ;
    public final EObject entryRuleRegles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegles = null;


        try {
            // InternalRulesUNO.g:407:47: (iv_ruleRegles= ruleRegles EOF )
            // InternalRulesUNO.g:408:2: iv_ruleRegles= ruleRegles EOF
            {
             newCompositeNode(grammarAccess.getReglesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegles=ruleRegles();

            state._fsp--;

             current =iv_ruleRegles; 
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
    // $ANTLR end "entryRuleRegles"


    // $ANTLR start "ruleRegles"
    // InternalRulesUNO.g:414:1: ruleRegles returns [EObject current=null] : ( () otherlv_1= 'regles' otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleRegles() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:420:2: ( ( () otherlv_1= 'regles' otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' ) )
            // InternalRulesUNO.g:421:2: ( () otherlv_1= 'regles' otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            {
            // InternalRulesUNO.g:421:2: ( () otherlv_1= 'regles' otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}' )
            // InternalRulesUNO.g:422:3: () otherlv_1= 'regles' otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* otherlv_4= '}'
            {
            // InternalRulesUNO.g:422:3: ()
            // InternalRulesUNO.g:423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReglesAccess().getReglesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReglesAccess().getReglesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getReglesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRulesUNO.g:437:3: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||LA6_0==32||(LA6_0>=37 && LA6_0<=42)||(LA6_0>=65 && LA6_0<=68)||LA6_0==91) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRulesUNO.g:438:4: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalRulesUNO.g:438:4: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalRulesUNO.g:439:5: lv_declarations_3_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getReglesAccess().getDeclarationsDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReglesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_3_0,
            	    						"org.xtext.example.mydsl.RulesUNO.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReglesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRegles"


    // $ANTLR start "entryRuleAffectation"
    // InternalRulesUNO.g:464:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalRulesUNO.g:464:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalRulesUNO.g:465:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalRulesUNO.g:471:1: ruleAffectation returns [EObject current=null] : ( ( (lv_attribut_0_0= ruleAttribut ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpressionNumerique ) ) otherlv_3= ';' ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attribut_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:477:2: ( ( ( (lv_attribut_0_0= ruleAttribut ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpressionNumerique ) ) otherlv_3= ';' ) )
            // InternalRulesUNO.g:478:2: ( ( (lv_attribut_0_0= ruleAttribut ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpressionNumerique ) ) otherlv_3= ';' )
            {
            // InternalRulesUNO.g:478:2: ( ( (lv_attribut_0_0= ruleAttribut ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpressionNumerique ) ) otherlv_3= ';' )
            // InternalRulesUNO.g:479:3: ( (lv_attribut_0_0= ruleAttribut ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpressionNumerique ) ) otherlv_3= ';'
            {
            // InternalRulesUNO.g:479:3: ( (lv_attribut_0_0= ruleAttribut ) )
            // InternalRulesUNO.g:480:4: (lv_attribut_0_0= ruleAttribut )
            {
            // InternalRulesUNO.g:480:4: (lv_attribut_0_0= ruleAttribut )
            // InternalRulesUNO.g:481:5: lv_attribut_0_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getAttributAttributParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_attribut_0_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"attribut",
            						lv_attribut_0_0,
            						"org.xtext.example.mydsl.RulesUNO.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
            		
            // InternalRulesUNO.g:502:3: ( (lv_expression_2_0= ruleExpressionNumerique ) )
            // InternalRulesUNO.g:503:4: (lv_expression_2_0= ruleExpressionNumerique )
            {
            // InternalRulesUNO.g:503:4: (lv_expression_2_0= ruleExpressionNumerique )
            // InternalRulesUNO.g:504:5: lv_expression_2_0= ruleExpressionNumerique
            {

            					newCompositeNode(grammarAccess.getAffectationAccess().getExpressionExpressionNumeriqueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_2_0=ruleExpressionNumerique();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectationRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.example.mydsl.RulesUNO.ExpressionNumerique");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAffectationAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleInstruction"
    // InternalRulesUNO.g:529:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalRulesUNO.g:529:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalRulesUNO.g:530:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalRulesUNO.g:536:1: ruleInstruction returns [EObject current=null] : (this_InstructionsBloc_0= ruleInstructionsBloc | (this_Action_1= ruleAction otherlv_2= ';' ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_InstructionsBloc_0 = null;

        EObject this_Action_1 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:542:2: ( (this_InstructionsBloc_0= ruleInstructionsBloc | (this_Action_1= ruleAction otherlv_2= ';' ) ) )
            // InternalRulesUNO.g:543:2: (this_InstructionsBloc_0= ruleInstructionsBloc | (this_Action_1= ruleAction otherlv_2= ';' ) )
            {
            // InternalRulesUNO.g:543:2: (this_InstructionsBloc_0= ruleInstructionsBloc | (this_Action_1= ruleAction otherlv_2= ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==32||(LA7_0>=37 && LA7_0<=42)||(LA7_0>=65 && LA7_0<=68)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRulesUNO.g:544:3: this_InstructionsBloc_0= ruleInstructionsBloc
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getInstructionsBlocParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstructionsBloc_0=ruleInstructionsBloc();

                    state._fsp--;


                    			current = this_InstructionsBloc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:553:3: (this_Action_1= ruleAction otherlv_2= ';' )
                    {
                    // InternalRulesUNO.g:553:3: (this_Action_1= ruleAction otherlv_2= ';' )
                    // InternalRulesUNO.g:554:4: this_Action_1= ruleAction otherlv_2= ';'
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getActionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_Action_1=ruleAction();

                    state._fsp--;


                    				current = this_Action_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getInstructionAccess().getSemicolonKeyword_1_1());
                    			

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInstructionsBloc"
    // InternalRulesUNO.g:571:1: entryRuleInstructionsBloc returns [EObject current=null] : iv_ruleInstructionsBloc= ruleInstructionsBloc EOF ;
    public final EObject entryRuleInstructionsBloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionsBloc = null;


        try {
            // InternalRulesUNO.g:571:57: (iv_ruleInstructionsBloc= ruleInstructionsBloc EOF )
            // InternalRulesUNO.g:572:2: iv_ruleInstructionsBloc= ruleInstructionsBloc EOF
            {
             newCompositeNode(grammarAccess.getInstructionsBlocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructionsBloc=ruleInstructionsBloc();

            state._fsp--;

             current =iv_ruleInstructionsBloc; 
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
    // $ANTLR end "entryRuleInstructionsBloc"


    // $ANTLR start "ruleInstructionsBloc"
    // InternalRulesUNO.g:578:1: ruleInstructionsBloc returns [EObject current=null] : this_InstructionChoix_0= ruleInstructionChoix ;
    public final EObject ruleInstructionsBloc() throws RecognitionException {
        EObject current = null;

        EObject this_InstructionChoix_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:584:2: (this_InstructionChoix_0= ruleInstructionChoix )
            // InternalRulesUNO.g:585:2: this_InstructionChoix_0= ruleInstructionChoix
            {

            		newCompositeNode(grammarAccess.getInstructionsBlocAccess().getInstructionChoixParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_InstructionChoix_0=ruleInstructionChoix();

            state._fsp--;


            		current = this_InstructionChoix_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleInstructionsBloc"


    // $ANTLR start "entryRuleInstructionChoix"
    // InternalRulesUNO.g:596:1: entryRuleInstructionChoix returns [EObject current=null] : iv_ruleInstructionChoix= ruleInstructionChoix EOF ;
    public final EObject entryRuleInstructionChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructionChoix = null;


        try {
            // InternalRulesUNO.g:596:57: (iv_ruleInstructionChoix= ruleInstructionChoix EOF )
            // InternalRulesUNO.g:597:2: iv_ruleInstructionChoix= ruleInstructionChoix EOF
            {
             newCompositeNode(grammarAccess.getInstructionChoixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructionChoix=ruleInstructionChoix();

            state._fsp--;

             current =iv_ruleInstructionChoix; 
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
    // $ANTLR end "entryRuleInstructionChoix"


    // $ANTLR start "ruleInstructionChoix"
    // InternalRulesUNO.g:603:1: ruleInstructionChoix returns [EObject current=null] : (otherlv_0= 'choix' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleInstructionChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_instructions_2_0 = null;

        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:609:2: ( (otherlv_0= 'choix' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' ) )
            // InternalRulesUNO.g:610:2: (otherlv_0= 'choix' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' )
            {
            // InternalRulesUNO.g:610:2: (otherlv_0= 'choix' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}' )
            // InternalRulesUNO.g:611:3: otherlv_0= 'choix' otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) ) ( (lv_instructions_3_0= ruleInstruction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstructionChoixAccess().getChoixKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionChoixAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRulesUNO.g:619:3: ( (lv_instructions_2_0= ruleInstruction ) )
            // InternalRulesUNO.g:620:4: (lv_instructions_2_0= ruleInstruction )
            {
            // InternalRulesUNO.g:620:4: (lv_instructions_2_0= ruleInstruction )
            // InternalRulesUNO.g:621:5: lv_instructions_2_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getInstructionChoixAccess().getInstructionsInstructionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_instructions_2_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstructionChoixRule());
            					}
            					add(
            						current,
            						"instructions",
            						lv_instructions_2_0,
            						"org.xtext.example.mydsl.RulesUNO.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRulesUNO.g:638:3: ( (lv_instructions_3_0= ruleInstruction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||LA8_0==32||(LA8_0>=37 && LA8_0<=42)||(LA8_0>=65 && LA8_0<=68)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRulesUNO.g:639:4: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // InternalRulesUNO.g:639:4: (lv_instructions_3_0= ruleInstruction )
            	    // InternalRulesUNO.g:640:5: lv_instructions_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getInstructionChoixAccess().getInstructionsInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstructionChoixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_3_0,
            	    						"org.xtext.example.mydsl.RulesUNO.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInstructionChoixAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInstructionChoix"


    // $ANTLR start "entryRuleVariableNumerique"
    // InternalRulesUNO.g:665:1: entryRuleVariableNumerique returns [EObject current=null] : iv_ruleVariableNumerique= ruleVariableNumerique EOF ;
    public final EObject entryRuleVariableNumerique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableNumerique = null;


        try {
            // InternalRulesUNO.g:665:58: (iv_ruleVariableNumerique= ruleVariableNumerique EOF )
            // InternalRulesUNO.g:666:2: iv_ruleVariableNumerique= ruleVariableNumerique EOF
            {
             newCompositeNode(grammarAccess.getVariableNumeriqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableNumerique=ruleVariableNumerique();

            state._fsp--;

             current =iv_ruleVariableNumerique; 
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
    // $ANTLR end "entryRuleVariableNumerique"


    // $ANTLR start "ruleVariableNumerique"
    // InternalRulesUNO.g:672:1: ruleVariableNumerique returns [EObject current=null] : ( (lv_var_0_0= ruleAttribut ) ) ;
    public final EObject ruleVariableNumerique() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:678:2: ( ( (lv_var_0_0= ruleAttribut ) ) )
            // InternalRulesUNO.g:679:2: ( (lv_var_0_0= ruleAttribut ) )
            {
            // InternalRulesUNO.g:679:2: ( (lv_var_0_0= ruleAttribut ) )
            // InternalRulesUNO.g:680:3: (lv_var_0_0= ruleAttribut )
            {
            // InternalRulesUNO.g:680:3: (lv_var_0_0= ruleAttribut )
            // InternalRulesUNO.g:681:4: lv_var_0_0= ruleAttribut
            {

            				newCompositeNode(grammarAccess.getVariableNumeriqueAccess().getVarAttributParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_var_0_0=ruleAttribut();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariableNumeriqueRule());
            				}
            				set(
            					current,
            					"var",
            					lv_var_0_0,
            					"org.xtext.example.mydsl.RulesUNO.Attribut");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleVariableNumerique"


    // $ANTLR start "entryRuleVariableBooleene"
    // InternalRulesUNO.g:701:1: entryRuleVariableBooleene returns [EObject current=null] : iv_ruleVariableBooleene= ruleVariableBooleene EOF ;
    public final EObject entryRuleVariableBooleene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBooleene = null;


        try {
            // InternalRulesUNO.g:701:57: (iv_ruleVariableBooleene= ruleVariableBooleene EOF )
            // InternalRulesUNO.g:702:2: iv_ruleVariableBooleene= ruleVariableBooleene EOF
            {
             newCompositeNode(grammarAccess.getVariableBooleeneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBooleene=ruleVariableBooleene();

            state._fsp--;

             current =iv_ruleVariableBooleene; 
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
    // $ANTLR end "entryRuleVariableBooleene"


    // $ANTLR start "ruleVariableBooleene"
    // InternalRulesUNO.g:708:1: ruleVariableBooleene returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariante ) ) | ( (lv_action_1_0= ruleAction ) ) ) ;
    public final EObject ruleVariableBooleene() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_var_0_0 = null;

        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:714:2: ( ( ( (lv_var_0_0= ruleVariante ) ) | ( (lv_action_1_0= ruleAction ) ) ) )
            // InternalRulesUNO.g:715:2: ( ( (lv_var_0_0= ruleVariante ) ) | ( (lv_action_1_0= ruleAction ) ) )
            {
            // InternalRulesUNO.g:715:2: ( ( (lv_var_0_0= ruleVariante ) ) | ( (lv_action_1_0= ruleAction ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16||(LA9_0>=24 && LA9_0<=31)) ) {
                alt9=1;
            }
            else if ( (LA9_0==32||(LA9_0>=37 && LA9_0<=42)||(LA9_0>=65 && LA9_0<=68)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRulesUNO.g:716:3: ( (lv_var_0_0= ruleVariante ) )
                    {
                    // InternalRulesUNO.g:716:3: ( (lv_var_0_0= ruleVariante ) )
                    // InternalRulesUNO.g:717:4: (lv_var_0_0= ruleVariante )
                    {
                    // InternalRulesUNO.g:717:4: (lv_var_0_0= ruleVariante )
                    // InternalRulesUNO.g:718:5: lv_var_0_0= ruleVariante
                    {

                    					newCompositeNode(grammarAccess.getVariableBooleeneAccess().getVarVarianteParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariante();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableBooleeneRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"org.xtext.example.mydsl.RulesUNO.Variante");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:736:3: ( (lv_action_1_0= ruleAction ) )
                    {
                    // InternalRulesUNO.g:736:3: ( (lv_action_1_0= ruleAction ) )
                    // InternalRulesUNO.g:737:4: (lv_action_1_0= ruleAction )
                    {
                    // InternalRulesUNO.g:737:4: (lv_action_1_0= ruleAction )
                    // InternalRulesUNO.g:738:5: lv_action_1_0= ruleAction
                    {

                    					newCompositeNode(grammarAccess.getVariableBooleeneAccess().getActionActionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_action_1_0=ruleAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableBooleeneRule());
                    					}
                    					set(
                    						current,
                    						"action",
                    						lv_action_1_0,
                    						"org.xtext.example.mydsl.RulesUNO.Action");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleVariableBooleene"


    // $ANTLR start "entryRuleVariante"
    // InternalRulesUNO.g:759:1: entryRuleVariante returns [String current=null] : iv_ruleVariante= ruleVariante EOF ;
    public final String entryRuleVariante() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariante = null;


        try {
            // InternalRulesUNO.g:759:48: (iv_ruleVariante= ruleVariante EOF )
            // InternalRulesUNO.g:760:2: iv_ruleVariante= ruleVariante EOF
            {
             newCompositeNode(grammarAccess.getVarianteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariante=ruleVariante();

            state._fsp--;

             current =iv_ruleVariante.getText(); 
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
    // $ANTLR end "entryRuleVariante"


    // $ANTLR start "ruleVariante"
    // InternalRulesUNO.g:766:1: ruleVariante returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BASE' | kw= 'DEUX_JOUEURS' | kw= 'UNO_CHALENGE' | kw= 'EQUIPE' | kw= 'CARTES_IDENTIQUES' | kw= 'SUITES' | kw= 'ZERO_ECHANGE' | kw= 'ZERO_TOURNANT' | kw= 'ZERO_QUESTION' ) ;
    public final AntlrDatatypeRuleToken ruleVariante() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:772:2: ( (kw= 'BASE' | kw= 'DEUX_JOUEURS' | kw= 'UNO_CHALENGE' | kw= 'EQUIPE' | kw= 'CARTES_IDENTIQUES' | kw= 'SUITES' | kw= 'ZERO_ECHANGE' | kw= 'ZERO_TOURNANT' | kw= 'ZERO_QUESTION' ) )
            // InternalRulesUNO.g:773:2: (kw= 'BASE' | kw= 'DEUX_JOUEURS' | kw= 'UNO_CHALENGE' | kw= 'EQUIPE' | kw= 'CARTES_IDENTIQUES' | kw= 'SUITES' | kw= 'ZERO_ECHANGE' | kw= 'ZERO_TOURNANT' | kw= 'ZERO_QUESTION' )
            {
            // InternalRulesUNO.g:773:2: (kw= 'BASE' | kw= 'DEUX_JOUEURS' | kw= 'UNO_CHALENGE' | kw= 'EQUIPE' | kw= 'CARTES_IDENTIQUES' | kw= 'SUITES' | kw= 'ZERO_ECHANGE' | kw= 'ZERO_TOURNANT' | kw= 'ZERO_QUESTION' )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 16:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            case 28:
                {
                alt10=6;
                }
                break;
            case 29:
                {
                alt10=7;
                }
                break;
            case 30:
                {
                alt10=8;
                }
                break;
            case 31:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRulesUNO.g:774:3: kw= 'BASE'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getBASEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:780:3: kw= 'DEUX_JOUEURS'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getDEUX_JOUEURSKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:786:3: kw= 'UNO_CHALENGE'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getUNO_CHALENGEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:792:3: kw= 'EQUIPE'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getEQUIPEKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:798:3: kw= 'CARTES_IDENTIQUES'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getCARTES_IDENTIQUESKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:804:3: kw= 'SUITES'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getSUITESKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRulesUNO.g:810:3: kw= 'ZERO_ECHANGE'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getZERO_ECHANGEKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRulesUNO.g:816:3: kw= 'ZERO_TOURNANT'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getZERO_TOURNANTKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRulesUNO.g:822:3: kw= 'ZERO_QUESTION'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVarianteAccess().getZERO_QUESTIONKeyword_8());
                    		

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
    // $ANTLR end "ruleVariante"


    // $ANTLR start "entryRuleManche"
    // InternalRulesUNO.g:831:1: entryRuleManche returns [String current=null] : iv_ruleManche= ruleManche EOF ;
    public final String entryRuleManche() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleManche = null;


        try {
            // InternalRulesUNO.g:831:46: (iv_ruleManche= ruleManche EOF )
            // InternalRulesUNO.g:832:2: iv_ruleManche= ruleManche EOF
            {
             newCompositeNode(grammarAccess.getMancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManche=ruleManche();

            state._fsp--;

             current =iv_ruleManche.getText(); 
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
    // $ANTLR end "entryRuleManche"


    // $ANTLR start "ruleManche"
    // InternalRulesUNO.g:838:1: ruleManche returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'MANCHE' ;
    public final AntlrDatatypeRuleToken ruleManche() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:844:2: (kw= 'MANCHE' )
            // InternalRulesUNO.g:845:2: kw= 'MANCHE'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMancheAccess().getMANCHEKeyword());
            	

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
    // $ANTLR end "ruleManche"


    // $ANTLR start "entryRuleAttributManche"
    // InternalRulesUNO.g:853:1: entryRuleAttributManche returns [String current=null] : iv_ruleAttributManche= ruleAttributManche EOF ;
    public final String entryRuleAttributManche() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributManche = null;


        try {
            // InternalRulesUNO.g:853:54: (iv_ruleAttributManche= ruleAttributManche EOF )
            // InternalRulesUNO.g:854:2: iv_ruleAttributManche= ruleAttributManche EOF
            {
             newCompositeNode(grammarAccess.getAttributMancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributManche=ruleAttributManche();

            state._fsp--;

             current =iv_ruleAttributManche.getText(); 
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
    // $ANTLR end "entryRuleAttributManche"


    // $ANTLR start "ruleAttributManche"
    // InternalRulesUNO.g:860:1: ruleAttributManche returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NB_JOUEUR' | kw= 'NB_PARTICIPANT' ) ;
    public final AntlrDatatypeRuleToken ruleAttributManche() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:866:2: ( (kw= 'NB_JOUEUR' | kw= 'NB_PARTICIPANT' ) )
            // InternalRulesUNO.g:867:2: (kw= 'NB_JOUEUR' | kw= 'NB_PARTICIPANT' )
            {
            // InternalRulesUNO.g:867:2: (kw= 'NB_JOUEUR' | kw= 'NB_PARTICIPANT' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRulesUNO.g:868:3: kw= 'NB_JOUEUR'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributMancheAccess().getNB_JOUEURKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:874:3: kw= 'NB_PARTICIPANT'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributMancheAccess().getNB_PARTICIPANTKeyword_1());
                    		

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
    // $ANTLR end "ruleAttributManche"


    // $ANTLR start "entryRuleActionManche"
    // InternalRulesUNO.g:883:1: entryRuleActionManche returns [String current=null] : iv_ruleActionManche= ruleActionManche EOF ;
    public final String entryRuleActionManche() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionManche = null;


        try {
            // InternalRulesUNO.g:883:52: (iv_ruleActionManche= ruleActionManche EOF )
            // InternalRulesUNO.g:884:2: iv_ruleActionManche= ruleActionManche EOF
            {
             newCompositeNode(grammarAccess.getActionMancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionManche=ruleActionManche();

            state._fsp--;

             current =iv_ruleActionManche.getText(); 
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
    // $ANTLR end "entryRuleActionManche"


    // $ANTLR start "ruleActionManche"
    // InternalRulesUNO.g:890:1: ruleActionManche returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FINIR' | kw= 'NOUVELLE' ) ;
    public final AntlrDatatypeRuleToken ruleActionManche() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:896:2: ( (kw= 'FINIR' | kw= 'NOUVELLE' ) )
            // InternalRulesUNO.g:897:2: (kw= 'FINIR' | kw= 'NOUVELLE' )
            {
            // InternalRulesUNO.g:897:2: (kw= 'FINIR' | kw= 'NOUVELLE' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            else if ( (LA12_0==36) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRulesUNO.g:898:3: kw= 'FINIR'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionMancheAccess().getFINIRKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:904:3: kw= 'NOUVELLE'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionMancheAccess().getNOUVELLEKeyword_1());
                    		

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
    // $ANTLR end "ruleActionManche"


    // $ANTLR start "entryRuleJoueur"
    // InternalRulesUNO.g:913:1: entryRuleJoueur returns [String current=null] : iv_ruleJoueur= ruleJoueur EOF ;
    public final String entryRuleJoueur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJoueur = null;


        try {
            // InternalRulesUNO.g:913:46: (iv_ruleJoueur= ruleJoueur EOF )
            // InternalRulesUNO.g:914:2: iv_ruleJoueur= ruleJoueur EOF
            {
             newCompositeNode(grammarAccess.getJoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoueur=ruleJoueur();

            state._fsp--;

             current =iv_ruleJoueur.getText(); 
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
    // $ANTLR end "entryRuleJoueur"


    // $ANTLR start "ruleJoueur"
    // InternalRulesUNO.g:920:1: ruleJoueur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'JOUEUR_COURRANT' | kw= 'JOUEUR_SUIVANT' | kw= 'JOUEUR_TOUS' | kw= 'JOUEUR_AUTRE' | kw= 'JOUEUR_EXISTE' | kw= 'JOUEUR_SELECTIONNE' ) ;
    public final AntlrDatatypeRuleToken ruleJoueur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:926:2: ( (kw= 'JOUEUR_COURRANT' | kw= 'JOUEUR_SUIVANT' | kw= 'JOUEUR_TOUS' | kw= 'JOUEUR_AUTRE' | kw= 'JOUEUR_EXISTE' | kw= 'JOUEUR_SELECTIONNE' ) )
            // InternalRulesUNO.g:927:2: (kw= 'JOUEUR_COURRANT' | kw= 'JOUEUR_SUIVANT' | kw= 'JOUEUR_TOUS' | kw= 'JOUEUR_AUTRE' | kw= 'JOUEUR_EXISTE' | kw= 'JOUEUR_SELECTIONNE' )
            {
            // InternalRulesUNO.g:927:2: (kw= 'JOUEUR_COURRANT' | kw= 'JOUEUR_SUIVANT' | kw= 'JOUEUR_TOUS' | kw= 'JOUEUR_AUTRE' | kw= 'JOUEUR_EXISTE' | kw= 'JOUEUR_SELECTIONNE' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            case 40:
                {
                alt13=4;
                }
                break;
            case 41:
                {
                alt13=5;
                }
                break;
            case 42:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRulesUNO.g:928:3: kw= 'JOUEUR_COURRANT'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJoueurAccess().getJOUEUR_COURRANTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:934:3: kw= 'JOUEUR_SUIVANT'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJoueurAccess().getJOUEUR_SUIVANTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:940:3: kw= 'JOUEUR_TOUS'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJoueurAccess().getJOUEUR_TOUSKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:946:3: kw= 'JOUEUR_AUTRE'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJoueurAccess().getJOUEUR_AUTREKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:952:3: kw= 'JOUEUR_EXISTE'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJoueurAccess().getJOUEUR_EXISTEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:958:3: kw= 'JOUEUR_SELECTIONNE'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJoueurAccess().getJOUEUR_SELECTIONNEKeyword_5());
                    		

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
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "entryRuleActionJoueur"
    // InternalRulesUNO.g:967:1: entryRuleActionJoueur returns [String current=null] : iv_ruleActionJoueur= ruleActionJoueur EOF ;
    public final String entryRuleActionJoueur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionJoueur = null;


        try {
            // InternalRulesUNO.g:967:52: (iv_ruleActionJoueur= ruleActionJoueur EOF )
            // InternalRulesUNO.g:968:2: iv_ruleActionJoueur= ruleActionJoueur EOF
            {
             newCompositeNode(grammarAccess.getActionJoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionJoueur=ruleActionJoueur();

            state._fsp--;

             current =iv_ruleActionJoueur.getText(); 
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
    // $ANTLR end "entryRuleActionJoueur"


    // $ANTLR start "ruleActionJoueur"
    // InternalRulesUNO.g:974:1: ruleActionJoueur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CRIER_UNO' | kw= 'JOUER_CARTE_BASE' | kw= 'JOUER_CARTE_JOKER' | kw= 'JOUER_CARTE_INVERSER_SENS' | kw= 'JOUER_CARTE_PASSE_TON_TOUR' | kw= 'JOUER_CARTE_PLUS_2' | kw= 'JOUER_CARTE_PLUS_4' | kw= 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' | kw= 'JOUER_CARTE_ZERO' | kw= 'JOUER_SUITE_DE_CARTES' | kw= 'POSER_QUESTION' | kw= 'REJOUER' | kw= 'PASSER_SON_TOUR' | kw= 'CHANGER_COULEUR' | kw= 'CHOISIR_COULEUR' | kw= 'PIOCHER_2_CARTES' | kw= 'PIOCHER_4_CARTES' | kw= 'INVERSER_SENS' | kw= 'DONNER_CARTES_AU_JOUEUR_SUIVANT' | kw= 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' | kw= 'REMARQUER_ERREUR_UNO' ) ;
    public final AntlrDatatypeRuleToken ruleActionJoueur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:980:2: ( (kw= 'CRIER_UNO' | kw= 'JOUER_CARTE_BASE' | kw= 'JOUER_CARTE_JOKER' | kw= 'JOUER_CARTE_INVERSER_SENS' | kw= 'JOUER_CARTE_PASSE_TON_TOUR' | kw= 'JOUER_CARTE_PLUS_2' | kw= 'JOUER_CARTE_PLUS_4' | kw= 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' | kw= 'JOUER_CARTE_ZERO' | kw= 'JOUER_SUITE_DE_CARTES' | kw= 'POSER_QUESTION' | kw= 'REJOUER' | kw= 'PASSER_SON_TOUR' | kw= 'CHANGER_COULEUR' | kw= 'CHOISIR_COULEUR' | kw= 'PIOCHER_2_CARTES' | kw= 'PIOCHER_4_CARTES' | kw= 'INVERSER_SENS' | kw= 'DONNER_CARTES_AU_JOUEUR_SUIVANT' | kw= 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' | kw= 'REMARQUER_ERREUR_UNO' ) )
            // InternalRulesUNO.g:981:2: (kw= 'CRIER_UNO' | kw= 'JOUER_CARTE_BASE' | kw= 'JOUER_CARTE_JOKER' | kw= 'JOUER_CARTE_INVERSER_SENS' | kw= 'JOUER_CARTE_PASSE_TON_TOUR' | kw= 'JOUER_CARTE_PLUS_2' | kw= 'JOUER_CARTE_PLUS_4' | kw= 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' | kw= 'JOUER_CARTE_ZERO' | kw= 'JOUER_SUITE_DE_CARTES' | kw= 'POSER_QUESTION' | kw= 'REJOUER' | kw= 'PASSER_SON_TOUR' | kw= 'CHANGER_COULEUR' | kw= 'CHOISIR_COULEUR' | kw= 'PIOCHER_2_CARTES' | kw= 'PIOCHER_4_CARTES' | kw= 'INVERSER_SENS' | kw= 'DONNER_CARTES_AU_JOUEUR_SUIVANT' | kw= 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' | kw= 'REMARQUER_ERREUR_UNO' )
            {
            // InternalRulesUNO.g:981:2: (kw= 'CRIER_UNO' | kw= 'JOUER_CARTE_BASE' | kw= 'JOUER_CARTE_JOKER' | kw= 'JOUER_CARTE_INVERSER_SENS' | kw= 'JOUER_CARTE_PASSE_TON_TOUR' | kw= 'JOUER_CARTE_PLUS_2' | kw= 'JOUER_CARTE_PLUS_4' | kw= 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' | kw= 'JOUER_CARTE_ZERO' | kw= 'JOUER_SUITE_DE_CARTES' | kw= 'POSER_QUESTION' | kw= 'REJOUER' | kw= 'PASSER_SON_TOUR' | kw= 'CHANGER_COULEUR' | kw= 'CHOISIR_COULEUR' | kw= 'PIOCHER_2_CARTES' | kw= 'PIOCHER_4_CARTES' | kw= 'INVERSER_SENS' | kw= 'DONNER_CARTES_AU_JOUEUR_SUIVANT' | kw= 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' | kw= 'REMARQUER_ERREUR_UNO' )
            int alt14=21;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            case 46:
                {
                alt14=4;
                }
                break;
            case 47:
                {
                alt14=5;
                }
                break;
            case 48:
                {
                alt14=6;
                }
                break;
            case 49:
                {
                alt14=7;
                }
                break;
            case 50:
                {
                alt14=8;
                }
                break;
            case 51:
                {
                alt14=9;
                }
                break;
            case 52:
                {
                alt14=10;
                }
                break;
            case 53:
                {
                alt14=11;
                }
                break;
            case 54:
                {
                alt14=12;
                }
                break;
            case 55:
                {
                alt14=13;
                }
                break;
            case 56:
                {
                alt14=14;
                }
                break;
            case 57:
                {
                alt14=15;
                }
                break;
            case 58:
                {
                alt14=16;
                }
                break;
            case 59:
                {
                alt14=17;
                }
                break;
            case 60:
                {
                alt14=18;
                }
                break;
            case 61:
                {
                alt14=19;
                }
                break;
            case 62:
                {
                alt14=20;
                }
                break;
            case 63:
                {
                alt14=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRulesUNO.g:982:3: kw= 'CRIER_UNO'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getCRIER_UNOKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:988:3: kw= 'JOUER_CARTE_BASE'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_CARTE_BASEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:994:3: kw= 'JOUER_CARTE_JOKER'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_CARTE_JOKERKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1000:3: kw= 'JOUER_CARTE_INVERSER_SENS'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_CARTE_INVERSER_SENSKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:1006:3: kw= 'JOUER_CARTE_PASSE_TON_TOUR'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PASSE_TON_TOURKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:1012:3: kw= 'JOUER_CARTE_PLUS_2'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PLUS_2Keyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRulesUNO.g:1018:3: kw= 'JOUER_CARTE_PLUS_4'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PLUS_4Keyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRulesUNO.g:1024:3: kw= 'JOUER_PLUSIEURS_CARTES_IDENTIQUES'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_PLUSIEURS_CARTES_IDENTIQUESKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRulesUNO.g:1030:3: kw= 'JOUER_CARTE_ZERO'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_CARTE_ZEROKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRulesUNO.g:1036:3: kw= 'JOUER_SUITE_DE_CARTES'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getJOUER_SUITE_DE_CARTESKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRulesUNO.g:1042:3: kw= 'POSER_QUESTION'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getPOSER_QUESTIONKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalRulesUNO.g:1048:3: kw= 'REJOUER'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getREJOUERKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalRulesUNO.g:1054:3: kw= 'PASSER_SON_TOUR'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getPASSER_SON_TOURKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalRulesUNO.g:1060:3: kw= 'CHANGER_COULEUR'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getCHANGER_COULEURKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalRulesUNO.g:1066:3: kw= 'CHOISIR_COULEUR'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getCHOISIR_COULEURKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalRulesUNO.g:1072:3: kw= 'PIOCHER_2_CARTES'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getPIOCHER_2_CARTESKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalRulesUNO.g:1078:3: kw= 'PIOCHER_4_CARTES'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getPIOCHER_4_CARTESKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalRulesUNO.g:1084:3: kw= 'INVERSER_SENS'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getINVERSER_SENSKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalRulesUNO.g:1090:3: kw= 'DONNER_CARTES_AU_JOUEUR_SUIVANT'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getDONNER_CARTES_AU_JOUEUR_SUIVANTKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalRulesUNO.g:1096:3: kw= 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getECHANGER_JEU_AVEC_UN_ADVERSAIREKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalRulesUNO.g:1102:3: kw= 'REMARQUER_ERREUR_UNO'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionJoueurAccess().getREMARQUER_ERREUR_UNOKeyword_20());
                    		

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
    // $ANTLR end "ruleActionJoueur"


    // $ANTLR start "entryRuleAttributJoueur"
    // InternalRulesUNO.g:1111:1: entryRuleAttributJoueur returns [String current=null] : iv_ruleAttributJoueur= ruleAttributJoueur EOF ;
    public final String entryRuleAttributJoueur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributJoueur = null;


        try {
            // InternalRulesUNO.g:1111:54: (iv_ruleAttributJoueur= ruleAttributJoueur EOF )
            // InternalRulesUNO.g:1112:2: iv_ruleAttributJoueur= ruleAttributJoueur EOF
            {
             newCompositeNode(grammarAccess.getAttributJoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributJoueur=ruleAttributJoueur();

            state._fsp--;

             current =iv_ruleAttributJoueur.getText(); 
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
    // $ANTLR end "entryRuleAttributJoueur"


    // $ANTLR start "ruleAttributJoueur"
    // InternalRulesUNO.g:1118:1: ruleAttributJoueur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NB_CARTES' ;
    public final AntlrDatatypeRuleToken ruleAttributJoueur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:1124:2: (kw= 'NB_CARTES' )
            // InternalRulesUNO.g:1125:2: kw= 'NB_CARTES'
            {
            kw=(Token)match(input,64,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAttributJoueurAccess().getNB_CARTESKeyword());
            	

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
    // $ANTLR end "ruleAttributJoueur"


    // $ANTLR start "entryRuleParticipant"
    // InternalRulesUNO.g:1133:1: entryRuleParticipant returns [String current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final String entryRuleParticipant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParticipant = null;


        try {
            // InternalRulesUNO.g:1133:51: (iv_ruleParticipant= ruleParticipant EOF )
            // InternalRulesUNO.g:1134:2: iv_ruleParticipant= ruleParticipant EOF
            {
             newCompositeNode(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;

             current =iv_ruleParticipant.getText(); 
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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalRulesUNO.g:1140:1: ruleParticipant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PARTICIPANT_COURRANT' | kw= 'PARTICIPANT_EXISTE' | kw= 'PARTICIPANT_SELECTIONNE' | kw= 'PARTICIPANT_MIN_POINTS' ) ;
    public final AntlrDatatypeRuleToken ruleParticipant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:1146:2: ( (kw= 'PARTICIPANT_COURRANT' | kw= 'PARTICIPANT_EXISTE' | kw= 'PARTICIPANT_SELECTIONNE' | kw= 'PARTICIPANT_MIN_POINTS' ) )
            // InternalRulesUNO.g:1147:2: (kw= 'PARTICIPANT_COURRANT' | kw= 'PARTICIPANT_EXISTE' | kw= 'PARTICIPANT_SELECTIONNE' | kw= 'PARTICIPANT_MIN_POINTS' )
            {
            // InternalRulesUNO.g:1147:2: (kw= 'PARTICIPANT_COURRANT' | kw= 'PARTICIPANT_EXISTE' | kw= 'PARTICIPANT_SELECTIONNE' | kw= 'PARTICIPANT_MIN_POINTS' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt15=1;
                }
                break;
            case 66:
                {
                alt15=2;
                }
                break;
            case 67:
                {
                alt15=3;
                }
                break;
            case 68:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRulesUNO.g:1148:3: kw= 'PARTICIPANT_COURRANT'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParticipantAccess().getPARTICIPANT_COURRANTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1154:3: kw= 'PARTICIPANT_EXISTE'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParticipantAccess().getPARTICIPANT_EXISTEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1160:3: kw= 'PARTICIPANT_SELECTIONNE'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParticipantAccess().getPARTICIPANT_SELECTIONNEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1166:3: kw= 'PARTICIPANT_MIN_POINTS'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getParticipantAccess().getPARTICIPANT_MIN_POINTSKeyword_3());
                    		

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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleActionParticipant"
    // InternalRulesUNO.g:1175:1: entryRuleActionParticipant returns [String current=null] : iv_ruleActionParticipant= ruleActionParticipant EOF ;
    public final String entryRuleActionParticipant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionParticipant = null;


        try {
            // InternalRulesUNO.g:1175:57: (iv_ruleActionParticipant= ruleActionParticipant EOF )
            // InternalRulesUNO.g:1176:2: iv_ruleActionParticipant= ruleActionParticipant EOF
            {
             newCompositeNode(grammarAccess.getActionParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionParticipant=ruleActionParticipant();

            state._fsp--;

             current =iv_ruleActionParticipant.getText(); 
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
    // $ANTLR end "entryRuleActionParticipant"


    // $ANTLR start "ruleActionParticipant"
    // InternalRulesUNO.g:1182:1: ruleActionParticipant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'GAGNER' | kw= 'PERDRE' | kw= 'ETRE_ELIMINE' ) ;
    public final AntlrDatatypeRuleToken ruleActionParticipant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:1188:2: ( (kw= 'GAGNER' | kw= 'PERDRE' | kw= 'ETRE_ELIMINE' ) )
            // InternalRulesUNO.g:1189:2: (kw= 'GAGNER' | kw= 'PERDRE' | kw= 'ETRE_ELIMINE' )
            {
            // InternalRulesUNO.g:1189:2: (kw= 'GAGNER' | kw= 'PERDRE' | kw= 'ETRE_ELIMINE' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt16=1;
                }
                break;
            case 70:
                {
                alt16=2;
                }
                break;
            case 71:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRulesUNO.g:1190:3: kw= 'GAGNER'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionParticipantAccess().getGAGNERKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1196:3: kw= 'PERDRE'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionParticipantAccess().getPERDREKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1202:3: kw= 'ETRE_ELIMINE'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionParticipantAccess().getETRE_ELIMINEKeyword_2());
                    		

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
    // $ANTLR end "ruleActionParticipant"


    // $ANTLR start "entryRuleAttributParticipant"
    // InternalRulesUNO.g:1211:1: entryRuleAttributParticipant returns [String current=null] : iv_ruleAttributParticipant= ruleAttributParticipant EOF ;
    public final String entryRuleAttributParticipant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributParticipant = null;


        try {
            // InternalRulesUNO.g:1211:59: (iv_ruleAttributParticipant= ruleAttributParticipant EOF )
            // InternalRulesUNO.g:1212:2: iv_ruleAttributParticipant= ruleAttributParticipant EOF
            {
             newCompositeNode(grammarAccess.getAttributParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributParticipant=ruleAttributParticipant();

            state._fsp--;

             current =iv_ruleAttributParticipant.getText(); 
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
    // $ANTLR end "entryRuleAttributParticipant"


    // $ANTLR start "ruleAttributParticipant"
    // InternalRulesUNO.g:1218:1: ruleAttributParticipant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'POINTS' ;
    public final AntlrDatatypeRuleToken ruleAttributParticipant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:1224:2: (kw= 'POINTS' )
            // InternalRulesUNO.g:1225:2: kw= 'POINTS'
            {
            kw=(Token)match(input,72,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAttributParticipantAccess().getPOINTSKeyword());
            	

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
    // $ANTLR end "ruleAttributParticipant"


    // $ANTLR start "entryRuleAction"
    // InternalRulesUNO.g:1233:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRulesUNO.g:1233:47: (iv_ruleAction= ruleAction EOF )
            // InternalRulesUNO.g:1234:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRulesUNO.g:1240:1: ruleAction returns [EObject current=null] : ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_action_2_0= ruleActionJoueur ) ) otherlv_3= '()' ) | ( ( (lv_id_4_0= ruleManche ) ) otherlv_5= '.' ( (lv_action_6_0= ruleActionManche ) ) otherlv_7= '()' ) | ( ( (lv_id_8_0= ruleParticipant ) ) otherlv_9= '.' ( (lv_action_10_0= ruleActionParticipant ) ) otherlv_11= '()' ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_action_2_0 = null;

        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_action_6_0 = null;

        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_action_10_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:1246:2: ( ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_action_2_0= ruleActionJoueur ) ) otherlv_3= '()' ) | ( ( (lv_id_4_0= ruleManche ) ) otherlv_5= '.' ( (lv_action_6_0= ruleActionManche ) ) otherlv_7= '()' ) | ( ( (lv_id_8_0= ruleParticipant ) ) otherlv_9= '.' ( (lv_action_10_0= ruleActionParticipant ) ) otherlv_11= '()' ) ) )
            // InternalRulesUNO.g:1247:2: ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_action_2_0= ruleActionJoueur ) ) otherlv_3= '()' ) | ( ( (lv_id_4_0= ruleManche ) ) otherlv_5= '.' ( (lv_action_6_0= ruleActionManche ) ) otherlv_7= '()' ) | ( ( (lv_id_8_0= ruleParticipant ) ) otherlv_9= '.' ( (lv_action_10_0= ruleActionParticipant ) ) otherlv_11= '()' ) )
            {
            // InternalRulesUNO.g:1247:2: ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_action_2_0= ruleActionJoueur ) ) otherlv_3= '()' ) | ( ( (lv_id_4_0= ruleManche ) ) otherlv_5= '.' ( (lv_action_6_0= ruleActionManche ) ) otherlv_7= '()' ) | ( ( (lv_id_8_0= ruleParticipant ) ) otherlv_9= '.' ( (lv_action_10_0= ruleActionParticipant ) ) otherlv_11= '()' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt17=1;
                }
                break;
            case 32:
                {
                alt17=2;
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalRulesUNO.g:1248:3: ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_action_2_0= ruleActionJoueur ) ) otherlv_3= '()' )
                    {
                    // InternalRulesUNO.g:1248:3: ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_action_2_0= ruleActionJoueur ) ) otherlv_3= '()' )
                    // InternalRulesUNO.g:1249:4: ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_action_2_0= ruleActionJoueur ) ) otherlv_3= '()'
                    {
                    // InternalRulesUNO.g:1249:4: ( (lv_id_0_0= ruleJoueur ) )
                    // InternalRulesUNO.g:1250:5: (lv_id_0_0= ruleJoueur )
                    {
                    // InternalRulesUNO.g:1250:5: (lv_id_0_0= ruleJoueur )
                    // InternalRulesUNO.g:1251:6: lv_id_0_0= ruleJoueur
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getIdJoueurParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_id_0_0=ruleJoueur();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_0_0,
                    							"org.xtext.example.mydsl.RulesUNO.Joueur");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,73,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getFullStopKeyword_0_1());
                    			
                    // InternalRulesUNO.g:1272:4: ( (lv_action_2_0= ruleActionJoueur ) )
                    // InternalRulesUNO.g:1273:5: (lv_action_2_0= ruleActionJoueur )
                    {
                    // InternalRulesUNO.g:1273:5: (lv_action_2_0= ruleActionJoueur )
                    // InternalRulesUNO.g:1274:6: lv_action_2_0= ruleActionJoueur
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getActionActionJoueurParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_action_2_0=ruleActionJoueur();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_2_0,
                    							"org.xtext.example.mydsl.RulesUNO.ActionJoueur");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,74,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1297:3: ( ( (lv_id_4_0= ruleManche ) ) otherlv_5= '.' ( (lv_action_6_0= ruleActionManche ) ) otherlv_7= '()' )
                    {
                    // InternalRulesUNO.g:1297:3: ( ( (lv_id_4_0= ruleManche ) ) otherlv_5= '.' ( (lv_action_6_0= ruleActionManche ) ) otherlv_7= '()' )
                    // InternalRulesUNO.g:1298:4: ( (lv_id_4_0= ruleManche ) ) otherlv_5= '.' ( (lv_action_6_0= ruleActionManche ) ) otherlv_7= '()'
                    {
                    // InternalRulesUNO.g:1298:4: ( (lv_id_4_0= ruleManche ) )
                    // InternalRulesUNO.g:1299:5: (lv_id_4_0= ruleManche )
                    {
                    // InternalRulesUNO.g:1299:5: (lv_id_4_0= ruleManche )
                    // InternalRulesUNO.g:1300:6: lv_id_4_0= ruleManche
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getIdMancheParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_id_4_0=ruleManche();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.xtext.example.mydsl.RulesUNO.Manche");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,73,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getFullStopKeyword_1_1());
                    			
                    // InternalRulesUNO.g:1321:4: ( (lv_action_6_0= ruleActionManche ) )
                    // InternalRulesUNO.g:1322:5: (lv_action_6_0= ruleActionManche )
                    {
                    // InternalRulesUNO.g:1322:5: (lv_action_6_0= ruleActionManche )
                    // InternalRulesUNO.g:1323:6: lv_action_6_0= ruleActionManche
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getActionActionMancheParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_action_6_0=ruleActionManche();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_6_0,
                    							"org.xtext.example.mydsl.RulesUNO.ActionManche");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,74,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1346:3: ( ( (lv_id_8_0= ruleParticipant ) ) otherlv_9= '.' ( (lv_action_10_0= ruleActionParticipant ) ) otherlv_11= '()' )
                    {
                    // InternalRulesUNO.g:1346:3: ( ( (lv_id_8_0= ruleParticipant ) ) otherlv_9= '.' ( (lv_action_10_0= ruleActionParticipant ) ) otherlv_11= '()' )
                    // InternalRulesUNO.g:1347:4: ( (lv_id_8_0= ruleParticipant ) ) otherlv_9= '.' ( (lv_action_10_0= ruleActionParticipant ) ) otherlv_11= '()'
                    {
                    // InternalRulesUNO.g:1347:4: ( (lv_id_8_0= ruleParticipant ) )
                    // InternalRulesUNO.g:1348:5: (lv_id_8_0= ruleParticipant )
                    {
                    // InternalRulesUNO.g:1348:5: (lv_id_8_0= ruleParticipant )
                    // InternalRulesUNO.g:1349:6: lv_id_8_0= ruleParticipant
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getIdParticipantParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_id_8_0=ruleParticipant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_8_0,
                    							"org.xtext.example.mydsl.RulesUNO.Participant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,73,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getFullStopKeyword_2_1());
                    			
                    // InternalRulesUNO.g:1370:4: ( (lv_action_10_0= ruleActionParticipant ) )
                    // InternalRulesUNO.g:1371:5: (lv_action_10_0= ruleActionParticipant )
                    {
                    // InternalRulesUNO.g:1371:5: (lv_action_10_0= ruleActionParticipant )
                    // InternalRulesUNO.g:1372:6: lv_action_10_0= ruleActionParticipant
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getActionActionParticipantParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_action_10_0=ruleActionParticipant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_10_0,
                    							"org.xtext.example.mydsl.RulesUNO.ActionParticipant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,74,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAttribut"
    // InternalRulesUNO.g:1398:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalRulesUNO.g:1398:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalRulesUNO.g:1399:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalRulesUNO.g:1405:1: ruleAttribut returns [EObject current=null] : ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_attribut_2_0= ruleAttributJoueur ) ) ) | ( ( (lv_id_3_0= ruleManche ) ) otherlv_4= '.' ( (lv_attribut_5_0= ruleAttributManche ) ) ) | ( ( (lv_id_6_0= ruleParticipant ) ) otherlv_7= '.' ( (lv_attribut_8_0= ruleAttributParticipant ) ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_attribut_2_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_attribut_5_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        AntlrDatatypeRuleToken lv_attribut_8_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:1411:2: ( ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_attribut_2_0= ruleAttributJoueur ) ) ) | ( ( (lv_id_3_0= ruleManche ) ) otherlv_4= '.' ( (lv_attribut_5_0= ruleAttributManche ) ) ) | ( ( (lv_id_6_0= ruleParticipant ) ) otherlv_7= '.' ( (lv_attribut_8_0= ruleAttributParticipant ) ) ) ) )
            // InternalRulesUNO.g:1412:2: ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_attribut_2_0= ruleAttributJoueur ) ) ) | ( ( (lv_id_3_0= ruleManche ) ) otherlv_4= '.' ( (lv_attribut_5_0= ruleAttributManche ) ) ) | ( ( (lv_id_6_0= ruleParticipant ) ) otherlv_7= '.' ( (lv_attribut_8_0= ruleAttributParticipant ) ) ) )
            {
            // InternalRulesUNO.g:1412:2: ( ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_attribut_2_0= ruleAttributJoueur ) ) ) | ( ( (lv_id_3_0= ruleManche ) ) otherlv_4= '.' ( (lv_attribut_5_0= ruleAttributManche ) ) ) | ( ( (lv_id_6_0= ruleParticipant ) ) otherlv_7= '.' ( (lv_attribut_8_0= ruleAttributParticipant ) ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRulesUNO.g:1413:3: ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_attribut_2_0= ruleAttributJoueur ) ) )
                    {
                    // InternalRulesUNO.g:1413:3: ( ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_attribut_2_0= ruleAttributJoueur ) ) )
                    // InternalRulesUNO.g:1414:4: ( (lv_id_0_0= ruleJoueur ) ) otherlv_1= '.' ( (lv_attribut_2_0= ruleAttributJoueur ) )
                    {
                    // InternalRulesUNO.g:1414:4: ( (lv_id_0_0= ruleJoueur ) )
                    // InternalRulesUNO.g:1415:5: (lv_id_0_0= ruleJoueur )
                    {
                    // InternalRulesUNO.g:1415:5: (lv_id_0_0= ruleJoueur )
                    // InternalRulesUNO.g:1416:6: lv_id_0_0= ruleJoueur
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getIdJoueurParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_id_0_0=ruleJoueur();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_0_0,
                    							"org.xtext.example.mydsl.RulesUNO.Joueur");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,73,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getFullStopKeyword_0_1());
                    			
                    // InternalRulesUNO.g:1437:4: ( (lv_attribut_2_0= ruleAttributJoueur ) )
                    // InternalRulesUNO.g:1438:5: (lv_attribut_2_0= ruleAttributJoueur )
                    {
                    // InternalRulesUNO.g:1438:5: (lv_attribut_2_0= ruleAttributJoueur )
                    // InternalRulesUNO.g:1439:6: lv_attribut_2_0= ruleAttributJoueur
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getAttributAttributJoueurParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attribut_2_0=ruleAttributJoueur();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"attribut",
                    							lv_attribut_2_0,
                    							"org.xtext.example.mydsl.RulesUNO.AttributJoueur");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1458:3: ( ( (lv_id_3_0= ruleManche ) ) otherlv_4= '.' ( (lv_attribut_5_0= ruleAttributManche ) ) )
                    {
                    // InternalRulesUNO.g:1458:3: ( ( (lv_id_3_0= ruleManche ) ) otherlv_4= '.' ( (lv_attribut_5_0= ruleAttributManche ) ) )
                    // InternalRulesUNO.g:1459:4: ( (lv_id_3_0= ruleManche ) ) otherlv_4= '.' ( (lv_attribut_5_0= ruleAttributManche ) )
                    {
                    // InternalRulesUNO.g:1459:4: ( (lv_id_3_0= ruleManche ) )
                    // InternalRulesUNO.g:1460:5: (lv_id_3_0= ruleManche )
                    {
                    // InternalRulesUNO.g:1460:5: (lv_id_3_0= ruleManche )
                    // InternalRulesUNO.g:1461:6: lv_id_3_0= ruleManche
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getIdMancheParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_id_3_0=ruleManche();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"org.xtext.example.mydsl.RulesUNO.Manche");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,73,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getFullStopKeyword_1_1());
                    			
                    // InternalRulesUNO.g:1482:4: ( (lv_attribut_5_0= ruleAttributManche ) )
                    // InternalRulesUNO.g:1483:5: (lv_attribut_5_0= ruleAttributManche )
                    {
                    // InternalRulesUNO.g:1483:5: (lv_attribut_5_0= ruleAttributManche )
                    // InternalRulesUNO.g:1484:6: lv_attribut_5_0= ruleAttributManche
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getAttributAttributMancheParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attribut_5_0=ruleAttributManche();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"attribut",
                    							lv_attribut_5_0,
                    							"org.xtext.example.mydsl.RulesUNO.AttributManche");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1503:3: ( ( (lv_id_6_0= ruleParticipant ) ) otherlv_7= '.' ( (lv_attribut_8_0= ruleAttributParticipant ) ) )
                    {
                    // InternalRulesUNO.g:1503:3: ( ( (lv_id_6_0= ruleParticipant ) ) otherlv_7= '.' ( (lv_attribut_8_0= ruleAttributParticipant ) ) )
                    // InternalRulesUNO.g:1504:4: ( (lv_id_6_0= ruleParticipant ) ) otherlv_7= '.' ( (lv_attribut_8_0= ruleAttributParticipant ) )
                    {
                    // InternalRulesUNO.g:1504:4: ( (lv_id_6_0= ruleParticipant ) )
                    // InternalRulesUNO.g:1505:5: (lv_id_6_0= ruleParticipant )
                    {
                    // InternalRulesUNO.g:1505:5: (lv_id_6_0= ruleParticipant )
                    // InternalRulesUNO.g:1506:6: lv_id_6_0= ruleParticipant
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getIdParticipantParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_id_6_0=ruleParticipant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_6_0,
                    							"org.xtext.example.mydsl.RulesUNO.Participant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,73,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributAccess().getFullStopKeyword_2_1());
                    			
                    // InternalRulesUNO.g:1527:4: ( (lv_attribut_8_0= ruleAttributParticipant ) )
                    // InternalRulesUNO.g:1528:5: (lv_attribut_8_0= ruleAttributParticipant )
                    {
                    // InternalRulesUNO.g:1528:5: (lv_attribut_8_0= ruleAttributParticipant )
                    // InternalRulesUNO.g:1529:6: lv_attribut_8_0= ruleAttributParticipant
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getAttributAttributParticipantParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attribut_8_0=ruleAttributParticipant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"attribut",
                    							lv_attribut_8_0,
                    							"org.xtext.example.mydsl.RulesUNO.AttributParticipant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleOperateur"
    // InternalRulesUNO.g:1551:1: entryRuleOperateur returns [String current=null] : iv_ruleOperateur= ruleOperateur EOF ;
    public final String entryRuleOperateur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperateur = null;


        try {
            // InternalRulesUNO.g:1551:49: (iv_ruleOperateur= ruleOperateur EOF )
            // InternalRulesUNO.g:1552:2: iv_ruleOperateur= ruleOperateur EOF
            {
             newCompositeNode(grammarAccess.getOperateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperateur=ruleOperateur();

            state._fsp--;

             current =iv_ruleOperateur.getText(); 
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
    // $ANTLR end "entryRuleOperateur"


    // $ANTLR start "ruleOperateur"
    // InternalRulesUNO.g:1558:1: ruleOperateur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOperateur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:1564:2: ( (kw= '+' | kw= '-' | kw= '%' ) )
            // InternalRulesUNO.g:1565:2: (kw= '+' | kw= '-' | kw= '%' )
            {
            // InternalRulesUNO.g:1565:2: (kw= '+' | kw= '-' | kw= '%' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt19=1;
                }
                break;
            case 76:
                {
                alt19=2;
                }
                break;
            case 77:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRulesUNO.g:1566:3: kw= '+'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperateurAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1572:3: kw= '-'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperateurAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1578:3: kw= '%'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperateurAccess().getPercentSignKeyword_2());
                    		

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
    // $ANTLR end "ruleOperateur"


    // $ANTLR start "entryRuleComparateur"
    // InternalRulesUNO.g:1587:1: entryRuleComparateur returns [String current=null] : iv_ruleComparateur= ruleComparateur EOF ;
    public final String entryRuleComparateur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparateur = null;


        try {
            // InternalRulesUNO.g:1587:51: (iv_ruleComparateur= ruleComparateur EOF )
            // InternalRulesUNO.g:1588:2: iv_ruleComparateur= ruleComparateur EOF
            {
             newCompositeNode(grammarAccess.getComparateurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparateur=ruleComparateur();

            state._fsp--;

             current =iv_ruleComparateur.getText(); 
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
    // $ANTLR end "entryRuleComparateur"


    // $ANTLR start "ruleComparateur"
    // InternalRulesUNO.g:1594:1: ruleComparateur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleComparateur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:1600:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' ) )
            // InternalRulesUNO.g:1601:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' )
            {
            // InternalRulesUNO.g:1601:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '==' | kw= '!=' )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt20=1;
                }
                break;
            case 79:
                {
                alt20=2;
                }
                break;
            case 80:
                {
                alt20=3;
                }
                break;
            case 81:
                {
                alt20=4;
                }
                break;
            case 82:
                {
                alt20=5;
                }
                break;
            case 83:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalRulesUNO.g:1602:3: kw= '>'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparateurAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1608:3: kw= '<'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparateurAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1614:3: kw= '>='
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparateurAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1620:3: kw= '<='
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparateurAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:1626:3: kw= '=='
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparateurAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:1632:3: kw= '!='
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparateurAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

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
    // $ANTLR end "ruleComparateur"


    // $ANTLR start "entryRuleLogique"
    // InternalRulesUNO.g:1641:1: entryRuleLogique returns [String current=null] : iv_ruleLogique= ruleLogique EOF ;
    public final String entryRuleLogique() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogique = null;


        try {
            // InternalRulesUNO.g:1641:47: (iv_ruleLogique= ruleLogique EOF )
            // InternalRulesUNO.g:1642:2: iv_ruleLogique= ruleLogique EOF
            {
             newCompositeNode(grammarAccess.getLogiqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogique=ruleLogique();

            state._fsp--;

             current =iv_ruleLogique.getText(); 
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
    // $ANTLR end "entryRuleLogique"


    // $ANTLR start "ruleLogique"
    // InternalRulesUNO.g:1648:1: ruleLogique returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' ) ;
    public final AntlrDatatypeRuleToken ruleLogique() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRulesUNO.g:1654:2: ( (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' ) )
            // InternalRulesUNO.g:1655:2: (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' )
            {
            // InternalRulesUNO.g:1655:2: (kw= '&&' | kw= '||' | kw= '->' | kw= '<->' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt21=1;
                }
                break;
            case 85:
                {
                alt21=2;
                }
                break;
            case 86:
                {
                alt21=3;
                }
                break;
            case 87:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalRulesUNO.g:1656:3: kw= '&&'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogiqueAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1662:3: kw= '||'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogiqueAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1668:3: kw= '->'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogiqueAccess().getHyphenMinusGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1674:3: kw= '<->'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogiqueAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3());
                    		

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
    // $ANTLR end "ruleLogique"


    // $ANTLR start "entryRuleExpressionNumerique"
    // InternalRulesUNO.g:1683:1: entryRuleExpressionNumerique returns [EObject current=null] : iv_ruleExpressionNumerique= ruleExpressionNumerique EOF ;
    public final EObject entryRuleExpressionNumerique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionNumerique = null;


        try {
            // InternalRulesUNO.g:1683:60: (iv_ruleExpressionNumerique= ruleExpressionNumerique EOF )
            // InternalRulesUNO.g:1684:2: iv_ruleExpressionNumerique= ruleExpressionNumerique EOF
            {
             newCompositeNode(grammarAccess.getExpressionNumeriqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionNumerique=ruleExpressionNumerique();

            state._fsp--;

             current =iv_ruleExpressionNumerique; 
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
    // $ANTLR end "entryRuleExpressionNumerique"


    // $ANTLR start "ruleExpressionNumerique"
    // InternalRulesUNO.g:1690:1: ruleExpressionNumerique returns [EObject current=null] : ( ( (lv_exp_0_0= ruleEntier ) ) ( ( (lv_op_1_0= ruleOperateur ) ) ( (lv_exp_2_0= ruleEntier ) ) )* ) ;
    public final EObject ruleExpressionNumerique() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:1696:2: ( ( ( (lv_exp_0_0= ruleEntier ) ) ( ( (lv_op_1_0= ruleOperateur ) ) ( (lv_exp_2_0= ruleEntier ) ) )* ) )
            // InternalRulesUNO.g:1697:2: ( ( (lv_exp_0_0= ruleEntier ) ) ( ( (lv_op_1_0= ruleOperateur ) ) ( (lv_exp_2_0= ruleEntier ) ) )* )
            {
            // InternalRulesUNO.g:1697:2: ( ( (lv_exp_0_0= ruleEntier ) ) ( ( (lv_op_1_0= ruleOperateur ) ) ( (lv_exp_2_0= ruleEntier ) ) )* )
            // InternalRulesUNO.g:1698:3: ( (lv_exp_0_0= ruleEntier ) ) ( ( (lv_op_1_0= ruleOperateur ) ) ( (lv_exp_2_0= ruleEntier ) ) )*
            {
            // InternalRulesUNO.g:1698:3: ( (lv_exp_0_0= ruleEntier ) )
            // InternalRulesUNO.g:1699:4: (lv_exp_0_0= ruleEntier )
            {
            // InternalRulesUNO.g:1699:4: (lv_exp_0_0= ruleEntier )
            // InternalRulesUNO.g:1700:5: lv_exp_0_0= ruleEntier
            {

            					newCompositeNode(grammarAccess.getExpressionNumeriqueAccess().getExpEntierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_exp_0_0=ruleEntier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionNumeriqueRule());
            					}
            					add(
            						current,
            						"exp",
            						lv_exp_0_0,
            						"org.xtext.example.mydsl.RulesUNO.Entier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRulesUNO.g:1717:3: ( ( (lv_op_1_0= ruleOperateur ) ) ( (lv_exp_2_0= ruleEntier ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=75 && LA22_0<=77)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRulesUNO.g:1718:4: ( (lv_op_1_0= ruleOperateur ) ) ( (lv_exp_2_0= ruleEntier ) )
            	    {
            	    // InternalRulesUNO.g:1718:4: ( (lv_op_1_0= ruleOperateur ) )
            	    // InternalRulesUNO.g:1719:5: (lv_op_1_0= ruleOperateur )
            	    {
            	    // InternalRulesUNO.g:1719:5: (lv_op_1_0= ruleOperateur )
            	    // InternalRulesUNO.g:1720:6: lv_op_1_0= ruleOperateur
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionNumeriqueAccess().getOpOperateurParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_op_1_0=ruleOperateur();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionNumeriqueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_1_0,
            	    							"org.xtext.example.mydsl.RulesUNO.Operateur");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRulesUNO.g:1737:4: ( (lv_exp_2_0= ruleEntier ) )
            	    // InternalRulesUNO.g:1738:5: (lv_exp_2_0= ruleEntier )
            	    {
            	    // InternalRulesUNO.g:1738:5: (lv_exp_2_0= ruleEntier )
            	    // InternalRulesUNO.g:1739:6: lv_exp_2_0= ruleEntier
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionNumeriqueAccess().getExpEntierParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_exp_2_0=ruleEntier();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionNumeriqueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exp",
            	    							lv_exp_2_0,
            	    							"org.xtext.example.mydsl.RulesUNO.Entier");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionNumerique"


    // $ANTLR start "entryRuleExpressionBooleene"
    // InternalRulesUNO.g:1761:1: entryRuleExpressionBooleene returns [EObject current=null] : iv_ruleExpressionBooleene= ruleExpressionBooleene EOF ;
    public final EObject entryRuleExpressionBooleene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBooleene = null;


        try {
            // InternalRulesUNO.g:1761:59: (iv_ruleExpressionBooleene= ruleExpressionBooleene EOF )
            // InternalRulesUNO.g:1762:2: iv_ruleExpressionBooleene= ruleExpressionBooleene EOF
            {
             newCompositeNode(grammarAccess.getExpressionBooleeneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBooleene=ruleExpressionBooleene();

            state._fsp--;

             current =iv_ruleExpressionBooleene; 
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
    // $ANTLR end "entryRuleExpressionBooleene"


    // $ANTLR start "ruleExpressionBooleene"
    // InternalRulesUNO.g:1768:1: ruleExpressionBooleene returns [EObject current=null] : ( ( ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) ) ) ( ( (lv_log_1_0= ruleLogique ) ) ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) ) )* ) ;
    public final EObject ruleExpressionBooleene() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_1 = null;

        EObject lv_exp_0_2 = null;

        AntlrDatatypeRuleToken lv_log_1_0 = null;

        EObject lv_exp_2_1 = null;

        EObject lv_exp_2_2 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:1774:2: ( ( ( ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) ) ) ( ( (lv_log_1_0= ruleLogique ) ) ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) ) )* ) )
            // InternalRulesUNO.g:1775:2: ( ( ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) ) ) ( ( (lv_log_1_0= ruleLogique ) ) ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) ) )* )
            {
            // InternalRulesUNO.g:1775:2: ( ( ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) ) ) ( ( (lv_log_1_0= ruleLogique ) ) ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) ) )* )
            // InternalRulesUNO.g:1776:3: ( ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) ) ) ( ( (lv_log_1_0= ruleLogique ) ) ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) ) )*
            {
            // InternalRulesUNO.g:1776:3: ( ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) ) )
            // InternalRulesUNO.g:1777:4: ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) )
            {
            // InternalRulesUNO.g:1777:4: ( (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire ) )
            // InternalRulesUNO.g:1778:5: (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire )
            {
            // InternalRulesUNO.g:1778:5: (lv_exp_0_1= ruleBooleen | lv_exp_0_2= ruleBooleanContraire )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==16||(LA23_0>=24 && LA23_0<=32)||(LA23_0>=37 && LA23_0<=42)||(LA23_0>=65 && LA23_0<=68)||(LA23_0>=88 && LA23_0<=89)) ) {
                alt23=1;
            }
            else if ( (LA23_0==90) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRulesUNO.g:1779:6: lv_exp_0_1= ruleBooleen
                    {

                    						newCompositeNode(grammarAccess.getExpressionBooleeneAccess().getExpBooleenParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_exp_0_1=ruleBooleen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionBooleeneRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_0_1,
                    							"org.xtext.example.mydsl.RulesUNO.Booleen");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1795:6: lv_exp_0_2= ruleBooleanContraire
                    {

                    						newCompositeNode(grammarAccess.getExpressionBooleeneAccess().getExpBooleanContraireParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_29);
                    lv_exp_0_2=ruleBooleanContraire();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionBooleeneRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_0_2,
                    							"org.xtext.example.mydsl.RulesUNO.BooleanContraire");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalRulesUNO.g:1813:3: ( ( (lv_log_1_0= ruleLogique ) ) ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=84 && LA25_0<=87)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRulesUNO.g:1814:4: ( (lv_log_1_0= ruleLogique ) ) ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) )
            	    {
            	    // InternalRulesUNO.g:1814:4: ( (lv_log_1_0= ruleLogique ) )
            	    // InternalRulesUNO.g:1815:5: (lv_log_1_0= ruleLogique )
            	    {
            	    // InternalRulesUNO.g:1815:5: (lv_log_1_0= ruleLogique )
            	    // InternalRulesUNO.g:1816:6: lv_log_1_0= ruleLogique
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionBooleeneAccess().getLogLogiqueParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_log_1_0=ruleLogique();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionBooleeneRule());
            	    						}
            	    						add(
            	    							current,
            	    							"log",
            	    							lv_log_1_0,
            	    							"org.xtext.example.mydsl.RulesUNO.Logique");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRulesUNO.g:1833:4: ( ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) ) )
            	    // InternalRulesUNO.g:1834:5: ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) )
            	    {
            	    // InternalRulesUNO.g:1834:5: ( (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire ) )
            	    // InternalRulesUNO.g:1835:6: (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire )
            	    {
            	    // InternalRulesUNO.g:1835:6: (lv_exp_2_1= ruleBooleen | lv_exp_2_2= ruleBooleanContraire )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==RULE_INT||LA24_0==16||(LA24_0>=24 && LA24_0<=32)||(LA24_0>=37 && LA24_0<=42)||(LA24_0>=65 && LA24_0<=68)||(LA24_0>=88 && LA24_0<=89)) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==90) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalRulesUNO.g:1836:7: lv_exp_2_1= ruleBooleen
            	            {

            	            							newCompositeNode(grammarAccess.getExpressionBooleeneAccess().getExpBooleenParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_29);
            	            lv_exp_2_1=ruleBooleen();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getExpressionBooleeneRule());
            	            							}
            	            							add(
            	            								current,
            	            								"exp",
            	            								lv_exp_2_1,
            	            								"org.xtext.example.mydsl.RulesUNO.Booleen");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalRulesUNO.g:1852:7: lv_exp_2_2= ruleBooleanContraire
            	            {

            	            							newCompositeNode(grammarAccess.getExpressionBooleeneAccess().getExpBooleanContraireParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_29);
            	            lv_exp_2_2=ruleBooleanContraire();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getExpressionBooleeneRule());
            	            							}
            	            							add(
            	            								current,
            	            								"exp",
            	            								lv_exp_2_2,
            	            								"org.xtext.example.mydsl.RulesUNO.BooleanContraire");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionBooleene"


    // $ANTLR start "entryRuleEntier"
    // InternalRulesUNO.g:1875:1: entryRuleEntier returns [EObject current=null] : iv_ruleEntier= ruleEntier EOF ;
    public final EObject entryRuleEntier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntier = null;


        try {
            // InternalRulesUNO.g:1875:47: (iv_ruleEntier= ruleEntier EOF )
            // InternalRulesUNO.g:1876:2: iv_ruleEntier= ruleEntier EOF
            {
             newCompositeNode(grammarAccess.getEntierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntier=ruleEntier();

            state._fsp--;

             current =iv_ruleEntier; 
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
    // $ANTLR end "entryRuleEntier"


    // $ANTLR start "ruleEntier"
    // InternalRulesUNO.g:1882:1: ruleEntier returns [EObject current=null] : ( ( (lv_val_0_0= RULE_INT ) ) | ( (lv_att_1_0= ruleVariableNumerique ) ) ) ;
    public final EObject ruleEntier() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        EObject lv_att_1_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:1888:2: ( ( ( (lv_val_0_0= RULE_INT ) ) | ( (lv_att_1_0= ruleVariableNumerique ) ) ) )
            // InternalRulesUNO.g:1889:2: ( ( (lv_val_0_0= RULE_INT ) ) | ( (lv_att_1_0= ruleVariableNumerique ) ) )
            {
            // InternalRulesUNO.g:1889:2: ( ( (lv_val_0_0= RULE_INT ) ) | ( (lv_att_1_0= ruleVariableNumerique ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==32||(LA26_0>=37 && LA26_0<=42)||(LA26_0>=65 && LA26_0<=68)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalRulesUNO.g:1890:3: ( (lv_val_0_0= RULE_INT ) )
                    {
                    // InternalRulesUNO.g:1890:3: ( (lv_val_0_0= RULE_INT ) )
                    // InternalRulesUNO.g:1891:4: (lv_val_0_0= RULE_INT )
                    {
                    // InternalRulesUNO.g:1891:4: (lv_val_0_0= RULE_INT )
                    // InternalRulesUNO.g:1892:5: lv_val_0_0= RULE_INT
                    {
                    lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_val_0_0, grammarAccess.getEntierAccess().getValINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntierRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1909:3: ( (lv_att_1_0= ruleVariableNumerique ) )
                    {
                    // InternalRulesUNO.g:1909:3: ( (lv_att_1_0= ruleVariableNumerique ) )
                    // InternalRulesUNO.g:1910:4: (lv_att_1_0= ruleVariableNumerique )
                    {
                    // InternalRulesUNO.g:1910:4: (lv_att_1_0= ruleVariableNumerique )
                    // InternalRulesUNO.g:1911:5: lv_att_1_0= ruleVariableNumerique
                    {

                    					newCompositeNode(grammarAccess.getEntierAccess().getAttVariableNumeriqueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_att_1_0=ruleVariableNumerique();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntierRule());
                    					}
                    					set(
                    						current,
                    						"att",
                    						lv_att_1_0,
                    						"org.xtext.example.mydsl.RulesUNO.VariableNumerique");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleEntier"


    // $ANTLR start "entryRuleBooleen"
    // InternalRulesUNO.g:1932:1: entryRuleBooleen returns [EObject current=null] : iv_ruleBooleen= ruleBooleen EOF ;
    public final EObject entryRuleBooleen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleen = null;


        try {
            // InternalRulesUNO.g:1932:48: (iv_ruleBooleen= ruleBooleen EOF )
            // InternalRulesUNO.g:1933:2: iv_ruleBooleen= ruleBooleen EOF
            {
             newCompositeNode(grammarAccess.getBooleenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleen=ruleBooleen();

            state._fsp--;

             current =iv_ruleBooleen; 
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
    // $ANTLR end "entryRuleBooleen"


    // $ANTLR start "ruleBooleen"
    // InternalRulesUNO.g:1939:1: ruleBooleen returns [EObject current=null] : ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) | ( (lv_var_1_0= ruleVariableBooleene ) ) | ( ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) ) ) ) ;
    public final EObject ruleBooleen() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;
        EObject lv_var_1_0 = null;

        EObject lv_exp1_2_0 = null;

        AntlrDatatypeRuleToken lv_comp_3_0 = null;

        EObject lv_exp2_4_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:1945:2: ( ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) | ( (lv_var_1_0= ruleVariableBooleene ) ) | ( ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) ) ) ) )
            // InternalRulesUNO.g:1946:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) | ( (lv_var_1_0= ruleVariableBooleene ) ) | ( ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) ) ) )
            {
            // InternalRulesUNO.g:1946:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) | ( (lv_var_1_0= ruleVariableBooleene ) ) | ( ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) ) ) )
            int alt28=3;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalRulesUNO.g:1947:3: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
                    {
                    // InternalRulesUNO.g:1947:3: ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) )
                    // InternalRulesUNO.g:1948:4: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
                    {
                    // InternalRulesUNO.g:1948:4: ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) )
                    // InternalRulesUNO.g:1949:5: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
                    {
                    // InternalRulesUNO.g:1949:5: (lv_val_0_1= 'true' | lv_val_0_2= 'false' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==88) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==89) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalRulesUNO.g:1950:6: lv_val_0_1= 'true'
                            {
                            lv_val_0_1=(Token)match(input,88,FOLLOW_2); 

                            						newLeafNode(lv_val_0_1, grammarAccess.getBooleenAccess().getValTrueKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBooleenRule());
                            						}
                            						setWithLastConsumed(current, "val", lv_val_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalRulesUNO.g:1961:6: lv_val_0_2= 'false'
                            {
                            lv_val_0_2=(Token)match(input,89,FOLLOW_2); 

                            						newLeafNode(lv_val_0_2, grammarAccess.getBooleenAccess().getValFalseKeyword_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBooleenRule());
                            						}
                            						setWithLastConsumed(current, "val", lv_val_0_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1975:3: ( (lv_var_1_0= ruleVariableBooleene ) )
                    {
                    // InternalRulesUNO.g:1975:3: ( (lv_var_1_0= ruleVariableBooleene ) )
                    // InternalRulesUNO.g:1976:4: (lv_var_1_0= ruleVariableBooleene )
                    {
                    // InternalRulesUNO.g:1976:4: (lv_var_1_0= ruleVariableBooleene )
                    // InternalRulesUNO.g:1977:5: lv_var_1_0= ruleVariableBooleene
                    {

                    					newCompositeNode(grammarAccess.getBooleenAccess().getVarVariableBooleeneParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_1_0=ruleVariableBooleene();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleenRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_1_0,
                    						"org.xtext.example.mydsl.RulesUNO.VariableBooleene");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1995:3: ( ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) ) )
                    {
                    // InternalRulesUNO.g:1995:3: ( ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) ) )
                    // InternalRulesUNO.g:1996:4: ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) )
                    {
                    // InternalRulesUNO.g:1996:4: ( (lv_exp1_2_0= ruleExpressionNumerique ) )
                    // InternalRulesUNO.g:1997:5: (lv_exp1_2_0= ruleExpressionNumerique )
                    {
                    // InternalRulesUNO.g:1997:5: (lv_exp1_2_0= ruleExpressionNumerique )
                    // InternalRulesUNO.g:1998:6: lv_exp1_2_0= ruleExpressionNumerique
                    {

                    						newCompositeNode(grammarAccess.getBooleenAccess().getExp1ExpressionNumeriqueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_exp1_2_0=ruleExpressionNumerique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleenRule());
                    						}
                    						set(
                    							current,
                    							"exp1",
                    							lv_exp1_2_0,
                    							"org.xtext.example.mydsl.RulesUNO.ExpressionNumerique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesUNO.g:2015:4: ( (lv_comp_3_0= ruleComparateur ) )
                    // InternalRulesUNO.g:2016:5: (lv_comp_3_0= ruleComparateur )
                    {
                    // InternalRulesUNO.g:2016:5: (lv_comp_3_0= ruleComparateur )
                    // InternalRulesUNO.g:2017:6: lv_comp_3_0= ruleComparateur
                    {

                    						newCompositeNode(grammarAccess.getBooleenAccess().getCompComparateurParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_comp_3_0=ruleComparateur();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleenRule());
                    						}
                    						set(
                    							current,
                    							"comp",
                    							lv_comp_3_0,
                    							"org.xtext.example.mydsl.RulesUNO.Comparateur");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRulesUNO.g:2034:4: ( (lv_exp2_4_0= ruleExpressionNumerique ) )
                    // InternalRulesUNO.g:2035:5: (lv_exp2_4_0= ruleExpressionNumerique )
                    {
                    // InternalRulesUNO.g:2035:5: (lv_exp2_4_0= ruleExpressionNumerique )
                    // InternalRulesUNO.g:2036:6: lv_exp2_4_0= ruleExpressionNumerique
                    {

                    						newCompositeNode(grammarAccess.getBooleenAccess().getExp2ExpressionNumeriqueParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp2_4_0=ruleExpressionNumerique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleenRule());
                    						}
                    						set(
                    							current,
                    							"exp2",
                    							lv_exp2_4_0,
                    							"org.xtext.example.mydsl.RulesUNO.ExpressionNumerique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleBooleen"


    // $ANTLR start "entryRuleBooleanContraire"
    // InternalRulesUNO.g:2058:1: entryRuleBooleanContraire returns [EObject current=null] : iv_ruleBooleanContraire= ruleBooleanContraire EOF ;
    public final EObject entryRuleBooleanContraire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanContraire = null;


        try {
            // InternalRulesUNO.g:2058:57: (iv_ruleBooleanContraire= ruleBooleanContraire EOF )
            // InternalRulesUNO.g:2059:2: iv_ruleBooleanContraire= ruleBooleanContraire EOF
            {
             newCompositeNode(grammarAccess.getBooleanContraireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanContraire=ruleBooleanContraire();

            state._fsp--;

             current =iv_ruleBooleanContraire; 
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
    // $ANTLR end "entryRuleBooleanContraire"


    // $ANTLR start "ruleBooleanContraire"
    // InternalRulesUNO.g:2065:1: ruleBooleanContraire returns [EObject current=null] : (otherlv_0= '!' this_Booleen_1= ruleBooleen ) ;
    public final EObject ruleBooleanContraire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Booleen_1 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:2071:2: ( (otherlv_0= '!' this_Booleen_1= ruleBooleen ) )
            // InternalRulesUNO.g:2072:2: (otherlv_0= '!' this_Booleen_1= ruleBooleen )
            {
            // InternalRulesUNO.g:2072:2: (otherlv_0= '!' this_Booleen_1= ruleBooleen )
            // InternalRulesUNO.g:2073:3: otherlv_0= '!' this_Booleen_1= ruleBooleen
            {
            otherlv_0=(Token)match(input,90,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanContraireAccess().getExclamationMarkKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBooleanContraireAccess().getBooleenParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Booleen_1=ruleBooleen();

            state._fsp--;


            			current = this_Booleen_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleBooleanContraire"


    // $ANTLR start "entryRuleCondition"
    // InternalRulesUNO.g:2089:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalRulesUNO.g:2089:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalRulesUNO.g:2090:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalRulesUNO.g:2096:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' this_ExpressionBooleene_2= ruleExpressionBooleene otherlv_3= ')' otherlv_4= '{' ( (lv_declarationAlors_5_0= ruleDeclaration ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_declarationSinon_9_0= ruleDeclaration ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_ExpressionBooleene_2 = null;

        EObject lv_declarationAlors_5_0 = null;

        EObject lv_declarationSinon_9_0 = null;



        	enterRule();

        try {
            // InternalRulesUNO.g:2102:2: ( (otherlv_0= 'if' otherlv_1= '(' this_ExpressionBooleene_2= ruleExpressionBooleene otherlv_3= ')' otherlv_4= '{' ( (lv_declarationAlors_5_0= ruleDeclaration ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_declarationSinon_9_0= ruleDeclaration ) )* otherlv_10= '}' )? ) )
            // InternalRulesUNO.g:2103:2: (otherlv_0= 'if' otherlv_1= '(' this_ExpressionBooleene_2= ruleExpressionBooleene otherlv_3= ')' otherlv_4= '{' ( (lv_declarationAlors_5_0= ruleDeclaration ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_declarationSinon_9_0= ruleDeclaration ) )* otherlv_10= '}' )? )
            {
            // InternalRulesUNO.g:2103:2: (otherlv_0= 'if' otherlv_1= '(' this_ExpressionBooleene_2= ruleExpressionBooleene otherlv_3= ')' otherlv_4= '{' ( (lv_declarationAlors_5_0= ruleDeclaration ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_declarationSinon_9_0= ruleDeclaration ) )* otherlv_10= '}' )? )
            // InternalRulesUNO.g:2104:3: otherlv_0= 'if' otherlv_1= '(' this_ExpressionBooleene_2= ruleExpressionBooleene otherlv_3= ')' otherlv_4= '{' ( (lv_declarationAlors_5_0= ruleDeclaration ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_declarationSinon_9_0= ruleDeclaration ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,91,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,92,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getConditionAccess().getExpressionBooleeneParserRuleCall_2());
            		
            pushFollow(FOLLOW_34);
            this_ExpressionBooleene_2=ruleExpressionBooleene();

            state._fsp--;


            			current = this_ExpressionBooleene_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,93,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRulesUNO.g:2128:3: ( (lv_declarationAlors_5_0= ruleDeclaration ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23||LA29_0==32||(LA29_0>=37 && LA29_0<=42)||(LA29_0>=65 && LA29_0<=68)||LA29_0==91) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRulesUNO.g:2129:4: (lv_declarationAlors_5_0= ruleDeclaration )
            	    {
            	    // InternalRulesUNO.g:2129:4: (lv_declarationAlors_5_0= ruleDeclaration )
            	    // InternalRulesUNO.g:2130:5: lv_declarationAlors_5_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getConditionAccess().getDeclarationAlorsDeclarationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_declarationAlors_5_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarationAlors",
            	    						lv_declarationAlors_5_0,
            	    						"org.xtext.example.mydsl.RulesUNO.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalRulesUNO.g:2151:3: (otherlv_7= 'else' otherlv_8= '{' ( (lv_declarationSinon_9_0= ruleDeclaration ) )* otherlv_10= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==94) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRulesUNO.g:2152:4: otherlv_7= 'else' otherlv_8= '{' ( (lv_declarationSinon_9_0= ruleDeclaration ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,94,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getElseKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRulesUNO.g:2160:4: ( (lv_declarationSinon_9_0= ruleDeclaration ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23||LA30_0==32||(LA30_0>=37 && LA30_0<=42)||(LA30_0>=65 && LA30_0<=68)||LA30_0==91) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalRulesUNO.g:2161:5: (lv_declarationSinon_9_0= ruleDeclaration )
                    	    {
                    	    // InternalRulesUNO.g:2161:5: (lv_declarationSinon_9_0= ruleDeclaration )
                    	    // InternalRulesUNO.g:2162:6: lv_declarationSinon_9_0= ruleDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getConditionAccess().getDeclarationSinonDeclarationParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_declarationSinon_9_0=ruleDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"declarationSinon",
                    	    							lv_declarationSinon_9_0,
                    	    							"org.xtext.example.mydsl.RulesUNO.Declaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleCondition"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\27\1\uffff\13\111\1\uffff\1\53\1\41\1\105\1\uffff";
    static final String dfa_3s = "\1\133\1\uffff\13\111\1\uffff\1\100\1\44\1\110\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\13\uffff\1\2\3\uffff\1\3";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\10\uffff\1\10\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\26\uffff\1\11\1\12\1\13\1\14\26\uffff\1\15",
            "",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "",
            "\25\1\1\21",
            "\2\21\2\1",
            "\3\1\1\21",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "376:2: (this_Instruction_0= ruleInstruction | this_Condition_1= ruleCondition | this_Affectation_2= ruleAffectation )";
        }
    }
    static final String dfa_7s = "\1\4\2\uffff\13\111\1\uffff\1\53\1\41\1\105";
    static final String dfa_8s = "\1\131\2\uffff\13\111\1\uffff\1\100\1\44\1\110";
    static final String dfa_9s = "\1\uffff\1\1\1\2\13\uffff\1\3\3\uffff";
    static final String[] dfa_10s = {
            "\1\16\13\uffff\1\2\7\uffff\10\2\1\11\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\26\uffff\1\12\1\13\1\14\1\15\23\uffff\2\1",
            "",
            "",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "",
            "\25\2\1\16",
            "\2\16\2\2",
            "\3\2\1\16"
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "1946:2: ( ( ( (lv_val_0_1= 'true' | lv_val_0_2= 'false' ) ) ) | ( (lv_var_1_0= ruleVariableBooleene ) ) | ( ( (lv_exp1_2_0= ruleExpressionNumerique ) ) ( (lv_comp_3_0= ruleComparateur ) ) ( (lv_exp2_4_0= ruleExpressionNumerique ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000FF012000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000FF010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000007E100802000L,0x000000000800001EL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000007E100800010L,0x000000000800001EL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000007E100800000L,0x000000000000001EL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000007E100802000L,0x000000000000001EL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFFFFF80000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000007E1FF810010L,0x000000000F00001EL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00000000000FC000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000007E1FF810010L,0x000000000B00001EL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});

}