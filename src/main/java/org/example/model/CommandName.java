package org.example.model;

public enum CommandName {

    //TODO: add commands
    MOV("mov", (byte) 0);

    private String name;
    private byte operationCode; //8 bit but used only 4 -> max is 16

    CommandName(String name, byte operationCode) {
        this.name = name;
        this.operationCode = operationCode;
    }
}
