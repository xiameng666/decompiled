package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bmjk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        UvmEntries.CREATOR = new bmjk();
    }

    public UvmEntries(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof UvmEntries)) {
            return false;
        }
        List list0 = this.a;
        if(list0 == null && ((UvmEntries)object0).a == null) {
            return true;
        }
        if(list0 != null) {
            List list1 = ((UvmEntries)object0).a;
            return list1 != null && list0.containsAll(list1) && list1.containsAll(list0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? Arrays.hashCode(new Object[]{null}) : Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

