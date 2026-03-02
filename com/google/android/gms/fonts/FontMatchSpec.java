package com.google.android.gms.fonts;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import brsu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class FontMatchSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public String b;
    public float c;
    public int d;
    public float e;
    public boolean f;
    public final boolean g;

    static {
        FontMatchSpec.CREATOR = new brsu();
    }

    public FontMatchSpec(int v, String s, float f, int v1, float f1, boolean z, boolean z1) {
        this.a = v;
        batl.t(s, "family");
        this.b = s;
        this.c = f;
        this.d = v1;
        this.e = f1;
        this.f = z;
        this.g = z1;
        boolean z2 = true;
        batl.n(Float.compare(f, 0.0f) > 0, "invalid width %.01f", new Object[]{f});
        batl.n(v1 > 0 && v1 <= 1000, "invalid weight %d", new Object[]{v1});
        if(f1 < 0.0f || f1 > 1.0f) {
            z2 = false;
        }
        batl.n(z2, "invalid italic: %.01f", new Object[]{f1});
    }

    public FontMatchSpec(String s) {
        this(1, s, 100.0f, 400, 0.0f, false, false);
    }

    public FontMatchSpec(String s, float f) {
        this(1, s, 100.0f, 400, f, false, true);
    }

    public FontMatchSpec(String s, float f, int v, float f1, boolean z) {
        this(1, s, f, v, f1, z, false);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof FontMatchSpec) ? bata.b(this.b, ((FontMatchSpec)object0).b) && Float.compare(this.c, ((FontMatchSpec)object0).c) == 0 && this.d == ((FontMatchSpec)object0).d && Float.compare(this.e, ((FontMatchSpec)object0).e) == 0 && this.f == ((FontMatchSpec)object0).f && this.g == ((FontMatchSpec)object0).g : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, ((float)this.c), ((int)this.d), ((float)this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override
    public final String toString() {
        return "{" + this.b + ", wdth " + this.c + ", wght " + this.d + ", ital " + this.e + ", bestEffort " + this.f + "}, isVf " + this.g + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.l(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.l(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

