package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elcs;

public class GetGlobalSearchSourcesCall.Response extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public Status a;
    public GetGlobalSearchSourcesCall.GlobalSearchSource[] b;

    static {
        GetGlobalSearchSourcesCall.Response.CREATOR = new elcs();
    }

    public GetGlobalSearchSourcesCall.Response() {
    }

    public GetGlobalSearchSourcesCall.Response(Status status0, GetGlobalSearchSourcesCall.GlobalSearchSource[] arr_getGlobalSearchSourcesCall$GlobalSearchSource) {
        this.a = status0;
        this.b = arr_getGlobalSearchSourcesCall$GlobalSearchSource;
    }

    @Override  // azuj
    public final Status a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.J(parcel0, 2, this.b, v);
        baub.c(parcel0, v1);
    }
}

