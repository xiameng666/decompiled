import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class hmbk extends hmbi {
    private hmgc h;
    private hmft i;
    private hmdi j;
    private hmdj k;
    private hmhs l;
    private hmgz m;

    static {
        hmbd.b(((byte)42), hmbk.class);
    }

    public hmbk() {
        this.e((byte)0x80);
        this.g((byte)0x8E);
        this.h((byte)0x80);
        this.j();
        this.i(hmgh.c);
    }

    @Override  // hmbi
    protected final hmbe c(byte[] arr_b) {
        return new hmbj(arr_b);
    }

    @Override  // hmbi
    protected final hmbg d() {
        hmhr hmhr0;
        hmbg hmbg0;
        byte[] arr_b9;
        byte[] arr_b8;
        hmgz hmgz9;
        hmgz hmgz8;
        hmgz hmgz7;
        hmgz hmgz6;
        hmhs hmhs0;
        hmhs hmhs2;
        hmhs hmhs1;
        hmgc hmgc0 = (hmgc)this.f.a;
        this.h = hmgc0;
        this.i = (hmft)hmgc0.i;
        hmcs hmcs0 = hmgc0.p;
        hmhj hmhj0 = hmgc0.m;
        hmbz hmbz0 = hmgc0.g;
        this.m = new hmgz(0);
        this.j = this.h.e;
        this.k = this.h.f;
        this.h.o = true;
        this.h.c();
        byte[] arr_b = ((hmbj)this.e).h();
        hmbb hmbb0 = this.g;
        hmgz.e(arr_b);
        hmbb0.e();
        List list0 = hmcs0.b.i;
        hmbb hmbb1 = this.g;
        hmhf.a(list0);
        hmbb1.e();
        if(list0 != null) {
            if(hmgw.b(list0) == ((long)arr_b.length)) {
                try {
                    hmdi hmdi0 = this.j;
                    int v = 0;
                    Iterator iterator0 = list0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_40;
                        }
                        Object object0 = iterator0.next();
                        int v1 = ((hmht)object0).b + v;
                        byte[] arr_b1 = Arrays.copyOfRange(arr_b, v, v1);
                        hmdk hmdk0 = new hmdk(hmgz.e(((hmht)object0).a), hmgz.e(arr_b1));
                        hmbb hmbb2 = this.g;
                        hmdk0.a.i();
                        hmbb2.e();
                        hmdi0.m(hmdk0);
                        v = v1;
                    }
                }
                catch(hmdl | hmdm | hmdn | RuntimeException exception0) {
                    this.g.b(exception0, "Cannot properly parse/match requested CUDOLs with received values", new Object[0]);
                    throw new hmfm(hmfl.ab);
                }
            }
            this.g.a("Requested UDOLs length does not match the length of data in C-APDU", new Object[0]);
            throw new hmfm(hmfl.R);
        }
    label_40:
        this.k.d();
        if(hmcs0.a.f) {
            this.g.e();
            List list1 = hmbz0.a(this.h);
            hmca hmca0 = new hmca(hmbk.k(list1), list1);
            this.g.e();
            int v2 = hmhj0.k(hmca0, this.i.f(), this.i.e());
            if(v2 != 2) {
                hmgc.b();
            }
            hmhi hmhi0 = this.h.q;
            hmct hmct0 = this.h.p.b;
            int v3 = this.i.g(v2, hmca0, hmct0.p, hmct0.o, 1);
            int v4 = hmft.h(v3, hmct0.o);
            try {
                if(this.j.f().d()) {
                    this.k.f(v3, v2, hmca0);
                }
                else {
                    this.k.e();
                }
            }
            catch(hmdp unused_ex) {
                this.k.e();
            }
            switch(v2 - 1) {
                case 0: {
                    try {
                        hmhs1 = hmhi0.g(2, 1);
                        this.l = hmhs1;
                    }
                    catch(hmhx hmhx1) {
                        this.g.b(hmhx1, "Credentials not available to proceed with transaction", new Object[0]);
                        throw new hmfm(hmfl.aq);
                    }
                    this.m(hmhs1);
                    hmbg0 = this.l();
                    hmhr0 = hmhr.d;
                    break;
                }
                case 1: {
                    try {
                        hmhs2 = hmhi0.g(2, 1);
                        this.l = hmhs2;
                    }
                    catch(hmhx hmhx2) {
                        this.g.b(hmhx2, "Credentials not available to proceed with transaction", new Object[0]);
                        throw new hmfm(hmfl.aq);
                    }
                    this.m(hmhs2);
                    hmbg0 = this.l();
                    hmhr0 = hmhr.e;
                    try {
                        hmgc.d(new hmgs(this.j.b(), this.j.j(), this.i.a));
                        break;
                    }
                    catch(hmdp unused_ex) {
                        throw new hmfm(hmfl.ae);
                    }
                }
                default: {
                    try {
                        hmhs0 = hmhi0.g(1, 1);
                        this.l = hmhs0;
                    }
                    catch(hmhx hmhx0) {
                        this.g.b(hmhx0, "Credentials not available to proceed with transaction", new Object[0]);
                        throw new hmfm(hmfl.aq);
                    }
                    this.m(hmhs0);
                    this.h.h.a();
                    try {
                        this.k.b.c();
                        hmfg hmfg0 = this.k.d;
                        hmff hmff0 = this.j.l();
                        hmgz hmgz0 = new hmgz(8);
                        hmgz hmgz1 = this.h.p.b.g;
                        hmgz0.n(0, hmgz1.a);
                        hmgz0.n(hmgz1.b(), hmff0.b.a);
                        byte[] arr_b2 = hmfg0.b().a;
                        hmgz0.n(hmgz1.b() + hmff0.b.a.length, arr_b2);
                        byte[] arr_b3 = this.h.q.i(hmgz0.a, 3);
                        byte[] arr_b4 = this.h.q.i(hmgz0.a, v4);
                        if(arr_b3 == null || arr_b4 == null) {
                            throw new hmfm(hmfl.as, "Error during CVC3 computation");
                        }
                        hmfg hmfg1 = this.k.d;
                        int v5 = (int)(hmgw.c(new byte[]{arr_b3[0], arr_b3[1]}) % 1000L);
                        int v6 = (int)(hmgw.c(new byte[]{arr_b4[6], arr_b4[7]}) % 1000L);
                        hmgz hmgz2 = hmfg1.b();
                        int v7 = (int)(hmgw.c(new byte[]{hmgz2.a(0), hmgz2.a(1)}) % 100L);
                        byte[] arr_b5 = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(v5 + v7 / 10 * 1000).array();
                        byte[] arr_b6 = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(v6 + v7 % 10 * 1000).array();
                        byte[] arr_b7 = {arr_b6[2], arr_b6[3], arr_b5[2], arr_b5[3], 0, 0, 0, 0};
                        hmhg.b(arr_b5);
                        hmhg.b(arr_b6);
                        hmhg.b(arr_b4);
                        hmhg.b(arr_b3);
                        hmgz hmgz3 = hmgz.e(Arrays.copyOfRange(arr_b7, 0, 2));
                        hmgz hmgz4 = hmgz.e(Arrays.copyOfRange(arr_b7, 2, 4));
                        hmfz hmfz0 = this.h.r;
                        hmcs hmcs1 = this.h.p;
                        hmhi hmhi1 = this.h.q;
                        hmgz hmgz5 = this.j.l().b;
                        boolean z = this.i.e().b == 1 && v3 == 3;
                        hmct hmct1 = hmcs1.b;
                        hmcy hmcy0 = hmct1.e;
                        hmcy hmcy1 = hmct1.d;
                        try {
                            LinkedHashMap linkedHashMap0 = hmct1.a(1, 1).c;
                            hmgz6 = ((hmdk)linkedHashMap0.get(new hmgz("56"))).c;
                            hmgz7 = ((hmdk)linkedHashMap0.get(new hmgz("9F6B"))).c;
                        }
                        catch(hmfm unused_ex) {
                            hmgz8 = hmgz4;
                            hmfz0.b.a("Error in reading profile track data during transaction id generation.", new Object[0]);
                            hmgz9 = new hmgz(0);
                            goto label_132;
                        }
                        try {
                            hmbb hmbb3 = hmhe.a();
                            hmgz hmgz10 = hmgz.d(hmgz.e(hmgz6.j().substring(0, hmgz6.j().lastIndexOf(94) + 8).getBytes()));
                            hmgz10.v(hmgo.a(hmcy1, hmgz.e(hmgz6.j().substring(hmgz6.j().lastIndexOf(94) + 8).getBytes()), hmbb3, hmgz3, hmgz4, hmgz5, z));
                            arr_b8 = hmgz.e(hmgz10.j().getBytes()).a;
                            int v8 = hmgz7.i().indexOf(68) + 8;
                            hmgz hmgz11 = hmgz.e(hmgz7.i().substring(v8).replaceAll("F", "").getBytes());
                            int v9 = hmgz7.i().indexOf(68) + 8;
                            hmgz hmgz12 = hmgz.d(hmgz.e(hmgz7.i().substring(0, v9).getBytes()));
                            hmgz8 = hmgz4;
                            hmgz12.v(hmgo.a(hmcy0, hmgz11, hmbb3, hmgz3, hmgz4, hmgz5, z));
                            arr_b9 = ((hmgz12.b() & 1) == 0 ? new hmgz(hmgz12.j()) : new hmgz(hmgz12.j() + "F")).a;
                        }
                        catch(RuntimeException unused_ex) {
                            hmfz0.b.a("Error in calculating track construction data during transaction id generation.", new Object[0]);
                            hmgz9 = new hmgz(0);
                            goto label_132;
                        }
                        byte[] arr_b10 = hmhi1.f(arr_b8);
                        byte[] arr_b11 = hmhi1.f(arr_b9);
                        byte[] arr_b12 = new byte[0x20];
                        System.arraycopy(arr_b10, arr_b10.length - 16, arr_b12, 0, 16);
                        System.arraycopy(arr_b11, arr_b11.length - 16, arr_b12, 16, 16);
                        hmgz9 = hmgz.e(arr_b12);
                    label_132:
                        this.m = hmgz9;
                        hmbg0 = new hmbu();
                        hmfk hmfk0 = this.k.c;
                        hmbg0.a = hmgz3;
                        hmbg0.b = hmgz3;
                        hmbg0.c = hmgz8;
                        hmbg0.d = hmfk0;
                        hmhr0 = hmhr.a;
                    }
                    catch(hmdl | hmdn | hmdm unused_ex) {
                        throw new hmfm(hmfl.as);
                    }
                    catch(hmdp unused_ex) {
                        throw new hmfm(hmfl.ae);
                    }
                }
            }
            this.i.e();
            this.i.f();
            hmgp hmgp0 = new hmgp(new hmhr[]{hmhr0}, this.m);
            this.g.e();
            this.h.t.b(hmgp0);
            return hmbg0;
        }
        this.g.a("The Magstripe data not found in profile", new Object[0]);
        throw new hmfm(hmfl.P);
    }

    private final hmbg l() {
        try {
            if(!this.j.f().d()) {
                throw new hmfm(hmfl.ar);
            }
            hmbg hmbg0 = new hmbu();
            hmfk hmfk0 = this.k.c;
            hmbg0.c = this.k.d.b();
            hmbg0.d = hmfk0;
            return hmbg0;
        }
        catch(hmdp unused_ex) {
            throw new hmfm(hmfl.ar);
        }
    }

    private final void m(hmhs hmhs0) {
        try {
            hmdj hmdj0 = this.k;
            hmdj0.d = new hmfg(hmhs0.a());
            this.g.e();
        }
        catch(hmdl hmdl0) {
            this.g.b(hmdl0, "Error while parsing ATC", new Object[0]);
            throw new hmfm(hmfl.as);
        }
    }
}

