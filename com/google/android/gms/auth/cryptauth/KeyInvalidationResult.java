package com.google.android.gms.auth.cryptauth;

import ajfe;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class KeyInvalidationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final Status b;

    static {
        KeyInvalidationResult.CREATOR = new ajfe();
    }

    public KeyInvalidationResult(int v, Status status0) {
        this.a = v;
        this.b = status0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

