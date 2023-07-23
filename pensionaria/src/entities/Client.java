package entities;

public class Client {
	private int room;
	private String name;
	private String email;
	
	public Client(int room, String name, String email) {
		this.room = room;
		this.name = name;
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client [room=" + room + ", name=" + name + ", email=" + email + "]";
	}
}
