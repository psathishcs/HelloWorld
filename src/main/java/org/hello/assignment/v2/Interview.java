package org.hello.assignment.v2;

import java.util.*;

public class Interview {
	Map<String, Integer> stateCounts;
	Map<String, String> stateNames;
	List<InputData> inputList;
	
	public Interview() {
		stateCounts = new HashMap<>();
		stateNames = new HashMap<>();
		inputList = Arrays.asList(InputData.values());
	}
	
	public enum InputData {
		NY("New York", "John Jones", "Madonna"),
		TX("Texas", "Mary Jane Smith", "Sue Reed","Tim Oscar Steele"),
		KY("Kentucky", "Mark Anthony Lewis");
		String stateName;
		List<String> inputList;
		
		private InputData(String stateName, String... inputList) {
			this.stateName = stateName;
			this.inputList = Arrays.asList(inputList);
		}
		
		public String getStateName(){
			return stateName;
		}
		
		public List<String> getInputList() {
			return inputList;
		}

		public static List<String> getStateCds(){
			List<String> stateCds = null;
			InputData[] inputDatas = InputData.values();
			if (inputDatas.length >= 1){
				stateCds = new ArrayList<>();
				for (InputData inputData : inputDatas){
					stateCds.add(inputData.toString());
				}
			}
			return stateCds;
		}
		public static Comparator<InputData> comparator = new Comparator<InputData>() {
		      public int compare(InputData inputdata1, InputData inputdata2) {
		    	  return inputdata2.inputList.size() - inputdata1.inputList.size();
		      }
	    }; 

	}
	public void loadInput() {
		for (InputData inputData : inputList){
			stateCounts.put(inputData.toString(), inputData.getInputList().size());
			stateNames.put(inputData.toString(), inputData.getStateName());
		}
		Collections.sort(inputList, InputData.comparator );
	}
	
	public String printInterview(){
		StringBuilder sb = new StringBuilder();
		for (InputData inputData : inputList){
			sb.append(stateNames.get(inputData.toString()));
			sb.append("(").append(stateCounts.get(inputData.toString())).append(")\n");
			for (String name: inputData.getInputList()){
				sb.append("\t").append(name).append("\n");
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args){
		Interview interview = new Interview();
		interview.loadInput();
		System.out.println(interview.printInterview());
	}
}
