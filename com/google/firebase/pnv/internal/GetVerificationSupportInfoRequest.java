package com.google.firebase.pnv.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gpft;
import ibuq;
import java.util.List;

public final class GetVerificationSupportInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        GetVerificationSupportInfoRequest.CREATOR = new gpft();
    }

    public GetVerificationSupportInfoRequest(List list0) {
        ibuq.f(list0, "simSlots");
        super();
        this.a = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.E(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

