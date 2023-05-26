package sba.sms.models;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "Activity")

public class Activity {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Volunteer> getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(List<Volunteer> volunteers) {
		this.volunteers = volunteers;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	public Activity() {
	}

	public Activity(int id, String name, List<Volunteer> volunteers) {
		this.id = id;
		this.name = name;
		this.volunteers = volunteers;
	}

	public Activity(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Column(name = "name", length = 50, nullable = false)
	private String name;

	@ManyToMany(mappedBy = "activities", fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	private List<Volunteer> volunteers;

	@Override
	public String toString() {
		return "Activity{" + "id=" + id + ", name='" + name + '\'' + ", volunteers=" + volunteers + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, volunteers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(volunteers, other.volunteers);
	}

	
}