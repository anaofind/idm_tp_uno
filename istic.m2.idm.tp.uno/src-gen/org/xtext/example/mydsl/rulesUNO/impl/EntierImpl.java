/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.rulesUNO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rulesUNO.Entier;
import org.xtext.example.mydsl.rulesUNO.RulesUNOPackage;
import org.xtext.example.mydsl.rulesUNO.VariableNumerique;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.EntierImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.EntierImpl#getAtt <em>Att</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntierImpl extends MinimalEObjectImpl.Container implements Entier
{
  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final int VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected int val = VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtt() <em>Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtt()
   * @generated
   * @ordered
   */
  protected VariableNumerique att;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntierImpl()
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
    return RulesUNOPackage.Literals.ENTIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(int newVal)
  {
    int oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesUNOPackage.ENTIER__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableNumerique getAtt()
  {
    return att;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtt(VariableNumerique newAtt, NotificationChain msgs)
  {
    VariableNumerique oldAtt = att;
    att = newAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesUNOPackage.ENTIER__ATT, oldAtt, newAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAtt(VariableNumerique newAtt)
  {
    if (newAtt != att)
    {
      NotificationChain msgs = null;
      if (att != null)
        msgs = ((InternalEObject)att).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.ENTIER__ATT, null, msgs);
      if (newAtt != null)
        msgs = ((InternalEObject)newAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.ENTIER__ATT, null, msgs);
      msgs = basicSetAtt(newAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesUNOPackage.ENTIER__ATT, newAtt, newAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RulesUNOPackage.ENTIER__ATT:
        return basicSetAtt(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RulesUNOPackage.ENTIER__VAL:
        return getVal();
      case RulesUNOPackage.ENTIER__ATT:
        return getAtt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RulesUNOPackage.ENTIER__VAL:
        setVal((Integer)newValue);
        return;
      case RulesUNOPackage.ENTIER__ATT:
        setAtt((VariableNumerique)newValue);
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
      case RulesUNOPackage.ENTIER__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case RulesUNOPackage.ENTIER__ATT:
        setAtt((VariableNumerique)null);
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
      case RulesUNOPackage.ENTIER__VAL:
        return val != VAL_EDEFAULT;
      case RulesUNOPackage.ENTIER__ATT:
        return att != null;
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
    result.append(" (val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //EntierImpl