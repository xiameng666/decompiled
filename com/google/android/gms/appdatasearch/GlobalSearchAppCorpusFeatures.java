package com.google.android.gms.appdatasearch;

import abvr;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GlobalSearchAppCorpusFeatures extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    final Feature[] b;

    static {
        GlobalSearchAppCorpusFeatures.CREATOR = new abvr();
    }

    public GlobalSearchAppCorpusFeatures(String s, Feature[] arr_feature) {
        this.a = s;
        this.b = arr_feature;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.J(parcel0, 2, this.b, v);
        baub.c(parcel0, v1);
    }
}

