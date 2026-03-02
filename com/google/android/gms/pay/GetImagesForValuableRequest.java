package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dldt;
import java.util.Arrays;

public final class GetImagesForValuableRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public Account b;
    public int c;
    public int d;
    public int e;

    static {
        GetImagesForValuableRequest.CREATOR = new dldt();
    }

    public GetImagesForValuableRequest() {
    }

    public GetImagesForValuableRequest(String s, Account account0, int v, int v1, int v2) {
        this.a = s;
        this.b = account0;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetImagesForValuableRequest) && bata.b(this.a, ((GetImagesForValuableRequest)object0).a) && bata.b(this.b, ((GetImagesForValuableRequest)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((GetImagesForValuableRequest)object0).c)) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((GetImagesForValuableRequest)object0).d)) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((GetImagesForValuableRequest)object0).e));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), ((int)this.d), ((int)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

