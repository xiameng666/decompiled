package com.google.android.gms.reminders.model;

import android.os.Parcelable;
import bakw;

public interface Recurrence extends Parcelable, bakw {
    DailyPattern a();

    MonthlyPattern c();

    RecurrenceEnd d();

    RecurrenceStart e();

    WeeklyPattern f();

    YearlyPattern g();

    Integer h();

    Integer i();
}

