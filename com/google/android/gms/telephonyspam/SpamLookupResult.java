package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evrp;

public class SpamLookupResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    static {
        SpamLookupResult.CREATOR = new evrp();
    }

    public SpamLookupResult(int v, int v1) {
        this.a = 2;
        this.b = 1;
        this.c = 5;
        this.d = v;
        this.e = v1;
        this.f = 0;
    }

    public SpamLookupResult(int v, int v1, int v2, int v3) {
        this.a = 2;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = 0;
    }

    public SpamLookupResult(int v, int v1, int v2, int v3, int v4, int v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.o(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

