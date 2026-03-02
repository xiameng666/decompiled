import java.util.HashMap;
import java.util.Map;

public abstract class idr {
    public final ids a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Map h;
    private ids i;

    public idr(ids ids0) {
        this.a = ids0;
        this.b = true;
        this.h = new HashMap();
    }

    protected abstract int a(ihy arg1, hxw arg2);

    protected abstract long b(ihy arg1, long arg2);

    protected abstract Map c(ihy arg1);

    public final void d(hxw hxw0, int v, ihy ihy0) {
        long v3;
        long v1 = ((long)Float.floatToRawIntBits(v)) << 0x20;
        long v2 = ((long)Float.floatToRawIntBits(v)) & 0xFFFFFFFFL;
        while(true) {
            v3 = v1 | v2;
        label_3:
            v3 = this.b(ihy0, v3);
            ihy0 = ihy0.x;
            ibuq.c(ihy0);
            if(ibuq.m(ihy0, this.a.i())) {
                break;
            }
            if(this.c(ihy0).containsKey(hxw0)) {
                float f = (float)this.a(ihy0, hxw0);
                v1 = ((long)Float.floatToRawIntBits(f)) << 0x20;
                v2 = ((long)Float.floatToRawIntBits(f)) & 0xFFFFFFFFL;
                continue;
            }
            goto label_3;
        }
        Map map0 = this.h;
        int v4 = Math.round(((hxw0 instanceof hyy) ? Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL))) : Float.intBitsToFloat(((int)(v3 >> 0x20)))));
        if(map0.containsKey(hxw0)) {
            int v5 = ((Number)ibpz.g(map0, hxw0)).intValue();
            v4 = ((Number)hxw0.a.a(Integer.valueOf(v5), Integer.valueOf(v4))).intValue();
        }
        map0.put(hxw0, Integer.valueOf(v4));
    }

    public final void e() {
        this.b = true;
        ids ids0 = this.a;
        ids ids1 = ids0.h();
        if(ids1 == null) {
            return;
        }
        if(this.c) {
            ids1.m();
        }
        else if(this.e || this.d) {
            ids1.l();
        }
        if(this.f) {
            ids0.m();
        }
        if(this.g) {
            ids0.l();
        }
        ids1.g().e();
    }

    public final void f() {
        this.h.clear();
        idq idq0 = new idq(this);
        this.a.j(idq0);
        Map map0 = this.c(this.a.i());
        this.h.putAll(map0);
        this.b = false;
    }

    public final void g() {
        if(this.i()) {
            this.i = this.a;
            return;
        }
        ids ids0 = this.a.h();
        if(ids0 != null) {
            ids ids1 = ids0.g().i;
            if(ids1 == null || !ids1.g().i()) {
                ids ids2 = this.i;
                if(ids2 != null && !ids2.g().i()) {
                    ids ids3 = ids2.h();
                    if(ids3 != null) {
                        idr idr0 = ids3.g();
                        if(idr0 != null) {
                            idr0.g();
                        }
                    }
                    ids ids4 = ids2.h();
                    if(ids4 == null) {
                        ids1 = null;
                    }
                    else {
                        idr idr1 = ids4.g();
                        ids1 = idr1 == null ? null : idr1.i;
                    }
                    this.i = ids1;
                }
            }
            else {
                this.i = ids1;
            }
        }
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean j() {
        this.g();
        return this.i != null;
    }
}

