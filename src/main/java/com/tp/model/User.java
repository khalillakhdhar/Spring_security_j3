package com.tp.model;

public class User {
private int id;
private String nom,prenom;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public User(int id, String nom, String prenom, int age) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
}
@Override
public String toString() {
	return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
}



}
