package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import datt;
import java.util.List;

public class ServerSyncParam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final List c;
    public final String d;
    public final String e;

    static {
        ServerSyncParam.CREATOR = new datt();
    }

    public ServerSyncParam(int v, boolean z, List list0, String s, String s1) {
        this.a = v;
        this.b = z;
        this.c = list0;
        this.d = s;
        this.e = s1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.y(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

