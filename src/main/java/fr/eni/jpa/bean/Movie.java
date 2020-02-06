package fr.eni.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	public String title;
	public int year;
	public int duration;

	@ManyToOne
	public Kind kind;

	@ManyToOne
	Producer producer;

	public String synopsis;

	Boolean isSeen;

	public Movie() {
		super();
	}

	public Movie(String title, int year, int duration, Kind kind, Producer producer, String synopsis, Boolean isSeen) {
		super();
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.kind = kind;
		this.producer = producer;
		this.synopsis = synopsis;
		this.isSeen = isSeen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Boolean getIsSeen() {
		return isSeen;
	}

	public void setIsSeen(Boolean isSeen) {
		this.isSeen = isSeen;
	}

}
