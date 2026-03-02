package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import baub;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elbl;

public class GetCorpusStatusCall.Response extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public Status a;
    public CorpusStatus b;

    static {
        GetCorpusStatusCall.Response.CREATOR = new elbl();
    }

    public GetCorpusStatusCall.Response() {
    }

    public GetCorpusStatusCall.Response(Status status0, CorpusStatus corpusStatus0) {
        this.a = status0;
        this.b = corpusStatus0;
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
        baub.c(parcel0, v1);
    }
}

