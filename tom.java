public final class tom extends ttk {
    public static final byte[] a;
    public static final byte[] b;
    public static final tvr c;

    static {
        byte[] arr_b = {-33, 27};
        tom.a = arr_b;
        tom.b = new byte[]{0, 0};
        tom.c = new tvr("Multicurrency Unauthenticated Counter", "Tracks number of transactions not in Issuer currency since last successful Passcode check.  Counter stored incard\'s riscManagement and reset after successful passcode validation", arr_b, 2, 0x80000000, 0x7FFFFFFF, 1, 1, 3, 3, 1, 3, 5);
    }

    public tom(byte[] arr_b) {
        super(arr_b, tom.c);
    }

    public final long a() {
        try {
            return Long.parseLong(twz.b(this.r()));
        }
        catch(NumberFormatException unused_ex) {
            return 0L;
        }
    }

    public final void b() {
        super.m(tom.b);
    }
}

