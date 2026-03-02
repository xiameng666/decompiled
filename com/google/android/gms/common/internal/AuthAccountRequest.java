package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baqd;
import baub;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Set;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    @Deprecated
    public final IBinder b;
    public final Scope[] c;
    public Integer d;
    public Integer e;
    public Account f;
    public boolean g;

    static {
        AuthAccountRequest.CREATOR = new baqd();
    }

    public AuthAccountRequest(int v, IBinder iBinder0, Scope[] arr_scope, Integer integer0, Integer integer1, Account account0, boolean z) {
        this.a = v;
        this.b = iBinder0;
        this.c = arr_scope;
        this.d = integer0;
        this.e = integer1;
        this.f = account0;
        this.g = z;
    }

    public AuthAccountRequest(Account account0, Set set0) {
        this(3, null, ((Scope[])set0.toArray(new Scope[set0.size()])), null, null, account0, false);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.D(parcel0, 2, this.b);
        baub.J(parcel0, 3, this.c, v);
        baub.F(parcel0, 4, this.d);
        baub.F(parcel0, 5, this.e);
        baub.t(parcel0, 6, this.f, v, false);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

