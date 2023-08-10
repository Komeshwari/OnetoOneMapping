package com.association.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer authorId;
private String firstName;
private String lastName;
private String language;
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getLanguage() {
	return language;
}
@Override
public String toString() {
	return "Author [authorId=" + authorId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
			+ language + "]";
}
public void setLanguage(String language) {
	this.language = language;
}
public Author() {
	super();
	// TODO Auto-generated constructor stub
}


}
