package org.clientapp45efs.back.entity;

public class Client {
    private int idClient;
    private String name;
    private String email;
    private String password;

    public Client(int idClient, String name, String email, String password) {
        this.idClient = idClient;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Client(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
