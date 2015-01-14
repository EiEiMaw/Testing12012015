/* 
 * @(#)Group01Bean.java
 *
 * Copyright (c) 2014, NTT DATA CORPORATION
 * All rights reserved.
 */

package jp.co.nttdata.project.pagemodule.bean.view;
import java.io.Serializable;

public class EmployeeDetail implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String address;

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    private String phoneNo;

    public String getPhoneNo(){
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
}