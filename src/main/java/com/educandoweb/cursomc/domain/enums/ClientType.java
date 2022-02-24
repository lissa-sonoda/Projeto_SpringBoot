package com.educandoweb.cursomc.domain.enums;

public enum ClientType {

    NATURALPERSON(1, "Natural Person"),
    LEGALENTITY(2, "Legal Entity");

    private int cod;
    private String description;

    private ClientType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static ClientType toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for(ClientType x : ClientType.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
