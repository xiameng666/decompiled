import java.util.Arrays;

public abstract class hmoa extends hmnz {
    public boolean d;
    public int e;
    final hmof f;

    public hmoa() {
        this.d = false;
        this.e = 0;
        this.c = new hmof();
        this.f = (hmof)this.c;
    }

    @Override  // hmnz
    public final void a(hmoe hmoe0) {
        this.f.b(hmoe0);
        this.a = Arrays.copyOf(this.c.a, this.c.a.length);
    }

    @Override  // hmnz
    public final hmoe h() {
        return this.f.a();
    }

    @Override  // hmnz
    public final void m(boolean z, hmno hmno0) {
        if(z) {
            if(this.b) {
                System.arraycopy(this.a, 0, this.f.a, 0, this.a.length);
                if(!this.d) {
                    this.q();
                }
                this.b = false;
                this.d = false;
            }
        }
        else if(this.b) {
            System.arraycopy(this.f.a, 0, this.a, 0, this.a.length);
            this.b = false;
            this.d = false;
        }
    }

    public final int n() {
        return this.f.k;
    }

    public final int o() {
        return this.f.l;
    }

    public final int p() {
        return this.f.j;
    }

    protected abstract void q();
}

