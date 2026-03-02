package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import daww;
import java.util.Arrays;

public class EncryptedIdentityMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    static {
        EncryptedIdentityMetadata.CREATOR = new daww();
    }

    public EncryptedIdentityMetadata(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof EncryptedIdentityMetadata) ? Arrays.equals(this.a, ((EncryptedIdentityMetadata)object0).a) && Arrays.equals(this.b, ((EncryptedIdentityMetadata)object0).b) && Arrays.equals(this.c, ((EncryptedIdentityMetadata)object0).c) : this == object0;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b), Arrays.hashCode(this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

