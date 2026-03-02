package com.google.android.gms.auth.blockstore;

import aioa;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public class RetrieveBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    private final List b;

    static {
        RetrieveBytesRequest.CREATOR = new aioa();
    }

    public RetrieveBytesRequest(List list0, boolean z) {
        boolean z1 = true;
        super();
        if(z) {
            if(list0 != null && !list0.isEmpty()) {
                z1 = false;
            }
            batl.m(z1, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.a = z;
        this.b = new ArrayList();
        if(list0 != null) {
            for(Object object0: list0) {
                batl.r(((String)object0), "Element in keys cannot be null or empty");
                this.b.add(((String)object0));
            }
        }
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a(), false);
        baub.e(parcel0, 2, this.a);
        baub.c(parcel0, v1);
    }
}

