package com.google.android.gms.auth.api.identity;

import ahpq;
import ahpr;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ggeo;
import j..util.Objects;

public class ChromeOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final ggeo a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    static {
        ChromeOptions.CREATOR = new ahpr();
        ChromeOptions.a = ggeo.p("org.chromium.chrome", "built_locally", "com.chrome.canary", "canary", "com.chrome.dev", "dev", "com.chrome.beta", "beta", "com.android.chrome", "stable");
    }

    public ChromeOptions(String s, String s1, boolean z, boolean z1, boolean z2, boolean z3) {
        this.b = s;
        this.c = s1;
        this.d = z;
        this.e = z1;
        this.f = z2;
        this.g = z3;
    }

    public static ahpq a() {
        ahpq ahpq0 = new ahpq();
        ahpq0.b = null;
        ahpq0.e(false);
        ahpq0.b(false);
        ahpq0.c(false);
        ahpq0.d(false);
        return ahpq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ChromeOptions) ? Objects.equals(this.b, ((ChromeOptions)object0).b) && Objects.equals(this.c, ((ChromeOptions)object0).c) && this.d == ((ChromeOptions)object0).d && this.e == ((ChromeOptions)object0).e && this.f == ((ChromeOptions)object0).f && this.g == ((ChromeOptions)object0).g : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.b, false);
        baub.v(parcel0, 2, this.c, false);
        baub.e(parcel0, 3, this.d);
        baub.e(parcel0, 4, this.e);
        baub.e(parcel0, 5, this.f);
        baub.e(parcel0, 6, this.g);
        baub.c(parcel0, v1);
    }
}

