package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import ccqz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;
import java.util.Arrays;

public final class FeatureOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;

    static {
        FeatureOptInState.CREATOR = new ccqz();
    }

    public FeatureOptInState(byte[] arr_b) {
        ibuq.f(arr_b, "serializedMessage");
        super();
        this.a = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof FeatureOptInState) ? Arrays.equals(this.a, ((FeatureOptInState)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return "FeatureOptInState(serializedMessage=" + Arrays.toString(this.a) + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

