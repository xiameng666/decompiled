package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dllk;
import java.util.Arrays;

public final class WalletListConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ApiLoaderConfig[] a;
    public PresentationConfig b;
    public SortOrderInfo c;

    static {
        WalletListConfig.CREATOR = new dllk();
    }

    public WalletListConfig() {
    }

    public WalletListConfig(ApiLoaderConfig[] arr_apiLoaderConfig, PresentationConfig presentationConfig0, SortOrderInfo sortOrderInfo0) {
        this.a = arr_apiLoaderConfig;
        this.b = presentationConfig0;
        this.c = sortOrderInfo0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof WalletListConfig) && Arrays.equals(this.a, ((WalletListConfig)object0).a) && bata.b(this.b, ((WalletListConfig)object0).b) && bata.b(this.c, ((WalletListConfig)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

