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
import java.util.ArrayList;
import java.util.Optional;

public class PrintPool {
	private ArrayList<Output> tasks = new ArrayList<>();
	private static PrintPool instance;
	
	private PrintPool() {}
	
	public static PrintPool getInstance() {
		if (instance == null) {
			instance = new PrintPool();
		} else {
			throw new Error("Print Pool already instantiated!");
		}
		return instance;
	}
	
	public void input(int no, String name, int priority) {
		tasks.add(new Output(no, name, priority));
	}
	public void changeprio(int id, int priority) {
		Optional<Output> task = tasks.stream().filter((item) -> item.getId() == id).findFirst();
		if (task.isPresent()) {
			int index = tasks.indexOf(task.get());
			task.get().setPriority(priority);
			tasks.set(index, task.get());
		}
	}
	
	public void abort(int id) {
		Optional<Output> task = tasks.stream().filter((item) -> item.getId() == id).findFirst();
		if (task.isPresent()) {
			tasks.remove(task.get());
		}
	}
	public void show() {
		tasks.forEach((item) -> item.Info());
	}
}