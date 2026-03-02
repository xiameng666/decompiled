package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eqzv;

public class WifiTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final WifiNetworkDetails a;

    static {
        WifiTransferResult.CREATOR = new eqzv();
    }

    public WifiTransferResult(WifiNetworkDetails wifiNetworkDetails0) {
        this.a = wifiNetworkDetails0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

