package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import bqzc;
import brcn;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hlcw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoalsReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;
    public final List c;
    public final bqzc d;

    static {
        GoalsReadRequest.CREATOR = new brcn();
    }

    public GoalsReadRequest(IBinder iBinder0, List list0, List list1, List list2) {
        bqzc bqzc0;
        if(iBinder0 == null) {
            bqzc0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
            bqzc0 = (iInterface0 instanceof bqzc) ? ((bqzc)iInterface0) : new bqzc(iBinder0);
        }
        this.d = bqzc0;
        this.a = list0;
        this.b = list1;
        this.c = list2;
    }

    public final List a() {
        List list0 = this.c;
        if(list0.isEmpty()) {
            return null;
        }
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(hlcw.c(((Integer)object0).intValue()));
        }
        return list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GoalsReadRequest) ? bata.b(this.a, ((GoalsReadRequest)object0).a) && bata.b(this.b, ((GoalsReadRequest)object0).b) && bata.b(this.c, ((GoalsReadRequest)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        List list0 = this.a();
        return Arrays.hashCode(new Object[]{this.a, this.b, list0});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("dataTypes", this.a, arrayList0);
        basz.b("objectiveTypes", this.b, arrayList0);
        basz.b("activities", this.a(), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, (this.d == null ? null : this.d.a));
        baub.G(parcel0, 2, this.a);
        baub.G(parcel0, 3, this.b);
        baub.G(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

