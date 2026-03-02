package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bmkv;
import bmky;

public class RequestValidationViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR;

    static {
        RequestValidationViewOptions.CREATOR = new bmkv();
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bmky b() {
        return bmky.o;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof RequestValidationViewOptions;
    }

    @Override  // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}

