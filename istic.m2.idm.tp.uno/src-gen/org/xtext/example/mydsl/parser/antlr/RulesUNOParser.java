/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalRulesUNOParser;
import org.xtext.example.mydsl.services.RulesUNOGrammarAccess;

public class RulesUNOParser extends AbstractAntlrParser {

	@Inject
	private RulesUNOGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRulesUNOParser createParser(XtextTokenStream stream) {
		return new InternalRulesUNOParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Uno";
	}

	public RulesUNOGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RulesUNOGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
