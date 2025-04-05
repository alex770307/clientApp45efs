package org.clientapp45efs.back.dto;

public class ResponseClientDto {

    private Integer idClient;
    private String name;
    private String email;

    public ResponseClientDto(Integer idClient, String name, String email) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
