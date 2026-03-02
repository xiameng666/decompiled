package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dllj;
import java.util.Arrays;

public final class WalletFrameworkIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public WalletFrameworkConfig a;

    static {
        WalletFrameworkIntentArgs.CREATOR = new dllj();
    }

    public WalletFrameworkIntentArgs() {
    }

    public WalletFrameworkIntentArgs(WalletFrameworkConfig walletFrameworkConfig0) {
        this.a = walletFrameworkConfig0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof WalletFrameworkIntentArgs) ? bata.b(this.a, ((WalletFrameworkIntentArgs)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

