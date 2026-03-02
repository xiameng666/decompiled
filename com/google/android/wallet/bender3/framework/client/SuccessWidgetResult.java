package com.google.android.wallet.bender3.framework.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gaur;

public class SuccessWidgetResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public ParcelableKeyValue[] e;
    public byte[] f;

    static {
        SuccessWidgetResult.CREATOR = new gaur();
    }

    public SuccessWidgetResult() {
        this.a = new byte[0];
        this.b = new byte[0];
        this.c = new byte[0];
        this.d = new byte[0];
        this.e = new ParcelableKeyValue[0];
    }

    public SuccessWidgetResult(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, ParcelableKeyValue[] arr_parcelableKeyValue, byte[] arr_b4) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
        this.d = arr_b3;
        this.e = arr_parcelableKeyValue;
        this.f = arr_b4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.i(parcel0, 4, this.d, false);
        baub.J(parcel0, 5, this.e, v);
        baub.i(parcel0, 6, this.f, false);
        baub.c(parcel0, v1);
    }
}

