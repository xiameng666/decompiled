package com.google.android.gms.nearby.fastpair.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cyhf;
import cyhw;
import cyhy;
import java.util.Arrays;

public final class CreateAccountKeyInternalParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public Account c;
    public cyhy d;

    static {
        CreateAccountKeyInternalParams.CREATOR = new cyhf();
    }

    public CreateAccountKeyInternalParams() {
    }

    public CreateAccountKeyInternalParams(String s, String s1, Account account0, IBinder iBinder0) {
        cyhy cyhy0;
        if(iBinder0 == null) {
            cyhy0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairCreateAccountKeyCallback");
            cyhy0 = (iInterface0 instanceof cyhy) ? ((cyhy)iInterface0) : new cyhw(iBinder0);
        }
        super();
        this.a = s;
        this.b = s1;
        this.c = account0;
        this.d = cyhy0;
    }

    public final IBinder a() {
        return this.d.asBinder();
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CreateAccountKeyInternalParams) && bata.b(this.a, ((CreateAccountKeyInternalParams)object0).a) && bata.b(this.b, ((CreateAccountKeyInternalParams)object0).b) && bata.b(this.c, ((CreateAccountKeyInternalParams)object0).c) && bata.b(this.d, ((CreateAccountKeyInternalParams)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.D(parcel0, 4, this.a());
        baub.c(parcel0, v1);
    }
}

