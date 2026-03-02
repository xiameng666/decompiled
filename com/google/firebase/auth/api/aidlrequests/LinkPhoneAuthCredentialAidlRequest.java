package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import gorv;

public class LinkPhoneAuthCredentialAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final PhoneAuthCredential b;

    static {
        LinkPhoneAuthCredentialAidlRequest.CREATOR = new gorv();
    }

    public LinkPhoneAuthCredentialAidlRequest(String s, PhoneAuthCredential phoneAuthCredential0) {
        this.a = s;
        this.b = phoneAuthCredential0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

