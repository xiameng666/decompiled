import java.util.ArrayList;

final class gbbr {
    public gbbr a;
    public ArrayList b;
    public hdrl c;
    public boolean d;

    public gbbr(hdrl hdrl0) {
        this.d = false;
        this.c = hdrl0;
    }

    final void a(gbbr gbbr0) {
        if(this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(gbbr0);
        gbbr0.a = this;
    }

    final void b() {
        ArrayList arrayList0 = this.b;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((gbbr)arrayList0.get(v1)).a = null;
            }
            this.b.clear();
        }
    }

    final void c() {
        if(!this.d) {
            this.d = true;
            gbbr gbbr0 = this.a;
            if(gbbr0 != null) {
                gbbr0.c();
            }
        }
    }
}

