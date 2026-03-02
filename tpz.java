public final class tpz extends ttk {
    public static final byte[] a = null;
    public static final tvr b = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 89};
        tpz.a = arr_b;
        tpz.b = new tvr("Terminal Transaction Information", "", arr_b, 3, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 1, 1, 3, 1);
    }

    public tpz(byte[] arr_b) {
        super(arr_b, tpz.b);
    }

    public final boolean b() {
        return this.q(0, 2);
    }

    @Override  // ttk
    public final void fu() {
    }

    @Override  // ttk
    public final String toString() {
        return twz.b(this.e) + "\nByte 1\nbit 8: " + this.k(0) + " = RFU\nbit 7: " + this.k(1) + " = RFU\nbit 6: " + this.k(2) + " = RFU\nbit 5: " + this.k(4) + " =  CDA " + this.j(4) + "supported\nbit 4: " + this.k(3) + " =  Offline " + this.j(3) + "supported\nbit 3: " + this.k(5) + " = RFU\nbit 2: " + this.k(6) + " = RFU\nbit 1: " + this.k(7) + " = RFU\nByte 2\nbit 8: " + this.k(8) + " = RFU\nbit 7: " + this.k(9) + " = RFU\nbit 6: " + this.k(10) + " = RFU\nbit 5: " + this.k(4) + " = Mobile NFC device" + this.j(4) + "accepted\nbit 4: " + this.k(12) + " = RFU\nbit 3: " + this.k(13) + " = RFU\nbit 2: " + this.k(14) + " = RFU\nbit 1: " + this.k(15) + " = RFU\nByte 3\nbits 8-1: RFU (00000000)\n";
    }
}

