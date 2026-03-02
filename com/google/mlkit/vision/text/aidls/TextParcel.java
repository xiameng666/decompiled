package com.google.mlkit.vision.text.aidls;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hbwt;
import java.util.List;

public class TextParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final List b;

    static {
        TextParcel.CREATOR = new hbwt();
    }

    public TextParcel(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

