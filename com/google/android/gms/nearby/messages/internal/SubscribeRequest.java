package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import damw;
import damy;
import damz;
import danb;
import danh;
import danj;
import daoi;

public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final damy b;
    public final Strategy c;
    public final danb d;
    public final MessageFilter e;
    public final PendingIntent f;
    @Deprecated
    public final int g;
    @Deprecated
    public final String h;
    @Deprecated
    public final String i;
    public final byte[] j;
    @Deprecated
    public final boolean k;
    public final danj l;
    @Deprecated
    public final boolean m;
    @Deprecated
    public final ClientAppContext n;
    public final boolean o;
    public final int p;
    public final int q;

    static {
        SubscribeRequest.CREATOR = new daoi();
    }

    public SubscribeRequest(int v, IBinder iBinder0, Strategy strategy0, IBinder iBinder1, MessageFilter messageFilter0, PendingIntent pendingIntent0, int v1, String s, String s1, byte[] arr_b, boolean z, IBinder iBinder2, boolean z1, ClientAppContext clientAppContext0, boolean z2, int v2, int v3) {
        danb danb0;
        damy damy0;
        this.a = v;
        danj danj0 = null;
        if(iBinder0 == null) {
            damy0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            damy0 = (iInterface0 instanceof damy) ? ((damy)iInterface0) : new damw(iBinder0);
        }
        this.b = damy0;
        this.c = strategy0;
        if(iBinder1 == null) {
            danb0 = null;
        }
        else {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            danb0 = (iInterface1 instanceof danb) ? ((danb)iInterface1) : new damz(iBinder1);
        }
        this.d = danb0;
        this.e = messageFilter0;
        this.f = pendingIntent0;
        this.g = v1;
        this.h = s;
        this.i = s1;
        this.j = arr_b;
        this.k = z;
        if(iBinder2 != null) {
            IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            danj0 = (iInterface2 instanceof danj) ? ((danj)iInterface2) : new danh(iBinder2);
        }
        this.l = danj0;
        this.m = z1;
        this.n = ClientAppContext.b(clientAppContext0, s1, s, z1);
        this.o = z2;
        this.p = v2;
        this.q = v3;
    }

    public SubscribeRequest(IBinder iBinder0, Strategy strategy0, IBinder iBinder1, MessageFilter messageFilter0, PendingIntent pendingIntent0, IBinder iBinder2, boolean z, int v) {
        this(iBinder0, strategy0, iBinder1, messageFilter0, pendingIntent0, null, iBinder2, z, 0, v);
    }

    public SubscribeRequest(IBinder iBinder0, Strategy strategy0, IBinder iBinder1, MessageFilter messageFilter0, PendingIntent pendingIntent0, byte[] arr_b, IBinder iBinder2, boolean z, int v, int v1) {
        this(3, iBinder0, strategy0, iBinder1, messageFilter0, pendingIntent0, 0, null, null, arr_b, false, iBinder2, false, null, z, v, v1);
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.b);
        String s1 = String.valueOf(this.c);
        String s2 = String.valueOf(this.d);
        String s3 = String.valueOf(this.e);
        String s4 = String.valueOf(this.f);
        return this.j == null ? "SubscribeRequest{messageListener=" + s + ", strategy=" + s1 + ", callback=" + s2 + ", filter=" + s3 + ", pendingIntent=" + s4 + ", hint=" + null + ", subscribeCallback=" + this.l + ", useRealClientApiKey=" + this.m + ", clientAppContext=" + this.n + ", isDiscardPendingIntent=" + this.o + ", zeroPartyPackageName=" + this.h + ", realClientPackageName=" + this.i + ", isIgnoreNearbyPermission=" + this.k + ", callingContext=" + this.q + "}" : "SubscribeRequest{messageListener=" + s + ", strategy=" + s1 + ", callback=" + s2 + ", filter=" + s3 + ", pendingIntent=" + s4 + ", hint=" + ("<" + this.j.length + " bytes>") + ", subscribeCallback=" + this.l + ", useRealClientApiKey=" + this.m + ", clientAppContext=" + this.n + ", isDiscardPendingIntent=" + this.o + ", zeroPartyPackageName=" + this.h + ", realClientPackageName=" + this.i + ", isIgnoreNearbyPermission=" + this.k + ", callingContext=" + this.q + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        IBinder iBinder0 = null;
        baub.D(parcel0, 2, (this.b == null ? null : this.b.asBinder()));
        baub.t(parcel0, 3, this.c, v, false);
        baub.D(parcel0, 4, (this.d == null ? null : this.d.asBinder()));
        baub.t(parcel0, 5, this.e, v, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.o(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.i(parcel0, 10, this.j, false);
        baub.e(parcel0, 11, this.k);
        danj danj0 = this.l;
        if(danj0 != null) {
            iBinder0 = danj0.asBinder();
        }
        baub.D(parcel0, 12, iBinder0);
        baub.e(parcel0, 13, this.m);
        baub.t(parcel0, 14, this.n, v, false);
        baub.e(parcel0, 15, this.o);
        baub.o(parcel0, 16, this.p);
        baub.o(parcel0, 17, this.q);
        baub.c(parcel0, v1);
    }
}

