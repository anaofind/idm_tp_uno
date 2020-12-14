package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesUNOLexer extends Lexer {
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

    public InternalRulesUNOLexer() {;} 
    public InternalRulesUNOLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRulesUNOLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRulesUNO.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:11:7: ( 'RUno' )
            // InternalRulesUNO.g:11:9: 'RUno'
            {
            match("RUno"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:12:7: ( '{' )
            // InternalRulesUNO.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:13:7: ( '}' )
            // InternalRulesUNO.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:14:7: ( 'participant' )
            // InternalRulesUNO.g:14:9: 'participant'
            {
            match("participant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:15:7: ( '=' )
            // InternalRulesUNO.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:16:7: ( 'EQUIPE' )
            // InternalRulesUNO.g:16:9: 'EQUIPE'
            {
            match("EQUIPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:17:7: ( 'JOUEUR' )
            // InternalRulesUNO.g:17:9: 'JOUEUR'
            {
            match("JOUEUR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:18:7: ( ';' )
            // InternalRulesUNO.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:19:7: ( 'nb_joueur' )
            // InternalRulesUNO.g:19:9: 'nb_joueur'
            {
            match("nb_joueur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:20:7: ( 'variantes' )
            // InternalRulesUNO.g:20:9: 'variantes'
            {
            match("variantes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:21:7: ( ',' )
            // InternalRulesUNO.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:22:7: ( 'regles' )
            // InternalRulesUNO.g:22:9: 'regles'
            {
            match("regles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:23:7: ( 'choix' )
            // InternalRulesUNO.g:23:9: 'choix'
            {
            match("choix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:24:7: ( 'BASE' )
            // InternalRulesUNO.g:24:9: 'BASE'
            {
            match("BASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:25:7: ( 'DEUX_JOUEURS' )
            // InternalRulesUNO.g:25:9: 'DEUX_JOUEURS'
            {
            match("DEUX_JOUEURS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:26:7: ( 'UNO_CHALENGE' )
            // InternalRulesUNO.g:26:9: 'UNO_CHALENGE'
            {
            match("UNO_CHALENGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:27:7: ( 'CARTES_IDENTIQUES' )
            // InternalRulesUNO.g:27:9: 'CARTES_IDENTIQUES'
            {
            match("CARTES_IDENTIQUES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:28:7: ( 'SUITES' )
            // InternalRulesUNO.g:28:9: 'SUITES'
            {
            match("SUITES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:29:7: ( 'ZERO_ECHANGE' )
            // InternalRulesUNO.g:29:9: 'ZERO_ECHANGE'
            {
            match("ZERO_ECHANGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:30:7: ( 'ZERO_TOURNANT' )
            // InternalRulesUNO.g:30:9: 'ZERO_TOURNANT'
            {
            match("ZERO_TOURNANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:31:7: ( 'ZERO_QUESTION' )
            // InternalRulesUNO.g:31:9: 'ZERO_QUESTION'
            {
            match("ZERO_QUESTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:32:7: ( 'MANCHE' )
            // InternalRulesUNO.g:32:9: 'MANCHE'
            {
            match("MANCHE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:33:7: ( 'NB_JOUEUR' )
            // InternalRulesUNO.g:33:9: 'NB_JOUEUR'
            {
            match("NB_JOUEUR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:34:7: ( 'NB_PARTICIPANT' )
            // InternalRulesUNO.g:34:9: 'NB_PARTICIPANT'
            {
            match("NB_PARTICIPANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:35:7: ( 'FINIR' )
            // InternalRulesUNO.g:35:9: 'FINIR'
            {
            match("FINIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:36:7: ( 'NOUVELLE' )
            // InternalRulesUNO.g:36:9: 'NOUVELLE'
            {
            match("NOUVELLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:37:7: ( 'JOUEUR_COURRANT' )
            // InternalRulesUNO.g:37:9: 'JOUEUR_COURRANT'
            {
            match("JOUEUR_COURRANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:38:7: ( 'JOUEUR_SUIVANT' )
            // InternalRulesUNO.g:38:9: 'JOUEUR_SUIVANT'
            {
            match("JOUEUR_SUIVANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:39:7: ( 'JOUEUR_TOUS' )
            // InternalRulesUNO.g:39:9: 'JOUEUR_TOUS'
            {
            match("JOUEUR_TOUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:40:7: ( 'JOUEUR_AUTRE' )
            // InternalRulesUNO.g:40:9: 'JOUEUR_AUTRE'
            {
            match("JOUEUR_AUTRE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:41:7: ( 'JOUEUR_EXISTE' )
            // InternalRulesUNO.g:41:9: 'JOUEUR_EXISTE'
            {
            match("JOUEUR_EXISTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:42:7: ( 'JOUEUR_SELECTIONNE' )
            // InternalRulesUNO.g:42:9: 'JOUEUR_SELECTIONNE'
            {
            match("JOUEUR_SELECTIONNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:43:7: ( 'CRIER_UNO' )
            // InternalRulesUNO.g:43:9: 'CRIER_UNO'
            {
            match("CRIER_UNO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:44:7: ( 'JOUER_CARTE_BASE' )
            // InternalRulesUNO.g:44:9: 'JOUER_CARTE_BASE'
            {
            match("JOUER_CARTE_BASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:45:7: ( 'JOUER_CARTE_JOKER' )
            // InternalRulesUNO.g:45:9: 'JOUER_CARTE_JOKER'
            {
            match("JOUER_CARTE_JOKER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:46:7: ( 'JOUER_CARTE_INVERSER_SENS' )
            // InternalRulesUNO.g:46:9: 'JOUER_CARTE_INVERSER_SENS'
            {
            match("JOUER_CARTE_INVERSER_SENS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:47:7: ( 'JOUER_CARTE_PASSE_TON_TOUR' )
            // InternalRulesUNO.g:47:9: 'JOUER_CARTE_PASSE_TON_TOUR'
            {
            match("JOUER_CARTE_PASSE_TON_TOUR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:48:7: ( 'JOUER_CARTE_PLUS_2' )
            // InternalRulesUNO.g:48:9: 'JOUER_CARTE_PLUS_2'
            {
            match("JOUER_CARTE_PLUS_2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:49:7: ( 'JOUER_CARTE_PLUS_4' )
            // InternalRulesUNO.g:49:9: 'JOUER_CARTE_PLUS_4'
            {
            match("JOUER_CARTE_PLUS_4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:50:7: ( 'JOUER_PLUSIEURS_CARTES_IDENTIQUES' )
            // InternalRulesUNO.g:50:9: 'JOUER_PLUSIEURS_CARTES_IDENTIQUES'
            {
            match("JOUER_PLUSIEURS_CARTES_IDENTIQUES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:51:7: ( 'JOUER_CARTE_ZERO' )
            // InternalRulesUNO.g:51:9: 'JOUER_CARTE_ZERO'
            {
            match("JOUER_CARTE_ZERO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:52:7: ( 'JOUER_SUITE_DE_CARTES' )
            // InternalRulesUNO.g:52:9: 'JOUER_SUITE_DE_CARTES'
            {
            match("JOUER_SUITE_DE_CARTES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:53:7: ( 'POSER_QUESTION' )
            // InternalRulesUNO.g:53:9: 'POSER_QUESTION'
            {
            match("POSER_QUESTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:54:7: ( 'REJOUER' )
            // InternalRulesUNO.g:54:9: 'REJOUER'
            {
            match("REJOUER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:55:7: ( 'PASSER_SON_TOUR' )
            // InternalRulesUNO.g:55:9: 'PASSER_SON_TOUR'
            {
            match("PASSER_SON_TOUR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:56:7: ( 'CHANGER_COULEUR' )
            // InternalRulesUNO.g:56:9: 'CHANGER_COULEUR'
            {
            match("CHANGER_COULEUR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:57:7: ( 'CHOISIR_COULEUR' )
            // InternalRulesUNO.g:57:9: 'CHOISIR_COULEUR'
            {
            match("CHOISIR_COULEUR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:58:7: ( 'PIOCHER_2_CARTES' )
            // InternalRulesUNO.g:58:9: 'PIOCHER_2_CARTES'
            {
            match("PIOCHER_2_CARTES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:59:7: ( 'PIOCHER_4_CARTES' )
            // InternalRulesUNO.g:59:9: 'PIOCHER_4_CARTES'
            {
            match("PIOCHER_4_CARTES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:60:7: ( 'INVERSER_SENS' )
            // InternalRulesUNO.g:60:9: 'INVERSER_SENS'
            {
            match("INVERSER_SENS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:61:7: ( 'DONNER_CARTES_AU_JOUEUR_SUIVANT' )
            // InternalRulesUNO.g:61:9: 'DONNER_CARTES_AU_JOUEUR_SUIVANT'
            {
            match("DONNER_CARTES_AU_JOUEUR_SUIVANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:62:7: ( 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE' )
            // InternalRulesUNO.g:62:9: 'ECHANGER_JEU_AVEC_UN_ADVERSAIRE'
            {
            match("ECHANGER_JEU_AVEC_UN_ADVERSAIRE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:63:7: ( 'REMARQUER_ERREUR_UNO' )
            // InternalRulesUNO.g:63:9: 'REMARQUER_ERREUR_UNO'
            {
            match("REMARQUER_ERREUR_UNO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:64:7: ( 'NB_CARTES' )
            // InternalRulesUNO.g:64:9: 'NB_CARTES'
            {
            match("NB_CARTES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:65:7: ( 'PARTICIPANT_COURRANT' )
            // InternalRulesUNO.g:65:9: 'PARTICIPANT_COURRANT'
            {
            match("PARTICIPANT_COURRANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:66:7: ( 'PARTICIPANT_EXISTE' )
            // InternalRulesUNO.g:66:9: 'PARTICIPANT_EXISTE'
            {
            match("PARTICIPANT_EXISTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:67:7: ( 'PARTICIPANT_SELECTIONNE' )
            // InternalRulesUNO.g:67:9: 'PARTICIPANT_SELECTIONNE'
            {
            match("PARTICIPANT_SELECTIONNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:68:7: ( 'PARTICIPANT_MIN_POINTS' )
            // InternalRulesUNO.g:68:9: 'PARTICIPANT_MIN_POINTS'
            {
            match("PARTICIPANT_MIN_POINTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:69:7: ( 'GAGNER' )
            // InternalRulesUNO.g:69:9: 'GAGNER'
            {
            match("GAGNER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:70:7: ( 'PERDRE' )
            // InternalRulesUNO.g:70:9: 'PERDRE'
            {
            match("PERDRE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:71:7: ( 'ETRE_ELIMINE' )
            // InternalRulesUNO.g:71:9: 'ETRE_ELIMINE'
            {
            match("ETRE_ELIMINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:72:7: ( 'POINTS' )
            // InternalRulesUNO.g:72:9: 'POINTS'
            {
            match("POINTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:73:7: ( '.' )
            // InternalRulesUNO.g:73:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:74:7: ( '()' )
            // InternalRulesUNO.g:74:9: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:75:7: ( '+' )
            // InternalRulesUNO.g:75:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:76:7: ( '-' )
            // InternalRulesUNO.g:76:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:77:7: ( '%' )
            // InternalRulesUNO.g:77:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:78:7: ( '>' )
            // InternalRulesUNO.g:78:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:79:7: ( '<' )
            // InternalRulesUNO.g:79:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:80:7: ( '>=' )
            // InternalRulesUNO.g:80:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:81:7: ( '<=' )
            // InternalRulesUNO.g:81:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:82:7: ( '==' )
            // InternalRulesUNO.g:82:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:83:7: ( '!=' )
            // InternalRulesUNO.g:83:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:84:7: ( '&&' )
            // InternalRulesUNO.g:84:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:85:7: ( '||' )
            // InternalRulesUNO.g:85:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:86:7: ( '->' )
            // InternalRulesUNO.g:86:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:87:7: ( '<->' )
            // InternalRulesUNO.g:87:9: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:88:7: ( 'true' )
            // InternalRulesUNO.g:88:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:89:7: ( 'false' )
            // InternalRulesUNO.g:89:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:90:7: ( '!' )
            // InternalRulesUNO.g:90:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:91:7: ( 'if' )
            // InternalRulesUNO.g:91:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:92:7: ( '(' )
            // InternalRulesUNO.g:92:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:93:7: ( ')' )
            // InternalRulesUNO.g:93:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:94:7: ( 'else' )
            // InternalRulesUNO.g:94:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:2187:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRulesUNO.g:2187:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRulesUNO.g:2187:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRulesUNO.g:2187:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRulesUNO.g:2187:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRulesUNO.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:2189:10: ( ( '0' .. '9' )+ )
            // InternalRulesUNO.g:2189:12: ( '0' .. '9' )+
            {
            // InternalRulesUNO.g:2189:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRulesUNO.g:2189:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:2191:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRulesUNO.g:2191:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRulesUNO.g:2191:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRulesUNO.g:2191:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRulesUNO.g:2191:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRulesUNO.g:2191:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRulesUNO.g:2191:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRulesUNO.g:2191:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRulesUNO.g:2191:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRulesUNO.g:2191:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRulesUNO.g:2191:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:2193:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRulesUNO.g:2193:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRulesUNO.g:2193:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRulesUNO.g:2193:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:2195:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRulesUNO.g:2195:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRulesUNO.g:2195:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRulesUNO.g:2195:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRulesUNO.g:2195:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRulesUNO.g:2195:41: ( '\\r' )? '\\n'
                    {
                    // InternalRulesUNO.g:2195:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRulesUNO.g:2195:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:2197:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRulesUNO.g:2197:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRulesUNO.g:2197:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRulesUNO.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRulesUNO.g:2199:16: ( . )
            // InternalRulesUNO.g:2199:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRulesUNO.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=91;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRulesUNO.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalRulesUNO.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalRulesUNO.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalRulesUNO.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalRulesUNO.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalRulesUNO.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalRulesUNO.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalRulesUNO.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalRulesUNO.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalRulesUNO.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalRulesUNO.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalRulesUNO.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalRulesUNO.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalRulesUNO.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalRulesUNO.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalRulesUNO.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalRulesUNO.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalRulesUNO.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalRulesUNO.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalRulesUNO.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalRulesUNO.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalRulesUNO.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalRulesUNO.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalRulesUNO.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalRulesUNO.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalRulesUNO.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalRulesUNO.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalRulesUNO.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalRulesUNO.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalRulesUNO.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalRulesUNO.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalRulesUNO.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalRulesUNO.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalRulesUNO.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalRulesUNO.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalRulesUNO.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalRulesUNO.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalRulesUNO.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalRulesUNO.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalRulesUNO.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalRulesUNO.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalRulesUNO.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalRulesUNO.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalRulesUNO.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalRulesUNO.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalRulesUNO.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalRulesUNO.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalRulesUNO.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalRulesUNO.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalRulesUNO.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalRulesUNO.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalRulesUNO.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalRulesUNO.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalRulesUNO.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalRulesUNO.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalRulesUNO.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalRulesUNO.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalRulesUNO.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalRulesUNO.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalRulesUNO.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalRulesUNO.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalRulesUNO.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalRulesUNO.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalRulesUNO.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalRulesUNO.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalRulesUNO.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalRulesUNO.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalRulesUNO.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalRulesUNO.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalRulesUNO.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalRulesUNO.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalRulesUNO.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalRulesUNO.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalRulesUNO.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalRulesUNO.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalRulesUNO.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalRulesUNO.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalRulesUNO.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalRulesUNO.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalRulesUNO.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalRulesUNO.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalRulesUNO.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalRulesUNO.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalRulesUNO.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalRulesUNO.g:1:514: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 86 :
                // InternalRulesUNO.g:1:522: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 87 :
                // InternalRulesUNO.g:1:531: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 88 :
                // InternalRulesUNO.g:1:543: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 89 :
                // InternalRulesUNO.g:1:559: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // InternalRulesUNO.g:1:575: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 91 :
                // InternalRulesUNO.g:1:583: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\63\2\uffff\1\63\1\70\2\63\1\uffff\2\63\1\uffff\16\63\1\uffff\1\130\1\uffff\1\133\1\uffff\1\136\1\141\1\143\2\60\3\63\1\uffff\1\63\1\60\2\uffff\3\60\2\uffff\2\63\3\uffff\1\63\2\uffff\4\63\1\uffff\2\63\1\uffff\25\63\20\uffff\2\63\1\u0094\1\uffff\1\63\5\uffff\44\63\1\uffff\1\63\1\u00bd\13\63\1\u00ca\27\63\1\u00e2\1\63\1\u00e4\1\uffff\13\63\1\u00f0\1\uffff\16\63\1\u0101\10\63\1\uffff\1\u010a\1\uffff\3\63\1\u010e\2\63\1\u0112\3\63\1\u0118\1\uffff\7\63\1\u0120\3\63\1\u0124\4\63\1\uffff\1\63\1\u012a\3\63\1\u012e\1\63\1\u0130\1\uffff\1\u0131\2\63\1\uffff\3\63\1\uffff\5\63\1\uffff\7\63\1\uffff\3\63\1\uffff\5\63\1\uffff\3\63\1\uffff\1\63\2\uffff\33\63\1\u016f\22\63\1\u0183\1\u0184\4\63\1\u0189\5\63\1\u018f\1\63\1\u0191\1\uffff\23\63\2\uffff\4\63\1\uffff\5\63\1\uffff\1\63\1\uffff\7\63\1\u01b6\5\63\1\u01bc\26\63\1\uffff\1\63\1\u01d4\3\63\1\uffff\1\u01d8\4\63\1\u01e1\1\63\1\u01e3\3\63\1\u01e7\13\63\1\uffff\3\63\1\uffff\1\u01f9\7\63\1\uffff\1\63\1\uffff\3\63\1\uffff\1\u0206\1\u0207\11\63\1\u0211\3\63\1\u0215\1\63\1\uffff\14\63\2\uffff\1\u0223\1\u0224\7\63\1\uffff\2\63\1\u022e\1\uffff\13\63\1\u023a\1\u023b\2\uffff\1\u023c\10\63\1\uffff\1\63\1\u0246\4\63\1\u024b\4\63\3\uffff\4\63\1\u0254\1\u0255\3\63\1\uffff\1\u0259\3\63\1\uffff\3\63\1\u0261\4\63\2\uffff\2\63\1\u0268\1\uffff\2\63\1\u026b\1\u026c\3\63\1\uffff\1\63\1\u0271\4\63\1\uffff\2\63\2\uffff\4\63\1\uffff\2\63\1\u027e\6\63\1\u0285\2\63\1\uffff\4\63\1\u028c\1\63\1\uffff\6\63\1\uffff\2\63\1\u0296\5\63\1\u029c\1\uffff\5\63\1\uffff\1\63\1\u02a3\4\63\1\uffff\1\u02a8\3\63\1\uffff\13\63\1\u02b7\1\63\1\u02b9\1\uffff\1\63\1\uffff\1\u02bb\1\uffff";
    static final String DFA12_eofS =
        "\u02bc\uffff";
    static final String DFA12_minS =
        "\1\0\1\105\2\uffff\1\141\1\75\1\103\1\117\1\uffff\1\142\1\141\1\uffff\1\145\1\150\1\101\1\105\1\116\1\101\1\125\1\105\1\101\1\102\1\111\1\101\1\116\1\101\1\uffff\1\51\1\uffff\1\76\1\uffff\1\75\1\55\1\75\1\46\1\174\1\162\1\141\1\146\1\uffff\1\154\1\101\2\uffff\2\0\1\52\2\uffff\1\156\1\112\3\uffff\1\162\2\uffff\1\125\1\110\1\122\1\125\1\uffff\1\137\1\162\1\uffff\1\147\1\157\1\123\1\125\1\116\1\117\1\122\1\111\1\101\1\111\1\122\1\116\1\137\1\125\1\116\1\111\1\122\1\117\1\122\1\126\1\107\20\uffff\1\165\1\154\1\60\1\uffff\1\163\5\uffff\1\157\1\117\1\101\1\164\1\111\1\101\2\105\1\152\1\151\1\154\1\151\1\105\1\130\1\116\1\137\1\124\1\105\1\116\1\111\1\124\1\117\2\103\1\126\1\111\1\105\1\116\1\123\1\124\1\103\1\104\1\105\1\116\1\145\1\163\1\uffff\1\145\1\60\1\125\1\122\1\151\1\120\1\116\1\137\1\122\1\157\1\141\1\145\1\170\1\60\1\137\1\105\1\103\1\105\1\122\1\107\1\123\1\105\1\137\1\110\1\117\2\101\1\105\2\122\1\124\1\105\1\111\1\110\2\122\1\105\1\60\1\145\1\60\1\uffff\1\105\1\121\1\143\1\105\1\107\1\105\1\122\1\137\1\165\1\156\1\163\1\60\1\uffff\1\112\1\122\1\110\1\123\1\137\1\105\1\111\1\123\2\105\1\125\2\122\1\114\1\60\1\137\1\123\1\122\1\103\2\105\1\123\1\122\1\uffff\1\60\1\uffff\1\122\1\125\1\151\1\60\1\105\1\114\1\60\1\103\1\145\1\164\1\60\1\uffff\1\117\1\137\1\101\1\137\1\125\2\122\1\60\1\103\1\117\1\125\1\60\1\105\2\124\1\114\1\uffff\1\121\1\60\1\137\1\111\1\122\1\60\1\105\1\60\1\uffff\1\60\1\105\1\160\1\uffff\1\122\1\111\1\101\1\uffff\1\101\1\114\1\125\1\165\1\145\1\uffff\1\125\1\103\1\114\1\111\1\116\2\137\1\uffff\1\110\1\125\1\105\1\uffff\1\125\1\111\2\105\1\125\1\uffff\1\123\1\120\1\137\1\uffff\1\122\2\uffff\1\122\1\141\1\137\1\115\1\117\1\105\1\117\1\125\1\130\1\122\1\125\1\111\1\162\1\163\1\105\1\101\1\105\1\104\1\117\2\103\1\101\1\122\1\123\1\122\1\103\1\123\1\60\1\105\1\117\1\101\1\62\2\137\1\156\1\112\1\111\1\125\1\111\1\114\1\125\1\124\1\111\1\124\1\123\1\124\2\60\1\125\1\122\1\116\1\105\1\60\2\117\2\116\1\124\1\60\1\111\1\60\1\uffff\1\123\2\116\2\137\1\123\1\105\1\164\1\105\1\116\1\122\1\126\1\105\1\123\1\122\1\123\1\105\1\111\1\105\2\uffff\1\122\1\124\1\107\1\116\1\uffff\2\125\1\107\1\101\1\111\1\uffff\1\120\1\uffff\1\124\1\137\1\124\2\103\1\105\1\122\1\60\1\125\1\105\1\122\1\101\1\103\1\60\1\105\1\124\1\137\1\105\1\137\1\123\2\105\1\124\2\114\1\105\1\116\1\117\1\101\1\111\1\124\1\137\2\101\1\116\1\122\1\uffff\1\137\1\60\1\101\1\116\1\124\1\uffff\1\60\1\105\1\102\1\125\1\104\1\60\1\123\1\60\1\111\2\105\1\60\1\124\2\116\2\117\1\103\2\122\1\123\1\105\1\101\1\uffff\1\116\1\124\1\111\1\uffff\1\60\1\101\1\117\1\116\1\101\1\105\1\122\1\105\1\uffff\1\137\1\uffff\1\121\2\125\1\uffff\2\60\1\124\1\116\1\125\1\117\1\130\1\105\1\111\2\124\1\60\1\125\1\126\1\124\1\60\1\117\1\uffff\1\123\1\113\1\126\1\123\1\125\1\122\1\123\1\137\1\101\1\125\2\122\2\uffff\2\60\1\122\1\125\1\111\1\114\1\116\2\105\1\uffff\1\122\1\105\1\60\1\uffff\1\116\3\105\2\123\1\117\1\137\1\103\1\125\1\105\2\60\2\uffff\1\60\1\122\1\123\1\105\1\137\2\123\1\137\1\103\1\uffff\1\116\1\60\2\122\1\105\1\137\1\60\1\103\1\101\1\137\1\123\3\uffff\1\122\1\124\1\103\1\120\2\60\1\125\1\137\1\105\1\uffff\1\60\1\123\1\137\1\62\1\uffff\1\101\1\122\1\112\1\60\1\101\1\105\1\124\1\117\2\uffff\1\116\1\125\1\60\1\uffff\1\105\1\124\2\60\1\122\1\124\1\117\1\uffff\1\116\1\60\2\111\1\117\1\116\1\uffff\1\122\1\117\2\uffff\1\124\1\105\1\125\1\124\1\uffff\1\117\1\116\1\60\2\137\1\116\1\105\1\123\1\105\1\60\1\116\1\124\1\uffff\1\101\1\123\1\137\1\123\1\60\1\125\1\uffff\1\116\1\123\1\104\1\105\1\124\1\137\1\uffff\1\122\1\105\1\60\1\126\1\116\1\117\1\111\1\137\1\60\1\uffff\1\105\1\123\1\125\1\104\1\123\1\uffff\1\122\1\60\1\122\1\105\1\125\1\123\1\uffff\1\60\1\116\1\111\1\101\1\uffff\1\124\1\126\2\111\1\101\1\122\1\121\1\116\1\105\1\125\1\124\1\60\1\105\1\60\1\uffff\1\123\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\125\2\uffff\1\141\1\75\1\124\1\117\1\uffff\1\142\1\141\1\uffff\1\145\1\150\1\101\1\117\1\116\1\122\1\125\1\105\1\101\1\117\1\111\1\117\1\116\1\101\1\uffff\1\51\1\uffff\1\76\1\uffff\3\75\1\46\1\174\1\162\1\141\1\146\1\uffff\1\154\1\172\2\uffff\2\uffff\1\57\2\uffff\1\156\1\115\3\uffff\1\162\2\uffff\1\125\1\110\1\122\1\125\1\uffff\1\137\1\162\1\uffff\1\147\1\157\1\123\1\125\1\116\1\117\1\122\1\111\1\117\1\111\1\122\1\116\1\137\1\125\1\116\2\123\1\117\1\122\1\126\1\107\20\uffff\1\165\1\154\1\172\1\uffff\1\163\5\uffff\1\157\1\117\1\101\1\164\1\111\1\101\2\105\1\152\1\151\1\154\1\151\1\105\1\130\1\116\1\137\1\124\1\105\1\116\1\111\1\124\1\117\1\103\1\120\1\126\1\111\1\105\1\116\1\123\1\124\1\103\1\104\1\105\1\116\1\145\1\163\1\uffff\1\145\1\172\1\125\1\122\1\151\1\120\1\116\1\137\1\125\1\157\1\141\1\145\1\170\1\172\1\137\1\105\1\103\1\105\1\122\1\107\1\123\1\105\1\137\1\110\1\117\2\101\1\105\2\122\1\124\1\105\1\111\1\110\2\122\1\105\1\172\1\145\1\172\1\uffff\1\105\1\121\1\143\1\105\1\107\1\105\1\122\1\137\1\165\1\156\1\163\1\172\1\uffff\1\112\1\122\1\110\1\123\1\137\1\105\1\111\1\123\1\124\1\105\1\125\2\122\1\114\1\172\1\137\1\123\1\122\1\103\2\105\1\123\1\122\1\uffff\1\172\1\uffff\1\122\1\125\1\151\1\172\1\105\1\114\1\172\1\123\1\145\1\164\1\172\1\uffff\1\117\1\137\1\101\1\137\1\125\2\122\1\172\1\103\1\117\1\125\1\172\1\105\2\124\1\114\1\uffff\1\121\1\172\1\137\1\111\1\122\1\172\1\105\1\172\1\uffff\1\172\1\105\1\160\1\uffff\1\122\1\111\1\124\1\uffff\1\101\1\114\1\125\1\165\1\145\1\uffff\1\125\1\103\1\114\1\111\1\116\2\137\1\uffff\1\110\1\125\1\105\1\uffff\1\125\1\111\2\105\1\125\1\uffff\1\123\1\120\1\137\1\uffff\1\122\2\uffff\1\122\1\141\1\137\1\115\1\117\1\125\1\117\1\125\1\130\1\122\1\125\1\111\1\162\1\163\1\105\1\101\1\105\1\104\1\117\2\103\1\101\1\122\1\123\1\122\1\103\1\123\1\172\1\105\1\117\1\101\1\64\2\137\1\156\1\112\1\111\1\125\1\111\1\114\1\125\1\124\1\111\1\124\1\123\1\124\2\172\1\125\1\122\1\116\1\105\1\172\2\117\2\116\1\124\1\172\1\111\1\172\1\uffff\1\123\2\116\2\137\1\123\1\105\1\164\1\105\1\116\1\122\1\126\1\105\1\123\1\122\1\123\1\105\1\111\1\105\2\uffff\1\122\1\124\1\107\1\116\1\uffff\2\125\1\107\1\101\1\111\1\uffff\1\120\1\uffff\1\124\1\137\1\124\2\103\1\105\1\122\1\172\1\125\1\105\1\122\1\101\1\103\1\172\1\105\1\124\1\137\1\105\1\137\1\123\2\105\1\124\2\114\1\105\1\116\1\117\1\101\1\111\1\124\1\137\2\101\1\116\1\122\1\uffff\1\137\1\172\1\101\1\116\1\124\1\uffff\1\172\1\105\1\132\1\125\1\104\1\172\1\123\1\172\1\111\2\105\1\172\1\124\2\116\2\117\1\123\2\122\1\123\1\105\1\101\1\uffff\1\116\1\124\1\111\1\uffff\1\172\1\101\1\117\1\116\1\114\1\105\1\122\1\105\1\uffff\1\137\1\uffff\1\121\2\125\1\uffff\2\172\1\124\1\116\1\125\1\117\1\130\1\105\1\111\2\124\1\172\1\125\1\126\1\124\1\172\1\117\1\uffff\1\123\1\113\1\126\1\123\1\125\1\122\1\123\1\137\1\101\1\125\2\122\2\uffff\2\172\1\122\1\125\1\111\1\114\1\116\2\105\1\uffff\1\122\1\105\1\172\1\uffff\1\116\3\105\2\123\1\117\1\137\1\103\1\125\1\105\2\172\2\uffff\1\172\1\122\1\123\1\105\1\137\2\123\1\137\1\103\1\uffff\1\116\1\172\2\122\1\105\1\137\1\172\1\103\1\101\1\137\1\123\3\uffff\1\122\1\124\1\103\1\120\2\172\1\125\1\137\1\105\1\uffff\1\172\1\123\1\137\1\64\1\uffff\1\101\1\122\1\112\1\172\1\101\1\105\1\124\1\117\2\uffff\1\116\1\125\1\172\1\uffff\1\105\1\124\2\172\1\122\1\124\1\117\1\uffff\1\116\1\172\2\111\1\117\1\116\1\uffff\1\122\1\117\2\uffff\1\124\1\105\1\125\1\124\1\uffff\1\117\1\116\1\172\2\137\1\116\1\105\1\123\1\105\1\172\1\116\1\124\1\uffff\1\101\1\123\1\137\1\123\1\172\1\125\1\uffff\1\116\1\123\1\104\1\105\1\124\1\137\1\uffff\1\122\1\105\1\172\1\126\1\116\1\117\1\111\1\137\1\172\1\uffff\1\105\1\123\1\125\1\104\1\123\1\uffff\1\122\1\172\1\122\1\105\1\125\1\123\1\uffff\1\172\1\116\1\111\1\101\1\uffff\1\124\1\126\2\111\1\101\1\122\1\121\1\116\1\105\1\125\1\124\1\172\1\105\1\172\1\uffff\1\123\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\4\uffff\1\10\2\uffff\1\13\16\uffff\1\77\1\uffff\1\101\1\uffff\1\103\10\uffff\1\123\2\uffff\1\125\1\126\3\uffff\1\132\1\133\2\uffff\1\125\1\2\1\3\1\uffff\1\110\1\5\4\uffff\1\10\2\uffff\1\13\25\uffff\1\77\1\100\1\122\1\101\1\114\1\102\1\103\1\106\1\104\1\107\1\115\1\105\1\111\1\120\1\112\1\113\3\uffff\1\123\1\uffff\1\126\1\127\1\130\1\131\1\132\44\uffff\1\121\50\uffff\1\1\14\uffff\1\16\27\uffff\1\116\1\uffff\1\124\13\uffff\1\15\20\uffff\1\31\10\uffff\1\117\3\uffff\1\6\3\uffff\1\7\5\uffff\1\14\7\uffff\1\22\3\uffff\1\26\5\uffff\1\76\3\uffff\1\74\1\uffff\1\73\1\54\75\uffff\1\32\23\uffff\1\11\1\12\4\uffff\1\41\5\uffff\1\27\1\uffff\1\66\44\uffff\1\4\5\uffff\1\35\27\uffff\1\75\3\uffff\1\36\10\uffff\1\17\1\uffff\1\20\3\uffff\1\23\21\uffff\1\37\14\uffff\1\24\1\25\11\uffff\1\62\3\uffff\1\34\15\uffff\1\30\1\53\11\uffff\1\33\13\uffff\1\56\1\57\1\55\11\uffff\1\42\4\uffff\1\51\10\uffff\1\60\1\61\3\uffff\1\43\7\uffff\1\21\6\uffff\1\40\2\uffff\1\46\1\47\4\uffff\1\70\14\uffff\1\65\6\uffff\1\67\6\uffff\1\52\11\uffff\1\72\5\uffff\1\71\6\uffff\1\44\4\uffff\1\45\16\uffff\1\64\1\uffff\1\63\1\uffff\1\50";
    static final String DFA12_specialS =
        "\1\2\53\uffff\1\0\1\1\u028e\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\41\1\54\2\60\1\36\1\42\1\55\1\33\1\47\1\60\1\34\1\13\1\35\1\32\1\56\12\53\1\60\1\10\1\40\1\5\1\37\2\60\1\52\1\16\1\21\1\17\1\6\1\26\1\31\1\52\1\30\1\7\2\52\1\24\1\25\1\52\1\27\1\52\1\1\1\22\1\52\1\20\4\52\1\23\3\60\1\51\1\52\1\60\2\52\1\15\1\52\1\50\1\45\2\52\1\46\4\52\1\11\1\52\1\4\1\52\1\14\1\52\1\44\1\52\1\12\4\52\1\2\1\43\1\3\uff82\60",
            "\1\62\17\uffff\1\61",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\72\15\uffff\1\71\2\uffff\1\73",
            "\1\74",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104\11\uffff\1\105",
            "\1\106",
            "\1\107\6\uffff\1\111\11\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\14\uffff\1\116",
            "\1\117",
            "\1\121\3\uffff\1\123\3\uffff\1\122\5\uffff\1\120",
            "\1\124",
            "\1\125",
            "",
            "\1\127",
            "",
            "\1\132",
            "",
            "\1\135",
            "\1\140\17\uffff\1\137",
            "\1\142",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\152",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\0\154",
            "\0\154",
            "\1\155\4\uffff\1\156",
            "",
            "",
            "\1\160",
            "\1\161\2\uffff\1\162",
            "",
            "",
            "",
            "\1\163",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\15\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008b\11\uffff\1\u008a",
            "\1\u008d\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0095",
            "",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00af\6\uffff\1\u00ad\5\uffff\1\u00ae",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c5\2\uffff\1\u00c4",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9\13\uffff\1\u00fb\2\uffff\1\u00fa",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010f",
            "\1\u0110",
            "\12\63\7\uffff\32\63\4\uffff\1\u0111\1\uffff\32\63",
            "\1\u0113\14\uffff\1\u0114\2\uffff\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0139\1\uffff\1\u0136\1\uffff\1\u013a\15\uffff\1\u0137\1\u0138",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0159\17\uffff\1\u0158",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173\1\uffff\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0190",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "",
            "\1\u01d3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01d9",
            "\1\u01da\6\uffff\1\u01dc\1\u01db\5\uffff\1\u01dd\11\uffff\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01e2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed\1\uffff\1\u01ee\7\uffff\1\u01f0\5\uffff\1\u01ef",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd\12\uffff\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0216",
            "",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "",
            "\1\u022c",
            "\1\u022d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "",
            "\1\u0245",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "",
            "",
            "",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c\1\uffff\1\u025d",
            "",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "",
            "",
            "\1\u0266",
            "\1\u0267",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0269",
            "\1\u026a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "",
            "\1\u0270",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "",
            "\1\u0276",
            "\1\u0277",
            "",
            "",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "",
            "\1\u027c",
            "\1\u027d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0286",
            "\1\u0287",
            "",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u028d",
            "",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "",
            "\1\u0294",
            "\1\u0295",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "\1\u02a2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u02b8",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u02ba",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( ((LA12_44>='\u0000' && LA12_44<='\uFFFF')) ) {s = 108;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( ((LA12_45>='\u0000' && LA12_45<='\uFFFF')) ) {s = 108;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='R') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='p') ) {s = 4;}

                        else if ( (LA12_0=='=') ) {s = 5;}

                        else if ( (LA12_0=='E') ) {s = 6;}

                        else if ( (LA12_0=='J') ) {s = 7;}

                        else if ( (LA12_0==';') ) {s = 8;}

                        else if ( (LA12_0=='n') ) {s = 9;}

                        else if ( (LA12_0=='v') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='r') ) {s = 12;}

                        else if ( (LA12_0=='c') ) {s = 13;}

                        else if ( (LA12_0=='B') ) {s = 14;}

                        else if ( (LA12_0=='D') ) {s = 15;}

                        else if ( (LA12_0=='U') ) {s = 16;}

                        else if ( (LA12_0=='C') ) {s = 17;}

                        else if ( (LA12_0=='S') ) {s = 18;}

                        else if ( (LA12_0=='Z') ) {s = 19;}

                        else if ( (LA12_0=='M') ) {s = 20;}

                        else if ( (LA12_0=='N') ) {s = 21;}

                        else if ( (LA12_0=='F') ) {s = 22;}

                        else if ( (LA12_0=='P') ) {s = 23;}

                        else if ( (LA12_0=='I') ) {s = 24;}

                        else if ( (LA12_0=='G') ) {s = 25;}

                        else if ( (LA12_0=='.') ) {s = 26;}

                        else if ( (LA12_0=='(') ) {s = 27;}

                        else if ( (LA12_0=='+') ) {s = 28;}

                        else if ( (LA12_0=='-') ) {s = 29;}

                        else if ( (LA12_0=='%') ) {s = 30;}

                        else if ( (LA12_0=='>') ) {s = 31;}

                        else if ( (LA12_0=='<') ) {s = 32;}

                        else if ( (LA12_0=='!') ) {s = 33;}

                        else if ( (LA12_0=='&') ) {s = 34;}

                        else if ( (LA12_0=='|') ) {s = 35;}

                        else if ( (LA12_0=='t') ) {s = 36;}

                        else if ( (LA12_0=='f') ) {s = 37;}

                        else if ( (LA12_0=='i') ) {s = 38;}

                        else if ( (LA12_0==')') ) {s = 39;}

                        else if ( (LA12_0=='e') ) {s = 40;}

                        else if ( (LA12_0=='^') ) {s = 41;}

                        else if ( (LA12_0=='A'||LA12_0=='H'||(LA12_0>='K' && LA12_0<='L')||LA12_0=='O'||LA12_0=='Q'||LA12_0=='T'||(LA12_0>='V' && LA12_0<='Y')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||LA12_0=='d'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||LA12_0=='o'||LA12_0=='q'||LA12_0=='s'||LA12_0=='u'||(LA12_0>='w' && LA12_0<='z')) ) {s = 42;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 43;}

                        else if ( (LA12_0=='\"') ) {s = 44;}

                        else if ( (LA12_0=='\'') ) {s = 45;}

                        else if ( (LA12_0=='/') ) {s = 46;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 47;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='*'||LA12_0==':'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}