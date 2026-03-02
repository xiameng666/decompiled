package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejug;
import java.util.Arrays;

public class DailyPatternEntity extends AbstractSafeParcelable implements DailyPattern {
    public static final Parcelable.Creator CREATOR;
    public final TimeEntity a;
    public final Integer b;
    public final Boolean c;

    static {
        DailyPatternEntity.CREATOR = new ejug();
    }

    public DailyPatternEntity(DailyPattern dailyPattern0) {
        Time time0 = dailyPattern0.a();
        Integer integer0 = dailyPattern0.d();
        Boolean boolean0 = dailyPattern0.c();
        super();
        this.b = integer0;
        this.c = boolean0;
        this.a = time0 == null ? null : new TimeEntity(time0);
    }

    public DailyPatternEntity(TimeEntity timeEntity0, Integer integer0, Boolean boolean0) {
        this.a = timeEntity0;
        this.b = integer0;
        this.c = boolean0;
    }

    @Override  // com.google.android.gms.reminders.model.DailyPattern
    public final Time a() {
        return this.a;
    }

    public static int b(DailyPattern dailyPattern0) {
        return Arrays.hashCode(new Object[]{dailyPattern0.a(), dailyPattern0.d(), dailyPattern0.c()});
    }

    @Override  // com.google.android.gms.reminders.model.DailyPattern
    public final Boolean c() {
        return this.c;
    }

    @Override  // com.google.android.gms.reminders.model.DailyPattern
    public final Integer d() {
        return this.b;
    }

    public static boolean e(DailyPattern dailyPattern0, DailyPattern dailyPattern1) {
        return bata.b(dailyPattern0.a(), dailyPattern1.a()) && bata.b(dailyPattern0.d(), dailyPattern1.d()) && bata.b(dailyPattern0.c(), dailyPattern1.c());
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof DailyPattern)) {
            return false;
        }
        return this == object0 ? true : DailyPatternEntity.e(this, ((DailyPattern)object0));
    }

    @Override
    public final int hashCode() {
        return DailyPatternEntity.b(this);
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejug.a(this, parcel0, v);
    }
}

