package com.google.firebase.pnv.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gpfs;
import ibuq;

public final class GetDigitalCredentialPayloadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    static {
        GetDigitalCredentialPayloadRequest.CREATOR = new gpfs();
    }

    public GetDigitalCredentialPayloadRequest(String s, String s1, String s2, String s3) {
        ibuq.f(s, "appId");
        ibuq.f(s1, "apiKey");
        ibuq.f(s2, "nonce");
        ibuq.f(s3, "privacyPolicyUri");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

