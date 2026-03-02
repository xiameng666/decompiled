package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlej;
import java.util.Arrays;

public final class GetPayCardArtRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public PayCardArtInfo[] b;

    static {
        GetPayCardArtRequest.CREATOR = new dlej();
    }

    public GetPayCardArtRequest() {
    }

    public GetPayCardArtRequest(Account account0, PayCardArtInfo[] arr_payCardArtInfo) {
        this.a = account0;
        this.b = arr_payCardArtInfo;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetPayCardArtRequest) && bata.b(this.a, ((GetPayCardArtRequest)object0).a) && Arrays.equals(this.b, ((GetPayCardArtRequest)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.J(parcel0, 2, this.b, v);
        baub.c(parcel0, v1);
    }
}

