package com.google.android.gms.auth.proximity.firstparty;

import algv;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import batl;
import baub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SyncedDevicesUpdateSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR;
    public final PendingIntent a;
    public final DeviceFilter b;
    public final String c;
    public final int d;

    static {
        SyncedDevicesUpdateSubscription.CREATOR = new algv();
    }

    public SyncedDevicesUpdateSubscription(PendingIntent pendingIntent0, DeviceFilter deviceFilter0, String s, int v) {
        batl.s(pendingIntent0);
        this.a = pendingIntent0;
        batl.s(deviceFilter0);
        this.b = deviceFilter0;
        batl.s(s);
        this.c = s;
        this.d = v;
    }

    @Override  // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final PendingIntent a() {
        return this.a;
    }

    @Override  // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final String b() {
        return this.c;
    }

    public static int c(List list0, DeviceFilter deviceFilter0) {
        batl.s(deviceFilter0);
        if(!list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)object0;
                if((deviceFilter0.a == null || deviceFilter0.a.booleanValue() == syncedCryptauthDevice0.e) && (deviceFilter0.c == null || deviceFilter0.c.booleanValue() == syncedCryptauthDevice0.h) && (deviceFilter0.b == null || deviceFilter0.b.booleanValue() == syncedCryptauthDevice0.f) && (deviceFilter0.d.isEmpty() || deviceFilter0.d.contains(syncedCryptauthDevice0.i)) && (deviceFilter0.e == null || deviceFilter0.e.booleanValue() == syncedCryptauthDevice0.j) && ((deviceFilter0.f == null || deviceFilter0.f.booleanValue() == syncedCryptauthDevice0.k) && syncedCryptauthDevice0.l.containsAll(deviceFilter0.g) && syncedCryptauthDevice0.m.containsAll(deviceFilter0.h))) {
                    arrayList0.add(Base64.encodeToString(syncedCryptauthDevice0.a, 8));
                }
            }
            if(!arrayList0.isEmpty()) {
                Collections.sort(arrayList0);
                return arrayList0.hashCode();
            }
        }
        return -1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a.equals(((SyncedDevicesUpdateSubscription)object0).a) && this.b.equals(((SyncedDevicesUpdateSubscription)object0).b) && this.c.equals(((SyncedDevicesUpdateSubscription)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        return String.format("SyncedDevicesUpdateSubscription{mCallbackIntent=%s, mDeviceFilter=%s, mPackageName=\'%s\', mLastMatchToken=%d}", this.a, this.b, this.c, ((int)this.d));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

