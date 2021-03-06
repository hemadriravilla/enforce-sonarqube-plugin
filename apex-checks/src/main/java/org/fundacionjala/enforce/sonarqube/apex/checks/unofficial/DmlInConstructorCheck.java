/*
 * Copyright (c) Fundacion Jala. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */
package org.fundacionjala.enforce.sonarqube.apex.checks.unofficial;

import org.fundacionjala.enforce.sonarqube.apex.api.grammar.ApexGrammarRuleKey;
import org.fundacionjala.enforce.sonarqube.apex.checks.ChecksBundle;
import org.sonar.check.Rule;

/**
 * Check for a DML is not within a "Constructor".
 */
@Rule(key = DmlInConstructorCheck.CHECK_KEY)
public class DmlInConstructorCheck extends DmlStatementCheck {

    /**
     * Stores a message template.
     */
    private static final String MESSAGE = ChecksBundle.getStringFromBundle("DmlInConsCheckMessage");

    /**
     * It is the code of the rule for the plugin.
     */
    public static final String CHECK_KEY = "A1005";

    /**
     * The variables are initialized and subscribe the base rule.
     */
    public DmlInConstructorCheck() {
        ruleKey = ApexGrammarRuleKey.CONSTRUCTOR_DECLARATION;
        message = MESSAGE;
    }
}
