package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azec;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ghfg;
import ghfw;
import ghga;
import ghhb;
import java.nio.charset.StandardCharsets;

public class SamplerConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final String e;

    static {
        SamplerConfigParcelable.CREATOR = new azec();
    }

    public SamplerConfigParcelable(int v, double f, int v1, int v2, String s) {
        this.a = v;
        this.b = f;
        this.c = v1;
        this.d = v2;
        this.e = s;
    }

    @Override
    public final int hashCode() {
        ghga ghga0 = ghhb.b.h();
        ghga0.j(this.a);
        ((ghfg)ghga0).k(Double.doubleToRawLongBits(this.b));
        ghga0.j(this.c);
        ghga0.j(this.d);
        String s = this.e;
        if(s != null) {
            ghga0.m(s, StandardCharsets.UTF_8);
        }
        return ((ghfw)ghga0.s()).a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.j(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

