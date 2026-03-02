public final class dgae {
    public byte[] a;
    public byte[] b;

    public dgae(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 1 || arr_b1.length != 8) {
            throw new IllegalArgumentException("SaltedSenderCertificateId has invalid input sizes");
        }
        this.a = arr_b;
        this.b = arr_b1;
    }
}

