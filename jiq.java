import android.graphics.Paint.Style;
import android.graphics.Shader;
import android.text.TextPaint;

public final class jiq extends TextPaint {
    public int a;
    private hmi b;
    private jjz c;
    private hmt d;
    private hll e;
    private hlf f;
    private gui g;
    private hkf h;
    private hpe i;

    public jiq(float f) {
        super(1);
        this.density = f;
        this.c = jjz.a;
        this.a = 3;
        this.d = hmt.a;
    }

    public final void a(int v) {
        if(v == this.a) {
            return;
        }
        this.g().j(v);
        this.a = v;
    }

    public final void b(hlf hlf0, long v, float f) {
        if(hlf0 == null) {
            this.h();
            return;
        }
        if((!ibuq.m(this.f, hlf0) || (this.h == null || !hkf.g(this.h.a, v))) && v != 0x7FC000007FC00000L) {
            this.f = hlf0;
            this.h = new hkf(v);
            this.g = new gpx(new jip(hlf0, v), null);
        }
        this.g().n((this.g == null ? null : ((Shader)this.g.a())));
        this.e = null;
        jir.a(this, f);
    }

    public final void c(long v) {
        if((this.e == null || !ibog.c(this.e.j, v)) && v != 16L) {
            this.e = new hll(v);
            this.setColor(hln.b(v));
            this.h();
        }
    }

    public final void d(hpe hpe0) {
        if(hpe0 != null && !ibuq.m(this.i, hpe0)) {
            this.i = hpe0;
            if(ibuq.m(hpe0, hpg.a)) {
                this.setStyle(Paint.Style.FILL);
                return;
            }
            if(!(hpe0 instanceof hph)) {
                throw new ibnq();
            }
            this.g().s(1);
            this.g().r(((hph)hpe0).a);
            this.g().q(((hph)hpe0).b);
            this.g().p(((hph)hpe0).d);
            this.g().o(((hph)hpe0).c);
            this.g().t(((hph)hpe0).e);
        }
    }

    public final void e(hmt hmt0) {
        if(hmt0 != null && !ibuq.m(this.d, hmt0)) {
            this.d = hmt0;
            if(ibuq.m(hmt0, hmt.a)) {
                this.clearShadowLayer();
                return;
            }
            this.setShadowLayer(jje.a(this.d.d), Float.intBitsToFloat(((int)(this.d.c >> 0x20))), Float.intBitsToFloat(((int)(this.d.c & 0xFFFFFFFFL))), hln.b(this.d.b));
        }
    }

    public final void f(jjz jjz0) {
        if(jjz0 != null && !ibuq.m(this.c, jjz0)) {
            this.c = jjz0;
            this.setUnderlineText(jjz0.a(jjz.b));
            this.setStrikeThruText(this.c.a(jjz.c));
        }
    }

    private final hmi g() {
        hmi hmi0 = this.b;
        if(hmi0 != null) {
            return hmi0;
        }
        hmi hmi1 = new hkq(this);
        this.b = hmi1;
        return hmi1;
    }

    private final void h() {
        this.g = null;
        this.f = null;
        this.h = null;
        this.setShader(null);
    }
}

