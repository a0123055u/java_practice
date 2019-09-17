/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package printpatterrn;

import Polymorphism.EmployeeSuper;
import Polymorphism.FareSystemEmployeeSub;
import AbstractAndInhertance.Afaces;
import AbstractAndInhertance.Ashapes;
import Interface.C;
import Interface.B;
import Interface.A;
import Reader.BufferFileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import ColectionsBasics.SetExample;
import SortingAlgorithams.BubbleSort;
import SortingAlgorithams.MergeSort;
import StacksAndQues.Stack;
import Trees.BST;
import Trees.Node;
import ArrayInsert.ArraySumAndInsert;
import TEst.Car;


import Threading.Thread2;
import Threading.ThreadBasics;
import Vectors.AddingElements;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Printpatterrn {
     static private  int avar=9;
     static private final int avar1= 5;

    public void drawPattern(int f){
      int count=1;
        for(int i=1;i<=f;i++)
        {
            if(i==1)
            {
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(i);
                count++;
            }
            else
            {
                int rowlength=count;
                rowlength=rowlength*2;
                System.out.println();
                if(rowlength!=10)
                System.out.print(" ");
                for(int inner=count;inner<=rowlength;inner++)
                {
                    if((inner==1)){
                    inner++; }               
                    System.out.print(inner);
                    count++; 
                    if(count==10)
                        break;
                    
                                 
                }
                //System.out.println();
              
            }
        }
       
        
            
        
    }
     public void PrintTables(int a)
        {
            int count =2;
            for(int i=1;i<=a;i++)
            {
                for(int j=1;j<=a;j++)
                {
                int y=count*j; 
                System.out.println(y);
                }
                count++;
                if(count==13)
                    break;
            }
            
            //return 1;
        }
    
     
     


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        SetExample ee = new SetExample();
//        List<String> u = new ArrayList<String>();
//        u.add("Test");
//        u.add("Thiru");
//        u.add("Mani");
//        ee.setList(u);
        
//         Scanner in = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//        ArrayList<Integer> hourGlass= new ArrayList<Integer>();
//        int rowHour=0;
//        
//        
//            int count=0;
//        for(int a=0;a<6;a++){
//            for(int b=0;b<6;b++){
//                if(a<4){
//                     for(int j=a;j<3+a;j++){
//                if(b<4){                  
//                
//                for(int k=b;k<3+b;k++){
//                    count++;
//                     //System.out.println("Count"+count);
//                    if(count==4 || count==6){
//                     
//                    }
//                    else{
//                        rowHour+=arr[j][k];
//                        // System.out.println(arr[j][k]);
//                    }
//               
//                    
//                }    
//                     }
//               
//        }
//                     System.out.println("Values"+rowHour);
//                     hourGlass.add(rowHour);
//                    rowHour=0;
//                    count=0;
//                }
//               
//            }
//        }
//            
//        Integer a = Collections.max(hourGlass);
//        System.out.println(a);
//     
//    
        
        
        
//        Car x = new Car();
//         System.out.println(x.tank);
//        x.Acc();
//        System.out.println(x.tank);
                                                    double aa=Math.ceil(49.15);
                                                    System.out.println(aa);
                                                   EmployeeSuper es = new FareSystemEmployeeSub();
                                                    System.out.println("p "+es.getSalary(100, 100));
                                                   FareSystemEmployeeSub ss = new FareSystemEmployeeSub();
                                                    System.out.println("p1 "+ss.getSalary(100,100));
                                                   EmployeeSuper ee1 = new EmployeeSuper();
                                                    System.out.println("p2 "+ee1.getSalary(100,100));
        
       // ss=(FareSystemEmployeeSub) ee;
       // ee1=ss;
       // System.out.println(ss.getSalary(100, 100));
//                                            System.out.println();
//                                            System.out.println(es.getSalary(100,100)+" "+ ee1.getSalary(100,100));
//                                            Long d=System.currentTimeMillis();
//                                            System.out.println(d);
//                                            for(int i=0;i<1000000;i++){
//
//                                            }
//                                             System.out.println(System.currentTimeMillis()-d);
        
//        String a = "I am Thiru";
//        String b[] = a.split(" ");
//        LinkedList<String> a1 = new LinkedList<String>();
//        
//        for(String s : b){
//           
//            
//            StringBuilder sb = new StringBuilder(s);
//        String revString=sb.reverse().toString();
//        System.out.println(revString);
//        }
//        for(int h=b.length-1;h>=0;h--){
//            String f = b[h];
//            a1.addLast(f);
//            System.out.println(f);
//            
//        }
//        for(String d: a1){
//            System.out.println(d);
//        }
//       
        
        
       
//        try{
//            int a =4/0;
//        }catch(Exception e){
//            System.out.print("Exception");
//            System.out.print("a"=="b");
//        }
//        finally{
//            System.out.println("Reached");
//        }
//        EmployeeSuper obj1 = new FareSystemEmployeeSub();
//        
//       float t = obj1.getSalary(1500, 1500);
//        System.out.println("salary"+t);
//        A a = new C();
//        a.setA("TEST");
//        C b =new C();
//        b.setA("thiru");
//        String r=b.getA();
//        System.out.println(r);
        
//        ArraySumAndInsert araayRemove = new ArraySumAndInsert();
//        int a[] =  {1,2,3,4};
//      int a1=  araayRemove.sumAndDercremnt(a);
//        System.out.println(a1);
        
         //BST tree = new BST();
//         tree.Insert(3,null);
//         tree.Insert(5, null);
//         tree.Insert(1, null);
//         tree.Insert(4, null);
//          tree.Insert(6, null);
//           tree.Insert(7, null);
//              tree.Insert(9, null);
//                 tree.Insert(8, null);
//                 tree.top_view(null); 4 2 3 1 7
//         Node node = new Node();
//         node.setData(4);
//         tree.singleInsert(node,4);
//         tree.singleInsert(node,2);
//         tree.singleInsert(node,3);
//         tree.singleInsert(node,1);
//         tree.singleInsert(node,7);
//         tree.singleInsert(node,6);
//         
                 
                 
                 
}
}
        // TODO code application logic here
      // Printpatterrn a = new Printpatterrn();
                //a.drawPattern(3);
                
//        BasicsRevision b = new BasicsRevision();
//                               b.BasicRevision();
//                                 b.setA(555);
//                                b.setB(666);
//                                 BasicsRevision a=b;
                             //  when a object doenot point to some things garbage collector will collect those things
                                // b=null;
                              
//                                    System.out.println("val of obj a"+a+" ");
//                                    System.out.println("val of obj b"+b+" " );
//                                    System.out.println("Getting value of a set by obj b using object a after assigning obj b to obj a");
//                                    System.out.println("The value of var a set by b"+a.getA());

                 // System.out.println("The value of  variable a"+ b.getA());   
                  //System.out.println("The value of variable  b"+b.getB());
                             
//                             CheckingString obj1= new CheckingString();
//                             obj1.Operation1("Thiruvalluvan");
        //ArrayBasics abs = new ArrayBasics();
        //abs.ArrayMethods();
       // String[] pass = {"hi how are you","Thiru ","valluvan","murugesan"};
       // abs.extendedArraySize(pass);
//        Printpatterrn.avar=100;
//        System.out.println("static varibale after changing value"+Printpatterrn.avar);
//         System.out.println("static final  value"+Printpatterrn.avar1);
        //pritning static method
     //  BasicsRevision.PrintValue(5);
        
        //polymorphism 
//         FareSystemEmployeeSub obj1= new  FareSystemEmployeeSub();
//         float NetSalary=obj1.getTotalAnnualSalary(5,2000,350,"New");
//         float oldSalary= obj1.getSalary(2000,350);
//         System.out.println("Printing using New Slab");
//         System.out.println("New salary"+NetSalary);
//          System.out.println("old salary"+oldSalary);
//         
//          float NetSalary1=obj1.getTotalAnnualSalary(5,2000,350,"Old");
//         float oldSalary1= obj1.getSalary(2000,350);
//          System.out.println("Printing using Old Slab");
//         System.out.println("New salary"+NetSalary1);
//          System.out.println("old salary"+oldSalary1);
//          
//          EmployeeSuper eps = new EmployeeSuper();
//          eps.getSalary(2000, 350);
//          FareSystemEmployeeSub fse= new FareSystemEmployeeSub();
//          fse.getTotalAnnualSalary(5, 2000, 350, "New");//getSalary(2000, 350);//getTotalAnnualSalary(5, 2000, 350, "New");
//          eps=fse;
          
        //  fse=esp;
          
         //abstract method testing
          
//          Afaces afobj= new Afaces();
//         afobj.setAshapes("Rectangle");
//         afobj.setAshapes("Square");
//         String values[] =afobj.getAShapes();
//         for (String temp :values ){
//             System.out.println("The values are  "+temp);
//         }
//          //Ashapes asobj =new Ashapes();
//          
//        
          
          //Interface 
//          C object1 = new C();
//          object1.setA("Thiru");
//        System.out.println("The value is"+ object1.getA());
        
        
        //File reading
         
//        BufferFileReader obj = new BufferFileReader();
//        try{
//        obj.FileReader1("F:/MemberFile.txt");
//        }catch(FileNotFoundException e)
//        {
//            System.out.println("@@"+e);
//        }
//        finally{
//            System.out.println("Finshed Ececuting");
//        }
         
        
        //CollectionsBasics
        
//        SetExample SE =new SetExample();
//        Collection<Integer> a = new HashSet();
//       a.add(3);
//       a.add(4);
//       a.add(2);
//       a.add(10);
//       a.add(12);
//       a.add(11);
//       a.add(100);
//       a.add(91);
//        Collection<Integer> C1 = new HashSet<Integer>();
//        C1.addAll(a);
//        Collection<String> C3= new ArrayList<String>();
//        C3.add("Thiru");
//        C3.add("Parthi");
//        C3.add("BALA");
//        C3.remove("BALA");
//       Collection<Integer> L1 = new ArrayList<Integer>();
//       L1.add(1);
//       L1.add(2);
//       L1.add(3);
//       L1.add(4);
//       L1.add(5);
//        
//        
//        SE.setValueHashSet(a);
//        SE.SetValueSortedTreeSet(a);
//        SE.setArrayList((ArrayList<String>) C3);
        
        
//       Scanner input1 =new Scanner(System.in);
//         String b1=input1.next();
//         
//         
//        int[] HashKey= {1,2,36,7,23,21,19};
//        String[] HashValue={"Thiru",b1,"Shive","Mani"};
//        SE.setHashMap(HashKey, HashValue);
//        SE.setTreeMap(HashKey, HashValue);
//        String a="tt";
//        String bw="tt";
//        if(a.equals(bw))
//        {
//            System.out.println("@@@@");
//        }
        
        
        //Threading
       // (new ThreadBasics()).start();
//        Thread t1 = new Thread(new ThreadBasics());
//        Thread t2= new Thread(new Thread2());
//        
//         t2.start();
//         
//         synchronized(t2)
//         {
//             t1.start();
//             System.out.println("Waiting For t2 to complete calculating");
//             try{
//             t2.wait();
//             }catch(InterruptedException e)
//             {
//                 //e.printStackTrace();
//             }
//             System.out.println("Printing after notification");
//             System.out.println(Thread2.Value);
//             
//         }
         
        
         
       // String i ="2";
      //System.out.println(Integer.toBinaryString(i)+ i);
        //String x ;
         //x = 1 << i;
       //System.out.println(Integer.toBinaryString(x));
               
        
        
        //Sorting bubble sort
//        Random r =new Random();
//        int[] Val = new int[1000];
//        for(int i=0;i<1000;i++)
//        {
//          Val[i]=  r.nextInt(1000);
//        }
//        BubbleSort bs =new BubbleSort();
//        MergeSort ms =new MergeSort();
//        
//       Date d=Date.from(Instant.now());
////        System.out.println(d.getTime());
//        int[] Result= bs.BubbleSort(Val);
////        Date t =Date.from(Instant.now());
//        
//         System.out.println(d.getTime ());
//         
//        
//     // int []Result1= ms.MergeSort(Val);
//   Date tt =Date.from(Instant.now());
//      long t=tt.getTime()-d.getTime();
//        
//        for(int t1:Result)
//        {
//            System.out.println(t1);
//        }
//            System.out.println(t);    
//                }
        // IBM question
//        Printpatterrn pp = new Printpatterrn();
//        pp.PrintTables(12);
        
//        //AddingElements r = new AddingElements();
//       // r.VectorTest();
                                    
             
        
        //Date 12/11/2016
        //stacks and ques
//        Stack s = new Stack(5);
//        try{
//            s.push(4);
//            s.push(8);
//            s.push(9);
//            s.push(7);
//            s.push(100);
//            s.pop();
//            s.peek();
//            s.push(3);
          // boolean find= s.push(31);
           
           
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        
        
        
         //public static Node root;
         

//    public void insert(Node root, int id){
//        Node newNode = new Node(id);
//        Node current = root;
//        Node parent = null;
//        while(true){
//            parent = current;
//            if(id<current.data){
//                current = current.left;
//                if(current==null){
//                    parent.left = newNode;
//                    newNode.right = parent;
//                    newNode.rightThread = true;
//                    return;
//                }
//            }else{
//                if(current.rightThread==false){
//                    current = current.right;
//                    if(current==null){
//                        parent.right = newNode;
//                        return;
//                    }
//                }else{
//                    Node temp = current.right;
//                    current.right = newNode;
//                    newNode.right = temp;
//                    newNode.rightThread=true;
//                    return;
//                }
//            }
//        }
//    }
//
//    public void print(Node root){
//        //first go to most left node
//        Node current = leftMostNode(root);
//
//
//        //now travel using right pointers
//        while(current!=null){
//            System.out.print(" " + current.data);
//            //check if node has a right thread
//            if(current.rightThread)
//                current = current.right;
//            else // else go to left most node in the right subtree
//                current = leftMostNode(current.right);
//        }
//        System.out.println();
//    }
//
//    public Node leftMostNode(Node node){
//        if(node==null){
//            return null;
//        }else{
//            while(node.left!=null){
//                node = node.left;
//            }
//            return node;
//        }
//    }
//
//    public static void main(String[] args) {
//        root = new Node(100);
//        Printpatterrn st=new Printpatterrn();
//        st.insert(root,50);
//        st.insert(root,25);
//        st.insert(root,7);
//        st.insert(root,20);
//        st.insert(root,75);
//        st.insert(root,99);
//
//        st.print(root);
//    }
//
//}
//class Node{
//    Node left;
//    Node right;
//    int data;
//    boolean rightThread;
//    public Node(int data){
//        this.data = data;
//        rightThread = false;
//    }
//        
//    }
   
   
//}
