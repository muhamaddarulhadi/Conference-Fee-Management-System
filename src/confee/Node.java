
package confee;

public class Node 
{

    public Object obj;
    public Node link;
    
    public Node()
    {
        obj=null;
        link=null;
    }
    
    public Node(Object obj)
    {
        this.obj=obj;
        link=null;
    }
    
    public Node(Object obj,Node link)
    {
        this.obj=obj;
        this.link=link;
    }
    
    public Object getObj()
    {
        return this.obj;
    }
    
    public Node getLink()
    {
        return this.link;
    }
    
    public void setObj(Object obj)
    {
        this.obj=obj;
    }
    
    public void setLink(Node link)
    {
        this.link=link;
    }

}
