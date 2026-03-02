package com.google.android.gms.auth.aang;

import acts;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Oauth2TokenMetadata b;

    static {
        GetTokenResponse.CREATOR = new acts();
    }

    public GetTokenResponse(String s, Oauth2TokenMetadata oauth2TokenMetadata0) {
        this.a = s;
        this.b = oauth2TokenMetadata0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

