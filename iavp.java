import java.util.ArrayList;

final class iavp {
    public ArrayList a;
    public volatile iall b;

    public iavp() {
        this.a = new ArrayList();
        this.b = iall.d;
    }

    final void a(iall iall0) {
        gftb.z(iall0, "newState");
        if(this.b != iall0 && this.b != iall.e) {
            this.b = iall0;
            if(!this.a.isEmpty()) {
                ArrayList arrayList0 = this.a;
                this.a = new ArrayList();
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((iavo)arrayList0.get(v1)).a();
                }
            }
        }
    }
}

