package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import datu;
import datv;
import java.util.List;

public class ServerSyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;
    public final String f;
    public final int g;

    static {
        ServerSyncResult.CREATOR = new datv();
    }

    public ServerSyncResult(int v, int v1, int v2, int v3, List list0, String s, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = list0;
        this.f = s;
        this.g = v4;
    }

    public static datu a(int v) {
        datu datu0 = new datu();
        datu0.a = v;
        datu0.b = v;
        datu0.c = v;
        datu0.d = v;
        return datu0;
    }

    public final datu b() {
        datu datu0 = new datu();
        datu0.a = this.a;
        datu0.b = this.b;
        datu0.c = this.c;
        datu0.d = this.d;
        datu0.e = this.g;
        List list0 = this.e;
        if(list0 != null) {
            datu0.f = list0;
        }
        String s = this.f;
        if(s != null) {
            datu0.g = s;
        }
        return datu0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.y(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.o(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

