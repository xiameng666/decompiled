package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cras;
import java.util.Arrays;

public final class SignedPublicKey extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;

    static {
        SignedPublicKey.CREATOR = new cras();
    }

    public SignedPublicKey(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SignedPublicKey) ? Arrays.equals(this.a, ((SignedPublicKey)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return "SignedPublicKey{publicKey=" + Arrays.toString(this.a) + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

