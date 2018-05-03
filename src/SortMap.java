import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {

		Map<Employee, String> employeeMap = new HashMap<Employee, String>();
		employeeMap.put(getEmp1("Rajini", "2516563667", 2), "Rajini");
		employeeMap.put(getEmp1("Dilip", "251234273", 0), "Dilip");
		employeeMap.put(getEmp1("Rakesh", "209876787", 3), "Rakesh");
		employeeMap.put(getEmp1("amulya", "2084881006", 7), "amulya");

		System.out.println(employeeMap);
		
		

		List<Map.Entry<Employee, String>> entryList = new ArrayList<Map.Entry<Employee, String>>(
				employeeMap.entrySet());

		Collections.sort(entryList, new Comparator<Map.Entry<Employee, String>>() {
	

			@Override
			public int compare(Entry<Employee, String> integerEmployeeEntry, Entry<Employee, String> integerEmployeeEntry2) {
				// TODO Auto-generated method stub
				return integerEmployeeEntry.getKey().compareTo(integerEmployeeEntry2.getKey());
			}
		});
	
		System.out.println(entryList);
		

	}

	private static Employee getEmp1(String name, String phoneNumber, int rollNumber) {
		Employee emp = new Employee();

		emp.setName(name);
		emp.setPhoneNumber(phoneNumber);
		emp.setRollNumber(rollNumber);
		return emp;
	}

}
