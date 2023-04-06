package com.example.demo.entity;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Resto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String adress;
	private double lang;
	private double latitude;
	private String rank;
	@Temporal(TemporalType.TIME)
	private Date heureOpen;
	@Temporal(TemporalType.TIME)
	private Date heureClose;
	private String jourOuverture;
	
	@OneToMany(mappedBy = "resto")
	private List<Photo> photo;
	
	@ManyToOne
	
	private Zone zone;
	
	@ManyToOne
	
	private Serie serie;
	
	@ManyToOne
	private User user;
	
	@ManyToMany
	@JoinTable(name = "specialite_resto",
	
	 joinColumns = @JoinColumn(name = "resto_id"),
	inverseJoinColumns = @JoinColumn(name = "specialite_id"))
	private List<Specialite> specialite;
	
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getLang() {
		return lang;
	}
	public void setLang(double lang) {
		this.lang = lang;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getRank() {
		return rank;
	}
	public void setRanf(String ranf) {
		this.rank = ranf;
	}

	public Date getHeureOpen() {
		return heureOpen;
	}
	public void setHeureOpen(Date heureOpen) {
		this.heureOpen = heureOpen;
	}
	public Date getHeureClose() {
		return heureClose;
	}
	public void setHeureClose(Date heureClose) {
		this.heureClose = heureClose;
	}
	public String getJourOuverture() {
		return jourOuverture;
	}
	public void setJourOuverture(String jourOuverture) {
		this.jourOuverture = jourOuverture;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public List<Photo> getPhoto() {
		return photo;
	}
	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public List<Specialite> getSpecialite() {
		return specialite;
	}
	public void setSpecialite(List<Specialite> specialite) {
		this.specialite = specialite;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
}
