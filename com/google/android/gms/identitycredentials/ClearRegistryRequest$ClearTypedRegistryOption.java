package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxue;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;
import java.util.List;

public final class ClearRegistryRequest.ClearTypedRegistryOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final String b;
    public final boolean c;
    public final List d;

    static {
        ClearRegistryRequest.ClearTypedRegistryOption.CREATOR = new bxue();
    }

    public ClearRegistryRequest.ClearTypedRegistryOption(boolean z, String s, boolean z1, List list0) {
        ibuq.f(s, "type");
        ibuq.f(list0, "registryIds");
        super();
        this.a = z;
        this.b = s;
        this.c = z1;
        this.d = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClearRegistryRequest.ClearTypedRegistryOption)) {
            return false;
        }
        if(this.a != ((ClearRegistryRequest.ClearTypedRegistryOption)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((ClearRegistryRequest.ClearTypedRegistryOption)object0).b)) {
            return false;
        }
        return this.c == ((ClearRegistryRequest.ClearTypedRegistryOption)object0).c ? ibuq.m(this.d, ((ClearRegistryRequest.ClearTypedRegistryOption)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (this.a ? 0x4CF : 0x4D5) * 0x1F + this.b.hashCode();
        if(this.c) {
            v = 0x4CF;
        }
        return (v1 * 0x1F + v) * 0x1F + this.d.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.x(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

