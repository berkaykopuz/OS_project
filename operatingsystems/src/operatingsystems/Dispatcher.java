package operatingsystems;

import java.util.LinkedList;
import java.util.Queue;

public class Dispatcher {
	private Queue<Process>[] queues;
	private int q;
	
	public Dispatcher() {
		this.queues = new Queue[4]; //4 priority level
		
		for(int i = 0; i < 4; i++) {
			this.queues[i] = new LinkedList<>();
		}
		
		this.q = 1; //quantization 1 second
	}
	
	public void processAdd(Process process) {
		queues[process.priority].add(process);
	}
	
	public void simulate() {
		
	}
}
