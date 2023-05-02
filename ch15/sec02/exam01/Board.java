package ch15.sec02.exam01;

//게시판
public class Board {
	//필드
	private String subject;
	private String content;
	private String writer;
	
	//생성자
	public Board(String subject, String content, String writer) {
		this.subject = subject; 
		this.content = content;
		this.writer = writer;
	}

	//getter, setter 메소드
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
