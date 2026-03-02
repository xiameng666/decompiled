package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import ccmy;
import ccnb;
import ccqt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;

public final class Button extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Action b;

    static {
        Button.CREATOR = new ccqt();
    }

    public Button(String s, Action action0) {
        ibuq.f(s, "label");
        ibuq.f(action0, "action");
        super();
        this.a = s;
        this.b = action0;
    }

    public final ccnb a() {
        ccmy ccmy0 = this.b.a();
        return new ccnb(this.a, ccmy0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Button)) {
            return false;
        }
        return ibuq.m(this.a, ((Button)object0).a) ? ibuq.m(this.b, ((Button)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Button(label=" + this.a + ", action=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

