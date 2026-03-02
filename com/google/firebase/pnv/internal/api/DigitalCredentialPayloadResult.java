package com.google.firebase.pnv.internal.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gpfx;
import ibuq;

public final class DigitalCredentialPayloadResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        DigitalCredentialPayloadResult.CREATOR = new gpfx();
    }

    public DigitalCredentialPayloadResult(String s) {
        ibuq.f(s, "digitalCredentialPayload");
        super();
        this.a = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

