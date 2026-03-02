package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejuy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeeklyPatternEntity extends AbstractSafeParcelable implements WeeklyPattern {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        WeeklyPatternEntity.CREATOR = new ejuy();
    }

    public WeeklyPatternEntity(WeeklyPattern weeklyPattern0) {
        List list0 = weeklyPattern0.a();
        super();
        this.a = list0 == null ? null : new ArrayList(list0);
    }

    public WeeklyPatternEntity(List list0) {
        this.a = list0;
    }

    @Override  // com.google.android.gms.reminders.model.WeeklyPattern
    public final List a() {
        return this.a;
    }

    public static int b(WeeklyPattern weeklyPattern0) {
        return Arrays.hashCode(new Object[]{weeklyPattern0.a()});
    }

    public static boolean c(WeeklyPattern weeklyPattern0, WeeklyPattern weeklyPattern1) {
        return bata.b(weeklyPattern0.a(), weeklyPattern1.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof WeeklyPattern)) {
            return false;
        }
        return this == object0 ? true : WeeklyPatternEntity.c(this, ((WeeklyPattern)object0));
    }

    @Override
    public final int hashCode() {
        return WeeklyPatternEntity.b(this);
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuy.a(this, parcel0);
    }
}

