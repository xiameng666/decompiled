import com.google.android.libraries.messaging.lighter.model..AutoValue_AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class fljn implements gfsi {
    public final fljw a;

    public fljn(fljw fljw0) {
        this.a = fljw0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0 = ((flkv)object0).b;
        if(gfsx0.i()) {
            gfsx gfsx1 = ((flkv)object0).c;
            if(gfsx1.i()) {
                fljw fljw0 = this.a;
                int v = ((flkv)object0).a;
                if(v == 0) {
                    Object object1 = gfsx0.d();
                    fljw0.g(((AccountContext)object1), ((fmbl)gfsx1.d()));
                    for(Object object2: fljw0.b) {
                        fier fier0 = (fier)object2;
                    }
                    fmai fmai0 = fmaj.a();
                    fmai0.g(1);
                    fmai0.n(((.AutoValue_AccountContext)object1).b.f());
                    fmai0.o(((.AutoValue_AccountContext)object1).c.toStringUtf8());
                    fmaj fmaj0 = fmai0.a();
                    fljw0.a.b(fmaj0);
                    return null;
                }
                if(v == 2) {
                    fljw0.g(((AccountContext)gfsx0.d()), ((fmbl)gfsx1.d()));
                }
            }
        }
        return null;
    }
}

