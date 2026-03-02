package com.google.android.gms.clearcut.appdoctor;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aywd;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class QosTierOverrideRequestParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final long c;

    static {
        QosTierOverrideRequestParcelable.CREATOR = new aywd();
    }

    public QosTierOverrideRequestParcelable(String s, int v, long v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.q(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

