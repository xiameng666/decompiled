package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import brag;
import brai;
import brcx;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SessionInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Session a;
    public final List b;
    public final List c;
    public final brai d;

    static {
        SessionInsertRequest.CREATOR = new brcx();
    }

    public SessionInsertRequest(Session session0, List list0, List list1, IBinder iBinder0) {
        brai brai0;
        this.a = session0;
        this.b = DesugarCollections.unmodifiableList(list0);
        this.c = DesugarCollections.unmodifiableList(list1);
        if(iBinder0 == null) {
            brai0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            brai0 = (iInterface0 instanceof brai) ? ((brai)iInterface0) : new brag(iBinder0);
        }
        this.d = brai0;
    }

    public SessionInsertRequest(Session session0, List list0, List list1, brai brai0) {
        this.a = session0;
        this.b = DesugarCollections.unmodifiableList(list0);
        this.c = DesugarCollections.unmodifiableList(list1);
        this.d = brai0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof SessionInsertRequest) && bata.b(this.a, ((SessionInsertRequest)object0).a) && bata.b(this.b, ((SessionInsertRequest)object0).b) && bata.b(this.c, ((SessionInsertRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("session", this.a, arrayList0);
        basz.b("dataSets", this.b, arrayList0);
        basz.b("aggregateDataPoints", this.c, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.y(parcel0, 2, this.b, false);
        baub.y(parcel0, 3, this.c, false);
        baub.D(parcel0, 4, (this.d == null ? null : this.d.asBinder()));
        baub.c(parcel0, v1);
    }
}

