package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ethw;
import etir;
import etis;
import java.util.ArrayList;
import java.util.Arrays;

public class PushTokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final byte[] c;
    public final String d;
    public final String e;
    public final UserAddress f;
    public final boolean g;
    final int[] h;
    final IBinder i;
    public final CobadgedTokenInfo j;
    public final SupervisedUserInfo k;
    public final String[] l;
    public final PushTokenizeExtraOptions m;

    static {
        PushTokenizeRequest.CREATOR = new etis();
    }

    public PushTokenizeRequest(int v, int v1, byte[] arr_b, String s, String s1, UserAddress userAddress0, boolean z, int[] arr_v, IBinder iBinder0, CobadgedTokenInfo cobadgedTokenInfo0, SupervisedUserInfo supervisedUserInfo0, String[] arr_s, PushTokenizeExtraOptions pushTokenizeExtraOptions0) {
        this.a = v;
        this.b = v1;
        this.c = arr_b;
        this.d = s;
        this.e = s1;
        this.f = userAddress0;
        this.g = z;
        this.h = arr_v;
        this.i = iBinder0;
        this.j = cobadgedTokenInfo0;
        this.k = supervisedUserInfo0;
        this.l = arr_s;
        this.m = pushTokenizeExtraOptions0;
    }

    public final etir a() {
        etir etir0 = new etir();
        etir0.a = this.a;
        etir0.b = this.b;
        etir0.c = this.c;
        etir0.d = this.d;
        etir0.e = this.e;
        etir0.f = this.f;
        etir0.g = this.g;
        etir0.h = this.j;
        etir0.i = this.k;
        etir0.j = this.m;
        return etir0;
    }

    public final boolean b(int v) {
        int[] arr_v = this.h;
        if(arr_v != null) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                if(v == arr_v[v1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ethw c() {
        IBinder iBinder0 = this.i;
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
        return (iInterface0 instanceof ethw) ? ((ethw)iInterface0) : new ethw(iBinder0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PushTokenizeRequest) && this.a == ((PushTokenizeRequest)object0).a && this.b == ((PushTokenizeRequest)object0).b && Arrays.equals(this.c, ((PushTokenizeRequest)object0).c) && bata.b(this.d, ((PushTokenizeRequest)object0).d) && bata.b(this.e, ((PushTokenizeRequest)object0).e) && bata.b(this.f, ((PushTokenizeRequest)object0).f) && this.g == ((PushTokenizeRequest)object0).g && Arrays.equals(this.h, ((PushTokenizeRequest)object0).h) && bata.b(this.i, ((PushTokenizeRequest)object0).i) && bata.b(this.j, ((PushTokenizeRequest)object0).j) && bata.b(this.k, ((PushTokenizeRequest)object0).k) && Arrays.equals(this.l, ((PushTokenizeRequest)object0).l) && bata.b(this.m, ((PushTokenizeRequest)object0).m);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.c);
        Integer integer1 = Arrays.hashCode(this.h);
        Integer integer2 = Arrays.hashCode(this.l);
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), integer0, this.d, this.e, this.f, Boolean.valueOf(this.g), integer1, this.i, this.j, this.k, integer2, this.m});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("network", Integer.valueOf(this.a), arrayList0);
        basz.b("tokenServiceProvider", Integer.valueOf(this.b), arrayList0);
        basz.b("opaquePaymentCard", Arrays.toString(this.c), arrayList0);
        basz.b("lastDigits", this.d, arrayList0);
        basz.b("displayName", this.e, arrayList0);
        basz.b("userAddress", this.f, arrayList0);
        basz.b("isTransit", Boolean.valueOf(this.g), arrayList0);
        basz.b("supportedCallbackRequestTypes", Arrays.toString(this.h), arrayList0);
        basz.b("pushTokenizeCallbacksBinder", this.i, arrayList0);
        basz.b("cobadgedTokenInfo", this.j, arrayList0);
        basz.b("supervisedUserInfo", this.k, arrayList0);
        basz.b("supportedTokenRequestorIds", Arrays.toString(this.l), arrayList0);
        basz.b("pushTokenizeExtraOptions", this.m, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.i(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.t(parcel0, 7, this.f, v, false);
        baub.e(parcel0, 8, this.g);
        baub.p(parcel0, 9, this.h, false);
        baub.D(parcel0, 10, this.i);
        baub.t(parcel0, 11, this.j, v, false);
        baub.t(parcel0, 12, this.k, v, false);
        baub.w(parcel0, 13, this.l, false);
        baub.t(parcel0, 14, this.m, v, false);
        baub.c(parcel0, v1);
    }
}

