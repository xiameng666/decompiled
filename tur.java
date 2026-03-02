public final class tur extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {90};
        tur.a = arr_b;
        tur.b = new tvr("Application Primary Account Number (PAN)", "Valid cardholder account number.", arr_b, -1, 0x80000000, 19, 2, 1, 3, 2, 2, 2, 6);
    }

    public tur(byte[] arr_b) {
        super(arr_b, tur.b);
    }
}

