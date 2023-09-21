package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static List<Integer> marks = List.of(12, 34, 6, 54, 43, 34, 22);
	public static List<Student> stdList = List.of(new Student(1, "Satya", 19), new Student(2, "Rahul", 19),
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
		Optional<Student> find01 = stdList.stream().sorted((s1, s2) -> s1.getAge() > s2.getAge() ? -1 : 1).findFirst();
		Optional<Student> find02 = stdList.stream().findAny();
		System.out.println(find02.get());
	}

	public static void test03() {
		Stream<Integer> stdStream = Stream.of(12, 34, 6, 54, 43, 34, 22);
		Integer[] ar = {};
		Stream<Integer> stdStream2 = Arrays.stream(ar);
		Integer[] stdArray = (Integer[]) stdStream.toArray();
	}

	public static List<String> test04() {
		return stdList.stream().peek(std -> System.out.println(std.getName())).map(std -> std.getName().toUpperCase())
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

	public static void test10() {
//		Map<Integer, List<Student>> sMap = 
		Map<Integer, Long> sMap = stdList.stream()
				.collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));
		System.out.println(sMap);

		Map<Integer, Double> result = stdList.stream()
				.collect(Collectors.groupingBy(std -> std.getAge(), Collectors.averagingInt(std -> std.getAge())));
		System.out.println(result);
		Student std = stdList.parallelStream().collect(Collectors.maxBy((s1, s2) -> s1.getAge() > s2.getAge() ? 1 : -1))
				.orElse(null);
		System.out.println(std);
		stdList.stream().max(Comparator.comparing(Student::getAge)).get();
	}

	public static void test11() {
		IntStream.range(0, 10).forEach(n -> {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
		});
	}

	public static void test12() {
//		Student std = stdList.stream().findFirst().orElse(null);
//		System.out.println(std);
//		Student[] std = (Student[]) stdList.stream().toArray();

		stdList.stream().filter(std -> std.getAge() > 15).sorted(Comparator.comparing(std -> std.getAge()))
				.forEach(System.out::println);
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Satya");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		int x = Stream.of(1, 2, 3, 4).reduce(10, (a, b) -> a + b);
		System.out.println(x);
	}

	public boolean test(Student std) {
		return std.getAge() > 18;
	}

	public static void main(String[] args) {

//		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//		System.out.println(new ArrayList<Integer>(Arrays.asList()));
//		stdList = stdList.stream().map(std->{std.setName("****");return std;})
//						.collect(Collectors.toList());
//		System.out.println(stdList);
		test11();
	}
}
