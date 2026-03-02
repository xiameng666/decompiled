import j..util.Objects;

final class aaip extends pct {
    final aaiu a;

    public aaip(aaiu aaiu0) {
        Objects.requireNonNull(aaiu0);
        this.a = aaiu0;
        super();
    }

    @Override  // pct
    public final void kh(int v) {
        aaiu aaiu0 = this.a;
        int v1 = 2;
        if(aaiu0.al == 2) {
            v1 = 3;
        }
        else if(v != aaiu0.ai.b()) {
            v1 = 5;
        }
        if(!aaiu0.ak && v >= 0 && v < aaiu0.aj.size()) {
            grxw grxw0 = ((aaoz)aaiu0.aj.get(v)).d;
            aaiu0.a.c(grxw0, v1);
        }
    }

    @Override  // pct
    public final void ki(int v, float f) {
        aaiu aaiu0 = this.a;
        if(!aaiu0.ak && v >= 0 && v < aaiu0.aj.size()) {
            grxw grxw0 = ((aaoz)aaiu0.aj.get(v)).d;
            if(!bata.b(grxw0, aaiu0.d)) {
                aaiu0.a.b(grxw0);
            }
            if(f != 0.0f && v + 1 < aaiu0.aj.size()) {
                grxw grxw1 = ((aaoz)aaiu0.aj.get(v + 1)).d;
                if(!bata.b(grxw1, aaiu0.d)) {
                    aaiu0.a.b(grxw1);
                }
            }
        }
    }
}

