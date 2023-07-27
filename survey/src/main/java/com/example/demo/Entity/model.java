package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "f1")
public class model {
 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int userid;
		private String name;
		private String email;
		private long phoneno;
		private String qone;
		private String qtwo;
		private int qthree;
		private String qfour;
		private int qfive;
		private String qsix;
		private int qseven;
		private String qeight;
		private String qnine;
		private int qten;
		private String qeleven;
		
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}
		public String getQone() {
			return qone;
		}
		public void setQone(String qone) {
			this.qone = qone;
		}
		public String getQtwo() {
			return qtwo;
		}
		public void setQtwo(String qtwo) {
			this.qtwo = qtwo;
		}
		public int getQthree() {
			return qthree;
		}
		public void setQthree(int qthree) {
			this.qthree = qthree;
		}
		public String getQfour() {
			return qfour;
		}
		public void setQfour(String qfour) {
			this.qfour = qfour;
		}
		public int getQfive() {
			return qfive;
		}
		public void setQfive(int qfive) {
			this.qfive = qfive;
		}
		public String getQsix() {
			return qsix;
		}
		public void setQsix(String qsix) {
			this.qsix = qsix;
		}
		public int getQseven() {
			return qseven;
		}
		public void setQseven(int qseven) {
			this.qseven = qseven;
		}
		public String getQeight() {
			return qeight;
		}
		public void setQeight(String qeight) {
			this.qeight = qeight;
		}
		public String getQnine() {
			return qnine;
		}
		public void setQnine(String qnine) {
			this.qnine = qnine;
		}
		public int getQten() {
			return qten;
		}
		public void setQten(int qten) {
			this.qten = qten;
		}
		public String getQeleven() {
			return qeleven;
		}
		public void setQeleven(String qeleven) {
			this.qeleven = qeleven;
		}
		
		public model(int userid, String name, String email, long phoneno, String qone, String qtwo, int qthree,
				String qfour, int qfive, String qsix, int qseven, String qeight, String qnine, int qten,
				String qeleven) {
			super();
			this.userid = userid;
			this.name = name;
			this.email = email;
			this.phoneno = phoneno;
			this.qone = qone;
			this.qtwo = qtwo;
			this.qthree = qthree;
			this.qfour = qfour;
			this.qfive = qfive;
			this.qsix = qsix;
			this.qseven = qseven;
			this.qeight = qeight;
			this.qnine = qnine;
			this.qten = qten;
			this.qeleven = qeleven;
		}
		public model() {
			
		}
}