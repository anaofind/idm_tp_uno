/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.rulesUNO;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.Action#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.Action#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Instruction
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getAction_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rulesUNO.Action#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see org.xtext.example.mydsl.rulesUNO.RulesUNOPackage#getAction_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rulesUNO.Action#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

} // Action