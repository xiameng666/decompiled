package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elbq;

public class RequestIndexingCall.Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public long c;

    static {
        RequestIndexingCall.Request.CREATOR = new elbq();
    }

    public RequestIndexingCall.Request() {
    }

    public RequestIndexingCall.Request(String s, String s1, long v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

