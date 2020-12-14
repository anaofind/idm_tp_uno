/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.rulesUNO.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.rulesUNO.RulesUNOPackage;
import org.xtext.example.mydsl.rulesUNO.Variantes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variantes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.VariantesImpl#getVariantes <em>Variantes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantesImpl extends MinimalEObjectImpl.Container implements Variantes
{
  /**
   * The cached value of the '{@link #getVariantes() <em>Variantes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariantes()
   * @generated
   * @ordered
   */
  protected EList<String> variantes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariantesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RulesUNOPackage.Literals.VARIANTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getVariantes()
  {
    if (variantes == null)
    {
      variantes = new EDataTypeEList<String>(String.class, this, RulesUNOPackage.VARIANTES__VARIANTES);
    }
    return variantes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RulesUNOPackage.VARIANTES__VARIANTES:
        return getVariantes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RulesUNOPackage.VARIANTES__VARIANTES:
        getVariantes().clear();
        getVariantes().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RulesUNOPackage.VARIANTES__VARIANTES:
        getVariantes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RulesUNOPackage.VARIANTES__VARIANTES:
        return variantes != null && !variantes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (variantes: ");
    result.append(variantes);
    result.append(')');
    return result.toString();
  }

} //VariantesImpl
