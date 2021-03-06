/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.rulesUNO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.rulesUNO.Booleen;
import org.xtext.example.mydsl.rulesUNO.ExpressionNumerique;
import org.xtext.example.mydsl.rulesUNO.RulesUNOPackage;
import org.xtext.example.mydsl.rulesUNO.VariableBooleene;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booleen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.BooleenImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.BooleenImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.BooleenImpl#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.BooleenImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rulesUNO.impl.BooleenImpl#getExp2 <em>Exp2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleenImpl extends BooleanContraireImpl implements Booleen
{
  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected VariableBooleene var;

  /**
   * The cached value of the '{@link #getExp1() <em>Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp1()
   * @generated
   * @ordered
   */
  protected ExpressionNumerique exp1;

  /**
   * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected static final String COMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected String comp = COMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExp2() <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp2()
   * @generated
   * @ordered
   */
  protected ExpressionNumerique exp2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleenImpl()
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
    return RulesUNOPackage.Literals.BOOLEEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableBooleene getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(VariableBooleene newVar, NotificationChain msgs)
  {
    VariableBooleene oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__VAR, oldVar, newVar);
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
  public void setVar(VariableBooleene newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.BOOLEEN__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.BOOLEEN__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionNumerique getExp1()
  {
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp1(ExpressionNumerique newExp1, NotificationChain msgs)
  {
    ExpressionNumerique oldExp1 = exp1;
    exp1 = newExp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__EXP1, oldExp1, newExp1);
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
  public void setExp1(ExpressionNumerique newExp1)
  {
    if (newExp1 != exp1)
    {
      NotificationChain msgs = null;
      if (exp1 != null)
        msgs = ((InternalEObject)exp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.BOOLEEN__EXP1, null, msgs);
      if (newExp1 != null)
        msgs = ((InternalEObject)newExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.BOOLEEN__EXP1, null, msgs);
      msgs = basicSetExp1(newExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__EXP1, newExp1, newExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getComp()
  {
    return comp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComp(String newComp)
  {
    String oldComp = comp;
    comp = newComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__COMP, oldComp, comp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionNumerique getExp2()
  {
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp2(ExpressionNumerique newExp2, NotificationChain msgs)
  {
    ExpressionNumerique oldExp2 = exp2;
    exp2 = newExp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__EXP2, oldExp2, newExp2);
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
  public void setExp2(ExpressionNumerique newExp2)
  {
    if (newExp2 != exp2)
    {
      NotificationChain msgs = null;
      if (exp2 != null)
        msgs = ((InternalEObject)exp2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.BOOLEEN__EXP2, null, msgs);
      if (newExp2 != null)
        msgs = ((InternalEObject)newExp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RulesUNOPackage.BOOLEEN__EXP2, null, msgs);
      msgs = basicSetExp2(newExp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RulesUNOPackage.BOOLEEN__EXP2, newExp2, newExp2));
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
      case RulesUNOPackage.BOOLEEN__VAR:
        return basicSetVar(null, msgs);
      case RulesUNOPackage.BOOLEEN__EXP1:
        return basicSetExp1(null, msgs);
      case RulesUNOPackage.BOOLEEN__EXP2:
        return basicSetExp2(null, msgs);
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
      case RulesUNOPackage.BOOLEEN__VAL:
        return getVal();
      case RulesUNOPackage.BOOLEEN__VAR:
        return getVar();
      case RulesUNOPackage.BOOLEEN__EXP1:
        return getExp1();
      case RulesUNOPackage.BOOLEEN__COMP:
        return getComp();
      case RulesUNOPackage.BOOLEEN__EXP2:
        return getExp2();
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
      case RulesUNOPackage.BOOLEEN__VAL:
        setVal((String)newValue);
        return;
      case RulesUNOPackage.BOOLEEN__VAR:
        setVar((VariableBooleene)newValue);
        return;
      case RulesUNOPackage.BOOLEEN__EXP1:
        setExp1((ExpressionNumerique)newValue);
        return;
      case RulesUNOPackage.BOOLEEN__COMP:
        setComp((String)newValue);
        return;
      case RulesUNOPackage.BOOLEEN__EXP2:
        setExp2((ExpressionNumerique)newValue);
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
      case RulesUNOPackage.BOOLEEN__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case RulesUNOPackage.BOOLEEN__VAR:
        setVar((VariableBooleene)null);
        return;
      case RulesUNOPackage.BOOLEEN__EXP1:
        setExp1((ExpressionNumerique)null);
        return;
      case RulesUNOPackage.BOOLEEN__COMP:
        setComp(COMP_EDEFAULT);
        return;
      case RulesUNOPackage.BOOLEEN__EXP2:
        setExp2((ExpressionNumerique)null);
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
      case RulesUNOPackage.BOOLEEN__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
      case RulesUNOPackage.BOOLEEN__VAR:
        return var != null;
      case RulesUNOPackage.BOOLEEN__EXP1:
        return exp1 != null;
      case RulesUNOPackage.BOOLEEN__COMP:
        return COMP_EDEFAULT == null ? comp != null : !COMP_EDEFAULT.equals(comp);
      case RulesUNOPackage.BOOLEEN__EXP2:
        return exp2 != null;
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
    result.append(", comp: ");
    result.append(comp);
    result.append(')');
    return result.toString();
  }

} //BooleenImpl
