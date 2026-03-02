package com.google.android.gms.lockbox.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cowg;

public class LockboxOptInFlags extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;

    static {
        LockboxOptInFlags.CREATOR = new cowg();
    }

    public LockboxOptInFlags(String s, boolean z, boolean z1) {
        this.a = s;
        this.b = z;
        this.c = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.e(parcel0, 3, this.b);
        baub.e(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

