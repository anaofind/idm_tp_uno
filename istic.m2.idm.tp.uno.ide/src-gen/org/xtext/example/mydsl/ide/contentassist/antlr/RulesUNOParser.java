/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalRulesUNOParser;
import org.xtext.example.mydsl.services.RulesUNOGrammarAccess;

public class RulesUNOParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RulesUNOGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RulesUNOGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getParticipantTypeAccess().getIdAlternatives_2_0(), "rule__ParticipantType__IdAlternatives_2_0");
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getVariableBooleeneAccess().getAlternatives(), "rule__VariableBooleene__Alternatives");
			builder.put(grammarAccess.getVarianteAccess().getAlternatives(), "rule__Variante__Alternatives");
			builder.put(grammarAccess.getAttributMancheAccess().getAlternatives(), "rule__AttributManche__Alternatives");
			builder.put(grammarAccess.getActionMancheAccess().getAlternatives(), "rule__ActionManche__Alternatives");
			builder.put(grammarAccess.getJoueurAccess().getAlternatives(), "rule__Joueur__Alternatives");
			builder.put(grammarAccess.getActionJoueurAccess().getAlternatives(), "rule__ActionJoueur__Alternatives");
			builder.put(grammarAccess.getParticipantAccess().getAlternatives(), "rule__Participant__Alternatives");
			builder.put(grammarAccess.getActionParticipantAccess().getAlternatives(), "rule__ActionParticipant__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getAttributAccess().getAlternatives(), "rule__Attribut__Alternatives");
			builder.put(grammarAccess.getOperateurAccess().getAlternatives(), "rule__Operateur__Alternatives");
			builder.put(grammarAccess.getComparateurAccess().getAlternatives(), "rule__Comparateur__Alternatives");
			builder.put(grammarAccess.getLogiqueAccess().getAlternatives(), "rule__Logique__Alternatives");
			builder.put(grammarAccess.getExpressionBooleeneAccess().getExpAlternatives_0_0(), "rule__ExpressionBooleene__ExpAlternatives_0_0");
			builder.put(grammarAccess.getExpressionBooleeneAccess().getExpAlternatives_1_1_0(), "rule__ExpressionBooleene__ExpAlternatives_1_1_0");
			builder.put(grammarAccess.getEntierAccess().getAlternatives(), "rule__Entier__Alternatives");
			builder.put(grammarAccess.getBooleenAccess().getAlternatives(), "rule__Booleen__Alternatives");
			builder.put(grammarAccess.getBooleenAccess().getValAlternatives_0_0(), "rule__Booleen__ValAlternatives_0_0");
			builder.put(grammarAccess.getUnoAccess().getGroup(), "rule__Uno__Group__0");
			builder.put(grammarAccess.getParticipantTypeAccess().getGroup(), "rule__ParticipantType__Group__0");
			builder.put(grammarAccess.getNbJoueurAccess().getGroup(), "rule__NbJoueur__Group__0");
			builder.put(grammarAccess.getVariantesAccess().getGroup(), "rule__Variantes__Group__0");
			builder.put(grammarAccess.getVariantesAccess().getGroup_3(), "rule__Variantes__Group_3__0");
			builder.put(grammarAccess.getVariantesAccess().getGroup_3_1(), "rule__Variantes__Group_3_1__0");
			builder.put(grammarAccess.getReglesAccess().getGroup(), "rule__Regles__Group__0");
			builder.put(grammarAccess.getAffectationAccess().getGroup(), "rule__Affectation__Group__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_1(), "rule__Instruction__Group_1__0");
			builder.put(grammarAccess.getInstructionChoixAccess().getGroup(), "rule__InstructionChoix__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_0(), "rule__Action__Group_0__0");
			builder.put(grammarAccess.getActionAccess().getGroup_1(), "rule__Action__Group_1__0");
			builder.put(grammarAccess.getActionAccess().getGroup_2(), "rule__Action__Group_2__0");
			builder.put(grammarAccess.getAttributAccess().getGroup_0(), "rule__Attribut__Group_0__0");
			builder.put(grammarAccess.getAttributAccess().getGroup_1(), "rule__Attribut__Group_1__0");
			builder.put(grammarAccess.getAttributAccess().getGroup_2(), "rule__Attribut__Group_2__0");
			builder.put(grammarAccess.getExpressionNumeriqueAccess().getGroup(), "rule__ExpressionNumerique__Group__0");
			builder.put(grammarAccess.getExpressionNumeriqueAccess().getGroup_1(), "rule__ExpressionNumerique__Group_1__0");
			builder.put(grammarAccess.getExpressionBooleeneAccess().getGroup(), "rule__ExpressionBooleene__Group__0");
			builder.put(grammarAccess.getExpressionBooleeneAccess().getGroup_1(), "rule__ExpressionBooleene__Group_1__0");
			builder.put(grammarAccess.getBooleenAccess().getGroup_2(), "rule__Booleen__Group_2__0");
			builder.put(grammarAccess.getBooleanContraireAccess().getGroup(), "rule__BooleanContraire__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_7(), "rule__Condition__Group_7__0");
			builder.put(grammarAccess.getUnoAccess().getNbJoueurAssignment_2(), "rule__Uno__NbJoueurAssignment_2");
			builder.put(grammarAccess.getUnoAccess().getParticipantTypeAssignment_3(), "rule__Uno__ParticipantTypeAssignment_3");
			builder.put(grammarAccess.getUnoAccess().getVariantesAssignment_4(), "rule__Uno__VariantesAssignment_4");
			builder.put(grammarAccess.getUnoAccess().getReglesAssignment_5(), "rule__Uno__ReglesAssignment_5");
			builder.put(grammarAccess.getParticipantTypeAccess().getIdAssignment_2(), "rule__ParticipantType__IdAssignment_2");
			builder.put(grammarAccess.getNbJoueurAccess().getValAssignment_2(), "rule__NbJoueur__ValAssignment_2");
			builder.put(grammarAccess.getVariantesAccess().getVariantesAssignment_3_0(), "rule__Variantes__VariantesAssignment_3_0");
			builder.put(grammarAccess.getVariantesAccess().getVariantesAssignment_3_1_1(), "rule__Variantes__VariantesAssignment_3_1_1");
			builder.put(grammarAccess.getReglesAccess().getDeclarationsAssignment_3(), "rule__Regles__DeclarationsAssignment_3");
			builder.put(grammarAccess.getAffectationAccess().getAttributAssignment_0(), "rule__Affectation__AttributAssignment_0");
			builder.put(grammarAccess.getAffectationAccess().getExpressionAssignment_2(), "rule__Affectation__ExpressionAssignment_2");
			builder.put(grammarAccess.getInstructionChoixAccess().getInstructionsAssignment_2(), "rule__InstructionChoix__InstructionsAssignment_2");
			builder.put(grammarAccess.getInstructionChoixAccess().getInstructionsAssignment_3(), "rule__InstructionChoix__InstructionsAssignment_3");
			builder.put(grammarAccess.getVariableNumeriqueAccess().getVarAssignment(), "rule__VariableNumerique__VarAssignment");
			builder.put(grammarAccess.getVariableBooleeneAccess().getVarAssignment_0(), "rule__VariableBooleene__VarAssignment_0");
			builder.put(grammarAccess.getVariableBooleeneAccess().getActionAssignment_1(), "rule__VariableBooleene__ActionAssignment_1");
			builder.put(grammarAccess.getActionAccess().getIdAssignment_0_0(), "rule__Action__IdAssignment_0_0");
			builder.put(grammarAccess.getActionAccess().getActionAssignment_0_2(), "rule__Action__ActionAssignment_0_2");
			builder.put(grammarAccess.getActionAccess().getIdAssignment_1_0(), "rule__Action__IdAssignment_1_0");
			builder.put(grammarAccess.getActionAccess().getActionAssignment_1_2(), "rule__Action__ActionAssignment_1_2");
			builder.put(grammarAccess.getActionAccess().getIdAssignment_2_0(), "rule__Action__IdAssignment_2_0");
			builder.put(grammarAccess.getActionAccess().getActionAssignment_2_2(), "rule__Action__ActionAssignment_2_2");
			builder.put(grammarAccess.getAttributAccess().getIdAssignment_0_0(), "rule__Attribut__IdAssignment_0_0");
			builder.put(grammarAccess.getAttributAccess().getAttributAssignment_0_2(), "rule__Attribut__AttributAssignment_0_2");
			builder.put(grammarAccess.getAttributAccess().getIdAssignment_1_0(), "rule__Attribut__IdAssignment_1_0");
			builder.put(grammarAccess.getAttributAccess().getAttributAssignment_1_2(), "rule__Attribut__AttributAssignment_1_2");
			builder.put(grammarAccess.getAttributAccess().getIdAssignment_2_0(), "rule__Attribut__IdAssignment_2_0");
			builder.put(grammarAccess.getAttributAccess().getAttributAssignment_2_2(), "rule__Attribut__AttributAssignment_2_2");
			builder.put(grammarAccess.getExpressionNumeriqueAccess().getExpAssignment_0(), "rule__ExpressionNumerique__ExpAssignment_0");
			builder.put(grammarAccess.getExpressionNumeriqueAccess().getOpAssignment_1_0(), "rule__ExpressionNumerique__OpAssignment_1_0");
			builder.put(grammarAccess.getExpressionNumeriqueAccess().getExpAssignment_1_1(), "rule__ExpressionNumerique__ExpAssignment_1_1");
			builder.put(grammarAccess.getExpressionBooleeneAccess().getExpAssignment_0(), "rule__ExpressionBooleene__ExpAssignment_0");
			builder.put(grammarAccess.getExpressionBooleeneAccess().getLogAssignment_1_0(), "rule__ExpressionBooleene__LogAssignment_1_0");
			builder.put(grammarAccess.getExpressionBooleeneAccess().getExpAssignment_1_1(), "rule__ExpressionBooleene__ExpAssignment_1_1");
			builder.put(grammarAccess.getEntierAccess().getValAssignment_0(), "rule__Entier__ValAssignment_0");
			builder.put(grammarAccess.getEntierAccess().getAttAssignment_1(), "rule__Entier__AttAssignment_1");
			builder.put(grammarAccess.getBooleenAccess().getValAssignment_0(), "rule__Booleen__ValAssignment_0");
			builder.put(grammarAccess.getBooleenAccess().getVarAssignment_1(), "rule__Booleen__VarAssignment_1");
			builder.put(grammarAccess.getBooleenAccess().getExp1Assignment_2_0(), "rule__Booleen__Exp1Assignment_2_0");
			builder.put(grammarAccess.getBooleenAccess().getCompAssignment_2_1(), "rule__Booleen__CompAssignment_2_1");
			builder.put(grammarAccess.getBooleenAccess().getExp2Assignment_2_2(), "rule__Booleen__Exp2Assignment_2_2");
			builder.put(grammarAccess.getConditionAccess().getDeclarationAlorsAssignment_5(), "rule__Condition__DeclarationAlorsAssignment_5");
			builder.put(grammarAccess.getConditionAccess().getDeclarationSinonAssignment_7_2(), "rule__Condition__DeclarationSinonAssignment_7_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RulesUNOGrammarAccess grammarAccess;

	@Override
	protected InternalRulesUNOParser createParser() {
		InternalRulesUNOParser result = new InternalRulesUNOParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RulesUNOGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RulesUNOGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}