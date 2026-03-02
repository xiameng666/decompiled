package com.google.android.nearby.presence.rust.credential;

import fzcz;
import yga;

public final class CredentialSlab extends fzcz {
    public CredentialSlab(yga yga0) {
        super(CredentialSlab.allocate(), yga0, (long arg0) -> {
        });
    }

    private static native long allocate() {
    }

    // Detected as a lambda impl.
    public static native void deallocate(long arg0) {
    }

    public static native boolean nativeAddV0DiscoveryCredential(long arg0, V0DiscoveryCredential arg1, int arg2, byte[] arg3) {
    }

    public static native boolean nativeAddV1DiscoveryCredential(long arg0, V1DiscoveryCredential arg1, int arg2, byte[] arg3) {
    }
}

