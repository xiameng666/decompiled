public final class tpk extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-33, 33};
        tpk.a = arr_b;
        tpk.b = new tvr("Cryptogram Version Number", "Interac proprietary data element indicating the version of the Application Cryptogram algorithm used by the application for InApp transaction. Transmitted in the Issuer Application Data.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 2, 3, 5);
    }

    public tpk(byte b) {
        super(new byte[]{b}, false, tpk.b);
    }
}

