import androidx.compose.foundation.CombinedClickableElement;

public final class crt implements ibtx {
    final ctj a;
    final boolean b;
    final ibth c;

    public crt(ctj ctj0, boolean z, ibth ibth0) {
        this.a = ctj0;
        this.b = z;
        this.c = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        hfc hfc0 = (hfc)object0;
        ((Number)object2).intValue();
        ((goz)object1).M(0xA50F4C47);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new dgh();
            ((goz)object1).R(object3);
        }
        Object object4 = ctm.a(hfc.e, ((dgg)object3), this.a).a(new CombinedClickableElement(((dgg)object3), null, this.b, this.c));
        ((goz)object1).A();
        return object4;
    }
}

