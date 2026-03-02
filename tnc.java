import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class tnc extends tds {
    public static final int a;

    static {
    }

    public tnc(tdu tdu0) {
        super(tdu0);
    }

    @Override  // tds
    public final syi a(syi syi0) {
        return new syo(syi0.f());
    }

    @Override  // tds
    public final syj b(tax tax0, syi syi0) {
        syj syj0;
        tbm tbm0;
        taz taz2;
        syo syo0 = (syo)syi0;
        tdx.a(syo0);
        try {
            ((tkq)tax0).g();
            tax0.f = tdb.b;
            byte[] arr_b = new byte[16];
            new SecureRandom().nextBytes(arr_b);
            ((tkq)tax0).o = arr_b;
            if(((tkq)tax0).o == null) {
                throw new syl("IDN is missing", syn.k);
            }
            taz taz0 = tax0.g;
            tld tld0 = ((tma)((tko)tax0.c).b().d(tma.a)).j();
            taz0.c(tld0);
            tld0.k();
            tlc tlc0 = new tlc(tld0.k().f());
            taz0.c(tlc0);
            tek.b(tlc0.f());
            taz0.c(new tbk(0));
            if(!tax0.j || ((tkq)tax0).m) {
                throw new syl("Generate AC command received before GPO command or after GAC command", syn.c);
            }
            tax0.e();
            tax0.j = false;
            ((tkq)tax0).m = false;
            if((syo0.b() & 0xFFFFFFC0) == 0xFFFFFFC0) {
                throw new syl("Incorrect P1P2", syn.g);
            }
            if(syo0.c() != 0) {
                throw new syl("Incorrect P1P2", syn.g);
            }
            if(((byte)syo0.d()) != 30) {
                throw new syl("Wrong Length", syn.m);
            }
            tnc.c(syo0.e());
            tbj tbj0 = ((tkn)((tko)tax0.c).b()).i();
            tbj0.b();
            byte[] arr_b1 = syo0.j();
            tek.b(arr_b1);
            szf szf0 = tbj0.j(arr_b1);
            tkq tkq0 = new tkq();
            tkq0.l = tax0.l == null ? null : new tau(tax0.l.d());
            tkq0.d = tax0.d;
            tkq0.e = tax0.e;
            tkq0.f = tax0.f;
            taz taz1 = tax0.g;
            if(taz1 == null) {
                taz2 = null;
            }
            else {
                byte[] arr_b2 = taz1.d();
                taz2 = arr_b2 == null ? new taz(null) : new taz(Arrays.copyOf(arr_b2, arr_b2.length));
                taz2.b = taz1.b;
                taz2.c = taz1.c == null ? null : Arrays.copyOf(taz1.c, taz1.c.length);
                taz2.d = taz1.d == null ? null : Arrays.copyOf(taz1.d, taz1.d.length);
            }
            tkq0.g = taz2;
            tkq0.h = tax0.h;
            tkq0.i = tax0.i;
            tkq0.j = tax0.j;
            tkq0.c = tax0.c == null ? null : new taw(tax0, tax0.c.c());
            tkq0.a = null;
            tkq0.b = tax0.b;
            tau tau0 = tkq0.l;
            tmz tmz0 = new tmz(Arrays.copyOf(tau0.d(), tau0.d().length));
            tmz0.e(szf0);
            try {
                tde tde0 = tmz0.l();
            }
            catch(IllegalArgumentException unused_ex) {
                throw new syl("Wrong Data", syn.l);
            }
            if(!tek.b(tde0.f()).matches("\\d{12}")) {
                throw new syl("wrong data - not BCD-encoded", syn.l);
            }
            try {
                tdf tdf0 = tmz0.m();
            }
            catch(IllegalArgumentException unused_ex) {
                throw new syl("Wrong Data", syn.l);
            }
            if(!tek.b(tdf0.f()).matches("\\d{12}")) {
                throw new syl("wrong data - not BCD-encoded", syn.l);
            }
            tbj tbj1 = ((tkn)((tko)tax0.c).b()).i();
            tbj1.b();
            byte[] arr_b3 = syo0.j();
            tek.b(arr_b3);
            szf szf1 = tbj1.j(arr_b3);
            ((tmz)tax0.l).e(szf1);
            taz taz3 = tax0.g;
            tku tku0 = taz3.e;
            tku0.b[0] = (byte)(tku0.b[0] | 2);
            if(Long.compare(((long)((tkn)((tko)tax0.c).b()).m().b[0]) & 8L, 0L) != 0) {
                tku0.b[0] = (byte)(tku0.b[0] | 0x40);
                tlc tlc1 = taz3.o();
                tlc1.b[3] = (byte)(tlc1.b[3] | 2);
                taz3.c(tlc1);
            }
            tau tau1 = tax0.l;
            tam tam0 = ((tko)tax0.c).b();
            tku tku1 = tax0.g.e;
            if(((tkn)tam0).m().h()) {
                tbm0 = tbm.a;
            }
            else {
                tbm tbm1 = tdx.a(syo0);
                tbm tbm2 = tbm.c;
                if(tbm1.equals(tbm2)) {
                    byte[] arr_b8 = ((tkn)tam0).p(tax0);
                    int v4 = 0;
                    while(v4 < 6) {
                        if((tku1.f()[v4] & arr_b8[v4]) != 0) {
                            tbm0 = tbm.a;
                            goto label_143;
                        }
                        ++v4;
                    }
                label_142:
                    tbm0 = tbm2;
                }
                else {
                    tbm tbm3 = tbm.b;
                    if(tbm1.equals(tbm3)) {
                        byte[] arr_b4 = ((tkn)tam0).p(tax0);
                        int v = 0;
                        while(v < 6) {
                            if((tku1.f()[v] & arr_b4[v]) != 0) {
                                tbm0 = tbm.a;
                                goto label_143;
                            }
                            ++v;
                        }
                        tdi tdi0 = tau1.a(tdi.c) ? new tdi(tau1.b(tdi.c)) : null;
                        if((tdi0.a(0) & 15) != 3 && (tdi0.a(0) & 15) != 6) {
                            byte[] arr_b7 = ((tkn)tam0).n(tax0).a(12, 6);
                            int v3 = 0;
                            while(v3 < 6) {
                                if((tku1.f()[v3] & arr_b7[v3]) != 0) {
                                    goto label_142;
                                }
                                ++v3;
                            }
                        }
                        else if((tdi0.a(0) & 15) == 1 || (tdi0.a(0) & 15) == 2 || (tdi0.a(0) & 15) == 3 || (tdi0.a(0) & 0x30) != 0x20) {
                            byte[] arr_b5 = ((tkn)tam0).q(tax0);
                            int v1 = 0;
                            while(v1 < 6) {
                                if((tku1.f()[v1] & arr_b5[v1]) != 0) {
                                    tbm0 = tbm.a;
                                    goto label_143;
                                }
                                ++v1;
                            }
                        }
                        else if((((tkn)tam0).l(tax0).a(0) & 1) != 1) {
                            byte[] arr_b6 = ((tkn)tam0).q(tax0);
                            int v2 = 0;
                            while(v2 < 6) {
                                if((tku1.f()[v2] & arr_b6[v2]) != 0) {
                                    tbm0 = tbm.a;
                                    goto label_143;
                                }
                                ++v2;
                            }
                        }
                        tbm0 = tbm3;
                    }
                    else {
                        tbm0 = tbm.a;
                    }
                }
            }
        label_143:
            switch(tbm0.ordinal()) {
                case 0: {
                    syj0 = this.d(((tkq)tax0), syo0, tbm0);
                    tau tau2 = tax0.l;
                    tax0.d = tau2 == null || tau2.j() == null || !Arrays.equals(new byte[]{0x20}, tau2.j().f()) ? tay.c : tay.b;
                    break;
                }
                case 1: 
                case 2: {
                    syj0 = this.d(((tkq)tax0), syo0, tbm0);
                    tax0.d = tay.b;
                    break;
                }
                default: {
                    throw new RuntimeException("Invalid cryptogram type");
                }
            }
            ((tkq)tax0).m = true;
            return syj0;
        }
        catch(RuntimeException runtimeException0) {
            tax0.j = false;
            throw runtimeException0;
        }
    }

    public static final void c(int v) {
        if(((byte)v) == 0) {
            return;
        }
        throw new syl("Correct Length 00", syn.d);
    }

    private final syj d(tkq tkq0, syo syo0, tbm tbm0) {
        tbz tbz0;
        RSAPrivateKey rSAPrivateKey0;
        tbe tbe0;
        taz taz3;
        byte[] arr_b6;
        taz taz0 = tkq0.g;
        tlc tlc0 = taz0.o();
        switch(tbm0.ordinal()) {
            case 0: {
                tlc0.b[0] = (byte)(tlc0.b[0] & -49);
                break;
            }
            case 1: {
                byte[] arr_b = tlc0.b;
                byte b = (byte)(arr_b[0] & -49);
                arr_b[0] = b;
                arr_b[0] = (byte)(b | 16);
                break;
            }
            case 2: {
                byte[] arr_b1 = tlc0.b;
                byte b1 = (byte)(arr_b1[0] & -49);
                arr_b1[0] = b1;
                arr_b1[0] = (byte)(b1 | 0x20);
                break;
            }
            case 3: {
                tlc0.b[0] = (byte)(tlc0.b[0] | 0x30);
            }
        }
        byte[] arr_b2 = tlc0.b;
        int v = arr_b2[0] & 0x3F;
        arr_b2[0] = (byte)v;
        arr_b2[0] = (byte)(v | 0xFFFFFF80);
        taz0.c(tlc0);
        tbk tbk0 = taz0.m();
        byte[] arr_b3 = tbk0.b;
        int v1 = arr_b3[0] & 0x3F;
        arr_b3[0] = (byte)v1;
        arr_b3[0] = (byte)(v1 | new tbk(((byte)(tbm0.e << 6))).a(0));
        taz0.c(tbk0);
        boolean z = (tbm.c.equals(tbm0) || tbm.b.equals(tbm0)) && syo0.i();
        if(z) {
            tlc tlc1 = taz0.o();
            tlc1.b[0] = (byte)(tlc1.b[0] | 8);
            taz0.c(tlc1);
        }
        tam tam0 = ((tko)tkq0.c).b();
        taz taz1 = tkq0.g;
        tld tld0 = taz1.p();
        tld0.q();
        tld0.m(new tkx(((tkn)tam0).n(tkq0).a(4, 1)));
        tld0.p(new tbn(((tkn)tam0).n(tkq0).a(5, 1)));
        tld0.o(taz1.o());
        tld0.b[17] = (byte)tkq0.n;
        tld0.n(new tla(new byte[]{tng.c(tld0.i(), taz1.f.f()[0])}));
        taz0.c(tld0);
        tlb tlb0 = tlb.a;
        try {
            tau tau0 = tkq0.l;
            byte[] arr_b4 = tdl.c;
            tnc.e(tau0, tlb0, new byte[][]{tdc.c, tdd.c, tdh.c, tdj.c, tdk.d, tdl.c, tdm.c, tdn.c});
            taz taz2 = tkq0.g;
            byte[] arr_b5 = tkw.d;
            tnc.e(taz2, tlb0, new byte[][]{arr_b5, tba.c});
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            tak[] arr_tak = new tak[11];
            arr_tak[0] = tau0.g();
            arr_tak[1] = tau0.h();
            tdl tdl0 = null;
            arr_tak[2] = tau0.a(tdh.c) ? new tdh(tau0.b(tdh.c)) : null;
            arr_tak[3] = tau0.a(tdj.c) ? new tdj(tau0.b(tdj.c)) : null;
            arr_tak[4] = tau0.i();
            if(tau0.a(arr_b4)) {
                tdl0 = new tdl(tau0.b(arr_b4));
            }
            arr_tak[5] = tdl0;
            arr_tak[6] = tau0.j();
            arr_tak[7] = tau0.k();
            arr_tak[8] = new tkw(taz2.f(new szi(arr_b5)));
            arr_tak[9] = taz2.l();
            arr_tak[10] = taz2.p();
            byteArrayOutputStream0.write(tak.e(arr_tak));
            tlb0.a(byteArrayOutputStream0);
            arr_b6 = byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        byte[] arr_b7 = tee.a(arr_b6, tkq0.b());
        tek.b(arr_b7);
        taz0.c(new tbe(arr_b7));
        tma tma0 = (tma)((tko)tkq0.c).b().d(tma.a);
        if((tma0.i().b[2] & 1) != 0 && tma0.k() != null) {
            tlf tlf0 = tma0.l();
            if(tlf0 == null) {
                goto label_96;
            }
            else {
                tlf0.i();
                int v2 = tlf0.h();
                byte[] arr_b8 = new byte[v2];
                int v3 = 0;
                Iterator iterator0 = tlf0.j(new byte[v2]).iterator();
                while(true) {
                    if(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        szi szi0 = ((szg)object0).a;
                        byte[] arr_b9 = ((tmz)tkq0.l).f(szi0);
                        if(arr_b9 == null) {
                            arr_b9 = tkq0.g.f(szi0);
                        }
                        if(arr_b9 == null) {
                            goto label_96;
                        }
                        System.arraycopy(arr_b9, 0, arr_b8, v3, Math.min(((szg)object0).a(), arr_b9.length));
                        v3 += ((szg)object0).a();
                        continue;
                    }
                    tek.b(arr_b8);
                    goto label_96;
                }
            }
        }
        else {
        label_96:
            taz3 = tkq0.g;
            tbe0 = new tbe(taz3.b(tbe.c));
            if(z) {
                tam tam1 = ((tko)tkq0.c).b();
                tcj tcj0 = tco.a;
                if(tam1.f(tcj0)) {
                    tcj tcj1 = tcp.a;
                    if(tam1.f(tcj1)) {
                        tcj tcj2 = tcq.a;
                        if(tam1.f(tcj2)) {
                            tcj tcj3 = tcr.a;
                            if(tam1.f(tcj3)) {
                                tcj tcj4 = tcs.a;
                                if(tam1.f(tcj4)) {
                                    byte[] arr_b10 = taz3.d == null ? new byte[0] : taz3.d;
                                    tek.b(arr_b10);
                                    byte[] arr_b11 = syo0.g();
                                    tek.b(arr_b11);
                                    byte[] arr_b12 = teb.f(new byte[][]{arr_b10, arr_b11, taz3.m().g().d(), taz3.l().g().d(), taz3.p().g().d()});
                                    tek.b(arr_b12);
                                    tdu tdu0 = this.b;
                                    szs szs0 = (szs)tdu0;
                                    byte[] arr_b13 = tdo.a(arr_b12);
                                    tak tak0 = new tak(new byte[38], false, tah.b);
                                    tak0.b[0] = 8;
                                    new tak(Arrays.copyOfRange(tkq0.o, 8, 16), tai.c).c(tak0.b, 1, 8);
                                    taz3.m().c(tak0.b, 9, 1);
                                    tbe0.c(tak0.b, 10, 8);
                                    System.arraycopy(arr_b13, 0, tak0.b, 18, 20);
                                    tek.b(tak0.f());
                                    tas tas0 = tas.a;
                                    tao tao0 = tkq0.c;
                                    new tak[]{((tmz)tkq0.l).k()};
                                    tdn tdn0 = ((tmz)tkq0.l).k();
                                    try {
                                        Map map0 = tao0.b().a;
                                        tco tco0 = (tco)map0.get(tcj0);
                                        tcp tcp0 = (tcp)map0.get(tcj1);
                                        tcq tcq0 = (tcq)map0.get(tcj2);
                                        tcr tcr0 = (tcr)map0.get(tcj3);
                                        tcs tcs0 = (tcs)map0.get(tcj4);
                                        if(tco0 == null) {
                                            throw new szz();
                                        }
                                        if(tcp0 == null) {
                                            throw new szz();
                                        }
                                        if(tcq0 == null) {
                                            throw new szz();
                                        }
                                        if(tcr0 == null) {
                                            throw new szz();
                                        }
                                        if(tcs0 == null) {
                                            throw new szz();
                                        }
                                        try {
                                            rSAPrivateKey0 = szn.a(tco0.d, tcp0.d, tcq0.d, tcr0.d, tcs0.d);
                                        }
                                        catch(RuntimeException runtimeException0) {
                                            throw new szy(runtimeException0.getMessage(), runtimeException0);
                                        }
                                    }
                                    catch(szy szy0) {
                                        throw teb.b(szy0);
                                    }
                                    try {
                                        byte[] arr_b14 = rSAPrivateKey0.getModulus().toByteArray();
                                        int v5 = arr_b14[0] == 0 ? arr_b14.length - 1 : arr_b14.length;
                                        byte[] arr_b15 = tak0.f();
                                        byte[] arr_b16 = new byte[v5 - 22];
                                        arr_b16[0] = tas0.c;
                                        arr_b16[1] = 1;
                                        arr_b16[2] = (byte)arr_b15.length;
                                        System.arraycopy(arr_b15, 0, arr_b16, 3, arr_b15.length);
                                        Arrays.fill(arr_b16, arr_b15.length + 3, v5 - 22, -69);
                                        StringBuilder stringBuilder0 = new StringBuilder();
                                        stringBuilder0.append(tdn0.b());
                                        if(stringBuilder0.length() % 2 != 0) {
                                            stringBuilder0.append("0");
                                        }
                                        byte[] arr_b17 = new byte[v5];
                                        arr_b17[0] = 106;
                                        System.arraycopy(arr_b16, 0, arr_b17, 1, v5 - 22);
                                        System.arraycopy(tdo.a(teb.f(new byte[][]{arr_b16, tek.d(stringBuilder0.toString())})), 0, arr_b17, v5 - 21, 20);
                                        arr_b17[v5 - 1] = -68;
                                        szs szs1 = (szs)tdu0;
                                        tbz0 = new tbz(szl.a(arr_b17, rSAPrivateKey0));
                                    }
                                    finally {
                                        tel.b(rSAPrivateKey0);
                                    }
                                    ArrayList arrayList0 = new ArrayList();
                                    arrayList0.add(taz3.m());
                                    arrayList0.add(taz3.l());
                                    arrayList0.add(tbz0);
                                    arrayList0.add(taz3.p());
                                    tak[] arr_tak1 = (tak[])arrayList0.toArray(new tak[arrayList0.size()]);
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                                        for(int v6 = 0; v6 < arr_tak1.length; ++v6) {
                                            arr_tak1[v6].g().c(byteArrayOutputStream1);
                                        }
                                        return new syj(new tak(byteArrayOutputStream1.toByteArray(), tby.c).g().d(), syn.i);
                                    }
                                    catch(syx syx0) {
                                        throw new RuntimeException(syx0);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new syl("Missing ICC RSA Private Key CRT Components", syn.f);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(taz3.m());
        arrayList1.add(taz3.l());
        arrayList1.add(tbe0);
        arrayList1.add(taz3.p());
        tak[] arr_tak2 = (tak[])arrayList1.toArray(new tak[arrayList1.size()]);
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for(int v7 = 0; v7 < arr_tak2.length; ++v7) {
                arr_tak2[v7].g().c(byteArrayOutputStream2);
            }
            return new syj(new tak(byteArrayOutputStream2.toByteArray(), tby.c).g().d(), syn.i);
        }
        catch(syx syx1) {
            throw new RuntimeException(syx1);
        }
    }

    private static final void e(tat tat0, tlb tlb0, byte[][] arr2_b) {
        int v = 0;
        while(v < arr2_b.length) {
            byte[] arr_b = arr2_b[v];
            if(!tat0.a(arr_b)) {
                throw new syl(a.Y(tlb0, tek.b(arr_b), "Missing tag ", " in data for CVN "), syn.k);
            }
            tat0.b(arr_b);
            ++v;
            continue;
        }
    }
}

