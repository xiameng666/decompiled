import java.util.Map;

final class ctvo implements icih {
    final ctvs a;
    final icck b;

    public ctvo(ctvs ctvs0, icck icck0) {
        this.a = ctvs0;
        this.b = icck0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(!(((ctpc)object0) instanceof ctpa) && !(((ctpc)object0) instanceof ctpb)) {
            if((((ctpc)object0) instanceof ctoy)) {
                ykf ykf0 = ((ctoy)(((ctpc)object0))).a;
                ctvs ctvs0 = this.a;
                Map map0 = ctvs0.d;
                iced iced0 = (iced)map0.get(ykf0);
                if(iced0 != null) {
                    iceb.a(iced0);
                }
                ctvn ctvn0 = new ctvn(ctvs0, ykf0, null);
                map0.put(ykf0, icbb.b(this.b, null, null, ctvn0, 3));
                return ibom.a;
            }
            if(!(((ctpc)object0) instanceof ctoz)) {
                throw new ibnq();
            }
            ctoz ctoz0 = (ctoz)(((ctpc)object0));
            return ibom.a;
        }
        return ibom.a;
    }
}

