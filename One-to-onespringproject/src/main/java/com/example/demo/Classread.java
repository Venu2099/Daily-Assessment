package com.example.demo;

public class Classread {
	@Entity
	@Table(name = "Countries")
	public class Country extends AuditModel implements Serializable {
	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @OneToOne(cascade = CascadeType.ALL)
	    @Column(name="country_name")
	    private String name;
}
