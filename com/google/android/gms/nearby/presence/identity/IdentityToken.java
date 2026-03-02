package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dawz;
import java.util.Arrays;

public class IdentityToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final byte[] b;

    static {
        IdentityToken.CREATOR = new dawz();
    }

    public IdentityToken(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 14) {
            throw new IllegalArgumentException("v0 identity token size is 14");
        }
        if(arr_b1.length != 16) {
            throw new IllegalArgumentException("v1 identity token size is 16");
        }
        this.a = arr_b;
        this.b = arr_b1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof IdentityToken) && Arrays.equals(this.a, ((IdentityToken)object0).a) && Arrays.equals(this.b, ((IdentityToken)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

