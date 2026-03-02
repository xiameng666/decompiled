package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlja;
import java.util.Arrays;

public final class SetOnboardingInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ProtoSafeParcelable a;
    public Account b;
    public IntentSource c;

    static {
        SetOnboardingInfoRequest.CREATOR = new dlja();
    }

    public SetOnboardingInfoRequest() {
    }

    public SetOnboardingInfoRequest(ProtoSafeParcelable protoSafeParcelable0, Account account0, IntentSource intentSource0) {
        this.a = protoSafeParcelable0;
        this.b = account0;
        this.c = intentSource0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetOnboardingInfoRequest) && bata.b(this.a, ((SetOnboardingInfoRequest)object0).a) && bata.b(this.b, ((SetOnboardingInfoRequest)object0).b) && bata.b(this.c, ((SetOnboardingInfoRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

