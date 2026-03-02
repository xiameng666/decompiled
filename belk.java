public final class belk implements lqj {
    public final beln a;

    public belk(beln beln0) {
        this.a = beln0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((bedv)object0) != null) {
            Object object1 = ((bedv)object0).b;
            if(object1 != null) {
                lqi lqi0 = this.a.c;
                if(lqi0.ij() != null) {
                    int v = ((gged_interceptors)object1).size();
                    int v1 = 0;
                    while(v1 < v) {
                        gqlt gqlt0 = (gqlt)((gged_interceptors)object1).get(v1);
                        String s = ((gqlt)lqi0.ij()).a;
                        ++v1;
                        if(gqlt0.a.equals(s)) {
                            lqi0.l(gqlt0);
                            return;
                        }
                    }
                    lqi0.l(null);
                }
            }
        }
    }
}

