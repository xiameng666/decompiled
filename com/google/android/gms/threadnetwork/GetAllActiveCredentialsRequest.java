package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evvy;
import java.util.Arrays;

public final class GetAllActiveCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final Long b;
    public final ThreadNetworkClientOptions c;

    static {
        GetAllActiveCredentialsRequest.CREATOR = new evvy();
    }

    public GetAllActiveCredentialsRequest(long v, Long long0, ThreadNetworkClientOptions threadNetworkClientOptions0) {
        this.a = v;
        this.b = long0;
        this.c = threadNetworkClientOptions0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetAllActiveCredentialsRequest) ? this.a == ((GetAllActiveCredentialsRequest)object0).a && bata.b(this.b, ((GetAllActiveCredentialsRequest)object0).b) && bata.b(this.c, ((GetAllActiveCredentialsRequest)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.I(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

