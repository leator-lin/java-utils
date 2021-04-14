package com.lea.myTimeUtils;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

/**
 * java8中新增了一个java.time包，提供了用于日期、时间、实例和周期的主要API
 * java.time包定义的类表示了日期-时间概念的规则，包括instants, durations,
 * dates, times, time-zones and periods。这些都是基于ISO日历系统，它又是遵循 Gregorian规则的。
 */
public class NewDatePackageTest {
    public void dateUitl() {
        // --------------------------------------下面是关于Clock的用法--------------------------------------
        // 获取当前Clock
        Clock clock = Clock.systemUTC();
        // 通过Clock获取当前时刻
        System.out.println("当前时刻为：" + clock.instant());
        // 获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        // --------------------------------------下面是关于Duration的用法--------------------------------------
        Duration d = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + d.toMinutes() + "分");
        System.out.println("6000秒相当于" + d.toHours() + "小时");
        System.out.println("6000秒相当于" + d.toDays() + "天");
        // 在clock基础上增加6000秒，返回新的Clock
        Clock clock2 = Clock.offset(clock, d);
        // 可看到clock2与clock1相差1小时40分
        System.out.println("当前时刻加6000秒为：" + clock2.instant());

        // --------------------------------------下面是关于Instant的用法--------------------------------------
        // 获取当前时间
        Instant instant = Instant.now();
        System.out.println(instant);
        // instant添加6000秒（即100分钟），返回新的Instant
        Instant instant2 = instant.plusSeconds(6000);
        System.out.println(instant2);
        // 根据字符串中解析Instant对象
        Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
        System.out.println(instant3);
        // 在instant3的基础上添加5小时4分钟
        Instant instant4 = instant3.plus(Duration
                .ofHours(5).plusMinutes(4));
        System.out.println(instant4);
        // 获取instant4的5天以前的时刻
        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);

        // --------------------------------------下面是关于LocalDate的用法--------------------------------------
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // 获取今年的天数
        int daysOfThisYear = LocalDate.now().lengthOfYear();
        System.out.println(LocalDate.of(2011, 1, 1).lengthOfYear());

        // 获得2014年的第146天
        localDate = LocalDate.ofYearDay(2014, 146);
        System.out.println(localDate); // 2014-05-26
        // 设置为2014年5月21日
        localDate = LocalDate.of(2014, Month.MAY, 21);
        System.out.println(localDate); // 2014-05-21

        // --------------------------------------下面是关于LocalTime的用法--------------------------------------
        // 获取当前时间
        LocalTime localTime = LocalTime.now();
        // 设置为22点33分
        localTime = LocalTime.of(22, 33);
        System.out.println(localTime); // 22:33
        // 返回一天中的第5503秒
        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime); // 01:31:43

        // --------------------------------------下面是关于localDateTime的用法--------------------------------------
        // 获取当前日期、时间，格式为：2020-09-23T16:37:35.617，(后面的.617表示毫秒值的最后三位,使用.withNano(0)可把毫秒值设为0)，1 秒 = 1000000000纳秒
        LocalDateTime localDateTime = LocalDateTime.now();
        // 当前日期、时间加上25小时３分钟
        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println("当前日期、时间的25小时3分之后：" + future);
        // 下面是关于Year、YearMonth、MonthDay的用法示例-----
        Year year = Year.now(); // 获取当前的年份
        System.out.println("当前年份：" + year); // 输出当前年份
        year = year.plusYears(5); // 当前年份再加5年
        System.out.println("当前年份再过5年：" + year);
        // 根据指定月份获取YearMonth
        YearMonth ym = year.atMonth(10);
        System.out.println("year年10月：" + ym); // 输出XXXX-10，XXXX代表当前年份
        // 当前年月再加5年，减3个月
        ym = ym.plusYears(5).minusMonths(3);
        System.out.println("year年10月再加5年、减3个月：" + ym);
        MonthDay md = MonthDay.now();
        System.out.println("当前月日：" + md); // 输出--XX-XX，代表几月几日
        // 设置为5月23日
        MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
        System.out.println("5月23日为：" + md2); // 输出--05-23

        // ZoneId.systemDefault()获取系统默认时区
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant instant1 = zonedDateTime.toInstant();
    }

    public static void main(String[] args) {
        // 获取当前时间
//		Date date = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
//		Instant instant = new Date().toInstant();
//		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
//		String timeStr = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//
//		LocalDateTime localDateTime1 = LocalDateTime.parse(timeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).plus(-7, ChronoUnit.DAYS);
//		Date newDate = Date.from(localDateTime1.atZone(ZoneId.systemDefault()).toInstant());
//		System.out.println(newDate);

//		System.out.println(LocalDate.of(2000, 1, 1).lengthOfYear());

//        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
//        System.out.println("localDateTime---------------" + localDateTime);
//        LocalDate localDate = LocalDate.now();
//        System.out.println("localDate---------------" + localDate);
//        LocalTime localTime = LocalTime.now();
//        System.out.println("localTime---------------" + localTime);

        List<Integer> list0 = new ArrayList<Integer>();
        long start0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list0.add(i);
        }
        System.out.println(System.currentTimeMillis() - start0);

        long start1 = System.currentTimeMillis();
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 10000000; i < 20000000; i++) {
            list1.add(i);
        }
        System.out.println(System.currentTimeMillis() - start1);
    }
}