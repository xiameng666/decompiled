package com.google.android.gms.auth.firstparty.dataservice;

import ajnc;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConfirmCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public AccountCredentials b;
    public CaptchaSolution c;

    static {
        ConfirmCredentialsRequest.CREATOR = new ajnc();
    }

    public ConfirmCredentialsRequest() {
        this.a = 1;
    }

    public ConfirmCredentialsRequest(int v, AccountCredentials accountCredentials0, CaptchaSolution captchaSolution0) {
        this.a = v;
        this.b = accountCredentials0;
        this.c = captchaSolution0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

