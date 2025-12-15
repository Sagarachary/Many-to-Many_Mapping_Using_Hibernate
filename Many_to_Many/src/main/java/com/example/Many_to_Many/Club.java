package com.example.Many_to_Many;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "club")
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String club_name;
	@Column
	String club_location;
	
	@ManyToMany(mappedBy = "clubs")
	Set<KodStudent> students;

	public Club() {
		super();
	}

	public Club(String club_name, String club_location) {
		super();
		this.club_name = club_name;
		this.club_location = club_location;
	}

	public Club(String club_name, String club_location, Set<KodStudent> students) {
		super();
		this.club_name = club_name;
		this.club_location = club_location;
		this.students = students;
	}

	public Club(int id, String club_name, String club_location, Set<KodStudent> students) {
		super();
		this.id = id;
		this.club_name = club_name;
		this.club_location = club_location;
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClub_name() {
		return club_name;
	}

	public void setClub_name(String club_name) {
		this.club_name = club_name;
	}

	public String getClub_location() {
		return club_location;
	}

	public void setClub_location(String club_location) {
		this.club_location = club_location;
	}

	public Set<KodStudent> getStudents() {
		return students;
	}

	public void setStudents(Set<KodStudent> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", club_name=" + club_name + ", club_location=" + club_location + ", students="
				+ students + "]";
	}

	
	
}
