package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import ccra;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class FeatureStatusResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final FeatureOptInState a;
    public final ErrorDetails b;

    static {
        FeatureStatusResult.CREATOR = new ccra();
    }

    public FeatureStatusResult(FeatureOptInState featureOptInState0, ErrorDetails errorDetails0) {
        this.a = featureOptInState0;
        this.b = errorDetails0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FeatureStatusResult)) {
            return false;
        }
        return ibuq.m(this.a, ((FeatureStatusResult)object0).a) ? ibuq.m(this.b, ((FeatureStatusResult)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        ErrorDetails errorDetails0 = this.b;
        if(errorDetails0 != null) {
            v = errorDetails0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "FeatureStatusResult(state=" + this.a + ", details=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

