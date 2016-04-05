package com.epr.sol.fin;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DeDup {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
	public int[] resultIntegers = null; 
	
	/**
	 * convert integer Array to a List
	 * 
	 * @param int []
	 * @return List<Integer>
	 */
	private List<Integer> convertArrayToList(int[] randomIntegers) {
		List<Integer> integersAsList = new ArrayList<Integer>();

		for (int element : randomIntegers) {
			integersAsList.add(element);
		}
		return integersAsList;
	}

	/**
	 * convert integer List to LinkedHashSet(and maintains insertion order)
	 * which does not contain duplicates.
	 * 
	 * @param List<Integer>
	 * @return Set<Integer>
	 */
	private Set<Integer> convertListToSet(List<Integer> listWithDuplicates) {
		Set<Integer> integersAsSet = new LinkedHashSet<Integer>(listWithDuplicates);
		return integersAsSet;
	}

	/**
	 * Convert resulting set to an array 
	 * @param Set<Integer>
	 * @return int []
	 */
	private int[] convertSetToArray(Set<Integer> noDuplicateSet) {
		resultIntegers = new int[noDuplicateSet.size()];
		int index = 0;		
		for (Integer element : noDuplicateSet) {
			resultIntegers[index++] = element;
		}
		return resultIntegers;
	}

	public static void main(String[] args) {
		DeDup dedup = new DeDup();
		
		List<Integer> duplicateIntegers = dedup.convertArrayToList(dedup.randomIntegers);
		Set<Integer> noDupIntWithInsertionOrder = dedup.convertListToSet(duplicateIntegers);
		
		//final result array with no duplicates and maintaining  insertion order. 
		dedup.convertSetToArray(noDupIntWithInsertionOrder);			
	}
}
