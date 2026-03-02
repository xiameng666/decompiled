public final class azvr {
    public static azvp a;

    public static azvq a() {
        String s = null;
        if(azvr.a != null) {
            brvu brvu0 = bsag.c();
            if(brvu0 != null && (brvu0.b & 4) != 0) {
                String s1 = (brvu0.e == null ? brvv.a : brvu0.e).c;
                if((brvu0.b & 2) != 0) {
                    s = (brvu0.d == null ? brvq.a : brvu0.d).d;
                }
                if(s != null) {
                    String[] arr_s = brys.a;
                    for(int v = 0; v < 4; ++v) {
                        if(s.startsWith(arr_s[v])) {
                            return new azvq(s1, true, s);
                        }
                    }
                }
                return new azvq(s1, false, s);
            }
        }
        return null;
    }
}

