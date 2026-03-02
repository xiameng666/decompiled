package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhq;
import java.util.Arrays;

public final class RefreshSePrepaidTransactionsFromChipRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public GooglePaymentMethodId[] b;
    public SeServiceProvider c;

    static {
        RefreshSePrepaidTransactionsFromChipRequest.CREATOR = new dlhq();
    }

    public RefreshSePrepaidTransactionsFromChipRequest() {
    }

    public RefreshSePrepaidTransactionsFromChipRequest(Account account0, GooglePaymentMethodId[] arr_googlePaymentMethodId, SeServiceProvider seServiceProvider0) {
        this.a = account0;
        this.b = arr_googlePaymentMethodId;
        this.c = seServiceProvider0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RefreshSePrepaidTransactionsFromChipRequest) && bata.b(this.a, ((RefreshSePrepaidTransactionsFromChipRequest)object0).a) && Arrays.equals(this.b, ((RefreshSePrepaidTransactionsFromChipRequest)object0).b) && bata.b(this.c, ((RefreshSePrepaidTransactionsFromChipRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.J(parcel0, 2, this.b, v);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

