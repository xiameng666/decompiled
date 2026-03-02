package com.google.android.gms.auth.blockstore;

import aiob;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Deprecated
    public final Bundle a;
    public final List b;
    private final Map c;

    static {
        RetrieveBytesResponse.CREATOR = new aiob();
    }

    public RetrieveBytesResponse(Bundle bundle0, List list0) {
        this.a = bundle0;
        this.b = list0;
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.put(((RetrieveBytesResponse.BlockstoreData)object0).b, ((RetrieveBytesResponse.BlockstoreData)object0));
        }
        this.c = hashMap0;
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.c);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.g(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

