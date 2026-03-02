public final class dxjy implements ibth {
    public final dxkb a;
    public final dohf b;

    public dxjy(dxkb dxkb0, dohf dohf0) {
        this.a = dxkb0;
        this.b = dohf0;
    }

    @Override  // ibth
    public final Object a() {
        dxjv dxjv0;
        int v = this.b.b();
        String s = this.b.d();
        dxkb dxkb0 = this.a;
        switch(v) {
            case 0: {
                dxjv0 = new dxjv(dxkb0, s);
                break;
            }
            case 1: 
            case 3: {
                dxjv0 = new dxju(dxkb0, s);
                break;
            }
            case 12: {
                dxjv0 = new dxjw(dxkb0.u, s, dxkb0);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown or unsupported pass type: " + v);
            }
        }
        dxjv0.a();
        return ibom.a;
    }
}

