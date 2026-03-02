package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fawc;
import java.util.ArrayList;

public final class Cart extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    final ArrayList c;

    static {
        Cart.CREATOR = new fawc();
    }

    public Cart() {
        this.c = new ArrayList();
    }

    public Cart(String s, String s1, ArrayList arrayList0) {
        this.a = s;
        this.b = s1;
        this.c = arrayList0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.y(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

