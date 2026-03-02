package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import basz;
import bata;
import baub;
import bqun;
import brdl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataReadResult extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final Status b;
    public final List c;
    public int d;
    public final List e;

    static {
        DataReadResult.CREATOR = new brdl();
    }

    public DataReadResult(List list0, Status status0, List list1, int v, List list2) {
        this.b = status0;
        this.d = v;
        this.e = list2;
        this.a = new ArrayList(list0.size());
        for(Object object0: list0) {
            DataSet dataSet0 = new DataSet(((RawDataSet)object0), list2);
            this.a.add(dataSet0);
        }
        this.c = new ArrayList(list1.size());
        for(Object object1: list1) {
            List list3 = this.c;
            long v1 = ((RawBucket)object1).a;
            long v2 = ((RawBucket)object1).b;
            Session session0 = ((RawBucket)object1).c;
            int v3 = ((RawBucket)object1).d;
            ArrayList arrayList0 = new ArrayList(((RawBucket)object1).e.size());
            for(Object object2: ((RawBucket)object1).e) {
                arrayList0.add(new DataSet(((RawDataSet)object2), list2));
            }
            list3.add(new Bucket(v1, v2, session0, v3, arrayList0, ((RawBucket)object1).f));
        }
    }

    public DataReadResult(List list0, List list1, Status status0) {
        this.a = list0;
        this.b = status0;
        this.c = list1;
        this.d = 1;
        this.e = new ArrayList();
    }

    @Override  // azuj
    public final Status a() {
        return this.b;
    }

    public static DataReadResult b(Status status0, List list0, List list1) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list1) {
            arrayList0.add(DataSet.a(((DataSource)object0)).a());
        }
        for(Object object1: list0) {
            bqun bqun0 = new bqun();
            bqun0.b = 1;
            bqun0.a = (DataType)object1;
            bqun0.b("Default");
            arrayList0.add(DataSet.a(bqun0.a()).a());
        }
        return new DataReadResult(arrayList0, Collections.EMPTY_LIST, status0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DataReadResult) ? this.b.equals(((DataReadResult)object0).b) && bata.b(this.a, ((DataReadResult)object0).a) && bata.b(this.c, ((DataReadResult)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("status", this.b, arrayList0);
        List list0 = this.a;
        if(list0.size() > 5) {
            list0 = list0.size() + " data sets";
        }
        basz.b("dataSets", list0, arrayList0);
        List list1 = this.c;
        if(list1.size() > 5) {
            list1 = list1.size() + " buckets";
        }
        basz.b("buckets", list1, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        ArrayList arrayList0 = new ArrayList(this.a.size());
        for(Object object0: this.a) {
            arrayList0.add(new RawDataSet(((DataSet)object0), this.e));
        }
        baub.G(parcel0, 1, arrayList0);
        baub.t(parcel0, 2, this.b, v, false);
        ArrayList arrayList1 = new ArrayList(this.c.size());
        for(Object object1: this.c) {
            arrayList1.add(new RawBucket(((Bucket)object1), this.e));
        }
        baub.G(parcel0, 3, arrayList1);
        baub.o(parcel0, 5, this.d);
        baub.y(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

