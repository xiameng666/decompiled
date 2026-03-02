public final class eqqu implements acn {
    public final eqqt a;

    public eqqu(eqqt eqqt0) {
        this.a = eqqt0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        String s2;
        String s1;
        int v1;
        int v = ((gvfy)object0).b;
        switch(v) {
            case 0: {
                v1 = 3;
                break;
            }
            case 5: {
                v1 = 1;
                break;
            }
            default: {
                v1 = v == 6 ? 2 : 0;
            }
        }
        String s = null;
        if(v1 == 0) {
            throw null;
        }
        switch(v1 - 1) {
            case 0: {
                gvfx gvfx0 = v == 5 ? ((gvfx)((gvfy)object0).c) : gvfx.a;
                String s3 = gvfx0.c == 1 ? ((String)gvfx0.d) : "";
                String s4 = (((gvfy)object0).b == 5 ? ((gvfx)((gvfy)object0).c) : gvfx.a).g;
                eqqv.a.d("selected out come: %s, account selection token: %s", new Object[]{s3, s4});
                s2 = s4;
                s1 = null;
                s = s3;
                break;
            }
            case 1: {
                eqqv.a.m("selection cancelled.", new Object[0]);
                s1 = "CANCELLED";
                s2 = null;
                break;
            }
            case 2: {
                eqqv.a.m("selection result not set.", new Object[0]);
                s1 = null;
                s2 = null;
                break;
            }
            default: {
                s1 = null;
                s2 = null;
            }
        }
        eqqt eqqt0 = this.a;
        if(s != null) {
            eqqt0.w(s, s2);
            return;
        }
        eqqt0.x(s1);
    }
}

