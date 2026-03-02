public final class tgy extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-33, 33};
        tgy.a = arr_b;
        tgy.d = new tik("Cryptogram Version Number", "Visa proprietary data element indicating the version of the Application Cryptogram algorithm used by the application. Transmitted in the Issuer Application Data.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 2, 3, 5);
    }

    public tgy() {
        this(new byte[]{(byte)0x81}, false);
    }

    public tgy(byte[] arr_b, boolean z) {
        super(arr_b, z, tgy.d);
    }
}

