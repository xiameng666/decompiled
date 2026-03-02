package com.google.android.gms.auth.firstparty.dataservice;

import ajoj;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ReauthSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    @Deprecated
    public final String b;
    public final boolean c;
    public final Account d;
    public String e;

    static {
        ReauthSettingsRequest.CREATOR = new ajoj();
    }

    public ReauthSettingsRequest(int v, String s, boolean z, Account account0, String s1) {
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = account0 == null && !TextUtils.isEmpty(s) ? new Account(s, "com.google") : account0;
        this.e = s1;
    }

    public ReauthSettingsRequest(Account account0, boolean z) {
        this(3, null, z, account0, null);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

