package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejui;
import java.util.Arrays;

public class DateTimeEntity extends AbstractSafeParcelable implements DateTime {
    public static final Parcelable.Creator CREATOR;
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final TimeEntity d;
    public final Integer e;
    public final Integer f;
    public final Long g;
    public final Boolean h;
    public final Boolean i;

    static {
        DateTimeEntity.CREATOR = new ejui();
    }

    public DateTimeEntity(DateTime dateTime0) {
        this(dateTime0.i(), dateTime0.g(), dateTime0.f(), dateTime0.a(), dateTime0.h(), dateTime0.e(), dateTime0.j(), dateTime0.d(), dateTime0.c(), false);
    }

    public DateTimeEntity(Integer integer0, Integer integer1, Integer integer2, Time time0, Integer integer3, Integer integer4, Long long0, Boolean boolean0, Boolean boolean1, boolean z) {
        this.a = integer0;
        this.b = integer1;
        this.c = integer2;
        this.e = integer3;
        this.f = integer4;
        this.g = long0;
        this.h = boolean0;
        this.i = boolean1;
        if(z) {
            this.d = (TimeEntity)time0;
            return;
        }
        this.d = time0 == null ? null : new TimeEntity(time0);
    }

    public DateTimeEntity(Integer integer0, Integer integer1, Integer integer2, TimeEntity timeEntity0, Integer integer3, Integer integer4, Long long0, Boolean boolean0, Boolean boolean1) {
        this.a = integer0;
        this.b = integer1;
        this.c = integer2;
        this.d = timeEntity0;
        this.e = integer3;
        this.f = integer4;
        this.g = long0;
        this.h = boolean0;
        this.i = boolean1;
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Time a() {
        return this.d;
    }

    public static int b(DateTime dateTime0) {
        return Arrays.hashCode(new Object[]{dateTime0.i(), dateTime0.g(), dateTime0.f(), dateTime0.a(), dateTime0.h(), dateTime0.e(), dateTime0.j(), dateTime0.d(), dateTime0.c()});
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Boolean c() {
        return this.i;
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Boolean d() {
        return this.h;
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Integer e() {
        return this.f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof DateTime)) {
            return false;
        }
        return this == object0 ? true : DateTimeEntity.k(this, ((DateTime)object0));
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Integer f() {
        return this.c;
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Integer g() {
        return this.b;
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Integer h() {
        return this.e;
    }

    @Override
    public final int hashCode() {
        return DateTimeEntity.b(this);
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Integer i() {
        return this.a;
    }

    @Override  // com.google.android.gms.reminders.model.DateTime
    public final Long j() {
        return this.g;
    }

    public static boolean k(DateTime dateTime0, DateTime dateTime1) {
        return bata.b(dateTime0.i(), dateTime1.i()) && bata.b(dateTime0.g(), dateTime1.g()) && bata.b(dateTime0.f(), dateTime1.f()) && bata.b(dateTime0.a(), dateTime1.a()) && bata.b(dateTime0.h(), dateTime1.h()) && bata.b(dateTime0.e(), dateTime1.e()) && bata.b(dateTime0.j(), dateTime1.j()) && bata.b(dateTime0.d(), dateTime1.d()) && bata.b(dateTime0.c(), dateTime1.c());
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejui.a(this, parcel0, v);
    }
}

