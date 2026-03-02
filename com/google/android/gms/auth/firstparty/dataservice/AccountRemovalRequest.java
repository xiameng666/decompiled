package com.google.android.gms.auth.firstparty.dataservice;

import ajmt;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountRemovalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    @Deprecated
    String b;
    public Account c;

    static {
        AccountRemovalRequest.CREATOR = new ajmt();
    }

    public AccountRemovalRequest() {
        this.a = 2;
    }

    public AccountRemovalRequest(int v, String s, Account account0) {
        this.a = v;
        this.b = s;
        if(account0 == null && !TextUtils.isEmpty(s)) {
            this.c = new Account(s, "com.google");
            return;
        }
        this.c = account0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

