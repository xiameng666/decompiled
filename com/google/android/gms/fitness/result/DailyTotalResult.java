package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import basz;
import bata;
import baub;
import bqun;
import brdj;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Arrays;

public class DailyTotalResult extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public final Status a;
    public final DataSet b;

    static {
        DailyTotalResult.CREATOR = new brdj();
    }

    public DailyTotalResult(Status status0, DataSet dataSet0) {
        this.a = status0;
        this.b = dataSet0;
    }

    @Override  // azuj
    public final Status a() {
        return this.a;
    }

    public static DailyTotalResult b(Status status0, DataType dataType0) {
        bqun bqun0 = new bqun();
        bqun0.b = 1;
        bqun0.a = dataType0;
        return new DailyTotalResult(status0, DataSet.a(bqun0.a()).a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DailyTotalResult) ? this.a.equals(((DailyTotalResult)object0).a) && bata.b(this.b, ((DailyTotalResult)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("status", this.a, arrayList0);
        basz.b("dataPoint", this.b, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

