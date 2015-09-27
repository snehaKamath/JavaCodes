import java.util.Arrays;

public class passengerQueue {

	private String[] passengerArray;

	private int queueSize;

	private int front, rear, numberOfPassengers = 0;

	passengerQueue(int size) {

		queueSize = size;

		passengerArray = new String[size];

		Arrays.fill(passengerArray, "-1");
	}

	public void enterQueue(String passenger) {
		if (rear + 1 <= queueSize) {
			passengerArray[rear] = passenger;
			rear++;
			numberOfPassengers++;

			System.out.println(passenger + " entered the queue");

		} else {
			System.out.println("Passenger queue is full");

		}
	}

	public void leaveQueue() {

		if (numberOfPassengers > 0) {
			System.out.println(passengerArray[front] + " left the queue");
			passengerArray[front] = "-1";
			front++;
			numberOfPassengers--;

		} else {
			System.out.println("Passenger queue is empty");
		}
	}

	public void printPassengersInQueue() {

		System.out.println("Passengers currently in queue:");
		for (int i = front; i < rear; i++) {
			System.out.println(passengerArray[i]);
		}
	}

	public static void main(String args[]) {

		passengerQueue pq = new passengerQueue(5);
		pq.enterQueue("passenger1");
		pq.enterQueue("passenger2");
		pq.leaveQueue();
		pq.leaveQueue();
		pq.leaveQueue();
		pq.enterQueue("passenger3");
		pq.enterQueue("passenger4");
		pq.enterQueue("passenger5");
		pq.printPassengersInQueue();

	}

}