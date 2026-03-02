package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elcq;

public class GetGlobalSearchSourcesCall.GlobalSearchSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public GetGlobalSearchSourcesCall.CorpusInfo[] i;
    public boolean j;

    static {
        GetGlobalSearchSourcesCall.GlobalSearchSource.CREATOR = new elcq();
    }

    public GetGlobalSearchSourcesCall.GlobalSearchSource() {
    }

    public GetGlobalSearchSourcesCall.GlobalSearchSource(String s, String s1, int v, int v1, int v2, String s2, String s3, String s4, GetGlobalSearchSourcesCall.CorpusInfo[] arr_getGlobalSearchSourcesCall$CorpusInfo, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = s2;
        this.g = s3;
        this.h = s4;
        this.i = arr_getGlobalSearchSourcesCall$CorpusInfo;
        this.j = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.c);
        baub.o(parcel0, 3, this.d);
        baub.o(parcel0, 4, this.e);
        baub.v(parcel0, 5, this.f, false);
        baub.v(parcel0, 6, this.g, false);
        baub.v(parcel0, 7, this.h, false);
        baub.J(parcel0, 8, this.i, v);
        baub.e(parcel0, 9, this.j);
        baub.v(parcel0, 10, this.b, false);
        baub.c(parcel0, v1);
    }
}

