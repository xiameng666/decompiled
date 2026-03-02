package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bqyu;
import brby;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DataReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;
    public final long c;
    public final long d;
    public final List e;
    public final List f;
    public final int g;
    public final long h;
    public final DataSource i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final List m;
    public final List n;
    public final bqyu o;

    static {
        DataReadRequest.CREATOR = new brby();
    }

    public DataReadRequest(List list0, List list1, long v, long v1, List list2, List list3, int v2, long v3, DataSource dataSource0, int v4, boolean z, boolean z1, IBinder iBinder0, List list4, List list5) {
        bqyu bqyu0;
        this.a = list0;
        this.b = list1;
        this.c = v;
        this.d = v1;
        this.e = list2;
        this.f = list3;
        this.g = v2;
        this.h = v3;
        this.i = dataSource0;
        this.j = v4;
        this.k = z;
        this.l = z1;
        if(iBinder0 == null) {
            bqyu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
            bqyu0 = (iInterface0 instanceof bqyu) ? ((bqyu)iInterface0) : new bqyu(iBinder0);
        }
        this.o = bqyu0;
        List list6 = list4 == null ? Collections.EMPTY_LIST : list4;
        this.m = list6;
        List list7 = list5 == null ? Collections.EMPTY_LIST : list5;
        this.n = list7;
        batl.c(list6.size() == list7.size(), "Unequal number of interval start and end times.");
    }

    public final long a(TimeUnit timeUnit0) {
        return timeUnit0.convert(this.h, TimeUnit.MILLISECONDS);
    }

    public final long b(TimeUnit timeUnit0) {
        return timeUnit0.convert(this.d, TimeUnit.MILLISECONDS);
    }

    public final long c(TimeUnit timeUnit0) {
        return timeUnit0.convert(this.c, TimeUnit.MILLISECONDS);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof DataReadRequest) && this.a.equals(((DataReadRequest)object0).a) && this.b.equals(((DataReadRequest)object0).b) && this.c == ((DataReadRequest)object0).c && this.d == ((DataReadRequest)object0).d && this.g == ((DataReadRequest)object0).g && this.f.equals(((DataReadRequest)object0).f) && this.e.equals(((DataReadRequest)object0).e) && bata.b(this.i, ((DataReadRequest)object0).i) && this.h == ((DataReadRequest)object0).h && this.l == ((DataReadRequest)object0).l && this.j == ((DataReadRequest)object0).j && this.k == ((DataReadRequest)object0).k && bata.b(this.o, ((DataReadRequest)object0).o);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.g), ((long)this.c), ((long)this.d)});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DataReadRequest{");
        List list0 = this.a;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                stringBuilder0.append(((DataType)object0).a());
                stringBuilder0.append(" ");
            }
        }
        List list1 = this.b;
        if(!list1.isEmpty()) {
            for(Object object1: list1) {
                stringBuilder0.append(((DataSource)object1).a());
                stringBuilder0.append(" ");
            }
        }
        int v = this.g;
        if(v != 0) {
            stringBuilder0.append("bucket by ");
            stringBuilder0.append(Bucket.c(v));
            long v1 = this.h;
            if(v1 > 0L) {
                stringBuilder0.append(" >");
                stringBuilder0.append(v1);
                stringBuilder0.append("ms");
            }
            stringBuilder0.append(": ");
        }
        List list2 = this.e;
        if(!list2.isEmpty()) {
            for(Object object2: list2) {
                stringBuilder0.append(((DataType)object2).a());
                stringBuilder0.append(" ");
            }
        }
        List list3 = this.f;
        if(!list3.isEmpty()) {
            for(Object object3: list3) {
                stringBuilder0.append(((DataSource)object3).a());
                stringBuilder0.append(" ");
            }
        }
        Long long0 = (long)this.c;
        Long long1 = (long)this.d;
        stringBuilder0.append(String.format(Locale.US, "(%tF %tT - %tF %tT)", long0, long0, long1, long1));
        DataSource dataSource0 = this.i;
        if(dataSource0 != null) {
            stringBuilder0.append("activities: ");
            stringBuilder0.append(dataSource0.a());
        }
        if(this.l) {
            stringBuilder0.append(" +server");
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.y(parcel0, 5, this.e, false);
        baub.y(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.q(parcel0, 8, this.h);
        baub.t(parcel0, 9, this.i, v, false);
        baub.o(parcel0, 10, this.j);
        baub.e(parcel0, 12, this.k);
        baub.e(parcel0, 13, this.l);
        baub.D(parcel0, 14, (this.o == null ? null : this.o.a));
        baub.H(parcel0, 18, this.m);
        baub.H(parcel0, 19, this.n);
        baub.c(parcel0, v1);
    }
}

