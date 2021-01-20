package com.shail.common;

import java.util.Optional;

public class NPEConcept {

	private String command;

	public NPEConcept(String command) {
		super();
		this.command = command;
	}

	public static void main(String[] a) {

		NPEConcept n = null;
		NPEConcept n1 = new NPEConcept("n1 created");
		String.valueOf(n);
		System.out.println("tes completed");
		// String.valueOf(null);
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		String nullName = "seeku";
		String name = Optional.ofNullable(nullName).orElse("john");
		NPEConcept n2 = Optional.ofNullable(n).orElse(n1);
		System.out.println(n2);
	}

	@Override
	public String toString() {
		return "NPEConcept [command=" + command + "]";
	}
	
	
}
