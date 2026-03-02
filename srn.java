public final class srn {
    public final srp a;
    public final srp b;
    public final srp c;
    public final srp d;

    public srn(srp srp0, srp srp1, srp srp2, srp srp3) {
        stp.b(srp0, "encryptionKey");
        stp.b(srp1, "macKey");
        if((srp2 == null ? 1 : 0) != (srp3 == null ? 1 : 0)) {
            throw new IllegalArgumentException("Both KEK keys (enc and mac) must be set if KEK is enabled");
        }
        this.a = srp0;
        this.b = srp1;
        this.c = srp2;
        this.d = srp3;
    }
}

