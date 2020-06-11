package com.lea.design.patterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpreterTest {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression exp : list) {
            exp.Interpret(context);
        }
    }
}
