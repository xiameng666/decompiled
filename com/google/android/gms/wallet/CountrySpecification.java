package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fawd;

@Deprecated
public class CountrySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;

    static {
        CountrySpecification.CREATOR = new fawd();
    }

    public CountrySpecification(String s) {
        this.a = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.c(parcel0, v1);
    }
}

