/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author hp
 */

public class BST {
    private Node root;
    public BST(){
        root=new Node();
    }
    
    public int Insert(int i, Node curr){
        Node current;
        if(getRoot()==null){
            return -1;
        }
        else{
            int a=getRoot().getData();
            if(a==0){
                 getRoot().setData(i);
                 getRoot().printNode();
                 return 1;
            }
            else{
                if(curr==null)
                    curr=getRoot();
            }
           
        }
       
      int currVal= curr.getData(); 
      
       if(i<currVal){
          
           Node temp = curr.getRight();
           if(temp!=null){
               int y=Insert(i,curr.getRight());
           }
           else{
                Node childNode = new Node();
           curr.setRight(childNode);
           childNode.setData(i);
           childNode.printNode();
           }
           
          
           
       }
       if(i>currVal){
            Node temp = curr.getLeft();
            if(temp!=null){
               int y=Insert(i,curr.getLeft()); 
            }
            else{
                         Node childNode = new Node();
         curr.setLeft(childNode);
          childNode.setData(i);
          childNode.printNode();
        
            }
          
          
         
       }
      
     
        
        
            
        return 1;
        
    }
    public void top_view(Node curr)
{
     int hasLeft=0;
    int hasRight=0;
  
    if(curr==null)
         curr = getRoot();
    
    if(curr.getLeft()!=null){      
       
        top_view(curr.getLeft());
         System.out.printf("%d   ",curr.getData());
    }
       
    if(curr.getRight()!=null){     
         
         top_view(curr.getRight());
        System.out.printf("%d   ",curr.getData());
    }
         
   
    }
    public Node singleInsert(Node root,int value)
    {
    Node current;
        if(root==null)
          current = new Node();
    
        current = root;
   
        if(value<current.getData()){
            if(current.getLeft()!=null){
                current= singleInsert(current.getLeft(),value);
            }
            else{
                Node child = new Node();
                current.setLeft(child);
                child.setData(value);
                // current.left = new Node(value);
                System.out.println(child.getData());
                 return current;
            }
                
        }         
        else if(value>current.getData()){
             if(current.getRight()!=null){
                current= singleInsert(current.getRight(),value);
            }
            else{
                 Node child = new Node();
                current.setRight(child);
                child.setData(value);
                 //current.right = new Node(value);
                 System.out.println(child.getData());
                 return current;
            }
        }   
   
    return current;
       
    }

    /**
     * @return the root
     */
    public Node getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Node root) {
        this.root = root;
    }
    

   
  

    
}
