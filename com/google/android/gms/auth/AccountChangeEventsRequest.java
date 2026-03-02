package com.google.android.gms.auth;

import acrq;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public int b;
    @Deprecated
    public String c;
    Account d;

    static {
        AccountChangeEventsRequest.CREATOR = new acrq();
    }

    public AccountChangeEventsRequest() {
        this.a = 1;
    }

    public AccountChangeEventsRequest(int v, int v1, String s, Account account0) {
        this.a = v;
        this.b = v1;
        this.c = s;
        if(account0 == null && !TextUtils.isEmpty(s)) {
            this.d = new Account(s, "com.google");
            return;
        }
        this.d = account0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

