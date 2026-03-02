import j..util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public final class sra {
    private final byte[] a;
    private final swg b;
    private final srp c;
    private final HashMap d;

    static {
    }

    public sra(byte[] arr_b, swg swg0, srp srp0) {
        this.d = new HashMap();
        this.a = arr_b;
        this.b = swg0;
        this.c = srp0;
    }

    public final src a(UUID uUID0) {
        src src0;
        synchronized(this) {
            srb srb0 = (srb)this.d.remove(uUID0);
            if(srb0 == null) {
                return null;
            }
            src0 = new src(srb0.h);
        }
        return src0;
    }

    public final srf b(UUID uUID0, svs svs0) {
        srf srf2;
        srf srf0;
        srg srg0;
        swj swj0;
        svi svi0;
        byte[] arr_b1;
        sxd sxd2;
        stj stj0;
        synchronized(this) {
            if(!svs0.f) {
                sxd sxd0 = sxd.a(((srb)this.d.get(uUID0)));
                if(!sxd0.d()) {
                    throw new sqz(uUID0);
                }
                srb srb0 = (srb)sxd0.b();
                try {
                    sxd sxd1 = srb0.d;
                    boolean z = srb0.a() instanceof swa;
                    sqx sqx0 = srb0.c;
                    sua sua0 = srb0.f;
                    if(!sqx0.d() && svs0.g()) {
                        sua0.a(sxf.f("Secure message received when not authenticated"));
                    }
                    stz stz0 = sua0.b;
                    if(stz0.b.d()) {
                        svs svs1 = (svs)stz0.b.b();
                        if(svs1.a() != svs0.a() || svs1.b != svs0.b || svs1.c != svs0.c || svs1.d != svs0.d) {
                            sua0.a(new sqy("Last command of the chain expected", srg.a(new byte[]{104, (byte)0x83})));
                        }
                    }
                    if(svs0.b() && (svs0.b != -37 && svs0.b != 65)) {
                        throw new sqy("Command chaining not supported", srg.a(new byte[]{104, (byte)0x84}));
                    }
                    stz0.a.write(svs0.i(), 0, svs0.i().length);
                    boolean z1 = svs0.g();
                    byte[] arr_b = svs0.h();
                    stz0.b = new sxd(new svs(stn.a(stn.d(stn.d(stn.d(svs0.a, 2, z1), 3, z1), 4, svs0.b())), svs0.b, svs0.c, svs0.d, new byte[0], (z1 ? 0 : svs0.e), arr_b, false));
                    if(svs0.b()) {
                        svi0 = new sty();
                    }
                    else {
                        try {
                            if(((svs)stz0.b.b()).g()) {
                                svs svs2 = (svs)stz0.b.b();
                                byte[] arr_b2 = stz0.a.toByteArray();
                                sxd sxd3 = sqx0.h;
                                if(!sxd3.d()) {
                                    throw sxf.f("Secure message received but authentication is not complete");
                                }
                                stl stl0 = (stl)sxd3.b();
                                sqx0.c = true;
                                try {
                                    stj0 = stj.c(arr_b2);
                                }
                                catch(Exception unused_ex) {
                                    throw sxf.d("Secure messaging objects incorrect");
                                }
                                HashSet hashSet0 = new HashSet();
                                List list0 = stj0.a;
                                for(Object object0: DesugarCollections.unmodifiableList(list0)) {
                                    if(!hashSet0.add(((stk)object0).a)) {
                                        throw sxf.d("Duplicate secure messaging objects");
                                    }
                                }
                                sti sti0 = sti.c;
                                stk stk0 = stj0.a(sti0);
                                stk stk1 = stj0.a(sti.a);
                                if(stk0 == null) {
                                    throw sxf.e("MAC tag not present");
                                }
                                if(stk1 == null) {
                                    throw sxf.e("CRYPTOGRAM tag not present");
                                }
                                byte[] arr_b3 = Arrays.copyOfRange(svs2.h(), 0, 4);
                                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                                for(Object object1: list0) {
                                    if(((stk)object1).a != sti0) {
                                        stq.a(((stk)object1).b(), byteArrayOutputStream0);
                                    }
                                    sxd1 = sxd1;
                                }
                                sxd2 = sxd1;
                                byte[] arr_b4 = byteArrayOutputStream0.toByteArray();
                                stl.b(stl0.d(2), stl0.d);
                                stl0.e = 2;
                                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                                stq.a(stl0.d, byteArrayOutputStream1);
                                stq.a(stl0.c(arr_b3), byteArrayOutputStream1);
                                stq.a(stl0.c(arr_b4), byteArrayOutputStream1);
                                byte[] arr_b5 = byteArrayOutputStream1.toByteArray();
                                byte[] arr_b6 = stf.b(stl0.b.e(arr_b5));
                                if(!sto.c(stk0.a(), arr_b6)) {
                                    throw sxf.d("Command MAC mismatch");
                                }
                                try {
                                    byte[] arr_b7 = stk1.a();
                                    arr_b1 = stl0.a.g(arr_b7, stl0.c, true);
                                }
                                catch(stt stt0) {
                                    throw sxf.d(stt0.getMessage());
                                }
                            }
                            else {
                                sxd2 = sxd1;
                                arr_b1 = stz0.a.toByteArray();
                            }
                        }
                        finally {
                            stz0.a();
                        }
                        for(Object object2: sua.a) {
                            svj svj0 = (svj)object2;
                            if(!svj0.c(svs0)) {
                                continue;
                            }
                            if(sxd2 == null && !(svj0 instanceof sve)) {
                                sua0.a(new sqy("Application not selected", srg.e));
                            }
                            if(svs0.b != -92 && sqx0.i != sqw.a && svs0.b != 0xFFFFFF87) {
                                sqx0.c();
                                sua0.a(sxf.a("Wrong command received in ongoing authentication"));
                            }
                            if(z && !svj0.b()) {
                                sua0.a(sxf.a("Command cannot be executed without GDF"));
                            }
                            if(!svs0.g() && svj0.f() && (sqx0.c || sqx0.d.d() && stn.e(((sqv)sqx0.d.b()).b.a[0], ((byte)7)))) {
                                srb0.e();
                                srb0.i = true;
                                sua0.a(sxf.f("Insecure message sent in a secure session"));
                            }
                            svi0 = svj0.a(svs0, arr_b1);
                            goto label_105;
                        }
                        sua0.a(new sqy("Unsupported command: " + str.b(svs0.h()), srg.p));
                        svi0 = null;
                    }
                label_105:
                    swj0 = svi0.a(srb0);
                }
                catch(sqy sqy0) {
                    swj0 = new swl(swv.b, sqy0.a);
                }
                catch(Exception unused_ex) {
                    swj0 = new swl(swv.b, srg.s);
                }
                try {
                    boolean z2 = svs0.g();
                    int v2 = svs0.e;
                    swn swn0 = srb0.g;
                    if(!(swj0 instanceof swi)) {
                        swk swk0 = swj0.a(swn0.a, z2);
                        byte[] arr_b8 = stm.a(swk0.b);
                        swn0.b.b = swk0.a;
                        swn0.b.a = new ByteArrayInputStream(arr_b8);
                    }
                    swm swm0 = swn0.b;
                    if(v2 != 0) {
                    label_123:
                        int v3 = Math.min(swm0.a.available(), Math.min(0xF0, v2));
                        byte[] arr_b9 = new byte[v3];
                        swm0.a.read(arr_b9, 0, v3);
                        if(swm0.a.available() > 0) {
                            int v4 = (byte)Math.min(swm0.a.available(), 0xF0);
                            srg0 = new srg(srg.c.x, srg.c.y, ((byte)v4));
                        }
                        else {
                            srg0 = swm0.b;
                        }
                        srf0 = new srf(srg0, arr_b9);
                        goto label_135;
                    label_133:
                        swm0.a.reset();
                        srf0 = new srf(swm0.b, swv.b);
                    }
                    else if(swm0.a.available() <= 0) {
                        v2 = 0;
                        goto label_123;
                    }
                    else {
                        goto label_133;
                    }
                label_135:
                    boolean z3 = srf0.a == srg.j || srf0.a == srg.i;
                    if(!srb0.i) {
                        if(z3) {
                            srb0.e();
                            srb0.c.c();
                            srb0.i = false;
                        }
                    }
                    else if(z3) {
                        srb0.e();
                        srb0.c.c();
                        srb0.i = false;
                        return srf0;
                    }
                    else {
                        srb0.c.c();
                        srb0.i = false;
                        return srf0;
                    }
                }
                catch(Exception unused_ex) {
                    return new srf(srg.s, swv.b);
                }
                return srf0;
            }
            srf2 = new srf(srg.t, swv.b);
        }
        return srf2;
    }

    public final UUID c() {
        UUID uUID0;
        synchronized(this) {
            uUID0 = UUID.randomUUID();
            srb srb0 = new srb(this.a, this.b, this.c);
            this.d.put(uUID0, srb0);
        }
        return uUID0;
    }
}

