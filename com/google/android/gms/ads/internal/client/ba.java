package com.google.android.gms.ads.internal.client;

import abat;
import android.os.IInterface;
import android.os.Parcel;
import wby;
import wbz;

public final class ba extends wby implements IInterface {
    private final abat a;

    public ba() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    public ba(abat abat0) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.a = abat0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                AdErrorParcel adErrorParcel0 = (AdErrorParcel)wbz.a(parcel0, AdErrorParcel.CREATOR);
                ba.gr(parcel0);
                if(this.a != null) {
                    adErrorParcel0.a();
                }
                break;
            }
            case 2: {
                abat abat0 = this.a;
                if(abat0 != null) {
                    abat0.a.o();
                }
                break;
            }
            case 3: {
                abat abat1 = this.a;
                if(abat1 != null) {
                    abat1.a.e();
                }
                break;
            }
            case 4: 
            case 5: {
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

