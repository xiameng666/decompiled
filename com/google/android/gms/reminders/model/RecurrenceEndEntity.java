package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejuq;
import java.util.Arrays;

public class RecurrenceEndEntity extends AbstractSafeParcelable implements RecurrenceEnd {
    public static final Parcelable.Creator CREATOR;
    public final DateTimeEntity a;
    public final Integer b;
    public final Boolean c;
    public final DateTimeEntity d;

    static {
        RecurrenceEndEntity.CREATOR = new ejuq();
    }

    public RecurrenceEndEntity(DateTime dateTime0, Integer integer0, Boolean boolean0, DateTime dateTime1, boolean z) {
        DateTimeEntity dateTimeEntity0 = null;
        super();
        this.b = integer0;
        this.c = boolean0;
        if(z) {
            this.a = (DateTimeEntity)dateTime0;
            this.d = (DateTimeEntity)dateTime1;
            return;
        }
        this.a = dateTime0 == null ? null : new DateTimeEntity(dateTime0);
        if(dateTime1 != null) {
            dateTimeEntity0 = new DateTimeEntity(dateTime1);
        }
        this.d = dateTimeEntity0;
    }

    public RecurrenceEndEntity(DateTimeEntity dateTimeEntity0, Integer integer0, Boolean boolean0, DateTimeEntity dateTimeEntity1) {
        this.a = dateTimeEntity0;
        this.b = integer0;
        this.c = boolean0;
        this.d = dateTimeEntity1;
    }

    public RecurrenceEndEntity(RecurrenceEnd recurrenceEnd0) {
        this(recurrenceEnd0.c(), recurrenceEnd0.e(), recurrenceEnd0.d(), recurrenceEnd0.a(), false);
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime a() {
        return this.d;
    }

    public static int b(RecurrenceEnd recurrenceEnd0) {
        return Arrays.hashCode(new Object[]{recurrenceEnd0.c(), recurrenceEnd0.e(), recurrenceEnd0.d(), recurrenceEnd0.a()});
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final DateTime c() {
        return this.a;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Boolean d() {
        return this.c;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceEnd
    public final Integer e() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof RecurrenceEnd)) {
            return false;
        }
        return this == object0 ? true : RecurrenceEndEntity.f(this, ((RecurrenceEnd)object0));
    }

    public static boolean f(RecurrenceEnd recurrenceEnd0, RecurrenceEnd recurrenceEnd1) {
        return bata.b(recurrenceEnd0.c(), recurrenceEnd1.c()) && bata.b(recurrenceEnd0.e(), recurrenceEnd1.e()) && bata.b(recurrenceEnd0.d(), recurrenceEnd1.d()) && bata.b(recurrenceEnd0.a(), recurrenceEnd1.a());
    }

    @Override
    public final int hashCode() {
        return RecurrenceEndEntity.b(this);
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuq.a(this, parcel0, v);
    }
}

