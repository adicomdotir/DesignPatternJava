public class Main {
	public static void main(String[] args) {
		// THIS EDIT BY VIM
		Student p1 = new Student();
		Student p2 = new Student();
		p2.setGrade(15.2);
		System.out.println(p1.equals(p2));
		
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}