import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cfk implements gsw {
    public final gra a;
    public final gra b;
    public final gra c;
    public final gra d;
    public final gra e;
    public final gra f;
    public final gra g;
    public cfk h;
    public final gra i;
    public final gtj j;
    public cfe k;
    public hks l;
    private final gra m;

    public cfk(cfj cfj0, ccl ccl0, cfr cfr0, cga cga0, cft cft0) {
        this.m = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
        this.j = new ParcelableSnapshotMutableFloatState(0.0f);
        Boolean boolean0 = Boolean.valueOf(true);
        this.a = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.b = new ParcelableSnapshotMutableState(cfj0, gul.a);
        this.c = new ParcelableSnapshotMutableState(ccl0, gul.a);
        this.d = new ParcelableSnapshotMutableState(cfr0, gul.a);
        this.e = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.f = new ParcelableSnapshotMutableState(cga0, gul.a);
        this.g = new ParcelableSnapshotMutableState(cft0, gul.a);
        this.i = new ParcelableSnapshotMutableState(null, gul.a);
    }

    public final float a() {
        return this.j.e();
    }

    public final ccl b() {
        return (ccl)this.c.a();
    }

    public final cfj c() {
        return (cfj)this.b.a();
    }

    public final cft d() {
        return (cft)this.g.a();
    }

    public final hpn e() {
        return (hpn)this.i.a();
    }

    @Override  // gsw
    public final void f() {
    }

    @Override  // gsw
    public final void g() {
        cfz cfz0 = this.c().b;
        cfj cfj0 = this.c();
        cfj0.d.remove(this);
        cfj0.e.remove(this);
        cfj0.c();
        cfz0.c();
        cfz0.e.remove(this);
        if(cfj0.d.isEmpty()) {
            cfw cfw0 = new cfw(cfj0, this, null);
            icbb.b(cfj0.b.a, null, null, cfw0, 3);
        }
        this.c().b();
    }

    @Override  // gsw
    public final void h() {
        cfz cfz0 = this.c().b;
        cfj cfj0 = this.c();
        cfj0.d.add(this);
        cfj0.c();
        cfz0.c();
        SnapshotStateList snapshotStateList0 = cfz0.e;
        int v = 0;
        hcz hcz0 = new hcz(snapshotStateList0, 0);
        while(true) {
            if(!hcz0.hasNext()) {
                v = -1;
                break;
            }
            Object object0 = hcz0.next();
            cfk cfk0 = (cfk)object0;
            cfj cfj1 = null;
            if(!(cfk0 instanceof cfk)) {
                cfk0 = null;
            }
            if(cfk0 != null) {
                cfj1 = cfk0.c();
            }
            if(ibuq.m(cfj1, this.c())) {
                break;
            }
            ++v;
        }
        if(v != snapshotStateList0.a() - 1 && v != -1) {
            snapshotStateList0.add(v + 1, this);
        }
        else {
            snapshotStateList0.add(this);
        }
        this.c().b();
    }

    public final void i(boolean z) {
        this.m.b(Boolean.valueOf(z));
    }

    public final boolean j() {
        return this.b().f() || this.c().a().i() && !this.c().a().f() || !((Boolean)this.e.a()).booleanValue();
    }

    public final boolean k() {
        return this.j() && this.c().d() && this.m() && ((Boolean)this.a.a()).booleanValue() && this.c().b.d();
    }

    public final boolean l() {
        return this.b().f();
    }

    public final boolean m() {
        cft cft0 = this.d();
        if(((Boolean)this.m.a()).booleanValue()) {
            cft0.b();
            return true;
        }
        return false;
    }
}

