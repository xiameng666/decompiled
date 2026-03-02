import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class ehmg {
    public final cjmm a;
    public final List b;
    private final Context c;

    public ehmg(Context context0) {
        cjmm cjmm0 = new cjmm(context0, ehlb.a.g());
        ibuq.f(context0, "context");
        super();
        this.a = cjmm0;
        this.c = context0.getApplicationContext();
        Object object0 = new ehmd(this).a();
        ArrayList arrayList0 = new ArrayList(ibpo.q(((Iterable)object0), 10));
        for(Object object1: ((Iterable)object0)) {
            ibuq.e(this.c, "applicationContext");
            String s = this.c.getString(((ehla)object1).b);
            ibuq.e(s, "getString(...)");
            String s1 = this.c.getString(((ehla)object1).c);
            ibuq.e(s1, "getString(...)");
            String s2 = this.c.getString(((ehla)object1).e);
            ibuq.e(s2, "getString(...)");
            String s3 = this.c.getString(((ehla)object1).f);
            ibuq.e(s3, "getString(...)");
            arrayList0.add(new ehlx(((ehla)object1).a, s, s1, ((ehla)object1).d, s2, s3));
        }
        this.b = ibpo.ar(arrayList0);
    }
}

