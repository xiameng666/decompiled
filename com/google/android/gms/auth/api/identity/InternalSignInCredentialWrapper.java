package com.google.android.gms.auth.api.identity;

import MoreObjects;
import ToStringHelper;
import ahqi;
import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bata;
import batl;
import baub;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gged_interceptors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class InternalSignInCredentialWrapper extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR;
    public static final Scope a;
    public static final Scope b;
    public static final Scope c;
    public static final Scope d;
    public static final Scope e;
    public final Account f;
    public final SignInCredential g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final boolean l;
    public final long m;
    public final String n;
    public final boolean o;
    public final Intent p;

    static {
        InternalSignInCredentialWrapper.CREATOR = new ahqi();
        InternalSignInCredentialWrapper.a = new Scope("profile");
        InternalSignInCredentialWrapper.b = new Scope("email");
        InternalSignInCredentialWrapper.c = new Scope("openid");
        InternalSignInCredentialWrapper.d = new Scope("https://www.googleapis.com/auth/userinfo.profile");
        InternalSignInCredentialWrapper.e = new Scope("https://www.googleapis.com/auth/userinfo.email");
    }

    public InternalSignInCredentialWrapper(Account account0, SignInCredential signInCredential0, List list0, boolean z, boolean z1, long v, boolean z2, long v1, String s, boolean z3, Intent intent0) {
        this.f = account0;
        batl.s(signInCredential0);
        this.g = signInCredential0;
        if(!TextUtils.isEmpty(signInCredential0.f)) {
            batl.c(list0.isEmpty(), "Password credentials should have empty granted-scopes list");
            batl.c(((boolean)(((int)z) ^ 1)), "Converted credentials should not contain the original password");
        }
        batl.s(list0);
        this.h = gged_interceptors.i(list0);
        this.i = (int)z;
        this.j = z1;
        this.k = v;
        this.l = z2;
        this.m = v1;
        this.n = s;
        this.o = z3;
        this.p = intent0;
    }

    public final List a() {
        return new ArrayList(this.h);
    }

    public final boolean b() {
        return this.i || !TextUtils.isEmpty(this.g.f) || this.h.contains(InternalSignInCredentialWrapper.c);
    }

    public final boolean c() {
        return this.l && this.b();
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.d();
        int v1 = ((InternalSignInCredentialWrapper)object0).d();
        return v == v1 ? Long.compare(this.m, ((InternalSignInCredentialWrapper)object0).m) : Integer.compare(v, v1);
    }

    private final int d() {
        int v;
        if(this.j) {
            v = 100000;
        }
        else if(this.g.f == null) {
            v = 1000;
        }
        else {
            v = this.f == null ? 0 : 100;
        }
        SignInCredential signInCredential0 = this.g;
        int v1 = TextUtils.isEmpty(signInCredential0.b) ? 1 : 2;
        if(!TextUtils.isEmpty(signInCredential0.c)) {
            ++v1;
        }
        if(!TextUtils.isEmpty(signInCredential0.d)) {
            ++v1;
        }
        if(signInCredential0.e != null && !Uri.EMPTY.equals(signInCredential0.e)) {
            ++v1;
        }
        return v + v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InternalSignInCredentialWrapper) ? bata.b(this.f, ((InternalSignInCredentialWrapper)object0).f) && bata.b(this.g, ((InternalSignInCredentialWrapper)object0).g) && bata.b(this.h, ((InternalSignInCredentialWrapper)object0).h) && this.i == ((InternalSignInCredentialWrapper)object0).i && this.j == ((InternalSignInCredentialWrapper)object0).j && this.k == ((InternalSignInCredentialWrapper)object0).k && this.l == ((InternalSignInCredentialWrapper)object0).l && this.m == ((InternalSignInCredentialWrapper)object0).m && bata.b(this.n, ((InternalSignInCredentialWrapper)object0).n) && this.o == ((InternalSignInCredentialWrapper)object0).o && bata.b(this.p, ((InternalSignInCredentialWrapper)object0).p) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), ((long)this.k), Boolean.valueOf(this.l), ((long)this.m), this.n, Boolean.valueOf(this.o), this.p});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("owningAccount", this.f);
        gfsv0.add("signInCredential", this.g);
        gfsv0.add("grantedScopes", this.h);
        gfsv0.addBool("representsConvertedCredential", this.i);
        gfsv0.addBool("representsLinkedThirdPartyAccount", this.j);
        gfsv0.g("linkingTimeInMillis", this.k);
        gfsv0.addBool("autoSelectSupportedByAppAndAccount", this.l);
        gfsv0.g("lastUsedTimeMillis", this.m);
        gfsv0.add("originalAffiliation", this.n);
        gfsv0.addBool("isUnicornAccount", this.o);
        gfsv0.add("fullScreenConsentFlowIntent", this.p);
        return gfsv0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.f, v, false);
        baub.t(parcel0, 2, this.g, v, false);
        baub.y(parcel0, 3, this.a(), false);
        baub.e(parcel0, 4, this.i);
        baub.e(parcel0, 5, this.j);
        baub.q(parcel0, 6, this.k);
        baub.e(parcel0, 7, this.l);
        baub.q(parcel0, 8, this.m);
        baub.v(parcel0, 9, this.n, false);
        baub.e(parcel0, 10, this.o);
        baub.t(parcel0, 11, this.p, v, false);
        baub.c(parcel0, v1);
    }
}

