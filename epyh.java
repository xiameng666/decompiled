public enum epyh {
    UNKNOWN(0),
    PHONE(1),
    TABLET(2),
    TV(3),
    WEAR(4),
    @Deprecated
    WEAVE(5),
    AUTO(6),
    CHROME(7);

    public final byte i;

    private epyh(byte b) {
        this.i = b;
    }

    public static epyh a(String s) {
        if(s != null) {
            epyh[] arr_epyh = epyh.values();
            for(int v = 0; v < arr_epyh.length; ++v) {
                epyh epyh0 = arr_epyh[v];
                if(gfqz.e(epyh0.name(), s)) {
                    return epyh0;
                }
            }
        }
        return epyh.a;
    }
}

