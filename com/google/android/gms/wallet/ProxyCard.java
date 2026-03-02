package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import faxk;

@Deprecated
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    final String b;
    final int c;
    final int d;

    static {
        ProxyCard.CREATOR = new faxk();
    }

    public ProxyCard(String s, String s1, int v, int v1) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.c(parcel0, v1);
    }
}

