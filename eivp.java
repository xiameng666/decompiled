import java.util.HashMap;

public final class eivp implements gfsi {
    public final HashMap a;

    public eivp(HashMap hashMap0) {
        this.a = hashMap0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggeo ggeo0 = (ggeo)object0;
        ggek ggek0 = ggeo.i(ggeo0.size() + this.a.size());
        ggek0.m(ggeo0);
        ggek0.m(this.a);
        return ggek0.g();
    }
}

