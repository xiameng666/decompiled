package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eomu;
import j..util.Objects;
import java.util.List;
import java.util.Locale;

public final class GmsTs43Operator extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final List o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;

    static {
        GmsTs43Operator.CREATOR = new eomu();
    }

    public GmsTs43Operator(String s, int v, List list0, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, List list1, String s12, String s13, String s14, String s15, String s16, String s17, String s18, String s19) {
        this.a = s;
        this.b = v;
        this.c = list0;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = s6;
        this.j = s7;
        this.k = s8;
        this.l = s9;
        this.m = s10;
        this.o = list1;
        this.n = s11;
        this.p = s12;
        this.q = s13;
        this.r = s14;
        this.s = s15;
        this.t = s16;
        this.u = s17;
        this.v = s18;
        this.w = s19;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GmsTs43Operator) && this.a.equals(((GmsTs43Operator)object0).a) && this.b == ((GmsTs43Operator)object0).b && this.c.equals(((GmsTs43Operator)object0).c) && this.d.equals(((GmsTs43Operator)object0).d) && this.e.equals(((GmsTs43Operator)object0).e) && this.f.equals(((GmsTs43Operator)object0).f) && this.g.equals(((GmsTs43Operator)object0).g) && this.h.equals(((GmsTs43Operator)object0).h) && this.i.equals(((GmsTs43Operator)object0).i) && this.j.equals(((GmsTs43Operator)object0).j) && this.k.equals(((GmsTs43Operator)object0).k) && Objects.equals(this.l, ((GmsTs43Operator)object0).l) && this.m.equals(((GmsTs43Operator)object0).m) && this.n.equals(((GmsTs43Operator)object0).n) && this.p.equals(((GmsTs43Operator)object0).p) && this.q.equals(((GmsTs43Operator)object0).q) && this.r.equals(((GmsTs43Operator)object0).r) && this.s.equals(((GmsTs43Operator)object0).s) && this.t.equals(((GmsTs43Operator)object0).t) && this.u.equals(((GmsTs43Operator)object0).u) && this.v.equals(((GmsTs43Operator)object0).v) && this.w.equals(((GmsTs43Operator)object0).w);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w});
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "GmsTs43Operator[operation=%s, operationType=%d, operationTargets=%s, companionTerminalId=%s, companionTerminalVendor=%s, companionTerminalModel=%s, companionTerminalSoftwareVersion=%s, companionTerminalFriendlyName=%s, companionTerminalService=%s, companionTerminalIccid=%s, companionTerminalEid=%s, terminalIccid=%s, terminalEid=%s, targetTerminalId=%s, targetTerminalIds=%s, targetTerminalIccid=%s, targetTerminalEid=%s, targetTerminalSerialNumber=%s, targetTerminalModel=%s, oldTerminalId=%s, oldTerminalIccid=%s, messageResponse=%s, messageButton=%s]", this.a, ((int)this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.x(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.v(parcel0, 10, this.j, false);
        baub.v(parcel0, 11, this.k, false);
        baub.v(parcel0, 12, this.l, false);
        baub.v(parcel0, 13, this.m, false);
        baub.v(parcel0, 14, this.n, false);
        baub.x(parcel0, 15, this.o, false);
        baub.v(parcel0, 16, this.p, false);
        baub.v(parcel0, 17, this.q, false);
        baub.v(parcel0, 18, this.r, false);
        baub.v(parcel0, 19, this.s, false);
        baub.v(parcel0, 20, this.t, false);
        baub.v(parcel0, 21, this.u, false);
        baub.v(parcel0, 22, this.v, false);
        baub.v(parcel0, 23, this.w, false);
        baub.c(parcel0, v1);
    }
}

