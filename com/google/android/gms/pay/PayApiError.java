package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlgx;
import java.util.Arrays;

public final class PayApiError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public boolean c;
    public byte[] d;
    public int e;

    static {
        PayApiError.CREATOR = new dlgx();
    }

    public PayApiError() {
    }

    public PayApiError(String s, String s1, boolean z, byte[] arr_b, int v) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = arr_b;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof PayApiError) && bata.b(this.a, ((PayApiError)object0).a) && bata.b(this.b, ((PayApiError)object0).b) && bata.b(Boolean.valueOf(this.c), Boolean.valueOf(((PayApiError)object0).c)) && Arrays.equals(this.d, ((PayApiError)object0).d) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((PayApiError)object0).e));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Arrays.hashCode(this.d), ((int)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.i(parcel0, 4, this.d, false);
        baub.o(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

