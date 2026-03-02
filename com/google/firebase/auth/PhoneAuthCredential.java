package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import batl;
import baub;
import gore;

public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;

    static {
        PhoneAuthCredential.CREATOR = new gore();
    }

    public PhoneAuthCredential(String s, String s1, boolean z, String s2, boolean z1, String s3, String s4) {
        batl.c(z && !TextUtils.isEmpty(s2) && TextUtils.isEmpty(s4) || z && TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s4) || !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) || !TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = s2;
        this.e = z1;
        this.f = s3;
        this.g = s4;
    }

    @Override
    public final Object clone() {
        return new PhoneAuthCredential(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.e(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.c(parcel0, v1);
    }
}

