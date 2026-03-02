import java.util.ArrayList;
import java.util.List;

public abstract class hmbi implements hmbc {
    public List a;
    public List b;
    public List c;
    public boolean d;
    protected hmbe e;
    protected hmbf f;
    protected hmbb g;
    private List h;
    private List i;
    private List j;

    public hmbi() {
        this.d = true;
    }

    @Override  // hmbc
    public final hmbg a() {
        this.g.c("===================== Executing command %s ===", new Object[]{this.getClass().getSimpleName()});
        this.g.e();
        if(this.h != null && !this.h.isEmpty()) {
            Byte byte0 = this.e.a();
            if(!this.h.contains(byte0)) {
                Byte byte1 = this.e.a();
                this.g.a("Class byte is not allowed, CLA=%02X, command=%s", new Object[]{byte1, this.getClass().getSimpleName()});
                throw new hmfn(hmfl.U);
            }
        }
        if(this.a != null && !this.a.isEmpty()) {
            Byte byte2 = this.e.d();
            if(!this.a.contains(byte2)) {
                Byte byte3 = this.e.d();
                this.g.a("P1 byte is not allowed, P1=%02X, command=%s", new Object[]{byte3, this.getClass().getSimpleName()});
                goto label_19;
            }
        }
        if(this.b != null && !this.b.isEmpty()) {
            Byte byte4 = this.e.e();
            if(!this.b.contains(byte4)) {
                Byte byte5 = this.e.e();
                this.g.a("P2 byte is not allowed, P2=%02X, command=%s", new Object[]{byte5, this.getClass().getSimpleName()});
            label_19:
                if(!(this instanceof hmbt) && !(this instanceof hmbo)) {
                    throw new hmfm(hmfl.V);
                }
                throw new hmfn(hmfl.V);
            }
        }
        if(this.i != null && !this.i.isEmpty()) {
            Byte byte6 = (byte)(this.e.b() & 0xFF);
            if(!this.i.contains(byte6)) {
                Byte byte7 = this.e.b();
                this.g.a("Lc byte is not allowed, Lc=%02X, command=%s", new Object[]{byte7, this.getClass().getSimpleName()});
                if(!(this instanceof hmbt) && !(this instanceof hmbo)) {
                    throw new hmfm(hmfl.W);
                }
                throw new hmfn(hmfl.W);
            }
        }
        if(this.j != null && !this.j.isEmpty()) {
            Byte byte8 = this.e.c();
            if(!this.j.contains(byte8)) {
                Byte byte9 = this.e.c();
                this.g.a("Le byte is not allowed, Le=%02X, command=%s", new Object[]{byte9, this.getClass().getSimpleName()});
                throw new hmfm(hmfl.X);
            }
        }
        if(this.d) {
            hmbe hmbe0 = this.e;
            int v = (this.e.b() & 0xFF) + 6;
            if(hmbe0.b.length != v) {
                Byte byte10 = hmbe0.b();
                this.g.a("Mismatch between Lc and actual length, Lc=%02X, command=%s", new Object[]{byte10, this.getClass().getSimpleName()});
                if(!(this instanceof hmbt) && !(this instanceof hmbo)) {
                    throw new hmfm(hmfl.R);
                }
                throw new hmfn(hmfl.R);
            }
        }
        if(this.c != null && !this.c.isEmpty()) {
            hmgh hmgh0 = this.f.b.b;
            if(!this.c.contains(hmgh0)) {
                this.g.a("The engine is in incorrect state, currentState=%s , command=%s", new Object[]{hmgh0.toString(), this.getClass().getSimpleName()});
                if(!(this instanceof hmbt) && !(this instanceof hmbo)) {
                    throw new hmfm(hmfl.ab);
                }
                throw new hmfn(hmfl.ab);
            }
        }
        hmbg hmbg0 = this.d();
        hmbg0.a(this.f.a.f);
        this.g.e();
        this.g.c("===================== %s Finished =====================", new Object[]{this.getClass().getSimpleName()});
        return hmbg0;
    }

    @Override  // hmbc
    public final void b(byte[] arr_b, hmbf hmbf0) {
        this.e = this.c(arr_b);
        this.f = hmbf0;
        this.g = hmhe.a();
    }

    protected abstract hmbe c(byte[] arg1);

    protected abstract hmbg d();

    protected final void e(byte b) {
        ArrayList arrayList0 = new ArrayList();
        this.h = arrayList0;
        arrayList0.add(Byte.valueOf(b));
    }

    protected final void f(byte b, byte b1) {
        this.i = new ArrayList();
        for(int v = b & 0xFF; v <= (b1 & 0xFF); ++v) {
            this.i.add(Byte.valueOf(((byte)v)));
        }
    }

    protected final void g(byte b) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        arrayList0.add(Byte.valueOf(b));
    }

    protected final void h(byte b) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        arrayList0.add(Byte.valueOf(b));
    }

    protected final void i(hmgh hmgh0) {
        ArrayList arrayList0 = new ArrayList();
        this.c = arrayList0;
        arrayList0.add(hmgh0);
    }

    protected final void j() {
        ArrayList arrayList0 = new ArrayList();
        this.j = arrayList0;
        arrayList0.add(Byte.valueOf(((byte)0)));
    }

    protected static final int k(List list0) {
        if(list0.isEmpty()) {
            return 3;
        }
        return list0.contains(hmhq.i) || list0.contains(hmhq.e) || list0.contains(hmhq.h) || list0.contains(hmhq.a) || list0.contains(hmhq.c) ? 1 : 2;
    }
}

