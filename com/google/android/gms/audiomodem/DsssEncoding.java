package com.google.android.gms.audiomodem;

import acpq;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class DsssEncoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    static {
        DsssEncoding.CREATOR = new acpq();
    }

    public DsssEncoding(int v, boolean z, boolean z1, int v1, int v2, float f, int v3, float f1, int v4, int v5, int v6, int v7) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = v1;
        this.e = v2;
        this.f = f;
        this.g = v3;
        this.h = f1;
        this.i = v4;
        this.j = v5;
        this.k = v6;
        this.l = v7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DsssEncoding) ? this.a == ((DsssEncoding)object0).a && this.b == ((DsssEncoding)object0).b && this.c == ((DsssEncoding)object0).c && this.d == ((DsssEncoding)object0).d && this.e == ((DsssEncoding)object0).e && this.f == ((DsssEncoding)object0).f && this.g == ((DsssEncoding)object0).g && this.h == ((DsssEncoding)object0).h && this.i == ((DsssEncoding)object0).i && this.j == ((DsssEncoding)object0).j && this.k == ((DsssEncoding)object0).k && this.l == ((DsssEncoding)object0).l : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), ((int)this.d), ((int)this.e), ((float)this.f), ((int)this.g), ((float)this.h), ((int)this.i), ((int)this.j), ((int)this.k), ((int)this.l)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.e(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.o(parcel0, 6, this.e);
        baub.l(parcel0, 7, this.f);
        baub.o(parcel0, 8, this.g);
        baub.l(parcel0, 9, this.h);
        baub.o(parcel0, 10, this.i);
        baub.o(parcel0, 11, this.j);
        baub.o(parcel0, 12, this.k);
        baub.o(parcel0, 13, this.l);
        baub.c(parcel0, v1);
    }
}

