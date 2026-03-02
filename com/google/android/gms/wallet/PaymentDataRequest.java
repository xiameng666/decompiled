package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import faxc;
import faxd;
import java.util.ArrayList;

public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;
    public CardRequirements c;
    public boolean d;
    public ShippingAddressRequirements e;
    public ArrayList f;
    public PaymentMethodTokenizationParameters g;
    public TransactionInfo h;
    public final boolean i;
    public String j;
    public byte[] k;
    public Bundle l;

    static {
        PaymentDataRequest.CREATOR = new faxd();
    }

    private PaymentDataRequest() {
        this.i = true;
    }

    public PaymentDataRequest(boolean z, boolean z1, CardRequirements cardRequirements0, boolean z2, ShippingAddressRequirements shippingAddressRequirements0, ArrayList arrayList0, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters0, TransactionInfo transactionInfo0, boolean z3, String s, byte[] arr_b, Bundle bundle0) {
        this.a = z;
        this.b = z1;
        this.c = cardRequirements0;
        this.d = z2;
        this.e = shippingAddressRequirements0;
        this.f = arrayList0;
        this.g = paymentMethodTokenizationParameters0;
        this.h = transactionInfo0;
        this.i = z3;
        this.j = s;
        this.k = arr_b;
        this.l = bundle0;
    }

    @Deprecated
    public static faxc a() {
        return new faxc(new PaymentDataRequest());
    }

    public static PaymentDataRequest b(byte[] arr_b) {
        faxc faxc0 = PaymentDataRequest.a();
        batl.t(arr_b, "paymentDataRequest encryptedParameters cannot be null!");
        faxc0.a.k = arr_b;
        return faxc0.a();
    }

    public static PaymentDataRequest c(String s) {
        faxc faxc0 = PaymentDataRequest.a();
        batl.t(s, "paymentDataRequestJson cannot be null!");
        faxc0.a.j = s;
        return faxc0.a();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.e(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        baub.E(parcel0, 6, this.f);
        baub.t(parcel0, 7, this.g, v, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.e(parcel0, 9, this.i);
        baub.v(parcel0, 10, this.j, false);
        baub.g(parcel0, 11, this.l, false);
        baub.i(parcel0, 12, this.k, false);
        baub.c(parcel0, v1);
    }
}

