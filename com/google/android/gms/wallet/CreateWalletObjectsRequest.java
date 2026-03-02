package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fawe;

public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public LoyaltyWalletObject a;
    public OfferWalletObject b;
    public GiftCardWalletObject c;
    public int d;

    static {
        CreateWalletObjectsRequest.CREATOR = new fawe();
    }

    CreateWalletObjectsRequest() {
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject0, OfferWalletObject offerWalletObject0, GiftCardWalletObject giftCardWalletObject0, int v) {
        this.a = loyaltyWalletObject0;
        this.b = offerWalletObject0;
        this.c = giftCardWalletObject0;
        this.d = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.o(parcel0, 5, this.d);
        baub.c(parcel0, v1);
    }
}

