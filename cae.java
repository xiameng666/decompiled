import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cae extends cgi {
    private final gra a;
    private cfe b;

    public cae(cfe cfe0) {
        this.b = cfe0;
        this.a = new ParcelableSnapshotMutableState(null, gul.a);
    }

    @Override  // cgi
    public final cgi a() {
        return cey.a;
    }

    @Override  // cgi
    public final cgv b() {
        return null;
    }

    @Override  // cgi
    public final hka c() {
        return (hka)this.a.a();
    }

    @Override  // cgi
    public final hka d(cfj cfj0) {
        Object object0;
        hka hka0 = this.c();
        if(hka0 != null) {
            return hka0;
        }
        if(this.c() == null) {
            cfe cfe0 = this.b;
            if(cfe0 == null) {
                SnapshotStateList snapshotStateList0 = cfj0.d;
                int v = snapshotStateList0.a();
                for(int v1 = 0; true; ++v1) {
                    object0 = null;
                    if(v1 >= v) {
                        break;
                    }
                    Object object1 = snapshotStateList0.get(v1);
                    if(cfj0.e.contains(((cfk)object1))) {
                        object0 = object1;
                        break;
                    }
                }
                cfe0 = ((cfk)object0) == null ? null : ((cfk)object0).k;
            }
            hka hka1 = cgk.c(cfj0, cfe0);
            if(hka1 != null) {
                this.j(hka1);
            }
        }
        return this.c();
    }

    @Override  // cgi
    public final void e(hka hka0) {
        this.j(hka0);
    }

    @Override  // cgi
    public final boolean f() {
        return true;
    }

    @Override  // cgi
    public final cgi g(cfj cfj0, cfe cfe0, long v, long v1, long v2) {
        Object object0;
        cgv cgv0 = new cgv(v, hjz.c(v1, v2), v2);
        hka hka0 = this.c();
        if(hka0 == null) {
            cfe cfe1 = this.b;
            if(cfe1 == null) {
                SnapshotStateList snapshotStateList0 = cfj0.d;
                int v3 = snapshotStateList0.a();
                for(int v4 = 0; true; ++v4) {
                    object0 = null;
                    if(v4 >= v3) {
                        break;
                    }
                    Object object1 = snapshotStateList0.get(v4);
                    if(cfj0.e.contains(((cfk)object1))) {
                        object0 = object1;
                        break;
                    }
                }
                cfe1 = ((cfk)object0) == null ? null : ((cfk)object0).k;
            }
            hka0 = cgk.c(cfj0, cfe1);
            if(hka0 == null) {
                hka0 = hkb.b(v1, v);
            }
        }
        cgk.b(cgv0, v, v1, v2, true);
        return new cex(cgv0, cfe0, hka0);
    }

    @Override  // cgi
    public final cgi h(cfe cfe0) {
        if(this.b == null) {
            this.b = cfe0;
        }
        return this;
    }

    private final void j(hka hka0) {
        this.a.b(hka0);
    }
}

