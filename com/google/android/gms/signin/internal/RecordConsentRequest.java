package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import epuh;

public class RecordConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final Account b;
    public final Scope[] c;
    public final String d;

    static {
        RecordConsentRequest.CREATOR = new epuh();
    }

    public RecordConsentRequest(int v, Account account0, Scope[] arr_scope, String s) {
        this.a = v;
        this.b = account0;
        this.c = arr_scope;
        this.d = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.J(parcel0, 3, this.c, v);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

