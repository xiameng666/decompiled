public final class tkv extends tbb {
    public static final byte[] e;
    public static final tcz f;

    static {
        byte[] arr_b = {-108};
        tkv.e = arr_b;
        tkv.f = new tcz("Application File Locator (AFL)", "Indicates the location (SFI, range of records) of the AEFs related to a given application. ", arr_b, -1, 0xFC, 7, 1, 1, 2, 2, tkv.c, 5);
    }

    public tkv(byte[] arr_b) {
        super(arr_b, tkv.f);
    }
}

