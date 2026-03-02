package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.WeeklyPattern;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import ejub;
import ejuy;
import java.util.List;

public class WeeklyPatternRef extends ejub implements WeeklyPattern {
    public WeeklyPatternRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v, s);
    }

    @Override  // com.google.android.gms.reminders.model.WeeklyPattern
    public final List a() {
        return this.H(this.p("weekly_pattern_weekday"));
    }

    public static boolean c(DataHolder dataHolder0, int v, int v1, String s) {
        return dataHolder0.f(WeeklyPatternRef.G(s, "weekly_pattern_weekday"), v, v1);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof WeeklyPattern)) {
            return false;
        }
        return this == object0 ? true : WeeklyPatternEntity.c(this, ((WeeklyPattern)object0));
    }

    @Override  // bakp
    public final int hashCode() {
        return WeeklyPatternEntity.b(this);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new WeeklyPatternEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuy.a(new WeeklyPatternEntity(this), parcel0);
    }
}

