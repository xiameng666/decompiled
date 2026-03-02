package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bjgu;
import bjgw;
import wbx;
import wbz;

public final class al extends wbx implements an {
    public al(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final AdSizeParcel a() {
        Parcel parcel0 = this.hM(12, this.jo());
        AdSizeParcel adSizeParcel0 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
        parcel0.recycle();
        return adSizeParcel0;
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final bk b() {
        bk bk0;
        Parcel parcel0 = this.hM(26, this.jo());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            bk0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            bk0 = (iInterface0 instanceof bk) ? ((bk)iInterface0) : new bi(iBinder0);
        }
        parcel0.recycle();
        return bk0;
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final bjgw c() {
        bjgw bjgw0;
        Parcel parcel0 = this.hM(1, this.jo());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            bjgw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
        }
        parcel0.recycle();
        return bjgw0;
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void d() {
        this.jp(2, this.jo());
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void e() {
        this.jp(5, this.jo());
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void f() {
        this.jp(6, this.jo());
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void g(aa aa0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, aa0);
        this.jp(7, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void h(AdSizeParcel adSizeParcel0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, adSizeParcel0);
        this.jp(13, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void i(ax ax0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, ax0);
        this.jp(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void j(boolean z) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(((int)z));
        this.jp(34, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void k(long v) {
        Parcel parcel0 = this.jo();
        parcel0.writeLong(v);
        this.jp(0x30, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void l(bjgw bjgw0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, bjgw0);
        this.jp(44, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void m(AdRequestParcel adRequestParcel0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, adRequestParcel0);
        Parcel parcel1 = this.hM(4, parcel0);
        wbz.i(parcel1);
        parcel1.recycle();
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void n() {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(0);
        this.jp(22, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void o(AdRequestParcel adRequestParcel0, ab ab0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, adRequestParcel0);
        wbz.h(parcel0, ab0);
        this.jp(43, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void p(x x0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, x0);
        this.jp(20, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void q(ba ba0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, ba0);
        this.jp(45, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.an
    public final void v(bg bg0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, bg0);
        this.jp(42, parcel0);
    }
}

