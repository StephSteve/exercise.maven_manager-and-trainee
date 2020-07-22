package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
// TODO - Ensure an `AbstractEmployee` implements the `EmployeeInterface`
// TODO - Ensure an `AbstractEmployee` is abstract
abstract public class AbstractEmployee implements EmployeeInterface {
    private Object exampleOfInstanceVariable; // TODO - Replace with correct instance variable declarations
    private Long id;
    private String name;
    private String address;
    private Long phoneNumber;
    private Double basicSalary;
    private Double specialAllowance;
    private Double healthReimbursementAccount;
    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary, Double specialAllowance, Double healthReimbursementAccount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
        this.specialAllowance = specialAllowance;
        this.healthReimbursementAccount = healthReimbursementAccount;
    }

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        this(id, name, address, phoneNumber, basicSalary, 250.80, 1000.50);
    }

    public AbstractEmployee() {
        this.specialAllowance = 250.80;
        this.healthReimbursementAccount = 1000.50;
    }
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Long setId(Long id) {
        this.id = id;
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    @Override
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public Long setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }

    @Override
    public Double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public Double setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
        return basicSalary;
    }

    @Override
    public Double getSpecialAllowance() {
        return specialAllowance;
    }

    @Override
    public Double setSpecialAllowance(Double specialAllowance) {
        this.specialAllowance = specialAllowance;
        return specialAllowance;
    }

    @Override
    public Double getHealthReimbursementAccount() {
        return healthReimbursementAccount;
    }

    @Override
    public Double setHealthReimbursementAccount(Double healthReimbursementAccount) {
        this.healthReimbursementAccount = healthReimbursementAccount;
        return healthReimbursementAccount;
    }
}
