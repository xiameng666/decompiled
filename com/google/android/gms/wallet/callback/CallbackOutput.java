package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bauc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbdh;
import fbdi;

public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public byte[] c;
    public String d;

    static {
        CallbackOutput.CREATOR = new fbdi();
    }

    private CallbackOutput() {
    }

    public CallbackOutput(int v, int v1, byte[] arr_b, String s) {
        this.a = v;
        this.b = v1;
        this.c = arr_b;
        this.d = s;
    }

    public final AbstractSafeParcelable a(Parcelable.Creator parcelable$Creator0) {
        return this.c == null ? null : ((AbstractSafeParcelable)bauc.a(this.c, parcelable$Creator0));
    }

    public static fbdh b() {
        return new fbdh(new CallbackOutput());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.i(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

