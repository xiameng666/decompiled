package com.google.android.gms.wallet.service.orchestration;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbtk;
import fbtl;

public class BuyFlowIntegratorDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public String d;
    public Bundle e;

    static {
        BuyFlowIntegratorDataRequest.CREATOR = new fbtl();
    }

    BuyFlowIntegratorDataRequest() {
        this(new byte[0], new byte[0], new byte[0], null, Bundle.EMPTY);
    }

    public BuyFlowIntegratorDataRequest(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, String s, Bundle bundle0) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
        this.d = s;
        this.e = bundle0;
    }

    public static fbtk a() {
        return new fbtk(new BuyFlowIntegratorDataRequest(new byte[0], new byte[0], new byte[0], null, Bundle.EMPTY));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.a, false);
        baub.i(parcel0, 3, this.b, false);
        baub.i(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.g(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

