package com.google.android.gms.semanticlocationhistory;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import emva;
import java.util.Arrays;

public class RequestCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final String b;
    public final String c;

    static {
        RequestCredentials.CREATOR = new emva();
    }

    public RequestCredentials(Account account0, String s, String s1) {
        this.a = account0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof RequestCredentials) ? bata.b(this.a, ((RequestCredentials)object0).a) && bata.b(this.b, ((RequestCredentials)object0).b) && bata.b(this.c, ((RequestCredentials)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

