package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fyjc;
import fyjp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class Month implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    private String g;

    static {
        Month.CREATOR = new fyjc();
    }

    private Month(Calendar calendar0) {
        calendar0.set(5, 1);
        Calendar calendar1 = fyjp.c(calendar0);
        this.a = calendar1;
        this.b = calendar1.get(2);
        this.c = calendar1.get(1);
        this.d = calendar1.getMaximum(7);
        this.e = calendar1.getActualMaximum(5);
        this.f = calendar1.getTimeInMillis();
    }

    public final int a(Month month0) {
        return this.a.compareTo(month0.a);
    }

    public final int b(Month month0) {
        if((this.a instanceof GregorianCalendar)) {
            return (month0.c - this.c) * 12 + (month0.b - this.b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final long c(int v) {
        Calendar calendar0 = fyjp.c(this.a);
        calendar0.set(5, v);
        return calendar0.getTimeInMillis();
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((Month)object0));
    }

    public static Month d(long v) {
        Calendar calendar0 = fyjp.e();
        calendar0.setTimeInMillis(v);
        return new Month(calendar0);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static Month e(int v, int v1) {
        Calendar calendar0 = fyjp.e();
        calendar0.set(1, v);
        calendar0.set(2, v1);
        return new Month(calendar0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof Month) ? this.b == ((Month)object0).b && this.c == ((Month)object0).c : false;
    }

    public static Month f() {
        return new Month(fyjp.d());
    }

    public final Month g(int v) {
        Calendar calendar0 = fyjp.c(this.a);
        calendar0.add(2, v);
        return new Month(calendar0);
    }

    public final String h() {
        if(this.g == null) {
            long v = this.a.getTimeInMillis();
            this.g = fyjp.b("yMMMM", Locale.getDefault()).format(new Date(v));
        }
        return this.g;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.b), ((int)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.b);
    }
}

