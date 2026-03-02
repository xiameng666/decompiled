import androidx.compose.foundation.MarqueeModifierElement;
import java.util.Map;

final class ddgj implements ibtw {
    final boolean a;
    final hfc b;
    final float c;
    final iwj d;
    final long e;
    final Map f;
    final jbn g;

    public ddgj(boolean z, hfc hfc0, float f, iwj iwj0, long v, Map map0, jbn jbn0) {
        this.a = z;
        this.b = hfc0;
        this.c = f;
        this.d = iwj0;
        this.e = v;
        this.f = map0;
        this.g = jbn0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        hfc hfc1;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(0xCE77EA8);
        if(this.a) {
            hfc hfc0 = this.b;
            ((goz)object0).M(0x6E3C21FE);
            Object object2 = ((goz)object0).k();
            if(object2 == gop.a) {
                object2 = new ddgi();
                ((goz)object0).R(object2);
            }
            ((goz)object0).A();
            hfc1 = dla.j(hhm.b(hlv.a(hfc0, ((ibts)object2)), new ddgg(this.c)).a(new MarqueeModifierElement(1200, cty.a)), this.c, 0.0f, 0.0f, 0.0f, 14);
        }
        else {
            hfc1 = this.b;
        }
        ((goz)object0).A();
        jjy jjy0 = new jjy(3);
        fiuk.a(this.d, hfc1, this.e, 0L, null, 0L, jjy0, 0L, 0, false, 1, this.f, null, this.g, ((goz)object0), 0, 0x6000, 80888);
        return ibom.a;
    }
}

