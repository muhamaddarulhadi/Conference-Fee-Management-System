
package confee;

public class data 
{
    public String conferencename, participantname, noofparticipant, participantorganization, contactno, email, feeamount, totalfee;
    public int participantid;
    
    
    public data(String conferencename, int participantid, String participantname, String noofparticipant, String participantorganization, String contactno, String email, String feeamount, String totalfee)
    {
        this.conferencename=conferencename;
        this.participantid=participantid;
        this.participantname=participantname;
        this.noofparticipant=noofparticipant;
        this.participantorganization=participantorganization;
        this.contactno=contactno;
        this.email=email;
        this.feeamount=feeamount;
        this.totalfee=totalfee;
    }
    
    
    public String getConferenceName()
    {
        return this.conferencename;
    }
    public int getParticipantID()
    {
        return this.participantid;
    }
    public String getParticipantName()
    {
        return this.participantname;
    }
    public String getNoOfParticipant()
    {
        return this.noofparticipant;
    }
    public String getParticipantOrganization()
    {
        return this.participantorganization;
    }
    public String getContactNo()
    {
        return this.contactno;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getFeeAmount()
    {
        return this.feeamount;
    }
    public String getTotalFee()
    {
        return this.totalfee;
    }

    
    public void setConferenceName(String conferencename)
    {
        this.conferencename=conferencename;
    }
    public void setParticipantID(int participantid)
    {
        this.participantid=participantid;
    }
    public void setParticipantName(String participantname)
    {
        this.participantname=participantname;
    }
    public void setNoOfParticipant(String noofparticipant)
    {
        this.noofparticipant=noofparticipant;
    }
    public void setParticipantOrganization(String participantorganization)
    {
        this.participantorganization=participantorganization;
    }
    public void setContactNo(String contactno)
    {
        this.contactno=contactno;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setFeeAmount(String feeamount)
    {
        this.feeamount=feeamount;
    }
    public void setTotalFee(String totalfee)
    {
        this.totalfee=totalfee;
    }
}
