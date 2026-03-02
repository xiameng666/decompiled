public final class hbrj implements hbqx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;

    public hbrj(int v, int v1, int v2, int v3, int v4, long v5, int v6) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
    }

    @Override  // hbqx
    public final hbrb a() {
        hbkc hbkc0;
        hbkb hbkb0 = new hbkb();
        hbkb0.c = hbrk.a(this.a);
        switch(this.b) {
            case 1: {
                hbkc0 = hbkc.b;
                break;
            }
            case 2: {
                hbkc0 = hbkc.c;
                break;
            }
            case 3: {
                hbkc0 = hbkc.d;
                break;
            }
            case 4: {
                hbkc0 = hbkc.e;
                break;
            }
            default: {
                hbkc0 = hbkc.f;
            }
        }
        hbkb0.b = hbkc0;
        Integer.valueOf(this.c).getClass();
        hbkb0.d = (int)(this.c & 0x7FFFFFFF);
        Integer.valueOf(this.d).getClass();
        hbkb0.f = (int)(this.d & 0x7FFFFFFF);
        Integer.valueOf(this.e).getClass();
        hbkb0.e = (int)(this.e & 0x7FFFFFFF);
        Long.valueOf(this.f).getClass();
        hbkb0.a = (long)(this.f & 0x7FFFFFFFFFFFFFFFL);
        Integer.valueOf(this.g).getClass();
        hbkb0.g = (int)(this.g & 0x7FFFFFFF);
        hbkd hbkd0 = new hbkd(hbkb0);
        hbkp hbkp0 = new hbkp();
        hbkp0.j = hbkd0;
        return new hbrb(hbkp0, 0);
    }
}

