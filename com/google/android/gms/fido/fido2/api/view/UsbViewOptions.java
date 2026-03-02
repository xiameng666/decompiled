package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bmkw;
import bmky;

public class UsbViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR;

    static {
        UsbViewOptions.CREATOR = new bmkw();
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bmky b() {
        return bmky.k;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof UsbViewOptions;
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}

