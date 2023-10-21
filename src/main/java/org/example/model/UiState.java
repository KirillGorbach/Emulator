package org.example.model;

import java.util.List;

//all data that ui needs to render
public class UiState {

    private final String eax;
    private final String ebx;
    private final String ecx;
    private final List<RomElement> rom;
    //TODO: add more fields

    public UiState(String eax, String ebx, String ecx, List<RomElement> rom) {
        this.eax = eax;
        this.ebx = ebx;
        this.ecx = ecx;
        this.rom = rom;
    }

    public String getEax() {
        return eax;
    }

    public String getEbx() {
        return ebx;
    }

    public String getEcx() {
        return ecx;
    }

    public List<RomElement> getRom() {
        return rom;
    }

    /**
     * @param value address + command
     */
    public record RomElement(String value, boolean isSelected) {}
}
