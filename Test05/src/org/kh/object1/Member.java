package org.kh.object1;

public class Member {
		String id;
		int pw;
		String email;
		String birth;
		int tel;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getPw() {
			return pw;
		}
		public void setPw(int pw) {
			this.pw = pw;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public int getTel() {
			return tel;
		}
		public void setTel(int tel) {
			this.tel = tel;
		}
		@Override
		public String toString() {
			return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
		}
		

	
}
