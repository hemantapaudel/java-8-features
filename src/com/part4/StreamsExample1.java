package com.part4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.*;

import com.common.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), new Person("Lewis",
						"Carroll", 42), new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45), new Person("Matthew",
						"Arnold", 39));

		people.stream().filter(p -> p.getLastName().startsWith("C"))
				.forEach(p -> System.out.println(p.getFirstName()));

		long count = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("D")).count();

		System.out.println(count);

		// sort base on age

		List<Person> sortedPeople = people.stream()
				.sorted(Comparator.comparing(p -> p.getFirstName()))
				.collect(toList());

		List<String> firstNames = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("D"))
				.map(p -> p.getFirstName()).collect(toList());

		firstNames.forEach(System.out::println);

	}

}
