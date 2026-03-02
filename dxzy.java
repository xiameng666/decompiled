public final class dxzy implements gfsi {
    public final String a;
    public final kar b;

    public dxzy(String s, kar kar0) {
        this.a = s;
        this.b = kar0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((dxec)object0) != null) {
            String s = this.a;
            s.getClass();
            if(((dxec)object0).b.containsKey(s)) {
                dxea dxea0 = dxea.a;
                s.getClass();
                dxea dxea1 = (dxea)((dxec)object0).b.get(s);
                if(dxea1 != null) {
                    dxea0 = dxea1;
                }
                this.b.accept(dxea0);
            }
        }
        return (dxec)object0;
    }
}

