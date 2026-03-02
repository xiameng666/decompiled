package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bquk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final DataSource a;
    public long b;
    public long c;
    public final Value[] d;
    public DataSource e;
    public final long f;

    static {
        DataPoint.CREATOR = new bquk();
    }

    public DataPoint(DataSource dataSource0, long v, long v1, Value[] arr_value, DataSource dataSource1, long v2) {
        this.a = dataSource0;
        this.e = dataSource1;
        this.b = v;
        this.c = v1;
        this.d = arr_value;
        this.f = v2;
    }

    public DataPoint(DataSource dataSource0, DataSource dataSource1, RawDataPoint rawDataPoint0) {
        this(dataSource0, rawDataPoint0.a, rawDataPoint0.b, rawDataPoint0.c, dataSource1, rawDataPoint0.f);
    }

    public DataPoint(List list0, RawDataPoint rawDataPoint0) {
        DataSource dataSource0 = DataPoint.d(list0, rawDataPoint0.d);
        batl.s(dataSource0);
        this(dataSource0, DataPoint.d(list0, rawDataPoint0.e), rawDataPoint0);
    }

    public final long a(TimeUnit timeUnit0) {
        return timeUnit0.convert(this.c, TimeUnit.NANOSECONDS);
    }

    public final long b(TimeUnit timeUnit0) {
        return timeUnit0.convert(this.b, TimeUnit.NANOSECONDS);
    }

    public final DataSource c() {
        return this.e == null ? this.a : this.e;
    }

    private static DataSource d(List list0, int v) {
        return v < 0 || v >= list0.size() ? null : ((DataSource)list0.get(v));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DataPoint) ? bata.b(this.a, ((DataPoint)object0).a) && this.b == ((DataPoint)object0).b && this.c == ((DataPoint)object0).c && Arrays.equals(this.d, ((DataPoint)object0).d) && bata.b(this.c(), ((DataPoint)object0).c()) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.b), ((long)this.c)});
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.d);
        Long long0 = (long)this.c;
        Long long1 = (long)this.b;
        Long long2 = (long)this.f;
        String s1 = this.a.a();
        return this.e == null ? String.format("DataPoint{%s@[%s, %s,raw=%s](%s %s)}", s, long0, long1, long2, s1, "N/A") : String.format("DataPoint{%s@[%s, %s,raw=%s](%s %s)}", s, long0, long1, long2, s1, this.e.a());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.q(parcel0, 3, this.b);
        baub.q(parcel0, 4, this.c);
        baub.J(parcel0, 5, this.d, v);
        baub.t(parcel0, 6, this.e, v, false);
        baub.q(parcel0, 7, this.f);
        baub.c(parcel0, v1);
    }
}

