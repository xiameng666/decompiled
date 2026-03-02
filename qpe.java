import android.content.Context;
import android.graphics.Typeface;

final class qpe extends ibsl implements ibtw {
    final qkb a;
    final Context b;
    final String c;
    final String d;

    public qpe(qkb qkb0, Context context0, String s, String s1, ibrl ibrl0) {
        this.a = qkb0;
        this.b = context0;
        this.c = s;
        this.d = s1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((qpe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new qpe(this.a, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Typeface typeface0;
        ibnx.b(object0);
        for(Object object1: this.a.e.values()) {
            qpo qpo0 = (qpo)object1;
            ibuq.c(qpo0);
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.c);
            stringBuilder0.append(qpo0.a);
            stringBuilder0.append(this.d);
            try {
                typeface0 = Typeface.createFromAsset(this.b.getAssets(), stringBuilder0.toString());
            }
            catch(Exception unused_ex) {
                continue;
            }
            try {
                ibuq.c(typeface0);
                ibuq.e(qpo0.c, "getStyle(...)");
                boolean z = ibzk.G(qpo0.c, "Italic");
                boolean z1 = ibzk.G(qpo0.c, "Bold");
                int v = 0;
                if(z) {
                    if(z1) {
                        v = 3;
                        goto label_29;
                    }
                    else {
                        z1 = false;
                    }
                }
                if(z) {
                    v = 2;
                }
                else if(z1) {
                    v = 1;
                }
            label_29:
                if(typeface0.getStyle() != v) {
                    typeface0 = Typeface.create(typeface0, v);
                }
                qpo0.d = typeface0;
            }
            catch(Exception unused_ex) {
            }
        }
        return ibom.a;
    }
}

