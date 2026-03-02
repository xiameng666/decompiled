package com.google.android.libraries.bluetooth.fastpair;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fglz;
import gyyx;

public abstract class Event implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        Event.CREATOR = new fglz();
    }

    public abstract long a();

    public abstract BluetoothDevice b();

    public abstract gyyx c();

    public abstract Boolean d();

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Boolean e();

    public abstract Boolean f();

    public abstract Byte g();

    public abstract Byte h();

    public abstract Byte i();

    public abstract Byte j();

    public abstract Exception k();

    public abstract Integer l();

    public abstract Integer m();

    public abstract Integer n();

    public abstract Integer o();

    public abstract Integer p();

    public abstract Integer q();

    public abstract Integer r();

    public abstract Integer s();

    public abstract Short t();

    public abstract String u();

    public final boolean v() {
        return this.l() != null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.c().bY);
        parcel0.writeLong(this.a());
        parcel0.writeValue(this.t());
        parcel0.writeParcelable(this.b(), 0);
        parcel0.writeValue(this.h());
        parcel0.writeValue(this.j());
        parcel0.writeValue(this.i());
        parcel0.writeValue(this.s());
        parcel0.writeValue(this.m());
        parcel0.writeValue(this.l());
        parcel0.writeSerializable(this.k());
        parcel0.writeValue(this.d());
        parcel0.writeValue(this.e());
        parcel0.writeValue(this.f());
        parcel0.writeString(this.u());
        parcel0.writeValue(this.p());
        parcel0.writeValue(this.q());
        parcel0.writeValue(this.r());
        parcel0.writeValue(this.o());
        parcel0.writeValue(this.g());
        parcel0.writeValue(this.n());
    }
}

