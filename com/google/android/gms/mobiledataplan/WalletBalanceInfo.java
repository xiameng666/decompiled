package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crvv;
import java.util.Arrays;

public final class WalletBalanceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public long a;
    public String b;
    public int c;
    public Long d;
    public String e;
    public String f;
    public Long g;
    public Long h;
    public Long i;
    public String j;

    static {
        WalletBalanceInfo.CREATOR = new crvv();
    }

    public WalletBalanceInfo() {
    }

    public WalletBalanceInfo(long v, String s, int v1, Long long0, String s1, String s2, Long long1, Long long2, Long long3, String s3) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = long0;
        this.e = s1;
        this.f = s2;
        this.g = long1;
        this.h = long2;
        this.i = long3;
        this.j = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof WalletBalanceInfo) && bata.b(Long.valueOf(this.a), Long.valueOf(((WalletBalanceInfo)object0).a)) && bata.b(this.b, ((WalletBalanceInfo)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((WalletBalanceInfo)object0).c)) && bata.b(this.d, ((WalletBalanceInfo)object0).d) && bata.b(this.e, ((WalletBalanceInfo)object0).e) && bata.b(this.f, ((WalletBalanceInfo)object0).f) && bata.b(this.g, ((WalletBalanceInfo)object0).g) && bata.b(this.h, ((WalletBalanceInfo)object0).h) && bata.b(this.i, ((WalletBalanceInfo)object0).i) && bata.b(this.j, ((WalletBalanceInfo)object0).j);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), this.b, ((int)this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.I(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.I(parcel0, 7, this.g);
        baub.I(parcel0, 8, this.h);
        baub.I(parcel0, 9, this.i);
        baub.v(parcel0, 10, this.j, false);
        baub.c(parcel0, v1);
    }
}

