import j..util.Objects;

public final class bmpz implements lqj {
    public final bmqj a;

    public bmpz(bmqj bmqj0) {
        this.a = bmqj0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        int v = (int)(((Integer)object0));
        bmqj bmqj0 = this.a;
        if(bmqj0.isAdded()) {
            fm fm0 = bmqj0.getChildFragmentManager();
            ggeo ggeo0 = bmqj.ag;
            String s = (String)ggeo0.get(((Integer)object0));
            if(s != null && fm0.h(s) == null) {
                du du0 = (du)((kba)Objects.requireNonNull(((kba)bmqj.ah.get(((Integer)object0))))).a();
                if(v == 17) {
                    du du1 = fm0.g(bmqj0.aj.c);
                    if(du1 != null) {
                        ca ca0 = new ca(fm0);
                        ca0.o(du1);
                        ca0.a();
                    }
                    bmqj0.B(false);
                    ca ca1 = new ca(fm0);
                    ca1.v(du0, s);
                    ca1.a();
                    return;
                }
                du du2 = fm0.h(((String)ggeo0.get(Integer.valueOf(17))));
                if(du2 != null) {
                    ca ca2 = new ca(fm0);
                    ca2.o(du2);
                    ca2.a();
                }
                bmqj0.B(true);
                bmqj0.aj.a(du0, s);
            }
        }
    }
}

