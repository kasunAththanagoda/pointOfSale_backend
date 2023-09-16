package com.pos.pointOfSale.dto;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;

public class CustomerDTO {

    private int cutomerId;
    private String customerName;
    private String customerAddress;
    private double salary;
    private ArrayList contactNumber;
    private String nic;
    private boolean activeStatus;

    public CustomerDTO() {
    }

    public CustomerDTO(int cutomerId, String customerName, String customerAddress, double salary, ArrayList contactNumber, String nic, boolean activeStatus) {
        this.cutomerId = cutomerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.salary = salary;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.activeStatus = activeStatus;
    }

    public int getCutomerId() {
        return cutomerId;
    }

    public void setCutomerId(int cutomerId) {
        this.cutomerId = cutomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cutomerId=" + cutomerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", salary=" + salary +
                ", contactNumber=" + contactNumber +
                ", nic='" + nic + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
