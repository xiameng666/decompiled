package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dldb;
import java.util.Arrays;

public class EmoneyReadiness extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        EmoneyReadiness.CREATOR = new dldb();
    }

    public EmoneyReadiness(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof EmoneyReadiness) ? bata.b(Integer.valueOf(this.a), Integer.valueOf(((EmoneyReadiness)object0).a)) : false;
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

