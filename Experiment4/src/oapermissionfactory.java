public class oapermissionfactory implements permissionfactory {

	@Override
	public permission getPermission(int level) {
		switch (level) {
			case 1:
				return new adminpermission();
			case 2:
				return new staffpermission();
			default: 
				throw new Error("Invalid permission level");
		}
	}
	
}
