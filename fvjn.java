import j..util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class fvjn implements Iterator {
    final fvjo a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public fvjn(fvjo fvjo0, ggxm ggxm0) {
        Objects.requireNonNull(fvjo0);
        this.a = fvjo0;
        super();
        int v = Math.max(((int)Math.floor((ggxm0.f().a - fvjo0.a()) / fvjo0.a.a())), 0);
        this.b = v;
        this.d = Math.min(((int)Math.ceil((ggxm0.e().a - fvjo0.a()) / fvjo0.a.a())), fvjo0.a.c);
        int v1 = Math.max(((int)Math.floor((ggxm0.f().b - fvjo0.b()) / fvjo0.a.a())), 0);
        this.c = v1;
        this.e = Math.min(((int)Math.ceil((ggxm0.e().b - fvjo0.b()) / fvjo0.a.a())), fvjo0.a.c);
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.b(v, v1);
    }

    public final fvjm a() {
        int v2;
        if(!this.hasNext()) {
            throw new NoSuchElementException("No more valid points for this tile.");
        }
        fvjo fvjo0 = this.a;
        hirn hirn0 = fvjo0.b;
        hirl hirl0 = hirl.b(hirn0.f.d(this.h));
        if(hirl0 == null) {
            hirl0 = hirl.a;
        }
        float f = fvjo.d(hirl0) ? hirn0.e.d(this.i) : 0.0f;
        switch(fvjo.c(hirl0)) {
            case 1: {
                hirn0.g.d(this.j);
                break;
            }
            case 2: {
                hirn0.g.d(this.j);
                hirn0.g.d(this.j + 1);
            }
        }
        int v = this.h;
        if(hirn0.h.size() > v) {
            int v1 = hirp.a(hirn0.h.d(v));
            v2 = v1 == 0 ? 1 : v1;
        }
        else {
            v2 = 1;
        }
        float f1 = -1.0f;
        if((hirn0.c & 1) != 0) {
            int v3 = hirn0.i.size();
            int v4 = this.k;
            if(v3 > v4) {
                f1 = (float)(hirn0.i.a(v4) & 0xFF);
            }
        }
        fvjm fvjm0 = new fvjm(new ggxn(fvjo0.a() + ((double)this.f) * fvjo0.a.a(), fvjo0.b() + ((double)this.g) * fvjo0.a.a()), f, hirn0.d.d(this.h), hirl0, v2, f1);
        int v5 = this.f + 1;
        int v6 = this.g;
        if(v5 >= this.d) {
            v5 = this.b;
            ++v6;
        }
        this.b(v5, v6);
        return fvjm0;
    }

    private final void b(int v, int v1) {
        while((this.g < v1 || this.f < v) && this.g < this.e) {
            fvjo fvjo0 = this.a;
            hirn hirn0 = fvjo0.b;
            hirl hirl0 = hirl.b(hirn0.f.d(this.h));
            if(hirl0 == null) {
                hirl0 = hirl.a;
            }
            int v2 = fvjo.c(hirl0);
            this.j += v2;
            if(fvjo.d(hirl0)) {
                ++this.i;
            }
            if(hirn0.h.size() > this.h && hirp.a(hirn0.h.d(this.h)) == 3) {
                ++this.k;
            }
            int v3 = this.f + 1;
            this.f = v3;
            int v4 = fvjo0.a.c;
            if(v3 >= v4) {
                v3 = 0;
                this.f = 0;
                ++this.g;
            }
            this.h = this.g * v4 + v3;
        }
    }

    @Override
    public final boolean hasNext() {
        return this.f < this.d && this.g < this.e;
    }

    @Override
    public final Object next() {
        return this.a();
    }
}

