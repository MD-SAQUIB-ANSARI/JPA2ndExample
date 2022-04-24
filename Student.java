package com.mypack.employe;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="shishodiya sir")
@Table(name="shishodiya sir" uniqueCinstraint=@uniqueCinstraint(columName="id ")
// 
//Programming Galaxy you tub
//this is use for choice table name 
//agar hme by defult tabke name chahiye to @table nhi alge 
//ga sir @enentiy se kam ch jayga
//or tabel bane ga clas k name se hi student 
//columeko unique banae k liye dublicate value nhi lega kicicko vhi bana sakte hain
// @Genratedvalue IT USE for AUTO genrate value in table 102,103,104.
public class Student {

	   @Id
	   @SequenceGenerator(name="" SequenceName="")//id ko apne se lega 1 se bad mai add jo hoga
	   @Genratedvalue(stratgy=Genrationtype.AUTO)//isko phir hata denge @squence ko lagne kbad
	    private int id;  
	    private String name;  
	    private long fees;  
	
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

		public long getFees() {
			return fees;
		}

		public void setFees(long fees) {
			this.fees = fees;
		}

	public Student() {
		
	}

}
