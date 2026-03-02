package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxul;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;
import java.util.List;

public final class CredentialInformationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        CredentialInformationRequest.CREATOR = new bxul();
    }

    public CredentialInformationRequest(List list0) {
        ibuq.f(list0, "packageNames");
        super();
        this.a = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

