import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

public final class cgj {
    public final cfj a;
    public cfe b;
    public int c;
    private final gra d;
    private int e;
    private int f;
    private final gtl g;
    private final gtl h;

    public cgj(cfj cfj0) {
        this.a = cfj0;
        this.d = new ParcelableSnapshotMutableState(cey.a, gul.a);
        this.g = new ParcelableSnapshotMutableIntState(0);
        this.c = 1;
        this.h = new ParcelableSnapshotMutableIntState(0);
    }

    public final cgi a() {
        return (cgi)this.d.a();
    }

    public final List b() {
        return this.a.e;
    }

    public final void c() {
        cfe cfe0;
        Object object0;
        List list0 = this.b();
        int v = ((SnapshotStateList)list0).a();
        for(int v1 = 0; true; ++v1) {
            object0 = null;
            cfe0 = null;
            if(v1 >= v) {
                break;
            }
            Object object1 = list0.get(v1);
            if(((cfk)object1).l()) {
                object0 = object1;
                break;
            }
        }
        if(((cfk)object0) != null || this.b != null) {
            if(((cfk)object0) != null) {
                cfe0 = ((cfk)object0).k;
            }
            if(!ibuq.m(cfe0, this.b)) {
                this.h.i(this.f + 1);
            }
        }
    }

    public final void d() {
        Object object2;
        Object object0;
        cgi cgi0;
        int v = 0;
        cfe cfe0 = null;
        if(this.h() != this.e) {
            this.e = this.h();
            int v1 = this.c - 1;
            if(this.c == 0) {
                throw null;
            }
        alab1:
            switch(v1) {
                case 0: {
                    cgi0 = this.a();
                    break;
                }
                case 1: {
                    cgi0 = this.a().h(this.b);
                    break;
                }
                default: {
                    if(v1 != 2) {
                        throw new ibnq();
                    }
                    List list0 = this.b();
                    int v2 = ((SnapshotStateList)list0).a();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        if(ibuq.m(((cfk)list0.get(v3)).k, this.b)) {
                            cgi0 = cey.a;
                            break alab1;
                        }
                    }
                    cgi0 = this.a().a();
                    break;
                }
            }
            this.f(cgi0);
            this.c = 1;
        }
        if(this.i() != this.f) {
            cfj cfj0 = this.a;
            if(cfj0.b.d()) {
                List list1 = this.b();
                int v4 = ((SnapshotStateList)list1).a();
                while(true) {
                    object0 = null;
                    if(v >= v4) {
                        break;
                    }
                    Object object1 = list1.get(v);
                    if(((cfk)object1).l()) {
                        object0 = object1;
                        break;
                    }
                    ++v;
                }
                if(((cfk)object0) != null) {
                    cfe0 = ((cfk)object0).k;
                }
            }
            else {
                SnapshotStateList snapshotStateList0 = cfj0.d;
                int v5 = snapshotStateList0.a();
                while(true) {
                    object2 = null;
                    if(v >= v5) {
                        break;
                    }
                    Object object3 = snapshotStateList0.get(v);
                    if(((cfk)object3).l()) {
                        object2 = object3;
                        break;
                    }
                    ++v;
                }
                if(((cfk)object2) != null) {
                    cfe0 = ((cfk)object2).k;
                }
            }
            if(!ibuq.m(cfe0, this.b)) {
                this.b = cfe0;
            }
            this.f = this.i();
        }
    }

    public final void e() {
        this.c = 1;
        this.e = this.h();
        this.f(cey.a);
    }

    public final void f(cgi cgi0) {
        this.d.b(cgi0);
    }

    public final void g(int v) {
        this.c = v;
        this.g.i(this.e + 1);
    }

    private final int h() {
        return this.g.e();
    }

    private final int i() {
        return this.h.e();
    }
}

