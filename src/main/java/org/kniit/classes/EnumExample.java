package org.kniit.classes;

enum DayOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    DayOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

public class EnumExample {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;

        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.ordinal());
        System.out.println(dayOfWeek.isWeekend());
    }
}

