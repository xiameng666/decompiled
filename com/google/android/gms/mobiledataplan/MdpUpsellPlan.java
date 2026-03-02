package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crvp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MdpUpsellPlan extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    public final String m;
    public final List n;
    public final List o;

    static {
        MdpUpsellPlan.CREATOR = new crvp();
    }

    public MdpUpsellPlan(String s, String s1, String s2, long v, String s3, String s4, long v1, long v2, String s5, String s6, int v3, List list0, String s7, List list1, List list2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = s3;
        this.f = s4;
        this.g = v1;
        this.h = v2;
        this.i = s5;
        this.j = s6;
        this.k = v3;
        this.l = list0;
        this.m = s7;
        this.n = list1;
        this.o = list2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof MdpUpsellPlan) ? bata.b(this.a, ((MdpUpsellPlan)object0).a) && bata.b(this.b, ((MdpUpsellPlan)object0).b) && bata.b(this.c, ((MdpUpsellPlan)object0).c) && bata.b(Long.valueOf(this.d), Long.valueOf(((MdpUpsellPlan)object0).d)) && bata.b(this.e, ((MdpUpsellPlan)object0).e) && bata.b(this.f, ((MdpUpsellPlan)object0).f) && bata.b(Long.valueOf(this.g), Long.valueOf(((MdpUpsellPlan)object0).g)) && bata.b(Long.valueOf(this.h), Long.valueOf(((MdpUpsellPlan)object0).h)) && bata.b(this.i, ((MdpUpsellPlan)object0).i) && bata.b(this.j, ((MdpUpsellPlan)object0).j) && bata.b(Integer.valueOf(this.k), Integer.valueOf(((MdpUpsellPlan)object0).k)) && bata.b(this.l, ((MdpUpsellPlan)object0).l) && bata.b(this.m, ((MdpUpsellPlan)object0).m) && bata.b(this.n, ((MdpUpsellPlan)object0).n) && bata.b(this.o, ((MdpUpsellPlan)object0).o) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, ((long)this.d), this.e, this.f, ((long)this.g), ((long)this.h), this.i, this.j, ((int)this.k), this.l, this.m, this.n, this.o});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("PlanId", this.a, arrayList0);
        basz.b("PlanName", this.b, arrayList0);
        basz.b("PlanType", this.c, arrayList0);
        basz.b("Cost", Long.valueOf(this.d), arrayList0);
        basz.b("CostCurrency", this.e, arrayList0);
        basz.b("ConnectionType", this.f, arrayList0);
        basz.b("DurationInSeconds", Long.valueOf(this.g), arrayList0);
        basz.b("mQuotaBytes", Long.valueOf(this.h), arrayList0);
        basz.b("mOfferContext", this.i, arrayList0);
        basz.b("planDescription", this.j, arrayList0);
        basz.b("offerType", Integer.valueOf(this.k), arrayList0);
        basz.b("filterTags", this.l, arrayList0);
        basz.b("paymentUrl", this.m, arrayList0);
        basz.b("fundSources", this.n, arrayList0);
        basz.b("paymentGatewayConfig", this.o, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.q(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.q(parcel0, 7, this.g);
        baub.q(parcel0, 8, this.h);
        baub.v(parcel0, 9, this.i, false);
        baub.v(parcel0, 10, this.j, false);
        baub.o(parcel0, 11, this.k);
        baub.x(parcel0, 12, this.l, false);
        baub.v(parcel0, 13, this.m, false);
        baub.E(parcel0, 14, this.n);
        baub.y(parcel0, 15, this.o, false);
        baub.c(parcel0, v1);
    }
}

