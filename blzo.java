public enum blzo {
    ANDROID_KEYSTORE(1),
    SOFTWARE_KEY(2),
    STRONGBOX_KEY(3);

    public final byte d;

    private blzo(byte b) {
        this.d = b;
    }

    static blzo a(byte b) {
        blzo blzo0 = blzo.a;
        if(b == blzo0.d) {
            return blzo0;
        }
        blzo blzo1 = blzo.b;
        if(b == blzo1.d) {
            return blzo1;
        }
        blzo blzo2 = blzo.c;
        if(b == blzo2.d) {
            return blzo2;
        }
        throw new IllegalArgumentException("Value is not a known key type.");
    }
}

