public enum bmlc {
    EID_KEY(1),
    TUNNEL_ID(2),
    PSK(3),
    PAIRED_SECRET(4),
    IDENTITY_KEY_SEED(5),
    PER_CONTACT_ID_SECRET(6);

    public final byte g;

    private bmlc(int v1) {
        this.g = (byte)v1;
    }
}

