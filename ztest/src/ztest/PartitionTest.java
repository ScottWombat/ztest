package ztest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PartitionTest {
	private int weekNo;
	static Map<Integer, WeekRange> rangeMap;
	static {
		rangeMap = new HashMap<Integer, WeekRange>();
		rangeMap.put(1, new WeekRange("2015-06-01"));
		rangeMap.put(2, new WeekRange("2015-06-08"));
		rangeMap.put(3, new WeekRange("2015-06-15"));
		rangeMap.put(4, new WeekRange("2015-06-22"));
	}

	@Before
	public void init() {
		weekNo = 1;
	}

	@Test
	public void test() {
		int countRec=0;
		WeekRange weekRange=null;
		for(int i=0;i<113;i++){
			weekRange = rangeMap.get(weekNo);
			System.out.println(weekNo +":" + " recorNo:" + weekRange.getNumRecords() +":" + weekRange.getStrDate());
			if(weekNo < 4){
				if(weekRange.getNumRecords() ==20){
					weekNo++;
					
				}
			}
			weekRange.addNumRecords(1);
			/*
			if(weekRange.getNumRecords() ==20){
				
                if(weekNo <4){
                	weekNo++;
                }else{
                	weekRange.setNumRecords(0);
                }
    
			}else{
				System.out.println("DDDDDDDDD");
				if(weekNo ==4){
					weekRange.addNumRecords(1);
				}else{
				weekRange.addNumRecords(1);
				}
			}
			*/
		}
	}
}
