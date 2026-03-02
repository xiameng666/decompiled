import java.util.List;

public final class bfyt implements lqj {
    public final bfzg a;
    public final bgnu b;
    public final bgnq c;

    public bfyt(bfzg bfzg0, bgnu bgnu0, bgnq bgnq0) {
        this.a = bfzg0;
        this.b = bgnu0;
        this.c = bgnq0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Object object1 = ((bedv)object0).b;
        if(object1 != null) {
            int v = ((gged_interceptors)object1).size();
            String s = this.a.getResources().getQuantityString(0x7F130058, v, new Object[]{v});  // plurals:pwm_found_passwords
            ibuq.f(s, "headerText");
            List list0 = ibpo.b(new bgnr(s));
            this.b.a.a(list0);
            this.c.f(v == 0);
        }
    }
}

