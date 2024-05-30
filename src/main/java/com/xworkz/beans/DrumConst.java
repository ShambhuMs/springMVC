package com.xworkz.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrumConst {

    public Fiber fiber;

    @Autowired
    public DrumConst(Fiber fiber) {
        this.fiber = fiber;
        System.out.println("Running drumConst.............");
    }
}
