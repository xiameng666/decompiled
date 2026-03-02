package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import gorp;

public final class FinalizeMfaEnrollmentAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PhoneAuthCredential a;
    public final String b;
    public final String c;

    static {
        FinalizeMfaEnrollmentAidlRequest.CREATOR = new gorp();
    }

    public FinalizeMfaEnrollmentAidlRequest(PhoneAuthCredential phoneAuthCredential0, String s, String s1) {
        this.a = phoneAuthCredential0;
        this.b = s;
        this.c = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

