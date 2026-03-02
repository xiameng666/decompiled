package com.google.android.gms.auth.folsom;

import ajqs;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class RecoveryResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public long b;

    static {
        RecoveryResult.CREATOR = new ajqs();
    }

    public RecoveryResult() {
    }

    public RecoveryResult(int v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RecoveryResult) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((RecoveryResult)object0).a)) && bata.b(Long.valueOf(this.b), Long.valueOf(((RecoveryResult)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((long)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.q(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

