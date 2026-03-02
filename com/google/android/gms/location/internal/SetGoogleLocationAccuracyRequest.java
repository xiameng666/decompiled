package com.google.android.gms.location.internal;

import ProtoLiteMessage;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import cnlg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import grju;
import grkh;
import grns;
import hftc;
import hfur;

public class SetGoogleLocationAccuracyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final grju b;
    public final grns c;
    public final grkh d;

    static {
        SetGoogleLocationAccuracyRequest.CREATOR = new cnlg();
    }

    public SetGoogleLocationAccuracyRequest(boolean z, int v, byte[] arr_b, byte[] arr_b1) {
        grns grns0;
        this.a = z;
        grju grju0 = grju.b(v);
        batl.s(grju0);
        this.b = grju0;
        grkh grkh0 = null;
        try {
            if(arr_b == null) {
                grns0 = null;
            }
            else {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grns.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                grns0 = (grns)hftv0;
            }
            this.c = grns0;
            if(arr_b1 != null) {
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grkh.a), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                grkh0 = (grkh)hftv1;
            }
            this.d = grkh0;
        }
        catch(hfur hfur0) {
            throw new BadParcelableException(hfur0);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b.m);
        byte[] arr_b = null;
        baub.i(parcel0, 3, (this.c == null ? null : this.c.toBytesArray()), false);
        grkh grkh0 = this.d;
        if(grkh0 != null) {
            arr_b = grkh0.toBytesArray();
        }
        baub.i(parcel0, 4, arr_b, false);
        baub.c(parcel0, v1);
    }
}

