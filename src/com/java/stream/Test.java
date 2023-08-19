package com.java.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class Test {
	public static List<Integer> marks = List.of(12, 34, 6, 54, 43, 34, 22);
	public static List<Student> stdList = List.of(new Student(1, "Satya", 19), new Student(2, "Rahul", 29),
			new Student(3, "Rai", 32), new Student(4, "Patel", 24), new Student(5, "Jena", 27));

	public static void test00() {
//		Comparator<Student> comp = new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student s1, Student s2) {
//				// TODO Auto-generated method stub
//				return s1.getAge() > s2.getAge() ? 1 : -1;
//			}
//		};
		stdList.stream().sorted((s1, s2) -> s1.getAge() > s2.getAge() ? 1 : -1)
//		stdList.stream().sorted(comp)
		.forEach(System.out::println);
		marks.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + ","));
	}

	public static void test01() {
		if (stdList.stream().allMatch(std -> std.getAge() > 18)) {
			System.out.println("All Students are above 18 years age..");
		}
		if (stdList.stream().anyMatch(std -> std.getAge() > 30)) {
			System.out.println("There is a student above 30 years..");
		}
		if (stdList.stream().noneMatch(std -> std.getAge() < 18)) {
			System.out.println("No Students is below 18 years..");
		}
	}

	public static void test02() {
		Optional<Student> find01 = stdList.stream().sorted((s1, s2) -> s1.getAge() > s2.getAge() ? -1 : 1)
									.findFirst();
		Optional<Student> find02 = stdList.stream().findAny();
		System.out.println(find02.get());
	}

	public static void test03() {
		Stream<Integer> stdStream = Stream.of(12, 34, 6, 54, 43, 34, 22);
		Integer[] stdArray = (Integer[]) stdStream.toArray();
	}

	public static List<String> test04() {
		 return stdList.stream()
				.peek(std -> System.out.println(std.getName()))
				.map(std -> std.getName().toUpperCase())
				.peek(System.out::println).collect(Collectors.toList());
	}

	public static void test05() {
		stdList.stream().sorted((s1, s2) -> s1.getAge() > s2.getAge() ? 1 : -1).skip(2).forEach(System.out::println);
		Stream<Student> s = Stream.empty();
		System.out.println(s.count());
	}

	public static void test06() {
		Stream<String> stream = Stream.of("India", "China", "China", "USA");
		stream.distinct().forEach(System.out::println);
	}

	public static void test07() {
		Stream<String> s1 = Stream.of("India", "China", "China", "USA");
		Stream<String> s2 = Stream.of("Brazil", "UK", "Nepal");
		Stream.concat(s1, s2).distinct().forEach(System.out::println);
	}

	public static void test08() {
		stdList.stream().collect(Collectors.toMap(std -> std.getId(), std -> std.getName())).entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
		;
	}

	public static void test09() {
		stdList.stream().mapToInt(e -> e.getAge()).forEach(System.out::println);
	}

	public static void main(String[] args) {
		test04();
//		Student std = stdList.stream().findFirst().orElse(null);
//		System.out.println(std);
//		Student[] std = (Student[])stdList.stream().toArray();
	}
}
