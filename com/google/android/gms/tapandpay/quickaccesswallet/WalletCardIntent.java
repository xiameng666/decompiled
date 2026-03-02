package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etsi;
import java.util.Arrays;

public final class WalletCardIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public WalletCardIntentExtra[] c;

    static {
        WalletCardIntent.CREATOR = new etsi();
    }

    public WalletCardIntent() {
    }

    public WalletCardIntent(String s, String s1, WalletCardIntentExtra[] arr_walletCardIntentExtra) {
        this.a = s;
        this.b = s1;
        this.c = arr_walletCardIntentExtra;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof WalletCardIntent) && bata.b(this.a, ((WalletCardIntent)object0).a) && bata.b(this.b, ((WalletCardIntent)object0).b) && Arrays.equals(this.c, ((WalletCardIntent)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Arrays.hashCode(this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.J(parcel0, 3, this.c, v);
        baub.c(parcel0, v1);
    }
}

