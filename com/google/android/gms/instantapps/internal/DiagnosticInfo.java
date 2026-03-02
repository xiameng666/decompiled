package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bzvn;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DiagnosticInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final long b;
    public final int c;
    public final Account d;
    public final Account[] e;

    static {
        DiagnosticInfo.CREATOR = new bzvn();
    }

    public DiagnosticInfo(int v, long v1, int v2, Account account0, Account[] arr_account) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = account0;
        this.e = arr_account;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.q(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.t(parcel0, 5, this.d, v, false);
        baub.J(parcel0, 6, this.e, v);
        baub.c(parcel0, v1);
    }
}

