package co.grandcircus.APICapstone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BucketList {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;

	public BucketList() {
		super();
		// TODO Auto-generated constructor stub

	}

	public BucketList(String id, String name) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
