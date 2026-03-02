public final class dgbo implements ibty {
    public final dgcp a;

    public dgbo(dgcp dgcp0) {
        this.a = dgcp0;
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        String s = (String)object0;
        dggc dggc0 = (dggc)object1;
        ibuq.f(s, "endpointId");
        ibuq.f(dggc0, "shareContent");
        dgsr dgsr0 = new dgsr(this.a.a, this.a.g, s);
        int v = this.a.b.a();
        return new dgvi(dggc0, ((dggg)object2), dgsr0, this.a.k, ((dgij)object3), this.a.j, v, this.a.a);
    }
}

