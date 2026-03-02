import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class hmbm extends hmbi {
    private hmgc h;
    private hmft i;
    private hmct j;
    private hmdi k;
    private hmdj l;
    private hmhs m;
    private hmgz n;

    static {
        hmbd.b(((byte)-82), hmbm.class);
    }

    public hmbm() {
        this.e((byte)0x80);
        this.h(0);
        this.f(45, -1);
        this.j();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v <= 0xFF; v = (short)(v + 1)) {
            if((v & 0xFFFFFFC0) == 0 || (v & 0xFFFFFFC0) == 0x80) {
                arrayList0.add(Byte.valueOf(((byte)v)));
            }
        }
        this.a = arrayList0;
        this.i(hmgh.c);
    }

    @Override  // hmbi
    protected final hmbe c(byte[] arr_b) {
        return new hmbl(arr_b);
    }

    @Override  // hmbi
    protected final hmbg d() {
        hmbg hmbg0;
        hmhs hmhs0;
        hmhs hmhs2;
        hmhs hmhs1;
        hmcr hmcr0;
        hmct hmct0;
        int v = ((hmbl)this.e).d() & 0xFFFFFFC0;
        this.g.e();
        hmgc hmgc0 = (hmgc)this.f.a;
        this.h = hmgc0;
        this.i = (hmft)hmgc0.i;
        hmcs hmcs0 = hmgc0.p;
        this.j = hmcs0.b;
        hmhj hmhj0 = hmgc0.m;
        hmbz hmbz0 = hmgc0.g;
        this.k = hmgc0.e;
        this.l = hmgc0.f;
        byte[] arr_b = ((hmbl)this.e).h();
        hmbb hmbb0 = this.g;
        hmgz.e(arr_b);
        hmbb0.e();
        List list0 = this.j.h;
        hmbb hmbb1 = this.g;
        hmhf.a(list0);
        hmbb1.e();
        if(list0 != null) {
            if(hmgw.b(list0) == ((long)arr_b.length)) {
                try {
                    hmdi hmdi0 = this.k;
                    int v1 = 0;
                    Iterator iterator0 = list0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_38;
                        }
                        Object object0 = iterator0.next();
                        int v2 = ((hmht)object0).b + v1;
                        byte[] arr_b1 = Arrays.copyOfRange(arr_b, v1, v2);
                        hmdk hmdk0 = new hmdk(hmgz.e(((hmht)object0).a), hmgz.e(arr_b1));
                        this.g.e();
                        hmdi0.m(hmdk0);
                        v1 = v2;
                    }
                }
                catch(hmdl | hmdm | hmdn | RuntimeException exception0) {
                    this.g.b(exception0, "Cannot properly parse/match requested CDOLs with received values", new Object[0]);
                    throw new hmfm(hmfl.ab);
                }
            }
            this.g.a("Requested CDOLs length does not match the length of data in C-APDU", new Object[0]);
            throw new hmfm(hmfl.R);
        }
    label_38:
        hmgc hmgc1 = this.h;
        hmgc1.b = hmgz.e(arr_b);
        int v3 = ((hmbl)this.e).d() & 0xFFFFFFC0;
        if(v3 == 0) {
            ((hmgc)this.f.a).d = 2;
        }
        else if(v3 == 0xFFFFFF80 || v3 == 0x40) {
            ((hmgc)this.f.a).c();
        }
        if(this.i.a) {
            this.g.e();
            hmct0 = this.j;
            hmcr0 = hmct0.c;
        }
        else {
            hmct0 = this.j;
            hmcr0 = hmct0.b;
        }
        this.l.c(hmct0.m);
        this.l.d();
        boolean z = this.i.a;
        if((z ? hmcs0.a.b : hmcs0.a.a)) {
            if(this.j.f == arr_b.length && arr_b.length >= 45) {
                this.g.e();
                List list1 = hmbz0.a(this.h);
                hmca hmca0 = new hmca(hmbm.k(list1), list1);
                this.g.e();
                int v4 = hmhj0.k(hmca0, this.i.f(), this.i.e());
                this.g.e();
                if(v4 == 3 && (v == 0xFFFFFF80 || v == 0x40)) {
                    this.l.b.c();
                }
                else {
                    hmfi hmfi0 = this.l.b;
                    hmfi0.b = (byte)0;
                    hmfi0.c.e();
                }
                hmgz hmgz0 = hmcr0.d;
                if(v4 != 2) {
                    hmgc.b();
                }
                int v5 = this.h.i.g(v4, hmca0, this.j.p, this.j.o, 1);
                List list2 = hmca0.a;
                boolean z1 = list2.contains(hmhq.g);
                if(this.l.b.b().a(0) == 0xFFFFFF80) {
                    this.l.a.c();
                }
                else {
                    hmfh hmfh0 = this.l.a;
                    hmfh0.f(0, 7, true);
                    hmbb hmbb2 = hmfh0.c;
                    ((hmgz)hmfh0.b).h();
                    hmbb2.e();
                }
                if(v4 == 3 && (((hmbl)this.e).d() & 16) == 16) {
                    hmfh hmfh1 = this.l.a;
                    hmfh1.f(1, 6, true);
                    hmbb hmbb3 = hmfh1.c;
                    ((hmgz)hmfh1.b).h();
                    hmbb3.e();
                }
                boolean z2 = this.i.a() != 2;
                this.g.e();
                this.l.a.e(z2);
                if(z1) {
                    hmfh hmfh2 = this.l.a;
                    hmfh2.f(5, 3, true);
                    hmbb hmbb4 = hmfh2.c;
                    ((hmgz)hmfh2.b).h();
                    hmbb4.e();
                }
                this.g.e();
                this.g.e();
                this.g.e();
                hmfh hmfh3 = this.l.a;
                hmbb hmbb5 = hmfh3.c;
                ((hmgz)hmfh3.b).h();
                hmbb5.e();
                hmfh3.f(1, 7, z1 && hmca0.b == 2 && v4 == 3);
                ((hmgz)hmfh3.b).h();
                hmbb5.e();
                if(v5 != 6) {
                    try {
                        if((list2.contains(hmhq.f) || list2.contains(hmhq.d) || list2.contains(hmhq.b)) && this.k.c().c()) {
                            hmfh hmfh4 = this.l.a;
                            hmfh4.f(3, 0, true);
                            hmbb hmbb6 = hmfh4.c;
                            ((hmgz)hmfh4.b).h();
                            hmbb6.e();
                        }
                    }
                    catch(hmdp hmdp0) {
                        this.g.b(hmdp0, "Mobile Support Indicator not provided in C-APDU", new Object[0]);
                    }
                }
                hmfh hmfh5 = this.l.a;
                if(v5 - 1 == 4) {
                    hmfh5.f(3, 3, true);
                    hmbb hmbb7 = hmfh5.c;
                    ((hmgz)hmfh5.b).h();
                    hmbb7.e();
                }
                hmfh5.i(v5);
                if(this.l.b.b().a(0) == 0) {
                    this.l.f(v5, v4, hmca0);
                }
                else {
                    this.l.e();
                }
                ArrayList arrayList0 = new ArrayList();
                hmfh hmfh6 = this.h.f.a;
                if(this.l.b.b().a(0) == 0xFFFFFF80) {
                    arrayList0.add(hmhr.a);
                }
                else {
                    if(v == 0) {
                        arrayList0.add((hmfh6.h() ? hmhr.b : hmhr.c));
                    }
                    if(v4 == 1) {
                        arrayList0.add(hmhr.d);
                    }
                    else {
                        arrayList0.add(hmhr.e);
                    }
                }
                hmhi hmhi0 = this.h.q;
                switch(v4 - 1) {
                    case 0: {
                        try {
                            hmhs1 = hmhi0.g(2, 1);
                            this.m = hmhs1;
                        }
                        catch(hmhx hmhx1) {
                            this.g.b(hmhx1, "Credentials not available to proceed with transaction", new Object[0]);
                            throw new hmfm(hmfl.aq);
                        }
                        this.l(hmhs1);
                        hmbg0 = this.m(hmgz0, 1);
                        break;
                    }
                    case 1: {
                        try {
                            hmhs2 = hmhi0.g(2, 1);
                            this.m = hmhs2;
                        }
                        catch(hmhx hmhx2) {
                            this.g.b(hmhx2, "Credentials not available to proceed with transaction", new Object[0]);
                            throw new hmfm(hmfl.aq);
                        }
                        this.l(hmhs2);
                        hmbg0 = this.m(hmgz0, 1);
                        try {
                            hmgc.d(new hmgs(this.k.b(), this.k.j(), this.i.a));
                            break;
                        }
                        catch(hmdp unused_ex) {
                            throw new hmfm(hmfl.ae);
                        }
                    }
                    default: {
                        try {
                            hmhs0 = hmhi0.g(1, 1);
                            this.m = hmhs0;
                        }
                        catch(hmhx hmhx0) {
                            this.g.b(hmhx0, "Credentials not available to proceed with transaction", new Object[0]);
                            throw new hmfm(hmfl.aq);
                        }
                        this.l(hmhs0);
                        if(v == 0) {
                            this.l.a.g();
                        }
                        else {
                            this.l.a.g();
                            this.h.h.a();
                        }
                        hmbg0 = this.m(hmgz0, 2);
                    }
                }
                this.i.e();
                this.i.f();
                hmgz hmgz1 = this.n;
                this.g.e();
                this.h.t.b(new hmgp(((hmhr[])arrayList0.toArray(new hmhr[arrayList0.size()])), hmgz1));
                return hmbg0;
            }
            this.g.a("Received CDOL list length and CDOL1 Related Data Length do not match or less than 45", new Object[0]);
            throw new hmfm(hmfl.R);
        }
        this.g.a("MCHIP profile data is not available. Profile data for isAlternateAidSelected=%s is invalid", new Object[]{Boolean.valueOf(z)});
        throw new hmfm(hmfl.P);
    }

    private final void l(hmhs hmhs0) {
        try {
            hmdj hmdj0 = this.l;
            hmdj0.d = new hmfg(hmhs0.a());
        }
        catch(hmdl hmdl0) {
            this.g.b(hmdl0, "Error while parsing ATC", new Object[0]);
            throw new hmfm(hmfl.as);
        }
    }

    private final hmbg m(hmgz hmgz0, int v) {
        hmbg hmbg0;
        byte[] arr_b11;
        byte[] arr_b9;
        byte[] arr_b8;
        byte[] arr_b7;
        byte[] arr_b6;
        int v1;
        byte[] arr_b5;
        hmhi hmhi0;
        hmgz hmgz5;
        hmgz hmgz4;
        hmdf hmdf0;
        byte[] arr_b4;
        byte[] arr_b1;
        hmhh hmhh0;
        hmgz hmgz1;
        if(hmgz0 != null && !hmgz0.p()) {
            this.l.a.b(hmgz0);
        }
        try {
            hmgz1 = this.h.n.a(1);
        }
        catch(hmdd hmdd0) {
            try {
                hmhh0 = null;
                throw new hmfm(hmfl.as, "Crypto module failed during Cryptogram Input generation: " + hmdd0.getMessage());
            }
            catch(Throwable throwable0) {
                hmhg.a(hmhh0);
                throw throwable0;
            }
        }
        catch(hmdp hmdp0) {
            hmhh0 = null;
            throw new hmfm(hmfl.ae, "Cannot find Input Tag Models (IccDynamicNumber or DataAuthenticationCode): " + hmdp0.getMessage());
        }
        catch(Throwable throwable0) {
            hmhh0 = null;
            hmhg.a(hmhh0);
            throw throwable0;
        }
        try {
            byte[] arr_b = this.h.q.h(hmgz1.a, 3);
            arr_b1 = this.h.q.h(hmgz1.a, v);
            if(arr_b != null && arr_b1 != null) {
                this.g.e();
                hmhn hmhn0 = this.h.l;
                byte[] arr_b2 = hmhn0 == null ? null : hmhn0.d();
                hmbb hmbb0 = this.g;
                if(arr_b2 != null) {
                    hmgz.e(arr_b2).i();
                }
                hmbb0.e();
                hmgz hmgz2 = this.j.m;
                byte[] arr_b3 = this.l.a.a().a;
                hmhp hmhp0 = this.h.k.b();
                this.g.e();
                this.g.e();
                if(this.i.a) {
                    hmgz hmgz3 = this.j.c.d;
                    hmbb hmbb1 = this.g;
                    hmgz3.i();
                    hmbb1.e();
                    arr_b4 = (hmgz3.a(0) & 1) == 0 ? null : new hmgz(((char)hmhp0.o)).a;
                }
                else {
                    arr_b4 = new hmgz(((char)hmhp0.o)).a;
                }
                hmdf0 = new hmdh(hmgz2.a, arr_b3, arr_b, arr_b4, arr_b2).a();
                if(this.l.a.h()) {
                    hmgz4 = new hmgz(0);
                    try {
                        hmfk hmfk0 = this.l.c;
                        hmgz4.v(this.h.b);
                        hmgz4.v(this.l.b.a().d());
                        hmgz4.v(this.l.d.a().d());
                        hmgz4.v(hmdf0.c().d());
                        if(hmfk0 != null) {
                            hmgz4.v(hmfk0.a().d());
                        }
                        goto label_54;
                    }
                    catch(hmdl | hmdm | hmdn exception0) {
                        goto label_51;
                    }
                }
                else {
                    goto label_113;
                }
                goto label_126;
            }
            hmgz5 = hmgz1;
            throw new hmfm(hmfl.as, "Error during AC computation");
        }
        catch(hmdd hmdd0) {
            hmgz5 = hmgz1;
            goto label_133;
        }
        catch(hmdp hmdp0) {
            hmgz5 = hmgz1;
            hmhh0 = hmgz5;
            throw new hmfm(hmfl.ae, "Cannot find Input Tag Models (IccDynamicNumber or DataAuthenticationCode): " + hmdp0.getMessage());
        }
        catch(Throwable throwable0) {
            hmgz5 = hmgz1;
            hmhh0 = hmgz5;
            hmhg.a(hmhh0);
            throw throwable0;
        }
        try {
        label_51:
            hmgz5 = hmgz1;
            this.g.b(exception0, "Error in building Gen AC response", new Object[0]);
            throw new hmfm(hmfl.as);
        }
        catch(hmdd hmdd0) {
            goto label_133;
        }
        catch(hmdp hmdp0) {
            hmhh0 = hmgz5;
            throw new hmfm(hmfl.ae, "Cannot find Input Tag Models (IccDynamicNumber or DataAuthenticationCode): " + hmdp0.getMessage());
        }
        catch(Throwable throwable0) {
            hmhh0 = hmgz5;
            hmhg.a(hmhh0);
            throw throwable0;
        }
        try {
        label_54:
            hmhi0 = this.h.q;
            arr_b5 = this.m.b();
            v1 = this.l.b.b().a[0];
            arr_b6 = this.h.c.a;
            arr_b7 = hmgz4.a;
            arr_b8 = this.k.k().b.a;
            if(arr_b6 != null && arr_b6.length > 0) {
                arr_b9 = new byte[arr_b6.length + arr_b7.length];
                hmgz5 = hmgz1;
                goto label_75;
            }
            else {
                goto label_78;
            }
            goto label_81;
        }
        catch(hmhw unused_ex) {
            hmgz5 = hmgz1;
            throw new hmfm(hmfl.ap, "Error during Signed Dynamic Data computation");
        }
        catch(hmdd hmdd0) {
            hmgz5 = hmgz1;
            goto label_133;
        }
        catch(hmdp hmdp0) {
            hmgz5 = hmgz1;
            hmhh0 = hmgz5;
            throw new hmfm(hmfl.ae, "Cannot find Input Tag Models (IccDynamicNumber or DataAuthenticationCode): " + hmdp0.getMessage());
        }
        catch(Throwable throwable0) {
            hmgz5 = hmgz1;
            hmhh0 = hmgz5;
            hmhg.a(hmhh0);
            throw throwable0;
        }
        try {
            try {
            label_75:
                System.arraycopy(arr_b6, 0, arr_b9, 0, arr_b6.length);
                System.arraycopy(arr_b7, 0, arr_b9, arr_b6.length, arr_b7.length);
                goto label_81;
            label_78:
                hmgz5 = hmgz1;
                arr_b9 = new byte[arr_b7.length];
                System.arraycopy(arr_b7, 0, arr_b9, 0, arr_b7.length);
            label_81:
                byte[] arr_b10 = ((esqx)hmhi0).e(arr_b9);
                hmgz hmgz6 = hmgz.e(arr_b10);
                esqx.b(arr_b9);
                esqx.b(arr_b10);
                int v2 = ((esqx)hmhi0).a.a;
                hmgz hmgz7 = new hmgz(((byte)v1));
                hmgz hmgz8 = hmgz.e(arr_b1);
                hmgz hmgz9 = hmgz.e(arr_b8);
                hmgz hmgz10 = new hmgz(v2 - 0x3F);
                Arrays.fill(hmgz10.a, -69);
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(hmgz7);
                arrayList0.add(hmgz8);
                arrayList0.add(hmgz6);
                arrayList0.add(hmgz10);
                arrayList0.add(hmgz9);
                hmgz hmgz11 = ((esqx)hmhi0).a(hmgw.e(arrayList0), arr_b5);
                arr_b11 = hmgz11 == null ? null : hmgz11.a;
                if(arr_b11 == null) {
                    throw new hmfm(hmfl.ap, "Error during Signed Dynamic Data computation");
                }
            }
            catch(hmhw unused_ex) {
                throw new hmfm(hmfl.ap, "Error during Signed Dynamic Data computation");
            }
            hmgz hmgz12 = hmgz.e(arr_b11);
            hmbg0 = new hmbv();
            hmfk hmfk1 = this.l.c;
            hmbg0.g = true;
            hmbg0.a = this.l.b;
            hmbg0.b = this.l.d;
            hmbg0.c = hmgz12;
            hmbg0.d = null;
            hmbg0.e = hmdf0;
            hmbg0.f = hmfk1;
            goto label_126;
        label_113:
            hmgz5 = hmgz1;
            hmbg0 = new hmbv();
            hmfi hmfi0 = this.l.b;
            hmfg hmfg0 = this.l.d;
            hmgz hmgz13 = hmgz.e(arr_b1);
            hmfk hmfk2 = this.l.c;
            hmbg0.g = false;
            hmbg0.a = hmfi0;
            hmbg0.b = hmfg0;
            hmbg0.c = null;
            hmbg0.d = hmgz13;
            hmbg0.e = hmdf0;
            hmbg0.f = hmfk2;
        label_126:
            hmgz hmgz14 = this.l.d.b();
            this.n = this.h.r.a(this.h.q, this.h.p.b.l, hmgz14, hmgz.e(arr_b1));
        }
        catch(hmdd hmdd0) {
            goto label_133;
        }
        catch(hmdp hmdp0) {
            hmhh0 = hmgz5;
            throw new hmfm(hmfl.ae, "Cannot find Input Tag Models (IccDynamicNumber or DataAuthenticationCode): " + hmdp0.getMessage());
        }
        catch(Throwable throwable0) {
            hmhh0 = hmgz5;
            hmhg.a(hmhh0);
            throw throwable0;
        }
        hmhg.a(hmgz5);
        return hmbg0;
        try {
            hmgz5 = hmgz1;
            throw new hmfm(hmfl.as, "Error during AC computation");
        }
        catch(hmdd hmdd0) {
        }
        catch(hmdp hmdp0) {
            hmhh0 = hmgz5;
            throw new hmfm(hmfl.ae, "Cannot find Input Tag Models (IccDynamicNumber or DataAuthenticationCode): " + hmdp0.getMessage());
        }
        catch(Throwable throwable0) {
            hmhh0 = hmgz5;
            hmhg.a(hmhh0);
            throw throwable0;
        }
    label_133:
        hmhh0 = hmgz5;
        try {
            throw new hmfm(hmfl.as, "Crypto module failed during Cryptogram Input generation: " + hmdd0.getMessage());
        }
        catch(Throwable throwable0) {
        }
        hmhg.a(hmhh0);
        throw throwable0;
    }
}

