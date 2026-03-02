public final class ton extends ttk {
    public static final byte[] a;
    public static final byte[] b;
    public static final tvr c;

    static {
        byte[] arr_b = {-33, 26};
        ton.a = arr_b;
        ton.b = new byte[]{0, 0, 0, 0, 0, 0};
        ton.c = new tvr("Total Unauthenticated Spend Amount", "Tracks total spend since last successful Passcode check.  Amount stored incard\'s riscManagement and reset after successful passcode validation", arr_b, 6, 0x80000000, 0x7FFFFFFF, 1, 1, 3, 3, 1, 3, 5);
    }

    public ton(byte[] arr_b) {
        super(arr_b, ton.c);
    }

    public final long a() {
        try {
            return Long.parseLong(twz.b(this.r()));
        }
        catch(NumberFormatException unused_ex) {
            return 0L;
        }
    }
}

