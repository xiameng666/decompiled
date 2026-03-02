package com.google.android.gms.esim;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjos;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class EsimTransferExceptionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;

    static {
        EsimTransferExceptionInfo.CREATOR = new bjos();
    }

    public EsimTransferExceptionInfo(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override
    public final String toString() {
        return "EsimTransferExceptionInfo{errorCode=" + this.a + ", description=" + this.b + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

