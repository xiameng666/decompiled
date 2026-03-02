import android.graphics.Typeface;
import android.text.Spannable;

public final class jjc implements ibtx {
    public final Spannable a;
    public final ibty b;

    public jjc(Spannable spannable0, ibty ibty0) {
        this.a = spannable0;
        this.b = ibty0;
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = (int)(((Integer)object1));
        int v1 = (int)(((Integer)object2));
        jdz jdz0 = ((jat)object0).f;
        jeu jeu0 = ((jat)object0).c;
        if(jeu0 == null) {
            jeu0 = jeu.h;
        }
        jem jem0 = ((jat)object0).d;
        jem jem1 = new jem((jem0 == null ? 0 : jem0.a));
        jen jen0 = ((jat)object0).e;
        jen jen1 = new jen((jen0 == null ? 0xFFFF : jen0.a));
        jdd jdd0 = new jdd(((Typeface)this.b.a(jdz0, jeu0, jem1, jen1)));
        this.a.setSpan(jdd0, v, v1, 33);
        return ibom.a;
    }
}

