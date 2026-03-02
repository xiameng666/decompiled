package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aoap;
import aolo;
import aolq;
import aolw;
import gfsx;
import gged_interceptors;
import ggna;
import java.util.List;

public final class MetricsContextImpl.FillContextImpl implements MetricsContext.FillContext {
    public static final Parcelable.Creator CREATOR;
    private final gfsx a;
    private final gged_interceptors b;
    private final gfsx c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    static {
        MetricsContextImpl.FillContextImpl.CREATOR = new aoap();
    }

    public MetricsContextImpl.FillContextImpl(aolw aolw0, List list0, aolo aolo0, boolean z, boolean z1, boolean z2) {
        this.a = gfsx.l(aolw0);
        this.b = gged_interceptors.i(list0);
        this.c = gfsx.l(aolo0);
        this.d = z;
        this.e = z1;
        this.f = z2;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext$FillContext
    public final gfsx a() {
        return this.a;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext$FillContext
    public final gfsx b() {
        return this.c;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext$FillContext
    public final gged_interceptors c() {
        return this.b;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext$FillContext
    public final gged_interceptors d() {
        return ggna.a;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext$FillContext
    public final boolean e() {
        return this.d;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext$FillContext
    public final boolean f() {
        return this.f;
    }

    @Override  // com.google.android.gms.autofill.metrics.MetricsContext$FillContext
    public final boolean g() {
        return this.e;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        gfsx gfsx0 = this.a;
        parcel0.writeInt(((int)gfsx0.i()));
        if(gfsx0.i()) {
            parcel0.writeByteArray(((aolw)gfsx0.d()).toBytesArray());
        }
        gged_interceptors gged0 = this.b;
        parcel0.writeInt(gged0.size());
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            parcel0.writeByteArray(((aolq)gged0.get(v2)).toBytesArray());
        }
        gfsx gfsx1 = this.c;
        parcel0.writeInt(((int)gfsx1.i()));
        if(gfsx1.i()) {
            parcel0.writeInt(((aolo)gfsx1.d()).a());
        }
        parcel0.writeInt(((int)this.d));
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(((int)this.f));
    }
}

