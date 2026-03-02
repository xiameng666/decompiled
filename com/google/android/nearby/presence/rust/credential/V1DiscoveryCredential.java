package com.google.android.nearby.presence.rust.credential;

import fzdm;

public final class V1DiscoveryCredential {
    private final byte[] expectedMicExtendedSaltIdentityTokenHmac;
    private final byte[] expectedMicShortSaltIdentityTokenHmac;
    private final byte[] keySeed;

    public V1DiscoveryCredential(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        this.keySeed = fzdm.a(arr_b, 0x20);
        this.expectedMicShortSaltIdentityTokenHmac = fzdm.a(arr_b1, 0x20);
        this.expectedMicExtendedSaltIdentityTokenHmac = fzdm.a(arr_b2, 0x20);
    }
}

