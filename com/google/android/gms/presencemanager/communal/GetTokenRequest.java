package com.google.android.gms.presencemanager.communal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.presencemanager.ActiveUser;
import ejfo;
import java.util.Arrays;

public class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final ActiveUser a;
    public final int b;
    public final String c;
    public final Account d;

    static {
        GetTokenRequest.CREATOR = new ejfo();
    }

    public GetTokenRequest(ActiveUser activeUser0, int v, String s, Account account0) {
        this.a = activeUser0;
        this.b = v;
        this.c = s;
        this.d = account0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GetTokenRequest) ? bata.b(this.a, ((GetTokenRequest)object0).a) && this.b == ((GetTokenRequest)object0).b && TextUtils.equals(this.c, ((GetTokenRequest)object0).c) && bata.b(this.d, ((GetTokenRequest)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c, this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

