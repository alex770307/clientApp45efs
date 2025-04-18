package org.clientapp45efs.back.dto;

public class RequestClientDto {

    private String name;
    private String email;
    private String password;

    public RequestClientDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
