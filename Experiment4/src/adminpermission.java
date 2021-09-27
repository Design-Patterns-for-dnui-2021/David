public class adminpermission implements permission {

	@Override
	public void operatePermission() {
		System.out.println("Permission: Can control and manipulate all features");
	}

	@Override
	public void authority() {
		System.out.println("Authority: Make sure all data in the system is valid and prevent fraud");
	}

}
