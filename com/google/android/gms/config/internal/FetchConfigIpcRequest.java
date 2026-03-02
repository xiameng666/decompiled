package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbtt;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final DataHolder c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final int h;
    public final List i;
    public final int j;
    public final int k;

    static {
        FetchConfigIpcRequest.CREATOR = new bbtt();
    }

    public FetchConfigIpcRequest(String s) {
        this(s, 43200L, null, null, null, null, null, 0, null, -1, -1);
    }

    public FetchConfigIpcRequest(String s, long v, DataHolder dataHolder0, String s1, String s2, String s3, List list0, int v1, List list1, int v2, int v3) {
        this.a = s;
        this.b = v;
        this.c = dataHolder0;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = list0;
        this.h = v1;
        this.i = list1;
        this.j = v2;
        this.k = v3;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.q(parcel0, 3, this.b);
        baub.t(parcel0, 4, this.c, v, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.x(parcel0, 8, this.g, false);
        baub.o(parcel0, 9, this.h);
        baub.y(parcel0, 10, this.i, false);
        baub.o(parcel0, 11, this.j);
        baub.o(parcel0, 12, this.k);
        baub.c(parcel0, v1);
    }
}

