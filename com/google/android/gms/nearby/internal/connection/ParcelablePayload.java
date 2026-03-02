package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czhl;
import java.util.Arrays;

public final class ParcelablePayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public long a;
    public int b;
    public byte[] c;
    public ParcelFileDescriptor d;
    public String e;
    public long f;
    public ParcelFileDescriptor g;
    public Uri h;
    public long i;
    public boolean j;
    public ParcelByteArray k;
    public long l;
    public String m;
    public String n;
    public ParcelableRequest o;
    public ParcelableResponse p;
    public ParcelableOneWayMessage q;
    public int r;

    static {
        ParcelablePayload.CREATOR = new czhl();
    }

    public ParcelablePayload() {
        this.f = -1L;
        this.i = 0L;
        this.j = false;
        this.l = 0L;
    }

    public ParcelablePayload(long v, int v1, byte[] arr_b, ParcelFileDescriptor parcelFileDescriptor0, String s, long v2, ParcelFileDescriptor parcelFileDescriptor1, Uri uri0, long v3, boolean z, ParcelByteArray parcelByteArray0, long v4, String s1, String s2, ParcelableRequest parcelableRequest0, ParcelableResponse parcelableResponse0, ParcelableOneWayMessage parcelableOneWayMessage0, int v5) {
        this.a = v;
        this.b = v1;
        this.c = arr_b;
        this.d = parcelFileDescriptor0;
        this.e = s;
        this.f = v2;
        this.g = parcelFileDescriptor1;
        this.h = uri0;
        this.i = v3;
        this.j = z;
        this.k = parcelByteArray0;
        this.l = v4;
        this.m = s1;
        this.n = s2;
        this.o = parcelableRequest0;
        this.p = parcelableResponse0;
        this.q = parcelableOneWayMessage0;
        this.r = v5;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ParcelablePayload) && bata.b(Long.valueOf(this.a), Long.valueOf(((ParcelablePayload)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((ParcelablePayload)object0).b)) && Arrays.equals(this.c, ((ParcelablePayload)object0).c) && bata.b(this.d, ((ParcelablePayload)object0).d) && bata.b(this.e, ((ParcelablePayload)object0).e) && bata.b(Long.valueOf(this.f), Long.valueOf(((ParcelablePayload)object0).f)) && bata.b(this.g, ((ParcelablePayload)object0).g) && bata.b(this.h, ((ParcelablePayload)object0).h) && bata.b(Long.valueOf(this.i), Long.valueOf(((ParcelablePayload)object0).i)) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((ParcelablePayload)object0).j)) && bata.b(this.k, ((ParcelablePayload)object0).k) && bata.b(Long.valueOf(this.l), Long.valueOf(((ParcelablePayload)object0).l)) && bata.b(this.m, ((ParcelablePayload)object0).m) && bata.b(this.n, ((ParcelablePayload)object0).n) && bata.b(this.o, ((ParcelablePayload)object0).o) && bata.b(this.p, ((ParcelablePayload)object0).p) && bata.b(this.q, ((ParcelablePayload)object0).q) && bata.b(Integer.valueOf(this.r), Integer.valueOf(((ParcelablePayload)object0).r));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((int)this.b), Arrays.hashCode(this.c), this.d, this.e, ((long)this.f), this.g, this.h, ((long)this.i), Boolean.valueOf(this.j), this.k, ((long)this.l), this.m, this.n, this.o, this.p, this.q, ((int)this.r)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.i(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.v(parcel0, 5, this.e, false);
        baub.q(parcel0, 6, this.f);
        baub.t(parcel0, 7, this.g, v, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.q(parcel0, 9, this.i);
        baub.e(parcel0, 10, this.j);
        baub.t(parcel0, 11, this.k, v, false);
        baub.q(parcel0, 12, this.l);
        baub.v(parcel0, 13, this.m, false);
        baub.v(parcel0, 14, this.n, false);
        baub.t(parcel0, 15, this.o, v, false);
        baub.t(parcel0, 16, this.p, v, false);
        baub.o(parcel0, 17, this.r);
        baub.t(parcel0, 18, this.q, v, false);
        baub.c(parcel0, v1);
    }
}

