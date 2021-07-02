package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long aid;
	
	@Column(name="a_name")
	private String aName; 
	
	@Column(name="hits")
	private long hits;
	
	@Column(name="flops")
	private long flops;
	
	@Column(name="industry")
	private String industry;
	
	public Actor() {
		super();
	}
	
	public Actor( long hits, long flops, String industry, String aName) {
		super();
		this.hits = hits;
		this.flops = flops;
		this.industry = industry;
		this.aName=aName;
	}
	
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	
	public long getHits() {
		return hits;
	}
	public void setHits(long hits) {
		this.hits = hits;
	}
	public long getFlops() {
		return flops;
	}
	public void setFlops(long flops) {
		this.flops = flops;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}
	
	

}
