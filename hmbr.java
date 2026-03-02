import java.util.ArrayList;

public final class hmbr extends hmbi {
    static {
        hmbd.b(((byte)-78), hmbr.class);
    }

    public hmbr() {
        this.e(0);
        this.a = new ArrayList();
        for(int v = 1; v <= 0xFF; ++v) {
            this.a.add(Byte.valueOf(((byte)v)));
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 <= 0xFF; ++v1) {
            if((v1 & 7) == 4) {
                arrayList0.add(Byte.valueOf(((byte)v1)));
            }
        }
        this.b = arrayList0;
        this.d = false;
        this.c = new hmbq(this);
    }

    @Override  // hmbi
    protected final hmbe c(byte[] arr_b) {
        return new hmbp(arr_b);
    }

    @Override  // hmbi
    protected final hmbg d() {
        int v = ((hmbp)this.e).d();
        int v1 = ((hmbp)this.e).e() >>> 3;
        this.g.e();
        hmcx hmcx0 = this.f.a.p.b.a(((byte)v), ((byte)v1));
        this.g.e();
        hmbg hmbg0 = new hmbx();
        if(hmcx0.b) {
            ((hmbx)hmbg0).e(hmcx0.c, hmcx0.e, hmcx0.d);
            return hmbg0;
        }
        ((hmbx)hmbg0).e(hmcx0.c, hmcx0.e, hmcx0.d);
        return hmbg0;
    }
}

