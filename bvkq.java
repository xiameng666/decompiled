public final class bvkq implements lsk {
    final ibnf a;

    public bvkq(ibnf ibnf0) {
        this.a = ibnf0;
        super();
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        return lsi.b(class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        cmhx cmhx1;
        ibuq.f(class0, "modelClass");
        lsb lsb0 = ((bvkt)this.a).a();
        String s = (String)ltx0.a(bvkk.a);
        if(s != null) {
            lsb0.f = s;
            icnl icnl0 = lsb0.t;
            do {
                Object object0 = icnl0.b();
                cmhx cmhx0 = ((bvgx)object0).d;
                cmfs cmfs0 = null;
                if(cmhx0 == null) {
                    cmhx1 = null;
                }
                else {
                    cmfs cmfs1 = cmhx0.b;
                    if(cmfs1 != null) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cmfs1).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)cmfs1));
                        cmgm cmgm0 = cmgl.a(hftp0);
                        cmfe cmfe0 = ((cmfs)cmgm0.a.b_message).d;
                        if(cmfe0 == null) {
                            cmfe0 = cmfe.a;
                        }
                        ibuq.e(cmfe0, "getGoogleSettings(...)");
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)cmfe0).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)cmfe0));
                        cmgf cmgf0 = cmge.a(hftp1);
                        cmgf0.e(s);
                        cmgm0.b(cmgf0.a());
                        cmfs0 = cmgm0.a();
                    }
                    cmhx1 = new cmhx(cmhx0.a, cmfs0, cmhx0.c, cmhx0.d);
                }
            }
            while(!icnl0.h(object0, bvgx.a(((bvgx)object0), null, null, null, cmhx1, 23)));
            ((bvkk)lsb0).h();
        }
        cmfb cmfb0 = (cmfb)ltx0.a(bvkk.b);
        if(cmfb0 != null) {
            lsb0.g = cmfb0;
            ((bvkk)lsb0).g();
        }
        return lsb0;
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

