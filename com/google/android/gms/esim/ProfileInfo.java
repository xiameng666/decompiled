package com.google.android.gms.esim;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjox;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ProfileInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final byte k;

    static {
        ProfileInfo.CREATOR = new bjox();
    }

    public ProfileInfo(String s, int v, int v1, int v2, String s1, String s2, int v3, String s3, String s4, int v4, byte b) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = s1;
        this.f = s2;
        this.g = v3;
        this.h = s3;
        this.i = s4;
        this.j = v4;
        this.k = b;
    }

    @Override
    public final String toString() {
        return "ProfileInfo: [profileIccId: " + this.a + ", profileClass:" + this.b + ", profileType:" + this.c + ", profileState:" + this.d + ", profileNickName:" + this.e + ", profileMsisdn:" + this.f + ", carrierId:" + this.g + ", carrierName:" + this.h + ", icon:" + this.i + ", subscriptionId:" + this.j + ", userPreferencesBitmask:" + ((int)this.k) + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.o(parcel0, 10, this.j);
        baub.h(parcel0, 11, this.k);
        baub.c(parcel0, v1);
    }
}

