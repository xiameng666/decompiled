package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdev;

public class AddAccountToConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;

    static {
        AddAccountToConsentRequest.CREATOR = new fdev();
    }

    public AddAccountToConsentRequest(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

