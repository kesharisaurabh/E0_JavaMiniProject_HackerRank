package project3;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) {
		Parent pt=new Parent();
		Scanner sc=new Scanner(System.in);
		pt.setStartElement(sc.nextInt());
		pt.setEndElement(sc.nextInt());
		ChildOne c1=new ChildOne();
		c1.filter();
		ChildTwo c2=new ChildTwo();
		c2.filter();
	}
}
