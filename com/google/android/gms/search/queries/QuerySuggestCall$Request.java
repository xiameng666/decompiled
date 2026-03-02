package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elez;

public class QuerySuggestCall.Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String[] c;
    public int d;
    public SuggestSpecification e;
    public Bundle f;

    static {
        QuerySuggestCall.Request.CREATOR = new elez();
    }

    public QuerySuggestCall.Request() {
    }

    public QuerySuggestCall.Request(String s, String s1, String[] arr_s, int v, SuggestSpecification suggestSpecification0, Bundle bundle0) {
        this.a = s;
        this.b = s1;
        this.c = arr_s;
        this.d = v;
        this.e = suggestSpecification0;
        this.f = bundle0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.w(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        baub.g(parcel0, 6, this.f, false);
        baub.c(parcel0, v1);
    }
}

