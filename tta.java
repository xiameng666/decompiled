public final class tta extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 89};
        tta.a = arr_b;
        tta.d = new tik("Terminal Transaction Information", "", arr_b, 3, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 1, 1, 3, 1);
    }

    public tta(byte[] arr_b) {
        super(arr_b, tta.d);
    }

    @Override  // tgc
    public final void d() {
    }

    public final boolean n() {
        return this.j(0, 2);
    }

    @Override  // tgc
    public final String toString() {
        return tjs.b(this.c) + "\nByte 1\nbit 8: " + this.c(0) + " = RFU\nbit 7: " + this.c(1) + " = RFU\nbit 6: " + this.c(2) + " = RFU\nbit 5: " + this.c(4) + " =  CDA " + this.b(4) + "supported\nbit 4: " + this.c(3) + " =  Offline " + this.b(3) + "supported\nbit 3: " + this.c(5) + " = RFU\nbit 2: " + this.c(6) + " = RFU\nbit 1: " + this.c(7) + " = RFU\nByte 2\nbit 8: " + this.c(8) + " = RFU\nbit 7: " + this.c(9) + " = RFU\nbit 6: " + this.c(10) + " = RFU\nbit 5: " + this.c(4) + " = Mobile NFC device" + this.b(4) + "accepted\nbit 4: " + this.c(12) + " = RFU\nbit 3: " + this.c(13) + " = RFU\nbit 2: " + this.c(14) + " = RFU\nbit 1: " + this.c(15) + " = RFU\nByte 3\nbits 8-1: RFU (00000000)\n";
    }
}

