package ru.clevertec.structural.bridge;

import java.util.Arrays;

public class ProgramCreator {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };
        Arrays.stream(programs)
                .forEach(Program::developProgram);
    }
}
