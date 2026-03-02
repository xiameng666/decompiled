package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import csno;
import java.util.Arrays;

public final class ServiceType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;

    static {
        ServiceType.CREATOR = new csno();
    }

    public ServiceType() {
    }

    public ServiceType(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ServiceType) ? bata.b(Integer.valueOf(this.a), Integer.valueOf(((ServiceType)object0).a)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

