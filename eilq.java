import j..util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class eilq implements eift {
    public static eilq a;
    public final Map b;
    final Map c;
    private final eijg d;
    private final Map e;
    private final eigk f;
    private boolean g;

    public eilq(eijg eijg0, Map map0, Map map1, eigk eigk0) {
        this.c = new HashMap();
        this.d = eijg0;
        this.b = new HashMap(map0);
        this.e = new HashMap(map1);
        this.f = eigk0;
    }

    @Override  // eift
    public final void a(gwgu gwgu0) {
        List list0 = this.d.e();
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                gwha gwha0 = (gwha)object0;
                gwgx gwgx0 = (gwgx)this.c.get(gwha0.c);
                eilo eilo0 = (eilo)this.b.get(Integer.valueOf(gwha0.h));
                if(gwgx0 != null && eilo0 != null) {
                    eice.c(gwha0.c);
                    eilo eilo1 = (eilo)Objects.requireNonNull(eilo0);
                    int v = eilo1.f(gwha0, gwgx0);
                    eice.c(gwha0.c);
                    if((gwha0.b & 0x40) != 0 && v == 3) {
                        eilp eilp0 = (eilp)this.e.get(Integer.valueOf(gwha0.h));
                        if(eilp0 != null) {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwhj.a).v_newBuilder();
                            String s = gwha0.c;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gwhj gwhj0 = (gwhj)hftp0.b_message;
                            s.getClass();
                            gwhj0.b |= 2;
                            gwhj0.d = s;
                            if(gwha0.h == 5) {
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwhb.a).v_newBuilder();
                                ByteString hfsf0 = gwgx0.j;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                gwhb gwhb0 = (gwhb)hftp1.b_message;
                                hfsf0.getClass();
                                gwhb0.b = 1;
                                gwhb0.c = hfsf0;
                                gwhb gwhb1 = (gwhb)hftp1.N_build();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gwhj gwhj1 = (gwhj)hftp0.b_message;
                                gwhb1.getClass();
                                gwhj1.c = gwhb1;
                                gwhj1.b |= 1;
                            }
                            eilo1.e(((gwhj)hftp0.N_build()), eilp0);
                        }
                    }
                }
            }
        }
        else if(this.g) {
            this.c.clear();
            eigk eigk0 = this.f;
            if(eigk0 != null) {
                eigk0.g(eigj.f);
            }
            this.g = false;
        }
    }

    @Override  // eift
    public final void b(gwgx gwgx0, gwgx gwgx1, eigg eigg0) {
        this.c.put(gwgx1.c, gwgx1);
    }

    public final void c() {
        if(hrtd.aw() && !this.g) {
            eigk eigk0 = this.f;
            if(eigk0 != null) {
                eigk0.f(this, eigj.f);
            }
            this.g = true;
        }
    }

    @Override  // eift
    public final void d(int v) {
    }
}

