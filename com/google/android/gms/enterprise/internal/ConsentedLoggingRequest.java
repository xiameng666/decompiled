package com.google.android.gms.enterprise.internal;

import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjlu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hftc;
import hfur;
import icye;

public class ConsentedLoggingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final icye a;

    static {
        ConsentedLoggingRequest.CREATOR = new bjlu();
    }

    public ConsentedLoggingRequest(icye icye0) {
        this.a = icye0;
    }

    public ConsentedLoggingRequest(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)icye.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.a = (icye)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Failed to parse event from bytes", hfur0);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a.toBytesArray(), false);
        baub.c(parcel0, v1);
    }
}

