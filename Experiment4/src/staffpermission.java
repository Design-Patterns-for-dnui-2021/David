public class staffpermission implements permission {

	@Override
	public void operatePermission() {
		System.out.println("Permission: Can only see and control limited features");
	}

	@Override
	public void authority() {
		System.out.println("Authority: Manage and control limited data in the system");
	}

}
