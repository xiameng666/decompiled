package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbcp;
import java.util.Arrays;

public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public String d;

    static {
        ButtonOptions.CREATOR = new fbcp();
    }

    private ButtonOptions() {
    }

    public ButtonOptions(int v, int v1, int v2, String s) {
        Integer.valueOf(v).getClass();
        this.a = v;
        Integer.valueOf(v1).getClass();
        this.b = v1;
        Integer.valueOf(v2).getClass();
        this.c = v2;
        batl.s(s);
        this.d = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ButtonOptions) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((ButtonOptions)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((ButtonOptions)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((ButtonOptions)object0).c)) && bata.b(this.d, ((ButtonOptions)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

