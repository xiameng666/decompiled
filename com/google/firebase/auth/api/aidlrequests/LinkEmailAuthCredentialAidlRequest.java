package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gort;

public class LinkEmailAuthCredentialAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;

    static {
        LinkEmailAuthCredentialAidlRequest.CREATOR = new gort();
    }

    public LinkEmailAuthCredentialAidlRequest(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

