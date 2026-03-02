package com.google.android.gms.search.global;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elcp;

public class GetGlobalSearchSourcesCall.CorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public Feature[] b;
    public boolean c;
    public Bundle d;

    static {
        GetGlobalSearchSourcesCall.CorpusInfo.CREATOR = new elcp();
    }

    public GetGlobalSearchSourcesCall.CorpusInfo() {
    }

    public GetGlobalSearchSourcesCall.CorpusInfo(String s, Feature[] arr_feature, boolean z, Bundle bundle0) {
        this.a = s;
        this.b = arr_feature;
        this.c = z;
        this.d = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.J(parcel0, 2, this.b, v);
        baub.e(parcel0, 3, this.c);
        baub.g(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

