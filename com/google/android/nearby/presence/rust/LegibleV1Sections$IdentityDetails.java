package com.google.android.nearby.presence.rust;

import java.util.Arrays;

public final class LegibleV1Sections.IdentityDetails {
    public final byte[] a;

    public LegibleV1Sections.IdentityDetails(int v, int v1, byte[] arr_b, byte[] arr_b1) {
        Arrays.copyOf(arr_b, arr_b.length);
        this.a = Arrays.copyOf(arr_b1, arr_b1.length);
    }
}

