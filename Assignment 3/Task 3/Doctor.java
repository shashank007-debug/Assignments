class Doctor{
	static void treatment(String patientName, int age){
		System.out.println("Running treatment in Doctor");
		System.out.println("Patient Name :"+patientName+" Age :"+age);
		Nurse.assist(patientName);
	}
}