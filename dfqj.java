final class dfqj implements ibtx {
    final dfqp a;
    final gui b;
    final ibth c;
    final ibth d;
    final boolean e;

    public dfqj(dfqp dfqp0, gui gui0, ibth ibth0, ibth ibth1, boolean z) {
        this.a = dfqp0;
        this.b = gui0;
        this.c = ibth0;
        this.d = ibth1;
        this.e = z;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        hey hey1;
        boolean z1;
        String s3;
        String s2;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$ScrollableScaffold");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        dfqp dfqp0 = this.a;
        if((dfqp0.a instanceof dfog)) {
            dfoh dfoh0 = dfqp0.d;
            if((dfoh0 instanceof dfog) && (dfqp0.c instanceof dfog)) {
                dfoh dfoh1 = dfqp0.b;
                if((dfoh1 instanceof dfog)) {
                    ((goz)object1).M(0x6622473F);
                    ddxv.b(((goz)object1));
                    dhg dhg0 = dho.g(16.0f);
                    ddxv.b(((goz)object1));
                    hfc hfc0 = dla.i(hfc.e, 0.0f, 16.0f, 1);
                    gui gui0 = this.b;
                    ibth ibth0 = this.c;
                    ibth ibth1 = this.d;
                    boolean z = this.e;
                    iau iau0 = dii.a(dhg0, hei.m, ((goz)object1), 0);
                    long v1 = gol.c(((goz)object1));
                    hey hey0 = hfc.e;
                    gzk gzk0 = ((goz)object1).ap();
                    hfc hfc1 = hew.c(((goz)object1), hfc0);
                    ibth ibth2 = iej.a;
                    ((goz)object1).O();
                    if(((goz)object1).ab()) {
                        ((goz)object1).t(ibth2);
                    }
                    else {
                        ((goz)object1).T();
                    }
                    int v2 = (int)(v1 ^ v1 >>> 0x20);
                    guo.b(((goz)object1), iau0, iej.e);
                    guo.b(((goz)object1), gzk0, iej.d);
                    ibtw ibtw0 = iej.f;
                    if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
                        Integer integer0 = v2;
                        ((goz)object1).R(integer0);
                        ((goz)object1).p(integer0, ibtw0);
                    }
                    guo.a(((goz)object1), iej.g);
                    guo.b(((goz)object1), hfc1, iej.c);
                    String s = isq.c(0x7F152DC6, ((goz)object1));  // string:sharing_visible_to_nearby_devices "Visible to nearby devices"
                    String s1 = isq.c(0x7F152D45, ((goz)object1));  // string:sharing_setup_subtitle_visibility_none "No one can share with you until you 
                                                                    // make yourself visible"
                    Number number0 = (Number)((dfog)dfoh1).a;
                    if(number0.intValue() == 0) {
                        s2 = s;
                        s3 = s1;
                        z1 = false;
                    }
                    else {
                        s2 = s;
                        s3 = s1;
                        z1 = true;
                    }
                    ((goz)object1).M(5004770);
                    boolean z2 = ((goz)object1).X(gui0);
                    Object object3 = ((goz)object1).k();
                    if(z2 || object3 == gop.a) {
                        object3 = new dfpx(gui0);
                        ((goz)object1).R(object3);
                    }
                    ((goz)object1).A();
                    dfqn.j(s2, s3, z1, ((ibts)object3), ((goz)object1), 0);
                    Boolean boolean0 = Boolean.valueOf(true);
                    if(ibuq.m(dfoh0, new dfog(boolean0)) && !dfqp0.e) {
                        ((goz)object1).M(1179764250);
                        ((goz)object1).M(5004770);
                        boolean z3 = ((goz)object1).X(gui0);
                        Object object4 = ((goz)object1).k();
                        if(z3 || object4 == gop.a) {
                            object4 = new dfpy(gui0);
                            ((goz)object1).R(object4);
                        }
                        ((goz)object1).A();
                        ((goz)object1).M(5004770);
                        boolean z4 = ((goz)object1).X(gui0);
                        Object object5 = ((goz)object1).k();
                        if(z4 || object5 == gop.a) {
                            object5 = new dfpz(gui0);
                            ((goz)object1).R(object5);
                        }
                        ((goz)object1).A();
                        ((goz)object1).M(5004770);
                        boolean z5 = ((goz)object1).X(gui0);
                        Object object6 = ((goz)object1).k();
                        if(z5 || object6 == gop.a) {
                            object6 = new dfqa(gui0);
                            ((goz)object1).R(object6);
                        }
                        ((goz)object1).A();
                        ddej.f(((ibth)object4), ((ibth)object5), ((ibth)object6), ((goz)object1), 0);
                    }
                    else if(dfqp0.f && !dfqp0.e) {
                        ((goz)object1).M(1180284306);
                        ((goz)object1).M(5004770);
                        boolean z6 = ((goz)object1).X(gui0);
                        Object object7 = ((goz)object1).k();
                        if(z6 || object7 == gop.a) {
                            object7 = new dfqb(gui0);
                            ((goz)object1).R(object7);
                        }
                        ((goz)object1).A();
                        ((goz)object1).M(5004770);
                        boolean z7 = ((goz)object1).X(gui0);
                        Object object8 = ((goz)object1).k();
                        if(z7 || object8 == gop.a) {
                            object8 = new dfqc(gui0);
                            ((goz)object1).R(object8);
                        }
                        ((goz)object1).A();
                        ddej.i(((ibth)object7), ((ibth)object8), ((goz)object1), 0);
                    }
                    else {
                        ((goz)object1).M(1180592787);
                    }
                    ((goz)object1).A();
                    ((goz)object1).M(0x33D181EB);
                    if(ibuq.m(dfoh0, new dfog(boolean0))) {
                        hey1 = hey0;
                        hfc hfc2 = dla.e(hey1, 24.0f, 16.0f);
                        ((goz)object1).M(5004770);
                        boolean z8 = ((goz)object1).X(gui0);
                        Object object9 = ((goz)object1).k();
                        if(z8 || object9 == gop.a) {
                            object9 = new dfqd(gui0);
                            ((goz)object1).R(object9);
                        }
                        ((goz)object1).A();
                        ddej.j(((ibth)object9), hfc2, ((goz)object1), 0x30);
                    }
                    else {
                        hey1 = hey0;
                    }
                    ((goz)object1).A();
                    ddzz.c(dzn.a(hhc.a(hey1, (number0.intValue() == 0 ? 0.35f : 1.0f))), gzf.e(0x3904FF6F, new dfqi(dfqp0, ibth0, gui0, ibth1, z), ((goz)object1)), ((goz)object1), 0x30, 0);
                    ((goz)object1).z();
                    ((goz)object1).A();
                    return ibom.a;
                }
            }
        }
        ((goz)object1).M(1716793801);
        dfqn.c(((goz)object1), 0);
        ((goz)object1).A();
        return ibom.a;
    }
}

