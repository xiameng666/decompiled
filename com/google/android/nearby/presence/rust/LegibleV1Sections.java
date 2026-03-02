package com.google.android.nearby.presence.rust;

import com.google.android.nearby.presence.rust.credential.CredentialBook;
import fzcz;

public final class LegibleV1Sections extends fzcz {
    LegibleV1Sections(long v) {
        super(v, NpAdv.b(), (long arg0) -> {
        });
    }

    // Detected as a lambda impl.
    public static native void deallocate(long arg0) {
    }

    public native DeserializedV1Section nativeGetSection(int arg1, CredentialBook arg2) {
    }

    public native V1DataElement.Generic nativeGetSectionDataElement(int arg1, int arg2) {
    }

    public native byte[] nativeGetSectionDecryptedMetadata(int arg1) {
    }

    public native LegibleV1Sections.IdentityDetails nativeGetSectionIdentityDetails(int arg1) {
    }
}

