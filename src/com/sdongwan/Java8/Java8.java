package com.sdongwan.Java8;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author 宋东皖
 * @date 2018年8月20日 下午7:07:18
 * 
 */
public class Java8 {
	public static void main(String[] args) {
		 List<String> strings = Arrays.asList("a", "b", "c", "d");
		 strings.stream()
		 .map((str) -> str.toUpperCase())
		 .forEach(System.out::println);

		// printInfo("123", (str) -> str.length() > 2);

		// String upperCase = myToUpperCase("abcdE", (str) ->str.toUpperCase());
		// System.out.println(upperCase);

		// Consumer<String> consumer = (String str) ->
		// System.out.println(str.length());
		// consumer.accept("consumer: sdongwan");

		// Supplier<Integer> supplier = () -> Integer.MAX_VALUE;
		// System.out.println(supplier.get());

		// Function<Integer, String> function = (a) -> a + "";
		// String a = function.apply(1);
		// System.out.println(a instanceof String);

		// Predicate<String> predicate = (str) -> str.length() > 4;
		// boolean r = predicate.test("sdongwan");
		// System.out.println(r);

		Instant begin = Instant.now();

		Instant end = Instant.now();

		// System.out.println(begin);
		// System.out.println(end);

		// Instant time8 = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
		// System.out.println(time8);

		// System.out.println(begin.getEpochSecond());
		// System.out.println(begin.toEpochMilli());
		//
		// long beginSecond = begin.getEpochSecond();
		// long endSecond = end.getEpochSecond();
		// Duration duration = Duration.ofHours(8);
		// System.out.println(duration.toHours());
		// System.out.println(duration.toMinutes());
		// System.out.println(duration.toMillis());
		//
		// Duration duration2 = duration.ofSeconds(50);
		// System.out.println(duration2.getSeconds());
		//
		// LocalTime beginTime = LocalTime.now();
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// LocalTime endTime = LocalTime.now();
		// System.out.println(beginTime+" "+endTime);
		// Duration duration3 = Duration.between(beginTime, endTime);
		// System.out.println(duration3.getSeconds());

		// LocalDate beginDate = LocalDate.of(2018, 10, 16);
		// LocalDate endDate = LocalDate.of(2018, 8, 10);
		// Period period = Period.between(endDate, beginDate);
		// System.out.println(period.getMonths());
		// System.out.println(period.getYears());

		// LocalDate localDate =
		// LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		// System.out.println(localDate);
		//
		// LocalDateTime localDateTime = LocalDateTime.now();
		// System.out.println(localDateTime);
		//
		// DateTimeFormatter dateTimeFormatter =
		// DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// System.out.println(dateTimeFormatter.format(localDateTime));

		// ZonedDateTime zonedDateTime = ZonedDateTime.now();
		// System.out.println(zonedDateTime);
		// 接口中默认方法
		// System.out.println(new MyClass().getName());
		MyClass myClass = null;
		Optional<MyClass> mOptional = Optional.ofNullable(myClass);
		// System.out.println(mOptional.get());
		
		
		Optional<MyClass> pOptional = Optional.ofNullable(new MyClass("sdongwan66"));
		
		// System.out.println(pOptional.get());
		
		Optional<String> optional = pOptional.map((my) -> my.getName());
		
		MyClass my = pOptional.orElse(new MyClass("sdongwan77"));
		System.out.println(optional.get());
		System.out.println(my.getName());
//		pOptional.ifPresent(my -> {
//			System.out.println(my.getName());
//		});

	}

	public static void printInfo(String str, MyPredict mp) {
		if (mp.test(str)) {
			System.out.println("浪里个浪！" + str.length());
		}
	}

	public static String myToUpperCase(String str, MyFunc<String> mf) {
		return mf.toUppperCase(str);
	}

	@FunctionalInterface
	public interface MyPredict {
		boolean test(String str);
	}

	@FunctionalInterface
	public interface MyFunc<T> {
		public T toUppperCase(T t);
	}
}
