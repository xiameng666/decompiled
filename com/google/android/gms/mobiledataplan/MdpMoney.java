package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crvh;
import java.util.ArrayList;
import java.util.Arrays;

public class MdpMoney extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final int c;

    static {
        MdpMoney.CREATOR = new crvh();
    }

    public MdpMoney(String s, long v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof MdpMoney) ? bata.b(this.a, ((MdpMoney)object0).a) && bata.b(Long.valueOf(this.b), Long.valueOf(((MdpMoney)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((MdpMoney)object0).c)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.b), ((int)this.c)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("currencyCode", this.a, arrayList0);
        basz.b("units", Long.valueOf(this.b), arrayList0);
        basz.b("nanos", Integer.valueOf(this.c), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

