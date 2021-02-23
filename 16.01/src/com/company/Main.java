package com.company;

import matematika.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation o1 = new Addition("+");
        List<Operation> operations = new ArrayList<>();
        Operation o2 = new Subtraction("-");
        Operation o3 = new Multiplication("*");
        Operation o4 = new Division("/");

        Collections.addAll(operations, o1, o2, o3, o4);

        Scanner scan = new Scanner(System.in);

        for(Operation operation : operations) {
            operation.execute(scan);
        }
    }
}
