package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.RulesUNOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesUNOParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MANCHE'", "'NB_CARTES'", "'POINTS'", "'EQUIPE'", "'JOUEUR'", "'BASE'", "'DEUX_JOUEURS'", "'UNO_CHALENGE'", "'CARTES_IDENTIQUES'", "'SUITES'", "'ZERO_ECHANGE'", "'ZERO_TOURNANT'", "'ZERO_QUESTION'", "'NB_JOUEUR'", "'NB_PARTICIPANT'", "'FINIR'", "'NOUVELLE'", "'JOUEUR_COURRANT'", "'JOUEUR_SUIVANT'", "'JOUEUR_TOUS'", "'JOUEUR_AUTRE'", "'JOUEUR_EXISTE'", "'JOUEUR_SELECTIONNE'", "'CRIER_UNO'", "'JOUER_CARTE_BASE'", "'JOUER_CARTE_JOKER'", "'JOUER_CARTE_INVERSER_SENS'", "'JOUER_CARTE_PASSE_TON_TOUR'", "'JOUER_CARTE_PLUS_2'", "'JOUER_CARTE_PLUS_4'", "'JOUER_PLUSIEURS_CARTES_IDENTIQUES'", "'JOUER_CARTE_ZERO'", "'JOUER_SUITE_DE_CARTES'", "'POSER_QUESTION'", "'REJOUER'", "'PASSER_SON_TOUR'", "'CHANGER_COULEUR'", "'CHOISIR_COULEUR'", "'PIOCHER_2_CARTES'", "'PIOCHER_4_CARTES'", "'INVERSER_SENS'", "'DONNER_CARTES_AU_JOUEUR_SUIVANT'", "'ECHANGER_JEU_AVEC_UN_ADVERSAIRE'", "'REMARQUER_ERREUR_UNO'", "'PARTICIPANT_COURRANT'", "'PARTICIPANT_EXISTE'", "'PARTICIPANT_SELECTIONNE'", "'PARTICIPANT_MIN_POINTS'", "'GAGNER'", "'PERDRE'", "'ETRE_ELIMINE'", "'+'", "'-'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'->'", "'<->'", "'true'", "'false'", "'RUno'", "'{'", "'}'", "'participant'", "'='", "';'", "'nb_joueur'", "'variantes'", "','", "'regles'", "'choix'", "'.'", "'()'", "'!'", "'if'", "'('", "')'", "'else'"
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

    	public void setGrammarAccess(RulesUNOGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUno"
    // InternalRulesUNO.g:53:1: entryRuleUno : ruleUno EOF ;
    public final void entryRuleUno() throws RecognitionException {
        try {
            // InternalRulesUNO.g:54:1: ( ruleUno EOF )
            // InternalRulesUNO.g:55:1: ruleUno EOF
            {
             before(grammarAccess.getUnoRule()); 
            pushFollow(FOLLOW_1);
            ruleUno();

            state._fsp--;

             after(grammarAccess.getUnoRule()); 
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
    // $ANTLR end "entryRuleUno"


    // $ANTLR start "ruleUno"
    // InternalRulesUNO.g:62:1: ruleUno : ( ( rule__Uno__Group__0 ) ) ;
    public final void ruleUno() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:66:2: ( ( ( rule__Uno__Group__0 ) ) )
            // InternalRulesUNO.g:67:2: ( ( rule__Uno__Group__0 ) )
            {
            // InternalRulesUNO.g:67:2: ( ( rule__Uno__Group__0 ) )
            // InternalRulesUNO.g:68:3: ( rule__Uno__Group__0 )
            {
             before(grammarAccess.getUnoAccess().getGroup()); 
            // InternalRulesUNO.g:69:3: ( rule__Uno__Group__0 )
            // InternalRulesUNO.g:69:4: rule__Uno__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uno__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getGroup()); 

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
    // $ANTLR end "ruleUno"


    // $ANTLR start "entryRuleParticipantType"
    // InternalRulesUNO.g:78:1: entryRuleParticipantType : ruleParticipantType EOF ;
    public final void entryRuleParticipantType() throws RecognitionException {
        try {
            // InternalRulesUNO.g:79:1: ( ruleParticipantType EOF )
            // InternalRulesUNO.g:80:1: ruleParticipantType EOF
            {
             before(grammarAccess.getParticipantTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipantType();

            state._fsp--;

             after(grammarAccess.getParticipantTypeRule()); 
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
    // $ANTLR end "entryRuleParticipantType"


    // $ANTLR start "ruleParticipantType"
    // InternalRulesUNO.g:87:1: ruleParticipantType : ( ( rule__ParticipantType__Group__0 ) ) ;
    public final void ruleParticipantType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:91:2: ( ( ( rule__ParticipantType__Group__0 ) ) )
            // InternalRulesUNO.g:92:2: ( ( rule__ParticipantType__Group__0 ) )
            {
            // InternalRulesUNO.g:92:2: ( ( rule__ParticipantType__Group__0 ) )
            // InternalRulesUNO.g:93:3: ( rule__ParticipantType__Group__0 )
            {
             before(grammarAccess.getParticipantTypeAccess().getGroup()); 
            // InternalRulesUNO.g:94:3: ( rule__ParticipantType__Group__0 )
            // InternalRulesUNO.g:94:4: rule__ParticipantType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleParticipantType"


    // $ANTLR start "entryRuleNbJoueur"
    // InternalRulesUNO.g:103:1: entryRuleNbJoueur : ruleNbJoueur EOF ;
    public final void entryRuleNbJoueur() throws RecognitionException {
        try {
            // InternalRulesUNO.g:104:1: ( ruleNbJoueur EOF )
            // InternalRulesUNO.g:105:1: ruleNbJoueur EOF
            {
             before(grammarAccess.getNbJoueurRule()); 
            pushFollow(FOLLOW_1);
            ruleNbJoueur();

            state._fsp--;

             after(grammarAccess.getNbJoueurRule()); 
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
    // $ANTLR end "entryRuleNbJoueur"


    // $ANTLR start "ruleNbJoueur"
    // InternalRulesUNO.g:112:1: ruleNbJoueur : ( ( rule__NbJoueur__Group__0 ) ) ;
    public final void ruleNbJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:116:2: ( ( ( rule__NbJoueur__Group__0 ) ) )
            // InternalRulesUNO.g:117:2: ( ( rule__NbJoueur__Group__0 ) )
            {
            // InternalRulesUNO.g:117:2: ( ( rule__NbJoueur__Group__0 ) )
            // InternalRulesUNO.g:118:3: ( rule__NbJoueur__Group__0 )
            {
             before(grammarAccess.getNbJoueurAccess().getGroup()); 
            // InternalRulesUNO.g:119:3: ( rule__NbJoueur__Group__0 )
            // InternalRulesUNO.g:119:4: rule__NbJoueur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NbJoueur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNbJoueurAccess().getGroup()); 

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
    // $ANTLR end "ruleNbJoueur"


    // $ANTLR start "entryRuleVariantes"
    // InternalRulesUNO.g:128:1: entryRuleVariantes : ruleVariantes EOF ;
    public final void entryRuleVariantes() throws RecognitionException {
        try {
            // InternalRulesUNO.g:129:1: ( ruleVariantes EOF )
            // InternalRulesUNO.g:130:1: ruleVariantes EOF
            {
             before(grammarAccess.getVariantesRule()); 
            pushFollow(FOLLOW_1);
            ruleVariantes();

            state._fsp--;

             after(grammarAccess.getVariantesRule()); 
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
    // $ANTLR end "entryRuleVariantes"


    // $ANTLR start "ruleVariantes"
    // InternalRulesUNO.g:137:1: ruleVariantes : ( ( rule__Variantes__Group__0 ) ) ;
    public final void ruleVariantes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:141:2: ( ( ( rule__Variantes__Group__0 ) ) )
            // InternalRulesUNO.g:142:2: ( ( rule__Variantes__Group__0 ) )
            {
            // InternalRulesUNO.g:142:2: ( ( rule__Variantes__Group__0 ) )
            // InternalRulesUNO.g:143:3: ( rule__Variantes__Group__0 )
            {
             before(grammarAccess.getVariantesAccess().getGroup()); 
            // InternalRulesUNO.g:144:3: ( rule__Variantes__Group__0 )
            // InternalRulesUNO.g:144:4: rule__Variantes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variantes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantesAccess().getGroup()); 

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
    // $ANTLR end "ruleVariantes"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRulesUNO.g:153:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalRulesUNO.g:154:1: ( ruleDeclaration EOF )
            // InternalRulesUNO.g:155:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRulesUNO.g:162:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:166:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalRulesUNO.g:167:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalRulesUNO.g:167:2: ( ( rule__Declaration__Alternatives ) )
            // InternalRulesUNO.g:168:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalRulesUNO.g:169:3: ( rule__Declaration__Alternatives )
            // InternalRulesUNO.g:169:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleRegles"
    // InternalRulesUNO.g:178:1: entryRuleRegles : ruleRegles EOF ;
    public final void entryRuleRegles() throws RecognitionException {
        try {
            // InternalRulesUNO.g:179:1: ( ruleRegles EOF )
            // InternalRulesUNO.g:180:1: ruleRegles EOF
            {
             before(grammarAccess.getReglesRule()); 
            pushFollow(FOLLOW_1);
            ruleRegles();

            state._fsp--;

             after(grammarAccess.getReglesRule()); 
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
    // $ANTLR end "entryRuleRegles"


    // $ANTLR start "ruleRegles"
    // InternalRulesUNO.g:187:1: ruleRegles : ( ( rule__Regles__Group__0 ) ) ;
    public final void ruleRegles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:191:2: ( ( ( rule__Regles__Group__0 ) ) )
            // InternalRulesUNO.g:192:2: ( ( rule__Regles__Group__0 ) )
            {
            // InternalRulesUNO.g:192:2: ( ( rule__Regles__Group__0 ) )
            // InternalRulesUNO.g:193:3: ( rule__Regles__Group__0 )
            {
             before(grammarAccess.getReglesAccess().getGroup()); 
            // InternalRulesUNO.g:194:3: ( rule__Regles__Group__0 )
            // InternalRulesUNO.g:194:4: rule__Regles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Regles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReglesAccess().getGroup()); 

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
    // $ANTLR end "ruleRegles"


    // $ANTLR start "entryRuleAffectation"
    // InternalRulesUNO.g:203:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // InternalRulesUNO.g:204:1: ( ruleAffectation EOF )
            // InternalRulesUNO.g:205:1: ruleAffectation EOF
            {
             before(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getAffectationRule()); 
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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalRulesUNO.g:212:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:216:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // InternalRulesUNO.g:217:2: ( ( rule__Affectation__Group__0 ) )
            {
            // InternalRulesUNO.g:217:2: ( ( rule__Affectation__Group__0 ) )
            // InternalRulesUNO.g:218:3: ( rule__Affectation__Group__0 )
            {
             before(grammarAccess.getAffectationAccess().getGroup()); 
            // InternalRulesUNO.g:219:3: ( rule__Affectation__Group__0 )
            // InternalRulesUNO.g:219:4: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getGroup()); 

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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleInstruction"
    // InternalRulesUNO.g:228:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalRulesUNO.g:229:1: ( ruleInstruction EOF )
            // InternalRulesUNO.g:230:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalRulesUNO.g:237:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:241:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalRulesUNO.g:242:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalRulesUNO.g:242:2: ( ( rule__Instruction__Alternatives ) )
            // InternalRulesUNO.g:243:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalRulesUNO.g:244:3: ( rule__Instruction__Alternatives )
            // InternalRulesUNO.g:244:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleInstructionsBloc"
    // InternalRulesUNO.g:253:1: entryRuleInstructionsBloc : ruleInstructionsBloc EOF ;
    public final void entryRuleInstructionsBloc() throws RecognitionException {
        try {
            // InternalRulesUNO.g:254:1: ( ruleInstructionsBloc EOF )
            // InternalRulesUNO.g:255:1: ruleInstructionsBloc EOF
            {
             before(grammarAccess.getInstructionsBlocRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructionsBloc();

            state._fsp--;

             after(grammarAccess.getInstructionsBlocRule()); 
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
    // $ANTLR end "entryRuleInstructionsBloc"


    // $ANTLR start "ruleInstructionsBloc"
    // InternalRulesUNO.g:262:1: ruleInstructionsBloc : ( ruleInstructionChoix ) ;
    public final void ruleInstructionsBloc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:266:2: ( ( ruleInstructionChoix ) )
            // InternalRulesUNO.g:267:2: ( ruleInstructionChoix )
            {
            // InternalRulesUNO.g:267:2: ( ruleInstructionChoix )
            // InternalRulesUNO.g:268:3: ruleInstructionChoix
            {
             before(grammarAccess.getInstructionsBlocAccess().getInstructionChoixParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleInstructionChoix();

            state._fsp--;

             after(grammarAccess.getInstructionsBlocAccess().getInstructionChoixParserRuleCall()); 

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
    // $ANTLR end "ruleInstructionsBloc"


    // $ANTLR start "entryRuleInstructionChoix"
    // InternalRulesUNO.g:278:1: entryRuleInstructionChoix : ruleInstructionChoix EOF ;
    public final void entryRuleInstructionChoix() throws RecognitionException {
        try {
            // InternalRulesUNO.g:279:1: ( ruleInstructionChoix EOF )
            // InternalRulesUNO.g:280:1: ruleInstructionChoix EOF
            {
             before(grammarAccess.getInstructionChoixRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructionChoix();

            state._fsp--;

             after(grammarAccess.getInstructionChoixRule()); 
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
    // $ANTLR end "entryRuleInstructionChoix"


    // $ANTLR start "ruleInstructionChoix"
    // InternalRulesUNO.g:287:1: ruleInstructionChoix : ( ( rule__InstructionChoix__Group__0 ) ) ;
    public final void ruleInstructionChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:291:2: ( ( ( rule__InstructionChoix__Group__0 ) ) )
            // InternalRulesUNO.g:292:2: ( ( rule__InstructionChoix__Group__0 ) )
            {
            // InternalRulesUNO.g:292:2: ( ( rule__InstructionChoix__Group__0 ) )
            // InternalRulesUNO.g:293:3: ( rule__InstructionChoix__Group__0 )
            {
             before(grammarAccess.getInstructionChoixAccess().getGroup()); 
            // InternalRulesUNO.g:294:3: ( rule__InstructionChoix__Group__0 )
            // InternalRulesUNO.g:294:4: rule__InstructionChoix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstructionChoix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionChoixAccess().getGroup()); 

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
    // $ANTLR end "ruleInstructionChoix"


    // $ANTLR start "entryRuleVariableNumerique"
    // InternalRulesUNO.g:303:1: entryRuleVariableNumerique : ruleVariableNumerique EOF ;
    public final void entryRuleVariableNumerique() throws RecognitionException {
        try {
            // InternalRulesUNO.g:304:1: ( ruleVariableNumerique EOF )
            // InternalRulesUNO.g:305:1: ruleVariableNumerique EOF
            {
             before(grammarAccess.getVariableNumeriqueRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableNumerique();

            state._fsp--;

             after(grammarAccess.getVariableNumeriqueRule()); 
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
    // $ANTLR end "entryRuleVariableNumerique"


    // $ANTLR start "ruleVariableNumerique"
    // InternalRulesUNO.g:312:1: ruleVariableNumerique : ( ( rule__VariableNumerique__VarAssignment ) ) ;
    public final void ruleVariableNumerique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:316:2: ( ( ( rule__VariableNumerique__VarAssignment ) ) )
            // InternalRulesUNO.g:317:2: ( ( rule__VariableNumerique__VarAssignment ) )
            {
            // InternalRulesUNO.g:317:2: ( ( rule__VariableNumerique__VarAssignment ) )
            // InternalRulesUNO.g:318:3: ( rule__VariableNumerique__VarAssignment )
            {
             before(grammarAccess.getVariableNumeriqueAccess().getVarAssignment()); 
            // InternalRulesUNO.g:319:3: ( rule__VariableNumerique__VarAssignment )
            // InternalRulesUNO.g:319:4: rule__VariableNumerique__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableNumerique__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableNumeriqueAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleVariableNumerique"


    // $ANTLR start "entryRuleVariableBooleene"
    // InternalRulesUNO.g:328:1: entryRuleVariableBooleene : ruleVariableBooleene EOF ;
    public final void entryRuleVariableBooleene() throws RecognitionException {
        try {
            // InternalRulesUNO.g:329:1: ( ruleVariableBooleene EOF )
            // InternalRulesUNO.g:330:1: ruleVariableBooleene EOF
            {
             before(grammarAccess.getVariableBooleeneRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableBooleene();

            state._fsp--;

             after(grammarAccess.getVariableBooleeneRule()); 
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
    // $ANTLR end "entryRuleVariableBooleene"


    // $ANTLR start "ruleVariableBooleene"
    // InternalRulesUNO.g:337:1: ruleVariableBooleene : ( ( rule__VariableBooleene__Alternatives ) ) ;
    public final void ruleVariableBooleene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:341:2: ( ( ( rule__VariableBooleene__Alternatives ) ) )
            // InternalRulesUNO.g:342:2: ( ( rule__VariableBooleene__Alternatives ) )
            {
            // InternalRulesUNO.g:342:2: ( ( rule__VariableBooleene__Alternatives ) )
            // InternalRulesUNO.g:343:3: ( rule__VariableBooleene__Alternatives )
            {
             before(grammarAccess.getVariableBooleeneAccess().getAlternatives()); 
            // InternalRulesUNO.g:344:3: ( rule__VariableBooleene__Alternatives )
            // InternalRulesUNO.g:344:4: rule__VariableBooleene__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableBooleene__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableBooleeneAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariableBooleene"


    // $ANTLR start "entryRuleVariante"
    // InternalRulesUNO.g:353:1: entryRuleVariante : ruleVariante EOF ;
    public final void entryRuleVariante() throws RecognitionException {
        try {
            // InternalRulesUNO.g:354:1: ( ruleVariante EOF )
            // InternalRulesUNO.g:355:1: ruleVariante EOF
            {
             before(grammarAccess.getVarianteRule()); 
            pushFollow(FOLLOW_1);
            ruleVariante();

            state._fsp--;

             after(grammarAccess.getVarianteRule()); 
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
    // $ANTLR end "entryRuleVariante"


    // $ANTLR start "ruleVariante"
    // InternalRulesUNO.g:362:1: ruleVariante : ( ( rule__Variante__Alternatives ) ) ;
    public final void ruleVariante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:366:2: ( ( ( rule__Variante__Alternatives ) ) )
            // InternalRulesUNO.g:367:2: ( ( rule__Variante__Alternatives ) )
            {
            // InternalRulesUNO.g:367:2: ( ( rule__Variante__Alternatives ) )
            // InternalRulesUNO.g:368:3: ( rule__Variante__Alternatives )
            {
             before(grammarAccess.getVarianteAccess().getAlternatives()); 
            // InternalRulesUNO.g:369:3: ( rule__Variante__Alternatives )
            // InternalRulesUNO.g:369:4: rule__Variante__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variante__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarianteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariante"


    // $ANTLR start "entryRuleManche"
    // InternalRulesUNO.g:378:1: entryRuleManche : ruleManche EOF ;
    public final void entryRuleManche() throws RecognitionException {
        try {
            // InternalRulesUNO.g:379:1: ( ruleManche EOF )
            // InternalRulesUNO.g:380:1: ruleManche EOF
            {
             before(grammarAccess.getMancheRule()); 
            pushFollow(FOLLOW_1);
            ruleManche();

            state._fsp--;

             after(grammarAccess.getMancheRule()); 
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
    // $ANTLR end "entryRuleManche"


    // $ANTLR start "ruleManche"
    // InternalRulesUNO.g:387:1: ruleManche : ( 'MANCHE' ) ;
    public final void ruleManche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:391:2: ( ( 'MANCHE' ) )
            // InternalRulesUNO.g:392:2: ( 'MANCHE' )
            {
            // InternalRulesUNO.g:392:2: ( 'MANCHE' )
            // InternalRulesUNO.g:393:3: 'MANCHE'
            {
             before(grammarAccess.getMancheAccess().getMANCHEKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getMANCHEKeyword()); 

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
    // $ANTLR end "ruleManche"


    // $ANTLR start "entryRuleAttributManche"
    // InternalRulesUNO.g:403:1: entryRuleAttributManche : ruleAttributManche EOF ;
    public final void entryRuleAttributManche() throws RecognitionException {
        try {
            // InternalRulesUNO.g:404:1: ( ruleAttributManche EOF )
            // InternalRulesUNO.g:405:1: ruleAttributManche EOF
            {
             before(grammarAccess.getAttributMancheRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributManche();

            state._fsp--;

             after(grammarAccess.getAttributMancheRule()); 
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
    // $ANTLR end "entryRuleAttributManche"


    // $ANTLR start "ruleAttributManche"
    // InternalRulesUNO.g:412:1: ruleAttributManche : ( ( rule__AttributManche__Alternatives ) ) ;
    public final void ruleAttributManche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:416:2: ( ( ( rule__AttributManche__Alternatives ) ) )
            // InternalRulesUNO.g:417:2: ( ( rule__AttributManche__Alternatives ) )
            {
            // InternalRulesUNO.g:417:2: ( ( rule__AttributManche__Alternatives ) )
            // InternalRulesUNO.g:418:3: ( rule__AttributManche__Alternatives )
            {
             before(grammarAccess.getAttributMancheAccess().getAlternatives()); 
            // InternalRulesUNO.g:419:3: ( rule__AttributManche__Alternatives )
            // InternalRulesUNO.g:419:4: rule__AttributManche__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributManche__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributMancheAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributManche"


    // $ANTLR start "entryRuleActionManche"
    // InternalRulesUNO.g:428:1: entryRuleActionManche : ruleActionManche EOF ;
    public final void entryRuleActionManche() throws RecognitionException {
        try {
            // InternalRulesUNO.g:429:1: ( ruleActionManche EOF )
            // InternalRulesUNO.g:430:1: ruleActionManche EOF
            {
             before(grammarAccess.getActionMancheRule()); 
            pushFollow(FOLLOW_1);
            ruleActionManche();

            state._fsp--;

             after(grammarAccess.getActionMancheRule()); 
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
    // $ANTLR end "entryRuleActionManche"


    // $ANTLR start "ruleActionManche"
    // InternalRulesUNO.g:437:1: ruleActionManche : ( ( rule__ActionManche__Alternatives ) ) ;
    public final void ruleActionManche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:441:2: ( ( ( rule__ActionManche__Alternatives ) ) )
            // InternalRulesUNO.g:442:2: ( ( rule__ActionManche__Alternatives ) )
            {
            // InternalRulesUNO.g:442:2: ( ( rule__ActionManche__Alternatives ) )
            // InternalRulesUNO.g:443:3: ( rule__ActionManche__Alternatives )
            {
             before(grammarAccess.getActionMancheAccess().getAlternatives()); 
            // InternalRulesUNO.g:444:3: ( rule__ActionManche__Alternatives )
            // InternalRulesUNO.g:444:4: rule__ActionManche__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionManche__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionMancheAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActionManche"


    // $ANTLR start "entryRuleJoueur"
    // InternalRulesUNO.g:453:1: entryRuleJoueur : ruleJoueur EOF ;
    public final void entryRuleJoueur() throws RecognitionException {
        try {
            // InternalRulesUNO.g:454:1: ( ruleJoueur EOF )
            // InternalRulesUNO.g:455:1: ruleJoueur EOF
            {
             before(grammarAccess.getJoueurRule()); 
            pushFollow(FOLLOW_1);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getJoueurRule()); 
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
    // $ANTLR end "entryRuleJoueur"


    // $ANTLR start "ruleJoueur"
    // InternalRulesUNO.g:462:1: ruleJoueur : ( ( rule__Joueur__Alternatives ) ) ;
    public final void ruleJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:466:2: ( ( ( rule__Joueur__Alternatives ) ) )
            // InternalRulesUNO.g:467:2: ( ( rule__Joueur__Alternatives ) )
            {
            // InternalRulesUNO.g:467:2: ( ( rule__Joueur__Alternatives ) )
            // InternalRulesUNO.g:468:3: ( rule__Joueur__Alternatives )
            {
             before(grammarAccess.getJoueurAccess().getAlternatives()); 
            // InternalRulesUNO.g:469:3: ( rule__Joueur__Alternatives )
            // InternalRulesUNO.g:469:4: rule__Joueur__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "entryRuleActionJoueur"
    // InternalRulesUNO.g:478:1: entryRuleActionJoueur : ruleActionJoueur EOF ;
    public final void entryRuleActionJoueur() throws RecognitionException {
        try {
            // InternalRulesUNO.g:479:1: ( ruleActionJoueur EOF )
            // InternalRulesUNO.g:480:1: ruleActionJoueur EOF
            {
             before(grammarAccess.getActionJoueurRule()); 
            pushFollow(FOLLOW_1);
            ruleActionJoueur();

            state._fsp--;

             after(grammarAccess.getActionJoueurRule()); 
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
    // $ANTLR end "entryRuleActionJoueur"


    // $ANTLR start "ruleActionJoueur"
    // InternalRulesUNO.g:487:1: ruleActionJoueur : ( ( rule__ActionJoueur__Alternatives ) ) ;
    public final void ruleActionJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:491:2: ( ( ( rule__ActionJoueur__Alternatives ) ) )
            // InternalRulesUNO.g:492:2: ( ( rule__ActionJoueur__Alternatives ) )
            {
            // InternalRulesUNO.g:492:2: ( ( rule__ActionJoueur__Alternatives ) )
            // InternalRulesUNO.g:493:3: ( rule__ActionJoueur__Alternatives )
            {
             before(grammarAccess.getActionJoueurAccess().getAlternatives()); 
            // InternalRulesUNO.g:494:3: ( rule__ActionJoueur__Alternatives )
            // InternalRulesUNO.g:494:4: rule__ActionJoueur__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionJoueur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionJoueurAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActionJoueur"


    // $ANTLR start "entryRuleAttributJoueur"
    // InternalRulesUNO.g:503:1: entryRuleAttributJoueur : ruleAttributJoueur EOF ;
    public final void entryRuleAttributJoueur() throws RecognitionException {
        try {
            // InternalRulesUNO.g:504:1: ( ruleAttributJoueur EOF )
            // InternalRulesUNO.g:505:1: ruleAttributJoueur EOF
            {
             before(grammarAccess.getAttributJoueurRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributJoueur();

            state._fsp--;

             after(grammarAccess.getAttributJoueurRule()); 
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
    // $ANTLR end "entryRuleAttributJoueur"


    // $ANTLR start "ruleAttributJoueur"
    // InternalRulesUNO.g:512:1: ruleAttributJoueur : ( 'NB_CARTES' ) ;
    public final void ruleAttributJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:516:2: ( ( 'NB_CARTES' ) )
            // InternalRulesUNO.g:517:2: ( 'NB_CARTES' )
            {
            // InternalRulesUNO.g:517:2: ( 'NB_CARTES' )
            // InternalRulesUNO.g:518:3: 'NB_CARTES'
            {
             before(grammarAccess.getAttributJoueurAccess().getNB_CARTESKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributJoueurAccess().getNB_CARTESKeyword()); 

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
    // $ANTLR end "ruleAttributJoueur"


    // $ANTLR start "entryRuleParticipant"
    // InternalRulesUNO.g:528:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // InternalRulesUNO.g:529:1: ( ruleParticipant EOF )
            // InternalRulesUNO.g:530:1: ruleParticipant EOF
            {
             before(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getParticipantRule()); 
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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalRulesUNO.g:537:1: ruleParticipant : ( ( rule__Participant__Alternatives ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:541:2: ( ( ( rule__Participant__Alternatives ) ) )
            // InternalRulesUNO.g:542:2: ( ( rule__Participant__Alternatives ) )
            {
            // InternalRulesUNO.g:542:2: ( ( rule__Participant__Alternatives ) )
            // InternalRulesUNO.g:543:3: ( rule__Participant__Alternatives )
            {
             before(grammarAccess.getParticipantAccess().getAlternatives()); 
            // InternalRulesUNO.g:544:3: ( rule__Participant__Alternatives )
            // InternalRulesUNO.g:544:4: rule__Participant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Participant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleActionParticipant"
    // InternalRulesUNO.g:553:1: entryRuleActionParticipant : ruleActionParticipant EOF ;
    public final void entryRuleActionParticipant() throws RecognitionException {
        try {
            // InternalRulesUNO.g:554:1: ( ruleActionParticipant EOF )
            // InternalRulesUNO.g:555:1: ruleActionParticipant EOF
            {
             before(grammarAccess.getActionParticipantRule()); 
            pushFollow(FOLLOW_1);
            ruleActionParticipant();

            state._fsp--;

             after(grammarAccess.getActionParticipantRule()); 
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
    // $ANTLR end "entryRuleActionParticipant"


    // $ANTLR start "ruleActionParticipant"
    // InternalRulesUNO.g:562:1: ruleActionParticipant : ( ( rule__ActionParticipant__Alternatives ) ) ;
    public final void ruleActionParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:566:2: ( ( ( rule__ActionParticipant__Alternatives ) ) )
            // InternalRulesUNO.g:567:2: ( ( rule__ActionParticipant__Alternatives ) )
            {
            // InternalRulesUNO.g:567:2: ( ( rule__ActionParticipant__Alternatives ) )
            // InternalRulesUNO.g:568:3: ( rule__ActionParticipant__Alternatives )
            {
             before(grammarAccess.getActionParticipantAccess().getAlternatives()); 
            // InternalRulesUNO.g:569:3: ( rule__ActionParticipant__Alternatives )
            // InternalRulesUNO.g:569:4: rule__ActionParticipant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionParticipant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionParticipantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActionParticipant"


    // $ANTLR start "entryRuleAttributParticipant"
    // InternalRulesUNO.g:578:1: entryRuleAttributParticipant : ruleAttributParticipant EOF ;
    public final void entryRuleAttributParticipant() throws RecognitionException {
        try {
            // InternalRulesUNO.g:579:1: ( ruleAttributParticipant EOF )
            // InternalRulesUNO.g:580:1: ruleAttributParticipant EOF
            {
             before(grammarAccess.getAttributParticipantRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributParticipant();

            state._fsp--;

             after(grammarAccess.getAttributParticipantRule()); 
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
    // $ANTLR end "entryRuleAttributParticipant"


    // $ANTLR start "ruleAttributParticipant"
    // InternalRulesUNO.g:587:1: ruleAttributParticipant : ( 'POINTS' ) ;
    public final void ruleAttributParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:591:2: ( ( 'POINTS' ) )
            // InternalRulesUNO.g:592:2: ( 'POINTS' )
            {
            // InternalRulesUNO.g:592:2: ( 'POINTS' )
            // InternalRulesUNO.g:593:3: 'POINTS'
            {
             before(grammarAccess.getAttributParticipantAccess().getPOINTSKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributParticipantAccess().getPOINTSKeyword()); 

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
    // $ANTLR end "ruleAttributParticipant"


    // $ANTLR start "entryRuleAction"
    // InternalRulesUNO.g:603:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalRulesUNO.g:604:1: ( ruleAction EOF )
            // InternalRulesUNO.g:605:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRulesUNO.g:612:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:616:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalRulesUNO.g:617:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalRulesUNO.g:617:2: ( ( rule__Action__Alternatives ) )
            // InternalRulesUNO.g:618:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalRulesUNO.g:619:3: ( rule__Action__Alternatives )
            // InternalRulesUNO.g:619:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAttribut"
    // InternalRulesUNO.g:628:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalRulesUNO.g:629:1: ( ruleAttribut EOF )
            // InternalRulesUNO.g:630:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalRulesUNO.g:637:1: ruleAttribut : ( ( rule__Attribut__Alternatives ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:641:2: ( ( ( rule__Attribut__Alternatives ) ) )
            // InternalRulesUNO.g:642:2: ( ( rule__Attribut__Alternatives ) )
            {
            // InternalRulesUNO.g:642:2: ( ( rule__Attribut__Alternatives ) )
            // InternalRulesUNO.g:643:3: ( rule__Attribut__Alternatives )
            {
             before(grammarAccess.getAttributAccess().getAlternatives()); 
            // InternalRulesUNO.g:644:3: ( rule__Attribut__Alternatives )
            // InternalRulesUNO.g:644:4: rule__Attribut__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleOperateur"
    // InternalRulesUNO.g:653:1: entryRuleOperateur : ruleOperateur EOF ;
    public final void entryRuleOperateur() throws RecognitionException {
        try {
            // InternalRulesUNO.g:654:1: ( ruleOperateur EOF )
            // InternalRulesUNO.g:655:1: ruleOperateur EOF
            {
             before(grammarAccess.getOperateurRule()); 
            pushFollow(FOLLOW_1);
            ruleOperateur();

            state._fsp--;

             after(grammarAccess.getOperateurRule()); 
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
    // $ANTLR end "entryRuleOperateur"


    // $ANTLR start "ruleOperateur"
    // InternalRulesUNO.g:662:1: ruleOperateur : ( ( rule__Operateur__Alternatives ) ) ;
    public final void ruleOperateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:666:2: ( ( ( rule__Operateur__Alternatives ) ) )
            // InternalRulesUNO.g:667:2: ( ( rule__Operateur__Alternatives ) )
            {
            // InternalRulesUNO.g:667:2: ( ( rule__Operateur__Alternatives ) )
            // InternalRulesUNO.g:668:3: ( rule__Operateur__Alternatives )
            {
             before(grammarAccess.getOperateurAccess().getAlternatives()); 
            // InternalRulesUNO.g:669:3: ( rule__Operateur__Alternatives )
            // InternalRulesUNO.g:669:4: rule__Operateur__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operateur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperateurAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperateur"


    // $ANTLR start "entryRuleComparateur"
    // InternalRulesUNO.g:678:1: entryRuleComparateur : ruleComparateur EOF ;
    public final void entryRuleComparateur() throws RecognitionException {
        try {
            // InternalRulesUNO.g:679:1: ( ruleComparateur EOF )
            // InternalRulesUNO.g:680:1: ruleComparateur EOF
            {
             before(grammarAccess.getComparateurRule()); 
            pushFollow(FOLLOW_1);
            ruleComparateur();

            state._fsp--;

             after(grammarAccess.getComparateurRule()); 
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
    // $ANTLR end "entryRuleComparateur"


    // $ANTLR start "ruleComparateur"
    // InternalRulesUNO.g:687:1: ruleComparateur : ( ( rule__Comparateur__Alternatives ) ) ;
    public final void ruleComparateur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:691:2: ( ( ( rule__Comparateur__Alternatives ) ) )
            // InternalRulesUNO.g:692:2: ( ( rule__Comparateur__Alternatives ) )
            {
            // InternalRulesUNO.g:692:2: ( ( rule__Comparateur__Alternatives ) )
            // InternalRulesUNO.g:693:3: ( rule__Comparateur__Alternatives )
            {
             before(grammarAccess.getComparateurAccess().getAlternatives()); 
            // InternalRulesUNO.g:694:3: ( rule__Comparateur__Alternatives )
            // InternalRulesUNO.g:694:4: rule__Comparateur__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparateur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparateurAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparateur"


    // $ANTLR start "entryRuleLogique"
    // InternalRulesUNO.g:703:1: entryRuleLogique : ruleLogique EOF ;
    public final void entryRuleLogique() throws RecognitionException {
        try {
            // InternalRulesUNO.g:704:1: ( ruleLogique EOF )
            // InternalRulesUNO.g:705:1: ruleLogique EOF
            {
             before(grammarAccess.getLogiqueRule()); 
            pushFollow(FOLLOW_1);
            ruleLogique();

            state._fsp--;

             after(grammarAccess.getLogiqueRule()); 
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
    // $ANTLR end "entryRuleLogique"


    // $ANTLR start "ruleLogique"
    // InternalRulesUNO.g:712:1: ruleLogique : ( ( rule__Logique__Alternatives ) ) ;
    public final void ruleLogique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:716:2: ( ( ( rule__Logique__Alternatives ) ) )
            // InternalRulesUNO.g:717:2: ( ( rule__Logique__Alternatives ) )
            {
            // InternalRulesUNO.g:717:2: ( ( rule__Logique__Alternatives ) )
            // InternalRulesUNO.g:718:3: ( rule__Logique__Alternatives )
            {
             before(grammarAccess.getLogiqueAccess().getAlternatives()); 
            // InternalRulesUNO.g:719:3: ( rule__Logique__Alternatives )
            // InternalRulesUNO.g:719:4: rule__Logique__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Logique__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogiqueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLogique"


    // $ANTLR start "entryRuleExpressionNumerique"
    // InternalRulesUNO.g:728:1: entryRuleExpressionNumerique : ruleExpressionNumerique EOF ;
    public final void entryRuleExpressionNumerique() throws RecognitionException {
        try {
            // InternalRulesUNO.g:729:1: ( ruleExpressionNumerique EOF )
            // InternalRulesUNO.g:730:1: ruleExpressionNumerique EOF
            {
             before(grammarAccess.getExpressionNumeriqueRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionNumerique();

            state._fsp--;

             after(grammarAccess.getExpressionNumeriqueRule()); 
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
    // $ANTLR end "entryRuleExpressionNumerique"


    // $ANTLR start "ruleExpressionNumerique"
    // InternalRulesUNO.g:737:1: ruleExpressionNumerique : ( ( rule__ExpressionNumerique__Group__0 ) ) ;
    public final void ruleExpressionNumerique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:741:2: ( ( ( rule__ExpressionNumerique__Group__0 ) ) )
            // InternalRulesUNO.g:742:2: ( ( rule__ExpressionNumerique__Group__0 ) )
            {
            // InternalRulesUNO.g:742:2: ( ( rule__ExpressionNumerique__Group__0 ) )
            // InternalRulesUNO.g:743:3: ( rule__ExpressionNumerique__Group__0 )
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getGroup()); 
            // InternalRulesUNO.g:744:3: ( rule__ExpressionNumerique__Group__0 )
            // InternalRulesUNO.g:744:4: rule__ExpressionNumerique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionNumeriqueAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionNumerique"


    // $ANTLR start "entryRuleExpressionBooleene"
    // InternalRulesUNO.g:753:1: entryRuleExpressionBooleene : ruleExpressionBooleene EOF ;
    public final void entryRuleExpressionBooleene() throws RecognitionException {
        try {
            // InternalRulesUNO.g:754:1: ( ruleExpressionBooleene EOF )
            // InternalRulesUNO.g:755:1: ruleExpressionBooleene EOF
            {
             before(grammarAccess.getExpressionBooleeneRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBooleene();

            state._fsp--;

             after(grammarAccess.getExpressionBooleeneRule()); 
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
    // $ANTLR end "entryRuleExpressionBooleene"


    // $ANTLR start "ruleExpressionBooleene"
    // InternalRulesUNO.g:762:1: ruleExpressionBooleene : ( ( rule__ExpressionBooleene__Group__0 ) ) ;
    public final void ruleExpressionBooleene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:766:2: ( ( ( rule__ExpressionBooleene__Group__0 ) ) )
            // InternalRulesUNO.g:767:2: ( ( rule__ExpressionBooleene__Group__0 ) )
            {
            // InternalRulesUNO.g:767:2: ( ( rule__ExpressionBooleene__Group__0 ) )
            // InternalRulesUNO.g:768:3: ( rule__ExpressionBooleene__Group__0 )
            {
             before(grammarAccess.getExpressionBooleeneAccess().getGroup()); 
            // InternalRulesUNO.g:769:3: ( rule__ExpressionBooleene__Group__0 )
            // InternalRulesUNO.g:769:4: rule__ExpressionBooleene__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBooleeneAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionBooleene"


    // $ANTLR start "entryRuleEntier"
    // InternalRulesUNO.g:778:1: entryRuleEntier : ruleEntier EOF ;
    public final void entryRuleEntier() throws RecognitionException {
        try {
            // InternalRulesUNO.g:779:1: ( ruleEntier EOF )
            // InternalRulesUNO.g:780:1: ruleEntier EOF
            {
             before(grammarAccess.getEntierRule()); 
            pushFollow(FOLLOW_1);
            ruleEntier();

            state._fsp--;

             after(grammarAccess.getEntierRule()); 
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
    // $ANTLR end "entryRuleEntier"


    // $ANTLR start "ruleEntier"
    // InternalRulesUNO.g:787:1: ruleEntier : ( ( rule__Entier__Alternatives ) ) ;
    public final void ruleEntier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:791:2: ( ( ( rule__Entier__Alternatives ) ) )
            // InternalRulesUNO.g:792:2: ( ( rule__Entier__Alternatives ) )
            {
            // InternalRulesUNO.g:792:2: ( ( rule__Entier__Alternatives ) )
            // InternalRulesUNO.g:793:3: ( rule__Entier__Alternatives )
            {
             before(grammarAccess.getEntierAccess().getAlternatives()); 
            // InternalRulesUNO.g:794:3: ( rule__Entier__Alternatives )
            // InternalRulesUNO.g:794:4: rule__Entier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntier"


    // $ANTLR start "entryRuleBooleen"
    // InternalRulesUNO.g:803:1: entryRuleBooleen : ruleBooleen EOF ;
    public final void entryRuleBooleen() throws RecognitionException {
        try {
            // InternalRulesUNO.g:804:1: ( ruleBooleen EOF )
            // InternalRulesUNO.g:805:1: ruleBooleen EOF
            {
             before(grammarAccess.getBooleenRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleen();

            state._fsp--;

             after(grammarAccess.getBooleenRule()); 
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
    // $ANTLR end "entryRuleBooleen"


    // $ANTLR start "ruleBooleen"
    // InternalRulesUNO.g:812:1: ruleBooleen : ( ( rule__Booleen__Alternatives ) ) ;
    public final void ruleBooleen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:816:2: ( ( ( rule__Booleen__Alternatives ) ) )
            // InternalRulesUNO.g:817:2: ( ( rule__Booleen__Alternatives ) )
            {
            // InternalRulesUNO.g:817:2: ( ( rule__Booleen__Alternatives ) )
            // InternalRulesUNO.g:818:3: ( rule__Booleen__Alternatives )
            {
             before(grammarAccess.getBooleenAccess().getAlternatives()); 
            // InternalRulesUNO.g:819:3: ( rule__Booleen__Alternatives )
            // InternalRulesUNO.g:819:4: rule__Booleen__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleenAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleen"


    // $ANTLR start "entryRuleBooleanContraire"
    // InternalRulesUNO.g:828:1: entryRuleBooleanContraire : ruleBooleanContraire EOF ;
    public final void entryRuleBooleanContraire() throws RecognitionException {
        try {
            // InternalRulesUNO.g:829:1: ( ruleBooleanContraire EOF )
            // InternalRulesUNO.g:830:1: ruleBooleanContraire EOF
            {
             before(grammarAccess.getBooleanContraireRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanContraire();

            state._fsp--;

             after(grammarAccess.getBooleanContraireRule()); 
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
    // $ANTLR end "entryRuleBooleanContraire"


    // $ANTLR start "ruleBooleanContraire"
    // InternalRulesUNO.g:837:1: ruleBooleanContraire : ( ( rule__BooleanContraire__Group__0 ) ) ;
    public final void ruleBooleanContraire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:841:2: ( ( ( rule__BooleanContraire__Group__0 ) ) )
            // InternalRulesUNO.g:842:2: ( ( rule__BooleanContraire__Group__0 ) )
            {
            // InternalRulesUNO.g:842:2: ( ( rule__BooleanContraire__Group__0 ) )
            // InternalRulesUNO.g:843:3: ( rule__BooleanContraire__Group__0 )
            {
             before(grammarAccess.getBooleanContraireAccess().getGroup()); 
            // InternalRulesUNO.g:844:3: ( rule__BooleanContraire__Group__0 )
            // InternalRulesUNO.g:844:4: rule__BooleanContraire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanContraire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanContraireAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanContraire"


    // $ANTLR start "entryRuleCondition"
    // InternalRulesUNO.g:853:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalRulesUNO.g:854:1: ( ruleCondition EOF )
            // InternalRulesUNO.g:855:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalRulesUNO.g:862:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:866:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalRulesUNO.g:867:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalRulesUNO.g:867:2: ( ( rule__Condition__Group__0 ) )
            // InternalRulesUNO.g:868:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalRulesUNO.g:869:3: ( rule__Condition__Group__0 )
            // InternalRulesUNO.g:869:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "rule__ParticipantType__IdAlternatives_2_0"
    // InternalRulesUNO.g:877:1: rule__ParticipantType__IdAlternatives_2_0 : ( ( 'EQUIPE' ) | ( 'JOUEUR' ) );
    public final void rule__ParticipantType__IdAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:881:1: ( ( 'EQUIPE' ) | ( 'JOUEUR' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRulesUNO.g:882:2: ( 'EQUIPE' )
                    {
                    // InternalRulesUNO.g:882:2: ( 'EQUIPE' )
                    // InternalRulesUNO.g:883:3: 'EQUIPE'
                    {
                     before(grammarAccess.getParticipantTypeAccess().getIdEQUIPEKeyword_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getParticipantTypeAccess().getIdEQUIPEKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:888:2: ( 'JOUEUR' )
                    {
                    // InternalRulesUNO.g:888:2: ( 'JOUEUR' )
                    // InternalRulesUNO.g:889:3: 'JOUEUR'
                    {
                     before(grammarAccess.getParticipantTypeAccess().getIdJOUEURKeyword_2_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getParticipantTypeAccess().getIdJOUEURKeyword_2_0_1()); 

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
    // $ANTLR end "rule__ParticipantType__IdAlternatives_2_0"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRulesUNO.g:898:1: rule__Declaration__Alternatives : ( ( ruleInstruction ) | ( ruleCondition ) | ( ruleAffectation ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:902:1: ( ( ruleInstruction ) | ( ruleCondition ) | ( ruleAffectation ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalRulesUNO.g:903:2: ( ruleInstruction )
                    {
                    // InternalRulesUNO.g:903:2: ( ruleInstruction )
                    // InternalRulesUNO.g:904:3: ruleInstruction
                    {
                     before(grammarAccess.getDeclarationAccess().getInstructionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInstruction();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getInstructionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:909:2: ( ruleCondition )
                    {
                    // InternalRulesUNO.g:909:2: ( ruleCondition )
                    // InternalRulesUNO.g:910:3: ruleCondition
                    {
                     before(grammarAccess.getDeclarationAccess().getConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:915:2: ( ruleAffectation )
                    {
                    // InternalRulesUNO.g:915:2: ( ruleAffectation )
                    // InternalRulesUNO.g:916:3: ruleAffectation
                    {
                     before(grammarAccess.getDeclarationAccess().getAffectationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAffectation();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getAffectationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalRulesUNO.g:925:1: rule__Instruction__Alternatives : ( ( ruleInstructionsBloc ) | ( ( rule__Instruction__Group_1__0 ) ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:929:1: ( ( ruleInstructionsBloc ) | ( ( rule__Instruction__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==87) ) {
                alt3=1;
            }
            else if ( (LA3_0==11||(LA3_0>=28 && LA3_0<=33)||(LA3_0>=55 && LA3_0<=58)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRulesUNO.g:930:2: ( ruleInstructionsBloc )
                    {
                    // InternalRulesUNO.g:930:2: ( ruleInstructionsBloc )
                    // InternalRulesUNO.g:931:3: ruleInstructionsBloc
                    {
                     before(grammarAccess.getInstructionAccess().getInstructionsBlocParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInstructionsBloc();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getInstructionsBlocParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:936:2: ( ( rule__Instruction__Group_1__0 ) )
                    {
                    // InternalRulesUNO.g:936:2: ( ( rule__Instruction__Group_1__0 ) )
                    // InternalRulesUNO.g:937:3: ( rule__Instruction__Group_1__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_1()); 
                    // InternalRulesUNO.g:938:3: ( rule__Instruction__Group_1__0 )
                    // InternalRulesUNO.g:938:4: rule__Instruction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__VariableBooleene__Alternatives"
    // InternalRulesUNO.g:946:1: rule__VariableBooleene__Alternatives : ( ( ( rule__VariableBooleene__VarAssignment_0 ) ) | ( ( rule__VariableBooleene__ActionAssignment_1 ) ) );
    public final void rule__VariableBooleene__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:950:1: ( ( ( rule__VariableBooleene__VarAssignment_0 ) ) | ( ( rule__VariableBooleene__ActionAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||(LA4_0>=16 && LA4_0<=23)) ) {
                alt4=1;
            }
            else if ( (LA4_0==11||(LA4_0>=28 && LA4_0<=33)||(LA4_0>=55 && LA4_0<=58)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRulesUNO.g:951:2: ( ( rule__VariableBooleene__VarAssignment_0 ) )
                    {
                    // InternalRulesUNO.g:951:2: ( ( rule__VariableBooleene__VarAssignment_0 ) )
                    // InternalRulesUNO.g:952:3: ( rule__VariableBooleene__VarAssignment_0 )
                    {
                     before(grammarAccess.getVariableBooleeneAccess().getVarAssignment_0()); 
                    // InternalRulesUNO.g:953:3: ( rule__VariableBooleene__VarAssignment_0 )
                    // InternalRulesUNO.g:953:4: rule__VariableBooleene__VarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableBooleene__VarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableBooleeneAccess().getVarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:957:2: ( ( rule__VariableBooleene__ActionAssignment_1 ) )
                    {
                    // InternalRulesUNO.g:957:2: ( ( rule__VariableBooleene__ActionAssignment_1 ) )
                    // InternalRulesUNO.g:958:3: ( rule__VariableBooleene__ActionAssignment_1 )
                    {
                     before(grammarAccess.getVariableBooleeneAccess().getActionAssignment_1()); 
                    // InternalRulesUNO.g:959:3: ( rule__VariableBooleene__ActionAssignment_1 )
                    // InternalRulesUNO.g:959:4: rule__VariableBooleene__ActionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableBooleene__ActionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableBooleeneAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__VariableBooleene__Alternatives"


    // $ANTLR start "rule__Variante__Alternatives"
    // InternalRulesUNO.g:967:1: rule__Variante__Alternatives : ( ( 'BASE' ) | ( 'DEUX_JOUEURS' ) | ( 'UNO_CHALENGE' ) | ( 'EQUIPE' ) | ( 'CARTES_IDENTIQUES' ) | ( 'SUITES' ) | ( 'ZERO_ECHANGE' ) | ( 'ZERO_TOURNANT' ) | ( 'ZERO_QUESTION' ) );
    public final void rule__Variante__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:971:1: ( ( 'BASE' ) | ( 'DEUX_JOUEURS' ) | ( 'UNO_CHALENGE' ) | ( 'EQUIPE' ) | ( 'CARTES_IDENTIQUES' ) | ( 'SUITES' ) | ( 'ZERO_ECHANGE' ) | ( 'ZERO_TOURNANT' ) | ( 'ZERO_QUESTION' ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            case 22:
                {
                alt5=8;
                }
                break;
            case 23:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRulesUNO.g:972:2: ( 'BASE' )
                    {
                    // InternalRulesUNO.g:972:2: ( 'BASE' )
                    // InternalRulesUNO.g:973:3: 'BASE'
                    {
                     before(grammarAccess.getVarianteAccess().getBASEKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getBASEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:978:2: ( 'DEUX_JOUEURS' )
                    {
                    // InternalRulesUNO.g:978:2: ( 'DEUX_JOUEURS' )
                    // InternalRulesUNO.g:979:3: 'DEUX_JOUEURS'
                    {
                     before(grammarAccess.getVarianteAccess().getDEUX_JOUEURSKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getDEUX_JOUEURSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:984:2: ( 'UNO_CHALENGE' )
                    {
                    // InternalRulesUNO.g:984:2: ( 'UNO_CHALENGE' )
                    // InternalRulesUNO.g:985:3: 'UNO_CHALENGE'
                    {
                     before(grammarAccess.getVarianteAccess().getUNO_CHALENGEKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getUNO_CHALENGEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:990:2: ( 'EQUIPE' )
                    {
                    // InternalRulesUNO.g:990:2: ( 'EQUIPE' )
                    // InternalRulesUNO.g:991:3: 'EQUIPE'
                    {
                     before(grammarAccess.getVarianteAccess().getEQUIPEKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getEQUIPEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:996:2: ( 'CARTES_IDENTIQUES' )
                    {
                    // InternalRulesUNO.g:996:2: ( 'CARTES_IDENTIQUES' )
                    // InternalRulesUNO.g:997:3: 'CARTES_IDENTIQUES'
                    {
                     before(grammarAccess.getVarianteAccess().getCARTES_IDENTIQUESKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getCARTES_IDENTIQUESKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:1002:2: ( 'SUITES' )
                    {
                    // InternalRulesUNO.g:1002:2: ( 'SUITES' )
                    // InternalRulesUNO.g:1003:3: 'SUITES'
                    {
                     before(grammarAccess.getVarianteAccess().getSUITESKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getSUITESKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRulesUNO.g:1008:2: ( 'ZERO_ECHANGE' )
                    {
                    // InternalRulesUNO.g:1008:2: ( 'ZERO_ECHANGE' )
                    // InternalRulesUNO.g:1009:3: 'ZERO_ECHANGE'
                    {
                     before(grammarAccess.getVarianteAccess().getZERO_ECHANGEKeyword_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getZERO_ECHANGEKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRulesUNO.g:1014:2: ( 'ZERO_TOURNANT' )
                    {
                    // InternalRulesUNO.g:1014:2: ( 'ZERO_TOURNANT' )
                    // InternalRulesUNO.g:1015:3: 'ZERO_TOURNANT'
                    {
                     before(grammarAccess.getVarianteAccess().getZERO_TOURNANTKeyword_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getZERO_TOURNANTKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRulesUNO.g:1020:2: ( 'ZERO_QUESTION' )
                    {
                    // InternalRulesUNO.g:1020:2: ( 'ZERO_QUESTION' )
                    // InternalRulesUNO.g:1021:3: 'ZERO_QUESTION'
                    {
                     before(grammarAccess.getVarianteAccess().getZERO_QUESTIONKeyword_8()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getVarianteAccess().getZERO_QUESTIONKeyword_8()); 

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
    // $ANTLR end "rule__Variante__Alternatives"


    // $ANTLR start "rule__AttributManche__Alternatives"
    // InternalRulesUNO.g:1030:1: rule__AttributManche__Alternatives : ( ( 'NB_JOUEUR' ) | ( 'NB_PARTICIPANT' ) );
    public final void rule__AttributManche__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1034:1: ( ( 'NB_JOUEUR' ) | ( 'NB_PARTICIPANT' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRulesUNO.g:1035:2: ( 'NB_JOUEUR' )
                    {
                    // InternalRulesUNO.g:1035:2: ( 'NB_JOUEUR' )
                    // InternalRulesUNO.g:1036:3: 'NB_JOUEUR'
                    {
                     before(grammarAccess.getAttributMancheAccess().getNB_JOUEURKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAttributMancheAccess().getNB_JOUEURKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1041:2: ( 'NB_PARTICIPANT' )
                    {
                    // InternalRulesUNO.g:1041:2: ( 'NB_PARTICIPANT' )
                    // InternalRulesUNO.g:1042:3: 'NB_PARTICIPANT'
                    {
                     before(grammarAccess.getAttributMancheAccess().getNB_PARTICIPANTKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAttributMancheAccess().getNB_PARTICIPANTKeyword_1()); 

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
    // $ANTLR end "rule__AttributManche__Alternatives"


    // $ANTLR start "rule__ActionManche__Alternatives"
    // InternalRulesUNO.g:1051:1: rule__ActionManche__Alternatives : ( ( 'FINIR' ) | ( 'NOUVELLE' ) );
    public final void rule__ActionManche__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1055:1: ( ( 'FINIR' ) | ( 'NOUVELLE' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRulesUNO.g:1056:2: ( 'FINIR' )
                    {
                    // InternalRulesUNO.g:1056:2: ( 'FINIR' )
                    // InternalRulesUNO.g:1057:3: 'FINIR'
                    {
                     before(grammarAccess.getActionMancheAccess().getFINIRKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getActionMancheAccess().getFINIRKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1062:2: ( 'NOUVELLE' )
                    {
                    // InternalRulesUNO.g:1062:2: ( 'NOUVELLE' )
                    // InternalRulesUNO.g:1063:3: 'NOUVELLE'
                    {
                     before(grammarAccess.getActionMancheAccess().getNOUVELLEKeyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getActionMancheAccess().getNOUVELLEKeyword_1()); 

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
    // $ANTLR end "rule__ActionManche__Alternatives"


    // $ANTLR start "rule__Joueur__Alternatives"
    // InternalRulesUNO.g:1072:1: rule__Joueur__Alternatives : ( ( 'JOUEUR_COURRANT' ) | ( 'JOUEUR_SUIVANT' ) | ( 'JOUEUR_TOUS' ) | ( 'JOUEUR_AUTRE' ) | ( 'JOUEUR_EXISTE' ) | ( 'JOUEUR_SELECTIONNE' ) );
    public final void rule__Joueur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1076:1: ( ( 'JOUEUR_COURRANT' ) | ( 'JOUEUR_SUIVANT' ) | ( 'JOUEUR_TOUS' ) | ( 'JOUEUR_AUTRE' ) | ( 'JOUEUR_EXISTE' ) | ( 'JOUEUR_SELECTIONNE' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            case 32:
                {
                alt8=5;
                }
                break;
            case 33:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRulesUNO.g:1077:2: ( 'JOUEUR_COURRANT' )
                    {
                    // InternalRulesUNO.g:1077:2: ( 'JOUEUR_COURRANT' )
                    // InternalRulesUNO.g:1078:3: 'JOUEUR_COURRANT'
                    {
                     before(grammarAccess.getJoueurAccess().getJOUEUR_COURRANTKeyword_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getJoueurAccess().getJOUEUR_COURRANTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1083:2: ( 'JOUEUR_SUIVANT' )
                    {
                    // InternalRulesUNO.g:1083:2: ( 'JOUEUR_SUIVANT' )
                    // InternalRulesUNO.g:1084:3: 'JOUEUR_SUIVANT'
                    {
                     before(grammarAccess.getJoueurAccess().getJOUEUR_SUIVANTKeyword_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getJoueurAccess().getJOUEUR_SUIVANTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1089:2: ( 'JOUEUR_TOUS' )
                    {
                    // InternalRulesUNO.g:1089:2: ( 'JOUEUR_TOUS' )
                    // InternalRulesUNO.g:1090:3: 'JOUEUR_TOUS'
                    {
                     before(grammarAccess.getJoueurAccess().getJOUEUR_TOUSKeyword_2()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getJoueurAccess().getJOUEUR_TOUSKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1095:2: ( 'JOUEUR_AUTRE' )
                    {
                    // InternalRulesUNO.g:1095:2: ( 'JOUEUR_AUTRE' )
                    // InternalRulesUNO.g:1096:3: 'JOUEUR_AUTRE'
                    {
                     before(grammarAccess.getJoueurAccess().getJOUEUR_AUTREKeyword_3()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getJoueurAccess().getJOUEUR_AUTREKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:1101:2: ( 'JOUEUR_EXISTE' )
                    {
                    // InternalRulesUNO.g:1101:2: ( 'JOUEUR_EXISTE' )
                    // InternalRulesUNO.g:1102:3: 'JOUEUR_EXISTE'
                    {
                     before(grammarAccess.getJoueurAccess().getJOUEUR_EXISTEKeyword_4()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getJoueurAccess().getJOUEUR_EXISTEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:1107:2: ( 'JOUEUR_SELECTIONNE' )
                    {
                    // InternalRulesUNO.g:1107:2: ( 'JOUEUR_SELECTIONNE' )
                    // InternalRulesUNO.g:1108:3: 'JOUEUR_SELECTIONNE'
                    {
                     before(grammarAccess.getJoueurAccess().getJOUEUR_SELECTIONNEKeyword_5()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getJoueurAccess().getJOUEUR_SELECTIONNEKeyword_5()); 

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
    // $ANTLR end "rule__Joueur__Alternatives"


    // $ANTLR start "rule__ActionJoueur__Alternatives"
    // InternalRulesUNO.g:1117:1: rule__ActionJoueur__Alternatives : ( ( 'CRIER_UNO' ) | ( 'JOUER_CARTE_BASE' ) | ( 'JOUER_CARTE_JOKER' ) | ( 'JOUER_CARTE_INVERSER_SENS' ) | ( 'JOUER_CARTE_PASSE_TON_TOUR' ) | ( 'JOUER_CARTE_PLUS_2' ) | ( 'JOUER_CARTE_PLUS_4' ) | ( 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' ) | ( 'JOUER_CARTE_ZERO' ) | ( 'JOUER_SUITE_DE_CARTES' ) | ( 'POSER_QUESTION' ) | ( 'REJOUER' ) | ( 'PASSER_SON_TOUR' ) | ( 'CHANGER_COULEUR' ) | ( 'CHOISIR_COULEUR' ) | ( 'PIOCHER_2_CARTES' ) | ( 'PIOCHER_4_CARTES' ) | ( 'INVERSER_SENS' ) | ( 'DONNER_CARTES_AU_JOUEUR_SUIVANT' ) | ( 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' ) | ( 'REMARQUER_ERREUR_UNO' ) );
    public final void rule__ActionJoueur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1121:1: ( ( 'CRIER_UNO' ) | ( 'JOUER_CARTE_BASE' ) | ( 'JOUER_CARTE_JOKER' ) | ( 'JOUER_CARTE_INVERSER_SENS' ) | ( 'JOUER_CARTE_PASSE_TON_TOUR' ) | ( 'JOUER_CARTE_PLUS_2' ) | ( 'JOUER_CARTE_PLUS_4' ) | ( 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' ) | ( 'JOUER_CARTE_ZERO' ) | ( 'JOUER_SUITE_DE_CARTES' ) | ( 'POSER_QUESTION' ) | ( 'REJOUER' ) | ( 'PASSER_SON_TOUR' ) | ( 'CHANGER_COULEUR' ) | ( 'CHOISIR_COULEUR' ) | ( 'PIOCHER_2_CARTES' ) | ( 'PIOCHER_4_CARTES' ) | ( 'INVERSER_SENS' ) | ( 'DONNER_CARTES_AU_JOUEUR_SUIVANT' ) | ( 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' ) | ( 'REMARQUER_ERREUR_UNO' ) )
            int alt9=21;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 37:
                {
                alt9=4;
                }
                break;
            case 38:
                {
                alt9=5;
                }
                break;
            case 39:
                {
                alt9=6;
                }
                break;
            case 40:
                {
                alt9=7;
                }
                break;
            case 41:
                {
                alt9=8;
                }
                break;
            case 42:
                {
                alt9=9;
                }
                break;
            case 43:
                {
                alt9=10;
                }
                break;
            case 44:
                {
                alt9=11;
                }
                break;
            case 45:
                {
                alt9=12;
                }
                break;
            case 46:
                {
                alt9=13;
                }
                break;
            case 47:
                {
                alt9=14;
                }
                break;
            case 48:
                {
                alt9=15;
                }
                break;
            case 49:
                {
                alt9=16;
                }
                break;
            case 50:
                {
                alt9=17;
                }
                break;
            case 51:
                {
                alt9=18;
                }
                break;
            case 52:
                {
                alt9=19;
                }
                break;
            case 53:
                {
                alt9=20;
                }
                break;
            case 54:
                {
                alt9=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRulesUNO.g:1122:2: ( 'CRIER_UNO' )
                    {
                    // InternalRulesUNO.g:1122:2: ( 'CRIER_UNO' )
                    // InternalRulesUNO.g:1123:3: 'CRIER_UNO'
                    {
                     before(grammarAccess.getActionJoueurAccess().getCRIER_UNOKeyword_0()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getCRIER_UNOKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1128:2: ( 'JOUER_CARTE_BASE' )
                    {
                    // InternalRulesUNO.g:1128:2: ( 'JOUER_CARTE_BASE' )
                    // InternalRulesUNO.g:1129:3: 'JOUER_CARTE_BASE'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_BASEKeyword_1()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_BASEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1134:2: ( 'JOUER_CARTE_JOKER' )
                    {
                    // InternalRulesUNO.g:1134:2: ( 'JOUER_CARTE_JOKER' )
                    // InternalRulesUNO.g:1135:3: 'JOUER_CARTE_JOKER'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_JOKERKeyword_2()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_JOKERKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1140:2: ( 'JOUER_CARTE_INVERSER_SENS' )
                    {
                    // InternalRulesUNO.g:1140:2: ( 'JOUER_CARTE_INVERSER_SENS' )
                    // InternalRulesUNO.g:1141:3: 'JOUER_CARTE_INVERSER_SENS'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_INVERSER_SENSKeyword_3()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_INVERSER_SENSKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:1146:2: ( 'JOUER_CARTE_PASSE_TON_TOUR' )
                    {
                    // InternalRulesUNO.g:1146:2: ( 'JOUER_CARTE_PASSE_TON_TOUR' )
                    // InternalRulesUNO.g:1147:3: 'JOUER_CARTE_PASSE_TON_TOUR'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PASSE_TON_TOURKeyword_4()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PASSE_TON_TOURKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:1152:2: ( 'JOUER_CARTE_PLUS_2' )
                    {
                    // InternalRulesUNO.g:1152:2: ( 'JOUER_CARTE_PLUS_2' )
                    // InternalRulesUNO.g:1153:3: 'JOUER_CARTE_PLUS_2'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PLUS_2Keyword_5()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PLUS_2Keyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRulesUNO.g:1158:2: ( 'JOUER_CARTE_PLUS_4' )
                    {
                    // InternalRulesUNO.g:1158:2: ( 'JOUER_CARTE_PLUS_4' )
                    // InternalRulesUNO.g:1159:3: 'JOUER_CARTE_PLUS_4'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PLUS_4Keyword_6()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_PLUS_4Keyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRulesUNO.g:1164:2: ( 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' )
                    {
                    // InternalRulesUNO.g:1164:2: ( 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' )
                    // InternalRulesUNO.g:1165:3: 'JOUER_PLUSIEURS_CARTES_IDENTIQUES'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_PLUSIEURS_CARTES_IDENTIQUESKeyword_7()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_PLUSIEURS_CARTES_IDENTIQUESKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRulesUNO.g:1170:2: ( 'JOUER_CARTE_ZERO' )
                    {
                    // InternalRulesUNO.g:1170:2: ( 'JOUER_CARTE_ZERO' )
                    // InternalRulesUNO.g:1171:3: 'JOUER_CARTE_ZERO'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_ZEROKeyword_8()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_CARTE_ZEROKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRulesUNO.g:1176:2: ( 'JOUER_SUITE_DE_CARTES' )
                    {
                    // InternalRulesUNO.g:1176:2: ( 'JOUER_SUITE_DE_CARTES' )
                    // InternalRulesUNO.g:1177:3: 'JOUER_SUITE_DE_CARTES'
                    {
                     before(grammarAccess.getActionJoueurAccess().getJOUER_SUITE_DE_CARTESKeyword_9()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getJOUER_SUITE_DE_CARTESKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRulesUNO.g:1182:2: ( 'POSER_QUESTION' )
                    {
                    // InternalRulesUNO.g:1182:2: ( 'POSER_QUESTION' )
                    // InternalRulesUNO.g:1183:3: 'POSER_QUESTION'
                    {
                     before(grammarAccess.getActionJoueurAccess().getPOSER_QUESTIONKeyword_10()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getPOSER_QUESTIONKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalRulesUNO.g:1188:2: ( 'REJOUER' )
                    {
                    // InternalRulesUNO.g:1188:2: ( 'REJOUER' )
                    // InternalRulesUNO.g:1189:3: 'REJOUER'
                    {
                     before(grammarAccess.getActionJoueurAccess().getREJOUERKeyword_11()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getREJOUERKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalRulesUNO.g:1194:2: ( 'PASSER_SON_TOUR' )
                    {
                    // InternalRulesUNO.g:1194:2: ( 'PASSER_SON_TOUR' )
                    // InternalRulesUNO.g:1195:3: 'PASSER_SON_TOUR'
                    {
                     before(grammarAccess.getActionJoueurAccess().getPASSER_SON_TOURKeyword_12()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getPASSER_SON_TOURKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalRulesUNO.g:1200:2: ( 'CHANGER_COULEUR' )
                    {
                    // InternalRulesUNO.g:1200:2: ( 'CHANGER_COULEUR' )
                    // InternalRulesUNO.g:1201:3: 'CHANGER_COULEUR'
                    {
                     before(grammarAccess.getActionJoueurAccess().getCHANGER_COULEURKeyword_13()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getCHANGER_COULEURKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalRulesUNO.g:1206:2: ( 'CHOISIR_COULEUR' )
                    {
                    // InternalRulesUNO.g:1206:2: ( 'CHOISIR_COULEUR' )
                    // InternalRulesUNO.g:1207:3: 'CHOISIR_COULEUR'
                    {
                     before(grammarAccess.getActionJoueurAccess().getCHOISIR_COULEURKeyword_14()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getCHOISIR_COULEURKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalRulesUNO.g:1212:2: ( 'PIOCHER_2_CARTES' )
                    {
                    // InternalRulesUNO.g:1212:2: ( 'PIOCHER_2_CARTES' )
                    // InternalRulesUNO.g:1213:3: 'PIOCHER_2_CARTES'
                    {
                     before(grammarAccess.getActionJoueurAccess().getPIOCHER_2_CARTESKeyword_15()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getPIOCHER_2_CARTESKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalRulesUNO.g:1218:2: ( 'PIOCHER_4_CARTES' )
                    {
                    // InternalRulesUNO.g:1218:2: ( 'PIOCHER_4_CARTES' )
                    // InternalRulesUNO.g:1219:3: 'PIOCHER_4_CARTES'
                    {
                     before(grammarAccess.getActionJoueurAccess().getPIOCHER_4_CARTESKeyword_16()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getPIOCHER_4_CARTESKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalRulesUNO.g:1224:2: ( 'INVERSER_SENS' )
                    {
                    // InternalRulesUNO.g:1224:2: ( 'INVERSER_SENS' )
                    // InternalRulesUNO.g:1225:3: 'INVERSER_SENS'
                    {
                     before(grammarAccess.getActionJoueurAccess().getINVERSER_SENSKeyword_17()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getINVERSER_SENSKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalRulesUNO.g:1230:2: ( 'DONNER_CARTES_AU_JOUEUR_SUIVANT' )
                    {
                    // InternalRulesUNO.g:1230:2: ( 'DONNER_CARTES_AU_JOUEUR_SUIVANT' )
                    // InternalRulesUNO.g:1231:3: 'DONNER_CARTES_AU_JOUEUR_SUIVANT'
                    {
                     before(grammarAccess.getActionJoueurAccess().getDONNER_CARTES_AU_JOUEUR_SUIVANTKeyword_18()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getDONNER_CARTES_AU_JOUEUR_SUIVANTKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalRulesUNO.g:1236:2: ( 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' )
                    {
                    // InternalRulesUNO.g:1236:2: ( 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' )
                    // InternalRulesUNO.g:1237:3: 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE'
                    {
                     before(grammarAccess.getActionJoueurAccess().getECHANGER_JEU_AVEC_UN_ADVERSAIREKeyword_19()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getECHANGER_JEU_AVEC_UN_ADVERSAIREKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalRulesUNO.g:1242:2: ( 'REMARQUER_ERREUR_UNO' )
                    {
                    // InternalRulesUNO.g:1242:2: ( 'REMARQUER_ERREUR_UNO' )
                    // InternalRulesUNO.g:1243:3: 'REMARQUER_ERREUR_UNO'
                    {
                     before(grammarAccess.getActionJoueurAccess().getREMARQUER_ERREUR_UNOKeyword_20()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getActionJoueurAccess().getREMARQUER_ERREUR_UNOKeyword_20()); 

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
    // $ANTLR end "rule__ActionJoueur__Alternatives"


    // $ANTLR start "rule__Participant__Alternatives"
    // InternalRulesUNO.g:1252:1: rule__Participant__Alternatives : ( ( 'PARTICIPANT_COURRANT' ) | ( 'PARTICIPANT_EXISTE' ) | ( 'PARTICIPANT_SELECTIONNE' ) | ( 'PARTICIPANT_MIN_POINTS' ) );
    public final void rule__Participant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1256:1: ( ( 'PARTICIPANT_COURRANT' ) | ( 'PARTICIPANT_EXISTE' ) | ( 'PARTICIPANT_SELECTIONNE' ) | ( 'PARTICIPANT_MIN_POINTS' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt10=1;
                }
                break;
            case 56:
                {
                alt10=2;
                }
                break;
            case 57:
                {
                alt10=3;
                }
                break;
            case 58:
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
                    // InternalRulesUNO.g:1257:2: ( 'PARTICIPANT_COURRANT' )
                    {
                    // InternalRulesUNO.g:1257:2: ( 'PARTICIPANT_COURRANT' )
                    // InternalRulesUNO.g:1258:3: 'PARTICIPANT_COURRANT'
                    {
                     before(grammarAccess.getParticipantAccess().getPARTICIPANT_COURRANTKeyword_0()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getParticipantAccess().getPARTICIPANT_COURRANTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1263:2: ( 'PARTICIPANT_EXISTE' )
                    {
                    // InternalRulesUNO.g:1263:2: ( 'PARTICIPANT_EXISTE' )
                    // InternalRulesUNO.g:1264:3: 'PARTICIPANT_EXISTE'
                    {
                     before(grammarAccess.getParticipantAccess().getPARTICIPANT_EXISTEKeyword_1()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getParticipantAccess().getPARTICIPANT_EXISTEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1269:2: ( 'PARTICIPANT_SELECTIONNE' )
                    {
                    // InternalRulesUNO.g:1269:2: ( 'PARTICIPANT_SELECTIONNE' )
                    // InternalRulesUNO.g:1270:3: 'PARTICIPANT_SELECTIONNE'
                    {
                     before(grammarAccess.getParticipantAccess().getPARTICIPANT_SELECTIONNEKeyword_2()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getParticipantAccess().getPARTICIPANT_SELECTIONNEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1275:2: ( 'PARTICIPANT_MIN_POINTS' )
                    {
                    // InternalRulesUNO.g:1275:2: ( 'PARTICIPANT_MIN_POINTS' )
                    // InternalRulesUNO.g:1276:3: 'PARTICIPANT_MIN_POINTS'
                    {
                     before(grammarAccess.getParticipantAccess().getPARTICIPANT_MIN_POINTSKeyword_3()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getParticipantAccess().getPARTICIPANT_MIN_POINTSKeyword_3()); 

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
    // $ANTLR end "rule__Participant__Alternatives"


    // $ANTLR start "rule__ActionParticipant__Alternatives"
    // InternalRulesUNO.g:1285:1: rule__ActionParticipant__Alternatives : ( ( 'GAGNER' ) | ( 'PERDRE' ) | ( 'ETRE_ELIMINE' ) );
    public final void rule__ActionParticipant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1289:1: ( ( 'GAGNER' ) | ( 'PERDRE' ) | ( 'ETRE_ELIMINE' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt11=1;
                }
                break;
            case 60:
                {
                alt11=2;
                }
                break;
            case 61:
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
                    // InternalRulesUNO.g:1290:2: ( 'GAGNER' )
                    {
                    // InternalRulesUNO.g:1290:2: ( 'GAGNER' )
                    // InternalRulesUNO.g:1291:3: 'GAGNER'
                    {
                     before(grammarAccess.getActionParticipantAccess().getGAGNERKeyword_0()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getActionParticipantAccess().getGAGNERKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1296:2: ( 'PERDRE' )
                    {
                    // InternalRulesUNO.g:1296:2: ( 'PERDRE' )
                    // InternalRulesUNO.g:1297:3: 'PERDRE'
                    {
                     before(grammarAccess.getActionParticipantAccess().getPERDREKeyword_1()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getActionParticipantAccess().getPERDREKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1302:2: ( 'ETRE_ELIMINE' )
                    {
                    // InternalRulesUNO.g:1302:2: ( 'ETRE_ELIMINE' )
                    // InternalRulesUNO.g:1303:3: 'ETRE_ELIMINE'
                    {
                     before(grammarAccess.getActionParticipantAccess().getETRE_ELIMINEKeyword_2()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getActionParticipantAccess().getETRE_ELIMINEKeyword_2()); 

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
    // $ANTLR end "rule__ActionParticipant__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalRulesUNO.g:1312:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1316:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt12=1;
                }
                break;
            case 11:
                {
                alt12=2;
                }
                break;
            case 55:
            case 56:
            case 57:
            case 58:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRulesUNO.g:1317:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalRulesUNO.g:1317:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalRulesUNO.g:1318:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalRulesUNO.g:1319:3: ( rule__Action__Group_0__0 )
                    // InternalRulesUNO.g:1319:4: rule__Action__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1323:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalRulesUNO.g:1323:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalRulesUNO.g:1324:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalRulesUNO.g:1325:3: ( rule__Action__Group_1__0 )
                    // InternalRulesUNO.g:1325:4: rule__Action__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1329:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalRulesUNO.g:1329:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalRulesUNO.g:1330:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalRulesUNO.g:1331:3: ( rule__Action__Group_2__0 )
                    // InternalRulesUNO.g:1331:4: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Attribut__Alternatives"
    // InternalRulesUNO.g:1339:1: rule__Attribut__Alternatives : ( ( ( rule__Attribut__Group_0__0 ) ) | ( ( rule__Attribut__Group_1__0 ) ) | ( ( rule__Attribut__Group_2__0 ) ) );
    public final void rule__Attribut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1343:1: ( ( ( rule__Attribut__Group_0__0 ) ) | ( ( rule__Attribut__Group_1__0 ) ) | ( ( rule__Attribut__Group_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt13=1;
                }
                break;
            case 11:
                {
                alt13=2;
                }
                break;
            case 55:
            case 56:
            case 57:
            case 58:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRulesUNO.g:1344:2: ( ( rule__Attribut__Group_0__0 ) )
                    {
                    // InternalRulesUNO.g:1344:2: ( ( rule__Attribut__Group_0__0 ) )
                    // InternalRulesUNO.g:1345:3: ( rule__Attribut__Group_0__0 )
                    {
                     before(grammarAccess.getAttributAccess().getGroup_0()); 
                    // InternalRulesUNO.g:1346:3: ( rule__Attribut__Group_0__0 )
                    // InternalRulesUNO.g:1346:4: rule__Attribut__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribut__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1350:2: ( ( rule__Attribut__Group_1__0 ) )
                    {
                    // InternalRulesUNO.g:1350:2: ( ( rule__Attribut__Group_1__0 ) )
                    // InternalRulesUNO.g:1351:3: ( rule__Attribut__Group_1__0 )
                    {
                     before(grammarAccess.getAttributAccess().getGroup_1()); 
                    // InternalRulesUNO.g:1352:3: ( rule__Attribut__Group_1__0 )
                    // InternalRulesUNO.g:1352:4: rule__Attribut__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribut__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1356:2: ( ( rule__Attribut__Group_2__0 ) )
                    {
                    // InternalRulesUNO.g:1356:2: ( ( rule__Attribut__Group_2__0 ) )
                    // InternalRulesUNO.g:1357:3: ( rule__Attribut__Group_2__0 )
                    {
                     before(grammarAccess.getAttributAccess().getGroup_2()); 
                    // InternalRulesUNO.g:1358:3: ( rule__Attribut__Group_2__0 )
                    // InternalRulesUNO.g:1358:4: rule__Attribut__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribut__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Attribut__Alternatives"


    // $ANTLR start "rule__Operateur__Alternatives"
    // InternalRulesUNO.g:1366:1: rule__Operateur__Alternatives : ( ( '+' ) | ( '-' ) | ( '%' ) );
    public final void rule__Operateur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1370:1: ( ( '+' ) | ( '-' ) | ( '%' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt14=1;
                }
                break;
            case 63:
                {
                alt14=2;
                }
                break;
            case 64:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRulesUNO.g:1371:2: ( '+' )
                    {
                    // InternalRulesUNO.g:1371:2: ( '+' )
                    // InternalRulesUNO.g:1372:3: '+'
                    {
                     before(grammarAccess.getOperateurAccess().getPlusSignKeyword_0()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getOperateurAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1377:2: ( '-' )
                    {
                    // InternalRulesUNO.g:1377:2: ( '-' )
                    // InternalRulesUNO.g:1378:3: '-'
                    {
                     before(grammarAccess.getOperateurAccess().getHyphenMinusKeyword_1()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getOperateurAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1383:2: ( '%' )
                    {
                    // InternalRulesUNO.g:1383:2: ( '%' )
                    // InternalRulesUNO.g:1384:3: '%'
                    {
                     before(grammarAccess.getOperateurAccess().getPercentSignKeyword_2()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getOperateurAccess().getPercentSignKeyword_2()); 

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
    // $ANTLR end "rule__Operateur__Alternatives"


    // $ANTLR start "rule__Comparateur__Alternatives"
    // InternalRulesUNO.g:1393:1: rule__Comparateur__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) | ( '!=' ) );
    public final void rule__Comparateur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1397:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '==' ) | ( '!=' ) )
            int alt15=6;
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
            case 69:
                {
                alt15=5;
                }
                break;
            case 70:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRulesUNO.g:1398:2: ( '>' )
                    {
                    // InternalRulesUNO.g:1398:2: ( '>' )
                    // InternalRulesUNO.g:1399:3: '>'
                    {
                     before(grammarAccess.getComparateurAccess().getGreaterThanSignKeyword_0()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getComparateurAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1404:2: ( '<' )
                    {
                    // InternalRulesUNO.g:1404:2: ( '<' )
                    // InternalRulesUNO.g:1405:3: '<'
                    {
                     before(grammarAccess.getComparateurAccess().getLessThanSignKeyword_1()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getComparateurAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1410:2: ( '>=' )
                    {
                    // InternalRulesUNO.g:1410:2: ( '>=' )
                    // InternalRulesUNO.g:1411:3: '>='
                    {
                     before(grammarAccess.getComparateurAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getComparateurAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1416:2: ( '<=' )
                    {
                    // InternalRulesUNO.g:1416:2: ( '<=' )
                    // InternalRulesUNO.g:1417:3: '<='
                    {
                     before(grammarAccess.getComparateurAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getComparateurAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRulesUNO.g:1422:2: ( '==' )
                    {
                    // InternalRulesUNO.g:1422:2: ( '==' )
                    // InternalRulesUNO.g:1423:3: '=='
                    {
                     before(grammarAccess.getComparateurAccess().getEqualsSignEqualsSignKeyword_4()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getComparateurAccess().getEqualsSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRulesUNO.g:1428:2: ( '!=' )
                    {
                    // InternalRulesUNO.g:1428:2: ( '!=' )
                    // InternalRulesUNO.g:1429:3: '!='
                    {
                     before(grammarAccess.getComparateurAccess().getExclamationMarkEqualsSignKeyword_5()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getComparateurAccess().getExclamationMarkEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__Comparateur__Alternatives"


    // $ANTLR start "rule__Logique__Alternatives"
    // InternalRulesUNO.g:1438:1: rule__Logique__Alternatives : ( ( '&&' ) | ( '||' ) | ( '->' ) | ( '<->' ) );
    public final void rule__Logique__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1442:1: ( ( '&&' ) | ( '||' ) | ( '->' ) | ( '<->' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt16=1;
                }
                break;
            case 72:
                {
                alt16=2;
                }
                break;
            case 73:
                {
                alt16=3;
                }
                break;
            case 74:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRulesUNO.g:1443:2: ( '&&' )
                    {
                    // InternalRulesUNO.g:1443:2: ( '&&' )
                    // InternalRulesUNO.g:1444:3: '&&'
                    {
                     before(grammarAccess.getLogiqueAccess().getAmpersandAmpersandKeyword_0()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getLogiqueAccess().getAmpersandAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1449:2: ( '||' )
                    {
                    // InternalRulesUNO.g:1449:2: ( '||' )
                    // InternalRulesUNO.g:1450:3: '||'
                    {
                     before(grammarAccess.getLogiqueAccess().getVerticalLineVerticalLineKeyword_1()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getLogiqueAccess().getVerticalLineVerticalLineKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1455:2: ( '->' )
                    {
                    // InternalRulesUNO.g:1455:2: ( '->' )
                    // InternalRulesUNO.g:1456:3: '->'
                    {
                     before(grammarAccess.getLogiqueAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
                    match(input,73,FOLLOW_2); 
                     after(grammarAccess.getLogiqueAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRulesUNO.g:1461:2: ( '<->' )
                    {
                    // InternalRulesUNO.g:1461:2: ( '<->' )
                    // InternalRulesUNO.g:1462:3: '<->'
                    {
                     before(grammarAccess.getLogiqueAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
                    match(input,74,FOLLOW_2); 
                     after(grammarAccess.getLogiqueAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Logique__Alternatives"


    // $ANTLR start "rule__ExpressionBooleene__ExpAlternatives_0_0"
    // InternalRulesUNO.g:1471:1: rule__ExpressionBooleene__ExpAlternatives_0_0 : ( ( ruleBooleen ) | ( ruleBooleanContraire ) );
    public final void rule__ExpressionBooleene__ExpAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1475:1: ( ( ruleBooleen ) | ( ruleBooleanContraire ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==11||LA17_0==14||(LA17_0>=16 && LA17_0<=23)||(LA17_0>=28 && LA17_0<=33)||(LA17_0>=55 && LA17_0<=58)||(LA17_0>=75 && LA17_0<=76)) ) {
                alt17=1;
            }
            else if ( (LA17_0==90) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRulesUNO.g:1476:2: ( ruleBooleen )
                    {
                    // InternalRulesUNO.g:1476:2: ( ruleBooleen )
                    // InternalRulesUNO.g:1477:3: ruleBooleen
                    {
                     before(grammarAccess.getExpressionBooleeneAccess().getExpBooleenParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleen();

                    state._fsp--;

                     after(grammarAccess.getExpressionBooleeneAccess().getExpBooleenParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1482:2: ( ruleBooleanContraire )
                    {
                    // InternalRulesUNO.g:1482:2: ( ruleBooleanContraire )
                    // InternalRulesUNO.g:1483:3: ruleBooleanContraire
                    {
                     before(grammarAccess.getExpressionBooleeneAccess().getExpBooleanContraireParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanContraire();

                    state._fsp--;

                     after(grammarAccess.getExpressionBooleeneAccess().getExpBooleanContraireParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__ExpressionBooleene__ExpAlternatives_0_0"


    // $ANTLR start "rule__ExpressionBooleene__ExpAlternatives_1_1_0"
    // InternalRulesUNO.g:1492:1: rule__ExpressionBooleene__ExpAlternatives_1_1_0 : ( ( ruleBooleen ) | ( ruleBooleanContraire ) );
    public final void rule__ExpressionBooleene__ExpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1496:1: ( ( ruleBooleen ) | ( ruleBooleanContraire ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT||LA18_0==11||LA18_0==14||(LA18_0>=16 && LA18_0<=23)||(LA18_0>=28 && LA18_0<=33)||(LA18_0>=55 && LA18_0<=58)||(LA18_0>=75 && LA18_0<=76)) ) {
                alt18=1;
            }
            else if ( (LA18_0==90) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRulesUNO.g:1497:2: ( ruleBooleen )
                    {
                    // InternalRulesUNO.g:1497:2: ( ruleBooleen )
                    // InternalRulesUNO.g:1498:3: ruleBooleen
                    {
                     before(grammarAccess.getExpressionBooleeneAccess().getExpBooleenParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleen();

                    state._fsp--;

                     after(grammarAccess.getExpressionBooleeneAccess().getExpBooleenParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1503:2: ( ruleBooleanContraire )
                    {
                    // InternalRulesUNO.g:1503:2: ( ruleBooleanContraire )
                    // InternalRulesUNO.g:1504:3: ruleBooleanContraire
                    {
                     before(grammarAccess.getExpressionBooleeneAccess().getExpBooleanContraireParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanContraire();

                    state._fsp--;

                     after(grammarAccess.getExpressionBooleeneAccess().getExpBooleanContraireParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__ExpressionBooleene__ExpAlternatives_1_1_0"


    // $ANTLR start "rule__Entier__Alternatives"
    // InternalRulesUNO.g:1513:1: rule__Entier__Alternatives : ( ( ( rule__Entier__ValAssignment_0 ) ) | ( ( rule__Entier__AttAssignment_1 ) ) );
    public final void rule__Entier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1517:1: ( ( ( rule__Entier__ValAssignment_0 ) ) | ( ( rule__Entier__AttAssignment_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==11||(LA19_0>=28 && LA19_0<=33)||(LA19_0>=55 && LA19_0<=58)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRulesUNO.g:1518:2: ( ( rule__Entier__ValAssignment_0 ) )
                    {
                    // InternalRulesUNO.g:1518:2: ( ( rule__Entier__ValAssignment_0 ) )
                    // InternalRulesUNO.g:1519:3: ( rule__Entier__ValAssignment_0 )
                    {
                     before(grammarAccess.getEntierAccess().getValAssignment_0()); 
                    // InternalRulesUNO.g:1520:3: ( rule__Entier__ValAssignment_0 )
                    // InternalRulesUNO.g:1520:4: rule__Entier__ValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entier__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntierAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1524:2: ( ( rule__Entier__AttAssignment_1 ) )
                    {
                    // InternalRulesUNO.g:1524:2: ( ( rule__Entier__AttAssignment_1 ) )
                    // InternalRulesUNO.g:1525:3: ( rule__Entier__AttAssignment_1 )
                    {
                     before(grammarAccess.getEntierAccess().getAttAssignment_1()); 
                    // InternalRulesUNO.g:1526:3: ( rule__Entier__AttAssignment_1 )
                    // InternalRulesUNO.g:1526:4: rule__Entier__AttAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entier__AttAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntierAccess().getAttAssignment_1()); 

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
    // $ANTLR end "rule__Entier__Alternatives"


    // $ANTLR start "rule__Booleen__Alternatives"
    // InternalRulesUNO.g:1534:1: rule__Booleen__Alternatives : ( ( ( rule__Booleen__ValAssignment_0 ) ) | ( ( rule__Booleen__VarAssignment_1 ) ) | ( ( rule__Booleen__Group_2__0 ) ) );
    public final void rule__Booleen__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1538:1: ( ( ( rule__Booleen__ValAssignment_0 ) ) | ( ( rule__Booleen__VarAssignment_1 ) ) | ( ( rule__Booleen__Group_2__0 ) ) )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalRulesUNO.g:1539:2: ( ( rule__Booleen__ValAssignment_0 ) )
                    {
                    // InternalRulesUNO.g:1539:2: ( ( rule__Booleen__ValAssignment_0 ) )
                    // InternalRulesUNO.g:1540:3: ( rule__Booleen__ValAssignment_0 )
                    {
                     before(grammarAccess.getBooleenAccess().getValAssignment_0()); 
                    // InternalRulesUNO.g:1541:3: ( rule__Booleen__ValAssignment_0 )
                    // InternalRulesUNO.g:1541:4: rule__Booleen__ValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Booleen__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleenAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1545:2: ( ( rule__Booleen__VarAssignment_1 ) )
                    {
                    // InternalRulesUNO.g:1545:2: ( ( rule__Booleen__VarAssignment_1 ) )
                    // InternalRulesUNO.g:1546:3: ( rule__Booleen__VarAssignment_1 )
                    {
                     before(grammarAccess.getBooleenAccess().getVarAssignment_1()); 
                    // InternalRulesUNO.g:1547:3: ( rule__Booleen__VarAssignment_1 )
                    // InternalRulesUNO.g:1547:4: rule__Booleen__VarAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Booleen__VarAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleenAccess().getVarAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRulesUNO.g:1551:2: ( ( rule__Booleen__Group_2__0 ) )
                    {
                    // InternalRulesUNO.g:1551:2: ( ( rule__Booleen__Group_2__0 ) )
                    // InternalRulesUNO.g:1552:3: ( rule__Booleen__Group_2__0 )
                    {
                     before(grammarAccess.getBooleenAccess().getGroup_2()); 
                    // InternalRulesUNO.g:1553:3: ( rule__Booleen__Group_2__0 )
                    // InternalRulesUNO.g:1553:4: rule__Booleen__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Booleen__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleenAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Booleen__Alternatives"


    // $ANTLR start "rule__Booleen__ValAlternatives_0_0"
    // InternalRulesUNO.g:1561:1: rule__Booleen__ValAlternatives_0_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Booleen__ValAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1565:1: ( ( 'true' ) | ( 'false' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==75) ) {
                alt21=1;
            }
            else if ( (LA21_0==76) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRulesUNO.g:1566:2: ( 'true' )
                    {
                    // InternalRulesUNO.g:1566:2: ( 'true' )
                    // InternalRulesUNO.g:1567:3: 'true'
                    {
                     before(grammarAccess.getBooleenAccess().getValTrueKeyword_0_0_0()); 
                    match(input,75,FOLLOW_2); 
                     after(grammarAccess.getBooleenAccess().getValTrueKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:1572:2: ( 'false' )
                    {
                    // InternalRulesUNO.g:1572:2: ( 'false' )
                    // InternalRulesUNO.g:1573:3: 'false'
                    {
                     before(grammarAccess.getBooleenAccess().getValFalseKeyword_0_0_1()); 
                    match(input,76,FOLLOW_2); 
                     after(grammarAccess.getBooleenAccess().getValFalseKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Booleen__ValAlternatives_0_0"


    // $ANTLR start "rule__Uno__Group__0"
    // InternalRulesUNO.g:1582:1: rule__Uno__Group__0 : rule__Uno__Group__0__Impl rule__Uno__Group__1 ;
    public final void rule__Uno__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1586:1: ( rule__Uno__Group__0__Impl rule__Uno__Group__1 )
            // InternalRulesUNO.g:1587:2: rule__Uno__Group__0__Impl rule__Uno__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Uno__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__1();

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
    // $ANTLR end "rule__Uno__Group__0"


    // $ANTLR start "rule__Uno__Group__0__Impl"
    // InternalRulesUNO.g:1594:1: rule__Uno__Group__0__Impl : ( 'RUno' ) ;
    public final void rule__Uno__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1598:1: ( ( 'RUno' ) )
            // InternalRulesUNO.g:1599:1: ( 'RUno' )
            {
            // InternalRulesUNO.g:1599:1: ( 'RUno' )
            // InternalRulesUNO.g:1600:2: 'RUno'
            {
             before(grammarAccess.getUnoAccess().getRUnoKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getRUnoKeyword_0()); 

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
    // $ANTLR end "rule__Uno__Group__0__Impl"


    // $ANTLR start "rule__Uno__Group__1"
    // InternalRulesUNO.g:1609:1: rule__Uno__Group__1 : rule__Uno__Group__1__Impl rule__Uno__Group__2 ;
    public final void rule__Uno__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1613:1: ( rule__Uno__Group__1__Impl rule__Uno__Group__2 )
            // InternalRulesUNO.g:1614:2: rule__Uno__Group__1__Impl rule__Uno__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Uno__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__2();

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
    // $ANTLR end "rule__Uno__Group__1"


    // $ANTLR start "rule__Uno__Group__1__Impl"
    // InternalRulesUNO.g:1621:1: rule__Uno__Group__1__Impl : ( '{' ) ;
    public final void rule__Uno__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1625:1: ( ( '{' ) )
            // InternalRulesUNO.g:1626:1: ( '{' )
            {
            // InternalRulesUNO.g:1626:1: ( '{' )
            // InternalRulesUNO.g:1627:2: '{'
            {
             before(grammarAccess.getUnoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Uno__Group__1__Impl"


    // $ANTLR start "rule__Uno__Group__2"
    // InternalRulesUNO.g:1636:1: rule__Uno__Group__2 : rule__Uno__Group__2__Impl rule__Uno__Group__3 ;
    public final void rule__Uno__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1640:1: ( rule__Uno__Group__2__Impl rule__Uno__Group__3 )
            // InternalRulesUNO.g:1641:2: rule__Uno__Group__2__Impl rule__Uno__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Uno__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__3();

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
    // $ANTLR end "rule__Uno__Group__2"


    // $ANTLR start "rule__Uno__Group__2__Impl"
    // InternalRulesUNO.g:1648:1: rule__Uno__Group__2__Impl : ( ( rule__Uno__NbJoueurAssignment_2 ) ) ;
    public final void rule__Uno__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1652:1: ( ( ( rule__Uno__NbJoueurAssignment_2 ) ) )
            // InternalRulesUNO.g:1653:1: ( ( rule__Uno__NbJoueurAssignment_2 ) )
            {
            // InternalRulesUNO.g:1653:1: ( ( rule__Uno__NbJoueurAssignment_2 ) )
            // InternalRulesUNO.g:1654:2: ( rule__Uno__NbJoueurAssignment_2 )
            {
             before(grammarAccess.getUnoAccess().getNbJoueurAssignment_2()); 
            // InternalRulesUNO.g:1655:2: ( rule__Uno__NbJoueurAssignment_2 )
            // InternalRulesUNO.g:1655:3: rule__Uno__NbJoueurAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Uno__NbJoueurAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getNbJoueurAssignment_2()); 

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
    // $ANTLR end "rule__Uno__Group__2__Impl"


    // $ANTLR start "rule__Uno__Group__3"
    // InternalRulesUNO.g:1663:1: rule__Uno__Group__3 : rule__Uno__Group__3__Impl rule__Uno__Group__4 ;
    public final void rule__Uno__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1667:1: ( rule__Uno__Group__3__Impl rule__Uno__Group__4 )
            // InternalRulesUNO.g:1668:2: rule__Uno__Group__3__Impl rule__Uno__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Uno__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__4();

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
    // $ANTLR end "rule__Uno__Group__3"


    // $ANTLR start "rule__Uno__Group__3__Impl"
    // InternalRulesUNO.g:1675:1: rule__Uno__Group__3__Impl : ( ( rule__Uno__ParticipantTypeAssignment_3 ) ) ;
    public final void rule__Uno__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1679:1: ( ( ( rule__Uno__ParticipantTypeAssignment_3 ) ) )
            // InternalRulesUNO.g:1680:1: ( ( rule__Uno__ParticipantTypeAssignment_3 ) )
            {
            // InternalRulesUNO.g:1680:1: ( ( rule__Uno__ParticipantTypeAssignment_3 ) )
            // InternalRulesUNO.g:1681:2: ( rule__Uno__ParticipantTypeAssignment_3 )
            {
             before(grammarAccess.getUnoAccess().getParticipantTypeAssignment_3()); 
            // InternalRulesUNO.g:1682:2: ( rule__Uno__ParticipantTypeAssignment_3 )
            // InternalRulesUNO.g:1682:3: rule__Uno__ParticipantTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Uno__ParticipantTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getParticipantTypeAssignment_3()); 

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
    // $ANTLR end "rule__Uno__Group__3__Impl"


    // $ANTLR start "rule__Uno__Group__4"
    // InternalRulesUNO.g:1690:1: rule__Uno__Group__4 : rule__Uno__Group__4__Impl rule__Uno__Group__5 ;
    public final void rule__Uno__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1694:1: ( rule__Uno__Group__4__Impl rule__Uno__Group__5 )
            // InternalRulesUNO.g:1695:2: rule__Uno__Group__4__Impl rule__Uno__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Uno__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__5();

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
    // $ANTLR end "rule__Uno__Group__4"


    // $ANTLR start "rule__Uno__Group__4__Impl"
    // InternalRulesUNO.g:1702:1: rule__Uno__Group__4__Impl : ( ( rule__Uno__VariantesAssignment_4 ) ) ;
    public final void rule__Uno__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1706:1: ( ( ( rule__Uno__VariantesAssignment_4 ) ) )
            // InternalRulesUNO.g:1707:1: ( ( rule__Uno__VariantesAssignment_4 ) )
            {
            // InternalRulesUNO.g:1707:1: ( ( rule__Uno__VariantesAssignment_4 ) )
            // InternalRulesUNO.g:1708:2: ( rule__Uno__VariantesAssignment_4 )
            {
             before(grammarAccess.getUnoAccess().getVariantesAssignment_4()); 
            // InternalRulesUNO.g:1709:2: ( rule__Uno__VariantesAssignment_4 )
            // InternalRulesUNO.g:1709:3: rule__Uno__VariantesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Uno__VariantesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUnoAccess().getVariantesAssignment_4()); 

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
    // $ANTLR end "rule__Uno__Group__4__Impl"


    // $ANTLR start "rule__Uno__Group__5"
    // InternalRulesUNO.g:1717:1: rule__Uno__Group__5 : rule__Uno__Group__5__Impl rule__Uno__Group__6 ;
    public final void rule__Uno__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1721:1: ( rule__Uno__Group__5__Impl rule__Uno__Group__6 )
            // InternalRulesUNO.g:1722:2: rule__Uno__Group__5__Impl rule__Uno__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Uno__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uno__Group__6();

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
    // $ANTLR end "rule__Uno__Group__5"


    // $ANTLR start "rule__Uno__Group__5__Impl"
    // InternalRulesUNO.g:1729:1: rule__Uno__Group__5__Impl : ( ( rule__Uno__ReglesAssignment_5 )? ) ;
    public final void rule__Uno__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1733:1: ( ( ( rule__Uno__ReglesAssignment_5 )? ) )
            // InternalRulesUNO.g:1734:1: ( ( rule__Uno__ReglesAssignment_5 )? )
            {
            // InternalRulesUNO.g:1734:1: ( ( rule__Uno__ReglesAssignment_5 )? )
            // InternalRulesUNO.g:1735:2: ( rule__Uno__ReglesAssignment_5 )?
            {
             before(grammarAccess.getUnoAccess().getReglesAssignment_5()); 
            // InternalRulesUNO.g:1736:2: ( rule__Uno__ReglesAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==86) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRulesUNO.g:1736:3: rule__Uno__ReglesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Uno__ReglesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnoAccess().getReglesAssignment_5()); 

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
    // $ANTLR end "rule__Uno__Group__5__Impl"


    // $ANTLR start "rule__Uno__Group__6"
    // InternalRulesUNO.g:1744:1: rule__Uno__Group__6 : rule__Uno__Group__6__Impl ;
    public final void rule__Uno__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1748:1: ( rule__Uno__Group__6__Impl )
            // InternalRulesUNO.g:1749:2: rule__Uno__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uno__Group__6__Impl();

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
    // $ANTLR end "rule__Uno__Group__6"


    // $ANTLR start "rule__Uno__Group__6__Impl"
    // InternalRulesUNO.g:1755:1: rule__Uno__Group__6__Impl : ( '}' ) ;
    public final void rule__Uno__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1759:1: ( ( '}' ) )
            // InternalRulesUNO.g:1760:1: ( '}' )
            {
            // InternalRulesUNO.g:1760:1: ( '}' )
            // InternalRulesUNO.g:1761:2: '}'
            {
             before(grammarAccess.getUnoAccess().getRightCurlyBracketKeyword_6()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getUnoAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Uno__Group__6__Impl"


    // $ANTLR start "rule__ParticipantType__Group__0"
    // InternalRulesUNO.g:1771:1: rule__ParticipantType__Group__0 : rule__ParticipantType__Group__0__Impl rule__ParticipantType__Group__1 ;
    public final void rule__ParticipantType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1775:1: ( rule__ParticipantType__Group__0__Impl rule__ParticipantType__Group__1 )
            // InternalRulesUNO.g:1776:2: rule__ParticipantType__Group__0__Impl rule__ParticipantType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ParticipantType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParticipantType__Group__1();

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
    // $ANTLR end "rule__ParticipantType__Group__0"


    // $ANTLR start "rule__ParticipantType__Group__0__Impl"
    // InternalRulesUNO.g:1783:1: rule__ParticipantType__Group__0__Impl : ( 'participant' ) ;
    public final void rule__ParticipantType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1787:1: ( ( 'participant' ) )
            // InternalRulesUNO.g:1788:1: ( 'participant' )
            {
            // InternalRulesUNO.g:1788:1: ( 'participant' )
            // InternalRulesUNO.g:1789:2: 'participant'
            {
             before(grammarAccess.getParticipantTypeAccess().getParticipantKeyword_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getParticipantTypeAccess().getParticipantKeyword_0()); 

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
    // $ANTLR end "rule__ParticipantType__Group__0__Impl"


    // $ANTLR start "rule__ParticipantType__Group__1"
    // InternalRulesUNO.g:1798:1: rule__ParticipantType__Group__1 : rule__ParticipantType__Group__1__Impl rule__ParticipantType__Group__2 ;
    public final void rule__ParticipantType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1802:1: ( rule__ParticipantType__Group__1__Impl rule__ParticipantType__Group__2 )
            // InternalRulesUNO.g:1803:2: rule__ParticipantType__Group__1__Impl rule__ParticipantType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ParticipantType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParticipantType__Group__2();

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
    // $ANTLR end "rule__ParticipantType__Group__1"


    // $ANTLR start "rule__ParticipantType__Group__1__Impl"
    // InternalRulesUNO.g:1810:1: rule__ParticipantType__Group__1__Impl : ( '=' ) ;
    public final void rule__ParticipantType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1814:1: ( ( '=' ) )
            // InternalRulesUNO.g:1815:1: ( '=' )
            {
            // InternalRulesUNO.g:1815:1: ( '=' )
            // InternalRulesUNO.g:1816:2: '='
            {
             before(grammarAccess.getParticipantTypeAccess().getEqualsSignKeyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getParticipantTypeAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__ParticipantType__Group__1__Impl"


    // $ANTLR start "rule__ParticipantType__Group__2"
    // InternalRulesUNO.g:1825:1: rule__ParticipantType__Group__2 : rule__ParticipantType__Group__2__Impl rule__ParticipantType__Group__3 ;
    public final void rule__ParticipantType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1829:1: ( rule__ParticipantType__Group__2__Impl rule__ParticipantType__Group__3 )
            // InternalRulesUNO.g:1830:2: rule__ParticipantType__Group__2__Impl rule__ParticipantType__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ParticipantType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParticipantType__Group__3();

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
    // $ANTLR end "rule__ParticipantType__Group__2"


    // $ANTLR start "rule__ParticipantType__Group__2__Impl"
    // InternalRulesUNO.g:1837:1: rule__ParticipantType__Group__2__Impl : ( ( rule__ParticipantType__IdAssignment_2 ) ) ;
    public final void rule__ParticipantType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1841:1: ( ( ( rule__ParticipantType__IdAssignment_2 ) ) )
            // InternalRulesUNO.g:1842:1: ( ( rule__ParticipantType__IdAssignment_2 ) )
            {
            // InternalRulesUNO.g:1842:1: ( ( rule__ParticipantType__IdAssignment_2 ) )
            // InternalRulesUNO.g:1843:2: ( rule__ParticipantType__IdAssignment_2 )
            {
             before(grammarAccess.getParticipantTypeAccess().getIdAssignment_2()); 
            // InternalRulesUNO.g:1844:2: ( rule__ParticipantType__IdAssignment_2 )
            // InternalRulesUNO.g:1844:3: rule__ParticipantType__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantType__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParticipantTypeAccess().getIdAssignment_2()); 

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
    // $ANTLR end "rule__ParticipantType__Group__2__Impl"


    // $ANTLR start "rule__ParticipantType__Group__3"
    // InternalRulesUNO.g:1852:1: rule__ParticipantType__Group__3 : rule__ParticipantType__Group__3__Impl ;
    public final void rule__ParticipantType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1856:1: ( rule__ParticipantType__Group__3__Impl )
            // InternalRulesUNO.g:1857:2: rule__ParticipantType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantType__Group__3__Impl();

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
    // $ANTLR end "rule__ParticipantType__Group__3"


    // $ANTLR start "rule__ParticipantType__Group__3__Impl"
    // InternalRulesUNO.g:1863:1: rule__ParticipantType__Group__3__Impl : ( ';' ) ;
    public final void rule__ParticipantType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1867:1: ( ( ';' ) )
            // InternalRulesUNO.g:1868:1: ( ';' )
            {
            // InternalRulesUNO.g:1868:1: ( ';' )
            // InternalRulesUNO.g:1869:2: ';'
            {
             before(grammarAccess.getParticipantTypeAccess().getSemicolonKeyword_3()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getParticipantTypeAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__ParticipantType__Group__3__Impl"


    // $ANTLR start "rule__NbJoueur__Group__0"
    // InternalRulesUNO.g:1879:1: rule__NbJoueur__Group__0 : rule__NbJoueur__Group__0__Impl rule__NbJoueur__Group__1 ;
    public final void rule__NbJoueur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1883:1: ( rule__NbJoueur__Group__0__Impl rule__NbJoueur__Group__1 )
            // InternalRulesUNO.g:1884:2: rule__NbJoueur__Group__0__Impl rule__NbJoueur__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__NbJoueur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NbJoueur__Group__1();

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
    // $ANTLR end "rule__NbJoueur__Group__0"


    // $ANTLR start "rule__NbJoueur__Group__0__Impl"
    // InternalRulesUNO.g:1891:1: rule__NbJoueur__Group__0__Impl : ( 'nb_joueur' ) ;
    public final void rule__NbJoueur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1895:1: ( ( 'nb_joueur' ) )
            // InternalRulesUNO.g:1896:1: ( 'nb_joueur' )
            {
            // InternalRulesUNO.g:1896:1: ( 'nb_joueur' )
            // InternalRulesUNO.g:1897:2: 'nb_joueur'
            {
             before(grammarAccess.getNbJoueurAccess().getNb_joueurKeyword_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getNbJoueurAccess().getNb_joueurKeyword_0()); 

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
    // $ANTLR end "rule__NbJoueur__Group__0__Impl"


    // $ANTLR start "rule__NbJoueur__Group__1"
    // InternalRulesUNO.g:1906:1: rule__NbJoueur__Group__1 : rule__NbJoueur__Group__1__Impl rule__NbJoueur__Group__2 ;
    public final void rule__NbJoueur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1910:1: ( rule__NbJoueur__Group__1__Impl rule__NbJoueur__Group__2 )
            // InternalRulesUNO.g:1911:2: rule__NbJoueur__Group__1__Impl rule__NbJoueur__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__NbJoueur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NbJoueur__Group__2();

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
    // $ANTLR end "rule__NbJoueur__Group__1"


    // $ANTLR start "rule__NbJoueur__Group__1__Impl"
    // InternalRulesUNO.g:1918:1: rule__NbJoueur__Group__1__Impl : ( '=' ) ;
    public final void rule__NbJoueur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1922:1: ( ( '=' ) )
            // InternalRulesUNO.g:1923:1: ( '=' )
            {
            // InternalRulesUNO.g:1923:1: ( '=' )
            // InternalRulesUNO.g:1924:2: '='
            {
             before(grammarAccess.getNbJoueurAccess().getEqualsSignKeyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getNbJoueurAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__NbJoueur__Group__1__Impl"


    // $ANTLR start "rule__NbJoueur__Group__2"
    // InternalRulesUNO.g:1933:1: rule__NbJoueur__Group__2 : rule__NbJoueur__Group__2__Impl rule__NbJoueur__Group__3 ;
    public final void rule__NbJoueur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1937:1: ( rule__NbJoueur__Group__2__Impl rule__NbJoueur__Group__3 )
            // InternalRulesUNO.g:1938:2: rule__NbJoueur__Group__2__Impl rule__NbJoueur__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__NbJoueur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NbJoueur__Group__3();

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
    // $ANTLR end "rule__NbJoueur__Group__2"


    // $ANTLR start "rule__NbJoueur__Group__2__Impl"
    // InternalRulesUNO.g:1945:1: rule__NbJoueur__Group__2__Impl : ( ( rule__NbJoueur__ValAssignment_2 ) ) ;
    public final void rule__NbJoueur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1949:1: ( ( ( rule__NbJoueur__ValAssignment_2 ) ) )
            // InternalRulesUNO.g:1950:1: ( ( rule__NbJoueur__ValAssignment_2 ) )
            {
            // InternalRulesUNO.g:1950:1: ( ( rule__NbJoueur__ValAssignment_2 ) )
            // InternalRulesUNO.g:1951:2: ( rule__NbJoueur__ValAssignment_2 )
            {
             before(grammarAccess.getNbJoueurAccess().getValAssignment_2()); 
            // InternalRulesUNO.g:1952:2: ( rule__NbJoueur__ValAssignment_2 )
            // InternalRulesUNO.g:1952:3: rule__NbJoueur__ValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NbJoueur__ValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNbJoueurAccess().getValAssignment_2()); 

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
    // $ANTLR end "rule__NbJoueur__Group__2__Impl"


    // $ANTLR start "rule__NbJoueur__Group__3"
    // InternalRulesUNO.g:1960:1: rule__NbJoueur__Group__3 : rule__NbJoueur__Group__3__Impl ;
    public final void rule__NbJoueur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1964:1: ( rule__NbJoueur__Group__3__Impl )
            // InternalRulesUNO.g:1965:2: rule__NbJoueur__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NbJoueur__Group__3__Impl();

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
    // $ANTLR end "rule__NbJoueur__Group__3"


    // $ANTLR start "rule__NbJoueur__Group__3__Impl"
    // InternalRulesUNO.g:1971:1: rule__NbJoueur__Group__3__Impl : ( ';' ) ;
    public final void rule__NbJoueur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1975:1: ( ( ';' ) )
            // InternalRulesUNO.g:1976:1: ( ';' )
            {
            // InternalRulesUNO.g:1976:1: ( ';' )
            // InternalRulesUNO.g:1977:2: ';'
            {
             before(grammarAccess.getNbJoueurAccess().getSemicolonKeyword_3()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getNbJoueurAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__NbJoueur__Group__3__Impl"


    // $ANTLR start "rule__Variantes__Group__0"
    // InternalRulesUNO.g:1987:1: rule__Variantes__Group__0 : rule__Variantes__Group__0__Impl rule__Variantes__Group__1 ;
    public final void rule__Variantes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:1991:1: ( rule__Variantes__Group__0__Impl rule__Variantes__Group__1 )
            // InternalRulesUNO.g:1992:2: rule__Variantes__Group__0__Impl rule__Variantes__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variantes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variantes__Group__1();

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
    // $ANTLR end "rule__Variantes__Group__0"


    // $ANTLR start "rule__Variantes__Group__0__Impl"
    // InternalRulesUNO.g:1999:1: rule__Variantes__Group__0__Impl : ( () ) ;
    public final void rule__Variantes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2003:1: ( ( () ) )
            // InternalRulesUNO.g:2004:1: ( () )
            {
            // InternalRulesUNO.g:2004:1: ( () )
            // InternalRulesUNO.g:2005:2: ()
            {
             before(grammarAccess.getVariantesAccess().getVariantesAction_0()); 
            // InternalRulesUNO.g:2006:2: ()
            // InternalRulesUNO.g:2006:3: 
            {
            }

             after(grammarAccess.getVariantesAccess().getVariantesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variantes__Group__0__Impl"


    // $ANTLR start "rule__Variantes__Group__1"
    // InternalRulesUNO.g:2014:1: rule__Variantes__Group__1 : rule__Variantes__Group__1__Impl rule__Variantes__Group__2 ;
    public final void rule__Variantes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2018:1: ( rule__Variantes__Group__1__Impl rule__Variantes__Group__2 )
            // InternalRulesUNO.g:2019:2: rule__Variantes__Group__1__Impl rule__Variantes__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Variantes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variantes__Group__2();

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
    // $ANTLR end "rule__Variantes__Group__1"


    // $ANTLR start "rule__Variantes__Group__1__Impl"
    // InternalRulesUNO.g:2026:1: rule__Variantes__Group__1__Impl : ( 'variantes' ) ;
    public final void rule__Variantes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2030:1: ( ( 'variantes' ) )
            // InternalRulesUNO.g:2031:1: ( 'variantes' )
            {
            // InternalRulesUNO.g:2031:1: ( 'variantes' )
            // InternalRulesUNO.g:2032:2: 'variantes'
            {
             before(grammarAccess.getVariantesAccess().getVariantesKeyword_1()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getVariantesAccess().getVariantesKeyword_1()); 

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
    // $ANTLR end "rule__Variantes__Group__1__Impl"


    // $ANTLR start "rule__Variantes__Group__2"
    // InternalRulesUNO.g:2041:1: rule__Variantes__Group__2 : rule__Variantes__Group__2__Impl rule__Variantes__Group__3 ;
    public final void rule__Variantes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2045:1: ( rule__Variantes__Group__2__Impl rule__Variantes__Group__3 )
            // InternalRulesUNO.g:2046:2: rule__Variantes__Group__2__Impl rule__Variantes__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Variantes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variantes__Group__3();

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
    // $ANTLR end "rule__Variantes__Group__2"


    // $ANTLR start "rule__Variantes__Group__2__Impl"
    // InternalRulesUNO.g:2053:1: rule__Variantes__Group__2__Impl : ( '{' ) ;
    public final void rule__Variantes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2057:1: ( ( '{' ) )
            // InternalRulesUNO.g:2058:1: ( '{' )
            {
            // InternalRulesUNO.g:2058:1: ( '{' )
            // InternalRulesUNO.g:2059:2: '{'
            {
             before(grammarAccess.getVariantesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getVariantesAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Variantes__Group__2__Impl"


    // $ANTLR start "rule__Variantes__Group__3"
    // InternalRulesUNO.g:2068:1: rule__Variantes__Group__3 : rule__Variantes__Group__3__Impl rule__Variantes__Group__4 ;
    public final void rule__Variantes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2072:1: ( rule__Variantes__Group__3__Impl rule__Variantes__Group__4 )
            // InternalRulesUNO.g:2073:2: rule__Variantes__Group__3__Impl rule__Variantes__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Variantes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variantes__Group__4();

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
    // $ANTLR end "rule__Variantes__Group__3"


    // $ANTLR start "rule__Variantes__Group__3__Impl"
    // InternalRulesUNO.g:2080:1: rule__Variantes__Group__3__Impl : ( ( rule__Variantes__Group_3__0 )? ) ;
    public final void rule__Variantes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2084:1: ( ( ( rule__Variantes__Group_3__0 )? ) )
            // InternalRulesUNO.g:2085:1: ( ( rule__Variantes__Group_3__0 )? )
            {
            // InternalRulesUNO.g:2085:1: ( ( rule__Variantes__Group_3__0 )? )
            // InternalRulesUNO.g:2086:2: ( rule__Variantes__Group_3__0 )?
            {
             before(grammarAccess.getVariantesAccess().getGroup_3()); 
            // InternalRulesUNO.g:2087:2: ( rule__Variantes__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14||(LA23_0>=16 && LA23_0<=23)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRulesUNO.g:2087:3: rule__Variantes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variantes__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariantesAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Variantes__Group__3__Impl"


    // $ANTLR start "rule__Variantes__Group__4"
    // InternalRulesUNO.g:2095:1: rule__Variantes__Group__4 : rule__Variantes__Group__4__Impl ;
    public final void rule__Variantes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2099:1: ( rule__Variantes__Group__4__Impl )
            // InternalRulesUNO.g:2100:2: rule__Variantes__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variantes__Group__4__Impl();

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
    // $ANTLR end "rule__Variantes__Group__4"


    // $ANTLR start "rule__Variantes__Group__4__Impl"
    // InternalRulesUNO.g:2106:1: rule__Variantes__Group__4__Impl : ( '}' ) ;
    public final void rule__Variantes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2110:1: ( ( '}' ) )
            // InternalRulesUNO.g:2111:1: ( '}' )
            {
            // InternalRulesUNO.g:2111:1: ( '}' )
            // InternalRulesUNO.g:2112:2: '}'
            {
             before(grammarAccess.getVariantesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getVariantesAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Variantes__Group__4__Impl"


    // $ANTLR start "rule__Variantes__Group_3__0"
    // InternalRulesUNO.g:2122:1: rule__Variantes__Group_3__0 : rule__Variantes__Group_3__0__Impl rule__Variantes__Group_3__1 ;
    public final void rule__Variantes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2126:1: ( rule__Variantes__Group_3__0__Impl rule__Variantes__Group_3__1 )
            // InternalRulesUNO.g:2127:2: rule__Variantes__Group_3__0__Impl rule__Variantes__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Variantes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variantes__Group_3__1();

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
    // $ANTLR end "rule__Variantes__Group_3__0"


    // $ANTLR start "rule__Variantes__Group_3__0__Impl"
    // InternalRulesUNO.g:2134:1: rule__Variantes__Group_3__0__Impl : ( ( rule__Variantes__VariantesAssignment_3_0 ) ) ;
    public final void rule__Variantes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2138:1: ( ( ( rule__Variantes__VariantesAssignment_3_0 ) ) )
            // InternalRulesUNO.g:2139:1: ( ( rule__Variantes__VariantesAssignment_3_0 ) )
            {
            // InternalRulesUNO.g:2139:1: ( ( rule__Variantes__VariantesAssignment_3_0 ) )
            // InternalRulesUNO.g:2140:2: ( rule__Variantes__VariantesAssignment_3_0 )
            {
             before(grammarAccess.getVariantesAccess().getVariantesAssignment_3_0()); 
            // InternalRulesUNO.g:2141:2: ( rule__Variantes__VariantesAssignment_3_0 )
            // InternalRulesUNO.g:2141:3: rule__Variantes__VariantesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Variantes__VariantesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getVariantesAccess().getVariantesAssignment_3_0()); 

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
    // $ANTLR end "rule__Variantes__Group_3__0__Impl"


    // $ANTLR start "rule__Variantes__Group_3__1"
    // InternalRulesUNO.g:2149:1: rule__Variantes__Group_3__1 : rule__Variantes__Group_3__1__Impl ;
    public final void rule__Variantes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2153:1: ( rule__Variantes__Group_3__1__Impl )
            // InternalRulesUNO.g:2154:2: rule__Variantes__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variantes__Group_3__1__Impl();

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
    // $ANTLR end "rule__Variantes__Group_3__1"


    // $ANTLR start "rule__Variantes__Group_3__1__Impl"
    // InternalRulesUNO.g:2160:1: rule__Variantes__Group_3__1__Impl : ( ( rule__Variantes__Group_3_1__0 )* ) ;
    public final void rule__Variantes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2164:1: ( ( ( rule__Variantes__Group_3_1__0 )* ) )
            // InternalRulesUNO.g:2165:1: ( ( rule__Variantes__Group_3_1__0 )* )
            {
            // InternalRulesUNO.g:2165:1: ( ( rule__Variantes__Group_3_1__0 )* )
            // InternalRulesUNO.g:2166:2: ( rule__Variantes__Group_3_1__0 )*
            {
             before(grammarAccess.getVariantesAccess().getGroup_3_1()); 
            // InternalRulesUNO.g:2167:2: ( rule__Variantes__Group_3_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==85) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRulesUNO.g:2167:3: rule__Variantes__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Variantes__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getVariantesAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Variantes__Group_3__1__Impl"


    // $ANTLR start "rule__Variantes__Group_3_1__0"
    // InternalRulesUNO.g:2176:1: rule__Variantes__Group_3_1__0 : rule__Variantes__Group_3_1__0__Impl rule__Variantes__Group_3_1__1 ;
    public final void rule__Variantes__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2180:1: ( rule__Variantes__Group_3_1__0__Impl rule__Variantes__Group_3_1__1 )
            // InternalRulesUNO.g:2181:2: rule__Variantes__Group_3_1__0__Impl rule__Variantes__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Variantes__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variantes__Group_3_1__1();

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
    // $ANTLR end "rule__Variantes__Group_3_1__0"


    // $ANTLR start "rule__Variantes__Group_3_1__0__Impl"
    // InternalRulesUNO.g:2188:1: rule__Variantes__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Variantes__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2192:1: ( ( ',' ) )
            // InternalRulesUNO.g:2193:1: ( ',' )
            {
            // InternalRulesUNO.g:2193:1: ( ',' )
            // InternalRulesUNO.g:2194:2: ','
            {
             before(grammarAccess.getVariantesAccess().getCommaKeyword_3_1_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getVariantesAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Variantes__Group_3_1__0__Impl"


    // $ANTLR start "rule__Variantes__Group_3_1__1"
    // InternalRulesUNO.g:2203:1: rule__Variantes__Group_3_1__1 : rule__Variantes__Group_3_1__1__Impl ;
    public final void rule__Variantes__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2207:1: ( rule__Variantes__Group_3_1__1__Impl )
            // InternalRulesUNO.g:2208:2: rule__Variantes__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variantes__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Variantes__Group_3_1__1"


    // $ANTLR start "rule__Variantes__Group_3_1__1__Impl"
    // InternalRulesUNO.g:2214:1: rule__Variantes__Group_3_1__1__Impl : ( ( rule__Variantes__VariantesAssignment_3_1_1 ) ) ;
    public final void rule__Variantes__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2218:1: ( ( ( rule__Variantes__VariantesAssignment_3_1_1 ) ) )
            // InternalRulesUNO.g:2219:1: ( ( rule__Variantes__VariantesAssignment_3_1_1 ) )
            {
            // InternalRulesUNO.g:2219:1: ( ( rule__Variantes__VariantesAssignment_3_1_1 ) )
            // InternalRulesUNO.g:2220:2: ( rule__Variantes__VariantesAssignment_3_1_1 )
            {
             before(grammarAccess.getVariantesAccess().getVariantesAssignment_3_1_1()); 
            // InternalRulesUNO.g:2221:2: ( rule__Variantes__VariantesAssignment_3_1_1 )
            // InternalRulesUNO.g:2221:3: rule__Variantes__VariantesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variantes__VariantesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariantesAccess().getVariantesAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Variantes__Group_3_1__1__Impl"


    // $ANTLR start "rule__Regles__Group__0"
    // InternalRulesUNO.g:2230:1: rule__Regles__Group__0 : rule__Regles__Group__0__Impl rule__Regles__Group__1 ;
    public final void rule__Regles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2234:1: ( rule__Regles__Group__0__Impl rule__Regles__Group__1 )
            // InternalRulesUNO.g:2235:2: rule__Regles__Group__0__Impl rule__Regles__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Regles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regles__Group__1();

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
    // $ANTLR end "rule__Regles__Group__0"


    // $ANTLR start "rule__Regles__Group__0__Impl"
    // InternalRulesUNO.g:2242:1: rule__Regles__Group__0__Impl : ( () ) ;
    public final void rule__Regles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2246:1: ( ( () ) )
            // InternalRulesUNO.g:2247:1: ( () )
            {
            // InternalRulesUNO.g:2247:1: ( () )
            // InternalRulesUNO.g:2248:2: ()
            {
             before(grammarAccess.getReglesAccess().getReglesAction_0()); 
            // InternalRulesUNO.g:2249:2: ()
            // InternalRulesUNO.g:2249:3: 
            {
            }

             after(grammarAccess.getReglesAccess().getReglesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regles__Group__0__Impl"


    // $ANTLR start "rule__Regles__Group__1"
    // InternalRulesUNO.g:2257:1: rule__Regles__Group__1 : rule__Regles__Group__1__Impl rule__Regles__Group__2 ;
    public final void rule__Regles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2261:1: ( rule__Regles__Group__1__Impl rule__Regles__Group__2 )
            // InternalRulesUNO.g:2262:2: rule__Regles__Group__1__Impl rule__Regles__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Regles__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regles__Group__2();

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
    // $ANTLR end "rule__Regles__Group__1"


    // $ANTLR start "rule__Regles__Group__1__Impl"
    // InternalRulesUNO.g:2269:1: rule__Regles__Group__1__Impl : ( 'regles' ) ;
    public final void rule__Regles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2273:1: ( ( 'regles' ) )
            // InternalRulesUNO.g:2274:1: ( 'regles' )
            {
            // InternalRulesUNO.g:2274:1: ( 'regles' )
            // InternalRulesUNO.g:2275:2: 'regles'
            {
             before(grammarAccess.getReglesAccess().getReglesKeyword_1()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getReglesAccess().getReglesKeyword_1()); 

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
    // $ANTLR end "rule__Regles__Group__1__Impl"


    // $ANTLR start "rule__Regles__Group__2"
    // InternalRulesUNO.g:2284:1: rule__Regles__Group__2 : rule__Regles__Group__2__Impl rule__Regles__Group__3 ;
    public final void rule__Regles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2288:1: ( rule__Regles__Group__2__Impl rule__Regles__Group__3 )
            // InternalRulesUNO.g:2289:2: rule__Regles__Group__2__Impl rule__Regles__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Regles__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regles__Group__3();

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
    // $ANTLR end "rule__Regles__Group__2"


    // $ANTLR start "rule__Regles__Group__2__Impl"
    // InternalRulesUNO.g:2296:1: rule__Regles__Group__2__Impl : ( '{' ) ;
    public final void rule__Regles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2300:1: ( ( '{' ) )
            // InternalRulesUNO.g:2301:1: ( '{' )
            {
            // InternalRulesUNO.g:2301:1: ( '{' )
            // InternalRulesUNO.g:2302:2: '{'
            {
             before(grammarAccess.getReglesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getReglesAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Regles__Group__2__Impl"


    // $ANTLR start "rule__Regles__Group__3"
    // InternalRulesUNO.g:2311:1: rule__Regles__Group__3 : rule__Regles__Group__3__Impl rule__Regles__Group__4 ;
    public final void rule__Regles__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2315:1: ( rule__Regles__Group__3__Impl rule__Regles__Group__4 )
            // InternalRulesUNO.g:2316:2: rule__Regles__Group__3__Impl rule__Regles__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Regles__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regles__Group__4();

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
    // $ANTLR end "rule__Regles__Group__3"


    // $ANTLR start "rule__Regles__Group__3__Impl"
    // InternalRulesUNO.g:2323:1: rule__Regles__Group__3__Impl : ( ( rule__Regles__DeclarationsAssignment_3 )* ) ;
    public final void rule__Regles__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2327:1: ( ( ( rule__Regles__DeclarationsAssignment_3 )* ) )
            // InternalRulesUNO.g:2328:1: ( ( rule__Regles__DeclarationsAssignment_3 )* )
            {
            // InternalRulesUNO.g:2328:1: ( ( rule__Regles__DeclarationsAssignment_3 )* )
            // InternalRulesUNO.g:2329:2: ( rule__Regles__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getReglesAccess().getDeclarationsAssignment_3()); 
            // InternalRulesUNO.g:2330:2: ( rule__Regles__DeclarationsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==11||(LA25_0>=28 && LA25_0<=33)||(LA25_0>=55 && LA25_0<=58)||LA25_0==87||LA25_0==91) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRulesUNO.g:2330:3: rule__Regles__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Regles__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getReglesAccess().getDeclarationsAssignment_3()); 

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
    // $ANTLR end "rule__Regles__Group__3__Impl"


    // $ANTLR start "rule__Regles__Group__4"
    // InternalRulesUNO.g:2338:1: rule__Regles__Group__4 : rule__Regles__Group__4__Impl ;
    public final void rule__Regles__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2342:1: ( rule__Regles__Group__4__Impl )
            // InternalRulesUNO.g:2343:2: rule__Regles__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regles__Group__4__Impl();

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
    // $ANTLR end "rule__Regles__Group__4"


    // $ANTLR start "rule__Regles__Group__4__Impl"
    // InternalRulesUNO.g:2349:1: rule__Regles__Group__4__Impl : ( '}' ) ;
    public final void rule__Regles__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2353:1: ( ( '}' ) )
            // InternalRulesUNO.g:2354:1: ( '}' )
            {
            // InternalRulesUNO.g:2354:1: ( '}' )
            // InternalRulesUNO.g:2355:2: '}'
            {
             before(grammarAccess.getReglesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getReglesAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Regles__Group__4__Impl"


    // $ANTLR start "rule__Affectation__Group__0"
    // InternalRulesUNO.g:2365:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2369:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // InternalRulesUNO.g:2370:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Affectation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__1();

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
    // $ANTLR end "rule__Affectation__Group__0"


    // $ANTLR start "rule__Affectation__Group__0__Impl"
    // InternalRulesUNO.g:2377:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__AttributAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2381:1: ( ( ( rule__Affectation__AttributAssignment_0 ) ) )
            // InternalRulesUNO.g:2382:1: ( ( rule__Affectation__AttributAssignment_0 ) )
            {
            // InternalRulesUNO.g:2382:1: ( ( rule__Affectation__AttributAssignment_0 ) )
            // InternalRulesUNO.g:2383:2: ( rule__Affectation__AttributAssignment_0 )
            {
             before(grammarAccess.getAffectationAccess().getAttributAssignment_0()); 
            // InternalRulesUNO.g:2384:2: ( rule__Affectation__AttributAssignment_0 )
            // InternalRulesUNO.g:2384:3: rule__Affectation__AttributAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__AttributAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getAttributAssignment_0()); 

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
    // $ANTLR end "rule__Affectation__Group__0__Impl"


    // $ANTLR start "rule__Affectation__Group__1"
    // InternalRulesUNO.g:2392:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2396:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // InternalRulesUNO.g:2397:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Affectation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__2();

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
    // $ANTLR end "rule__Affectation__Group__1"


    // $ANTLR start "rule__Affectation__Group__1__Impl"
    // InternalRulesUNO.g:2404:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2408:1: ( ( '=' ) )
            // InternalRulesUNO.g:2409:1: ( '=' )
            {
            // InternalRulesUNO.g:2409:1: ( '=' )
            // InternalRulesUNO.g:2410:2: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Affectation__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__2"
    // InternalRulesUNO.g:2419:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl rule__Affectation__Group__3 ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2423:1: ( rule__Affectation__Group__2__Impl rule__Affectation__Group__3 )
            // InternalRulesUNO.g:2424:2: rule__Affectation__Group__2__Impl rule__Affectation__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Affectation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__3();

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
    // $ANTLR end "rule__Affectation__Group__2"


    // $ANTLR start "rule__Affectation__Group__2__Impl"
    // InternalRulesUNO.g:2431:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__ExpressionAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2435:1: ( ( ( rule__Affectation__ExpressionAssignment_2 ) ) )
            // InternalRulesUNO.g:2436:1: ( ( rule__Affectation__ExpressionAssignment_2 ) )
            {
            // InternalRulesUNO.g:2436:1: ( ( rule__Affectation__ExpressionAssignment_2 ) )
            // InternalRulesUNO.g:2437:2: ( rule__Affectation__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAffectationAccess().getExpressionAssignment_2()); 
            // InternalRulesUNO.g:2438:2: ( rule__Affectation__ExpressionAssignment_2 )
            // InternalRulesUNO.g:2438:3: rule__Affectation__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__Affectation__Group__2__Impl"


    // $ANTLR start "rule__Affectation__Group__3"
    // InternalRulesUNO.g:2446:1: rule__Affectation__Group__3 : rule__Affectation__Group__3__Impl ;
    public final void rule__Affectation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2450:1: ( rule__Affectation__Group__3__Impl )
            // InternalRulesUNO.g:2451:2: rule__Affectation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__3__Impl();

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
    // $ANTLR end "rule__Affectation__Group__3"


    // $ANTLR start "rule__Affectation__Group__3__Impl"
    // InternalRulesUNO.g:2457:1: rule__Affectation__Group__3__Impl : ( ';' ) ;
    public final void rule__Affectation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2461:1: ( ( ';' ) )
            // InternalRulesUNO.g:2462:1: ( ';' )
            {
            // InternalRulesUNO.g:2462:1: ( ';' )
            // InternalRulesUNO.g:2463:2: ';'
            {
             before(grammarAccess.getAffectationAccess().getSemicolonKeyword_3()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Affectation__Group__3__Impl"


    // $ANTLR start "rule__Instruction__Group_1__0"
    // InternalRulesUNO.g:2473:1: rule__Instruction__Group_1__0 : rule__Instruction__Group_1__0__Impl rule__Instruction__Group_1__1 ;
    public final void rule__Instruction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2477:1: ( rule__Instruction__Group_1__0__Impl rule__Instruction__Group_1__1 )
            // InternalRulesUNO.g:2478:2: rule__Instruction__Group_1__0__Impl rule__Instruction__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Instruction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_1__1();

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
    // $ANTLR end "rule__Instruction__Group_1__0"


    // $ANTLR start "rule__Instruction__Group_1__0__Impl"
    // InternalRulesUNO.g:2485:1: rule__Instruction__Group_1__0__Impl : ( ruleAction ) ;
    public final void rule__Instruction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2489:1: ( ( ruleAction ) )
            // InternalRulesUNO.g:2490:1: ( ruleAction )
            {
            // InternalRulesUNO.g:2490:1: ( ruleAction )
            // InternalRulesUNO.g:2491:2: ruleAction
            {
             before(grammarAccess.getInstructionAccess().getActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getActionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Instruction__Group_1__0__Impl"


    // $ANTLR start "rule__Instruction__Group_1__1"
    // InternalRulesUNO.g:2500:1: rule__Instruction__Group_1__1 : rule__Instruction__Group_1__1__Impl ;
    public final void rule__Instruction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2504:1: ( rule__Instruction__Group_1__1__Impl )
            // InternalRulesUNO.g:2505:2: rule__Instruction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_1__1__Impl();

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
    // $ANTLR end "rule__Instruction__Group_1__1"


    // $ANTLR start "rule__Instruction__Group_1__1__Impl"
    // InternalRulesUNO.g:2511:1: rule__Instruction__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Instruction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2515:1: ( ( ';' ) )
            // InternalRulesUNO.g:2516:1: ( ';' )
            {
            // InternalRulesUNO.g:2516:1: ( ';' )
            // InternalRulesUNO.g:2517:2: ';'
            {
             before(grammarAccess.getInstructionAccess().getSemicolonKeyword_1_1()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getInstructionAccess().getSemicolonKeyword_1_1()); 

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
    // $ANTLR end "rule__Instruction__Group_1__1__Impl"


    // $ANTLR start "rule__InstructionChoix__Group__0"
    // InternalRulesUNO.g:2527:1: rule__InstructionChoix__Group__0 : rule__InstructionChoix__Group__0__Impl rule__InstructionChoix__Group__1 ;
    public final void rule__InstructionChoix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2531:1: ( rule__InstructionChoix__Group__0__Impl rule__InstructionChoix__Group__1 )
            // InternalRulesUNO.g:2532:2: rule__InstructionChoix__Group__0__Impl rule__InstructionChoix__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InstructionChoix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionChoix__Group__1();

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
    // $ANTLR end "rule__InstructionChoix__Group__0"


    // $ANTLR start "rule__InstructionChoix__Group__0__Impl"
    // InternalRulesUNO.g:2539:1: rule__InstructionChoix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__InstructionChoix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2543:1: ( ( 'choix' ) )
            // InternalRulesUNO.g:2544:1: ( 'choix' )
            {
            // InternalRulesUNO.g:2544:1: ( 'choix' )
            // InternalRulesUNO.g:2545:2: 'choix'
            {
             before(grammarAccess.getInstructionChoixAccess().getChoixKeyword_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getInstructionChoixAccess().getChoixKeyword_0()); 

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
    // $ANTLR end "rule__InstructionChoix__Group__0__Impl"


    // $ANTLR start "rule__InstructionChoix__Group__1"
    // InternalRulesUNO.g:2554:1: rule__InstructionChoix__Group__1 : rule__InstructionChoix__Group__1__Impl rule__InstructionChoix__Group__2 ;
    public final void rule__InstructionChoix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2558:1: ( rule__InstructionChoix__Group__1__Impl rule__InstructionChoix__Group__2 )
            // InternalRulesUNO.g:2559:2: rule__InstructionChoix__Group__1__Impl rule__InstructionChoix__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InstructionChoix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionChoix__Group__2();

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
    // $ANTLR end "rule__InstructionChoix__Group__1"


    // $ANTLR start "rule__InstructionChoix__Group__1__Impl"
    // InternalRulesUNO.g:2566:1: rule__InstructionChoix__Group__1__Impl : ( '{' ) ;
    public final void rule__InstructionChoix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2570:1: ( ( '{' ) )
            // InternalRulesUNO.g:2571:1: ( '{' )
            {
            // InternalRulesUNO.g:2571:1: ( '{' )
            // InternalRulesUNO.g:2572:2: '{'
            {
             before(grammarAccess.getInstructionChoixAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getInstructionChoixAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__InstructionChoix__Group__1__Impl"


    // $ANTLR start "rule__InstructionChoix__Group__2"
    // InternalRulesUNO.g:2581:1: rule__InstructionChoix__Group__2 : rule__InstructionChoix__Group__2__Impl rule__InstructionChoix__Group__3 ;
    public final void rule__InstructionChoix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2585:1: ( rule__InstructionChoix__Group__2__Impl rule__InstructionChoix__Group__3 )
            // InternalRulesUNO.g:2586:2: rule__InstructionChoix__Group__2__Impl rule__InstructionChoix__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__InstructionChoix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionChoix__Group__3();

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
    // $ANTLR end "rule__InstructionChoix__Group__2"


    // $ANTLR start "rule__InstructionChoix__Group__2__Impl"
    // InternalRulesUNO.g:2593:1: rule__InstructionChoix__Group__2__Impl : ( ( rule__InstructionChoix__InstructionsAssignment_2 ) ) ;
    public final void rule__InstructionChoix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2597:1: ( ( ( rule__InstructionChoix__InstructionsAssignment_2 ) ) )
            // InternalRulesUNO.g:2598:1: ( ( rule__InstructionChoix__InstructionsAssignment_2 ) )
            {
            // InternalRulesUNO.g:2598:1: ( ( rule__InstructionChoix__InstructionsAssignment_2 ) )
            // InternalRulesUNO.g:2599:2: ( rule__InstructionChoix__InstructionsAssignment_2 )
            {
             before(grammarAccess.getInstructionChoixAccess().getInstructionsAssignment_2()); 
            // InternalRulesUNO.g:2600:2: ( rule__InstructionChoix__InstructionsAssignment_2 )
            // InternalRulesUNO.g:2600:3: rule__InstructionChoix__InstructionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InstructionChoix__InstructionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstructionChoixAccess().getInstructionsAssignment_2()); 

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
    // $ANTLR end "rule__InstructionChoix__Group__2__Impl"


    // $ANTLR start "rule__InstructionChoix__Group__3"
    // InternalRulesUNO.g:2608:1: rule__InstructionChoix__Group__3 : rule__InstructionChoix__Group__3__Impl rule__InstructionChoix__Group__4 ;
    public final void rule__InstructionChoix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2612:1: ( rule__InstructionChoix__Group__3__Impl rule__InstructionChoix__Group__4 )
            // InternalRulesUNO.g:2613:2: rule__InstructionChoix__Group__3__Impl rule__InstructionChoix__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__InstructionChoix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstructionChoix__Group__4();

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
    // $ANTLR end "rule__InstructionChoix__Group__3"


    // $ANTLR start "rule__InstructionChoix__Group__3__Impl"
    // InternalRulesUNO.g:2620:1: rule__InstructionChoix__Group__3__Impl : ( ( rule__InstructionChoix__InstructionsAssignment_3 )* ) ;
    public final void rule__InstructionChoix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2624:1: ( ( ( rule__InstructionChoix__InstructionsAssignment_3 )* ) )
            // InternalRulesUNO.g:2625:1: ( ( rule__InstructionChoix__InstructionsAssignment_3 )* )
            {
            // InternalRulesUNO.g:2625:1: ( ( rule__InstructionChoix__InstructionsAssignment_3 )* )
            // InternalRulesUNO.g:2626:2: ( rule__InstructionChoix__InstructionsAssignment_3 )*
            {
             before(grammarAccess.getInstructionChoixAccess().getInstructionsAssignment_3()); 
            // InternalRulesUNO.g:2627:2: ( rule__InstructionChoix__InstructionsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==11||(LA26_0>=28 && LA26_0<=33)||(LA26_0>=55 && LA26_0<=58)||LA26_0==87) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRulesUNO.g:2627:3: rule__InstructionChoix__InstructionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__InstructionChoix__InstructionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInstructionChoixAccess().getInstructionsAssignment_3()); 

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
    // $ANTLR end "rule__InstructionChoix__Group__3__Impl"


    // $ANTLR start "rule__InstructionChoix__Group__4"
    // InternalRulesUNO.g:2635:1: rule__InstructionChoix__Group__4 : rule__InstructionChoix__Group__4__Impl ;
    public final void rule__InstructionChoix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2639:1: ( rule__InstructionChoix__Group__4__Impl )
            // InternalRulesUNO.g:2640:2: rule__InstructionChoix__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstructionChoix__Group__4__Impl();

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
    // $ANTLR end "rule__InstructionChoix__Group__4"


    // $ANTLR start "rule__InstructionChoix__Group__4__Impl"
    // InternalRulesUNO.g:2646:1: rule__InstructionChoix__Group__4__Impl : ( '}' ) ;
    public final void rule__InstructionChoix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2650:1: ( ( '}' ) )
            // InternalRulesUNO.g:2651:1: ( '}' )
            {
            // InternalRulesUNO.g:2651:1: ( '}' )
            // InternalRulesUNO.g:2652:2: '}'
            {
             before(grammarAccess.getInstructionChoixAccess().getRightCurlyBracketKeyword_4()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getInstructionChoixAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__InstructionChoix__Group__4__Impl"


    // $ANTLR start "rule__Action__Group_0__0"
    // InternalRulesUNO.g:2662:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2666:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalRulesUNO.g:2667:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_0__1();

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
    // $ANTLR end "rule__Action__Group_0__0"


    // $ANTLR start "rule__Action__Group_0__0__Impl"
    // InternalRulesUNO.g:2674:1: rule__Action__Group_0__0__Impl : ( ( rule__Action__IdAssignment_0_0 ) ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2678:1: ( ( ( rule__Action__IdAssignment_0_0 ) ) )
            // InternalRulesUNO.g:2679:1: ( ( rule__Action__IdAssignment_0_0 ) )
            {
            // InternalRulesUNO.g:2679:1: ( ( rule__Action__IdAssignment_0_0 ) )
            // InternalRulesUNO.g:2680:2: ( rule__Action__IdAssignment_0_0 )
            {
             before(grammarAccess.getActionAccess().getIdAssignment_0_0()); 
            // InternalRulesUNO.g:2681:2: ( rule__Action__IdAssignment_0_0 )
            // InternalRulesUNO.g:2681:3: rule__Action__IdAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__IdAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getIdAssignment_0_0()); 

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
    // $ANTLR end "rule__Action__Group_0__0__Impl"


    // $ANTLR start "rule__Action__Group_0__1"
    // InternalRulesUNO.g:2689:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl rule__Action__Group_0__2 ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2693:1: ( rule__Action__Group_0__1__Impl rule__Action__Group_0__2 )
            // InternalRulesUNO.g:2694:2: rule__Action__Group_0__1__Impl rule__Action__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Action__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_0__2();

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
    // $ANTLR end "rule__Action__Group_0__1"


    // $ANTLR start "rule__Action__Group_0__1__Impl"
    // InternalRulesUNO.g:2701:1: rule__Action__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2705:1: ( ( '.' ) )
            // InternalRulesUNO.g:2706:1: ( '.' )
            {
            // InternalRulesUNO.g:2706:1: ( '.' )
            // InternalRulesUNO.g:2707:2: '.'
            {
             before(grammarAccess.getActionAccess().getFullStopKeyword_0_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__Action__Group_0__1__Impl"


    // $ANTLR start "rule__Action__Group_0__2"
    // InternalRulesUNO.g:2716:1: rule__Action__Group_0__2 : rule__Action__Group_0__2__Impl rule__Action__Group_0__3 ;
    public final void rule__Action__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2720:1: ( rule__Action__Group_0__2__Impl rule__Action__Group_0__3 )
            // InternalRulesUNO.g:2721:2: rule__Action__Group_0__2__Impl rule__Action__Group_0__3
            {
            pushFollow(FOLLOW_25);
            rule__Action__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_0__3();

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
    // $ANTLR end "rule__Action__Group_0__2"


    // $ANTLR start "rule__Action__Group_0__2__Impl"
    // InternalRulesUNO.g:2728:1: rule__Action__Group_0__2__Impl : ( ( rule__Action__ActionAssignment_0_2 ) ) ;
    public final void rule__Action__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2732:1: ( ( ( rule__Action__ActionAssignment_0_2 ) ) )
            // InternalRulesUNO.g:2733:1: ( ( rule__Action__ActionAssignment_0_2 ) )
            {
            // InternalRulesUNO.g:2733:1: ( ( rule__Action__ActionAssignment_0_2 ) )
            // InternalRulesUNO.g:2734:2: ( rule__Action__ActionAssignment_0_2 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_0_2()); 
            // InternalRulesUNO.g:2735:2: ( rule__Action__ActionAssignment_0_2 )
            // InternalRulesUNO.g:2735:3: rule__Action__ActionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAssignment_0_2()); 

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
    // $ANTLR end "rule__Action__Group_0__2__Impl"


    // $ANTLR start "rule__Action__Group_0__3"
    // InternalRulesUNO.g:2743:1: rule__Action__Group_0__3 : rule__Action__Group_0__3__Impl ;
    public final void rule__Action__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2747:1: ( rule__Action__Group_0__3__Impl )
            // InternalRulesUNO.g:2748:2: rule__Action__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_0__3__Impl();

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
    // $ANTLR end "rule__Action__Group_0__3"


    // $ANTLR start "rule__Action__Group_0__3__Impl"
    // InternalRulesUNO.g:2754:1: rule__Action__Group_0__3__Impl : ( '()' ) ;
    public final void rule__Action__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2758:1: ( ( '()' ) )
            // InternalRulesUNO.g:2759:1: ( '()' )
            {
            // InternalRulesUNO.g:2759:1: ( '()' )
            // InternalRulesUNO.g:2760:2: '()'
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_0_3()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_0_3()); 

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
    // $ANTLR end "rule__Action__Group_0__3__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // InternalRulesUNO.g:2770:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2774:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalRulesUNO.g:2775:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1__1();

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
    // $ANTLR end "rule__Action__Group_1__0"


    // $ANTLR start "rule__Action__Group_1__0__Impl"
    // InternalRulesUNO.g:2782:1: rule__Action__Group_1__0__Impl : ( ( rule__Action__IdAssignment_1_0 ) ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2786:1: ( ( ( rule__Action__IdAssignment_1_0 ) ) )
            // InternalRulesUNO.g:2787:1: ( ( rule__Action__IdAssignment_1_0 ) )
            {
            // InternalRulesUNO.g:2787:1: ( ( rule__Action__IdAssignment_1_0 ) )
            // InternalRulesUNO.g:2788:2: ( rule__Action__IdAssignment_1_0 )
            {
             before(grammarAccess.getActionAccess().getIdAssignment_1_0()); 
            // InternalRulesUNO.g:2789:2: ( rule__Action__IdAssignment_1_0 )
            // InternalRulesUNO.g:2789:3: rule__Action__IdAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__IdAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getIdAssignment_1_0()); 

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
    // $ANTLR end "rule__Action__Group_1__0__Impl"


    // $ANTLR start "rule__Action__Group_1__1"
    // InternalRulesUNO.g:2797:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl rule__Action__Group_1__2 ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2801:1: ( rule__Action__Group_1__1__Impl rule__Action__Group_1__2 )
            // InternalRulesUNO.g:2802:2: rule__Action__Group_1__1__Impl rule__Action__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__Action__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1__2();

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
    // $ANTLR end "rule__Action__Group_1__1"


    // $ANTLR start "rule__Action__Group_1__1__Impl"
    // InternalRulesUNO.g:2809:1: rule__Action__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2813:1: ( ( '.' ) )
            // InternalRulesUNO.g:2814:1: ( '.' )
            {
            // InternalRulesUNO.g:2814:1: ( '.' )
            // InternalRulesUNO.g:2815:2: '.'
            {
             before(grammarAccess.getActionAccess().getFullStopKeyword_1_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__Action__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group_1__2"
    // InternalRulesUNO.g:2824:1: rule__Action__Group_1__2 : rule__Action__Group_1__2__Impl rule__Action__Group_1__3 ;
    public final void rule__Action__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2828:1: ( rule__Action__Group_1__2__Impl rule__Action__Group_1__3 )
            // InternalRulesUNO.g:2829:2: rule__Action__Group_1__2__Impl rule__Action__Group_1__3
            {
            pushFollow(FOLLOW_25);
            rule__Action__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1__3();

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
    // $ANTLR end "rule__Action__Group_1__2"


    // $ANTLR start "rule__Action__Group_1__2__Impl"
    // InternalRulesUNO.g:2836:1: rule__Action__Group_1__2__Impl : ( ( rule__Action__ActionAssignment_1_2 ) ) ;
    public final void rule__Action__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2840:1: ( ( ( rule__Action__ActionAssignment_1_2 ) ) )
            // InternalRulesUNO.g:2841:1: ( ( rule__Action__ActionAssignment_1_2 ) )
            {
            // InternalRulesUNO.g:2841:1: ( ( rule__Action__ActionAssignment_1_2 ) )
            // InternalRulesUNO.g:2842:2: ( rule__Action__ActionAssignment_1_2 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_1_2()); 
            // InternalRulesUNO.g:2843:2: ( rule__Action__ActionAssignment_1_2 )
            // InternalRulesUNO.g:2843:3: rule__Action__ActionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAssignment_1_2()); 

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
    // $ANTLR end "rule__Action__Group_1__2__Impl"


    // $ANTLR start "rule__Action__Group_1__3"
    // InternalRulesUNO.g:2851:1: rule__Action__Group_1__3 : rule__Action__Group_1__3__Impl ;
    public final void rule__Action__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2855:1: ( rule__Action__Group_1__3__Impl )
            // InternalRulesUNO.g:2856:2: rule__Action__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_1__3__Impl();

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
    // $ANTLR end "rule__Action__Group_1__3"


    // $ANTLR start "rule__Action__Group_1__3__Impl"
    // InternalRulesUNO.g:2862:1: rule__Action__Group_1__3__Impl : ( '()' ) ;
    public final void rule__Action__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2866:1: ( ( '()' ) )
            // InternalRulesUNO.g:2867:1: ( '()' )
            {
            // InternalRulesUNO.g:2867:1: ( '()' )
            // InternalRulesUNO.g:2868:2: '()'
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_1_3()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Action__Group_1__3__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // InternalRulesUNO.g:2878:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2882:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalRulesUNO.g:2883:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__1();

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
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // InternalRulesUNO.g:2890:1: rule__Action__Group_2__0__Impl : ( ( rule__Action__IdAssignment_2_0 ) ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2894:1: ( ( ( rule__Action__IdAssignment_2_0 ) ) )
            // InternalRulesUNO.g:2895:1: ( ( rule__Action__IdAssignment_2_0 ) )
            {
            // InternalRulesUNO.g:2895:1: ( ( rule__Action__IdAssignment_2_0 ) )
            // InternalRulesUNO.g:2896:2: ( rule__Action__IdAssignment_2_0 )
            {
             before(grammarAccess.getActionAccess().getIdAssignment_2_0()); 
            // InternalRulesUNO.g:2897:2: ( rule__Action__IdAssignment_2_0 )
            // InternalRulesUNO.g:2897:3: rule__Action__IdAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__IdAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getIdAssignment_2_0()); 

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
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // InternalRulesUNO.g:2905:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl rule__Action__Group_2__2 ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2909:1: ( rule__Action__Group_2__1__Impl rule__Action__Group_2__2 )
            // InternalRulesUNO.g:2910:2: rule__Action__Group_2__1__Impl rule__Action__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__2();

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
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // InternalRulesUNO.g:2917:1: rule__Action__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2921:1: ( ( '.' ) )
            // InternalRulesUNO.g:2922:1: ( '.' )
            {
            // InternalRulesUNO.g:2922:1: ( '.' )
            // InternalRulesUNO.g:2923:2: '.'
            {
             before(grammarAccess.getActionAccess().getFullStopKeyword_2_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getFullStopKeyword_2_1()); 

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
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__2"
    // InternalRulesUNO.g:2932:1: rule__Action__Group_2__2 : rule__Action__Group_2__2__Impl rule__Action__Group_2__3 ;
    public final void rule__Action__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2936:1: ( rule__Action__Group_2__2__Impl rule__Action__Group_2__3 )
            // InternalRulesUNO.g:2937:2: rule__Action__Group_2__2__Impl rule__Action__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__Action__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__3();

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
    // $ANTLR end "rule__Action__Group_2__2"


    // $ANTLR start "rule__Action__Group_2__2__Impl"
    // InternalRulesUNO.g:2944:1: rule__Action__Group_2__2__Impl : ( ( rule__Action__ActionAssignment_2_2 ) ) ;
    public final void rule__Action__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2948:1: ( ( ( rule__Action__ActionAssignment_2_2 ) ) )
            // InternalRulesUNO.g:2949:1: ( ( rule__Action__ActionAssignment_2_2 ) )
            {
            // InternalRulesUNO.g:2949:1: ( ( rule__Action__ActionAssignment_2_2 ) )
            // InternalRulesUNO.g:2950:2: ( rule__Action__ActionAssignment_2_2 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_2_2()); 
            // InternalRulesUNO.g:2951:2: ( rule__Action__ActionAssignment_2_2 )
            // InternalRulesUNO.g:2951:3: rule__Action__ActionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAssignment_2_2()); 

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
    // $ANTLR end "rule__Action__Group_2__2__Impl"


    // $ANTLR start "rule__Action__Group_2__3"
    // InternalRulesUNO.g:2959:1: rule__Action__Group_2__3 : rule__Action__Group_2__3__Impl ;
    public final void rule__Action__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2963:1: ( rule__Action__Group_2__3__Impl )
            // InternalRulesUNO.g:2964:2: rule__Action__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2__3__Impl();

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
    // $ANTLR end "rule__Action__Group_2__3"


    // $ANTLR start "rule__Action__Group_2__3__Impl"
    // InternalRulesUNO.g:2970:1: rule__Action__Group_2__3__Impl : ( '()' ) ;
    public final void rule__Action__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2974:1: ( ( '()' ) )
            // InternalRulesUNO.g:2975:1: ( '()' )
            {
            // InternalRulesUNO.g:2975:1: ( '()' )
            // InternalRulesUNO.g:2976:2: '()'
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_2_3()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftParenthesisRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__Action__Group_2__3__Impl"


    // $ANTLR start "rule__Attribut__Group_0__0"
    // InternalRulesUNO.g:2986:1: rule__Attribut__Group_0__0 : rule__Attribut__Group_0__0__Impl rule__Attribut__Group_0__1 ;
    public final void rule__Attribut__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:2990:1: ( rule__Attribut__Group_0__0__Impl rule__Attribut__Group_0__1 )
            // InternalRulesUNO.g:2991:2: rule__Attribut__Group_0__0__Impl rule__Attribut__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Attribut__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_0__1();

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
    // $ANTLR end "rule__Attribut__Group_0__0"


    // $ANTLR start "rule__Attribut__Group_0__0__Impl"
    // InternalRulesUNO.g:2998:1: rule__Attribut__Group_0__0__Impl : ( ( rule__Attribut__IdAssignment_0_0 ) ) ;
    public final void rule__Attribut__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3002:1: ( ( ( rule__Attribut__IdAssignment_0_0 ) ) )
            // InternalRulesUNO.g:3003:1: ( ( rule__Attribut__IdAssignment_0_0 ) )
            {
            // InternalRulesUNO.g:3003:1: ( ( rule__Attribut__IdAssignment_0_0 ) )
            // InternalRulesUNO.g:3004:2: ( rule__Attribut__IdAssignment_0_0 )
            {
             before(grammarAccess.getAttributAccess().getIdAssignment_0_0()); 
            // InternalRulesUNO.g:3005:2: ( rule__Attribut__IdAssignment_0_0 )
            // InternalRulesUNO.g:3005:3: rule__Attribut__IdAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__IdAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getIdAssignment_0_0()); 

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
    // $ANTLR end "rule__Attribut__Group_0__0__Impl"


    // $ANTLR start "rule__Attribut__Group_0__1"
    // InternalRulesUNO.g:3013:1: rule__Attribut__Group_0__1 : rule__Attribut__Group_0__1__Impl rule__Attribut__Group_0__2 ;
    public final void rule__Attribut__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3017:1: ( rule__Attribut__Group_0__1__Impl rule__Attribut__Group_0__2 )
            // InternalRulesUNO.g:3018:2: rule__Attribut__Group_0__1__Impl rule__Attribut__Group_0__2
            {
            pushFollow(FOLLOW_28);
            rule__Attribut__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_0__2();

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
    // $ANTLR end "rule__Attribut__Group_0__1"


    // $ANTLR start "rule__Attribut__Group_0__1__Impl"
    // InternalRulesUNO.g:3025:1: rule__Attribut__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Attribut__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3029:1: ( ( '.' ) )
            // InternalRulesUNO.g:3030:1: ( '.' )
            {
            // InternalRulesUNO.g:3030:1: ( '.' )
            // InternalRulesUNO.g:3031:2: '.'
            {
             before(grammarAccess.getAttributAccess().getFullStopKeyword_0_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__Attribut__Group_0__1__Impl"


    // $ANTLR start "rule__Attribut__Group_0__2"
    // InternalRulesUNO.g:3040:1: rule__Attribut__Group_0__2 : rule__Attribut__Group_0__2__Impl ;
    public final void rule__Attribut__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3044:1: ( rule__Attribut__Group_0__2__Impl )
            // InternalRulesUNO.g:3045:2: rule__Attribut__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group_0__2__Impl();

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
    // $ANTLR end "rule__Attribut__Group_0__2"


    // $ANTLR start "rule__Attribut__Group_0__2__Impl"
    // InternalRulesUNO.g:3051:1: rule__Attribut__Group_0__2__Impl : ( ( rule__Attribut__AttributAssignment_0_2 ) ) ;
    public final void rule__Attribut__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3055:1: ( ( ( rule__Attribut__AttributAssignment_0_2 ) ) )
            // InternalRulesUNO.g:3056:1: ( ( rule__Attribut__AttributAssignment_0_2 ) )
            {
            // InternalRulesUNO.g:3056:1: ( ( rule__Attribut__AttributAssignment_0_2 ) )
            // InternalRulesUNO.g:3057:2: ( rule__Attribut__AttributAssignment_0_2 )
            {
             before(grammarAccess.getAttributAccess().getAttributAssignment_0_2()); 
            // InternalRulesUNO.g:3058:2: ( rule__Attribut__AttributAssignment_0_2 )
            // InternalRulesUNO.g:3058:3: rule__Attribut__AttributAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__AttributAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getAttributAssignment_0_2()); 

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
    // $ANTLR end "rule__Attribut__Group_0__2__Impl"


    // $ANTLR start "rule__Attribut__Group_1__0"
    // InternalRulesUNO.g:3067:1: rule__Attribut__Group_1__0 : rule__Attribut__Group_1__0__Impl rule__Attribut__Group_1__1 ;
    public final void rule__Attribut__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3071:1: ( rule__Attribut__Group_1__0__Impl rule__Attribut__Group_1__1 )
            // InternalRulesUNO.g:3072:2: rule__Attribut__Group_1__0__Impl rule__Attribut__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Attribut__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_1__1();

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
    // $ANTLR end "rule__Attribut__Group_1__0"


    // $ANTLR start "rule__Attribut__Group_1__0__Impl"
    // InternalRulesUNO.g:3079:1: rule__Attribut__Group_1__0__Impl : ( ( rule__Attribut__IdAssignment_1_0 ) ) ;
    public final void rule__Attribut__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3083:1: ( ( ( rule__Attribut__IdAssignment_1_0 ) ) )
            // InternalRulesUNO.g:3084:1: ( ( rule__Attribut__IdAssignment_1_0 ) )
            {
            // InternalRulesUNO.g:3084:1: ( ( rule__Attribut__IdAssignment_1_0 ) )
            // InternalRulesUNO.g:3085:2: ( rule__Attribut__IdAssignment_1_0 )
            {
             before(grammarAccess.getAttributAccess().getIdAssignment_1_0()); 
            // InternalRulesUNO.g:3086:2: ( rule__Attribut__IdAssignment_1_0 )
            // InternalRulesUNO.g:3086:3: rule__Attribut__IdAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__IdAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getIdAssignment_1_0()); 

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
    // $ANTLR end "rule__Attribut__Group_1__0__Impl"


    // $ANTLR start "rule__Attribut__Group_1__1"
    // InternalRulesUNO.g:3094:1: rule__Attribut__Group_1__1 : rule__Attribut__Group_1__1__Impl rule__Attribut__Group_1__2 ;
    public final void rule__Attribut__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3098:1: ( rule__Attribut__Group_1__1__Impl rule__Attribut__Group_1__2 )
            // InternalRulesUNO.g:3099:2: rule__Attribut__Group_1__1__Impl rule__Attribut__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Attribut__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_1__2();

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
    // $ANTLR end "rule__Attribut__Group_1__1"


    // $ANTLR start "rule__Attribut__Group_1__1__Impl"
    // InternalRulesUNO.g:3106:1: rule__Attribut__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Attribut__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3110:1: ( ( '.' ) )
            // InternalRulesUNO.g:3111:1: ( '.' )
            {
            // InternalRulesUNO.g:3111:1: ( '.' )
            // InternalRulesUNO.g:3112:2: '.'
            {
             before(grammarAccess.getAttributAccess().getFullStopKeyword_1_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__Attribut__Group_1__1__Impl"


    // $ANTLR start "rule__Attribut__Group_1__2"
    // InternalRulesUNO.g:3121:1: rule__Attribut__Group_1__2 : rule__Attribut__Group_1__2__Impl ;
    public final void rule__Attribut__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3125:1: ( rule__Attribut__Group_1__2__Impl )
            // InternalRulesUNO.g:3126:2: rule__Attribut__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group_1__2__Impl();

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
    // $ANTLR end "rule__Attribut__Group_1__2"


    // $ANTLR start "rule__Attribut__Group_1__2__Impl"
    // InternalRulesUNO.g:3132:1: rule__Attribut__Group_1__2__Impl : ( ( rule__Attribut__AttributAssignment_1_2 ) ) ;
    public final void rule__Attribut__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3136:1: ( ( ( rule__Attribut__AttributAssignment_1_2 ) ) )
            // InternalRulesUNO.g:3137:1: ( ( rule__Attribut__AttributAssignment_1_2 ) )
            {
            // InternalRulesUNO.g:3137:1: ( ( rule__Attribut__AttributAssignment_1_2 ) )
            // InternalRulesUNO.g:3138:2: ( rule__Attribut__AttributAssignment_1_2 )
            {
             before(grammarAccess.getAttributAccess().getAttributAssignment_1_2()); 
            // InternalRulesUNO.g:3139:2: ( rule__Attribut__AttributAssignment_1_2 )
            // InternalRulesUNO.g:3139:3: rule__Attribut__AttributAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__AttributAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getAttributAssignment_1_2()); 

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
    // $ANTLR end "rule__Attribut__Group_1__2__Impl"


    // $ANTLR start "rule__Attribut__Group_2__0"
    // InternalRulesUNO.g:3148:1: rule__Attribut__Group_2__0 : rule__Attribut__Group_2__0__Impl rule__Attribut__Group_2__1 ;
    public final void rule__Attribut__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3152:1: ( rule__Attribut__Group_2__0__Impl rule__Attribut__Group_2__1 )
            // InternalRulesUNO.g:3153:2: rule__Attribut__Group_2__0__Impl rule__Attribut__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Attribut__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_2__1();

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
    // $ANTLR end "rule__Attribut__Group_2__0"


    // $ANTLR start "rule__Attribut__Group_2__0__Impl"
    // InternalRulesUNO.g:3160:1: rule__Attribut__Group_2__0__Impl : ( ( rule__Attribut__IdAssignment_2_0 ) ) ;
    public final void rule__Attribut__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3164:1: ( ( ( rule__Attribut__IdAssignment_2_0 ) ) )
            // InternalRulesUNO.g:3165:1: ( ( rule__Attribut__IdAssignment_2_0 ) )
            {
            // InternalRulesUNO.g:3165:1: ( ( rule__Attribut__IdAssignment_2_0 ) )
            // InternalRulesUNO.g:3166:2: ( rule__Attribut__IdAssignment_2_0 )
            {
             before(grammarAccess.getAttributAccess().getIdAssignment_2_0()); 
            // InternalRulesUNO.g:3167:2: ( rule__Attribut__IdAssignment_2_0 )
            // InternalRulesUNO.g:3167:3: rule__Attribut__IdAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__IdAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getIdAssignment_2_0()); 

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
    // $ANTLR end "rule__Attribut__Group_2__0__Impl"


    // $ANTLR start "rule__Attribut__Group_2__1"
    // InternalRulesUNO.g:3175:1: rule__Attribut__Group_2__1 : rule__Attribut__Group_2__1__Impl rule__Attribut__Group_2__2 ;
    public final void rule__Attribut__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3179:1: ( rule__Attribut__Group_2__1__Impl rule__Attribut__Group_2__2 )
            // InternalRulesUNO.g:3180:2: rule__Attribut__Group_2__1__Impl rule__Attribut__Group_2__2
            {
            pushFollow(FOLLOW_30);
            rule__Attribut__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_2__2();

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
    // $ANTLR end "rule__Attribut__Group_2__1"


    // $ANTLR start "rule__Attribut__Group_2__1__Impl"
    // InternalRulesUNO.g:3187:1: rule__Attribut__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Attribut__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3191:1: ( ( '.' ) )
            // InternalRulesUNO.g:3192:1: ( '.' )
            {
            // InternalRulesUNO.g:3192:1: ( '.' )
            // InternalRulesUNO.g:3193:2: '.'
            {
             before(grammarAccess.getAttributAccess().getFullStopKeyword_2_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getFullStopKeyword_2_1()); 

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
    // $ANTLR end "rule__Attribut__Group_2__1__Impl"


    // $ANTLR start "rule__Attribut__Group_2__2"
    // InternalRulesUNO.g:3202:1: rule__Attribut__Group_2__2 : rule__Attribut__Group_2__2__Impl ;
    public final void rule__Attribut__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3206:1: ( rule__Attribut__Group_2__2__Impl )
            // InternalRulesUNO.g:3207:2: rule__Attribut__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group_2__2__Impl();

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
    // $ANTLR end "rule__Attribut__Group_2__2"


    // $ANTLR start "rule__Attribut__Group_2__2__Impl"
    // InternalRulesUNO.g:3213:1: rule__Attribut__Group_2__2__Impl : ( ( rule__Attribut__AttributAssignment_2_2 ) ) ;
    public final void rule__Attribut__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3217:1: ( ( ( rule__Attribut__AttributAssignment_2_2 ) ) )
            // InternalRulesUNO.g:3218:1: ( ( rule__Attribut__AttributAssignment_2_2 ) )
            {
            // InternalRulesUNO.g:3218:1: ( ( rule__Attribut__AttributAssignment_2_2 ) )
            // InternalRulesUNO.g:3219:2: ( rule__Attribut__AttributAssignment_2_2 )
            {
             before(grammarAccess.getAttributAccess().getAttributAssignment_2_2()); 
            // InternalRulesUNO.g:3220:2: ( rule__Attribut__AttributAssignment_2_2 )
            // InternalRulesUNO.g:3220:3: rule__Attribut__AttributAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__AttributAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getAttributAssignment_2_2()); 

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
    // $ANTLR end "rule__Attribut__Group_2__2__Impl"


    // $ANTLR start "rule__ExpressionNumerique__Group__0"
    // InternalRulesUNO.g:3229:1: rule__ExpressionNumerique__Group__0 : rule__ExpressionNumerique__Group__0__Impl rule__ExpressionNumerique__Group__1 ;
    public final void rule__ExpressionNumerique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3233:1: ( rule__ExpressionNumerique__Group__0__Impl rule__ExpressionNumerique__Group__1 )
            // InternalRulesUNO.g:3234:2: rule__ExpressionNumerique__Group__0__Impl rule__ExpressionNumerique__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ExpressionNumerique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__Group__1();

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
    // $ANTLR end "rule__ExpressionNumerique__Group__0"


    // $ANTLR start "rule__ExpressionNumerique__Group__0__Impl"
    // InternalRulesUNO.g:3241:1: rule__ExpressionNumerique__Group__0__Impl : ( ( rule__ExpressionNumerique__ExpAssignment_0 ) ) ;
    public final void rule__ExpressionNumerique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3245:1: ( ( ( rule__ExpressionNumerique__ExpAssignment_0 ) ) )
            // InternalRulesUNO.g:3246:1: ( ( rule__ExpressionNumerique__ExpAssignment_0 ) )
            {
            // InternalRulesUNO.g:3246:1: ( ( rule__ExpressionNumerique__ExpAssignment_0 ) )
            // InternalRulesUNO.g:3247:2: ( rule__ExpressionNumerique__ExpAssignment_0 )
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getExpAssignment_0()); 
            // InternalRulesUNO.g:3248:2: ( rule__ExpressionNumerique__ExpAssignment_0 )
            // InternalRulesUNO.g:3248:3: rule__ExpressionNumerique__ExpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__ExpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionNumeriqueAccess().getExpAssignment_0()); 

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
    // $ANTLR end "rule__ExpressionNumerique__Group__0__Impl"


    // $ANTLR start "rule__ExpressionNumerique__Group__1"
    // InternalRulesUNO.g:3256:1: rule__ExpressionNumerique__Group__1 : rule__ExpressionNumerique__Group__1__Impl ;
    public final void rule__ExpressionNumerique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3260:1: ( rule__ExpressionNumerique__Group__1__Impl )
            // InternalRulesUNO.g:3261:2: rule__ExpressionNumerique__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionNumerique__Group__1"


    // $ANTLR start "rule__ExpressionNumerique__Group__1__Impl"
    // InternalRulesUNO.g:3267:1: rule__ExpressionNumerique__Group__1__Impl : ( ( rule__ExpressionNumerique__Group_1__0 )* ) ;
    public final void rule__ExpressionNumerique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3271:1: ( ( ( rule__ExpressionNumerique__Group_1__0 )* ) )
            // InternalRulesUNO.g:3272:1: ( ( rule__ExpressionNumerique__Group_1__0 )* )
            {
            // InternalRulesUNO.g:3272:1: ( ( rule__ExpressionNumerique__Group_1__0 )* )
            // InternalRulesUNO.g:3273:2: ( rule__ExpressionNumerique__Group_1__0 )*
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getGroup_1()); 
            // InternalRulesUNO.g:3274:2: ( rule__ExpressionNumerique__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=62 && LA27_0<=64)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRulesUNO.g:3274:3: rule__ExpressionNumerique__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ExpressionNumerique__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getExpressionNumeriqueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpressionNumerique__Group__1__Impl"


    // $ANTLR start "rule__ExpressionNumerique__Group_1__0"
    // InternalRulesUNO.g:3283:1: rule__ExpressionNumerique__Group_1__0 : rule__ExpressionNumerique__Group_1__0__Impl rule__ExpressionNumerique__Group_1__1 ;
    public final void rule__ExpressionNumerique__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3287:1: ( rule__ExpressionNumerique__Group_1__0__Impl rule__ExpressionNumerique__Group_1__1 )
            // InternalRulesUNO.g:3288:2: rule__ExpressionNumerique__Group_1__0__Impl rule__ExpressionNumerique__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpressionNumerique__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__Group_1__1();

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
    // $ANTLR end "rule__ExpressionNumerique__Group_1__0"


    // $ANTLR start "rule__ExpressionNumerique__Group_1__0__Impl"
    // InternalRulesUNO.g:3295:1: rule__ExpressionNumerique__Group_1__0__Impl : ( ( rule__ExpressionNumerique__OpAssignment_1_0 ) ) ;
    public final void rule__ExpressionNumerique__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3299:1: ( ( ( rule__ExpressionNumerique__OpAssignment_1_0 ) ) )
            // InternalRulesUNO.g:3300:1: ( ( rule__ExpressionNumerique__OpAssignment_1_0 ) )
            {
            // InternalRulesUNO.g:3300:1: ( ( rule__ExpressionNumerique__OpAssignment_1_0 ) )
            // InternalRulesUNO.g:3301:2: ( rule__ExpressionNumerique__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getOpAssignment_1_0()); 
            // InternalRulesUNO.g:3302:2: ( rule__ExpressionNumerique__OpAssignment_1_0 )
            // InternalRulesUNO.g:3302:3: rule__ExpressionNumerique__OpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionNumeriqueAccess().getOpAssignment_1_0()); 

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
    // $ANTLR end "rule__ExpressionNumerique__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionNumerique__Group_1__1"
    // InternalRulesUNO.g:3310:1: rule__ExpressionNumerique__Group_1__1 : rule__ExpressionNumerique__Group_1__1__Impl ;
    public final void rule__ExpressionNumerique__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3314:1: ( rule__ExpressionNumerique__Group_1__1__Impl )
            // InternalRulesUNO.g:3315:2: rule__ExpressionNumerique__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpressionNumerique__Group_1__1"


    // $ANTLR start "rule__ExpressionNumerique__Group_1__1__Impl"
    // InternalRulesUNO.g:3321:1: rule__ExpressionNumerique__Group_1__1__Impl : ( ( rule__ExpressionNumerique__ExpAssignment_1_1 ) ) ;
    public final void rule__ExpressionNumerique__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3325:1: ( ( ( rule__ExpressionNumerique__ExpAssignment_1_1 ) ) )
            // InternalRulesUNO.g:3326:1: ( ( rule__ExpressionNumerique__ExpAssignment_1_1 ) )
            {
            // InternalRulesUNO.g:3326:1: ( ( rule__ExpressionNumerique__ExpAssignment_1_1 ) )
            // InternalRulesUNO.g:3327:2: ( rule__ExpressionNumerique__ExpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getExpAssignment_1_1()); 
            // InternalRulesUNO.g:3328:2: ( rule__ExpressionNumerique__ExpAssignment_1_1 )
            // InternalRulesUNO.g:3328:3: rule__ExpressionNumerique__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionNumerique__ExpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionNumeriqueAccess().getExpAssignment_1_1()); 

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
    // $ANTLR end "rule__ExpressionNumerique__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionBooleene__Group__0"
    // InternalRulesUNO.g:3337:1: rule__ExpressionBooleene__Group__0 : rule__ExpressionBooleene__Group__0__Impl rule__ExpressionBooleene__Group__1 ;
    public final void rule__ExpressionBooleene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3341:1: ( rule__ExpressionBooleene__Group__0__Impl rule__ExpressionBooleene__Group__1 )
            // InternalRulesUNO.g:3342:2: rule__ExpressionBooleene__Group__0__Impl rule__ExpressionBooleene__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ExpressionBooleene__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__Group__1();

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
    // $ANTLR end "rule__ExpressionBooleene__Group__0"


    // $ANTLR start "rule__ExpressionBooleene__Group__0__Impl"
    // InternalRulesUNO.g:3349:1: rule__ExpressionBooleene__Group__0__Impl : ( ( rule__ExpressionBooleene__ExpAssignment_0 ) ) ;
    public final void rule__ExpressionBooleene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3353:1: ( ( ( rule__ExpressionBooleene__ExpAssignment_0 ) ) )
            // InternalRulesUNO.g:3354:1: ( ( rule__ExpressionBooleene__ExpAssignment_0 ) )
            {
            // InternalRulesUNO.g:3354:1: ( ( rule__ExpressionBooleene__ExpAssignment_0 ) )
            // InternalRulesUNO.g:3355:2: ( rule__ExpressionBooleene__ExpAssignment_0 )
            {
             before(grammarAccess.getExpressionBooleeneAccess().getExpAssignment_0()); 
            // InternalRulesUNO.g:3356:2: ( rule__ExpressionBooleene__ExpAssignment_0 )
            // InternalRulesUNO.g:3356:3: rule__ExpressionBooleene__ExpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__ExpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBooleeneAccess().getExpAssignment_0()); 

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
    // $ANTLR end "rule__ExpressionBooleene__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBooleene__Group__1"
    // InternalRulesUNO.g:3364:1: rule__ExpressionBooleene__Group__1 : rule__ExpressionBooleene__Group__1__Impl ;
    public final void rule__ExpressionBooleene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3368:1: ( rule__ExpressionBooleene__Group__1__Impl )
            // InternalRulesUNO.g:3369:2: rule__ExpressionBooleene__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionBooleene__Group__1"


    // $ANTLR start "rule__ExpressionBooleene__Group__1__Impl"
    // InternalRulesUNO.g:3375:1: rule__ExpressionBooleene__Group__1__Impl : ( ( rule__ExpressionBooleene__Group_1__0 )* ) ;
    public final void rule__ExpressionBooleene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3379:1: ( ( ( rule__ExpressionBooleene__Group_1__0 )* ) )
            // InternalRulesUNO.g:3380:1: ( ( rule__ExpressionBooleene__Group_1__0 )* )
            {
            // InternalRulesUNO.g:3380:1: ( ( rule__ExpressionBooleene__Group_1__0 )* )
            // InternalRulesUNO.g:3381:2: ( rule__ExpressionBooleene__Group_1__0 )*
            {
             before(grammarAccess.getExpressionBooleeneAccess().getGroup_1()); 
            // InternalRulesUNO.g:3382:2: ( rule__ExpressionBooleene__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=71 && LA28_0<=74)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRulesUNO.g:3382:3: rule__ExpressionBooleene__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__ExpressionBooleene__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getExpressionBooleeneAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpressionBooleene__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBooleene__Group_1__0"
    // InternalRulesUNO.g:3391:1: rule__ExpressionBooleene__Group_1__0 : rule__ExpressionBooleene__Group_1__0__Impl rule__ExpressionBooleene__Group_1__1 ;
    public final void rule__ExpressionBooleene__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3395:1: ( rule__ExpressionBooleene__Group_1__0__Impl rule__ExpressionBooleene__Group_1__1 )
            // InternalRulesUNO.g:3396:2: rule__ExpressionBooleene__Group_1__0__Impl rule__ExpressionBooleene__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpressionBooleene__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__Group_1__1();

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
    // $ANTLR end "rule__ExpressionBooleene__Group_1__0"


    // $ANTLR start "rule__ExpressionBooleene__Group_1__0__Impl"
    // InternalRulesUNO.g:3403:1: rule__ExpressionBooleene__Group_1__0__Impl : ( ( rule__ExpressionBooleene__LogAssignment_1_0 ) ) ;
    public final void rule__ExpressionBooleene__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3407:1: ( ( ( rule__ExpressionBooleene__LogAssignment_1_0 ) ) )
            // InternalRulesUNO.g:3408:1: ( ( rule__ExpressionBooleene__LogAssignment_1_0 ) )
            {
            // InternalRulesUNO.g:3408:1: ( ( rule__ExpressionBooleene__LogAssignment_1_0 ) )
            // InternalRulesUNO.g:3409:2: ( rule__ExpressionBooleene__LogAssignment_1_0 )
            {
             before(grammarAccess.getExpressionBooleeneAccess().getLogAssignment_1_0()); 
            // InternalRulesUNO.g:3410:2: ( rule__ExpressionBooleene__LogAssignment_1_0 )
            // InternalRulesUNO.g:3410:3: rule__ExpressionBooleene__LogAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__LogAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBooleeneAccess().getLogAssignment_1_0()); 

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
    // $ANTLR end "rule__ExpressionBooleene__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionBooleene__Group_1__1"
    // InternalRulesUNO.g:3418:1: rule__ExpressionBooleene__Group_1__1 : rule__ExpressionBooleene__Group_1__1__Impl ;
    public final void rule__ExpressionBooleene__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3422:1: ( rule__ExpressionBooleene__Group_1__1__Impl )
            // InternalRulesUNO.g:3423:2: rule__ExpressionBooleene__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpressionBooleene__Group_1__1"


    // $ANTLR start "rule__ExpressionBooleene__Group_1__1__Impl"
    // InternalRulesUNO.g:3429:1: rule__ExpressionBooleene__Group_1__1__Impl : ( ( rule__ExpressionBooleene__ExpAssignment_1_1 ) ) ;
    public final void rule__ExpressionBooleene__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3433:1: ( ( ( rule__ExpressionBooleene__ExpAssignment_1_1 ) ) )
            // InternalRulesUNO.g:3434:1: ( ( rule__ExpressionBooleene__ExpAssignment_1_1 ) )
            {
            // InternalRulesUNO.g:3434:1: ( ( rule__ExpressionBooleene__ExpAssignment_1_1 ) )
            // InternalRulesUNO.g:3435:2: ( rule__ExpressionBooleene__ExpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionBooleeneAccess().getExpAssignment_1_1()); 
            // InternalRulesUNO.g:3436:2: ( rule__ExpressionBooleene__ExpAssignment_1_1 )
            // InternalRulesUNO.g:3436:3: rule__ExpressionBooleene__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__ExpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBooleeneAccess().getExpAssignment_1_1()); 

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
    // $ANTLR end "rule__ExpressionBooleene__Group_1__1__Impl"


    // $ANTLR start "rule__Booleen__Group_2__0"
    // InternalRulesUNO.g:3445:1: rule__Booleen__Group_2__0 : rule__Booleen__Group_2__0__Impl rule__Booleen__Group_2__1 ;
    public final void rule__Booleen__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3449:1: ( rule__Booleen__Group_2__0__Impl rule__Booleen__Group_2__1 )
            // InternalRulesUNO.g:3450:2: rule__Booleen__Group_2__0__Impl rule__Booleen__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__Booleen__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Booleen__Group_2__1();

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
    // $ANTLR end "rule__Booleen__Group_2__0"


    // $ANTLR start "rule__Booleen__Group_2__0__Impl"
    // InternalRulesUNO.g:3457:1: rule__Booleen__Group_2__0__Impl : ( ( rule__Booleen__Exp1Assignment_2_0 ) ) ;
    public final void rule__Booleen__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3461:1: ( ( ( rule__Booleen__Exp1Assignment_2_0 ) ) )
            // InternalRulesUNO.g:3462:1: ( ( rule__Booleen__Exp1Assignment_2_0 ) )
            {
            // InternalRulesUNO.g:3462:1: ( ( rule__Booleen__Exp1Assignment_2_0 ) )
            // InternalRulesUNO.g:3463:2: ( rule__Booleen__Exp1Assignment_2_0 )
            {
             before(grammarAccess.getBooleenAccess().getExp1Assignment_2_0()); 
            // InternalRulesUNO.g:3464:2: ( rule__Booleen__Exp1Assignment_2_0 )
            // InternalRulesUNO.g:3464:3: rule__Booleen__Exp1Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__Exp1Assignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleenAccess().getExp1Assignment_2_0()); 

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
    // $ANTLR end "rule__Booleen__Group_2__0__Impl"


    // $ANTLR start "rule__Booleen__Group_2__1"
    // InternalRulesUNO.g:3472:1: rule__Booleen__Group_2__1 : rule__Booleen__Group_2__1__Impl rule__Booleen__Group_2__2 ;
    public final void rule__Booleen__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3476:1: ( rule__Booleen__Group_2__1__Impl rule__Booleen__Group_2__2 )
            // InternalRulesUNO.g:3477:2: rule__Booleen__Group_2__1__Impl rule__Booleen__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__Booleen__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Booleen__Group_2__2();

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
    // $ANTLR end "rule__Booleen__Group_2__1"


    // $ANTLR start "rule__Booleen__Group_2__1__Impl"
    // InternalRulesUNO.g:3484:1: rule__Booleen__Group_2__1__Impl : ( ( rule__Booleen__CompAssignment_2_1 ) ) ;
    public final void rule__Booleen__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3488:1: ( ( ( rule__Booleen__CompAssignment_2_1 ) ) )
            // InternalRulesUNO.g:3489:1: ( ( rule__Booleen__CompAssignment_2_1 ) )
            {
            // InternalRulesUNO.g:3489:1: ( ( rule__Booleen__CompAssignment_2_1 ) )
            // InternalRulesUNO.g:3490:2: ( rule__Booleen__CompAssignment_2_1 )
            {
             before(grammarAccess.getBooleenAccess().getCompAssignment_2_1()); 
            // InternalRulesUNO.g:3491:2: ( rule__Booleen__CompAssignment_2_1 )
            // InternalRulesUNO.g:3491:3: rule__Booleen__CompAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__CompAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleenAccess().getCompAssignment_2_1()); 

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
    // $ANTLR end "rule__Booleen__Group_2__1__Impl"


    // $ANTLR start "rule__Booleen__Group_2__2"
    // InternalRulesUNO.g:3499:1: rule__Booleen__Group_2__2 : rule__Booleen__Group_2__2__Impl ;
    public final void rule__Booleen__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3503:1: ( rule__Booleen__Group_2__2__Impl )
            // InternalRulesUNO.g:3504:2: rule__Booleen__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__Group_2__2__Impl();

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
    // $ANTLR end "rule__Booleen__Group_2__2"


    // $ANTLR start "rule__Booleen__Group_2__2__Impl"
    // InternalRulesUNO.g:3510:1: rule__Booleen__Group_2__2__Impl : ( ( rule__Booleen__Exp2Assignment_2_2 ) ) ;
    public final void rule__Booleen__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3514:1: ( ( ( rule__Booleen__Exp2Assignment_2_2 ) ) )
            // InternalRulesUNO.g:3515:1: ( ( rule__Booleen__Exp2Assignment_2_2 ) )
            {
            // InternalRulesUNO.g:3515:1: ( ( rule__Booleen__Exp2Assignment_2_2 ) )
            // InternalRulesUNO.g:3516:2: ( rule__Booleen__Exp2Assignment_2_2 )
            {
             before(grammarAccess.getBooleenAccess().getExp2Assignment_2_2()); 
            // InternalRulesUNO.g:3517:2: ( rule__Booleen__Exp2Assignment_2_2 )
            // InternalRulesUNO.g:3517:3: rule__Booleen__Exp2Assignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__Exp2Assignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleenAccess().getExp2Assignment_2_2()); 

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
    // $ANTLR end "rule__Booleen__Group_2__2__Impl"


    // $ANTLR start "rule__BooleanContraire__Group__0"
    // InternalRulesUNO.g:3526:1: rule__BooleanContraire__Group__0 : rule__BooleanContraire__Group__0__Impl rule__BooleanContraire__Group__1 ;
    public final void rule__BooleanContraire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3530:1: ( rule__BooleanContraire__Group__0__Impl rule__BooleanContraire__Group__1 )
            // InternalRulesUNO.g:3531:2: rule__BooleanContraire__Group__0__Impl rule__BooleanContraire__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__BooleanContraire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanContraire__Group__1();

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
    // $ANTLR end "rule__BooleanContraire__Group__0"


    // $ANTLR start "rule__BooleanContraire__Group__0__Impl"
    // InternalRulesUNO.g:3538:1: rule__BooleanContraire__Group__0__Impl : ( '!' ) ;
    public final void rule__BooleanContraire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3542:1: ( ( '!' ) )
            // InternalRulesUNO.g:3543:1: ( '!' )
            {
            // InternalRulesUNO.g:3543:1: ( '!' )
            // InternalRulesUNO.g:3544:2: '!'
            {
             before(grammarAccess.getBooleanContraireAccess().getExclamationMarkKeyword_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getBooleanContraireAccess().getExclamationMarkKeyword_0()); 

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
    // $ANTLR end "rule__BooleanContraire__Group__0__Impl"


    // $ANTLR start "rule__BooleanContraire__Group__1"
    // InternalRulesUNO.g:3553:1: rule__BooleanContraire__Group__1 : rule__BooleanContraire__Group__1__Impl ;
    public final void rule__BooleanContraire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3557:1: ( rule__BooleanContraire__Group__1__Impl )
            // InternalRulesUNO.g:3558:2: rule__BooleanContraire__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanContraire__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanContraire__Group__1"


    // $ANTLR start "rule__BooleanContraire__Group__1__Impl"
    // InternalRulesUNO.g:3564:1: rule__BooleanContraire__Group__1__Impl : ( ruleBooleen ) ;
    public final void rule__BooleanContraire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3568:1: ( ( ruleBooleen ) )
            // InternalRulesUNO.g:3569:1: ( ruleBooleen )
            {
            // InternalRulesUNO.g:3569:1: ( ruleBooleen )
            // InternalRulesUNO.g:3570:2: ruleBooleen
            {
             before(grammarAccess.getBooleanContraireAccess().getBooleenParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleBooleen();

            state._fsp--;

             after(grammarAccess.getBooleanContraireAccess().getBooleenParserRuleCall_1()); 

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
    // $ANTLR end "rule__BooleanContraire__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalRulesUNO.g:3580:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3584:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalRulesUNO.g:3585:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalRulesUNO.g:3592:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3596:1: ( ( 'if' ) )
            // InternalRulesUNO.g:3597:1: ( 'if' )
            {
            // InternalRulesUNO.g:3597:1: ( 'if' )
            // InternalRulesUNO.g:3598:2: 'if'
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalRulesUNO.g:3607:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3611:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalRulesUNO.g:3612:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalRulesUNO.g:3619:1: rule__Condition__Group__1__Impl : ( '(' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3623:1: ( ( '(' ) )
            // InternalRulesUNO.g:3624:1: ( '(' )
            {
            // InternalRulesUNO.g:3624:1: ( '(' )
            // InternalRulesUNO.g:3625:2: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalRulesUNO.g:3634:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3638:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalRulesUNO.g:3639:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalRulesUNO.g:3646:1: rule__Condition__Group__2__Impl : ( ruleExpressionBooleene ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3650:1: ( ( ruleExpressionBooleene ) )
            // InternalRulesUNO.g:3651:1: ( ruleExpressionBooleene )
            {
            // InternalRulesUNO.g:3651:1: ( ruleExpressionBooleene )
            // InternalRulesUNO.g:3652:2: ruleExpressionBooleene
            {
             before(grammarAccess.getConditionAccess().getExpressionBooleeneParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleExpressionBooleene();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionBooleeneParserRuleCall_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalRulesUNO.g:3661:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3665:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalRulesUNO.g:3666:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalRulesUNO.g:3673:1: rule__Condition__Group__3__Impl : ( ')' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3677:1: ( ( ')' ) )
            // InternalRulesUNO.g:3678:1: ( ')' )
            {
            // InternalRulesUNO.g:3678:1: ( ')' )
            // InternalRulesUNO.g:3679:2: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalRulesUNO.g:3688:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3692:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalRulesUNO.g:3693:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

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
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalRulesUNO.g:3700:1: rule__Condition__Group__4__Impl : ( '{' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3704:1: ( ( '{' ) )
            // InternalRulesUNO.g:3705:1: ( '{' )
            {
            // InternalRulesUNO.g:3705:1: ( '{' )
            // InternalRulesUNO.g:3706:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalRulesUNO.g:3715:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3719:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalRulesUNO.g:3720:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__6();

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
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalRulesUNO.g:3727:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__DeclarationAlorsAssignment_5 )* ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3731:1: ( ( ( rule__Condition__DeclarationAlorsAssignment_5 )* ) )
            // InternalRulesUNO.g:3732:1: ( ( rule__Condition__DeclarationAlorsAssignment_5 )* )
            {
            // InternalRulesUNO.g:3732:1: ( ( rule__Condition__DeclarationAlorsAssignment_5 )* )
            // InternalRulesUNO.g:3733:2: ( rule__Condition__DeclarationAlorsAssignment_5 )*
            {
             before(grammarAccess.getConditionAccess().getDeclarationAlorsAssignment_5()); 
            // InternalRulesUNO.g:3734:2: ( rule__Condition__DeclarationAlorsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==11||(LA29_0>=28 && LA29_0<=33)||(LA29_0>=55 && LA29_0<=58)||LA29_0==87||LA29_0==91) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRulesUNO.g:3734:3: rule__Condition__DeclarationAlorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Condition__DeclarationAlorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getDeclarationAlorsAssignment_5()); 

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
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__6"
    // InternalRulesUNO.g:3742:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl rule__Condition__Group__7 ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3746:1: ( rule__Condition__Group__6__Impl rule__Condition__Group__7 )
            // InternalRulesUNO.g:3747:2: rule__Condition__Group__6__Impl rule__Condition__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__Condition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__7();

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
    // $ANTLR end "rule__Condition__Group__6"


    // $ANTLR start "rule__Condition__Group__6__Impl"
    // InternalRulesUNO.g:3754:1: rule__Condition__Group__6__Impl : ( '}' ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3758:1: ( ( '}' ) )
            // InternalRulesUNO.g:3759:1: ( '}' )
            {
            // InternalRulesUNO.g:3759:1: ( '}' )
            // InternalRulesUNO.g:3760:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Condition__Group__6__Impl"


    // $ANTLR start "rule__Condition__Group__7"
    // InternalRulesUNO.g:3769:1: rule__Condition__Group__7 : rule__Condition__Group__7__Impl ;
    public final void rule__Condition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3773:1: ( rule__Condition__Group__7__Impl )
            // InternalRulesUNO.g:3774:2: rule__Condition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__7__Impl();

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
    // $ANTLR end "rule__Condition__Group__7"


    // $ANTLR start "rule__Condition__Group__7__Impl"
    // InternalRulesUNO.g:3780:1: rule__Condition__Group__7__Impl : ( ( rule__Condition__Group_7__0 )? ) ;
    public final void rule__Condition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3784:1: ( ( ( rule__Condition__Group_7__0 )? ) )
            // InternalRulesUNO.g:3785:1: ( ( rule__Condition__Group_7__0 )? )
            {
            // InternalRulesUNO.g:3785:1: ( ( rule__Condition__Group_7__0 )? )
            // InternalRulesUNO.g:3786:2: ( rule__Condition__Group_7__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_7()); 
            // InternalRulesUNO.g:3787:2: ( rule__Condition__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==94) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRulesUNO.g:3787:3: rule__Condition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Condition__Group__7__Impl"


    // $ANTLR start "rule__Condition__Group_7__0"
    // InternalRulesUNO.g:3796:1: rule__Condition__Group_7__0 : rule__Condition__Group_7__0__Impl rule__Condition__Group_7__1 ;
    public final void rule__Condition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3800:1: ( rule__Condition__Group_7__0__Impl rule__Condition__Group_7__1 )
            // InternalRulesUNO.g:3801:2: rule__Condition__Group_7__0__Impl rule__Condition__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_7__1();

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
    // $ANTLR end "rule__Condition__Group_7__0"


    // $ANTLR start "rule__Condition__Group_7__0__Impl"
    // InternalRulesUNO.g:3808:1: rule__Condition__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__Condition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3812:1: ( ( 'else' ) )
            // InternalRulesUNO.g:3813:1: ( 'else' )
            {
            // InternalRulesUNO.g:3813:1: ( 'else' )
            // InternalRulesUNO.g:3814:2: 'else'
            {
             before(grammarAccess.getConditionAccess().getElseKeyword_7_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getElseKeyword_7_0()); 

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
    // $ANTLR end "rule__Condition__Group_7__0__Impl"


    // $ANTLR start "rule__Condition__Group_7__1"
    // InternalRulesUNO.g:3823:1: rule__Condition__Group_7__1 : rule__Condition__Group_7__1__Impl rule__Condition__Group_7__2 ;
    public final void rule__Condition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3827:1: ( rule__Condition__Group_7__1__Impl rule__Condition__Group_7__2 )
            // InternalRulesUNO.g:3828:2: rule__Condition__Group_7__1__Impl rule__Condition__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_7__2();

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
    // $ANTLR end "rule__Condition__Group_7__1"


    // $ANTLR start "rule__Condition__Group_7__1__Impl"
    // InternalRulesUNO.g:3835:1: rule__Condition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Condition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3839:1: ( ( '{' ) )
            // InternalRulesUNO.g:3840:1: ( '{' )
            {
            // InternalRulesUNO.g:3840:1: ( '{' )
            // InternalRulesUNO.g:3841:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Condition__Group_7__1__Impl"


    // $ANTLR start "rule__Condition__Group_7__2"
    // InternalRulesUNO.g:3850:1: rule__Condition__Group_7__2 : rule__Condition__Group_7__2__Impl rule__Condition__Group_7__3 ;
    public final void rule__Condition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3854:1: ( rule__Condition__Group_7__2__Impl rule__Condition__Group_7__3 )
            // InternalRulesUNO.g:3855:2: rule__Condition__Group_7__2__Impl rule__Condition__Group_7__3
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_7__3();

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
    // $ANTLR end "rule__Condition__Group_7__2"


    // $ANTLR start "rule__Condition__Group_7__2__Impl"
    // InternalRulesUNO.g:3862:1: rule__Condition__Group_7__2__Impl : ( ( rule__Condition__DeclarationSinonAssignment_7_2 )* ) ;
    public final void rule__Condition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3866:1: ( ( ( rule__Condition__DeclarationSinonAssignment_7_2 )* ) )
            // InternalRulesUNO.g:3867:1: ( ( rule__Condition__DeclarationSinonAssignment_7_2 )* )
            {
            // InternalRulesUNO.g:3867:1: ( ( rule__Condition__DeclarationSinonAssignment_7_2 )* )
            // InternalRulesUNO.g:3868:2: ( rule__Condition__DeclarationSinonAssignment_7_2 )*
            {
             before(grammarAccess.getConditionAccess().getDeclarationSinonAssignment_7_2()); 
            // InternalRulesUNO.g:3869:2: ( rule__Condition__DeclarationSinonAssignment_7_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==11||(LA31_0>=28 && LA31_0<=33)||(LA31_0>=55 && LA31_0<=58)||LA31_0==87||LA31_0==91) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRulesUNO.g:3869:3: rule__Condition__DeclarationSinonAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Condition__DeclarationSinonAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getDeclarationSinonAssignment_7_2()); 

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
    // $ANTLR end "rule__Condition__Group_7__2__Impl"


    // $ANTLR start "rule__Condition__Group_7__3"
    // InternalRulesUNO.g:3877:1: rule__Condition__Group_7__3 : rule__Condition__Group_7__3__Impl ;
    public final void rule__Condition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3881:1: ( rule__Condition__Group_7__3__Impl )
            // InternalRulesUNO.g:3882:2: rule__Condition__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_7__3__Impl();

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
    // $ANTLR end "rule__Condition__Group_7__3"


    // $ANTLR start "rule__Condition__Group_7__3__Impl"
    // InternalRulesUNO.g:3888:1: rule__Condition__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Condition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3892:1: ( ( '}' ) )
            // InternalRulesUNO.g:3893:1: ( '}' )
            {
            // InternalRulesUNO.g:3893:1: ( '}' )
            // InternalRulesUNO.g:3894:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__Condition__Group_7__3__Impl"


    // $ANTLR start "rule__Uno__NbJoueurAssignment_2"
    // InternalRulesUNO.g:3904:1: rule__Uno__NbJoueurAssignment_2 : ( ruleNbJoueur ) ;
    public final void rule__Uno__NbJoueurAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3908:1: ( ( ruleNbJoueur ) )
            // InternalRulesUNO.g:3909:2: ( ruleNbJoueur )
            {
            // InternalRulesUNO.g:3909:2: ( ruleNbJoueur )
            // InternalRulesUNO.g:3910:3: ruleNbJoueur
            {
             before(grammarAccess.getUnoAccess().getNbJoueurNbJoueurParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNbJoueur();

            state._fsp--;

             after(grammarAccess.getUnoAccess().getNbJoueurNbJoueurParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Uno__NbJoueurAssignment_2"


    // $ANTLR start "rule__Uno__ParticipantTypeAssignment_3"
    // InternalRulesUNO.g:3919:1: rule__Uno__ParticipantTypeAssignment_3 : ( ruleParticipantType ) ;
    public final void rule__Uno__ParticipantTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3923:1: ( ( ruleParticipantType ) )
            // InternalRulesUNO.g:3924:2: ( ruleParticipantType )
            {
            // InternalRulesUNO.g:3924:2: ( ruleParticipantType )
            // InternalRulesUNO.g:3925:3: ruleParticipantType
            {
             before(grammarAccess.getUnoAccess().getParticipantTypeParticipantTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipantType();

            state._fsp--;

             after(grammarAccess.getUnoAccess().getParticipantTypeParticipantTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Uno__ParticipantTypeAssignment_3"


    // $ANTLR start "rule__Uno__VariantesAssignment_4"
    // InternalRulesUNO.g:3934:1: rule__Uno__VariantesAssignment_4 : ( ruleVariantes ) ;
    public final void rule__Uno__VariantesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3938:1: ( ( ruleVariantes ) )
            // InternalRulesUNO.g:3939:2: ( ruleVariantes )
            {
            // InternalRulesUNO.g:3939:2: ( ruleVariantes )
            // InternalRulesUNO.g:3940:3: ruleVariantes
            {
             before(grammarAccess.getUnoAccess().getVariantesVariantesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariantes();

            state._fsp--;

             after(grammarAccess.getUnoAccess().getVariantesVariantesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Uno__VariantesAssignment_4"


    // $ANTLR start "rule__Uno__ReglesAssignment_5"
    // InternalRulesUNO.g:3949:1: rule__Uno__ReglesAssignment_5 : ( ruleRegles ) ;
    public final void rule__Uno__ReglesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3953:1: ( ( ruleRegles ) )
            // InternalRulesUNO.g:3954:2: ( ruleRegles )
            {
            // InternalRulesUNO.g:3954:2: ( ruleRegles )
            // InternalRulesUNO.g:3955:3: ruleRegles
            {
             before(grammarAccess.getUnoAccess().getReglesReglesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRegles();

            state._fsp--;

             after(grammarAccess.getUnoAccess().getReglesReglesParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Uno__ReglesAssignment_5"


    // $ANTLR start "rule__ParticipantType__IdAssignment_2"
    // InternalRulesUNO.g:3964:1: rule__ParticipantType__IdAssignment_2 : ( ( rule__ParticipantType__IdAlternatives_2_0 ) ) ;
    public final void rule__ParticipantType__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3968:1: ( ( ( rule__ParticipantType__IdAlternatives_2_0 ) ) )
            // InternalRulesUNO.g:3969:2: ( ( rule__ParticipantType__IdAlternatives_2_0 ) )
            {
            // InternalRulesUNO.g:3969:2: ( ( rule__ParticipantType__IdAlternatives_2_0 ) )
            // InternalRulesUNO.g:3970:3: ( rule__ParticipantType__IdAlternatives_2_0 )
            {
             before(grammarAccess.getParticipantTypeAccess().getIdAlternatives_2_0()); 
            // InternalRulesUNO.g:3971:3: ( rule__ParticipantType__IdAlternatives_2_0 )
            // InternalRulesUNO.g:3971:4: rule__ParticipantType__IdAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantType__IdAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantTypeAccess().getIdAlternatives_2_0()); 

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
    // $ANTLR end "rule__ParticipantType__IdAssignment_2"


    // $ANTLR start "rule__NbJoueur__ValAssignment_2"
    // InternalRulesUNO.g:3979:1: rule__NbJoueur__ValAssignment_2 : ( RULE_INT ) ;
    public final void rule__NbJoueur__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3983:1: ( ( RULE_INT ) )
            // InternalRulesUNO.g:3984:2: ( RULE_INT )
            {
            // InternalRulesUNO.g:3984:2: ( RULE_INT )
            // InternalRulesUNO.g:3985:3: RULE_INT
            {
             before(grammarAccess.getNbJoueurAccess().getValINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNbJoueurAccess().getValINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__NbJoueur__ValAssignment_2"


    // $ANTLR start "rule__Variantes__VariantesAssignment_3_0"
    // InternalRulesUNO.g:3994:1: rule__Variantes__VariantesAssignment_3_0 : ( ruleVariante ) ;
    public final void rule__Variantes__VariantesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:3998:1: ( ( ruleVariante ) )
            // InternalRulesUNO.g:3999:2: ( ruleVariante )
            {
            // InternalRulesUNO.g:3999:2: ( ruleVariante )
            // InternalRulesUNO.g:4000:3: ruleVariante
            {
             before(grammarAccess.getVariantesAccess().getVariantesVarianteParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariante();

            state._fsp--;

             after(grammarAccess.getVariantesAccess().getVariantesVarianteParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Variantes__VariantesAssignment_3_0"


    // $ANTLR start "rule__Variantes__VariantesAssignment_3_1_1"
    // InternalRulesUNO.g:4009:1: rule__Variantes__VariantesAssignment_3_1_1 : ( ruleVariante ) ;
    public final void rule__Variantes__VariantesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4013:1: ( ( ruleVariante ) )
            // InternalRulesUNO.g:4014:2: ( ruleVariante )
            {
            // InternalRulesUNO.g:4014:2: ( ruleVariante )
            // InternalRulesUNO.g:4015:3: ruleVariante
            {
             before(grammarAccess.getVariantesAccess().getVariantesVarianteParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariante();

            state._fsp--;

             after(grammarAccess.getVariantesAccess().getVariantesVarianteParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Variantes__VariantesAssignment_3_1_1"


    // $ANTLR start "rule__Regles__DeclarationsAssignment_3"
    // InternalRulesUNO.g:4024:1: rule__Regles__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Regles__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4028:1: ( ( ruleDeclaration ) )
            // InternalRulesUNO.g:4029:2: ( ruleDeclaration )
            {
            // InternalRulesUNO.g:4029:2: ( ruleDeclaration )
            // InternalRulesUNO.g:4030:3: ruleDeclaration
            {
             before(grammarAccess.getReglesAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getReglesAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Regles__DeclarationsAssignment_3"


    // $ANTLR start "rule__Affectation__AttributAssignment_0"
    // InternalRulesUNO.g:4039:1: rule__Affectation__AttributAssignment_0 : ( ruleAttribut ) ;
    public final void rule__Affectation__AttributAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4043:1: ( ( ruleAttribut ) )
            // InternalRulesUNO.g:4044:2: ( ruleAttribut )
            {
            // InternalRulesUNO.g:4044:2: ( ruleAttribut )
            // InternalRulesUNO.g:4045:3: ruleAttribut
            {
             before(grammarAccess.getAffectationAccess().getAttributAttributParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getAttributAttributParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Affectation__AttributAssignment_0"


    // $ANTLR start "rule__Affectation__ExpressionAssignment_2"
    // InternalRulesUNO.g:4054:1: rule__Affectation__ExpressionAssignment_2 : ( ruleExpressionNumerique ) ;
    public final void rule__Affectation__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4058:1: ( ( ruleExpressionNumerique ) )
            // InternalRulesUNO.g:4059:2: ( ruleExpressionNumerique )
            {
            // InternalRulesUNO.g:4059:2: ( ruleExpressionNumerique )
            // InternalRulesUNO.g:4060:3: ruleExpressionNumerique
            {
             before(grammarAccess.getAffectationAccess().getExpressionExpressionNumeriqueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionNumerique();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getExpressionExpressionNumeriqueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Affectation__ExpressionAssignment_2"


    // $ANTLR start "rule__InstructionChoix__InstructionsAssignment_2"
    // InternalRulesUNO.g:4069:1: rule__InstructionChoix__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__InstructionChoix__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4073:1: ( ( ruleInstruction ) )
            // InternalRulesUNO.g:4074:2: ( ruleInstruction )
            {
            // InternalRulesUNO.g:4074:2: ( ruleInstruction )
            // InternalRulesUNO.g:4075:3: ruleInstruction
            {
             before(grammarAccess.getInstructionChoixAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionChoixAccess().getInstructionsInstructionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__InstructionChoix__InstructionsAssignment_2"


    // $ANTLR start "rule__InstructionChoix__InstructionsAssignment_3"
    // InternalRulesUNO.g:4084:1: rule__InstructionChoix__InstructionsAssignment_3 : ( ruleInstruction ) ;
    public final void rule__InstructionChoix__InstructionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4088:1: ( ( ruleInstruction ) )
            // InternalRulesUNO.g:4089:2: ( ruleInstruction )
            {
            // InternalRulesUNO.g:4089:2: ( ruleInstruction )
            // InternalRulesUNO.g:4090:3: ruleInstruction
            {
             before(grammarAccess.getInstructionChoixAccess().getInstructionsInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionChoixAccess().getInstructionsInstructionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InstructionChoix__InstructionsAssignment_3"


    // $ANTLR start "rule__VariableNumerique__VarAssignment"
    // InternalRulesUNO.g:4099:1: rule__VariableNumerique__VarAssignment : ( ruleAttribut ) ;
    public final void rule__VariableNumerique__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4103:1: ( ( ruleAttribut ) )
            // InternalRulesUNO.g:4104:2: ( ruleAttribut )
            {
            // InternalRulesUNO.g:4104:2: ( ruleAttribut )
            // InternalRulesUNO.g:4105:3: ruleAttribut
            {
             before(grammarAccess.getVariableNumeriqueAccess().getVarAttributParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getVariableNumeriqueAccess().getVarAttributParserRuleCall_0()); 

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
    // $ANTLR end "rule__VariableNumerique__VarAssignment"


    // $ANTLR start "rule__VariableBooleene__VarAssignment_0"
    // InternalRulesUNO.g:4114:1: rule__VariableBooleene__VarAssignment_0 : ( ruleVariante ) ;
    public final void rule__VariableBooleene__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4118:1: ( ( ruleVariante ) )
            // InternalRulesUNO.g:4119:2: ( ruleVariante )
            {
            // InternalRulesUNO.g:4119:2: ( ruleVariante )
            // InternalRulesUNO.g:4120:3: ruleVariante
            {
             before(grammarAccess.getVariableBooleeneAccess().getVarVarianteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariante();

            state._fsp--;

             after(grammarAccess.getVariableBooleeneAccess().getVarVarianteParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariableBooleene__VarAssignment_0"


    // $ANTLR start "rule__VariableBooleene__ActionAssignment_1"
    // InternalRulesUNO.g:4129:1: rule__VariableBooleene__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__VariableBooleene__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4133:1: ( ( ruleAction ) )
            // InternalRulesUNO.g:4134:2: ( ruleAction )
            {
            // InternalRulesUNO.g:4134:2: ( ruleAction )
            // InternalRulesUNO.g:4135:3: ruleAction
            {
             before(grammarAccess.getVariableBooleeneAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getVariableBooleeneAccess().getActionActionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableBooleene__ActionAssignment_1"


    // $ANTLR start "rule__Action__IdAssignment_0_0"
    // InternalRulesUNO.g:4144:1: rule__Action__IdAssignment_0_0 : ( ruleJoueur ) ;
    public final void rule__Action__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4148:1: ( ( ruleJoueur ) )
            // InternalRulesUNO.g:4149:2: ( ruleJoueur )
            {
            // InternalRulesUNO.g:4149:2: ( ruleJoueur )
            // InternalRulesUNO.g:4150:3: ruleJoueur
            {
             before(grammarAccess.getActionAccess().getIdJoueurParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getActionAccess().getIdJoueurParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Action__IdAssignment_0_0"


    // $ANTLR start "rule__Action__ActionAssignment_0_2"
    // InternalRulesUNO.g:4159:1: rule__Action__ActionAssignment_0_2 : ( ruleActionJoueur ) ;
    public final void rule__Action__ActionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4163:1: ( ( ruleActionJoueur ) )
            // InternalRulesUNO.g:4164:2: ( ruleActionJoueur )
            {
            // InternalRulesUNO.g:4164:2: ( ruleActionJoueur )
            // InternalRulesUNO.g:4165:3: ruleActionJoueur
            {
             before(grammarAccess.getActionAccess().getActionActionJoueurParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionJoueur();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionActionJoueurParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Action__ActionAssignment_0_2"


    // $ANTLR start "rule__Action__IdAssignment_1_0"
    // InternalRulesUNO.g:4174:1: rule__Action__IdAssignment_1_0 : ( ruleManche ) ;
    public final void rule__Action__IdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4178:1: ( ( ruleManche ) )
            // InternalRulesUNO.g:4179:2: ( ruleManche )
            {
            // InternalRulesUNO.g:4179:2: ( ruleManche )
            // InternalRulesUNO.g:4180:3: ruleManche
            {
             before(grammarAccess.getActionAccess().getIdMancheParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleManche();

            state._fsp--;

             after(grammarAccess.getActionAccess().getIdMancheParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Action__IdAssignment_1_0"


    // $ANTLR start "rule__Action__ActionAssignment_1_2"
    // InternalRulesUNO.g:4189:1: rule__Action__ActionAssignment_1_2 : ( ruleActionManche ) ;
    public final void rule__Action__ActionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4193:1: ( ( ruleActionManche ) )
            // InternalRulesUNO.g:4194:2: ( ruleActionManche )
            {
            // InternalRulesUNO.g:4194:2: ( ruleActionManche )
            // InternalRulesUNO.g:4195:3: ruleActionManche
            {
             before(grammarAccess.getActionAccess().getActionActionMancheParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionManche();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionActionMancheParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Action__ActionAssignment_1_2"


    // $ANTLR start "rule__Action__IdAssignment_2_0"
    // InternalRulesUNO.g:4204:1: rule__Action__IdAssignment_2_0 : ( ruleParticipant ) ;
    public final void rule__Action__IdAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4208:1: ( ( ruleParticipant ) )
            // InternalRulesUNO.g:4209:2: ( ruleParticipant )
            {
            // InternalRulesUNO.g:4209:2: ( ruleParticipant )
            // InternalRulesUNO.g:4210:3: ruleParticipant
            {
             before(grammarAccess.getActionAccess().getIdParticipantParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getActionAccess().getIdParticipantParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Action__IdAssignment_2_0"


    // $ANTLR start "rule__Action__ActionAssignment_2_2"
    // InternalRulesUNO.g:4219:1: rule__Action__ActionAssignment_2_2 : ( ruleActionParticipant ) ;
    public final void rule__Action__ActionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4223:1: ( ( ruleActionParticipant ) )
            // InternalRulesUNO.g:4224:2: ( ruleActionParticipant )
            {
            // InternalRulesUNO.g:4224:2: ( ruleActionParticipant )
            // InternalRulesUNO.g:4225:3: ruleActionParticipant
            {
             before(grammarAccess.getActionAccess().getActionActionParticipantParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionParticipant();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionActionParticipantParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Action__ActionAssignment_2_2"


    // $ANTLR start "rule__Attribut__IdAssignment_0_0"
    // InternalRulesUNO.g:4234:1: rule__Attribut__IdAssignment_0_0 : ( ruleJoueur ) ;
    public final void rule__Attribut__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4238:1: ( ( ruleJoueur ) )
            // InternalRulesUNO.g:4239:2: ( ruleJoueur )
            {
            // InternalRulesUNO.g:4239:2: ( ruleJoueur )
            // InternalRulesUNO.g:4240:3: ruleJoueur
            {
             before(grammarAccess.getAttributAccess().getIdJoueurParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getIdJoueurParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Attribut__IdAssignment_0_0"


    // $ANTLR start "rule__Attribut__AttributAssignment_0_2"
    // InternalRulesUNO.g:4249:1: rule__Attribut__AttributAssignment_0_2 : ( ruleAttributJoueur ) ;
    public final void rule__Attribut__AttributAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4253:1: ( ( ruleAttributJoueur ) )
            // InternalRulesUNO.g:4254:2: ( ruleAttributJoueur )
            {
            // InternalRulesUNO.g:4254:2: ( ruleAttributJoueur )
            // InternalRulesUNO.g:4255:3: ruleAttributJoueur
            {
             before(grammarAccess.getAttributAccess().getAttributAttributJoueurParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributJoueur();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getAttributAttributJoueurParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Attribut__AttributAssignment_0_2"


    // $ANTLR start "rule__Attribut__IdAssignment_1_0"
    // InternalRulesUNO.g:4264:1: rule__Attribut__IdAssignment_1_0 : ( ruleManche ) ;
    public final void rule__Attribut__IdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4268:1: ( ( ruleManche ) )
            // InternalRulesUNO.g:4269:2: ( ruleManche )
            {
            // InternalRulesUNO.g:4269:2: ( ruleManche )
            // InternalRulesUNO.g:4270:3: ruleManche
            {
             before(grammarAccess.getAttributAccess().getIdMancheParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleManche();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getIdMancheParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Attribut__IdAssignment_1_0"


    // $ANTLR start "rule__Attribut__AttributAssignment_1_2"
    // InternalRulesUNO.g:4279:1: rule__Attribut__AttributAssignment_1_2 : ( ruleAttributManche ) ;
    public final void rule__Attribut__AttributAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4283:1: ( ( ruleAttributManche ) )
            // InternalRulesUNO.g:4284:2: ( ruleAttributManche )
            {
            // InternalRulesUNO.g:4284:2: ( ruleAttributManche )
            // InternalRulesUNO.g:4285:3: ruleAttributManche
            {
             before(grammarAccess.getAttributAccess().getAttributAttributMancheParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributManche();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getAttributAttributMancheParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Attribut__AttributAssignment_1_2"


    // $ANTLR start "rule__Attribut__IdAssignment_2_0"
    // InternalRulesUNO.g:4294:1: rule__Attribut__IdAssignment_2_0 : ( ruleParticipant ) ;
    public final void rule__Attribut__IdAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4298:1: ( ( ruleParticipant ) )
            // InternalRulesUNO.g:4299:2: ( ruleParticipant )
            {
            // InternalRulesUNO.g:4299:2: ( ruleParticipant )
            // InternalRulesUNO.g:4300:3: ruleParticipant
            {
             before(grammarAccess.getAttributAccess().getIdParticipantParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getIdParticipantParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Attribut__IdAssignment_2_0"


    // $ANTLR start "rule__Attribut__AttributAssignment_2_2"
    // InternalRulesUNO.g:4309:1: rule__Attribut__AttributAssignment_2_2 : ( ruleAttributParticipant ) ;
    public final void rule__Attribut__AttributAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4313:1: ( ( ruleAttributParticipant ) )
            // InternalRulesUNO.g:4314:2: ( ruleAttributParticipant )
            {
            // InternalRulesUNO.g:4314:2: ( ruleAttributParticipant )
            // InternalRulesUNO.g:4315:3: ruleAttributParticipant
            {
             before(grammarAccess.getAttributAccess().getAttributAttributParticipantParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributParticipant();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getAttributAttributParticipantParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Attribut__AttributAssignment_2_2"


    // $ANTLR start "rule__ExpressionNumerique__ExpAssignment_0"
    // InternalRulesUNO.g:4324:1: rule__ExpressionNumerique__ExpAssignment_0 : ( ruleEntier ) ;
    public final void rule__ExpressionNumerique__ExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4328:1: ( ( ruleEntier ) )
            // InternalRulesUNO.g:4329:2: ( ruleEntier )
            {
            // InternalRulesUNO.g:4329:2: ( ruleEntier )
            // InternalRulesUNO.g:4330:3: ruleEntier
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getExpEntierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntier();

            state._fsp--;

             after(grammarAccess.getExpressionNumeriqueAccess().getExpEntierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExpressionNumerique__ExpAssignment_0"


    // $ANTLR start "rule__ExpressionNumerique__OpAssignment_1_0"
    // InternalRulesUNO.g:4339:1: rule__ExpressionNumerique__OpAssignment_1_0 : ( ruleOperateur ) ;
    public final void rule__ExpressionNumerique__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4343:1: ( ( ruleOperateur ) )
            // InternalRulesUNO.g:4344:2: ( ruleOperateur )
            {
            // InternalRulesUNO.g:4344:2: ( ruleOperateur )
            // InternalRulesUNO.g:4345:3: ruleOperateur
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getOpOperateurParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperateur();

            state._fsp--;

             after(grammarAccess.getExpressionNumeriqueAccess().getOpOperateurParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ExpressionNumerique__OpAssignment_1_0"


    // $ANTLR start "rule__ExpressionNumerique__ExpAssignment_1_1"
    // InternalRulesUNO.g:4354:1: rule__ExpressionNumerique__ExpAssignment_1_1 : ( ruleEntier ) ;
    public final void rule__ExpressionNumerique__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4358:1: ( ( ruleEntier ) )
            // InternalRulesUNO.g:4359:2: ( ruleEntier )
            {
            // InternalRulesUNO.g:4359:2: ( ruleEntier )
            // InternalRulesUNO.g:4360:3: ruleEntier
            {
             before(grammarAccess.getExpressionNumeriqueAccess().getExpEntierParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntier();

            state._fsp--;

             after(grammarAccess.getExpressionNumeriqueAccess().getExpEntierParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ExpressionNumerique__ExpAssignment_1_1"


    // $ANTLR start "rule__ExpressionBooleene__ExpAssignment_0"
    // InternalRulesUNO.g:4369:1: rule__ExpressionBooleene__ExpAssignment_0 : ( ( rule__ExpressionBooleene__ExpAlternatives_0_0 ) ) ;
    public final void rule__ExpressionBooleene__ExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4373:1: ( ( ( rule__ExpressionBooleene__ExpAlternatives_0_0 ) ) )
            // InternalRulesUNO.g:4374:2: ( ( rule__ExpressionBooleene__ExpAlternatives_0_0 ) )
            {
            // InternalRulesUNO.g:4374:2: ( ( rule__ExpressionBooleene__ExpAlternatives_0_0 ) )
            // InternalRulesUNO.g:4375:3: ( rule__ExpressionBooleene__ExpAlternatives_0_0 )
            {
             before(grammarAccess.getExpressionBooleeneAccess().getExpAlternatives_0_0()); 
            // InternalRulesUNO.g:4376:3: ( rule__ExpressionBooleene__ExpAlternatives_0_0 )
            // InternalRulesUNO.g:4376:4: rule__ExpressionBooleene__ExpAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__ExpAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBooleeneAccess().getExpAlternatives_0_0()); 

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
    // $ANTLR end "rule__ExpressionBooleene__ExpAssignment_0"


    // $ANTLR start "rule__ExpressionBooleene__LogAssignment_1_0"
    // InternalRulesUNO.g:4384:1: rule__ExpressionBooleene__LogAssignment_1_0 : ( ruleLogique ) ;
    public final void rule__ExpressionBooleene__LogAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4388:1: ( ( ruleLogique ) )
            // InternalRulesUNO.g:4389:2: ( ruleLogique )
            {
            // InternalRulesUNO.g:4389:2: ( ruleLogique )
            // InternalRulesUNO.g:4390:3: ruleLogique
            {
             before(grammarAccess.getExpressionBooleeneAccess().getLogLogiqueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLogique();

            state._fsp--;

             after(grammarAccess.getExpressionBooleeneAccess().getLogLogiqueParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ExpressionBooleene__LogAssignment_1_0"


    // $ANTLR start "rule__ExpressionBooleene__ExpAssignment_1_1"
    // InternalRulesUNO.g:4399:1: rule__ExpressionBooleene__ExpAssignment_1_1 : ( ( rule__ExpressionBooleene__ExpAlternatives_1_1_0 ) ) ;
    public final void rule__ExpressionBooleene__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4403:1: ( ( ( rule__ExpressionBooleene__ExpAlternatives_1_1_0 ) ) )
            // InternalRulesUNO.g:4404:2: ( ( rule__ExpressionBooleene__ExpAlternatives_1_1_0 ) )
            {
            // InternalRulesUNO.g:4404:2: ( ( rule__ExpressionBooleene__ExpAlternatives_1_1_0 ) )
            // InternalRulesUNO.g:4405:3: ( rule__ExpressionBooleene__ExpAlternatives_1_1_0 )
            {
             before(grammarAccess.getExpressionBooleeneAccess().getExpAlternatives_1_1_0()); 
            // InternalRulesUNO.g:4406:3: ( rule__ExpressionBooleene__ExpAlternatives_1_1_0 )
            // InternalRulesUNO.g:4406:4: rule__ExpressionBooleene__ExpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBooleene__ExpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBooleeneAccess().getExpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__ExpressionBooleene__ExpAssignment_1_1"


    // $ANTLR start "rule__Entier__ValAssignment_0"
    // InternalRulesUNO.g:4414:1: rule__Entier__ValAssignment_0 : ( RULE_INT ) ;
    public final void rule__Entier__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4418:1: ( ( RULE_INT ) )
            // InternalRulesUNO.g:4419:2: ( RULE_INT )
            {
            // InternalRulesUNO.g:4419:2: ( RULE_INT )
            // InternalRulesUNO.g:4420:3: RULE_INT
            {
             before(grammarAccess.getEntierAccess().getValINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntierAccess().getValINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Entier__ValAssignment_0"


    // $ANTLR start "rule__Entier__AttAssignment_1"
    // InternalRulesUNO.g:4429:1: rule__Entier__AttAssignment_1 : ( ruleVariableNumerique ) ;
    public final void rule__Entier__AttAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4433:1: ( ( ruleVariableNumerique ) )
            // InternalRulesUNO.g:4434:2: ( ruleVariableNumerique )
            {
            // InternalRulesUNO.g:4434:2: ( ruleVariableNumerique )
            // InternalRulesUNO.g:4435:3: ruleVariableNumerique
            {
             before(grammarAccess.getEntierAccess().getAttVariableNumeriqueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableNumerique();

            state._fsp--;

             after(grammarAccess.getEntierAccess().getAttVariableNumeriqueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entier__AttAssignment_1"


    // $ANTLR start "rule__Booleen__ValAssignment_0"
    // InternalRulesUNO.g:4444:1: rule__Booleen__ValAssignment_0 : ( ( rule__Booleen__ValAlternatives_0_0 ) ) ;
    public final void rule__Booleen__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4448:1: ( ( ( rule__Booleen__ValAlternatives_0_0 ) ) )
            // InternalRulesUNO.g:4449:2: ( ( rule__Booleen__ValAlternatives_0_0 ) )
            {
            // InternalRulesUNO.g:4449:2: ( ( rule__Booleen__ValAlternatives_0_0 ) )
            // InternalRulesUNO.g:4450:3: ( rule__Booleen__ValAlternatives_0_0 )
            {
             before(grammarAccess.getBooleenAccess().getValAlternatives_0_0()); 
            // InternalRulesUNO.g:4451:3: ( rule__Booleen__ValAlternatives_0_0 )
            // InternalRulesUNO.g:4451:4: rule__Booleen__ValAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__ValAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleenAccess().getValAlternatives_0_0()); 

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
    // $ANTLR end "rule__Booleen__ValAssignment_0"


    // $ANTLR start "rule__Booleen__VarAssignment_1"
    // InternalRulesUNO.g:4459:1: rule__Booleen__VarAssignment_1 : ( ruleVariableBooleene ) ;
    public final void rule__Booleen__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4463:1: ( ( ruleVariableBooleene ) )
            // InternalRulesUNO.g:4464:2: ( ruleVariableBooleene )
            {
            // InternalRulesUNO.g:4464:2: ( ruleVariableBooleene )
            // InternalRulesUNO.g:4465:3: ruleVariableBooleene
            {
             before(grammarAccess.getBooleenAccess().getVarVariableBooleeneParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableBooleene();

            state._fsp--;

             after(grammarAccess.getBooleenAccess().getVarVariableBooleeneParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Booleen__VarAssignment_1"


    // $ANTLR start "rule__Booleen__Exp1Assignment_2_0"
    // InternalRulesUNO.g:4474:1: rule__Booleen__Exp1Assignment_2_0 : ( ruleExpressionNumerique ) ;
    public final void rule__Booleen__Exp1Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4478:1: ( ( ruleExpressionNumerique ) )
            // InternalRulesUNO.g:4479:2: ( ruleExpressionNumerique )
            {
            // InternalRulesUNO.g:4479:2: ( ruleExpressionNumerique )
            // InternalRulesUNO.g:4480:3: ruleExpressionNumerique
            {
             before(grammarAccess.getBooleenAccess().getExp1ExpressionNumeriqueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionNumerique();

            state._fsp--;

             after(grammarAccess.getBooleenAccess().getExp1ExpressionNumeriqueParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Booleen__Exp1Assignment_2_0"


    // $ANTLR start "rule__Booleen__CompAssignment_2_1"
    // InternalRulesUNO.g:4489:1: rule__Booleen__CompAssignment_2_1 : ( ruleComparateur ) ;
    public final void rule__Booleen__CompAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4493:1: ( ( ruleComparateur ) )
            // InternalRulesUNO.g:4494:2: ( ruleComparateur )
            {
            // InternalRulesUNO.g:4494:2: ( ruleComparateur )
            // InternalRulesUNO.g:4495:3: ruleComparateur
            {
             before(grammarAccess.getBooleenAccess().getCompComparateurParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparateur();

            state._fsp--;

             after(grammarAccess.getBooleenAccess().getCompComparateurParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Booleen__CompAssignment_2_1"


    // $ANTLR start "rule__Booleen__Exp2Assignment_2_2"
    // InternalRulesUNO.g:4504:1: rule__Booleen__Exp2Assignment_2_2 : ( ruleExpressionNumerique ) ;
    public final void rule__Booleen__Exp2Assignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4508:1: ( ( ruleExpressionNumerique ) )
            // InternalRulesUNO.g:4509:2: ( ruleExpressionNumerique )
            {
            // InternalRulesUNO.g:4509:2: ( ruleExpressionNumerique )
            // InternalRulesUNO.g:4510:3: ruleExpressionNumerique
            {
             before(grammarAccess.getBooleenAccess().getExp2ExpressionNumeriqueParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionNumerique();

            state._fsp--;

             after(grammarAccess.getBooleenAccess().getExp2ExpressionNumeriqueParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Booleen__Exp2Assignment_2_2"


    // $ANTLR start "rule__Condition__DeclarationAlorsAssignment_5"
    // InternalRulesUNO.g:4519:1: rule__Condition__DeclarationAlorsAssignment_5 : ( ruleDeclaration ) ;
    public final void rule__Condition__DeclarationAlorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4523:1: ( ( ruleDeclaration ) )
            // InternalRulesUNO.g:4524:2: ( ruleDeclaration )
            {
            // InternalRulesUNO.g:4524:2: ( ruleDeclaration )
            // InternalRulesUNO.g:4525:3: ruleDeclaration
            {
             before(grammarAccess.getConditionAccess().getDeclarationAlorsDeclarationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getDeclarationAlorsDeclarationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Condition__DeclarationAlorsAssignment_5"


    // $ANTLR start "rule__Condition__DeclarationSinonAssignment_7_2"
    // InternalRulesUNO.g:4534:1: rule__Condition__DeclarationSinonAssignment_7_2 : ( ruleDeclaration ) ;
    public final void rule__Condition__DeclarationSinonAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRulesUNO.g:4538:1: ( ( ruleDeclaration ) )
            // InternalRulesUNO.g:4539:2: ( ruleDeclaration )
            {
            // InternalRulesUNO.g:4539:2: ( ruleDeclaration )
            // InternalRulesUNO.g:4540:3: ruleDeclaration
            {
             before(grammarAccess.getConditionAccess().getDeclarationSinonDeclarationParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getDeclarationSinonDeclarationParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Condition__DeclarationSinonAssignment_7_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\13\1\uffff\13\130\1\uffff\1\14\1\30\1\15\1\uffff";
    static final String dfa_3s = "\1\133\1\uffff\13\130\1\uffff\1\66\1\33\1\75\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\13\uffff\1\2\3\uffff\1\3";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\20\uffff\1\2\1\3\1\4\1\5\1\6\1\7\25\uffff\1\11\1\12\1\13\1\14\34\uffff\1\1\3\uffff\1\15",
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
            "\1\21\25\uffff\25\1",
            "\2\21\2\1",
            "\1\21\55\uffff\3\1",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "898:1: rule__Declaration__Alternatives : ( ( ruleInstruction ) | ( ruleCondition ) | ( ruleAffectation ) );";
        }
    }
    static final String dfa_7s = "\1\4\2\uffff\13\130\1\uffff\1\14\1\30\1\15";
    static final String dfa_8s = "\1\114\2\uffff\13\130\1\uffff\1\66\1\33\1\75";
    static final String dfa_9s = "\1\uffff\1\1\1\2\13\uffff\1\3\3\uffff";
    static final String[] dfa_10s = {
            "\1\16\6\uffff\1\11\2\uffff\1\2\1\uffff\10\2\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\25\uffff\1\12\1\13\1\14\1\15\20\uffff\2\1",
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
            "\1\16\25\uffff\25\2",
            "\2\16\2\2",
            "\1\16\55\uffff\3\2"
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "1534:1: rule__Booleen__Alternatives : ( ( ( rule__Booleen__ValAssignment_0 ) ) | ( ( rule__Booleen__VarAssignment_1 ) ) | ( ( rule__Booleen__Group_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000FF4000L,0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000FF4000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x07800003F0000800L,0x0000000008808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x07800003F0000802L,0x0000000008800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x07800003F0000810L,0x0000000008800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x07800003F0000800L,0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x07800003F0000800L,0x0000000000808000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x07800003F0000802L,0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x007FFFFC00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x07800003F0FF4810L,0x000000000C801800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007EL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x07800003F0FF4810L,0x0000000008801800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});

}