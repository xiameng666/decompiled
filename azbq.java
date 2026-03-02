final class azbq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public azbp e;
    public final azbo f;

    public azbq(azbo azbo0, int v, int v1, aywt aywt0) {
        this.e = null;
        boolean z = true;
        batl.b(azbo0 != null);
        batl.b(v >= 0);
        batl.b(v1 >= 7);
        int v2 = v + v1;
        batl.b(v2 <= azbo0.c());
        batl.b(aywq.b(v) + 4 <= v1);
        if(aywt0 == null) {
            z = false;
        }
        batl.b(z);
        this.f = azbo0;
        int v3 = aywq.a(v);
        this.a = v3;
        this.b = v3 + 4;
        this.c = v2;
        this.d = azbc.ai;
    }

    public final int a() {
        int v = this.f.b(this.a);
        if(v >= 0) {
            return v;
        }
        throw new ayyr("block count is not valid");
    }

    public final int b(int v) {
        int v1 = this.f.a(v);
        if(v1 <= 0 || v1 > 0x40) {
            throw new ayyr("source length is not valid");
        }
        if(aywq.a(v + v1 + 1) + this.d <= this.c) {
            return v1;
        }
        throw new ayyr("source length is out of bounds");
    }

    public final String c(int v) {
        int v1 = 0;
        boolean z = true;
        batl.b(v >= 0);
        int v2 = v + 1;
        if(this.d + v2 >= this.c) {
            z = false;
        }
        batl.b(z);
        int v3 = this.b(v);
        StringBuilder stringBuilder0 = new StringBuilder();
        while(v1 < v3) {
            stringBuilder0.append(((char)this.f.a(v2)));
            ++v1;
            ++v2;
        }
        return stringBuilder0.toString();
    }
}

