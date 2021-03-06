/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.rulesUNO;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Booleene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.ExpressionBooleene#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.ExpressionBooleene#getLog <em>Log</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.ExpressionBooleene#getDeclarationAlors <em>Declaration Alors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.ExpressionBooleene#getDeclarationSinon <em>Declaration Sinon</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getExpressionBooleene()
 * @model
 * @generated
 */
public interface ExpressionBooleene extends Condition
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rulesUNO.BooleanContraire}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getExpressionBooleene_Exp()
   * @model containment="true"
   * @generated
   */
  EList<BooleanContraire> getExp();

  /**
   * Returns the value of the '<em><b>Log</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log</em>' attribute list.
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getExpressionBooleene_Log()
   * @model unique="false"
   * @generated
   */
  EList<String> getLog();

  /**
   * Returns the value of the '<em><b>Declaration Alors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rulesUNO.Declaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration Alors</em>' containment reference list.
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getExpressionBooleene_DeclarationAlors()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarationAlors();

  /**
   * Returns the value of the '<em><b>Declaration Sinon</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rulesUNO.Declaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration Sinon</em>' containment reference list.
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getExpressionBooleene_DeclarationSinon()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarationSinon();

} // ExpressionBooleene
