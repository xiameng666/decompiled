package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Time;
import com.google.android.gms.reminders.model.TimeEntity;
import ejub;
import ejux;

public class TimeRef extends ejub implements Time {
    public TimeRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v, s);
    }

    @Override  // com.google.android.gms.reminders.model.Time
    public final Integer a() {
        return this.n(this.p("hour"));
    }

    @Override  // com.google.android.gms.reminders.model.Time
    public final Integer c() {
        return this.n(this.p("minute"));
    }

    @Override  // com.google.android.gms.reminders.model.Time
    public final Integer d() {
        return this.n(this.p("second"));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static boolean e(DataHolder dataHolder0, int v, int v1, String s) {
        return dataHolder0.f(TimeRef.G(s, "hour"), v, v1) && dataHolder0.f(TimeRef.G(s, "minute"), v, v1) && dataHolder0.f(TimeRef.G(s, "second"), v, v1);
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof Time)) {
            return false;
        }
        return this == object0 ? true : TimeEntity.e(this, ((Time)object0));
    }

    @Override  // bakp
    public final int hashCode() {
        return TimeEntity.b(this);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new TimeEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejux.a(new TimeEntity(this), parcel0);
    }
}

