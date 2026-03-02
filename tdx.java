public final class tdx {
    public static tbm a(syo syo0) {
        int v = syo0.b() & 0xC0;
        tbm[] arr_tbm = tbm.values();
        for(int v1 = 0; v1 < arr_tbm.length; ++v1) {
            tbm tbm0 = arr_tbm[v1];
            if(v >> 6 == tbm0.e) {
                return tbm0;
            }
        }
        throw new IllegalArgumentException();
    }
}

