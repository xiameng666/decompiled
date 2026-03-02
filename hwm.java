import java.util.List;

public final class hwm {
    public hzk a;
    public hvt b;
    public final hws c;
    public int d;

    public hwm() {
    }

    public hwm(hws hws0) {
        this.c = hws0;
        this();
        this.d = 1;
    }

    public final void a(hvt hvt0, boolean z) {
        List list0 = hvt0.a;
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            if(((hwe)list0.get(v2)).c()) {
                this.c(hvt0);
                return;
            }
        }
        hzk hzk0 = this.a;
        if(hzk0 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        hws hws0 = this.c;
        hwv.a(hvt0, hzk0.j(0L), new hwp(this, hws0), false);
        if(this.d == 2) {
            if(z) {
                int v3 = list0.size();
                for(int v1 = 0; v1 < v3; ++v1) {
                    ((hwe)list0.get(v1)).b();
                }
            }
            hvo hvo0 = hvt0.b;
            if(hvo0 != null) {
                hvo0.c = hws0.b ^ 1;
            }
        }
    }

    public final void b() {
        this.d = 1;
        this.c.b = false;
        this.b = null;
    }

    public final void c(hvt hvt0) {
        if(this.d == 2) {
            hzk hzk0 = this.a;
            if(hzk0 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            hwv.a(hvt0, hzk0.j(0L), new hwr(this.c), true);
        }
        this.d = 3;
    }
}

