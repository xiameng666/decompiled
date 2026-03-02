final class dejl implements ibtx {
    final fyx a;
    final ibth b;

    public dejl(fyx fyx0, ibth ibth0) {
        this.a = fyx0;
        this.b = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        Object object3 = ((goz)object1).k();
        Object object4 = gop.a;
        if(object3 == object4) {
            object3 = gqe.a(ibru.a, ((goz)object1));
            ((goz)object1).R(object3);
        }
        ((goz)object1).M(0x97EA02AA);
        int v = ((goz)object1).Z(((icck)object3));
        fyx fyx0 = this.a;
        int v1 = v | ((goz)object1).X(fyx0);
        ibth ibth0 = this.b;
        int v2 = v1 | ((goz)object1).X(ibth0);
        Object object5 = ((goz)object1).k();
        if(v2 != 0 || object5 == object4) {
            object5 = new dejj(((icck)object3), fyx0, ibth0);
            ((goz)object1).R(object5);
        }
        ((goz)object1).A();
        fiqv.a(cmig.a(((cmhw)object0), ((ibth)object5)), null, false, null, null, null, null, null, deew.b, ((goz)object1), 0x30000000, 510);
        return ibom.a;
    }
}

