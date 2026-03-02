package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bmks;
import bmky;

public class NfcKeyDiscoveredViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR;

    static {
        NfcKeyDiscoveredViewOptions.CREATOR = new bmks();
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bmky b() {
        return bmky.d;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof NfcKeyDiscoveredViewOptions;
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}

