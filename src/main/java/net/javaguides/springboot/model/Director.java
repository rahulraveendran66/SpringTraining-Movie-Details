package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="director")
public class Director {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long did;
	
	@Column(name="d_name")
	private String dName;
	
	@Column(name="hits")
	private long hits;
	
	@Column(name="flops")
	private long flops;
	
	@Column(name="industry")
	private String industry;
	
	public Director() {
		super();
	}

	public Director(String dName, long hits, long flops, String industry) {
		super();
		this.dName = dName;
		this.hits = hits;
		this.flops = flops;
		this.industry = industry;
	}
	
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	
	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
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
	
	
	
	

}
