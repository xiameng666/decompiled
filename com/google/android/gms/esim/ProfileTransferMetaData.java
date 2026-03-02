package com.google.android.gms.esim;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjpc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ProfileTransferMetaData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    @Deprecated
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final long i;
    @Deprecated
    public final String j;
    @Deprecated
    public final String k;
    @Deprecated
    public final int l;
    public final String m;
    public final boolean n;
    public final String o;
    public final String p;
    @Deprecated
    public final String q;
    public final int r;
    public final CarrierInfo s;

    static {
        ProfileTransferMetaData.CREATOR = new bjpc();
    }

    public ProfileTransferMetaData(int v, String s, int v1, String s1, String s2, long v2, String s3, String s4, long v3, String s5, String s6, int v4, String s7, boolean z, String s8, String s9, String s10, int v5, CarrierInfo carrierInfo0) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = s2;
        this.f = v2;
        this.g = s3;
        this.h = s4;
        this.i = v3;
        this.j = s5;
        this.k = s6;
        this.l = v4;
        this.m = s7;
        this.n = z;
        this.o = s8;
        this.p = s9;
        this.q = s10;
        this.r = v5;
        this.s = carrierInfo0;
    }

    @Override
    public final String toString() {
        return "ProfileTransferMetaData: [transferType: " + this.a + ", profileActivationCode:" + this.b + ", transferFailureType:" + this.c + ", transferFailureReason:" + this.d + ", esFqdn:" + this.e + ", activationCodeExpiryTimeMillis:" + this.f + ", carrierApp:" + this.g + ", tokenExpiryTimeMillis:" + this.i + ", carrierContact:" + this.j + ", carrierContactUrl:" + this.k + ", retry511Limit:" + this.l + ", errorText: " + this.m + ", isDelayedDownload: " + this.n + ", userInput: " + this.o + ", userAccepted: " + this.p + ", smdpFqdn: " + this.q + ", errorCode: " + this.r + ", carrierInfo: " + this.s + " ]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.q(parcel0, 6, this.f);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.q(parcel0, 9, this.i);
        baub.v(parcel0, 10, this.j, false);
        baub.v(parcel0, 11, this.k, false);
        baub.o(parcel0, 12, this.l);
        baub.v(parcel0, 13, this.m, false);
        baub.e(parcel0, 14, this.n);
        baub.v(parcel0, 15, this.o, false);
        baub.v(parcel0, 16, this.p, false);
        baub.v(parcel0, 17, this.q, false);
        baub.o(parcel0, 18, this.r);
        baub.t(parcel0, 19, this.s, v, false);
        baub.c(parcel0, v1);
    }
}

