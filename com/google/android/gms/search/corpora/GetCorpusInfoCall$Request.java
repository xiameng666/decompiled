package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elbh;

public class GetCorpusInfoCall.Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;

    static {
        GetCorpusInfoCall.Request.CREATOR = new elbh();
    }

    public GetCorpusInfoCall.Request() {
    }

    public GetCorpusInfoCall.Request(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

