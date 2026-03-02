public final class bxpu implements lqj {
    public final bxpx a;

    public bxpu(bxpx bxpx0) {
        this.a = bxpx0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((bxrc)object0) != null) {
            bxpx bxpx0 = this.a;
            switch(((bxrc)object0).ordinal()) {
                case 1: {
                    bxpx0.D();
                    return;
                }
                case 2: {
                    bxpx0.D();
                    bxpx0.b.loadUrl(bxpx0.ah.a.b);
                    return;
                }
                case 3: {
                    bxpx0.b.setVisibility(0);
                    bxpx0.c.setVisibility(8);
                }
            }
        }
    }
}

