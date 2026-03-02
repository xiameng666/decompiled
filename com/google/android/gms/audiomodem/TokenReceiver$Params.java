package com.google.android.gms.audiomodem;

import acpz;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TokenReceiver.Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Encoding[] a;

    static {
        TokenReceiver.Params.CREATOR = new acpz();
    }

    public TokenReceiver.Params(Encoding[] arr_encoding) {
        this.a = arr_encoding;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 2, this.a, v);
        baub.c(parcel0, v1);
    }
}

