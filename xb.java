public final class xb {
    public final bzs a;
    public final byi b;

    public xb() {
        this.a = new bzs();
        this.b = new byi();
    }

    public final tq a(uq uq0, int v) {
        tq tq0;
        bzs bzs0 = this.a;
        int v1 = bzs0.e(uq0);
        if(v1 < 0) {
            return null;
        }
        xa xa0 = (xa)bzs0.i(v1);
        if(xa0 != null) {
            int v2 = xa0.b;
            if((v2 & v) != 0) {
                int v3 = ~v & v2;
                xa0.b = v3;
                if(v == 4) {
                    tq0 = xa0.c;
                }
                else {
                    if(v != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    tq0 = xa0.d;
                }
                if((v3 & 12) == 0) {
                    bzs0.g(v1);
                    xa.b(xa0);
                }
                return tq0;
            }
        }
        return null;
    }

    final void b(uq uq0) {
        bzs bzs0 = this.a;
        xa xa0 = (xa)bzs0.get(uq0);
        if(xa0 == null) {
            xa0 = xa.a();
            bzs0.put(uq0, xa0);
        }
        xa0.b |= 1;
    }

    public final void c(long v, uq uq0) {
        this.b.h(v, uq0);
    }

    public final void d(uq uq0, tq tq0) {
        bzs bzs0 = this.a;
        xa xa0 = (xa)bzs0.get(uq0);
        if(xa0 == null) {
            xa0 = xa.a();
            bzs0.put(uq0, xa0);
        }
        xa0.d = tq0;
        xa0.b |= 8;
    }

    public final void e(uq uq0, tq tq0) {
        bzs bzs0 = this.a;
        xa xa0 = (xa)bzs0.get(uq0);
        if(xa0 == null) {
            xa0 = xa.a();
            bzs0.put(uq0, xa0);
        }
        xa0.c = tq0;
        xa0.b |= 4;
    }

    public final void f() {
        this.a.clear();
        this.b.g();
    }

    final void g(uq uq0) {
        xa xa0 = (xa)this.a.get(uq0);
        if(xa0 == null) {
            return;
        }
        xa0.b &= -2;
    }

    final void h(uq uq0) {
        byi byi0 = this.b;
        int v = byi0.b();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(uq0 == byi0.f(v)) {
                Object[] arr_object = byi0.c;
                Object object0 = byj.a;
                if(arr_object[v] == object0) {
                    break;
                }
                arr_object[v] = object0;
                byi0.a = true;
                break;
            }
        }
        xa xa0 = (xa)this.a.remove(uq0);
        if(xa0 != null) {
            xa.b(xa0);
        }
    }

    public final boolean i(uq uq0) {
        xa xa0 = (xa)this.a.get(uq0);
        return xa0 != null && (xa0.b & 1) != 0;
    }
}

