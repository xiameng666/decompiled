package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments.spot.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cxic;
import gfta;
import gftb;
import gzba;
import java.util.Random;

public class SpotPairingSessionData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final Account b;
    public final int c;
    public final int d;
    public final String e;

    static {
        SpotPairingSessionData.CREATOR = new cxic();
    }

    public SpotPairingSessionData(byte[] arr_b, Account account0, int v, int v1, String s) {
        gftb.check(arr_b);
        gftb.check(account0);
        this.a = arr_b;
        this.b = account0;
        this.c = v;
        this.d = v1;
        this.e = gfta.b(s);
    }

    public SpotPairingSessionData(byte[] arr_b, Account account0, gzba gzba0) {
        int v = SpotPairingSessionData.a();
        this(arr_b, account0, gzba0.g, v, "");
    }

    public static int a() {
        return new Random().nextInt(0x7FFFFFFE) + 1;
    }

    public final gzba b() {
        gzba gzba0 = gzba.b(this.c);
        gftb.check(gzba0);
        return gzba0;
    }

    public final boolean c() {
        int v = this.b().ordinal();
        if(v != 0 && v != 1) {
            switch(v) {
                case 2: {
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    return false;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        return true;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

