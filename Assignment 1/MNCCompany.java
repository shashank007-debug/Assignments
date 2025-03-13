class MNCCompany {
    static void hireEmployee() { 	
		System.out.println("Hiring an employee"); 
		}
    static void fireEmployee() { System.out.println("Firing an employee"); }
    static void conductMeeting() { System.out.println("Conducting a meeting"); }
    static void launchProduct() { System.out.println("Launching a new product"); }
    static void approveBudget() { System.out.println("Approving company budget"); }
    static void expandBusiness() { 
		hireEmployee();
        fireEmployee();
        conductMeeting();
        launchProduct();
        approveBudget();
		System.out.println("Expanding the business"); 
	}
    static void acquireCompany() { System.out.println("Acquiring another company"); }
    static void mergeCompanies() { System.out.println("Merging with another company"); }
    static void paySalaries() { System.out.println("Paying employee salaries"); }
    static void conductTraining() { System.out.println("Conducting employee training"); }
}