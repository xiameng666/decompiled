import j..util.Objects;

final class fmyf extends tm {
    final fmyi a;

    public fmyf(fmyi fmyi0) {
        Objects.requireNonNull(fmyi0);
        this.a = fmyi0;
        super();
    }

    @Override  // tm
    public final void d(int v, int v1) {
        fmyi fmyi0 = this.a;
        int v2 = fmyi0.j;
        if(v2 != -1 && v2 >= v) {
            fmyi0.j = v2 + v1;
        }
        for(int v3 = 0; v3 < v1 && v3 < fmyi0.b(); ++v3) {
            int v4 = v3 + v;
            if(((fmxe)fmyi0.c(v4)).b().ordinal() == 3) {
                fmyi0.k.removeCallbacksAndMessages(null);
                fmyi0.j = v4;
                fmye fmye0 = new fmye(this);
                fmyi0.k.postDelayed(fmye0, 3000L);
                break;
            }
        }
    }
}

