package example.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int sid;
private String name;
private int marks;
public Student(int sid, String name, int marks) {
	super();
	this.sid = sid;
	this.name = name;
	this.marks = marks;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
}

}
