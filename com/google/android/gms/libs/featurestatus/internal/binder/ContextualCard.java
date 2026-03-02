package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import ccqv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class ContextualCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final Action c;
    public final Buttons d;
    public final ProgressBar e;
    public final int f;
    public final int g;

    static {
        ContextualCard.CREATOR = new ccqv();
    }

    public ContextualCard(String s, String s1, Action action0, Buttons buttons0, ProgressBar progressBar0, int v, int v1) {
        ibuq.f(s, "title");
        ibuq.f(s1, "description");
        ibuq.f(buttons0, "buttons");
        super();
        this.a = s;
        this.b = s1;
        this.c = action0;
        this.d = buttons0;
        this.e = progressBar0;
        this.f = v;
        this.g = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContextualCard)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ContextualCard)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ContextualCard)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ContextualCard)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ContextualCard)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((ContextualCard)object0).e)) {
            return false;
        }
        return this.f == ((ContextualCard)object0).f ? this.g == ((ContextualCard)object0).g : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d.hashCode()) * 0x1F;
        ProgressBar progressBar0 = this.e;
        if(progressBar0 != null) {
            v = progressBar0.hashCode();
        }
        return ((v1 + v) * 0x1F + this.f) * 0x1F + this.g;
    }

    @Override
    public final String toString() {
        return "ContextualCard(title=" + this.a + ", description=" + this.b + ", action=" + this.c + ", buttons=" + this.d + ", progressBar=" + this.e + ", stateNumber=" + this.f + ", severityNumber=" + this.g + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.o(parcel0, 6, this.f);
        baub.t(parcel0, 7, this.d, v, false);
        baub.o(parcel0, 8, this.g);
        baub.c(parcel0, v1);
    }
}

