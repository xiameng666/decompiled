public final class tsl extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-33, 33};
        tsl.a = arr_b;
        tsl.d = new tik("Cryptogram Version Number", "Interac proprietary data element indicating the version of the Application Cryptogram algorithm used by the application for InApp transaction. Transmitted in the Issuer Application Data.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 2, 3, 5);
    }

    public tsl(byte b) {
        super(new byte[]{b}, false, tsl.d);
    }
}

