package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bjgu;
import bjgw;
import com.google.android.gms.ads.internal.mediation.client.c;
import com.google.android.gms.ads.internal.mediation.client.e;
import wby;
import wbz;

public abstract class ap extends wby implements aq {
    public ap() {
        super("com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public static aq asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return (iInterface0 instanceof aq) ? ((aq)iInterface0) : new ao(iBinder0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw2;
        bjgw bjgw0;
        e e0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    bjgw0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw bjgw1 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
                    bjgw0 = bjgw1;
                }
                AdSizeParcel adSizeParcel0 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
                String s = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    e0 = (iInterface1 instanceof e) ? ((e)iInterface1) : new c(iBinder1);
                }
                int v1 = parcel0.readInt();
                ap.gr(parcel0);
                IBinder iBinder2 = this.newAdManager(bjgw0, adSizeParcel0, s, e0, v1);
                parcel1.writeNoException();
                parcel1.writeStrongBinder(iBinder2);
                return true;
            }
            case 2: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    bjgw2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw bjgw3 = (iInterface2 instanceof bjgw) ? ((bjgw)iInterface2) : new bjgu(iBinder3);
                    bjgw2 = bjgw3;
                }
                AdSizeParcel adSizeParcel1 = (AdSizeParcel)wbz.a(parcel0, AdSizeParcel.CREATOR);
                String s1 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface3 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    e0 = (iInterface3 instanceof e) ? ((e)iInterface3) : new c(iBinder4);
                }
                int v2 = parcel0.readInt();
                int v3 = parcel0.readInt();
                ap.gr(parcel0);
                IBinder iBinder5 = this.newAdManagerByType(bjgw2, adSizeParcel1, s1, e0, v2, v3);
                parcel1.writeNoException();
                parcel1.writeStrongBinder(iBinder5);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

