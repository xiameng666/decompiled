package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class MdpDataPlanStatus extends AbstractSafeParcelable {
    public long A;
    private static final Map B;
    public static final Parcelable.Creator CREATOR;
    public static final Map a;
    public String b;
    public String c;
    public String d;
    public long e;
    public long f;
    public MdpFlexTimeWindow[] g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public List n;
    public long o;
    public long p;
    public long q;
    public String r;
    public String s;
    public boolean t;
    public QoeMetrics u;
    public DataPlanUsageHistory v;
    public int w;
    public long x;
    public long y;
    public long z;

    static {
        HashMap hashMap0 = new HashMap();
        MdpDataPlanStatus.a = hashMap0;
        hashMap0.put(Integer.valueOf(0), "UNSPECIFIED");
        hashMap0.put(Integer.valueOf(1), "THROTTLED");
        hashMap0.put(Integer.valueOf(2), "BLOCKED");
        hashMap0.put(Integer.valueOf(3), "PAY_AS_YOU_GO");
        MdpDataPlanStatus.B = new HashMap();
        for(Object object0: hashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getValue();
            Integer integer0 = (Integer)((Map.Entry)object0).getKey();
            MdpDataPlanStatus.B.put(s, integer0);
        }
        MdpDataPlanStatus.CREATOR = new crva();
    }

    public MdpDataPlanStatus() {
        this.t = true;
    }

    public MdpDataPlanStatus(String s, String s1, String s2, long v, long v1, MdpFlexTimeWindow[] arr_mdpFlexTimeWindow, int v2, String s3, String s4, String s5, String s6, int v3, List list0, long v4, long v5, long v6, String s7, String s8, boolean z, QoeMetrics qoeMetrics0, DataPlanUsageHistory dataPlanUsageHistory0, int v7, long v8, long v9, long v10, long v11) {
        this.t = true;
        this.b = s;
        this.i = s3;
        this.j = s4;
        this.c = s1;
        this.d = s2;
        this.e = v;
        this.f = v1;
        this.g = arr_mdpFlexTimeWindow;
        if(!MdpDataPlanStatus.a.containsKey(Integer.valueOf(v2))) {
            throw new IllegalArgumentException("Illegal overusage policy: " + v2);
        }
        this.h = v2;
        this.o = v4;
        this.p = v5;
        this.q = v6;
        this.r = s7;
        this.s = s8;
        this.k = s5;
        this.t = z;
        this.l = s6;
        this.m = v3;
        this.n = list0;
        this.u = qoeMetrics0;
        this.v = dataPlanUsageHistory0;
        this.w = v7;
        this.x = v8;
        this.y = v9;
        this.z = v10;
        this.A = v11;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && bata.b(this.b, ((MdpDataPlanStatus)object0).b) && bata.b(this.c, ((MdpDataPlanStatus)object0).c) && bata.b(this.d, ((MdpDataPlanStatus)object0).d) && bata.b(Long.valueOf(this.e), Long.valueOf(((MdpDataPlanStatus)object0).e)) && bata.b(Long.valueOf(this.f), Long.valueOf(((MdpDataPlanStatus)object0).f)) && Arrays.equals(this.g, ((MdpDataPlanStatus)object0).g) && bata.b(Integer.valueOf(this.h), Integer.valueOf(((MdpDataPlanStatus)object0).h)) && bata.b(Long.valueOf(this.o), Long.valueOf(((MdpDataPlanStatus)object0).o)) && bata.b(Long.valueOf(this.p), Long.valueOf(((MdpDataPlanStatus)object0).p)) && bata.b(Long.valueOf(this.q), Long.valueOf(((MdpDataPlanStatus)object0).q)) && bata.b(this.r, ((MdpDataPlanStatus)object0).r) && bata.b(this.i, ((MdpDataPlanStatus)object0).i) && bata.b(this.s, ((MdpDataPlanStatus)object0).s) && bata.b(this.j, ((MdpDataPlanStatus)object0).j) && bata.b(Boolean.valueOf(this.t), Boolean.valueOf(((MdpDataPlanStatus)object0).t)) && bata.b(this.k, ((MdpDataPlanStatus)object0).k) && bata.b(this.l, ((MdpDataPlanStatus)object0).l) && bata.b(Integer.valueOf(this.m), Integer.valueOf(((MdpDataPlanStatus)object0).m)) && bata.b(this.n, ((MdpDataPlanStatus)object0).n) && bata.b(this.u, ((MdpDataPlanStatus)object0).u) && bata.b(this.v, ((MdpDataPlanStatus)object0).v);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(new Object[]{Arrays.hashCode(new Object[]{this.b, this.c, this.d, ((long)this.e), ((long)this.f), this.i, this.j, this.k, this.l, ((int)this.m), this.n, this.u, this.v}), Arrays.hashCode(this.g)}), ((int)this.h), ((long)this.o), ((long)this.p), ((long)this.q), this.r, this.s, Boolean.valueOf(this.t)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("PlanName", this.b, arrayList0);
        basz.b("ExpirationTime", this.c, arrayList0);
        basz.b("TrafficCategory", this.d, arrayList0);
        basz.b("QuotaBytes", Long.valueOf(this.e), arrayList0);
        basz.b("QuotaMinutes", Long.valueOf(this.f), arrayList0);
        basz.b("FlexTimeWindows", Arrays.toString(this.g), arrayList0);
        int v = this.h;
        String s = (String)MdpDataPlanStatus.a.get(Integer.valueOf(v));
        if(s == null) {
            throw new IllegalArgumentException("Illegal overusage policy string: " + v);
        }
        basz.b("OverUsagePolicy", s, arrayList0);
        basz.b("RemainingBytes", Long.valueOf(this.p), arrayList0);
        basz.b("RemainingMinutes", Long.valueOf(this.q), arrayList0);
        basz.b("ShortDescription", this.k, arrayList0);
        basz.b("DisplayRefreshPeriod", this.l, arrayList0);
        basz.b("PlanType", Integer.valueOf(this.m), arrayList0);
        basz.b("Pmtcs", this.n, arrayList0);
        basz.b("SnapshotTime", Long.valueOf(this.o), arrayList0);
        basz.b("Description", this.r, arrayList0);
        basz.b("PlanId", this.i, arrayList0);
        basz.b("Balance", this.s, arrayList0);
        basz.b("ModuleName", this.j, arrayList0);
        basz.b("IsActive", Boolean.valueOf(this.t), arrayList0);
        basz.b("QoeMetrics", this.u, arrayList0);
        basz.b("DataPlanUsageHistory", this.v, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.b, false);
        baub.v(parcel0, 2, this.c, false);
        baub.v(parcel0, 3, this.d, false);
        baub.q(parcel0, 4, this.e);
        baub.q(parcel0, 5, this.f);
        baub.J(parcel0, 6, this.g, v);
        baub.o(parcel0, 7, this.h);
        baub.v(parcel0, 8, this.i, false);
        baub.v(parcel0, 9, this.j, false);
        baub.v(parcel0, 10, this.k, false);
        baub.v(parcel0, 11, this.l, false);
        baub.o(parcel0, 12, this.m);
        baub.E(parcel0, 13, this.n);
        baub.q(parcel0, 20, this.o);
        baub.q(parcel0, 21, this.p);
        baub.q(parcel0, 22, this.q);
        baub.v(parcel0, 23, this.r, false);
        baub.v(parcel0, 24, this.s, false);
        baub.e(parcel0, 25, this.t);
        baub.t(parcel0, 26, this.u, v, false);
        baub.t(parcel0, 27, this.v, v, false);
        baub.o(parcel0, 28, this.w);
        baub.q(parcel0, 29, this.x);
        baub.q(parcel0, 30, this.y);
        baub.q(parcel0, 0x1F, this.z);
        baub.q(parcel0, 0x20, this.A);
        baub.c(parcel0, v1);
    }
}

