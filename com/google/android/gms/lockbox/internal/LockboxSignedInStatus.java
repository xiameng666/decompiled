package com.google.android.gms.lockbox.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import covf;
import cowh;

public class LockboxSignedInStatus extends AbstractSafeParcelable implements covf {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final long c;

    static {
        LockboxSignedInStatus.CREATOR = new cowh();
    }

    public LockboxSignedInStatus(String s, String s1, long v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override  // covf
    public final String b() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.q(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

