package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.autofill.AutofillId;
import aoao;
import aohp;
import aolo;
import aolw;
import aomj;
import ggdy;
import gged_interceptors;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class MetricsContextImpl implements MetricsContext {
    public static final Parcelable.Creator CREATOR;
    public final HashMap a;
    public final ggdy b;
    public int c;
    private final int d;
    private final aohp e;
    private final aomj f;
    private final AtomicInteger g;

    static {
        MetricsContextImpl.CREATOR = new aoao();
    }

    public MetricsContextImpl(int v, aohp aohp0, aomj aomj0, int v1, Map map0) {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        this.b = new ggdy();
        this.d = v;
        this.e = aohp0;
        this.f = aomj0;
        this.g = new AtomicInteger(v1);
        hashMap0.putAll(map0);
        this.c = map0.size() + 1;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int a() {
        return this.g.get();
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int b(AutofillId autofillId0) {
        int v2;
        synchronized(this) {
            HashMap hashMap0 = this.a;
            if(!hashMap0.containsKey(autofillId0)) {
                int v1 = this.c;
                this.c = v1 + 1;
                hashMap0.put(autofillId0, Integer.valueOf(v1));
            }
            v2 = (int)(((Integer)hashMap0.get(autofillId0)));
        }
        return v2;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int c() {
        return this.g.getAndIncrement();
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final int d() {
        return this.d;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final aohp e() {
        return this.e;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final aomj f() {
        return this.f;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final gged_interceptors g() {
        return this.b.h();
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final Map h() {
        return this.a;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext
    public final void i(MetricsContext.FillContext metricsContext$FillContext0) {
        synchronized(this) {
            MetricsContextImpl.FillContextImpl metricsContextImpl$FillContextImpl0 = (metricsContext$FillContext0 instanceof MetricsContextImpl.FillContextImpl) ? ((MetricsContextImpl.FillContextImpl)metricsContext$FillContext0) : new MetricsContextImpl.FillContextImpl(((aolw)metricsContext$FillContext0.a().g()), metricsContext$FillContext0.c(), ((aolo)metricsContext$FillContext0.b().g()), metricsContext$FillContext0.e(), metricsContext$FillContext0.g(), metricsContext$FillContext0.f());
            this.b.i(metricsContextImpl$FillContextImpl0);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        synchronized(this) {
            parcel0.writeInt(this.d);
            parcel0.writeByteArray(this.e.toBytesArray());
            parcel0.writeByteArray(this.f.toBytesArray());
            parcel0.writeInt(this.g.get());
            parcel0.writeInt(this.c);
            parcel0.writeInt(this.a.size());
            for(Object object0: this.a.entrySet()) {
                parcel0.writeTypedObject(((AutofillId)((Map.Entry)object0).getKey()), v);
                parcel0.writeInt(((Integer)((Map.Entry)object0).getValue()).intValue());
            }
            parcel0.writeTypedList(this.b.h());
        }
    }
}

