package com.lea.design.patterns.interpreter;

//抽象表达式
abstract class AbstractExpression {
    public abstract void Interpret(Context context);
}
