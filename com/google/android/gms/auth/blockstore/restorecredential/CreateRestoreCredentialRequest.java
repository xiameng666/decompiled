package com.google.android.gms.auth.blockstore.restorecredential;

import airv;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class CreateRestoreCredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;

    static {
        CreateRestoreCredentialRequest.CREATOR = new airv();
    }

    public CreateRestoreCredentialRequest(Bundle bundle0) {
        ibuq.f(bundle0, "requestBundle");
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

