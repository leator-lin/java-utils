package com.lea.design.patterns.interpreter;

//非终结符表达式
public class NonterminalExpression extends AbstractExpression{
    @Override
    public void Interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
