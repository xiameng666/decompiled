package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bqse;
import bqvm;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class RawDataPoint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final Value[] c;
    public final int d;
    public final int e;
    public final long f;

    static {
        RawDataPoint.CREATOR = new bqvm();
    }

    public RawDataPoint(long v, long v1, Value[] arr_value, int v2, int v3, long v4) {
        this.a = v;
        this.b = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.c = arr_value;
    }

    public RawDataPoint(DataPoint dataPoint0, List list0) {
        this.a = dataPoint0.b(TimeUnit.NANOSECONDS);
        this.b = dataPoint0.a(TimeUnit.NANOSECONDS);
        this.c = dataPoint0.d;
        this.d = bqse.a(dataPoint0.a, list0);
        this.e = bqse.a(dataPoint0.e, list0);
        this.f = dataPoint0.f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof RawDataPoint) ? this.a == ((RawDataPoint)object0).a && this.b == ((RawDataPoint)object0).b && Arrays.equals(this.c, ((RawDataPoint)object0).c) && this.d == ((RawDataPoint)object0).d && this.e == ((RawDataPoint)object0).e && this.f == ((RawDataPoint)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((long)this.b)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "RawDataPoint{%s@[%s, %s](%d,%d)}", Arrays.toString(this.c), ((long)this.b), ((long)this.a), ((int)this.d), ((int)this.e));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.q(parcel0, 2, this.b);
        baub.J(parcel0, 3, this.c, v);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.q(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

