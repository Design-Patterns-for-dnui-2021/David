public class main {
	public static void main(String[] args) {
		user adminUser = new user("Dapid", 1, 1);
                user adminUser1 = new user("Ken", 2,1 );
		user staffUser = new user("Saddo", 3, 2);
		permission perm;
		permissionfactory factory = new oapermissionfactory();
		
		perm = adminUser.login(factory);
		perm.operatePermission();
		perm.authority();
		
		System.out.println("");
                
                perm = adminUser1.login(factory);
		perm.operatePermission();
		perm.authority();
		
		System.out.println("");
		
		perm = staffUser.login(factory);
		perm.operatePermission();
		perm.authority();
	}
}
