import java.util.List;

public final class ggzu {
    protected int a;
    private final List b;

    public ggzu(List list0) {
        this.b = list0;
    }

    public final ggzt a() {
        return (ggzt)this.b.get(this.a);
    }

    public final void b() {
        this.a = this.b.size();
    }

    public final void c() {
        this.a = 0;
    }

    public final void d(ggym ggym0) {
        int v = this.b.size() - 1;
        int v1 = 0;
        while(v1 <= v) {
            this.a = (v1 + v) / 2;
            int v2 = ggzs.b(this).a(ggym0);
            if(v2 > 0) {
                v = this.a - 1;
            }
            else if(v2 < 0) {
                v1 = this.a + 1;
            }
            else {
                v = this.a;
                if(v1 == v) {
                    return;
                }
            }
        }
        this.a = v1;
    }

    public final boolean e() {
        return this.a == 0;
    }

    public final boolean f() {
        return this.a == this.b.size();
    }

    public final boolean g() {
        int v = this.a;
        if(v > 0) {
            this.a = v - 1;
            return true;
        }
        return false;
    }

    public final void h() {
        if(this.a < this.b.size()) {
            ++this.a;
        }
    }

    public final ggzu i() {
        ggzu ggzu0 = new ggzu(this.b);
        ggzu0.a = this.a;
        return ggzu0;
    }
}

