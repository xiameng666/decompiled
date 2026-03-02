import java.util.List;

public final class duld implements fulf {
    public final fryv a;
    public final List b;
    public fule c;
    private boolean d;

    public duld(fryv fryv0, List list0, int v) {
        if((v & 2) != 0) {
            list0 = null;
        }
        this(fryv0, list0, fule.a, true);
    }

    public duld(fryv fryv0, List list0, fule fule0, boolean z) {
        ibuq.f(fule0, "position");
        super();
        this.a = fryv0;
        this.b = list0;
        this.c = fule0;
        this.d = z;
    }

    @Override  // fulf
    public final void a(fule fule0) {
        ibuq.f(fule0, "<set-?>");
        this.c = fule0;
    }

    @Override  // fulf
    public final void b() {
        this.d = true;
    }

    public static duld c(duld duld0, fule fule0) {
        boolean z = duld0.d;
        ibuq.f(fule0, "position");
        return new duld(duld0.a, duld0.b, fule0, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof duld)) {
            return false;
        }
        if(!ibuq.m(this.a, ((duld)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((duld)object0).b)) {
            return false;
        }
        return this.c == ((duld)object0).c ? this.d == ((duld)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        return this.d ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        return "SharedDataElementsState(title=" + this.a + ", dataElementSections=" + this.b + ", position=" + this.c + ", isContained=" + this.d + ")";
    }
}

