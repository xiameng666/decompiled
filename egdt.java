public final class egdt implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Long long0;
        try(owg owg0 = ((oxi)object0).a("SELECT id FROM cpg_calling_cards WHERE deleted = 0 AND calling_card_type = ? AND sync2 != sync3")) {
            owg0.f(1, 1L);
            ggdy ggdy0 = new ggdy();
            while(true) {
                if(!owg0.k()) {
                    break;
                }
                long0 = owg0.j(0) ? null : owg0.b(0);
                ggdy0.i(long0);
            }
            return ggdy0.h();
        }
    }
}

