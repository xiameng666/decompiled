public final class cyuz implements gfsi {
    public final String a;
    public final String b;

    public cyuz(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfuo hfuo0 = ((cyxn)object0).b;
        int v = hfuo0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            Object object1 = (cyxl)hfuo0.get(v);
            if(this.a.equals(object1.d) && this.b.equals((object1.e == null ? cyxd.a : object1.e).c)) {
                return object1;
            }
        }
        return cyxl.a;
    }
}

