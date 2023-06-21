package io.github.anesuphiri521.Example.Dto;

import io.github.anesuphiri521.DataMasking.annotations.Mask;

/*
 * @created - 20/06/2023
 * @project - DataMasking
 * @author - anesuphiri - sehphirry@gmail.com
 */
public class Employee {
    private String name;
    private String surname;
    private String dep;
    @Mask(startPosition = 4, endPosition = 6, maskingCharacter = 'X')
    private String phoneNumber;
    @Mask(startPosition = 4, endPosition = 12)
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dep='" + dep + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
