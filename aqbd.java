import android.service.autofill.Field;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class aqbd implements Consumer {
    public final amli a;
    public final amlp b;

    public aqbd(amli amli0, amlp amlp0) {
        this.a = amli0;
        this.b = amlp0;
    }

    @Override
    public final void accept(Object object0) {
        gfsx gfsx0 = aneb.a(((ando)object0));
        if(gfsx0.i()) {
            String s = (String)gfsx0.d();
            Field field0 = this.b.a();
            this.a.a.setField(s, field0);
            this.a.d.put(s, this.b);
            this.a.c = true;
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

