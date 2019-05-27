
package confee;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class datalist 
{
    
    Node head;
    int count;
    int no=1;
    
    datalist()
    {
        head=null;
        count=0;
    }
    
    public void add(data obj)
    {
        Node newNode=new Node(obj);
        if(head==null) {                     //add to first
            head=newNode;
        } else
        {
            Node current=head;
            while(current.getLink()!=null) {
                current=current.getLink();
            }
            current.setLink(newNode);
        }
        count++;
    }
    
    public void display(DefaultTableModel model)//draft
    { 
        Node current=head;
        data temp;

            while(current!=null)
            {
                temp=(data)current.getObj();
                model.addRow(new Object[]{no,temp.getConferenceName(), temp.getParticipantID() ,temp.getParticipantName() ,temp.getNoOfParticipant() ,temp.getParticipantOrganization() ,temp.getContactNo() ,temp.getEmail() ,temp.getFeeAmount() ,temp.getTotalFee()});
                current=current.getLink();
                no++;
            }
    }
    
    public void removeRow(DefaultTableModel model)
    {
        for(int remove=model.getRowCount()-1; remove>=0; remove--)
        model.removeRow(remove);
        no=1;
    }
    
    public void delete(int participantid)
    {
        Node before = null;
        Node current = head;
        data tempobj1;
        boolean delete=false;
        boolean loop=false;
        
        data test=(data)head.getObj();
        
        if(head==null)
            JOptionPane.showMessageDialog(null, "List is empty", "Error",JOptionPane.ERROR_MESSAGE);
        else if((test.getParticipantID()==participantid))
            head=head.getLink();
        else
        {
        while(delete==false && current!=null)
        {
            tempobj1=(data)current.getObj();
            loop=false;
            while((tempobj1.getParticipantID()!=participantid))
            {
                before=current;
                current=current.getLink();
                loop=true;
            }
            if((tempobj1.getParticipantID()==participantid))
            {
                before.link=current.link;
                delete=true;
            }
        }
    } 
    }
    
    public void update(int oldparticipantid,int setparticipantid,String setconferencename,String setparticipantname,String setnoofparticipant,String setparticipantorganization,String setcontactno,String setemailn,String setfeeamount,String settotalfee)
    {
        Node current=head;   
        data tempobj;
        while(current!=null)
        {
            tempobj=(data)current.getObj();
            if(oldparticipantid==tempobj.getParticipantID())
            {
                tempobj.setConferenceName(setconferencename);
                tempobj.setParticipantID(setparticipantid);
                tempobj.setParticipantName(setparticipantname);
                tempobj.setNoOfParticipant(setnoofparticipant);
                tempobj.setParticipantOrganization(setparticipantorganization);
                tempobj.setContactNo(setcontactno);
                tempobj.setEmail(setemailn);
                tempobj.setFeeAmount(setfeeamount);
                tempobj.setTotalFee(settotalfee);
            }
            current=current.getLink();
        }
    }  
}
