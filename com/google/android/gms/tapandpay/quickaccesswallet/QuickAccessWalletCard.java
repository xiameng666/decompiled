package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etru;
import java.util.Arrays;

public final class QuickAccessWalletCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public Bitmap b;
    public String c;
    public WalletCardIntent[] d;
    public CardIconMessage[] e;
    public long f;
    public long g;
    public String h;

    static {
        QuickAccessWalletCard.CREATOR = new etru();
    }

    public QuickAccessWalletCard() {
    }

    public QuickAccessWalletCard(String s, Bitmap bitmap0, String s1, WalletCardIntent[] arr_walletCardIntent, CardIconMessage[] arr_cardIconMessage, long v, long v1, String s2) {
        this.a = s;
        this.b = bitmap0;
        this.c = s1;
        this.d = arr_walletCardIntent;
        this.e = arr_cardIconMessage;
        this.f = v;
        this.g = v1;
        this.h = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof QuickAccessWalletCard) && bata.b(this.a, ((QuickAccessWalletCard)object0).a) && bata.b(this.b, ((QuickAccessWalletCard)object0).b) && bata.b(this.c, ((QuickAccessWalletCard)object0).c) && Arrays.equals(this.d, ((QuickAccessWalletCard)object0).d) && Arrays.equals(this.e, ((QuickAccessWalletCard)object0).e) && bata.b(Long.valueOf(this.f), Long.valueOf(((QuickAccessWalletCard)object0).f)) && bata.b(Long.valueOf(this.g), Long.valueOf(((QuickAccessWalletCard)object0).g)) && bata.b(this.h, ((QuickAccessWalletCard)object0).h);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Arrays.hashCode(this.d), Arrays.hashCode(this.e), ((long)this.f), ((long)this.g), this.h});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.J(parcel0, 4, this.d, v);
        baub.J(parcel0, 5, this.e, v);
        baub.q(parcel0, 6, this.f);
        baub.q(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.c(parcel0, v1);
    }
}

