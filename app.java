import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

public class app extends Frame{
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2;
    TextArea a,a1;
    Choice c1,c2;
    Checkbox rb1,rb2;
    CheckboxGroup cg;
    MenuItem m1,m2,m3,m4;
    File cf,nf;
    String filename;

    app(){
        setTitle("User Id");
        setVisible(true);
        setLayout(null);
        setBackground(Color.white);

        a1=new TextArea();
        add(a1);

        l1=new Label("Application Form");
        l1.setBounds(580,50,400,100);
        l1.setAlignment(Label.CENTER);
        add(l1);
        Font f=new Font("Serif",Font.BOLD,40);
        l1.setFont(f);
        l2=new Label("Name       :");
        l2.setBounds(100,170,150,100);
        add(l2);
        Font f1=new Font("Serif",Font.BOLD,25);
        l2.setFont(f1);
        l3=new Label("Id             :");
        l3.setBounds(100,270,150,100);
        add(l3);
        Font f2=new Font("Serif",Font.BOLD,25);
        l3.setFont(f2);
        l4=new Label("Age          :");
        l4.setBounds(100,370,150,100);
        add(l4);
        Font f3=new Font("Serif",Font.BOLD,25);
        l4.setFont(f1);
        l5=new Label("Gender    :");
        l5.setBounds(100,470,150,100);
        add(l5);
        Font f4=new Font("Serif",Font.BOLD,25);
        l5.setFont(f4);
        l6=new Label("Course     :");
        l6.setBounds(100,570,150,100);
        add(l6);
        Font f5=new Font("Serif",Font.BOLD,25);
        l6.setFont(f5);
        l7=new Label("Address    :");
        l7.setBounds(100,670,150,100);
        add(l7);
        Font f6=new Font("Serif",Font.BOLD,25);
        l7.setFont(f6);
        l8=new Label("");
        Font f7=new Font("Serif",Font.BOLD,16);
        l8.setAlignment(Label.CENTER);
        l8.setSize(500,100);
        l8.setFont(f7);
        add(l8);
        Button b1=new Button("Show");
        b1.setBounds(500,670,50,25);
        add(b1);

        cg=new CheckboxGroup();
        rb1=new Checkbox("Male",cg,false);
        rb1.setBounds(270,505,100,40);
        add(rb1);
        rb2=new Checkbox("Female",cg,false);
        rb2.setBounds(370,505,100,40);
        add(rb2);
        
        c1=new Choice();
        c1.addItem("BTech");
        c1.addItem("BE");
        c1.addItem("BSc");
        c1.addItem("Bcom");
        c1.addItem("BBA");
        c1.addItem("BCA");
        c1.addItem("Others");
        c1.setBounds(270,608,70,20);
        add(c1);

        c2=new Choice();
        c2.addItem("25");
        c2.addItem("26");
        c2.addItem("27");
        c2.addItem("28");
        c2.addItem("29");
        c2.addItem("30");
        c2.addItem("31");
        c2.addItem("32");
        c2.addItem("33");
        c2.addItem("34");
        c2.addItem("35");
        c2.setBounds(270,408,70,20);
        add(c2);

        MenuBar mb=new MenuBar();
        Menu fm=new Menu("File");
        m1=new MenuItem("New");
        m2=new MenuItem("Open");
        m3=new MenuItem("Save");
        m4=new MenuItem("Exit");

        m1.addActionListener(new New());
        fm.add(m1);
        m2.addActionListener(new Open());
        fm.add(m2);
        m3.addActionListener(new Save());
        fm.add(m3);
        m4.addActionListener(new Exit());
        fm.add(m4);
        mb.add(fm);
        setMenuBar(mb);

}