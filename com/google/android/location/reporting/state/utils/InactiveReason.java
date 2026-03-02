package com.google.android.location.reporting.state.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fxul;
import j..util.Objects;

public class InactiveReason extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int[] a;
    public final int b;
    public final String c;

    static {
        InactiveReason.a = new int[]{13, 3, 5, 7, 11, 12, 14, 6, 10};
        InactiveReason.CREATOR = new fxul();
    }

    public InactiveReason(int v, String s) {
        this.b = v;
        batl.t(s, "missing name");
        this.c = s;
    }

    public static boolean a(Iterable iterable0, int v) {
        for(Object object0: iterable0) {
            if(((InactiveReason)object0).b == v) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InactiveReason) ? this.b == ((InactiveReason)object0).b && this.c.equals(((InactiveReason)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.b), this.c});
    }

    @Override
    public final String toString() {
        return "InactiveReason{mIdentifier=" + this.b + ", mName=\'" + this.c + "\'}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

