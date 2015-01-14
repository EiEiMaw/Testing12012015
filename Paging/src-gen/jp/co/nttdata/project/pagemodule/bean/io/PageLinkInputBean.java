/* 
 * @(#)Action01InputBean.java
 *
 * Copyright (c) 2014, NTT DATA CORPORATION
 * All rights reserved.
 */

package jp.co.nttdata.project.pagemodule.bean.io;
import java.util.List;
import jp.co.nttdata.project.pagemodule.bean.view.EmployeeDetail;
import jp.terasoluna.fw.service.thin.BLogicIOTarget;
import jp.terasoluna.fw.service.thin.BLogicIOField;
import java.io.Serializable;

public class PageLinkInputBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @BLogicIOField(target = BLogicIOTarget.FORM)
    private String row;

    public String getRow(){
        return row;
    }

    public void setRow(String row){
        this.row = row;
    }

    @BLogicIOField(target = BLogicIOTarget.FORM)
    private String start;

    public String getStart(){
        return start;
    }

    public void setStart(String start){
        this.start = start;
    }

    @BLogicIOField(target = BLogicIOTarget.FORM)
    private String total;

    public String getTotal(){
        return total;
    }

    public void setTotal(String total){
        this.total = total;
    }

    @BLogicIOField(target = BLogicIOTarget.FORM)
    private List<EmployeeDetail> employeeDetail;

    public List<EmployeeDetail> getEmployeeDetail(){
        return employeeDetail;
    }

    public void setEmployeeDetail(List<EmployeeDetail> employeeDetail){
        this.employeeDetail = employeeDetail;
    }
}