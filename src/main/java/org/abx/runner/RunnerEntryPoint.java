package org.abx.runner;

public class RunnerEntryPoint {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("Wrong number of arguments. " +
                    "First Server Ip. Second Runner Name");
        }

    }

}
