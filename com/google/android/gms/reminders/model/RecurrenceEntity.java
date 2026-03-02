package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejup;
import java.util.Arrays;

public class RecurrenceEntity extends AbstractSafeParcelable implements Recurrence {
    public static final Parcelable.Creator CREATOR;
    public final Integer a;
    public final Integer b;
    public final RecurrenceStartEntity c;
    public final RecurrenceEndEntity d;
    public final DailyPatternEntity e;
    public final WeeklyPatternEntity f;
    public final MonthlyPatternEntity g;
    public final YearlyPatternEntity h;

    static {
        RecurrenceEntity.CREATOR = new ejup();
    }

    public RecurrenceEntity(Recurrence recurrence0) {
        this(recurrence0.i(), recurrence0.h(), recurrence0.e(), recurrence0.d(), recurrence0.a(), recurrence0.f(), recurrence0.c(), recurrence0.g(), false);
    }

    public RecurrenceEntity(Integer integer0, Integer integer1, RecurrenceStart recurrenceStart0, RecurrenceEnd recurrenceEnd0, DailyPattern dailyPattern0, WeeklyPattern weeklyPattern0, MonthlyPattern monthlyPattern0, YearlyPattern yearlyPattern0, boolean z) {
        YearlyPatternEntity yearlyPatternEntity0 = null;
        super();
        this.a = integer0;
        this.b = integer1;
        if(z) {
            this.c = (RecurrenceStartEntity)recurrenceStart0;
            this.d = (RecurrenceEndEntity)recurrenceEnd0;
            this.e = (DailyPatternEntity)dailyPattern0;
            this.f = (WeeklyPatternEntity)weeklyPattern0;
            this.g = (MonthlyPatternEntity)monthlyPattern0;
            this.h = (YearlyPatternEntity)yearlyPattern0;
            return;
        }
        this.c = recurrenceStart0 == null ? null : new RecurrenceStartEntity(recurrenceStart0);
        this.d = recurrenceEnd0 == null ? null : new RecurrenceEndEntity(recurrenceEnd0);
        this.e = dailyPattern0 == null ? null : new DailyPatternEntity(dailyPattern0);
        this.f = weeklyPattern0 == null ? null : new WeeklyPatternEntity(weeklyPattern0);
        this.g = monthlyPattern0 == null ? null : new MonthlyPatternEntity(monthlyPattern0);
        if(yearlyPattern0 != null) {
            yearlyPatternEntity0 = new YearlyPatternEntity(yearlyPattern0);
        }
        this.h = yearlyPatternEntity0;
    }

    public RecurrenceEntity(Integer integer0, Integer integer1, RecurrenceStartEntity recurrenceStartEntity0, RecurrenceEndEntity recurrenceEndEntity0, DailyPatternEntity dailyPatternEntity0, WeeklyPatternEntity weeklyPatternEntity0, MonthlyPatternEntity monthlyPatternEntity0, YearlyPatternEntity yearlyPatternEntity0) {
        this.a = integer0;
        this.b = integer1;
        this.c = recurrenceStartEntity0;
        this.d = recurrenceEndEntity0;
        this.e = dailyPatternEntity0;
        this.f = weeklyPatternEntity0;
        this.g = monthlyPatternEntity0;
        this.h = yearlyPatternEntity0;
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final DailyPattern a() {
        return this.e;
    }

    public static int b(Recurrence recurrence0) {
        return Arrays.hashCode(new Object[]{recurrence0.i(), recurrence0.h(), recurrence0.e(), recurrence0.d(), recurrence0.a(), recurrence0.f(), recurrence0.c(), recurrence0.g()});
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final MonthlyPattern c() {
        return this.g;
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final RecurrenceEnd d() {
        return this.d;
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final RecurrenceStart e() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof Recurrence)) {
            return false;
        }
        return this == object0 ? true : RecurrenceEntity.j(this, ((Recurrence)object0));
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final WeeklyPattern f() {
        return this.f;
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final YearlyPattern g() {
        return this.h;
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final Integer h() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return RecurrenceEntity.b(this);
    }

    @Override  // com.google.android.gms.reminders.model.Recurrence
    public final Integer i() {
        return this.a;
    }

    public static boolean j(Recurrence recurrence0, Recurrence recurrence1) {
        return bata.b(recurrence0.i(), recurrence1.i()) && bata.b(recurrence0.h(), recurrence1.h()) && bata.b(recurrence0.e(), recurrence1.e()) && bata.b(recurrence0.d(), recurrence1.d()) && bata.b(recurrence0.a(), recurrence1.a()) && bata.b(recurrence0.f(), recurrence1.f()) && bata.b(recurrence0.c(), recurrence1.c()) && bata.b(recurrence0.g(), recurrence1.g());
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejup.a(this, parcel0, v);
    }
}

