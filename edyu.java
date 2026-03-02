public final class edyu implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        if(((gtxg)object0) == null) {
            return false;
        }
        gtxf gtxf0 = gtxf.b(((gtxg)object0).h);
        if(gtxf0 == null) {
            gtxf0 = gtxf.f;
        }
        if(gtxf0.ordinal() != 1 && gtxf0.ordinal() != 2 && gtxf0.ordinal() != 3) {
            return false;
        }
        gtxb gtxb0 = gtxb.b(dual.c(((gtxg)object0).f.toByteArray()).c);
        if(gtxb0 == null) {
            gtxb0 = gtxb.n;
        }
        if(edyv.b.contains(gtxb0)) {
            ((ggtj)((ggtj)edyv.a.j()).ar(0x3108)).H("Excluding mdoc %h with status %s in disallowed list", ((gtxg)object0).b.hashCode(), gtxb0.name());
            return false;
        }
        return true;
    }
}

