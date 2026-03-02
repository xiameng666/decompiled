package com.google.android.gms.autofill.data;

import amnk;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CredentialImeCacheEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final int b;

    static {
        CredentialImeCacheEntry.CREATOR = new amnk();
    }

    public CredentialImeCacheEntry(boolean z, int v) {
        this.a = z;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

