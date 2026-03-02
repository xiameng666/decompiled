import android.view.View;

final class mh extends kfu {
    final mi a;
    private boolean b;
    private int c;

    public mh(mi mi0) {
        this.a = mi0;
        super();
        this.b = false;
        this.c = 0;
    }

    @Override  // kfu
    public final void a(View view0) {
        int v = this.c + 1;
        this.c = v;
        mi mi0 = this.a;
        if(v == mi0.a.size()) {
            kft kft0 = mi0.b;
            if(kft0 != null) {
                kft0.a(null);
            }
            this.c = 0;
            this.b = false;
            mi0.c = false;
        }
    }

    @Override  // kfu
    public final void b() {
        if(!this.b) {
            this.b = true;
            kft kft0 = this.a.b;
            if(kft0 != null) {
                kft0.b();
            }
        }
    }
}

