package com.xworkz.component;

import org.springframework.stereotype.Component;

@Component
public class Bottle {
    public Bottle() {
        System.out.println("Created Bottle........");
    }
}
@Component
class Menu{
    public Menu() {
        System.out.println("Created menu....");
    }
}
@Component
class Bed{
    public Bed() {
        System.out.println("Created Bed........");
    }
}

@Component
class Airoplane{
    public Airoplane() {
        System.out.println("Created Airoplane..........");
    }
}
@Component
class Stick{
    public Stick() {
        System.out.println("Created Stick.......");
    }
}

@Component
class Sun{
    public Sun() {
        System.out.println("Created sun.............");
    }
}