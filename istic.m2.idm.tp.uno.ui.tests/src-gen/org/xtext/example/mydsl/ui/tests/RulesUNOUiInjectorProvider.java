/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import istic.m2.idm.tp.uno.ui.internal.UnoActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class RulesUNOUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UnoActivator.getInstance().getInjector("org.xtext.example.mydsl.RulesUNO");
	}

}