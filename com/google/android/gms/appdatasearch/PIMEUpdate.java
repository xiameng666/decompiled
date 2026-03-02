package com.google.android.gms.appdatasearch;

import abvz;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PIMEUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final byte[] a;
    final byte[] b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    final Bundle g;
    public final long h;
    public final long i;
    public final Account j;

    static {
        PIMEUpdate.CREATOR = new abvz();
    }

    public PIMEUpdate(byte[] arr_b, byte[] arr_b1, int v, String s, String s1, boolean z, Bundle bundle0, long v1, long v2, Account account0) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = v;
        this.d = s;
        this.e = s1;
        this.f = z;
        this.g = bundle0;
        this.h = v1;
        this.i = v2;
        this.j = account0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.g(parcel0, 8, this.g, false);
        baub.q(parcel0, 9, this.h);
        baub.q(parcel0, 10, this.i);
        baub.t(parcel0, 11, this.j, v, false);
        baub.c(parcel0, v1);
    }
}

