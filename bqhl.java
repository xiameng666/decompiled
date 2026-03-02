public final class bqhl implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        hldk hldk0 = ((hldp)object0).i;
        if(hldk0 == null) {
            hldk0 = hldk.a;
        }
        boolean z = true;
        if(!bqvy.c(hldk0.c) || !"session_activity_segment".equals(((hldp)object0).e)) {
            String s = ((hldp)object0).e;
            hldk hldk1 = ((hldp)object0).i;
            if(hldk1 == null) {
                hldk1 = hldk.a;
            }
            if(!bqvy.a(hldk1.c) || !s.startsWith("__VIRTUAL__")) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

