import android.os.Bundle;

public final class ailv extends ailu {
    private final hhqx k;

    static {
        new baun(new String[]{"GenericApprovalProtoTextProvider"});
    }

    public ailv(hhqx hhqx0) {
        this.k = hhqx0;
        hhpw hhpw0 = hhqx0.g == null ? hhpw.a : hhqx0.g;
        hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
        if((hhqx0.b & 0x100) != 0 && (hhqx0.b & 4) != 0) {
            if(hhpw0.d.size() > 0) {
                hhqn hhqn0 = (hhqn)hhpw0.d.get(0);
                if((hhqn0.b & 0x40000) != 0) {
                    this.a.putString(ailq.b, hhqn0.t);
                }
                if((hhqn0.b & 0x80000) != 0) {
                    this.a.putString(ailq.c, hhqn0.u);
                }
                if((hhqn0.b & 0x100000) != 0) {
                    this.a.putString(ailq.d, hhqn0.v);
                }
                if((hhqn0.b & 0x200000) != 0) {
                    this.a.putString(ailq.ag, hhqn0.w);
                }
                if((hhqn0.b & 0x400000) != 0) {
                    this.a.putString(ailq.ah, hhqn0.x);
                }
                if((hhqn0.b & 0x800000) != 0) {
                    this.a.putString(ailq.ai, hhqn0.y);
                }
            }
            if((hhpw0.b & 2) != 0) {
                this.a.putString(ailp.b, hhpw0.e);
            }
            if((hhpw0.b & 1) != 0) {
                this.a.putString(ailp.c, hhpw0.c);
            }
            if(hhpw0.d.size() > 0 && (((hhqn)hhpw0.d.get(0)).b & 1) != 0) {
                Bundle bundle0 = this.a;
                String s = ((hhqn)hhpw0.d.get(0)).c;
                bundle0.putString(ailp.d, s);
            }
            if((hhqw0.m == null ? hhpv.a : hhqw0.m).c.size() > 0) {
                Bundle bundle1 = this.a;
                String s1 = ailp.ah;
                int v = hhql.a(((hhqm)(hhqw0.m == null ? hhpv.a : hhqw0.m).c.get(0)).d);
                if(v == 0) {
                    v = 1;
                }
                bundle1.putInt(s1, v - 1);
            }
            if(hhpw0.d.size() > 1 && (((hhqn)hhpw0.d.get(1)).b & 1) != 0) {
                Bundle bundle2 = this.a;
                String s2 = ((hhqn)hhpw0.d.get(1)).c;
                bundle2.putString(ailp.ag, s2);
            }
            if((hhqw0.m == null ? hhpv.a : hhqw0.m).c.size() > 1) {
                Bundle bundle3 = this.a;
                String s3 = ailp.ai;
                int v1 = hhql.a(((hhqm)(hhqw0.m == null ? hhpv.a : hhqw0.m).c.get(1)).d);
                if(v1 == 0) {
                    v1 = 1;
                }
                bundle3.putInt(s3, v1 - 1);
            }
            if(ailv.b(hhqw0, 0, 3) && hhpw0.d.size() > 0) {
                hhqn hhqn1 = (hhqn)hhpw0.d.get(0);
                if((hhqn1.b & 0x20000) != 0) {
                    this.a.putString(aill.b, hhqn1.s);
                }
                if((hhqn1.b & 0x40) != 0) {
                    this.a.putString(aill.c, hhqn1.i);
                }
                if((hhqn1.b & 16) != 0) {
                    this.a.putString(aill.d, hhqn1.g);
                }
                if((hhqn1.b & 0x20) != 0) {
                    this.a.putString(aill.ag, hhqn1.h);
                }
            }
            if(ailv.b(hhqw0, 0, 2) && hhpw0.d.size() > 0) {
                hhqn hhqn2 = (hhqn)hhpw0.d.get(0);
                if((hhqn2.b & 8) != 0) {
                    this.a.putString(ailk.b, hhqn2.f);
                }
                if((hhqn2.b & 0x100) != 0) {
                    this.a.putString(ailk.c, hhqn2.k);
                }
                if((hhqn2.b & 0x20) != 0) {
                    this.a.putString(ailk.ah, hhqn2.h);
                }
            }
            if(ailv.b(hhqw0, 1, 1) && hhpw0.d.size() > 1) {
                hhqn hhqn3 = (hhqn)hhpw0.d.get(1);
                if((hhqn3.b & 4) != 0) {
                    this.a.putString(ailj.b, hhqn3.e);
                }
                if((2 & hhqn3.b) != 0) {
                    this.a.putString(ailj.c, hhqn3.d);
                }
                if((hhqn3.b & 0x4000) != 0) {
                    this.a.putString(ailj.ag, hhqn3.p);
                }
                if((hhqn3.b & 0x8000) != 0) {
                    this.a.putString(ailj.d, hhqn3.q);
                }
                if((hhqn3.b & 0x1000000) != 0) {
                    this.a.putString(ailx.i, hhqn3.z);
                }
            }
            if(hhpw0.d.size() > 0) {
                hhqn hhqn4 = (hhqn)hhpw0.d.get(0);
                if((hhqn4.b & 0x400) != 0) {
                    this.a.putString(ailx.c, hhqn4.m);
                }
                if((hhqn4.b & 0x200) != 0) {
                    this.a.putString(ailx.d, hhqn4.l);
                }
                if((hhqn4.b & 0x800) != 0) {
                    this.a.putString(ailx.e, hhqn4.n);
                }
                if((hhqn4.b & 0x1000) != 0) {
                    this.a.putString(ailx.f, hhqn4.o);
                }
                if((0x1000000 & hhqn4.b) != 0) {
                    this.a.putString(ailx.j, hhqn4.z);
                }
            }
            if(hhpw0.d.size() > 0) {
                hhqn hhqn5 = (hhqn)hhpw0.d.get(0);
                if((hhqn5.b & 0x10000) != 0) {
                    this.a.putString(ailx.g, hhqn5.r);
                }
                if((hhqn5.b & 0x80) != 0) {
                    this.a.putString(ailx.h, hhqn5.j);
                }
            }
        }
    }

    private static boolean b(hhqw hhqw0, int v, int v1) {
        if((hhqw0.c & 0x400) != 0 && (hhqw0.m == null ? hhpv.a : hhqw0.m).c.size() > v) {
            int v2 = hhqp.a(((hhqm)(hhqw0.m == null ? hhpv.a : hhqw0.m).c.get(v)).c);
            if(v2 == 0) {
                v2 = 1;
            }
            return v2 == v1;
        }
        return false;
    }
}

