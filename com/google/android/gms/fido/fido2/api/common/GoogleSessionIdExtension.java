package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bmhy;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class GoogleSessionIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;

    static {
        GoogleSessionIdExtension.CREATOR = new bmhy();
    }

    public GoogleSessionIdExtension(long v) {
        Long.valueOf(v).getClass();
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GoogleSessionIdExtension) ? this.a == ((GoogleSessionIdExtension)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

