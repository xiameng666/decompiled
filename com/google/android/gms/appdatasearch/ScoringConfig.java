package com.google.android.gms.appdatasearch;

import abws;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;

    static {
        ScoringConfig.CREATOR = new abws();
    }

    public ScoringConfig(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ScoringConfig) ? this.a == ((ScoringConfig)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

