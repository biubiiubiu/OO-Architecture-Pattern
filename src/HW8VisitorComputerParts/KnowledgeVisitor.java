package HW8VisitorComputerParts;

public class KnowledgeVisitor implements Visitor {

	private String knowledge;
	private String allOders=" ";
	
	@Override
	public void visitComputerCase(ComputerCase e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitPowerSupply(PowerSupply e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitMotherboard(Motherboard e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitMicroprocessor(Microprocessor e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitMemory(Memory e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitDriveController(DriveController e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitHardDiskDrive(HardDiskDrive e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitCDDrive(CDDrive e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitDVDDevice(DVDDevice e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitMonitor(Monitor e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitKeyboard(Keyboard e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitMouse(Mouse e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitFan(Fan e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}

	@Override
	public void visitVideoCard(VideoCard e) {
		// TODO Auto-generated method stub
		knowledge = e.getKnowledge();
		allOders = allOders + "\n " + knowledge;
	}
	
	public String getKnowledge(String partName) {
		   return knowledge;
		}

		public String printKnowledge(){
		   return allOders;
		}

}
