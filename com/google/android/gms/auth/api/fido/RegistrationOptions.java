package com.google.android.gms.auth.api.fido;

import ahlo;
import ahlx;
import ahmq;
import ahna;
import ahnb;
import ahnd;
import android.accounts.Account;
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

public class RegistrationOptions extends AbstractSafeParcelable implements ahnd {
    public static final Parcelable.Creator CREATOR;
    public final PublicKeyCredentialCreationOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final Account e;
    public final bxnm f;
    public final kvt g;
    public final boolean h;
    public final long i;
    public final ResultReceiver j;
    public final BiometricPromptUiOptions k;

    static {
        RegistrationOptions.CREATOR = new ahnb();
    }

    public RegistrationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s, String s1, BrowserOptions browserOptions0, Account account0, bxnm bxnm0, kvt kvt0, Boolean boolean0, long v, ResultReceiver resultReceiver0, BiometricPromptUiOptions biometricPromptUiOptions0) {
        batl.c(v > 0L, "Must provide a valid startTime.");
        batl.s(publicKeyCredentialCreationOptions0);
        this.a = publicKeyCredentialCreationOptions0;
        batl.s(s);
        this.b = s;
        batl.s(s1);
        this.c = s1;
        this.d = browserOptions0;
        this.e = account0;
        this.f = bxnm0;
        this.g = kvt0;
        this.h = boolean0.booleanValue();
        this.i = v;
        this.j = resultReceiver0;
        this.k = biometricPromptUiOptions0;
    }

    @Override  // ahnd
    public final long a() {
        return this.i;
    }

    @Override  // ahly
    public final Uri b() {
        return ahlx.a(this);
    }

    @Override  // ahnd
    public final ResultReceiver c() {
        return this.j;
    }

    @Override  // ahlq
    public final kvt d() {
        return this.g;
    }

    public static ahna e() {
        ahna ahna0 = new ahna();
        ahna0.e = Boolean.valueOf(false);
        return ahna0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof RegistrationOptions) ? bata.b(this.a, ((RegistrationOptions)object0).a) && bata.b(this.b, ((RegistrationOptions)object0).b) && bata.b(this.c, ((RegistrationOptions)object0).c) && bata.b(this.d, ((RegistrationOptions)object0).d) && bata.b(this.e, ((RegistrationOptions)object0).e) && bata.b(this.f, ((RegistrationOptions)object0).f) && bata.b(this.g, ((RegistrationOptions)object0).g) && bata.b(Boolean.valueOf(this.h), Boolean.valueOf(((RegistrationOptions)object0).h)) && this.i == ((RegistrationOptions)object0).i && this.j == ((RegistrationOptions)object0).j && bata.b(this.k, ((RegistrationOptions)object0).k) : false;
    }

    @Override  // ahly
    public final BrowserOptions f() {
        return this.d;
    }

    @Override  // ahms
    public final bxnm g() {
        return this.f;
    }

    @Override  // ahnd
    public final Double h() {
        return this.a.e;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), ((long)this.i), this.j, this.k});
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
        return this.h;
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
        baub.t(parcel0, 6, this.e, v, false);
        baub.o(parcel0, 7, ahmq.a(this));
        baub.g(parcel0, 8, ahlo.a(this), false);
        baub.e(parcel0, 9, this.h);
        baub.q(parcel0, 10, this.i);
        baub.t(parcel0, 11, this.j, v, false);
        baub.t(parcel0, 12, this.k, v, false);
        baub.c(parcel0, v1);
    }
}

