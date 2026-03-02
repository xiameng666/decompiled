package com.google.android.gms.appdatasearch;

import abvq;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GetRecentContextCall.Response extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public Status a;
    public List b;
    @Deprecated
    public String[] c;

    static {
        GetRecentContextCall.Response.CREATOR = new abvq();
    }

    public GetRecentContextCall.Response() {
    }

    public GetRecentContextCall.Response(Status status0, List list0, String[] arr_s) {
        this.a = status0;
        this.b = list0;
        this.c = arr_s;
    }

    @Override  // azuj
    public final Status a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.y(parcel0, 2, this.b, false);
        baub.w(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

