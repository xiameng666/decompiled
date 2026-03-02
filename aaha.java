import j..util.Objects;

final class aaha extends fnjf {
    final aahd a;

    public aaha(aahd aahd0) {
        Objects.requireNonNull(aahd0);
        this.a = aahd0;
        super();
    }

    @Override  // fnjf
    public final void a(gged_interceptors gged0) {
        fntm fntm0;
        if(gged0 != null) {
            fnlf fnlf0 = this.a.d;
            aaln aaln0 = this.a.b.b;
            aaln0.d();
            String s = aaln0.d().b;
            int v = 0;
            while(v < ((ggna)gged0).c) {
                fntm0 = (fntm)gged0.get(v);
                ++v;
                if(!fntm0.c.equals(s)) {
                    continue;
                }
                goto label_12;
            }
            fntm0 = null;
        label_12:
            fnlf0.i(fntm0);
        }
    }

    @Override  // fnjf
    public final void b(Object object0) {
        if(((fntm)object0) != null) {
            this.a.b.e(((fntm)object0).c);
        }
    }
}

