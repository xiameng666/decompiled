import android.util.Base64;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class hmba {
    public hmhm a;
    public final hmbb b;
    private static hmhc c;
    private hmgk d;
    private hmgl e;
    private boolean f;
    private boolean g;
    private int h;

    public hmba(hmie hmie0, hmhi hmhi0, esrk esrk0, hmhl hmhl0, hmhk hmhk0, hmhm hmhm0, hmhj hmhj0, hmhn hmhn0, List list0, List list1, hmbb hmbb0) {
        this.h = 1;
        hmhe.a = hmbb0;
        this.b = hmhe.a();
        this.a = hmhm0;
        try {
            if(hmhm0 == null) {
                this.a = new hmgy();
            }
            hmcs hmcs0 = new hmcs(hmie0, list0, list1);
            this.f = hmcs0.a.c;
            this.g = hmcs0.a.d;
            hmga hmga0 = new hmga(hmhj0, hmhk0, hmhl0, esrk0, hmhn0);
            this.h = 1;
            this.e = new hmgl(hmhi0, hmga0, hmcs0, this);
            new hmbt();
            new hmbo();
            new hmbr();
            new hmbm();
            new hmbk();
            if(hmba.c == null) {
                hmba.c = new hmhc(300000, new hmaw(this));
            }
        }
        catch(hmfp hmfp0) {
            this.b.a("Problem with MChipEngine Construction: %s", new Object[]{hmfp0.getMessage()});
            hmfp0.c();
        }
    }

    public final void a() {
        synchronized(this) {
            this.b.c("*** onNotReceivedApduWithinTimeLimit called ***", new Object[0]);
            this.f(null);
            new hmfm(hmfl.Q);
            this.g(hmho.c);
        }
    }

    public final void b(hmgp hmgp0) {
        if(Arrays.asList(hmgp0.a).contains(hmhr.e)) {
            hmba.c.b();
        }
        else {
            hmba.c.a();
        }
        this.f(hmgp0);
    }

    public final void c() {
        synchronized(this) {
            this.b.c("*** onWaitingForAuthenticationTimedOut called ***", new Object[0]);
            this.f(null);
            new hmfm(hmfl.d);
            this.g(hmho.b);
        }
    }

    public final byte[] d(byte[] arr_b) {
        byte[] arr_b2;
        synchronized(this) {
            try {
                if(!this.f) {
                    this.b.a("Contactless not supported", new Object[0]);
                    throw new hmfm(hmfl.k);
                }
                hmba.c.a();
                int v1 = this.h;
                if(v1 == 1) {
                    hmgk hmgk0 = this.e.a(1);
                    this.d = hmgk0;
                    hmgk0.d();
                    this.h = 2;
                    return ((hmgi)this.d).e(arr_b);
                }
                if(v1 != 2) {
                    throw new hmfs(hmfl.at);
                }
                arr_b2 = ((hmgi)this.d).e(arr_b);
            }
            catch(hmfs hmfs0) {
                this.g(hmfs0.b());
                this.b.a("Error during process APDU: %s", new Object[]{hmfs0.getMessage()});
                this.b.a("Error Reason Code: %s", new Object[]{hmfs0.a});
                return hmbh.a(hmfs0.a).b();
            }
            catch(hmfm hmfm0) {
                hmgc.b();
                this.f(null);
                this.g(hmfm0.b());
                this.b.a("Error during process APDU: %s", new Object[]{hmfm0.getMessage()});
                this.b.a("Error Reason Code: %s", new Object[]{hmfm0.a});
                return hmbh.a(hmfm0.a).b();
            }
            catch(hmfn hmfn0) {
                new Thread(new hmax(this, hmfn0)).start();
                this.b.a("Error during process APDU: %s", new Object[]{hmfn0.getMessage()});
                this.b.a("Error Reason Code: %s", new Object[]{hmfn0.a});
                return hmbh.a(hmfn0.a).b();
            }
            catch(hmfp hmfp0) {
                hmgc.b();
                this.f(null);
                this.g(hmfp0.b());
                this.b.a("Error during process APDU: %s", new Object[]{hmfp0.getMessage()});
                this.b.a("Error Reason Code: %s", new Object[]{hmfp0.a});
                return hmbh.a(hmfp0.a).b();
            }
        }
        return arr_b2;
    }

    public final hmgr e(hmhu hmhu0) {
        hmgr hmgr0;
        hmgz hmgz25;
        hmgm hmgm0;
        hmgz hmgz11;
        hmdf hmdf0;
        hmgz hmgz10;
        hmgz hmgz9;
        hmgz hmgz3;
        hmhs hmhs0;
        hmgz hmgz1;
        int v4;
        synchronized(this) {
            try {
                if(!this.g) {
                    throw new hmfo(hmfl.a);
                }
                if(this.h != 1) {
                    throw new hmfs(hmfl.at);
                }
                hmgk hmgk0 = this.e.a(2);
                this.d = hmgk0;
                hmgd hmgd0 = (hmgd)hmgk0.a();
                hmbb hmbb0 = hmgd0.s;
                if(hmhu0.a() != null) {
                    hmgz.e(hmhu0.a()).i();
                }
                if(hmhu0.b() != null) {
                    hmgz.e(hmhu0.b()).i();
                }
                hmgz.e(hmhu0.c()).i();
                new hmhd(hmhu0.e()).a();
                hmgz.e(hmhu0.f()).i();
                if(hmhu0.d() != null) {
                    hmgz.e(hmhu0.d());
                }
                hmbb0.e();
                try {
                    hmgw.c(hmhu0.c());
                    hmgw.c(hmgz.e(hmhu0.f()).a);
                    hmgw.c(hmgz.e(hmhu0.a()).a);
                    new hmhd(hmhu0.e());
                }
                catch(hmdl | NullPointerException exception1) {
                    throw new IllegalArgumentException(exception1.getMessage());
                }
                hmgd0.a = new hmgq();
                hmgq hmgq0 = hmgd0.a;
                hmgq0.a = hmhu0.a();
                hmgq hmgq1 = hmgd0.a;
                hmgq1.b = hmhu0.c();
                hmgq hmgq2 = hmgd0.a;
                hmgq2.c = hmhu0.f();
                hmgq hmgq3 = hmgd0.a;
                hmgq3.d = hmhu0.e();
                hmgq hmgq4 = hmgd0.a;
                hmgq4.e = hmhu0.b();
                hmgq hmgq5 = hmgd0.a;
                hmgq5.g = hmhu0.g();
                if(hmhu0.d() != null && hmhu0.d().length != 0) {
                    if(hmhu0.d().length > 0x6F) {
                        hmgq hmgq6 = hmgd0.a;
                        hmgq6.f = new hmgz(hmhu0.d(), 0x6F).a;
                    }
                    else {
                        hmgq hmgq7 = hmgd0.a;
                        hmgq7.f = hmhu0.d();
                    }
                }
                hmgd0.s.e();
                if(!this.d.d()) {
                    throw new IllegalArgumentException();
                }
                hmgj hmgj0 = (hmgj)this.d;
                hmgf hmgf0 = hmgj0.a;
                hmgj0.c = hmgf0.f;
                hmgj0.d = hmgf0.e;
                hmgj0.e = hmgf0.p.c;
                hmgj0.i = ((hmgd)hmgf0).a.g;
                if(((hmgd)hmgf0).a.g == 0) {
                    hmgj0.i = 2;
                }
                hmgj0.b.e();
                hmgq hmgq8 = ((hmgd)hmgf0).a;
                try {
                    int v = (int)hmgw.c(hmgq8.b);
                    int v1 = hmgq8.e == null ? 0 : ((int)hmgw.c(hmgq8.e));
                    int v2 = (int)hmgw.c(hmgz.e(hmgq8.c).a);
                    long v3 = hmgw.c(hmgz.e(hmgq8.a).a);
                    hmhd hmhd0 = new hmhd(hmgq8.d);
                    hmgj0.d.n(new hmdu(v3));
                    hmgj0.d.n(new hmds(((long)0L)));
                    hmgj0.d.n(new hmep(Character.valueOf(((char)v1))));
                    hmgj0.d.n(new hmev());
                    hmgj0.d.n(new hmex(Character.valueOf(((char)v))));
                    hmgj0.d.n(new hmez(hmhd0));
                    hmgj0.d.n(new hmfb(((byte)0)));
                    hmgj0.d.n(new hmfd(v2));
                }
                catch(hmdl hmdl0) {
                    throw new IllegalArgumentException(hmdl0.getMessage());
                }
                try {
                    hmdj hmdj0 = hmgj0.c;
                    hmgz hmgz0 = hmgz.d(hmgj0.e.c);
                    hmdj0.b(new hmdk(hmbw.a, hmgz0));
                }
                catch(hmdm | hmdl | hmdn exception2) {
                    hmgj0.b.b(exception2, "Failed to parse AIP or AIP is missing", new Object[0]);
                    throw new hmfo(hmho.b);
                }
                hmgj0.c.c(hmgj0.e.m);
                hmgj0.c.d();
                hmgf hmgf1 = hmgj0.a;
                hmfv hmfv0 = hmgf1.i;
                boolean z = hmfv0.a() != 2;
                hmbb hmbb1 = hmgj0.b;
                hmbb1.e();
                hmgj0.c.a.e(z);
                hmbb1.e();
                List list0 = hmgf1.g.a(hmgf1);
                if(list0.isEmpty()) {
                    v4 = 3;
                }
                else if(list0.size() == 1 && list0.contains(hmhq.g)) {
                    v4 = 2;
                }
                else {
                    v4 = 1;
                }
                hmca hmca0 = new hmca(v4, list0);
                hmbb1.e();
                int v5 = hmgf1.m.k(hmca0, hmfv0.f(), hmfv0.e());
                hmbb1.e();
                if(v5 == 3) {
                    hmgf1.h.a();
                }
                int v6 = hmgf1.i.g(v5, hmca0, hmgj0.e.p, hmgj0.e.o, 2);
                hmgj0.h = v6;
                hmfh hmfh0 = hmgj0.c.a;
                if(v6 - 1 == 4) {
                    hmfh0.d();
                }
                hmfh0.i(v6);
                if(v5 - 1 != 0 && v5 - 1 != 1) {
                    hmbb1.e();
                    hmgj0.c.b.c();
                    hmgj0.c.a.c();
                    hmcu hmcu0 = hmgj0.e;
                    int v7 = ((hmgd)hmgf1).a.g - 1;
                    if(((hmgd)hmgf1).a.g == 0) {
                        throw null;
                    }
                    switch(v7) {
                        case 0: {
                            hmgz1 = hmcu0.e;
                            break;
                        }
                        case 1: {
                            hmgz1 = hmcu0.h;
                            break;
                        }
                        case 2: {
                            hmgz1 = hmcu0.i;
                            break;
                        }
                        case 3: {
                            hmgz1 = hmcu0.j;
                            break;
                        }
                        default: {
                            hmgz1 = hmcu0.e;
                        }
                    }
                    if(hmgz1 != null && !hmgz1.p()) {
                        hmgj0.c.a.b(hmgz1);
                    }
                    try {
                        hmhs0 = hmgf1.q.g(1, 2);
                    }
                    catch(hmhx hmhx0) {
                        hmgj0.b.b(hmhx0, "Credentials not available to proceed with transaction", new Object[0]);
                        throw new hmfo(hmfl.aq);
                    }
                    try {
                        try {
                            hmdj hmdj1 = hmgj0.c;
                            hmdj1.d = new hmfg(hmhs0.a());
                            if(hmgj0.i == 4) {
                                hmgf hmgf2 = hmgj0.a;
                                hmfu hmfu0 = (hmfu)hmgf2.i;
                                hmgd hmgd1 = hmfu0.a;
                                long v8 = (long)Long.valueOf(hmgz.e(hmgd1.a.a).i(), 16);
                                if(v8 == 0L) {
                                    hmgz3 = new hmgz("000000");
                                }
                                else {
                                    byte[] arr_b = hmgw.g(new hmgz(Long.toHexString(v8))).getBytes();
                                    hmbb hmbb2 = hmfu0.d;
                                    hmgz.e(arr_b);
                                    hmbb2.e();
                                    byte[] arr_b1 = new byte[24];
                                    Arrays.fill(arr_b1, 0x30);
                                    byte[] arr_b2 = new byte[8];
                                    Arrays.fill(arr_b2, 0x30);
                                    if(v8 > 0x3FFFFL) {
                                        for(int v9 = 0; v9 < arr_b.length; ++v9) {
                                            if(Character.getNumericValue(arr_b[v9]) == 1) {
                                                hmfu0.b = Arrays.copyOfRange(arr_b, v9, v9 + 18);
                                                hmfu0.c = Arrays.copyOfRange(arr_b, v9 + 18, arr_b.length);
                                                hmgz.e(hmfu0.b);
                                                hmbb2.e();
                                                hmgz.e(hmfu0.c);
                                                hmbb2.e();
                                                break;
                                            }
                                        }
                                        if(hmfu0.b != null) {
                                            byte[] arr_b3 = hmfu0.c;
                                            if(arr_b3 != null) {
                                                byte[] arr_b4 = new hmgz(Long.toHexString(Long.parseLong(hmgz.e(arr_b3).j().replaceAll(" ", ""), 2))).a;
                                                int v11 = 0;
                                                for(int v10 = 0; v10 < arr_b4.length; ++v10) {
                                                    v11 |= arr_b4[v10];
                                                }
                                                if(v11 == 0) {
                                                    System.arraycopy(hmfu0.b, 0, arr_b1, 6, hmfu0.b.length);
                                                }
                                                else {
                                                    byte[] arr_b5 = hmgw.g(new hmgz(Long.toHexString((hmfu0.c() ? 0x20000L : new BigInteger(hmgz.e(hmfu0.b).j(), 2).longValue() + 1L)))).getBytes();
                                                    System.arraycopy(arr_b5, 0, arr_b1, 24 - arr_b5.length, arr_b5.length);
                                                }
                                                arr_b2 = hmfu0.c() ? hmgw.g(new hmgz(((byte)(hmfu0.c.length + 1)))).getBytes() : hmgw.g(new hmgz(((byte)hmfu0.c.length))).getBytes();
                                                hmbb2.e();
                                            }
                                        }
                                    }
                                    else {
                                        hmbb2.e();
                                        System.arraycopy(arr_b, 0, arr_b1, 24 - arr_b.length, arr_b.length);
                                    }
                                    hmgz.e(arr_b1);
                                    hmbb2.e();
                                    hmgz.e(arr_b2);
                                    hmbb2.e();
                                    byte[] arr_b6 = new byte[24];
                                    System.arraycopy(arr_b1, 5, arr_b6, 0, 19);
                                    System.arraycopy(arr_b2, arr_b2.length - 5, arr_b6, 19, 5);
                                    hmgz.e(arr_b6);
                                    hmbb2.e();
                                    hmgz hmgz2 = new hmgz(Long.toHexString(Long.parseLong(hmgz.e(arr_b6).j().replaceAll(" ", ""), 2)));
                                    byte[] arr_b7 = new byte[3];
                                    System.arraycopy(hmgz2.a, 0, arr_b7, 3 - hmgz2.b(), hmgz2.b());
                                    hmgz3 = hmgz.e(arr_b7);
                                }
                                hmgj0.g = hmgz3;
                                hmgz hmgz4 = hmgj0.g;
                                hmgz hmgz5 = hmgz.e(hmhs0.a());
                                hmhi hmhi0 = hmgd1.q;
                                hmgz hmgz6 = hmgz.e(new byte[]{0, 0});
                                byte[] arr_b8 = hmgd1.a.f;
                                if(arr_b8 != null) {
                                    hmgz hmgz7 = hmgz.e(hmhi0.f(arr_b8));
                                    hmgz7.v(hmgz4);
                                    hmgz7.v(hmgz5);
                                    hmgz6 = hmgz.e(hmhi0.f(hmgz7.a)).c(0, 2);
                                }
                                hmgj0.f = hmgz6;
                                hmgf2.n.b = hmgj0.g;
                                hmgf2.n.a = hmgj0.f;
                            }
                            hmgz hmgz8 = hmgj0.a.n.a(hmgj0.i);
                            byte[] arr_b9 = hmgj0.a.q.h(hmgz8.a, 3);
                            byte[] arr_b10 = hmgj0.a.q.h(hmgz8.a, 2);
                            if(arr_b9 == null || arr_b10 == null) {
                                throw new hmfo(hmfl.as, null);
                            }
                            hmgz9 = hmgz.e(arr_b10);
                            hmgz10 = hmgz.e(arr_b9);
                            byte[] arr_b11 = hmgj0.c.a.a().a;
                            hmdf0 = new hmdg(hmgj0.e.m.a, arr_b11, hmgz10.a).a();
                            int v12 = hmgj0.i - 1;
                            if(hmgj0.i == 0) {
                                throw null;
                            }
                            switch(v12) {
                                case 0: {
                                    goto label_232;
                                }
                                case 2: {
                                    goto label_276;
                                }
                                case 3: {
                                    goto label_285;
                                }
                                default: {
                                    hmgj0.b.e();
                                }
                            }
                        }
                        catch(hmdl unused_ex) {
                            throw new hmfo(hmho.b, null);
                        }
                        try {
                            hmgz11 = hmgz.e(hmgu.a(hmgz10, new hmgt(hmgz.d(hmgj0.e.d), hmgz9, hmgj0.c.a.a(), hmgj0.c.d, hmgj0.d.k(), hmgj0.c.a(), hmdf0)).f().getBytes());
                            goto label_313;
                        }
                        catch(hmdp | hmdl exception3) {
                            try {
                                throw new hmdd("Error during UCAF generation: " + ((hmdo)exception3).getMessage());
                            label_232:
                                hmgj0.b.e();
                            }
                            catch(hmdl unused_ex) {
                                throw new hmfo(hmho.b, null);
                            }
                        }
                        try {
                            hmfg hmfg0 = hmgj0.c.d;
                            hmdk hmdk0 = hmgj0.d.a(hmev.class);
                            hmfi hmfi0 = hmgj0.c.b;
                            int v13 = hmgj0.h;
                            hmdk hmdk1 = hmgj0.d.a(hmfd.class);
                            hmdk hmdk2 = hmgj0.d.a(hmdu.class);
                            hmdk hmdk3 = hmgj0.d.a(hmds.class);
                            hmdk hmdk4 = hmgj0.d.a(hmex.class);
                            hmdk hmdk5 = hmgj0.d.a(hmez.class);
                            hmdk hmdk6 = hmgj0.d.a(hmfb.class);
                            hmgz hmgz12 = hmgz.d(hmgj0.e.l);
                            hmgz hmgz13 = hmgz.d(hmgj0.e.d);
                            hmgz hmgz14 = hmgz.e(hmgj0.e.a.b);
                            hmdk hmdk7 = new hmdk(hmcv.a, hmgz14);
                            hmdk hmdk8 = hmgj0.d.a(hmep.class);
                            hmdk hmdk9 = hmgj0.c.a();
                            ArrayList arrayList0 = new ArrayList();
                            arrayList0.add(new hmdk(hmgn.a, hmgz9).d());
                            arrayList0.add(hmdf0.c().d());
                            arrayList0.add(hmfg0.a().d());
                            arrayList0.add(hmdk0.d());
                            arrayList0.add(hmfi0.a().d());
                            if(v13 != 3 && v13 != 6) {
                                hmgz hmgz15 = new hmgz("3F0002");
                                arrayList0.add(new hmdk(hmgn.b, hmgz15).d());
                            }
                            else {
                                hmgz hmgz16 = new hmgz("010002");
                                arrayList0.add(new hmdk(hmgn.b, hmgz16).d());
                            }
                            arrayList0.add(hmdk1.d());
                            arrayList0.add(hmdk2.d());
                            arrayList0.add(hmdk3.d());
                            arrayList0.add(hmdk4.d());
                            arrayList0.add(hmdk5.d());
                            arrayList0.add(hmdk6.d());
                            arrayList0.add(new hmdk(hmgn.c, hmgz12).d());
                            arrayList0.add(new hmdk(hmgn.d, hmgz13).d());
                            arrayList0.add(hmdk7.d());
                            arrayList0.add(hmdk8.d());
                            arrayList0.add(hmdk9.d());
                            hmgz11 = hmgw.e(arrayList0);
                            goto label_313;
                        }
                        catch(hmdl | hmdm | hmdn | hmdp exception4) {
                            try {
                                throw new hmdd("Error during DE55 generation: " + ((hmdo)exception4).getMessage());
                            label_276:
                                hmgj0.b.e();
                            }
                            catch(hmdl unused_ex) {
                                throw new hmfo(hmho.b, null);
                            }
                        }
                        try {
                            hmgt hmgt0 = new hmgt(hmgz.d(hmgj0.e.d), hmgz9, hmgj0.c.a.a(), hmgj0.c.d, hmgj0.d.k(), hmgj0.c.a(), hmdf0);
                            hmgz11 = hmgu.a(hmgz10, hmgt0);
                            hmgz11.v(new hmgz(hmgt0.g.a(0)));
                            hmgz11.i();
                            hmgt0.h.e();
                            goto label_313;
                        }
                        catch(hmdp | hmdl exception5) {
                            try {
                                throw new hmdd("Error during UCAF generation: " + ((hmdo)exception5).getMessage());
                            label_285:
                                hmgj0.b.e();
                            }
                            catch(hmdl unused_ex) {
                                throw new hmfo(hmho.b, null);
                            }
                        }
                        try {
                            hmgz hmgz17 = hmgz.d(hmgj0.e.d);
                            hmgz hmgz18 = hmgj0.c.a.a();
                            hmfg hmfg1 = hmgj0.c.d;
                            hmfd hmfd0 = hmgj0.d.k();
                            hmdk hmdk10 = hmgj0.c.a();
                            int v14 = hmgj0.h;
                            hmgz hmgz19 = hmgj0.f;
                            hmgz hmgz20 = hmgj0.g;
                            hmgt hmgt1 = new hmgt(hmgz17, hmgz9, hmgz18, hmfg1, hmfd0, hmdk10, hmdf0);
                            long v15 = hmgw.c(hmgz20.a);
                            hmgz hmgz21 = hmgz.d(hmgz.e(hmgw.k(v15 + v15)).c(5, 8)).c(0, 2);
                            hmgz hmgz22 = v14 == 3 ? new hmgz(((byte)(hmgz20.a(2) | 0x80))) : new hmgz(((byte)(hmgz20.a(2) & 0x7F)));
                            hmgz hmgz23 = new hmgz(((byte)(hmgt1.a.a(0) & 15 | 0x30)));
                            hmgz23.v(hmgt1.b.c(0, 4));
                            hmgz23.v(hmgz19);
                            hmgz23.v(hmgz21);
                            hmgz23.v(hmgt1.c.b());
                            hmgz23.v(hmgt1.d.b);
                            hmgz23.v(hmgt1.e.c);
                            hmgz23.v(new hmgz(hmgt1.f.b()));
                            hmgz23.v(new hmgz(hmgt1.f.a()));
                            hmgz23.v(hmgz22);
                            hmgt1.h.e();
                            hmgz11 = hmgz.e(hmgz23.f().getBytes());
                            goto label_313;
                        }
                        catch(hmdp | hmdl exception6) {
                            try {
                                throw new hmdd("Error during UCAF generation: " + ((hmdo)exception6).getMessage());
                            label_313:
                                hmgj0.b.e();
                                hmgm0 = new hmgm(hmgj0.c.d, hmgz9, hmgz11);
                                goto label_318;
                            }
                            catch(hmdl unused_ex) {
                            }
                            throw new hmfo(hmho.b, null);
                        }
                    }
                    catch(hmdd unused_ex) {
                        throw new hmfo(hmho.b, null);
                    }
                }
                else {
                    hmgm0 = hmgj0.c();
                }
            label_318:
                hmgq hmgq9 = ((hmgd)hmgj0.a).a;
                String s = hmgj0.e.l.i().replaceAll("F", "");
                hmgj0.e.b.i();
                hmcu hmcu1 = hmgj0.e;
                hmfz hmfz0 = hmgj0.a.r;
                hmhi hmhi1 = hmgj0.a.q;
                hmgz hmgz24 = hmgm0.c;
                int v16 = hmgq9.g - 1;
                if(hmgq9.g == 0) {
                    throw null;
                }
                switch(v16) {
                    case 0: {
                        hmgz hmgz26 = hmgm0.a.b();
                        hmgz25 = hmfz0.a(hmhi1, hmcu1.l, hmgz26, hmgm0.b);
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        try {
                            byte[] arr_b12 = hmfz.b(hmcu1.l);
                            byte[] arr_b13 = new hmgz(hmgz.e(Base64.decode(hmgz24.a, 2)).i()).a;
                            byte[] arr_b14 = new byte[arr_b12.length + arr_b13.length];
                            System.arraycopy(arr_b12, 0, arr_b14, 0, arr_b12.length);
                            System.arraycopy(arr_b13, 0, arr_b14, arr_b12.length, arr_b13.length);
                            hmgz25 = hmgz.e(hmhi1.f(arr_b14));
                        }
                        catch(RuntimeException unused_ex) {
                            hmfz0.b.a("Exception from crypto during transaction id generation.", new Object[0]);
                            hmgz25 = new hmgz(0);
                        }
                        break;
                    }
                    default: {
                        new hmgz(0);
                        hmgz25 = null;
                    }
                }
                hmgr0 = new hmgr(s, hmgj0.e.a.a(), hmgz24.a, hmgq9.a, hmgq9.b, hmgq9.c, hmgz25.a);
                hmgj0.b.e();
                this.d = null;
                return hmgr0;
            }
            catch(hmfs hmfs0) {
            }
            catch(hmfp hmfp0) {
                goto label_354;
            }
            catch(Exception exception0) {
                this.b.a("Unexpected Error: " + exception0.getMessage(), new Object[0]);
                throw exception0;
            }
            this.b.a("Error during process DSRP: %s", new Object[]{hmfs0.getMessage()});
            this.b.a("Error Reason Code: %s", new Object[]{hmfs0.a});
            hmfs0.a();
            return null;
        label_354:
            this.d = null;
            this.b.a("Error during process DSRP: %s", new Object[]{hmfp0.getMessage()});
            this.b.a("Error Reason Code: %s", new Object[]{hmfp0.a});
            hmfp0.a();
        }
        return null;
    }

    private final void f(hmgp hmgp0) {
        this.h = 1;
        hmgk hmgk0 = this.d;
        if(hmgk0 != null) {
            hmgk0.b();
        }
        this.d = null;
        if(hmgp0 != null) {
            new Thread(new hmaz(this, hmgp0)).start();
        }
    }

    private final void g(hmho hmho0) {
        new Thread(new hmay(this, hmho0)).start();
    }
}

