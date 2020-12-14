/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.rulesUNO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage
 * @generated
 */
public interface RulesUNOFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RulesUNOFactory eINSTANCE = org.xtext.example.mydsl.rulesUNO.impl.RulesUNOFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Uno</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uno</em>'.
   * @generated
   */
  Uno createUno();

  /**
   * Returns a new object of class '<em>Participant Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Type</em>'.
   * @generated
   */
  ParticipantType createParticipantType();

  /**
   * Returns a new object of class '<em>Nb Joueur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nb Joueur</em>'.
   * @generated
   */
  NbJoueur createNbJoueur();

  /**
   * Returns a new object of class '<em>Variantes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variantes</em>'.
   * @generated
   */
  Variantes createVariantes();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Regles</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regles</em>'.
   * @generated
   */
  Regles createRegles();

  /**
   * Returns a new object of class '<em>Affectation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Affectation</em>'.
   * @generated
   */
  Affectation createAffectation();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Instructions Bloc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instructions Bloc</em>'.
   * @generated
   */
  InstructionsBloc createInstructionsBloc();

  /**
   * Returns a new object of class '<em>Instruction Choix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction Choix</em>'.
   * @generated
   */
  InstructionChoix createInstructionChoix();

  /**
   * Returns a new object of class '<em>Variable Numerique</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Numerique</em>'.
   * @generated
   */
  VariableNumerique createVariableNumerique();

  /**
   * Returns a new object of class '<em>Variable Booleene</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Booleene</em>'.
   * @generated
   */
  VariableBooleene createVariableBooleene();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Attribut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribut</em>'.
   * @generated
   */
  Attribut createAttribut();

  /**
   * Returns a new object of class '<em>Expression Numerique</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Numerique</em>'.
   * @generated
   */
  ExpressionNumerique createExpressionNumerique();

  /**
   * Returns a new object of class '<em>Expression Booleene</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Booleene</em>'.
   * @generated
   */
  ExpressionBooleene createExpressionBooleene();

  /**
   * Returns a new object of class '<em>Entier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entier</em>'.
   * @generated
   */
  Entier createEntier();

  /**
   * Returns a new object of class '<em>Booleen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Booleen</em>'.
   * @generated
   */
  Booleen createBooleen();

  /**
   * Returns a new object of class '<em>Boolean Contraire</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Contraire</em>'.
   * @generated
   */
  BooleanContraire createBooleanContraire();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RulesUNOPackage getRulesUNOPackage();

} //RulesUNOFactory
