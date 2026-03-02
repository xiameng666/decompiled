import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class bnrh implements BiConsumer {
    public final bnrl a;
    public final fqux[] b;
    public final gsyz c;

    public bnrh(bnrl bnrl0, fqux[] arr_fqux, gsyz gsyz0) {
        this.a = bnrl0;
        this.b = arr_fqux;
        this.c = gsyz0;
    }

    @Override
    public final void accept(Object object0, Object object1) {
        this.b[this.a.d.length + ((int)(((Integer)object1)))] = new fqux(this.c, fqus.a(((fquo)object0)));
    }

    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

