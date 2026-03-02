package com.google.android.gms.autofill.metrics;

import ProtoLiteMessage;
import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.autofill.AutofillId;
import aoat;
import aoau;
import aohp;
import aolo;
import aolw;
import aomj;
import baub;
import bbcu;
import bboh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ggaf;
import gged_interceptors;
import hftc;
import hfur;
import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SafeMetricsContext extends AbstractSafeParcelable implements MetricsContext {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final byte[] b;
    public final byte[] c;
    public int d;
    public int e;
    public final List f;
    public final List g;
    public final List h;
    private static final bboh i;
    private Map j;
    private AtomicInteger k;

    static {
        SafeMetricsContext.i = bboh.b("SafeMetricsContext", bbcu.cD);
        SafeMetricsContext.CREATOR = new aoau();
    }

    public SafeMetricsContext(int v, byte[] arr_b, byte[] arr_b1, int v1, int v2, List list0, List list1, List list2) {
        this.e = 1;
        this.a = v;
        this.b = arr_b;
        this.c = arr_b1;
        this.d = v1;
        this.k = new AtomicInteger(v1);
        this.e = v2;
        this.f = list0;
        this.g = list1;
        this.j = new HashMap();
        for(int v3 = 0; v3 < list0.size(); ++v3) {
            this.j.put(((AutofillId)list0.get(v3)), ((Integer)list1.get(v3)));
        }
        this.h = list2;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int a() {
        return this.d;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int b(AutofillId autofillId0) {
        int v2;
        synchronized(this) {
            if(!this.j.containsKey(autofillId0)) {
                this.f.add(autofillId0);
                this.g.add(Integer.valueOf(this.e));
                int v1 = this.e;
                this.e = v1 + 1;
                this.j.put(autofillId0, Integer.valueOf(v1));
            }
            v2 = (int)(((Integer)this.j.get(autofillId0)));
        }
        return v2;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int c() {
        int v = this.k.getAndIncrement();
        this.d = this.k.get();
        return v;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int d() {
        return this.a;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final aohp e() {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aohp.a), this.b, 0, this.b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (aohp)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(SafeMetricsContext.i.j(), "Failed to parse app", hfur0);
            return aohp.a;
        }
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final aomj f() {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aomj.a), this.c, 0, this.c.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (aomj)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(SafeMetricsContext.i.j(), "Failed to parse screen", hfur0);
            return aomj.a;
        }
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final gged_interceptors g() {
        return (gged_interceptors)Collection.-EL.stream(this.h).map(new aoat()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final Map h() {
        return this.j;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final void i(MetricsContext.FillContext metricsContext$FillContext0) {
        synchronized(this) {
            SafeFillContext safeFillContext0 = (metricsContext$FillContext0 instanceof SafeFillContext) ? ((SafeFillContext)metricsContext$FillContext0) : new SafeFillContext(((aolw)metricsContext$FillContext0.a().g()), metricsContext$FillContext0.c(), ((aolo)metricsContext$FillContext0.b().g()), metricsContext$FillContext0.e(), metricsContext$FillContext0.g(), metricsContext$FillContext0.f(), metricsContext$FillContext0.d());
            this.h.add(safeFillContext0);
        }
    }

    public static SafeMetricsContext j(MetricsContext metricsContext0) {
        if(metricsContext0 == null) {
            return null;
        }
        if((metricsContext0 instanceof SafeMetricsContext)) {
            return (SafeMetricsContext)metricsContext0;
        }
        int v = metricsContext0.d();
        aohp aohp0 = metricsContext0.e();
        aomj aomj0 = metricsContext0.f();
        int v1 = metricsContext0.a();
        Map map0 = metricsContext0.h();
        SafeMetricsContext safeMetricsContext0 = new SafeMetricsContext(v, aohp0.toBytesArray(), aomj0.toBytesArray(), v1, map0.size() + 1, gged_interceptors.i(map0.keySet()), gged_interceptors.i(map0.values()), new ArrayList());
        gged_interceptors gged0 = metricsContext0.g();
        int v2 = gged0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            safeMetricsContext0.i(((MetricsContext.FillContext)gged0.get(v3)));
        }
        return safeMetricsContext0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.i(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.y(parcel0, 6, this.f, false);
        baub.E(parcel0, 7, this.g);
        baub.y(parcel0, 8, this.h, false);
        baub.c(parcel0, v1);
    }
}

