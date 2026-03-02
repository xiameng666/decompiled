package com.google.android.gms.auth.api.fido;

import ahlm;
import ahln;
import ahlo;
import ahlx;
import ahmq;
import ahnd;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import bata;
import batl;
import baub;
import bxnm;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kvt;

public class AuthenticationOptions extends AbstractSafeParcelable implements ahnd {
    public static final Parcelable.Creator CREATOR;
    public final PublicKeyCredentialRequestOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final bxnm e;
    public final kvt f;
    public final boolean g;
    public final long h;
    public final ResultReceiver i;
    public final BiometricPromptUiOptions j;

    static {
        AuthenticationOptions.CREATOR = new ahln();
    }

    public AuthenticationOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s, String s1, BrowserOptions browserOptions0, bxnm bxnm0, kvt kvt0, boolean z, long v, ResultReceiver resultReceiver0, BiometricPromptUiOptions biometricPromptUiOptions0) {
        batl.c(v > 0L, "Must provide a valid startTime.");
        batl.s(publicKeyCredentialRequestOptions0);
        this.a = publicKeyCredentialRequestOptions0;
        batl.s(s);
        this.b = s;
        batl.s(s1);
        this.c = s1;
        this.d = browserOptions0;
        this.e = bxnm0;
        this.f = kvt0;
        this.g = z;
        this.h = v;
        this.i = resultReceiver0;
        this.j = biometricPromptUiOptions0;
    }

    @Override  // ahnd
    public final long a() {
        return this.h;
    }

    @Override  // ahly
    public final Uri b() {
        return ahlx.a(this);
    }

    @Override  // ahnd
    public final ResultReceiver c() {
        return this.i;
    }

    @Override  // ahlq
    public final kvt d() {
        return this.f;
    }

    public static ahlm e() {
        ahlm ahlm0 = new ahlm();
        ahlm0.c(false);
        return ahlm0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AuthenticationOptions) ? bata.b(this.a, ((AuthenticationOptions)object0).a) && bata.b(this.b, ((AuthenticationOptions)object0).b) && bata.b(this.c, ((AuthenticationOptions)object0).c) && bata.b(this.d, ((AuthenticationOptions)object0).d) && bata.b(this.e, ((AuthenticationOptions)object0).e) && bata.b(this.f, ((AuthenticationOptions)object0).f) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((AuthenticationOptions)object0).g)) && this.h == ((AuthenticationOptions)object0).h && this.i == ((AuthenticationOptions)object0).i && bata.b(this.j, ((AuthenticationOptions)object0).j) : false;
    }

    @Override  // ahly
    public final BrowserOptions f() {
        return this.d;
    }

    @Override  // ahms
    public final bxnm g() {
        return this.e;
    }

    @Override  // ahnd
    public final Double h() {
        return this.a.b;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), ((long)this.h), this.i, this.j});
    }

    @Override  // ahnd
    public final String i() {
        return this.c;
    }

    @Override  // ahnd
    public final String j() {
        return this.b;
    }

    @Override  // ahnd
    public final boolean k() {
        return this.g;
    }

    @Override  // ahly
    public final boolean l() {
        return ahlx.e(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.t(parcel0, 5, this.d, v, false);
        baub.o(parcel0, 6, ahmq.a(this));
        baub.g(parcel0, 7, ahlo.a(this), false);
        baub.e(parcel0, 8, this.g);
        baub.q(parcel0, 9, this.h);
        baub.t(parcel0, 10, this.i, v, false);
        baub.t(parcel0, 11, this.j, v, false);
        baub.c(parcel0, v1);
    }
}

