final class dvak implements ibtx {
    final hkas a;

    public dvak(hkas hkas0) {
        this.a = hkas0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TextButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hjzq hjzq0 = this.a.c == null ? hjzq.a : this.a.c;
        hjzl hjzl0 = hjzq0.b == null ? hjzl.a : hjzq0.b;
        switch((hkbm.a(hjzl0.f) == 0 ? 1 : hkbm.a(hjzl0.f)) - 2) {
            case 1: 
            case 2: {
                v1 = 0x7F151EE2;  // string:pay_id_learn_about_id_pass "Learn about ID pass"
                break;
            }
            case 3: {
                v1 = 0x7F151EE1;  // string:pay_id_learn_about_id_cards "Learn about ID cards"
                break;
            }
            default: {
                throw new IllegalStateException("Unknown value prop type");
            }
        }
        gdh.b(isq.c(v1, ((goz)object1)), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((goz)object1), 0, 0, 0x3FFFE);
        return ibom.a;
    }
}

