package com.example.pattern.factory.implementations.strategyfactory;

class SomeTargetStrategy implements Strategy {

    public String format(Target target) {
        return "some target";
    }
}
