package potluck.domain;

public class Tag {
	private int tagID;
	private String tagText;
	public Tag(){
		
	}
	public  Tag(int id, String tagText) {
		this.tagID=id;
		this.tagText=tagText;
		
	}
	public int getTagID() {
		return tagID;
	}
	public void setTagID(int tagID) {
		this.tagID = tagID;
	}
	public String getTagText() {
		return tagText;
	}
	public void setTagText(String tagText) {
		this.tagText = tagText;
	}
	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(tagID);
		sb.append(". "+tagText+"; ");
		return sb.toString();
	}

}
