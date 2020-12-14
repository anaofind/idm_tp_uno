/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.rulesUNO.Affectation;
import org.xtext.example.mydsl.rulesUNO.Attribut;
import org.xtext.example.mydsl.rulesUNO.Booleen;
import org.xtext.example.mydsl.rulesUNO.Entier;
import org.xtext.example.mydsl.rulesUNO.ExpressionBooleene;
import org.xtext.example.mydsl.rulesUNO.ExpressionNumerique;
import org.xtext.example.mydsl.rulesUNO.InstructionChoix;
import org.xtext.example.mydsl.rulesUNO.NbJoueur;
import org.xtext.example.mydsl.rulesUNO.ParticipantType;
import org.xtext.example.mydsl.rulesUNO.Regles;
import org.xtext.example.mydsl.rulesUNO.RulesUNOPackage;
import org.xtext.example.mydsl.rulesUNO.Uno;
import org.xtext.example.mydsl.rulesUNO.VariableBooleene;
import org.xtext.example.mydsl.rulesUNO.VariableNumerique;
import org.xtext.example.mydsl.rulesUNO.Variantes;
import org.xtext.example.mydsl.services.RulesUNOGrammarAccess;

@SuppressWarnings("all")
public class RulesUNOSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RulesUNOGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RulesUNOPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RulesUNOPackage.ACTION:
				sequence_Action(context, (org.xtext.example.mydsl.rulesUNO.Action) semanticObject); 
				return; 
			case RulesUNOPackage.AFFECTATION:
				sequence_Affectation(context, (Affectation) semanticObject); 
				return; 
			case RulesUNOPackage.ATTRIBUT:
				sequence_Attribut(context, (Attribut) semanticObject); 
				return; 
			case RulesUNOPackage.BOOLEEN:
				sequence_Booleen(context, (Booleen) semanticObject); 
				return; 
			case RulesUNOPackage.ENTIER:
				sequence_Entier(context, (Entier) semanticObject); 
				return; 
			case RulesUNOPackage.EXPRESSION_BOOLEENE:
				if (rule == grammarAccess.getDeclarationRule()
						|| rule == grammarAccess.getConditionRule()) {
					sequence_Condition_ExpressionBooleene(context, (ExpressionBooleene) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionBooleeneRule()) {
					sequence_ExpressionBooleene(context, (ExpressionBooleene) semanticObject); 
					return; 
				}
				else break;
			case RulesUNOPackage.EXPRESSION_NUMERIQUE:
				sequence_ExpressionNumerique(context, (ExpressionNumerique) semanticObject); 
				return; 
			case RulesUNOPackage.INSTRUCTION_CHOIX:
				sequence_InstructionChoix(context, (InstructionChoix) semanticObject); 
				return; 
			case RulesUNOPackage.NB_JOUEUR:
				sequence_NbJoueur(context, (NbJoueur) semanticObject); 
				return; 
			case RulesUNOPackage.PARTICIPANT_TYPE:
				sequence_ParticipantType(context, (ParticipantType) semanticObject); 
				return; 
			case RulesUNOPackage.REGLES:
				sequence_Regles(context, (Regles) semanticObject); 
				return; 
			case RulesUNOPackage.UNO:
				sequence_Uno(context, (Uno) semanticObject); 
				return; 
			case RulesUNOPackage.VARIABLE_BOOLEENE:
				sequence_VariableBooleene(context, (VariableBooleene) semanticObject); 
				return; 
			case RulesUNOPackage.VARIABLE_NUMERIQUE:
				sequence_VariableNumerique(context, (VariableNumerique) semanticObject); 
				return; 
			case RulesUNOPackage.VARIANTES:
				sequence_Variantes(context, (Variantes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Declaration returns Action
	 *     Instruction returns Action
	 *     Action returns Action
	 *
	 * Constraint:
	 *     ((id=Joueur action=ActionJoueur) | (id=Manche action=ActionManche) | (id=Participant action=ActionParticipant))
	 */
	protected void sequence_Action(ISerializationContext context, org.xtext.example.mydsl.rulesUNO.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Affectation
	 *     Affectation returns Affectation
	 *
	 * Constraint:
	 *     (attribut=Attribut expression=ExpressionNumerique)
	 */
	protected void sequence_Affectation(ISerializationContext context, Affectation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RulesUNOPackage.Literals.AFFECTATION__ATTRIBUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RulesUNOPackage.Literals.AFFECTATION__ATTRIBUT));
			if (transientValues.isValueTransient(semanticObject, RulesUNOPackage.Literals.AFFECTATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RulesUNOPackage.Literals.AFFECTATION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAffectationAccess().getAttributAttributParserRuleCall_0_0(), semanticObject.getAttribut());
		feeder.accept(grammarAccess.getAffectationAccess().getExpressionExpressionNumeriqueParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribut returns Attribut
	 *
	 * Constraint:
	 *     ((id=Joueur attribut=AttributJoueur) | (id=Manche attribut=AttributManche) | (id=Participant attribut=AttributParticipant))
	 */
	protected void sequence_Attribut(ISerializationContext context, Attribut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Booleen returns Booleen
	 *     BooleanContraire returns Booleen
	 *
	 * Constraint:
	 *     (val='true' | val='false' | var=VariableBooleene | (exp1=ExpressionNumerique comp=Comparateur exp2=ExpressionNumerique))
	 */
	protected void sequence_Booleen(ISerializationContext context, Booleen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns ExpressionBooleene
	 *     Condition returns ExpressionBooleene
	 *
	 * Constraint:
	 *     (
	 *         (exp+=Booleen | exp+=BooleanContraire) 
	 *         (log+=Logique (exp+=Booleen | exp+=BooleanContraire))* 
	 *         declarationAlors+=Declaration* 
	 *         declarationSinon+=Declaration*
	 *     )
	 */
	protected void sequence_Condition_ExpressionBooleene(ISerializationContext context, ExpressionBooleene semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entier returns Entier
	 *
	 * Constraint:
	 *     (val=INT | att=VariableNumerique)
	 */
	protected void sequence_Entier(ISerializationContext context, Entier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionBooleene returns ExpressionBooleene
	 *
	 * Constraint:
	 *     ((exp+=Booleen | exp+=BooleanContraire) (log+=Logique (exp+=Booleen | exp+=BooleanContraire))*)
	 */
	protected void sequence_ExpressionBooleene(ISerializationContext context, ExpressionBooleene semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionNumerique returns ExpressionNumerique
	 *
	 * Constraint:
	 *     (exp+=Entier (op+=Operateur exp+=Entier)*)
	 */
	protected void sequence_ExpressionNumerique(ISerializationContext context, ExpressionNumerique semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns InstructionChoix
	 *     Instruction returns InstructionChoix
	 *     InstructionsBloc returns InstructionChoix
	 *     InstructionChoix returns InstructionChoix
	 *
	 * Constraint:
	 *     (instructions+=Instruction instructions+=Instruction*)
	 */
	protected void sequence_InstructionChoix(ISerializationContext context, InstructionChoix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NbJoueur returns NbJoueur
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_NbJoueur(ISerializationContext context, NbJoueur semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RulesUNOPackage.Literals.NB_JOUEUR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RulesUNOPackage.Literals.NB_JOUEUR__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNbJoueurAccess().getValINTTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParticipantType returns ParticipantType
	 *
	 * Constraint:
	 *     (id='EQUIPE' | id='JOUEUR')
	 */
	protected void sequence_ParticipantType(ISerializationContext context, ParticipantType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Regles returns Regles
	 *
	 * Constraint:
	 *     declarations+=Declaration*
	 */
	protected void sequence_Regles(ISerializationContext context, Regles semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Uno returns Uno
	 *
	 * Constraint:
	 *     (nbJoueur=NbJoueur participantType=ParticipantType variantes=Variantes regles=Regles?)
	 */
	protected void sequence_Uno(ISerializationContext context, Uno semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableBooleene returns VariableBooleene
	 *
	 * Constraint:
	 *     (var=Variante | action=Action)
	 */
	protected void sequence_VariableBooleene(ISerializationContext context, VariableBooleene semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableNumerique returns VariableNumerique
	 *
	 * Constraint:
	 *     var=Attribut
	 */
	protected void sequence_VariableNumerique(ISerializationContext context, VariableNumerique semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RulesUNOPackage.Literals.VARIABLE_NUMERIQUE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RulesUNOPackage.Literals.VARIABLE_NUMERIQUE__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableNumeriqueAccess().getVarAttributParserRuleCall_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variantes returns Variantes
	 *
	 * Constraint:
	 *     (variantes+=Variante variantes+=Variante*)?
	 */
	protected void sequence_Variantes(ISerializationContext context, Variantes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}