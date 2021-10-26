/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment6;

/**
 *
 * @author Dvd
 */
public class Output {
	private int id;
	private String name;
	private int priority;
	
	public Output(int id, String name, int priority) {
		this.id = id;
		this.name = name;
		this.priority = priority;
	}
	
	public void Info() {
		System.out.println("ID: " + id);
		System.out.println("Document: " + name);
		System.out.println("Priority: " + priority);
		System.out.println("----------------------------");
	}
	
	public int getId() {
		return id;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
}
