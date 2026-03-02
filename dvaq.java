final class dvaq extends lp {
    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        gtxo gtxo0 = ((ftjg)object0).c;
        if(gtxo0 == null) {
            gtxo0 = gtxo.a;
        }
        long v = (gtxo0.f == null ? hfwn.a : gtxo0.f).b;
        gtxo gtxo1 = ((ftjg)object1).c;
        gtxo gtxo2 = gtxo1 == null ? gtxo.a : gtxo1;
        if(v == (gtxo2.f == null ? hfwn.a : gtxo2.f).b) {
            gtxo gtxo3 = ((ftjg)object0).c;
            if(gtxo3 == null) {
                gtxo3 = gtxo.a;
            }
            gtxn gtxn0 = gtxn.a(gtxo3.c);
            if(gtxo1 == null) {
                gtxo1 = gtxo.a;
            }
            return gtxn0.equals(gtxn.a(gtxo1.c));
        }
        return false;
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        return ((ftjg)object0).d == ((ftjg)object1).d;
    }
}

