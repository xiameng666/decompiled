package com.google.android.gms.thunderbird.state;

import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjky;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ewqr;
import hftc;
import java.util.Arrays;

public class AeiState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;

    static {
        AeiState.CREATOR = new ewqr();
    }

    public AeiState(byte[] arr_b) {
        this.a = arr_b;
    }

    public final bjky a() {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)bjky.a), this.a, 0, this.a.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (bjky)hftv0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof AeiState) ? Arrays.equals(this.a, ((AeiState)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

