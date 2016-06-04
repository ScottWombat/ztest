package ztest;

public class WeekRange {
	private int numRecords;
	public int getNumRecords() {
		return numRecords;
	}

    public void addNumRecords(int numRecords){
    	this.numRecords = this.numRecords + numRecords;
    }
	public void setNumRecords(int numRecords) {
		this.numRecords = numRecords;
	}

	private String strDate;
	
	public WeekRange(String strDate){
		this.strDate = strDate;
	}

	
	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	
}
