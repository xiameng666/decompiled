package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eley;

public class QueryCall.Response extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public Status a;
    public SearchResults b;
    public Bundle c;

    static {
        QueryCall.Response.CREATOR = new eley();
    }

    public QueryCall.Response() {
    }

    public QueryCall.Response(Status status0, SearchResults searchResults0, Bundle bundle0) {
        this.a = status0;
        this.b = searchResults0;
        this.c = bundle0;
    }

    @Override  // azuj
    public final Status a() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.g(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

