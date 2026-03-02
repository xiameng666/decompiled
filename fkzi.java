public final class fkzi {
    public static gdmz a(gssv gssv0) {
        if(!gssv0.b.isEmpty()) {
            gdmq gdmq0 = ((gstw)gssv0.b.get(0)).d;
            if(gdmq0 == null) {
                gdmq0 = gdmq.a;
            }
            hfuo hfuo0 = gdmq0.g;
            if(hfuo0.isEmpty()) {
                return null;
            }
            for(Object object0: hfuo0) {
                gdmz gdmz0 = (gdmz)object0;
                if((gdmz0.b & 1) != 0 && (gdmz0.c == null ? gdmt.a : gdmz0.c).f) {
                    return gdmz0;
                }
            }
            return (gdmz)hfuo0.get(0);
        }
        return null;
    }
}

