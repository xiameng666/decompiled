public final class tof extends ttk {
    public static final byte[] a;
    public static final byte[] b;
    public static final tvr c;

    static {
        tof.a = new byte[]{0, 0};
        byte[] arr_b = {-97, 0x71};
        tof.b = arr_b;
        tof.c = new tvr("Mobile Status Indicator", "The Mobile Status Indicator (MSI) is set internally by the MDA during contactless and contact\n(Management) transactions. This value can be read by the handset application using the\nGET DATA command by passing the MSI tag 9F 71 in the P1and P2 parameter fields of the\ncommand", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 6, 2, 3, 5);
    }

    public tof(byte[] arr_b) {
        super(arr_b, tof.c);
    }

    public final void a() {
        this.l(1, 3, true);
    }

    public final void b() {
        this.l(1, 1, true);
    }

    public final void c(boolean z) {
        this.l(0, 1, z);
    }

    public final boolean d() {
        return this.q(0, 3);
    }

    public final boolean e() {
        return this.q(0, 1);
    }
}

