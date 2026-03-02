import java.util.ArrayList;
import java.util.Locale;

public final class fccm {
    final ArrayList a;
    int b;
    int c;
    private final hcfj d;

    public fccm(hcfj hcfj0) {
        this.b = 0;
        this.d = hcfj0;
        int v1 = hcfj0.c.size();
        for(int v = 0; v < v1; ++v) {
            this.c += ((hcff)hcfj0.c.get(v)).c.size();
        }
        this.a = new ArrayList(Math.min(50, this.c));
    }

    public final fccl a(int v) {
        if(v >= this.c) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, "Cell index %d out of range of total cells %d in the table.", v, ((int)this.c)));
        }
        ArrayList arrayList0 = this.a;
        arrayList0.ensureCapacity(v);
        while(v >= arrayList0.size()) {
            int v1 = ((hcff)this.d.c.get(this.b)).c.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                arrayList0.add(new fccl(this.b, v2));
            }
            ++this.b;
        }
        return (fccl)arrayList0.get(v);
    }

    public final hcfc b(int v) {
        fccl fccl0 = this.a(v);
        return (hcfc)((hcff)this.d.c.get(fccl0.a)).c.get(fccl0.b);
    }

    public final hcff c(int v) {
        int v1 = this.a(v).a;
        return (hcff)this.d.c.get(v1);
    }

    public final hcff d(int v) {
        return v >= this.d.c.size() ? null : ((hcff)this.d.c.get(v));
    }
}

