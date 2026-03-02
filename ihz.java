public final class ihz {
    public static final hfb a(iem iem0, int v) {
        hfb hfb0 = iem0.I().v;
        if(hfb0 == null) {
            return null;
        }
        if((hfb0.t & v) != 0) {
            while(hfb0 != null) {
                int v1 = hfb0.s;
                if((v1 & 2) != 0) {
                    return null;
                }
                if((v1 & v) == 0) {
                    hfb0 = hfb0.v;
                    continue;
                }
                return hfb0;
            }
        }
        return null;
    }
}

