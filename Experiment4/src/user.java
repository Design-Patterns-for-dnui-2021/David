public class user {
	private String name;
	private int accountNo;
	private int level;
	
	user(String name, int accountNo, int level) {
		this.name = name;
		this.accountNo = accountNo;
		this.level = level;
	}
	
	permission login(permissionfactory factory) {
		System.out.println("Account Name: " + name);
		System.out.println("Account No: " + accountNo);
                if (level == 1) {
                    	System.out.println("Staff");

                }
                else if(level == 2){
                        System.out.println("Admin");
                }
		System.out.println("Permission Level: " + level);
		return factory.getPermission(level);
	}
	
	int getLevel() {
		return this.level;
	}
}