public final class syo extends syi {
    private szg b;

    public syo() {
        this.b = null;
    }

    public syo(byte[] arr_b) {
        super(arr_b);
        this.b = null;
        this.b = sze.b(new byte[]{(byte)0x83}, this.g());
    }

    public final boolean i() {
        return (this.b() & 16) == 16;
    }

    public final byte[] j() {
        return this.b.e();
    }
}

