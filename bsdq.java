public final class bsdq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((fzwy)object0).a();
        if(v != -100) {
            if(v == 0 || v == 1) {
                return (int)1;
            }
            switch(v) {
                case -9: 
                case -5: {
                    return (int)2;
                }
                case -10: 
                case -8: 
                case -7: 
                case -6: 
                case -4: 
                case -3: 
                case -2: {
                    break;
                }
                default: {
                    ((ggtj)bsds.a.j()).z("Undocumented App Dependency error code: %s", v);
                    return (int)0;
                }
            }
        }
        ((ggtj)bsds.a.j()).z("Unexpected error. App Dependency error code: %s", v);
        return (int)3;
    }
}

