package com.zup.pizzaria.dtos;

public class OrderDTO {
    private String nameClient;
    private String emailClient;
    private String descriptionOrder;


    public OrderDTO(String nameClient, String emailClient, String descriptionOrder) {
        this.nameClient = nameClient;
        this.emailClient = emailClient;
        this.descriptionOrder = descriptionOrder;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getDescriptionOrder() {
        return descriptionOrder;
    }

    public void setDescriptionOrder(String descriptionOrder) {
        this.descriptionOrder = descriptionOrder;
    }
}
