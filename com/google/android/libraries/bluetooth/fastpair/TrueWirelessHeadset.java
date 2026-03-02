package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fgnw;
import fgox;
import fgoy;

public abstract class TrueWirelessHeadset implements Parcelable, fgnw {
    public static final Parcelable.Creator CREATOR;

    static {
        TrueWirelessHeadset.CREATOR = new fgox();
    }

    public abstract long a();

    @Override  // fgnw
    public abstract long b();

    public abstract Uri c();

    public abstract HeadsetPiece d();

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract HeadsetPiece e();

    public abstract HeadsetPiece f();

    public abstract String g();

    public abstract boolean h();

    @Override  // fgnw
    public abstract String i();

    public static fgoy j() {
        fgoy fgoy0 = new fgoy();
        fgoy0.e(0L);
        fgoy0.g("");
        fgoy0.b(0L);
        fgoy0.d(false);
        return fgoy0;
    }

    @Override  // fgnw
    public final int k() {
        int v = TrueWirelessHeadset.o(this.e().a());
        if(TrueWirelessHeadset.o(this.f().a())) {
            ++v;
        }
        return TrueWirelessHeadset.o(this.d().a()) ? v + 1 : v;
    }

    @Override  // fgnw
    public final Parcelable l() {
        return this;
    }

    @Override  // fgnw
    public final boolean m() {
        return this.e().f() || this.f().f() || this.d().f();
    }

    public final boolean n() {
        HeadsetPiece headsetPiece0 = this.d();
        return headsetPiece0.a() == 100 && headsetPiece0.e() && !this.m();
    }

    public static boolean o(int v) {
        return v >= 0 && v <= 100;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.g());
        this.e().writeToParcel(parcel0, v);
        this.f().writeToParcel(parcel0, v);
        this.d().writeToParcel(parcel0, v);
        parcel0.writeParcelable(this.c(), v);
        parcel0.writeLong(this.a());
        parcel0.writeString(this.i());
        parcel0.writeLong(this.b());
        parcel0.writeByte(((byte)this.h()));
    }
}

