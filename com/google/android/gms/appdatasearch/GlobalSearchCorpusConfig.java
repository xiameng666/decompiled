package com.google.android.gms.appdatasearch;

import abvv;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class GlobalSearchCorpusConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int[] a;
    public final Feature[] b;

    static {
        GlobalSearchCorpusConfig.CREATOR = new abvv();
    }

    public GlobalSearchCorpusConfig(int[] arr_v, Feature[] arr_feature) {
        this.a = arr_v;
        this.b = arr_feature;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GlobalSearchCorpusConfig) && Arrays.equals(this.b, ((GlobalSearchCorpusConfig)object0).b) && Arrays.equals(this.a, ((GlobalSearchCorpusConfig)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.p(parcel0, 1, this.a, false);
        baub.J(parcel0, 2, this.b, v);
        baub.c(parcel0, v1);
    }
}

