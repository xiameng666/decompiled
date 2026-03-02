package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azuj;
import basz;
import bata;
import baub;
import brdx;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SessionReadResult extends AbstractSafeParcelable implements azuj {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;
    public final Status c;

    static {
        SessionReadResult.CREATOR = new brdx();
    }

    public SessionReadResult(List list0, List list1, Status status0) {
        this.a = list0;
        this.b = DesugarCollections.unmodifiableList(list1);
        this.c = status0;
    }

    @Override  // azuj
    public final Status a() {
        return this.c;
    }

    public static SessionReadResult b(Status status0) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SessionReadResult) ? this.c.equals(((SessionReadResult)object0).c) && bata.b(this.a, ((SessionReadResult)object0).a) && bata.b(this.b, ((SessionReadResult)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("status", this.c, arrayList0);
        basz.b("sessions", this.a, arrayList0);
        basz.b("sessionDataSets", this.b, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

