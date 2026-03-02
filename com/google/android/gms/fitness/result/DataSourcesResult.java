package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import basz;
import bata;
import baub;
import brdo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataSourcesResult extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final Status b;

    static {
        DataSourcesResult.CREATOR = new brdo();
    }

    public DataSourcesResult(List list0, Status status0) {
        this.a = DesugarCollections.unmodifiableList(list0);
        this.b = status0;
    }

    @Override  // azuj
    public final Status a() {
        return this.b;
    }

    public static DataSourcesResult b(Status status0) {
        return new DataSourcesResult(Collections.EMPTY_LIST, status0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof DataSourcesResult) && this.b.equals(((DataSourcesResult)object0).b) && bata.b(this.a, ((DataSourcesResult)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("status", this.b, arrayList0);
        basz.b("dataSources", this.a, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

