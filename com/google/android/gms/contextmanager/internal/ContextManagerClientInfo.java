package com.google.android.gms.contextmanager.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.text.TextUtils;
import aqcr;
import batl;
import baub;
import bbna;
import bcvu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xpa;

public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    private xpa l;

    static {
        ContextManagerClientInfo.CREATOR = new bcvu();
    }

    public ContextManagerClientInfo(String s, String s1, int v, String s2, int v1, int v2, int v3) {
        batl.q(s);
        batl.q(s1);
        batl.q(s2);
        this(s, s1, v, s2, v1, v2, null, null, -1, v3, null);
    }

    public ContextManagerClientInfo(String s, String s1, int v, String s2, int v1, int v2, String s3, String s4, int v3, int v4, String s5) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
        this.e = v1;
        this.f = v2;
        this.g = s3;
        this.h = s4;
        this.i = v3;
        this.j = v4;
        this.k = s5;
    }

    public final xpa a() {
        String s = this.a;
        if(s == null) {
            return null;
        }
        if(this.l == null) {
            this.l = new xpa(s);
        }
        return this.l;
    }

    public static ContextManagerClientInfo b(Context context0, String s, aqcr aqcr0) {
        Account account0 = aqcr0.f;
        if(account0 != null) {
            s = account0.name;
        }
        int v = Process.myUid();
        int v1 = bbna.b(context0, "com.google.android.gms");
        int v2 = Process.myPid();
        return new ContextManagerClientInfo(s, "com.google.android.gms", v, aqcr0.a, v1, aqcr0.b, aqcr0.c, aqcr0.d, aqcr0.e, v2, aqcr0.g);
    }

    public final boolean c() {
        return this.a() != null;
    }

    public final boolean d() {
        return this.f == 1;
    }

    public final boolean e() {
        return this.f == 3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ContextManagerClientInfo) ? this.c == ((ContextManagerClientInfo)object0).c && this.e == ((ContextManagerClientInfo)object0).e && this.f == ((ContextManagerClientInfo)object0).f && this.i == ((ContextManagerClientInfo)object0).i && TextUtils.equals(this.a, ((ContextManagerClientInfo)object0).a) && TextUtils.equals(this.b, ((ContextManagerClientInfo)object0).b) && TextUtils.equals(this.d, ((ContextManagerClientInfo)object0).d) && TextUtils.equals(this.g, ((ContextManagerClientInfo)object0).g) && TextUtils.equals(this.h, ((ContextManagerClientInfo)object0).h) && TextUtils.equals(this.k, ((ContextManagerClientInfo)object0).k) : false;
    }

    public final boolean f() {
        return this.f == 0;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), this.d, ((int)this.e), ((int)this.f), this.g, this.h, ((int)this.i)});
    }

    @Override
    public final String toString() {
        return "(accnt=" + this.a() + ", " + this.b + "(" + this.c + "):" + this.d + ", vrsn=" + this.e + ", " + Integer.toString(this.f) + ", 3pPkg = " + this.g + " ,  3pMdlId = " + this.h + " ,  pid = " + this.j + " ,  featureId = " + this.k + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.o(parcel0, 6, this.e);
        baub.o(parcel0, 7, this.f);
        baub.v(parcel0, 8, this.g, false);
        baub.v(parcel0, 9, this.h, false);
        baub.o(parcel0, 10, this.i);
        baub.o(parcel0, 11, this.j);
        baub.v(parcel0, 12, this.k, false);
        baub.c(parcel0, v1);
    }
}

