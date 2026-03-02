package com.google.android.nearby.presence.rust;

import com.google.android.nearby.presence.rust.credential.CredentialBook;
import fzcq;

public final class DeserializedV1Advertisement extends fzcq {
    public final int a;
    public final LegibleV1Sections b;
    public final CredentialBook c;

    DeserializedV1Advertisement(int v, int v1, LegibleV1Sections legibleV1Sections0, CredentialBook credentialBook0) {
        this.a = v;
        this.b = legibleV1Sections0;
        this.c = credentialBook0;
    }

    @Override  // fzcq
    public final void close() {
        LegibleV1Sections legibleV1Sections0 = this.b;
        if(legibleV1Sections0 != null) {
            legibleV1Sections0.close();
        }
    }
}

