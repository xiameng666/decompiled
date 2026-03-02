package com.google.android.gms.auth.firstparty.delegate;

import ajpb;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TokenWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    @Deprecated
    String b;
    final Bundle c;
    FACLConfig d;
    public PACLConfig e;
    public boolean f;
    public AppDescription g;
    public Account h;
    public AccountAuthenticatorResponse i;
    public boolean j;

    static {
        TokenWorkflowRequest.CREATOR = new ajpb();
    }

    public TokenWorkflowRequest() {
        this.j = true;
        this.c = new Bundle();
    }

    public TokenWorkflowRequest(String s, String s1, Bundle bundle0, FACLConfig fACLConfig0, PACLConfig pACLConfig0, boolean z, AppDescription appDescription0, Account account0, AccountAuthenticatorResponse accountAuthenticatorResponse0, boolean z1) {
        this.j = true;
        this.a = s;
        this.b = s1;
        this.c = bundle0;
        this.d = fACLConfig0;
        this.e = pACLConfig0;
        this.f = z;
        this.g = appDescription0;
        this.h = account0 == null && !TextUtils.isEmpty(s1) ? new Account(s1, "com.google") : account0;
        this.i = accountAuthenticatorResponse0;
        this.j = z1;
    }

    public final Bundle a() {
        return new Bundle(this.c);
    }

    public final void b(Account account0) {
        this.b = account0 == null ? null : account0.name;
        this.h = account0;
    }

    public final void c() {
        this.d = null;
    }

    public final void d(Bundle bundle0) {
        Bundle bundle1 = this.c;
        bundle1.clear();
        if(bundle0 != null) {
            bundle1.putAll(bundle0);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.g(parcel0, 4, this.c, false);
        baub.t(parcel0, 5, this.d, v, false);
        baub.t(parcel0, 6, this.e, v, false);
        baub.e(parcel0, 7, this.f);
        baub.t(parcel0, 8, this.g, v, false);
        baub.t(parcel0, 9, this.h, v, false);
        baub.t(parcel0, 10, this.i, v, false);
        baub.e(parcel0, 11, this.j);
        baub.c(parcel0, v1);
    }
}

