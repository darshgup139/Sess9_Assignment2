import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sess9_Assigmnt2 {
	public static void main(String[] args) {
		List<Integer> duplicateList = new ArrayList<Integer>();
		List<Integer> withoutDuplicateList = new ArrayList<Integer>();
		duplicateList.add(1);
		duplicateList.add(1);
		duplicateList.add(2);
		duplicateList.add(3);
		duplicateList.add(2);
		duplicateList.add(4);
		duplicateList.add(3);
		duplicateList.add(4);

		System.out.print("Collection with duplicates: ");
		for (Integer i : duplicateList)
			System.out.print(i + " ");
		System.out.println();

		for (Integer i : duplicateList) {
			if (!withoutDuplicateList.contains(i)) {
				withoutDuplicateList.add(i);
			}
		}

		System.out.print("Collection without duplicates(Using another ArrayList): ");
		for (Integer i : withoutDuplicateList)
			System.out.print(i + " ");
		System.out.println();

		Set<Integer> withoutDuplicateSet = new LinkedHashSet<Integer>(duplicateList);
		System.out.print("Collection without duplicates(Using HashSet): ");
		for (Integer i : withoutDuplicateSet)
			System.out.print(i + " ");
	}
}

/*
 ******************************************************************************
Output:
Collection with duplicates: 1 1 2 3 2 4 3 4 
Collection without duplicates(Using another ArrayList): 1 2 3 4 
Collection without duplicates(Using HashSet): 1 2 3 4 
 ******************************************************************************
 */