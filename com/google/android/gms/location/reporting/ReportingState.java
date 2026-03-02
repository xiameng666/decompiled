package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import cnts;
import cntt;
import cntx;
import cnug;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    static {
        ReportingState.CREATOR = new cntx();
    }

    public ReportingState(int v, int v1, boolean z, boolean z1, int v2, int v3, Integer integer0, boolean z2, boolean z3) {
        this.f = v;
        this.g = v1;
        this.a = z;
        this.b = z1;
        this.h = v2;
        this.i = v3;
        this.c = integer0;
        this.d = z2;
        this.e = z3;
    }

    public final int a() {
        Integer integer0 = this.c;
        if(integer0 != null) {
            return (int)integer0;
        }
        throw new SecurityException("Device tag restricted to approved apps");
    }

    public final int b() {
        return cnts.a(this.h);
    }

    public final int c() {
        return cntt.a(this.g);
    }

    public final int d() {
        return cntt.a(this.f);
    }

    public final boolean e() {
        return this.f > 0 && this.g > 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ReportingState) ? this.f == ((ReportingState)object0).f && this.g == ((ReportingState)object0).g && this.a == ((ReportingState)object0).a && this.b == ((ReportingState)object0).b && this.h == ((ReportingState)object0).h && this.i == ((ReportingState)object0).i && bata.b(this.c, ((ReportingState)object0).c) && this.d == ((ReportingState)object0).d && this.e == ((ReportingState)object0).e : false;
    }

    public final boolean f() {
        return !this.e() && this.b() == 0;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.f), ((int)this.g), Boolean.valueOf(this.a), Boolean.valueOf(this.b), ((int)this.h), ((int)this.i), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    @Override
    public final String toString() {
        return this.c == null ? "ReportingState{reportingEnabled=" + this.f + ", historyEnabled=" + this.g + ", allowed=" + this.a + ", active=" + this.b + ", expectedOptInResult=" + this.h + ", expectedOptInResultAssumingLocationEnabled=" + this.i + ", deviceTag=" + "(hidden-from-unauthorized-caller)" + ", canAccessSettings=" + this.d + ", hasMigratedToOdlh=" + this.e + "}" : "ReportingState{reportingEnabled=" + this.f + ", historyEnabled=" + this.g + ", allowed=" + this.a + ", active=" + this.b + ", expectedOptInResult=" + this.h + ", expectedOptInResultAssumingLocationEnabled=" + this.i + ", deviceTag=" + cnug.d(this.c) + ", canAccessSettings=" + this.d + ", hasMigratedToOdlh=" + this.e + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.d());
        baub.o(parcel0, 3, this.c());
        baub.e(parcel0, 4, this.a);
        baub.e(parcel0, 5, this.b);
        baub.o(parcel0, 7, this.b());
        baub.F(parcel0, 8, this.c);
        baub.o(parcel0, 9, cnts.a(this.i));
        baub.e(parcel0, 10, this.d);
        baub.e(parcel0, 11, this.e);
        baub.c(parcel0, v1);
    }
}

