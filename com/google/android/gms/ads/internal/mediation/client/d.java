package com.google.android.gms.ads.internal.mediation.client;

import android.os.Parcel;
import wby;
import wbz;

public abstract class d extends wby implements e {
    public d() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                d.gr(parcel0);
                f f0 = this.d(s);
                parcel1.writeNoException();
                wbz.h(parcel1, f0);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                d.gr(parcel0);
                boolean z = this.c(s1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 3: {
                String s2 = parcel0.readString();
                d.gr(parcel0);
                com.google.android.gms.ads.internal.mediation.client.rtb.f f1 = this.e(s2);
                parcel1.writeNoException();
                wbz.h(parcel1, f1);
                return true;
            }
            case 4: {
                String s3 = parcel0.readString();
                d.gr(parcel0);
                boolean z1 = this.a(s3);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

