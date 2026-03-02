package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bmho;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CableAuthenticationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        CableAuthenticationExtension.CREATOR = new bmho();
    }

    public CableAuthenticationExtension(List list0) {
        batl.s(list0);
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof CableAuthenticationExtension)) {
            return false;
        }
        List list0 = ((CableAuthenticationExtension)object0).a;
        return this.a.containsAll(list0) && list0.containsAll(this.a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

