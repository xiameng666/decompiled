package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bzwg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OptInInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    @Deprecated
    public final Account[] c;

    static {
        OptInInfo.CREATOR = new bzwg();
    }

    public OptInInfo(int v, String s, Account[] arr_account) {
        this.a = v;
        this.b = s;
        this.c = arr_account;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.J(parcel0, 4, this.c, v);
        baub.c(parcel0, v1);
    }
}

