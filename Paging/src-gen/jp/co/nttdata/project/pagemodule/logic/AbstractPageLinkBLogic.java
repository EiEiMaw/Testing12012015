/* 
 * @(#)AbstractAction01BLogic.java
 *
 * Copyright (c) 2014, NTT DATA CORPORATION
 * All rights reserved.
 */

package jp.co.nttdata.project.pagemodule.logic;
import jp.co.nttdata.project.pagemodule.bean.io.PageLinkOutputBean;
import jp.co.nttdata.project.pagemodule.bean.io.PageLinkInputBean;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.fw.service.thin.BLogic;

public abstract class AbstractPageLinkBLogic implements BLogic<PageLinkInputBean>{

    public BLogicResult execute(PageLinkInputBean params){
        BLogicResult result = new BLogicResult();
        PageLinkOutputBean output = new PageLinkOutputBean();
        output.setRow("sample value for row");
        output.setStart("sample value for start");
        output.setTotal("sample value for total");
        java.util.List<jp.co.nttdata.project.pagemodule.bean.view.EmployeeDetail> employeeDetail = new java.util.ArrayList<jp.co.nttdata.project.pagemodule.bean.view.EmployeeDetail>();
        for (int i = 0; i < 3; i++) {
            jp.co.nttdata.project.pagemodule.bean.view.EmployeeDetail employeeDetail_2 = new jp.co.nttdata.project.pagemodule.bean.view.EmployeeDetail();
            employeeDetail_2.setName("sample value for name");
            employeeDetail_2.setAddress("sample value for address");
            employeeDetail_2.setPhoneNo("sample value for phoneNo");
            employeeDetail.add(employeeDetail_2);
        }
        output.setEmployeeDetail(employeeDetail);
        result.setResultObject(output);
        result.setResultString("success");
        return result;
    }
}