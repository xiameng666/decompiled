package com.google.android.gms.auth.api.phone.internal;

import aiap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gfta;
import java.util.Arrays;

public final class SmsRetrieverEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public int c;
    public int d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public String l;
    public int m;
    public int n;

    static {
        SmsRetrieverEvent.CREATOR = new aiap();
    }

    public SmsRetrieverEvent() {
    }

    public SmsRetrieverEvent(int v, String s, int v1, int v2, String s1, String s2, int v3, int v4, int v5, int v6, boolean z, String s3, int v7, int v8) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = s1;
        this.f = s2;
        this.g = v3;
        this.h = v4;
        this.i = v5;
        this.j = v6;
        this.k = z;
        this.l = s3;
        this.m = v7;
        this.n = v8;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SmsRetrieverEvent) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((SmsRetrieverEvent)object0).a)) && bata.b(this.b, ((SmsRetrieverEvent)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((SmsRetrieverEvent)object0).c)) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((SmsRetrieverEvent)object0).d)) && bata.b(this.e, ((SmsRetrieverEvent)object0).e) && bata.b(this.f, ((SmsRetrieverEvent)object0).f) && bata.b(Integer.valueOf(this.g), Integer.valueOf(((SmsRetrieverEvent)object0).g)) && bata.b(Integer.valueOf(this.h), Integer.valueOf(((SmsRetrieverEvent)object0).h)) && bata.b(Integer.valueOf(this.i), Integer.valueOf(((SmsRetrieverEvent)object0).i)) && bata.b(Integer.valueOf(this.j), Integer.valueOf(((SmsRetrieverEvent)object0).j)) && bata.b(Boolean.valueOf(this.k), Boolean.valueOf(((SmsRetrieverEvent)object0).k)) && bata.b(this.l, ((SmsRetrieverEvent)object0).l) && bata.b(Integer.valueOf(this.m), Integer.valueOf(((SmsRetrieverEvent)object0).m)) && bata.b(Integer.valueOf(this.n), Integer.valueOf(((SmsRetrieverEvent)object0).n));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), gfta.b(this.b), ((int)this.c), ((int)this.d), gfta.b(this.e), gfta.b(this.f), ((int)this.g), ((int)this.h), ((int)this.i), ((int)this.j), Boolean.valueOf(this.k), this.l, ((int)this.m), ((int)this.n)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.o(parcel0, 8, this.h);
        baub.o(parcel0, 9, this.i);
        baub.o(parcel0, 10, this.j);
        baub.e(parcel0, 11, this.k);
        baub.v(parcel0, 12, this.l, false);
        baub.o(parcel0, 13, this.m);
        baub.o(parcel0, 0xFFFF, this.n);
        baub.c(parcel0, v1);
    }
}

