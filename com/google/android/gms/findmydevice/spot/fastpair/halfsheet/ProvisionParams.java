package com.google.android.gms.findmydevice.spot.fastpair.halfsheet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bonl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fgsj;
import gfta;
import gftb;
import j..util.Objects;
import java.util.Arrays;

public class ProvisionParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final Account b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    static {
        ProvisionParams.CREATOR = new bonl();
    }

    public ProvisionParams(byte[] arr_b, Account account0, String s, String s1, String s2) {
        this(arr_b, account0, s, s1, s2, 0);
    }

    public ProvisionParams(byte[] arr_b, Account account0, String s, String s1, String s2, int v) {
        gftb.check(arr_b);
        this.a = arr_b;
        gftb.check(account0);
        this.b = account0;
        this.c = gfta.b(s);
        this.d = s1;
        this.e = s2;
        this.f = v;
    }

    public final fgsj a() {
        return fgsj.a(this.e);
    }

    public final int b() {
        switch(this.d) {
            case "ACCESSORY_TRACKED_BY_OWNER_NOTIFICATION": {
                return 6;
            }
            case "INITIAL_PAIRING": {
                return 2;
            }
            case "RETROACTIVE_PAIRING": {
                return 3;
            }
            case "RETROACTIVE_PROVISIONING": {
                return 4;
            }
            case "UNSPECIFIED": {
                return 1;
            }
            case "UPGRADE_NOTIFICATION": {
                return 5;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ProvisionParams) && Arrays.equals(this.a, ((ProvisionParams)object0).a) && this.b.equals(((ProvisionParams)object0).b) && this.c.equals(((ProvisionParams)object0).c) && this.d.equals(((ProvisionParams)object0).d) && this.e.equals(((ProvisionParams)object0).e) && this.f == ((ProvisionParams)object0).f;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.a), this.b, this.c, this.d, this.e, ((int)this.f)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.o(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

