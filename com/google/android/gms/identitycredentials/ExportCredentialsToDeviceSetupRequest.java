package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxup;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class ExportCredentialsToDeviceSetupRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Uri a;
    public final Bundle b;

    static {
        ExportCredentialsToDeviceSetupRequest.CREATOR = new bxup();
    }

    public ExportCredentialsToDeviceSetupRequest(Uri uri0, Bundle bundle0) {
        ibuq.f(uri0, "uri");
        ibuq.f(bundle0, "requestData");
        super();
        this.a = uri0;
        this.b = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.g(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

