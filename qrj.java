import java.util.List;
import java.util.Locale;

public final class qrj {
    public final List a;
    public final qkb b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final qqg h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final qqe p;
    public final qqf q;
    public final qpw r;
    public final List s;
    public final boolean t;
    public final qqj u;
    public final qse v;
    public final int w;
    public final int x;
    public final int y;

    public qrj(List list0, qkb qkb0, String s, long v, int v1, long v2, String s1, List list1, qqg qqg0, int v3, int v4, int v5, float f, float f1, float f2, float f3, qqe qqe0, qqf qqf0, List list2, int v6, qpw qpw0, boolean z, qqj qqj0, qse qse0, int v7) {
        this.a = list0;
        this.b = qkb0;
        this.c = s;
        this.d = v;
        this.w = v1;
        this.e = v2;
        this.f = s1;
        this.g = list1;
        this.h = qqg0;
        this.i = v3;
        this.j = v4;
        this.k = v5;
        this.l = f;
        this.m = f1;
        this.n = f2;
        this.o = f3;
        this.p = qqe0;
        this.q = qqf0;
        this.s = list2;
        this.x = v6;
        this.r = qpw0;
        this.t = z;
        this.u = qqj0;
        this.v = qse0;
        this.y = v7;
    }

    public final String a(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        stringBuilder0.append(this.c);
        stringBuilder0.append("\n");
        qkb qkb0 = this.b;
        qrj qrj0 = qkb0.d(this.e);
        if(qrj0 != null) {
            stringBuilder0.append("\t\tParents: ");
            stringBuilder0.append(qrj0.c);
            for(qrj qrj1 = qkb0.d(qrj0.e); qrj1 != null; qrj1 = qkb0.d(qrj1.e)) {
                stringBuilder0.append("->");
                stringBuilder0.append(qrj1.c);
            }
            stringBuilder0.append(s);
            stringBuilder0.append("\n");
        }
        List list0 = this.g;
        if(!list0.isEmpty()) {
            stringBuilder0.append(s);
            stringBuilder0.append("\tMasks: ");
            stringBuilder0.append(list0.size());
            stringBuilder0.append("\n");
        }
        int v = this.i;
        if(v != 0) {
            int v1 = this.j;
            if(v1 != 0) {
                stringBuilder0.append(s);
                stringBuilder0.append("\tBackground: ");
                stringBuilder0.append(String.format(Locale.US, "%dx%d %X\n", v, v1, ((int)this.k)));
            }
        }
        List list1 = this.a;
        if(!list1.isEmpty()) {
            stringBuilder0.append(s);
            stringBuilder0.append("\tShapes:\n");
            for(Object object0: list1) {
                stringBuilder0.append(s);
                stringBuilder0.append("\t\t");
                stringBuilder0.append(object0);
                stringBuilder0.append("\n");
            }
        }
        return stringBuilder0.toString();
    }

    @Override
    public final String toString() {
        return this.a("");
    }
}

