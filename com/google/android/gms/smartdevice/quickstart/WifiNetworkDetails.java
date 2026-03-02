package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eqzt;

public class WifiNetworkDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    static {
        WifiNetworkDetails.CREATOR = new eqzt();
    }

    public WifiNetworkDetails(String s, String s1, String s2, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.e(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

