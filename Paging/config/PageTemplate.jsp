<%--
  --  Copyright (c) 2014, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-html" prefix="html"%>
<%@ taglib uri="/struts-bean" prefix="bean"%>
<%@ taglib uri="/struts-logic" prefix="logic"%>
<%@ taglib uri="/struts-nested" prefix="nested"%>
<%@ taglib uri="/terasoluna" prefix="t"%>
<%@ taglib uri="/terasoluna-struts" prefix="ts"%>
<%@ taglib uri="/terasoluna-library" prefix="tl"%>
<html:html xhtml="true">
<head>
<title>Screen</title>

</head>
<ts:body>
    <html:messages id="msg" message="true">
        <bean:write ignore="true" name="msg" />
        <br />
    </html:messages>
    <html:errors />
    <div id="tri_Form01">
        <fieldset>
            <legend>Form01</legend>
        </fieldset>
    </div>
</ts:body>
</html:html>
