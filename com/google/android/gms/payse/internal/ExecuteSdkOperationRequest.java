package com.google.android.gms.payse.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import efnn;

public class ExecuteSdkOperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final int b;
    public final SecureElementStoredValue c;
    public final String d;
    final long e;

    static {
        ExecuteSdkOperationRequest.CREATOR = new efnn();
    }

    public ExecuteSdkOperationRequest(Account account0, int v, SecureElementStoredValue secureElementStoredValue0, String s, long v1) {
        this.b = v;
        this.c = secureElementStoredValue0;
        this.a = account0;
        this.d = s;
        this.e = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.v(parcel0, 4, this.d, false);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

