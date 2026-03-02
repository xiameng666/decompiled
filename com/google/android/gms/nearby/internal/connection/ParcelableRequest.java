package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czhm;
import java.util.Arrays;

public final class ParcelableRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public long a;
    public Uri b;
    public String c;

    static {
        ParcelableRequest.CREATOR = new czhm();
    }

    public ParcelableRequest() {
    }

    public ParcelableRequest(long v, Uri uri0, String s) {
        this.a = v;
        this.b = uri0;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ParcelableRequest) && bata.b(Long.valueOf(this.a), Long.valueOf(((ParcelableRequest)object0).a)) && bata.b(this.b, ((ParcelableRequest)object0).b) && bata.b(this.c, ((ParcelableRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

