package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxvk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class SignalCredentialStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final Bundle c;

    static {
        SignalCredentialStateRequest.CREATOR = new bxvk();
    }

    public SignalCredentialStateRequest(String s, String s1, Bundle bundle0) {
        ibuq.f(s, "type");
        ibuq.f(bundle0, "requestData");
        super();
        this.a = s;
        this.b = s1;
        this.c = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.g(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

