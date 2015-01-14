<%--
  --  Copyright (c) 2014, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/struts-nested" prefix="nested"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/terasoluna-library" prefix="tl"%>
<html:html xhtml="true">
<head>
<title>FistPage</title>

</head>
<ts:body>
    <html:messages id="msg" message="true">
        <bean:write ignore="true" name="msg"/>
        <br/>
    </html:messages>
    <html:errors/>
    <div id="tri_Form01">
        <fieldset>
            <legend>Form01</legend>
        <div id="tri_Form01/employeeList"><logic:notEmpty name="_PageModuleForm" property="employeeDetail"><dt>employeeList</dt><dd><table><bean:define id="pagelinkLength" name="_PageModuleForm" property="row" type="java.lang.String"/><tr><th>#</th><th id="tri_Form01/employeeList/field01_th">item01</th><th id="tri_Form01/employeeList/field02_th">item02</th><th id="tri_Form01/employeeList/field03_th">item03</th></tr><logic:iterate id="Form01_employeeDetail_row" indexId="Form01_employeeDetail_index" length="${pagelinkLength}" name="_PageModuleForm" offset="0" property="employeeDetail"><tr><td><bean:write format="000" name="Form01_employeeDetail_index"/></td><td id="tri_Form01/employeeList/field01"><bean:write name="_PageModuleForm" property="employeeDetail[${Form01_employeeDetail_index}].name"/></td><td id="tri_Form01/employeeList/field02"><bean:write name="_PageModuleForm" property="employeeDetail[${Form01_employeeDetail_index}].address"/></td><td id="tri_Form01/employeeList/field03"><bean:write name="_PageModuleForm" property="employeeDetail[${Form01_employeeDetail_index}].phoneNo"/></td></tr></logic:iterate></table></dd></logic:notEmpty></div><div id="tri_Form01/pageLink"><ts:pageLinks action="/PageModule/pageAction.do" indexProperty="start" name="_PageModuleForm" rowProperty="row" totalProperty="total"/></div></fieldset>
    </div>
</ts:body>
</html:html>
