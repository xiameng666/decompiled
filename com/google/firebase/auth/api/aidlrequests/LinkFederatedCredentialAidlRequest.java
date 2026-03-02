package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import goru;

public class LinkFederatedCredentialAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final VerifyAssertionRequest b;

    static {
        LinkFederatedCredentialAidlRequest.CREATOR = new goru();
    }

    public LinkFederatedCredentialAidlRequest(String s, VerifyAssertionRequest verifyAssertionRequest0) {
        this.a = s;
        this.b = verifyAssertionRequest0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

