package com.google.location.nearby.direct.client.internal;

import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gyhu;
import gyja;
import hftc;
import hfur;

public class OperationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final byte[] a;
    public final gyhu b;

    static {
        OperationResponse.CREATOR = new gyja();
    }

    public OperationResponse(gyhu gyhu0) {
        this.b = gyhu0;
        this.a = gyhu0.toBytesArray();
    }

    public OperationResponse(byte[] arr_b) {
        this.a = arr_b;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyhu.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.b = (gyhu)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Invalid proto bytes", hfur0);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

