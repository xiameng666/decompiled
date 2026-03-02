package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import braf;
import brdb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class SessionStopRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final braf c;

    static {
        SessionStopRequest.CREATOR = new brdb();
    }

    public SessionStopRequest(String s, String s1, IBinder iBinder0) {
        braf braf0;
        this.a = s;
        this.b = s1;
        if(iBinder0 == null) {
            braf0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
            braf0 = (iInterface0 instanceof braf) ? ((braf)iInterface0) : new braf(iBinder0);
        }
        this.c = braf0;
    }

    public SessionStopRequest(String s, String s1, braf braf0) {
        this.a = s;
        this.b = s1;
        this.c = braf0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof SessionStopRequest) ? bata.b(this.a, ((SessionStopRequest)object0).a) && bata.b(this.b, ((SessionStopRequest)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("name", this.a, arrayList0);
        basz.b("identifier", this.b, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.D(parcel0, 3, (this.c == null ? null : this.c.a));
        baub.c(parcel0, v1);
    }
}

