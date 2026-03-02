package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ewrf;
import ewrg;
import j..util.Objects;

public final class TelephoneNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;

    static {
        TelephoneNumber.CREATOR = new ewrg();
    }

    public TelephoneNumber(String s, int v) {
        this.a = s != null && !s.trim().isEmpty() ? s.trim() : null;
        this.b = v;
    }

    public final ewrf a() {
        ewrf[] arr_ewrf = ewrf.values();
        return arr_ewrf[this.b];
    }

    public static TelephoneNumber b(String s) {
        return new TelephoneNumber(s, ewrf.c.ordinal());
    }

    public static TelephoneNumber c(String s) {
        return new TelephoneNumber(s, ewrf.b.ordinal());
    }

    public static TelephoneNumber d(String s) {
        return new TelephoneNumber(s, ewrf.d.ordinal());
    }

    public static TelephoneNumber e(String s) {
        return new TelephoneNumber(s, ewrf.f.ordinal());
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Objects.equals(this.a, ((TelephoneNumber)object0).a) && this.b == ((TelephoneNumber)object0).b;
    }

    public static TelephoneNumber f(String s) {
        return new TelephoneNumber(s, ewrf.e.ordinal());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.a());
        return "{Number=" + this.a + ", Source=" + s + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

