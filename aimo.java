import java.util.concurrent.atomic.AtomicReference;

public final class aimo implements glzn {
    public final aink a;
    public final AtomicReference b;
    public final byte[] c;
    public final long d;

    public aimo(aink aink0, AtomicReference atomicReference0, byte[] arr_b, long v) {
        this.a = aink0;
        this.b = atomicReference0;
        this.c = arr_b;
        this.d = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v = ((ajam)object0).b;
        this.b.set(((ajam)object0));
        byte[] arr_b = this.c;
        aink aink0 = this.a;
        int v1 = 2;
        if(v == 2) {
            ((ggtj)aink.a.h()).P("Restoring Blockstore state from %s (%d bytes)", aink0.d, arr_b.length);
            ((ggtj)aink.a.h()).x("Checking App restore notification status");
            return aink0.h.d();
        }
        ((ggtj)aink.a.i()).P("Unable to restore Blockstore state from %s (%d bytes)", aink0.d, arr_b.length);
        if(v == 0) {
            throw null;
        }
        switch(v - 1) {
            case 1: {
                break;
            }
            case 2: {
                v1 = 4;
                break;
            }
            default: {
                return glzd.g(gmbt.h(aink0.h(1, this.d, arr_b.length, ((ajam)object0).a)), new aimt(), gmap.a);
            }
        }
        return glzd.g(gmbt.h(aink0.h(v1, this.d, arr_b.length, ((ajam)object0).a)), new aimt(), gmap.a);
    }
}

