package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.RecurrenceEnd;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import ejub;
import ejuq;

public class RecurrenceEndRef extends ejub implements RecurrenceEnd {
    private boolean f;
    private DateTimeRef g;
    private boolean h;
    private DateTimeRef i;

    public RecurrenceEndRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v, s);
        this.f = false;
        this.h = false;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime a() {
        if(!this.h) {
            this.h = true;
            DataHolder dataHolder0 = this.a;
            String s = this.d;
            if(DateTimeRef.k(dataHolder0, this.b, this.e, s + "recurrence_end_auto_renew_until_")) {
                this.i = null;
                return this.i;
            }
            this.i = new DateTimeRef(dataHolder0, this.b, s + "recurrence_end_auto_renew_until_");
        }
        return this.i;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime c() {
        if(!this.f) {
            this.f = true;
            DataHolder dataHolder0 = this.a;
            String s = this.d;
            if(DateTimeRef.k(dataHolder0, this.b, this.e, s + "recurrence_end_")) {
                this.g = null;
                return this.g;
            }
            this.g = new DateTimeRef(dataHolder0, this.b, s + "recurrence_end_");
        }
        return this.g;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Boolean d() {
        return Boolean.valueOf(this.t(this.p("recurrence_end_auto_renew")));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Integer e() {
        return this.n(this.p("recurrence_end_num_occurrences"));
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof RecurrenceEnd)) {
            return false;
        }
        return this == object0 ? true : RecurrenceEndEntity.f(this, ((RecurrenceEnd)object0));
    }

    public static boolean f(DataHolder dataHolder0, int v, int v1, String s) {
        return DateTimeRef.k(dataHolder0, v, v1, s + "recurrence_end_") && dataHolder0.f(RecurrenceEndRef.G(s, "recurrence_end_num_occurrences"), v, v1) && dataHolder0.f(RecurrenceEndRef.G(s, "recurrence_end_auto_renew"), v, v1) && DateTimeRef.k(dataHolder0, v, v1, s + "recurrence_end_auto_renew_until_");
    }

    @Override  // bakp
    public final int hashCode() {
        return RecurrenceEndEntity.b(this);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new RecurrenceEndEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuq.a(new RecurrenceEndEntity(this), parcel0, v);
    }
}

