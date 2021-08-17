package learn_chainofresponsibility;

public class Program {

	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Tejaswini");
		leaveRequest.setLeaveDays(5);

		ILeaveRequestHandler supervisorHandler = new Supervisor();
		ILeaveRequestHandler projectManagerHandler = new ProjectManager();
		ILeaveRequestHandler hrHandler = new HR();

		supervisorHandler.setNext(projectManagerHandler);
		projectManagerHandler.setNext(hrHandler);

		supervisorHandler.HandleRequest(leaveRequest);

	}

}


	
