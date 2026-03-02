package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbjr;

public class GetSaveInstrumentDetailsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public long b;

    static {
        GetSaveInstrumentDetailsRequest.CREATOR = new fbjr();
    }

    public GetSaveInstrumentDetailsRequest() {
    }

    public GetSaveInstrumentDetailsRequest(String s, long v) {
        this.a = s;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

