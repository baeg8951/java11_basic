package sec3;

public class Notice {
		
		private int bno;
		private String title;
		private String unname;
		private String content;
		private String resdate;
		private int visited;
		
		public Notice() {
			this(1);
		}
		
		public Notice(int bno) {
			this(bno,"뉴스제목");
		}
		public Notice(int bno, String title) {
			this(bno,title, "기사이름");
		}
		public Notice (int bno, String title, String unname) {
			this(bno, title, unname, "기사내용");
		}
		public Notice (int bno, String title, String unname, String content) {
			this(bno, title, unname, content, "날짜");
		}
		public Notice (int bno, String title, String unname, String content, String resdate) {
			this(bno, title, unname, content, resdate, 0);		
		}
		
		public Notice (int bno, String title, String unname, String content, String resdate, int visited) {
			this.bno = bno;
			this.title = title;
			this.unname = unname;
			this.resdate = resdate;
			this.visited = visited;
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
		public String getUnname() {
			return unname;
		}
		public void setUnname(String unname) {
			this.unname = unname;
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
		public int getVisited() {
			return visited;
		}
		public void setVisited(int visited) {
			this.visited = visited;
		}
		@Override
		public String toString() {
			return "Notice [bno=" + bno + ", title=" + title + ", unname=" + unname + ", content=" + content
					+ ", resdate=" + resdate + ", visited=" + visited + "]";
		}
		
		
		
}
