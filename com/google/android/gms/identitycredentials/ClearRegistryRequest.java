package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class ClearRegistryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final ClearRegistryRequest.ClearTypedRegistryOption b;

    static {
        ClearRegistryRequest.CREATOR = new bxub();
    }

    public ClearRegistryRequest() {
        this(true, null);
    }

    public ClearRegistryRequest(boolean z, ClearRegistryRequest.ClearTypedRegistryOption clearRegistryRequest$ClearTypedRegistryOption0) {
        this.a = z;
        this.b = clearRegistryRequest$ClearTypedRegistryOption0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClearRegistryRequest)) {
            return false;
        }
        return this.a == ((ClearRegistryRequest)object0).a ? ibuq.m(this.b, ((ClearRegistryRequest)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b == null ? 0 : this.b.hashCode();
        return this.a ? 0x9511 + v : 0x95CB + v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

