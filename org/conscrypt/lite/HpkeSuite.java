package org.conscrypt.lite;

public final class HpkeSuite {
    public static final int AEAD_AES_128_GCM = 1;
    public static final int AEAD_AES_256_GCM = 2;
    public static final int AEAD_CHACHA20POLY1305 = 3;
    public static final int KDF_HKDF_SHA256 = 1;
    public static final int KEM_DHKEM_X25519_HKDF_SHA256 = 0x20;
    private final HpkeSuite.AEAD mAead;
    private final HpkeSuite.KDF mKdf;
    private final HpkeSuite.KEM mKem;

    public HpkeSuite(int v, int v1, int v2) {
        this.mKem = HpkeSuite.KEM.forId(v);
        this.mKdf = HpkeSuite.KDF.forId(v1);
        this.mAead = HpkeSuite.AEAD.forId(v2);
    }

    @Deprecated
    public HpkeSuite.AEAD convertAead(int v) {
        return HpkeSuite.AEAD.forId(v);
    }

    @Deprecated
    public HpkeSuite.KDF convertKdf(int v) {
        return HpkeSuite.KDF.forId(v);
    }

    @Deprecated
    public HpkeSuite.KEM convertKem(int v) {
        return HpkeSuite.KEM.forId(v);
    }

    public HpkeSuite.AEAD getAead() {
        return this.mAead;
    }

    public HpkeSuite.KDF getKdf() {
        return this.mKdf;
    }

    public HpkeSuite.KEM getKem() {
        return this.mKem;
    }

    public String name() {
        return String.format("%s/%s/%s", this.mKem.name(), this.mKdf.name(), this.mAead.name());
    }
}

