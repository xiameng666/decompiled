package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import faws;
import fawt;

public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String[] c;
    public String d;
    public Address e;
    public Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    public UserAddress i;
    public UserAddress j;
    public InstrumentInfo[] k;

    static {
        MaskedWallet.CREATOR = new fawt();
    }

    private MaskedWallet() {
    }

    public MaskedWallet(String s, String s1, String[] arr_s, String s2, Address address0, Address address1, LoyaltyWalletObject[] arr_loyaltyWalletObject, OfferWalletObject[] arr_offerWalletObject, UserAddress userAddress0, UserAddress userAddress1, InstrumentInfo[] arr_instrumentInfo) {
        this.a = s;
        this.b = s1;
        this.c = arr_s;
        this.d = s2;
        this.e = address0;
        this.f = address1;
        this.g = arr_loyaltyWalletObject;
        this.h = arr_offerWalletObject;
        this.i = userAddress0;
        this.j = userAddress1;
        this.k = arr_instrumentInfo;
    }

    public static faws a() {
        return new faws(new MaskedWallet());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.w(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.t(parcel0, 6, this.e, v, false);
        baub.t(parcel0, 7, this.f, v, false);
        baub.J(parcel0, 8, this.g, v);
        baub.J(parcel0, 9, this.h, v);
        baub.t(parcel0, 10, this.i, v, false);
        baub.t(parcel0, 11, this.j, v, false);
        baub.J(parcel0, 12, this.k, v);
        baub.c(parcel0, v1);
    }
}

