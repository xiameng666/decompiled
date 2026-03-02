package com.google.android.gms.auth.api.fido;

import ahme;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azsu;
import azsw;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class FidoPersistentApiOptions extends AbstractSafeParcelable implements azsu, azsw {
    public static final Parcelable.Creator CREATOR;

    static {
        FidoPersistentApiOptions.CREATOR = new ahme();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof FidoPersistentApiOptions;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{FidoPersistentApiOptions.class});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}

