/* 
 * @(#)PageModuleForm.java
 *
 * Copyright (c) 2014, NTT DATA CORPORATION
 * All rights reserved.
 */

package jp.co.nttdata.project.pagemodule.web.form;
import jp.co.nttdata.project.pagemodule.bean.view.EmployeeDetail;
import java.util.List;
import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

public class PageModuleForm extends ValidatorActionFormEx{

    private static final long serialVersionUID = 1L;

    private String row;

    public String getRow(){
        return row;
    }

    public void setRow(String row){
        this.row = row;
    }

    private String start;

    public String getStart(){
        return start;
    }

    public void setStart(String start){
        this.start = start;
    }

    private String total;

    public String getTotal(){
        return total;
    }

    public void setTotal(String total){
        this.total = total;
    }

    private List<EmployeeDetail> employeeDetail;

    public List<EmployeeDetail> getEmployeeDetail(){
        return employeeDetail;
    }

    public void setEmployeeDetail(List<EmployeeDetail> employeeDetail){
        this.employeeDetail = employeeDetail;
    }
}