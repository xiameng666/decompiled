package com.google.android.gms.nearby.presence.log;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dbnv;
import java.util.Arrays;

public final class DtdiAttribution extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public int d;
    public long e;

    static {
        DtdiAttribution.CREATOR = new dbnv();
    }

    private DtdiAttribution() {
    }

    public DtdiAttribution(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, int v, long v1) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
        this.d = v;
        this.e = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof DtdiAttribution) && Arrays.equals(this.a, ((DtdiAttribution)object0).a) && Arrays.equals(this.b, ((DtdiAttribution)object0).b) && Arrays.equals(this.c, ((DtdiAttribution)object0).c) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((DtdiAttribution)object0).d)) && bata.b(Long.valueOf(this.e), Long.valueOf(((DtdiAttribution)object0).e));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b), Arrays.hashCode(this.c), ((int)this.d), ((long)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

