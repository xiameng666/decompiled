package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import faww;
import fcdn;

public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    String b;
    public CommonWalletObject c;

    static {
        OfferWalletObject.CREATOR = new faww();
    }

    OfferWalletObject() {
        this.a = 3;
    }

    public OfferWalletObject(int v, String s, String s1, CommonWalletObject commonWalletObject0) {
        this.a = v;
        this.b = s1;
        if(v < 3) {
            fcdn fcdn0 = CommonWalletObject.a();
            fcdn0.a(s);
            this.c = fcdn0.a;
            return;
        }
        this.c = commonWalletObject0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

