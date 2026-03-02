package com.google.mlkit.vision.common.aidls;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hbtq;

public class ImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    static {
        ImageMetadataParcel.CREATOR = new hbtq();
    }

    public ImageMetadataParcel(int v, int v1, int v2, int v3, long v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

