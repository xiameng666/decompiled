public final class srq {
    public final srp a;
    public final srp b;

    public srq(srp srp0, srp srp1) {
        stp.b(srp0, "encryptionKey");
        stp.b(srp1, "macKey");
        if(srp0.a != srp1.a) {
            throw new IllegalArgumentException("Both keys in a symmetric key pair must use same encryption algorithm");
        }
        this.a = srp0;
        this.b = srp1;
    }
}

