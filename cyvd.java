public final class cyvd implements gfsi {
    public final String a;

    public cyvd(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfuo hfuo0 = ((cyxn)object0).c;
        int v = hfuo0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            Object object1 = (cywx)hfuo0.get(v);
            if(this.a.equals(object1.c)) {
                return object1;
            }
        }
        return cywx.a;
    }
}

