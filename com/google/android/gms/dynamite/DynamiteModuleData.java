package com.google.android.gms.dynamite;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjib;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DynamiteModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final long a;
    private final String b;
    private final int c;
    private final boolean d;
    private final int e;
    private final long f;
    private final RequestStats g;
    private final byte[] h;

    static {
        DynamiteModuleData.CREATOR = new bjib();
    }

    public DynamiteModuleData(long v, String s, int v1, boolean z, int v2, long v3, RequestStats requestStats0, byte[] arr_b) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = z;
        this.e = v2;
        this.f = v3;
        this.g = requestStats0;
        this.h = arr_b;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.a;
    }

    public RequestStats e() {
        return this.g;
    }

    public String f() {
        return this.b;
    }

    public boolean g() {
        return this.d;
    }

    public byte[] h() {
        return this.h;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.d());
        baub.v(parcel0, 2, this.f(), false);
        baub.o(parcel0, 3, this.a());
        baub.e(parcel0, 4, this.g());
        baub.o(parcel0, 5, this.b());
        baub.q(parcel0, 6, this.c());
        baub.t(parcel0, 7, this.e(), v, false);
        baub.i(parcel0, 8, this.h(), false);
        baub.c(parcel0, v1);
    }
}

