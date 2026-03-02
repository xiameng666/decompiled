package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esnb;
import java.util.Arrays;
import java.util.List;

public class TransactionData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final String c;
    public final int d;
    public final List e;
    public final int f;
    public final boolean g;
    public final String h;
    final String i;
    final String j;

    static {
        TransactionData.CREATOR = new esnb();
    }

    public TransactionData(long v, long v1, String s, int v2, List list0, int v3, boolean z, String s1, String s2, String s3) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = v2;
        this.e = list0;
        this.f = v3;
        this.g = z;
        if(s1 != null && s1.length() > 150) {
            s1 = s1.substring(0, 150);
        }
        this.h = s1;
        this.i = s2;
        this.j = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TransactionData) && bata.b(Long.valueOf(this.a), Long.valueOf(((TransactionData)object0).a)) && bata.b(Long.valueOf(this.b), Long.valueOf(((TransactionData)object0).b)) && bata.b(this.c, ((TransactionData)object0).c) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((TransactionData)object0).d)) && bata.b(this.e, ((TransactionData)object0).e) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((TransactionData)object0).f)) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((TransactionData)object0).g)) && bata.b(this.h, ((TransactionData)object0).h) && bata.b(this.i, ((TransactionData)object0).i) && bata.b(this.j, ((TransactionData)object0).j);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((long)this.b), this.c, ((int)this.d), this.e, ((int)this.f), Boolean.valueOf(this.g), this.h, this.i, this.j});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 2, this.a);
        baub.q(parcel0, 4, this.b);
        baub.v(parcel0, 5, this.c, false);
        baub.o(parcel0, 6, this.d);
        baub.E(parcel0, 7, this.e);
        baub.o(parcel0, 8, this.f);
        baub.e(parcel0, 9, this.g);
        baub.v(parcel0, 10, this.h, false);
        baub.v(parcel0, 11, this.i, false);
        baub.v(parcel0, 12, this.j, false);
        baub.c(parcel0, v1);
    }
}

