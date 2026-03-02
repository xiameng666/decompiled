import java.util.List;

public final class jbd {
    public final iwj a;
    public final jbn b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final jks g;
    public final jlm h;
    public final long i;
    public final jed j;

    public jbd(iwj iwj0, jbn jbn0, List list0, int v, boolean z, int v1, jks jks0, jlm jlm0, jed jed0, long v2) {
        this.a = iwj0;
        this.b = jbn0;
        this.c = list0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = jks0;
        this.h = jlm0;
        this.j = jed0;
        this.i = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jbd)) {
            return false;
        }
        if(!ibuq.m(this.a, ((jbd)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((jbd)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((jbd)object0).c)) {
            return false;
        }
        if(this.d != ((jbd)object0).d) {
            return false;
        }
        if(this.e != ((jbd)object0).e) {
            return false;
        }
        if(!jkl.a(this.f, ((jbd)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.g, ((jbd)object0).g)) {
            return false;
        }
        if(this.h != ((jbd)object0).h) {
            return false;
        }
        return ibuq.m(this.j, ((jbd)object0).j) ? jkp.h(this.i, ((jbd)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        int v1 = this.g.hashCode();
        return this.e ? ((((((v * 0x1F + this.d) * 0x1F + 0x4CF) * 0x1F + this.f) * 0x1F + v1) * 0x1F + this.h.hashCode()) * 0x1F + this.j.hashCode()) * 0x1F + jkn.a(this.i) : ((((((v * 0x1F + this.d) * 0x1F + 0x4D5) * 0x1F + this.f) * 0x1F + v1) * 0x1F + this.h.hashCode()) * 0x1F + this.j.hashCode()) * 0x1F + jkn.a(this.i);
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("TextLayoutInput(text=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", style=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", placeholders=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", maxLines=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", softWrap=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", overflow=");
        int v = this.f;
        if(v == 1) {
            s = "Clip";
        }
        else {
            switch(v) {
                case 2: {
                    s = "Ellipsis";
                    break;
                }
                case 3: {
                    s = "Visible";
                    break;
                }
                case 4: {
                    s = "StartEllipsis";
                    break;
                }
                case 5: {
                    s = "MiddleEllipsis";
                    break;
                }
                default: {
                    s = "Invalid";
                }
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", density=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", layoutDirection=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", fontFamilyResolver=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", constraints=");
        stringBuilder0.append(jkp.f(this.i));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

