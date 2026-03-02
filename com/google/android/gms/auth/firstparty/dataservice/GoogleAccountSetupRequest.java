package com.google.android.gms.auth.firstparty.dataservice;

import ajnw;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleAccountSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    final Bundle b;
    public boolean c;
    public boolean d;
    boolean e;
    public String f;
    public String g;
    public String h;
    String i;
    boolean j;
    boolean k;
    public boolean l;
    String m;
    public AppDescription n;
    public AccountCredentials o;
    public CaptchaSolution p;
    public String q;
    public String r;

    static {
        GoogleAccountSetupRequest.CREATOR = new ajnw();
    }

    public GoogleAccountSetupRequest() {
        this.a = 1;
        this.b = new Bundle();
    }

    public GoogleAccountSetupRequest(int v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s, String s1, String s2, String s3, boolean z3, boolean z4, boolean z5, String s4, AppDescription appDescription0, AccountCredentials accountCredentials0, CaptchaSolution captchaSolution0, String s5, String s6) {
        this.a = v;
        this.b = bundle0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = s;
        this.g = s1;
        this.h = s2;
        this.i = s3;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = s4;
        this.n = appDescription0;
        this.o = accountCredentials0;
        this.p = captchaSolution0;
        this.q = s5;
        this.r = s6;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.g(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.e(parcel0, 4, this.d);
        baub.e(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.e(parcel0, 10, this.j);
        baub.e(parcel0, 11, this.k);
        baub.e(parcel0, 12, this.l);
        baub.v(parcel0, 13, this.m, false);
        baub.t(parcel0, 14, this.n, v, false);
        baub.t(parcel0, 15, this.o, v, false);
        baub.t(parcel0, 16, this.p, v, false);
        baub.v(parcel0, 17, this.q, false);
        baub.v(parcel0, 18, this.r, false);
        baub.c(parcel0, v1);
    }
}

