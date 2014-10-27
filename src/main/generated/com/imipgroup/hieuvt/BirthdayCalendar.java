package com.imipgroup.hieuvt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2014-10-27T15:28:35.911+07:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://hieuvt.imipgroup.com/", name = "BirthdayCalendar")
@XmlSeeAlso({ObjectFactory.class})
public interface BirthdayCalendar {

    @RequestWrapper(localName = "addBirthday", targetNamespace = "http://hieuvt.imipgroup.com/", className = "com.imipgroup.hieuvt.AddBirthday")
    @WebMethod
    @ResponseWrapper(localName = "addBirthdayResponse", targetNamespace = "http://hieuvt.imipgroup.com/", className = "com.imipgroup.hieuvt.AddBirthdayResponse")
    public void addBirthday(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "date", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar date
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getBirthdaysInMonth", targetNamespace = "http://hieuvt.imipgroup.com/", className = "com.imipgroup.hieuvt.GetBirthdaysInMonth")
    @WebMethod
    @ResponseWrapper(localName = "getBirthdaysInMonthResponse", targetNamespace = "http://hieuvt.imipgroup.com/", className = "com.imipgroup.hieuvt.GetBirthdaysInMonthResponse")
    public java.util.List<com.imipgroup.hieuvt.Birthday> getBirthdaysInMonth(
        @WebParam(name = "month", targetNamespace = "")
        int month
    );
}