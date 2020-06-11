package com.lea.design.patterns.interpreter;

//终结符表达式
public class TerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        System.out.println("终端解释器");
    }
}
