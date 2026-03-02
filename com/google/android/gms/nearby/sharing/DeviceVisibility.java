package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dbyl;
import dbym;
import java.util.Arrays;
import java.util.Locale;

public class DeviceVisibility extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR;
    public static final DeviceVisibility a;
    public static final DeviceVisibility b;
    public static final DeviceVisibility c;
    public static final DeviceVisibility d;
    public static final DeviceVisibility e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final boolean j;
    public final String k;

    static {
        dbyl dbyl0 = new dbyl();
        dbyl0.a = 3;
        DeviceVisibility.a = dbyl0.a();
        dbyl dbyl1 = new dbyl();
        dbyl1.a = 1;
        DeviceVisibility.b = dbyl1.a();
        dbyl dbyl2 = new dbyl();
        dbyl2.a = 2;
        DeviceVisibility.c = dbyl2.a();
        dbyl dbyl3 = new dbyl();
        dbyl3.a = 4;
        DeviceVisibility.d = dbyl3.a();
        dbyl dbyl4 = new dbyl();
        dbyl4.a = 0;
        DeviceVisibility.e = dbyl4.a();
        DeviceVisibility.CREATOR = new dbym();
    }

    public DeviceVisibility(int v, int v1, int v2, long v3, boolean z, String s) {
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.i = v3;
        this.j = z;
        this.k = s;
    }

    public final dbyl a() {
        dbyl dbyl0 = new dbyl();
        dbyl0.a = this.f;
        dbyl0.b = this.g;
        dbyl0.c = this.h;
        dbyl0.d = this.i;
        dbyl0.e = this.j;
        dbyl0.f = this.k;
        return dbyl0;
    }

    public final DeviceVisibility b() {
        try {
            return (DeviceVisibility)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    @Override
    public final Object clone() {
        return this.b();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof DeviceVisibility) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((DeviceVisibility)object0).f)) && bata.b(Integer.valueOf(this.g), Integer.valueOf(((DeviceVisibility)object0).g)) && bata.b(Integer.valueOf(this.h), Integer.valueOf(((DeviceVisibility)object0).h)) && bata.b(Long.valueOf(this.i), Long.valueOf(((DeviceVisibility)object0).i)) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((DeviceVisibility)object0).j)) && bata.b(this.k, ((DeviceVisibility)object0).k);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.f), ((int)this.g), ((int)this.h), ((long)this.i), Boolean.valueOf(this.j), this.k});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "DeviceVisibility<visibility: %s, previous_visibility: %s, contact_visibility_preference: %s, prefer_persistent_everyone: %s, duration_millis: %s, triggered by: %s>", ((int)this.f), ((int)this.g), ((int)this.h), Boolean.valueOf(this.j), ((long)this.i), this.k);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.f);
        baub.o(parcel0, 2, this.g);
        baub.o(parcel0, 3, this.h);
        baub.q(parcel0, 4, this.i);
        baub.e(parcel0, 5, this.j);
        baub.v(parcel0, 6, this.k, false);
        baub.c(parcel0, v1);
    }
}

