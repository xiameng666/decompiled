package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import bqyz;
import brcc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class DataTypeCreateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final List b;
    public final bqyz c;

    static {
        DataTypeCreateRequest.CREATOR = new brcc();
    }

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest0, bqyz bqyz0) {
        this.a = dataTypeCreateRequest0.a;
        this.b = DesugarCollections.unmodifiableList(dataTypeCreateRequest0.b);
        this.c = bqyz0;
    }

    public DataTypeCreateRequest(String s, List list0, IBinder iBinder0) {
        bqyz bqyz0;
        this.a = s;
        this.b = DesugarCollections.unmodifiableList(list0);
        if(iBinder0 == null) {
            bqyz0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
            bqyz0 = (iInterface0 instanceof bqyz) ? ((bqyz)iInterface0) : new bqyz(iBinder0);
        }
        this.c = bqyz0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof DataTypeCreateRequest) ? bata.b(this.a, ((DataTypeCreateRequest)object0).a) && bata.b(this.b, ((DataTypeCreateRequest)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("name", this.a, arrayList0);
        basz.b("fields", this.b, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.D(parcel0, 3, (this.c == null ? null : this.c.a));
        baub.c(parcel0, v1);
    }
}

