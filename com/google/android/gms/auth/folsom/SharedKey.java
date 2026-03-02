package com.google.android.gms.auth.folsom;

import ajqu;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class SharedKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final byte[] b;

    static {
        SharedKey.CREATOR = new ajqu();
    }

    public SharedKey(int v, byte[] arr_b) {
        batl.t(arr_b, "keyMaterial cannot be null");
        this.a = v;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SharedKey) && this.a == ((SharedKey)object0).a && Arrays.equals(this.b, ((SharedKey)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

