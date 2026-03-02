public final class tug extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-33, 33};
        tug.a = arr_b;
        tug.b = new tvr("Cryptogram Version Number", "Visa proprietary data element indicating the version of the Application Cryptogram algorithm used by the application. Transmitted in the Issuer Application Data.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 2, 3, 5);
    }

    public tug() {
        this(new byte[]{(byte)0x81}, false);
    }

    public tug(byte[] arr_b, boolean z) {
        super(arr_b, z, tug.b);
    }
}

