package com.google.android.gms.auth.api.proxy;

import aidf;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte[] e;
    public final Bundle f;

    static {
        ProxyRequest.CREATOR = new aidf();
    }

    public ProxyRequest(int v, String s, int v1, long v2, byte[] arr_b, Bundle bundle0) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = arr_b;
        this.f = bundle0;
    }

    @Override
    public final String toString() {
        return "ProxyRequest[ url: " + this.b + ", method: " + this.c + " ]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.b, false);
        baub.o(parcel0, 2, this.c);
        baub.q(parcel0, 3, this.d);
        baub.i(parcel0, 4, this.e, false);
        baub.g(parcel0, 5, this.f, false);
        baub.o(parcel0, 1000, this.a);
        baub.c(parcel0, v1);
    }
}

