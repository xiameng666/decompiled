package org.conscrypt.lite;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class HpkeSuite.KEM extends Enum {
    private static final HpkeSuite.KEM[] $VALUES;
    public static final enum HpkeSuite.KEM DHKEM_X25519_HKDF_SHA256;
    private final int id;
    private final int nEnc;
    private final int nPk;
    private final int nSecret;
    private final int nSk;

    private static HpkeSuite.KEM[] $values() {
        return new HpkeSuite.KEM[]{HpkeSuite.KEM.DHKEM_X25519_HKDF_SHA256};
    }

    static {
        HpkeSuite.KEM.DHKEM_X25519_HKDF_SHA256 = new HpkeSuite.KEM("DHKEM_X25519_HKDF_SHA256", 0, 0x20, 0x20, 0x20, 0x20, 0x20);
        HpkeSuite.KEM.$VALUES = HpkeSuite.KEM.$values();
    }

    private HpkeSuite.KEM(String s, int v, int v1, int v2, int v3, int v4, int v5) {
        super(s, v);
        this.id = v1;
        this.nSecret = v2;
        this.nEnc = v3;
        this.nPk = v4;
        this.nSk = v5;
    }

    public static HpkeSuite.KEM forId(int v) {
        HpkeSuite.KEM[] arr_hpkeSuite$KEM = HpkeSuite.KEM.values();
        for(int v1 = 0; v1 < arr_hpkeSuite$KEM.length; ++v1) {
            HpkeSuite.KEM hpkeSuite$KEM0 = arr_hpkeSuite$KEM[v1];
            if(hpkeSuite$KEM0.getId() == v) {
                return hpkeSuite$KEM0;
            }
        }
        throw new IllegalArgumentException("Unknown KEM " + v);
    }

    public int getEncapsulatedLength() {
        return this.nEnc;
    }

    public int getId() {
        return this.id;
    }

    public int getPrivateKeyLength() {
        return this.nSk;
    }

    public int getPublicKeyLength() {
        return this.nPk;
    }

    public int getSecretLength() {
        return this.nSecret;
    }

    @Deprecated
    public int getnEnc() {
        return this.getEncapsulatedLength();
    }

    public static HpkeSuite.KEM valueOf(String s) {
        return (HpkeSuite.KEM)Enum.valueOf(HpkeSuite.KEM.class, s);
    }

    public static HpkeSuite.KEM[] values() {
        return (HpkeSuite.KEM[])HpkeSuite.KEM.$VALUES.clone();
    }
}

