package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azdh;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class LogVerifierResultParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;

    static {
        LogVerifierResultParcelable.CREATOR = new azdh();
    }

    public LogVerifierResultParcelable(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof LogVerifierResultParcelable) && this.a == ((LogVerifierResultParcelable)object0).a;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override
    public final String toString() {
        return "LogVerifierResultParcelable[" + this.a + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

