package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import favb;

public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    static {
        FrameMetadataParcel.CREATOR = new favb();
    }

    public FrameMetadataParcel() {
    }

    public FrameMetadataParcel(int v, int v1, int v2, long v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.q(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

