package com.google.android.gms.ads.consent;

import android.os.Parcel;
import cjug;
import com.google.android.gms.ads.internal.consent.b;
import dagger.Reusable;

@Reusable
public final class a extends b implements cjug {
    @Override  // com.google.android.gms.ads.internal.consent.c
    public final void a(com.google.android.gms.ads.internal.consent.a a0) {
        Parcel parcel0 = a0.jo();
        parcel0.writeInt(4);
        a0.jq(3, parcel0);
    }
}

