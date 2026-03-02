import android.graphics.drawable.Drawable;
import java.util.List;

public final class byhk implements ibtw {
    public final bydr a;
    public final Drawable b;
    public final String c;
    public final List d;
    public final bzbb e;

    public byhk(bydr bydr0, Drawable drawable0, String s, List list0, bzbb bzbb0) {
        this.a = bydr0;
        this.b = drawable0;
        this.c = s;
        this.d = list0;
        this.e = bzbb0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((String)object0), "k");
        List list0 = this.d;
        bzbb bzbb0 = this.e;
        if(((bzbe)object1) == null) {
            List list1 = byhs.b(list0);
            return new bzbe(this.a.a, this.b, this.c, list1, bzbb0);
        }
        List list2 = byhs.b(ibpo.ak(((bzbe)object1).d, list0));
        bzbb bzbb1 = ((bzbe)object1).e;
        ibuq.f(((bzbe)object1).a, "id");
        ibuq.f(((bzbe)object1).b, "icon");
        ibuq.f(((bzbe)object1).c, "displayName");
        return new bzbe(((bzbe)object1).a, ((bzbe)object1).b, ((bzbe)object1).c, list2, (bzbb1 == null ? bzbb0 : bzbb1));
    }
}

