package com.google.android.gms.wallet.firstparty;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fbid;
import fbie;

public final class ExitResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public int c;
    public int d;

    static {
        ExitResult.CREATOR = new fbie();
    }

    public ExitResult() {
        this.a = 402;
        this.b = "";
        this.c = 0;
        this.d = 0;
    }

    public ExitResult(int v, String s, int v1, int v2) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
    }

    public static fbid a() {
        return new fbid(new ExitResult());
    }

    public final void b(Intent intent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("paymentsExitCode", this.a);
        bundle0.putString("debugMessage", this.b);
        bundle0.putInt("playBillingExitCode", this.c);
        bundle0.putInt("apiErrorReason", this.d);
        intent0.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_EXIT_RESULT_BUNDLE", bundle0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

