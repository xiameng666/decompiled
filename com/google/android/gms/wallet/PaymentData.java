package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bauc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import favv;
import faxa;
import faxb;

public final class PaymentData extends AbstractSafeParcelable implements favv {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public CardInfo b;
    public UserAddress c;
    public PaymentMethodToken d;
    public String e;
    public Bundle f;
    public String g;
    public Bundle h;

    static {
        PaymentData.CREATOR = new faxb();
    }

    private PaymentData() {
    }

    public PaymentData(String s, CardInfo cardInfo0, UserAddress userAddress0, PaymentMethodToken paymentMethodToken0, String s1, Bundle bundle0, String s2, Bundle bundle1) {
        this.a = s;
        this.b = cardInfo0;
        this.c = userAddress0;
        this.d = paymentMethodToken0;
        this.e = s1;
        this.f = bundle0;
        this.g = s2;
        this.h = bundle1;
    }

    @Override  // favv
    public final void a(Intent intent0) {
        bauc.l(this, intent0, "com.google.android.gms.wallet.PaymentData");
    }

    public static faxa b() {
        return new faxa(new PaymentData());
    }

    public static PaymentData c(String s) {
        faxa faxa0 = PaymentData.b();
        batl.t(s, "paymentDataJson cannot be null!");
        faxa0.a.g = s;
        return faxa0.a;
    }

    public static PaymentData d(Intent intent0) {
        return (PaymentData)bauc.b(intent0, "com.google.android.gms.wallet.PaymentData", PaymentData.CREATOR);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.v(parcel0, 5, this.e, false);
        baub.g(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.g(parcel0, 8, this.h, false);
        baub.c(parcel0, v1);
    }
}

