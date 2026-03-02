package com.google.android.wallet.bender3.framework.client;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gauo;

public class GoogleAccountStateSnapshot extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account[] a;

    static {
        GoogleAccountStateSnapshot.CREATOR = new gauo();
    }

    public GoogleAccountStateSnapshot() {
    }

    public GoogleAccountStateSnapshot(Account[] arr_account) {
        this.a = arr_account;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.c(parcel0, v1);
    }
}

