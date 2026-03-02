package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxuq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class ExportCredentialsToDeviceSetupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;

    static {
        ExportCredentialsToDeviceSetupResponse.CREATOR = new bxuq();
    }

    public ExportCredentialsToDeviceSetupResponse(Bundle bundle0) {
        ibuq.f(bundle0, "responseBundle");
        super();
        this.a = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.g(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

