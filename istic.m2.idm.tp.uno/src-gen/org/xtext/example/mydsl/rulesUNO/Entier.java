/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.rulesUNO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.Entier#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.Entier#getAtt <em>Att</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getEntier()
 * @model
 * @generated
 */
public interface Entier extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getEntier_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rulesUNO.Entier#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

  /**
   * Returns the value of the '<em><b>Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att</em>' containment reference.
   * @see #setAtt(VariableNumerique)
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getEntier_Att()
   * @model containment="true"
   * @generated
   */
  VariableNumerique getAtt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rulesUNO.Entier#getAtt <em>Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att</em>' containment reference.
   * @see #getAtt()
   * @generated
   */
  void setAtt(VariableNumerique value);

} // Entier