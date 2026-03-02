import java.util.function.Supplier;

public final class bgrf implements bgrl {
    private final Supplier a;

    public bgrf(Supplier supplier0) {
        this.a = supplier0;
    }

    @Override  // bgrl
    public final void a(hguc hguc0, ProtoLiteBuilder hftp0) {
        String s;
        if(!(hguc0.l == null ? hguf.a : hguc0.l).c) {
            s = "crisis_alerts_3_1";
        }
        else if(!(hguc0.l == null ? hguf.a : hguc0.l).b) {
            s = "crisis_alerts_2_1";
        }
        else {
            s = "crisis_alerts_1_1";
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgug)hftp0.b_message).k = s;
        bgpq bgpq0 = (bgpq)this.a.get();
        switch(s.hashCode()) {
            case 0xF3318AF7: {
                if(s.equals("crisis_alerts_1_1")) {
                    if(bgpq0.b == 3 || bgpq0.c == 3 || bgpq0.f == 3) {
                        throw new bgrk(18);
                    }
                    return;
                }
                break;
            }
            case -214856008: {
                if(s.equals("crisis_alerts_2_1")) {
                    if(bgpq0.b == 3 || bgpq0.c == 3 || bgpq0.e == 3) {
                        throw new bgrk(18);
                    }
                    return;
                }
                break;
            }
            case -214855047: {
                if(s.equals("crisis_alerts_3_1")) {
                    if(bgpq0.b != 3 && bgpq0.c != 3 && bgpq0.d != 3) {
                        return;
                    }
                    throw new bgrk(18);
                }
                break;
            }
        }
    }
}

