package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etsj;
import java.util.Arrays;

public final class WalletCardIntentExtra extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public String c;
    public byte[] d;
    public boolean e;
    public int f;
    public long g;

    static {
        WalletCardIntentExtra.CREATOR = new etsj();
    }

    public WalletCardIntentExtra() {
    }

    public WalletCardIntentExtra(String s, int v, String s1, byte[] arr_b, boolean z, int v1, long v2) {
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = arr_b;
        this.e = z;
        this.f = v1;
        this.g = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof WalletCardIntentExtra) && bata.b(this.a, ((WalletCardIntentExtra)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((WalletCardIntentExtra)object0).b)) && bata.b(this.c, ((WalletCardIntentExtra)object0).c) && Arrays.equals(this.d, ((WalletCardIntentExtra)object0).d) && bata.b(Boolean.valueOf(this.e), Boolean.valueOf(((WalletCardIntentExtra)object0).e)) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((WalletCardIntentExtra)object0).f)) && bata.b(Long.valueOf(this.g), Long.valueOf(((WalletCardIntentExtra)object0).g));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c, Arrays.hashCode(this.d), Boolean.valueOf(this.e), ((int)this.f), ((long)this.g)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.i(parcel0, 4, this.d, false);
        baub.e(parcel0, 5, this.e);
        baub.o(parcel0, 6, this.f);
        baub.q(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

