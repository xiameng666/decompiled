package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbgb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConverterWrapper extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final StringToIntConverter b;

    static {
        ConverterWrapper.CREATOR = new bbgb();
    }

    public ConverterWrapper(int v, StringToIntConverter stringToIntConverter0) {
        this.a = v;
        this.b = stringToIntConverter0;
    }

    public ConverterWrapper(StringToIntConverter stringToIntConverter0) {
        this.a = 1;
        this.b = stringToIntConverter0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

