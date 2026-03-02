package org.conscrypt.lite;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class HpkeSuite.KDF extends Enum {
    private static final HpkeSuite.KDF[] $VALUES;
    public static final enum HpkeSuite.KDF HKDF_SHA256;
    private final int hLength;
    private final String hName;
    private final int id;

    private static HpkeSuite.KDF[] $values() {
        return new HpkeSuite.KDF[]{HpkeSuite.KDF.HKDF_SHA256};
    }

    static {
        HpkeSuite.KDF.HKDF_SHA256 = new HpkeSuite.KDF("HKDF_SHA256", 0, 1, 0x20, "HmacSHA256");
        HpkeSuite.KDF.$VALUES = HpkeSuite.KDF.$values();
    }

    private HpkeSuite.KDF(String s, int v, int v1, int v2, String s1) {
        super(s, v);
        this.id = v1;
        this.hLength = v2;
        this.hName = s1;
    }

    public static HpkeSuite.KDF forId(int v) {
        HpkeSuite.KDF[] arr_hpkeSuite$KDF = HpkeSuite.KDF.values();
        for(int v1 = 0; v1 < arr_hpkeSuite$KDF.length; ++v1) {
            HpkeSuite.KDF hpkeSuite$KDF0 = arr_hpkeSuite$KDF[v1];
            if(hpkeSuite$KDF0.getId() == v) {
                return hpkeSuite$KDF0;
            }
        }
        throw new IllegalArgumentException("Unknown KDF " + v);
    }

    @Deprecated
    public int getHLength() {
        return this.getMacLength();
    }

    public int getId() {
        return this.id;
    }

    @Deprecated
    public String getMacAlgorithmName() {
        return this.getMacName();
    }

    public int getMacLength() {
        return this.hLength;
    }

    public String getMacName() {
        return this.hName;
    }

    public long maxExportLength() {
        return ((long)this.getMacLength()) * 0xFFL;
    }

    public static HpkeSuite.KDF valueOf(String s) {
        return (HpkeSuite.KDF)Enum.valueOf(HpkeSuite.KDF.class, s);
    }

    public static HpkeSuite.KDF[] values() {
        return (HpkeSuite.KDF[])HpkeSuite.KDF.$VALUES.clone();
    }
}

