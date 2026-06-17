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
}