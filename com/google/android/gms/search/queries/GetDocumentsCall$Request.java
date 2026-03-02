package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elem;

public class GetDocumentsCall.Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String[] c;
    public QuerySpecification d;
    public Bundle e;

    static {
        GetDocumentsCall.Request.CREATOR = new elem();
    }

    public GetDocumentsCall.Request() {
    }

    public GetDocumentsCall.Request(String s, String s1, String[] arr_s, QuerySpecification querySpecification0, Bundle bundle0) {
        this.a = s;
        this.b = s1;
        this.c = arr_s;
        this.d = querySpecification0;
        this.e = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.w(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.g(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

