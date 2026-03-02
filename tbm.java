public enum tbm {
    AAC(0),
    TC(1),
    ARQC(2),
    RFU(3);

    public final byte e;

    private tbm(int v1) {
        this.e = (byte)v1;
    }
}

