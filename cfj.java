import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cfj {
    public final Object a;
    public final cfz b;
    public final cgj c;
    public final SnapshotStateList d;
    public final SnapshotStateList e;
    public final ibth f;

    public cfj(Object object0, cfz cfz0) {
        this.a = object0;
        this.b = cfz0;
        this.c = new cgj(this);
        this.d = new SnapshotStateList();
        this.e = new SnapshotStateList();
        this.f = new cfh(this);
    }

    public final cgi a() {
        return this.c.a();
    }

    public final void b() {
        this.c.c();
    }

    public final void c() {
        cfi cfi0 = new cfi(this);
        SnapshotStateList snapshotStateList0 = this.e;
        ibpo.G(snapshotStateList0, cfi0);
        SnapshotStateList snapshotStateList1 = this.d;
        int v = snapshotStateList1.a();
        for(int v1 = 0; v1 < v; ++v1) {
            cfk cfk0 = (cfk)snapshotStateList1.get(v1);
            if(cfk0.m() && !snapshotStateList0.contains(cfk0)) {
                snapshotStateList0.add(cfk0);
            }
        }
        boolean z = cfl.a(snapshotStateList0);
        cgj cgj0 = this.c;
        if(((SnapshotStateList)cgj0.b()).a() > 1 && z) {
            cgj0.g(2);
        }
        else if(!cgj0.a.b.d()) {
            cgj0.e();
        }
        else if(!z) {
            cgj0.g(3);
        }
        cgj0.c();
    }

    public final boolean d() {
        return this.a().i();
    }

    public final boolean e() {
        SnapshotStateList snapshotStateList0 = this.e;
        int v = snapshotStateList0.a();
        for(int v1 = 0; v1 < v; ++v1) {
            clj clj0 = ((cfk)snapshotStateList0.get(v1)).b().a;
            clj clj1;
            while((clj1 = clj0.a) != null) {
                clj0 = clj1;
            }
            if(!ibuq.m(clj0.f(), clj0.g())) {
                return true;
            }
        }
        return false;
    }
}

