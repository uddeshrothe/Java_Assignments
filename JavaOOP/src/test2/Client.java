package test2;

abstract class Persistence {
	
	abstract public void persist();
	
}
class DatabasePersistence extends Persistence{
	DatabasePersistence(){
		System.out.println("From Database Persistence");
	}
	public void persist() {}
	
}

class FilePersistence extends Persistence{
	FilePersistence(){
		System.out.println("From File Persistence");
	}
	public void persist() {}
}



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence p = new FilePersistence();
	}

}
