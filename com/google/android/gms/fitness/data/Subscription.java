package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import bqvs;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class Subscription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final DataSource a;
    public final DataType b;
    public final long c;
    public final int d;
    public final int e;

    static {
        Subscription.CREATOR = new bqvs();
    }

    public Subscription(DataSource dataSource0, DataType dataType0, long v, int v1, int v2) {
        this.a = dataSource0;
        this.b = dataType0;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    public final DataType a() {
        return this.b == null ? this.a.a : this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof Subscription) ? bata.b(this.a, ((Subscription)object0).a) && bata.b(this.b, ((Subscription)object0).b) && this.c == ((Subscription)object0).c && this.d == ((Subscription)object0).d && this.e == ((Subscription)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.a, ((long)this.c), ((int)this.d), ((int)this.e)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("dataSource", this.a, arrayList0);
        basz.b("dataType", this.b, arrayList0);
        basz.b("samplingIntervalMicros", Long.valueOf(this.c), arrayList0);
        basz.b("accuracyMode", Integer.valueOf(this.d), arrayList0);
        basz.b("subscriptionType", Integer.valueOf(this.e), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.q(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

