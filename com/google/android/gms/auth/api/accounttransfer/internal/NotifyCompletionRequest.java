package com.google.android.gms.auth.api.accounttransfer.internal;

import adus;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class NotifyCompletionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;

    static {
        NotifyCompletionRequest.CREATOR = new adus();
    }

    public NotifyCompletionRequest(String s, int v) {
        batl.s(s);
        this.a = s;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, 1);
        baub.v(parcel0, 2, this.a, false);
        baub.o(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

