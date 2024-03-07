/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.*;

/**
 *
 * @author User
 */
public class CissueANDreturn {
    ResultSet rs4;
    ResultSet rs5;

    public void addIssuedetails(int issueid, String issuememberid, String issuemembername, String issuememberbookisbn,
            String issuememberbookname, String issuedate, String issuereturndate) {
        MissueANDreturn mir = new MissueANDreturn();
        mir.Maddissue(issueid, issuememberid, issuemembername, issuememberbookisbn, issuememberbookname, issuedate,
                issuereturndate);
    }

    public void updateIssuedetails(int issueid, String issuememberid, String issuemembername,
            String issuememberbookisbn, String issuememberbookname, String issuedate, String issuereturndate) {
        MissueANDreturn mir = new MissueANDreturn();
        mir.Mupdateissue(issueid, issuememberid, issuemembername, issuememberbookisbn, issuememberbookname, issuedate,
                issuereturndate);

    }

    public void deleteIssuedetails(int deleteissueid) {
        MissueANDreturn mir = new MissueANDreturn();
        mir.issuedeletedDataDetails(deleteissueid);

    }

    public ResultSet IssueViewDetails() {
        MissueANDreturn mir = new MissueANDreturn();
        rs4 = mir.IssueViewDataDetails();
        return rs4;
    }

    public void addreturndetails(int returnid, int issueid2, String todaydate, int dayselap, String fine,
            String status) {
        MissueANDreturn mir = new MissueANDreturn();
        mir.Maddreturn(returnid, issueid2, todaydate, dayselap, fine, status);
    }

    public ResultSet returnViewDetails() {
        MissueANDreturn mir = new MissueANDreturn();
        rs5 = mir.returnViewDataDetails();
        return rs5;
    }

    public void deletereturndetails(int returndeleteid) {
        MissueANDreturn mir = new MissueANDreturn();
        mir.returndeletedDataDetails(returndeleteid);

    }
}

// End