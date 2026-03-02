package com.google.android.gms.fido.credentialstore;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bmcr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class KeyMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Bitmap e;

    static {
        KeyMetadata.CREATOR = new bmcr();
    }

    public KeyMetadata(byte[] arr_b, String s, String s1, boolean z, Bitmap bitmap0) {
        batl.c(arr_b != null && s != null && s1 != null, "Parameters cannot be null");
        this.a = arr_b;
        this.b = s;
        this.c = s1;
        this.d = z;
        this.e = bitmap0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.e(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        baub.c(parcel0, v1);
    }
}

