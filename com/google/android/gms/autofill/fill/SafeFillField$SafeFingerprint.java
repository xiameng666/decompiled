package com.google.android.gms.autofill.fill;

import amxo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import anig;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ghfx;

public final class SafeFillField.SafeFingerprint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final int b;

    static {
        SafeFillField.SafeFingerprint.CREATOR = new anig();
    }

    public SafeFillField.SafeFingerprint(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public static amxo a(SafeFillField.SafeFingerprint safeFillField$SafeFingerprint0) {
        return new amxo(new ghfx(safeFillField$SafeFingerprint0.a), safeFillField$SafeFingerprint0.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

