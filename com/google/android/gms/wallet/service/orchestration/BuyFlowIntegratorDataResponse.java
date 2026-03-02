package com.google.android.gms.wallet.service.orchestration;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbtm;
import fbtn;

public class BuyFlowIntegratorDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public PendingIntent d;
    public int e;

    static {
        BuyFlowIntegratorDataResponse.CREATOR = new fbtn();
    }

    BuyFlowIntegratorDataResponse() {
        this(new byte[0], new byte[0], new byte[0], null, 1);
    }

    public BuyFlowIntegratorDataResponse(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, PendingIntent pendingIntent0, int v) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
        this.d = pendingIntent0;
        this.e = v;
    }

    public static fbtm a() {
        return new fbtm(new BuyFlowIntegratorDataResponse(new byte[0], new byte[0], new byte[0], null, 1));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.o(parcel0, 5, this.e);
        baub.i(parcel0, 6, this.a, false);
        baub.c(parcel0, v1);
    }
}

