public final class igvp {
    public byte a;
    private static final byte[][] b;

    static {
        igvp.b = new byte[][]{new byte[]{0, 0, 0, 0, 0}, new byte[]{0, 2, 2, 3, 4}, new byte[]{1, 1, 1, 1, 1}, new byte[]{3, 3, 3, 3, 3}, new byte[]{4, 4, 4, 4, 4}};
    }

    public igvp() {
        this.a = 0;
    }

    public final void a(byte b) {
        this.a = igvp.b[b][this.a];
    }
}

