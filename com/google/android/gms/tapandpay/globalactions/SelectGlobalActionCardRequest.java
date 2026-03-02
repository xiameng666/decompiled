package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import espk;
import java.util.Arrays;

public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public int c;

    static {
        SelectGlobalActionCardRequest.CREATOR = new espk();
    }

    private SelectGlobalActionCardRequest() {
    }

    public SelectGlobalActionCardRequest(int v, String s, int v1) {
        this.a = v;
        this.b = s;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SelectGlobalActionCardRequest) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((SelectGlobalActionCardRequest)object0).a)) && bata.b(this.b, ((SelectGlobalActionCardRequest)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((SelectGlobalActionCardRequest)object0).c));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, ((int)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

