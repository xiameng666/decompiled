package com.google.android.gms.appdatasearch;

import abxb;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SuggestSpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        SuggestSpecification.CREATOR = new abxb();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        baub.c(parcel0, baub.a(parcel0));
    }
}

