public final class dtsn implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        String s = null;
        if(!(((qjd)object0) instanceof qjg)) {
            return new ibns(null, null);
        }
        qjd qjd0 = ((qjg)(((qjd)object0))).a(dtss.b);
        qjn qjn0 = (qjd0 instanceof qjn) ? ((qjn)qjd0) : null;
        if(qjn0 != null) {
            s = qjn0.toString();
        }
        return new ibns(s, ((qjg)(((qjd)object0))).a(dtss.c));
    }
}

