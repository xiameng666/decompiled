package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dljg;
import java.util.Arrays;

public final class SetWalletItemSurfacingEnabledRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public boolean b;
    public String c;
    public long d;
    public long e;
    public String f;
    public byte[] g;
    public long h;
    public long i;

    static {
        SetWalletItemSurfacingEnabledRequest.CREATOR = new dljg();
    }

    public SetWalletItemSurfacingEnabledRequest() {
    }

    public SetWalletItemSurfacingEnabledRequest(Account account0, boolean z, String s, long v, long v1, String s1, byte[] arr_b, long v2, long v3) {
        this.a = account0;
        this.b = z;
        this.c = s;
        this.d = v;
        this.e = v1;
        this.f = s1;
        this.g = arr_b;
        this.h = v2;
        this.i = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetWalletItemSurfacingEnabledRequest) && bata.b(this.a, ((SetWalletItemSurfacingEnabledRequest)object0).a) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((SetWalletItemSurfacingEnabledRequest)object0).b)) && bata.b(this.c, ((SetWalletItemSurfacingEnabledRequest)object0).c) && bata.b(Long.valueOf(this.d), Long.valueOf(((SetWalletItemSurfacingEnabledRequest)object0).d)) && bata.b(Long.valueOf(this.e), Long.valueOf(((SetWalletItemSurfacingEnabledRequest)object0).e)) && bata.b(this.f, ((SetWalletItemSurfacingEnabledRequest)object0).f) && Arrays.equals(this.g, ((SetWalletItemSurfacingEnabledRequest)object0).g) && bata.b(Long.valueOf(this.h), Long.valueOf(((SetWalletItemSurfacingEnabledRequest)object0).h)) && bata.b(Long.valueOf(this.i), Long.valueOf(((SetWalletItemSurfacingEnabledRequest)object0).i));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c, ((long)this.d), ((long)this.e), this.f, Arrays.hashCode(this.g), ((long)this.h), ((long)this.i)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.e(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.q(parcel0, 4, this.d);
        baub.q(parcel0, 5, this.e);
        baub.v(parcel0, 6, this.f, false);
        baub.i(parcel0, 7, this.g, false);
        baub.q(parcel0, 8, this.h);
        baub.q(parcel0, 9, this.i);
        baub.c(parcel0, v1);
    }
}

