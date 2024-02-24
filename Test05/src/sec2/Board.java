package sec2;

public class Board {
		private int bno;
		private String title;
		private String uname;
		private String content;
		private String resdate;
		private String visited;
		
		public Board() {}
		
		}
		
		
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getResdate() {
			return resdate;
		}
		public void setResdate(String resdate) {
			this.resdate = resdate;
		}
		public String getVisited() {
			return visited;
		}
		public void setVisited(String visited) {
			this.visited = visited;
		}
		@Override
		public String toString() {
			return "Board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", resdate="
					+ resdate + ", visited=" + visited + "]";
		}
		
		
}
