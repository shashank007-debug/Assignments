class Hospital{
	static void checkup(String patientName, int age, long mobile, String email, String sicknes){
		System.out.println("Running checkup in Hospital");
		System.out.println("Patient Name :"+patientName+" Age:"+age+" Mobile No :"+mobile+" Email :"+email+" Sickness"+sicknes);
		Doctor.treatment(patientName,age);
		
	} 
}