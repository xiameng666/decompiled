package com.google.android.gms.ads.internal.client;

import aazz;
import android.os.Parcel;
import wby;
import wbz;

public final class z extends wby implements aa {
    private final aazz a;

    public z() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    public z(aazz aazz0) {
        super("com.google.android.gms.ads.internal.client.IAdListener");
        this.a = aazz0;
    }

    @Override  // com.google.android.gms.ads.internal.client.aa
    public final void a() {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                aazz aazz0 = this.a;
                if(aazz0 != null) {
                    aazz0.b();
                }
                break;
            }
            case 2: {
                parcel0.readInt();
                z.gr(parcel0);
                break;
            }
            case 4: {
                aazz aazz1 = this.a;
                if(aazz1 != null) {
                    aazz1.d();
                }
                break;
            }
            case 5: {
                aazz aazz2 = this.a;
                if(aazz2 != null) {
                    aazz2.e();
                }
                break;
            }
            case 6: {
                aazz aazz3 = this.a;
                if(aazz3 != null) {
                    aazz3.a();
                }
                break;
            }
            case 7: {
                aazz aazz4 = this.a;
                if(aazz4 != null) {
                    aazz4.f();
                }
                break;
            }
            case 8: {
                AdErrorParcel adErrorParcel0 = (AdErrorParcel)wbz.a(parcel0, AdErrorParcel.CREATOR);
                z.gr(parcel0);
                aazz aazz5 = this.a;
                if(aazz5 != null) {
                    aazz5.c(adErrorParcel0.b());
                }
                break;
            }
            case 3: 
            case 9: {
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

