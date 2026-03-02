final class desk implements ibtx {
    final ibth a;
    final devp b;
    final fzp c;
    final String d;
    final ibth e;
    final String f;
    final String g;

    public desk(ibth ibth0, devp devp0, fzp fzp0, String s, ibth ibth1, String s1, String s2) {
        this.a = ibth0;
        this.b = devp0;
        this.c = fzp0;
        this.d = s;
        this.e = ibth1;
        this.f = s1;
        this.g = s2;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ibth ibth0 = cmig.a(((cmhw)object0), this.a);
        Object object3 = ibom.a;
        ((goz)object1).M(-1224400529);
        devp devp0 = this.b;
        int v = ((goz)object1).Z(devp0);
        fzp fzp0 = this.c;
        int v1 = v | ((goz)object1).X(fzp0);
        String s = this.d;
        int v2 = v1 | ((goz)object1).X(s);
        ibth ibth1 = this.e;
        int v3 = v2 | ((goz)object1).X(ibth1);
        String s1 = this.f;
        int v4 = v3 | ((goz)object1).X(s1);
        String s2 = this.g;
        int v5 = ((goz)object1).X(s2) | v4 | ((goz)object1).X(ibth0);
        Object object4 = ((goz)object1).k();
        if(v5 != 0 || object4 == gop.a) {
            desj desj0 = new desj(devp0, fzp0, s, ibth1, s1, s2, ibth0, null);
            ((goz)object1).R(desj0);
            object4 = desj0;
        }
        ((goz)object1).A();
        gqe.f(object3, ((ibtw)object4), ((goz)object1));
        return object3;
    }
}

