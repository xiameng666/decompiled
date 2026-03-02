public final class ebsj implements ibts {
    public final ebsr a;

    public ebsj(ebsr ebsr0) {
        this.a = ebsr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        evly evly0;
        evnm evnm0 = eekn.c(((ftok)object0));
        ebsr ebsr0 = this.a;
        if(((ftok)object0) != null && ((ftok)object0).b != 6) {
            switch(evnm0.b) {
                case 20: {
                    break;
                }
                case 0x2F: {
                    evly0 = (evly)evnm0.c;
                label_7:
                    dyli dyli0 = evly0.b == null ? dyli.a : evly0.b;
                    dykv dykv0 = dyli0.b == 1 ? ((dykv)dyli0.c) : dykv.a;
                    String s = (dykv0.d == null ? dyib.a : dykv0.d).c;
                    ibuq.e(s, "getCid(...)");
                    dzrd dzrd0 = ebsr0.g;
                    if(dzrd0 == null) {
                        ibuq.j("wearProvisionHelper");
                        dzrd0 = null;
                    }
                    dzrd0.b(new ebsm(ebsr0, s), new ebsn(ebsr0, s), new ebso(ebsr0, s), new ebsp(ebsr0, s), s);
                    return ibom.a;
                }
                default: {
                    evly0 = evly.a;
                    goto label_7;
                }
            }
        }
        ebsr.g(ebsr0, dyfj.c);
        return ibom.a;
    }
}

