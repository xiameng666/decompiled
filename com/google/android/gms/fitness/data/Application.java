package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bquf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Application extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Application a;
    public final String b;

    static {
        Application.a = new Application("com.google.android.gms");
        Application.CREATOR = new bquf();
    }

    public Application(String s) {
        batl.s(s);
        this.b = s;
    }

    public static Application a(String s) {
        return "com.google.android.gms".equals(s) ? Application.a : new Application(s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof Application) ? this.b.equals(((Application)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return String.format("Application{%s}", this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.b, false);
        baub.c(parcel0, v1);
    }
}

