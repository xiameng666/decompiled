package com.google.android.gms.wallet.firstparty.setupwizard;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import fbjz;

public class SetupWizardInstrumentManagerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final byte[] b;
    public final BuyFlowConfig c;
    public final String d;
    public final byte[] e;
    final boolean f;
    final boolean g;

    static {
        SetupWizardInstrumentManagerParams.CREATOR = new fbjz();
    }

    public SetupWizardInstrumentManagerParams(Account account0, byte[] arr_b, BuyFlowConfig buyFlowConfig0, String s, byte[] arr_b1, boolean z, boolean z1) {
        this.a = account0;
        this.b = arr_b;
        this.c = buyFlowConfig0;
        this.d = s;
        this.e = arr_b1;
        this.f = z;
        this.g = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.i(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.v(parcel0, 4, this.d, false);
        baub.i(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

