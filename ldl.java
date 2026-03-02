import java.io.File;
import java.util.Map;

final class ldl extends ibsl implements ibtw {
    Object a;
    int b;
    final File c;
    private Object d;

    public ldl(File file0, ibrl ibrl0) {
        this.c = file0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ldl)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ldl(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object4;
        ichm ichm1;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ichm ichm0 = (ichm)this.d;
                ldj ldj0 = new ldj(this.c, ichm0);
                File file0 = this.c.getParentFile();
                ibuq.c(file0);
                String s = file0.getCanonicalFile().getPath();
                synchronized(ldm.a) {
                    Map map0 = ldm.b;
                    Object object3 = map0.get(s);
                    if(object3 == null) {
                        ibuq.c(s);
                        object3 = new ldm(s);
                        map0.put(s, object3);
                    }
                    ((ldm)object3).c.add(ldj0);
                    if(((ldm)object3).c.size() == 1) {
                        ((ldm)object3).startWatching();
                    }
                }
                ldi ldi0 = new ldi(s, ldj0);
                this.d = ichm0;
                this.a = ldi0;
                this.b = 1;
                if(ichm0.a(ibom.a, this) != object1) {
                    ichm1 = ichm0;
                    object4 = ldi0;
                    goto label_36;
                }
                break;
            }
            case 1: {
                object4 = this.a;
                ichm1 = (ichm)this.d;
                ibnx.b(object0);
            label_36:
                ldk ldk0 = new ldk(((icde)object4));
                this.d = null;
                this.a = null;
                this.b = 2;
                if(ichl.b(ichm1, ldk0, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

