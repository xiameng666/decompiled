import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public final class tnb extends tds {
    public tnb(tdu tdu0) {
        super(tdu0);
    }

    @Override  // tds
    public final syi a(syi syi0) {
        try {
            return new syp(syi0.f());
        }
        catch(syz unused_ex) {
            throw new syl("Wrong Data", syn.l);
        }
    }

    // This method was un-flattened
    @Override  // tds
    public final syj b(tax tax0, syi syi0) {
        byte[] arr_b7;
        int v8;
        byte[] arr_b5;
        BigInteger bigInteger0;
        syv syv1;
        szf szf0;
        ((tkq)tax0).g();
        if(!tax0.i || tax0.j || ((tkq)tax0).m) {
            throw new syl("Conditions of use not satisfied", syn.c);
        }
        if(((syp)syi0).b() != 0 || ((syp)syi0).c() != 0) {
            throw new syl("incorrect P1/P2", syn.g);
        }
        tkn tkn0 = (tkn)((tko)tax0.c).b();
        tbu tbu0 = tkn0.o() ? tkn0.j() : null;
        int v = tbu0 == null ? 0 : tbu0.h();
        if(((syp)syi0).d() != 2 && ((syp)syi0).d() != v + 2) {
            throw new syl("Wrong Length", syn.m);
        }
        tnb.c(((syp)syi0).e());
        if(((syp)syi0).g()[0] != 0xFFFFFF83) {
            throw new syl("Wrong Length", syn.l);
        }
        taz taz0 = tax0.g;
        tkn tkn1 = (tkn)((tko)tax0.c).b();
        tbu tbu1 = tkn1.o() ? tkn1.j() : null;
        byte[] arr_b = ((syp)syi0).i();
        if(arr_b.length != 0) {
            try {
                szf0 = tbu1.j(arr_b);
            }
            catch(syz unused_ex) {
                throw new syl("Wrong Length", syn.l);
            }
            ((tmz)tax0.l).e(szf0);
            tmz tmz0 = (tmz)tax0.l;
            try {
                tmz0.m();
                tmz0.l();
                tmz0.n();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new syl("Wrong Data", syn.l, illegalArgumentException0);
            }
            byte[] arr_b1 = new byte[((syp)syi0).g().length - 2];
            System.arraycopy(((syp)syi0).g(), 2, arr_b1, 0, ((syp)syi0).g().length - 2);
            taz0.d = arr_b1;
        }
        if(tax0.k == null) {
            tax0.a();
        }
        taz taz1 = tax0.g;
        if(taz1.l().h() == 0xFFFF) {
            throw new syl("Conditions of use not satisfied", syn.c);
        }
        byte[] arr_b2 = ((syp)syi0).i();
        tam tam0 = ((tko)tax0.c).b();
        tcj tcj0 = tma.a;
        tma tma0 = (tma)tam0.d(tcj0);
        if(tma0.m() != null && (tma0.i().b[1] & 8) != 0) {
            try {
                try {
                    tli tli0 = ((tma)tam0.e(tcj0)).m();
                    int v1 = 1;
                    int v2 = 1;
                    while(v1 <= tli0.h()) {
                        if(v2 > tli0.h()) {
                            throw new syu();
                        }
                        tca tca0 = tam0.e(new tcj(tli0.a(0), ((byte)v1)));
                        try {
                            tca0.e();
                            byte[] arr_b3 = tca0.e();
                            ArrayList arrayList0 = new ArrayList();
                            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b3);
                            for(syv syv0 = syr.a(byteArrayInputStream0); syv0 != null; syv0 = syr.a(byteArrayInputStream0)) {
                                arrayList0.add(syv0);
                            }
                            syv1 = new syw(((syv[])arrayList0.toArray(new syv[arrayList0.size()]))).a[0];
                        }
                        catch(IOException iOException0) {
                            throw new syl(syn.c, iOException0);
                        }
                        int v3 = syv1.a;
                        int v4 = syv1.b;
                        byte[] arr_b4 = new byte[v4];
                        try {
                            System.arraycopy(arr_b2, v3 - 1, arr_b4, 0, v4);
                            bigInteger0 = new BigInteger(1, arr_b4);
                        }
                        catch(Exception exception0) {
                            throw new syu(exception0);
                        }
                        BigInteger bigInteger1 = syv1.d[0].and(bigInteger0);
                        syq syq0 = syv1.e;
                        BigInteger[] arr_bigInteger = syv1.d;
                        int v5 = 1;
                        while(v5 < arr_bigInteger.length) {
                            int v6 = bigInteger1.compareTo(arr_bigInteger[v5]);
                            int v7 = syq0.ordinal();
                            if(v7 == 0) {
                                arr_b5 = arr_b2;
                                Boolean.valueOf(v6 == 0).getClass();
                                if(v6 == 0) {
                                    v8 = syv1.f;
                                    goto label_97;
                                }
                                else {
                                    ++v5;
                                    arr_b2 = arr_b5;
                                    continue;
                                }
                            }
                            arr_b5 = arr_b2;
                            switch(v7) {
                                case 1: {
                                    if(v6 < 0) {
                                        Boolean.valueOf(true).getClass();
                                        v8 = syv1.f;
                                        goto label_97;
                                    }
                                    else {
                                        Boolean.valueOf(false).getClass();
                                        break;
                                    }
                                    goto label_88;
                                }
                                case 2: {
                                label_88:
                                    if(v6 > 0) {
                                        Boolean.valueOf(true).getClass();
                                        v8 = syv1.f;
                                        goto label_97;
                                    }
                                    else {
                                        Boolean.valueOf(false).getClass();
                                    }
                                    break;
                                }
                                default: {
                                    throw new syu();
                                }
                            }
                            goto label_96;
                        }
                        arr_b5 = arr_b2;
                    label_96:
                        v8 = syv1.g;
                    label_97:
                        Integer integer0 = v8;
                        integer0.getClass();
                        integer0.getClass();
                        if((v8 & 0x80) == 0x80) {
                            v2 = (byte)(v2 + 1);
                            v1 = (byte)(v1 + (v8 & 0x7F));
                            arr_b2 = arr_b5;
                            continue;
                        }
                        goto label_113;
                    }
                    v8 = 0x7F;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0 instanceof syl)) {
                        throw runtimeException0;
                    }
                    throw new syu(runtimeException0);
                }
            }
            catch(syu syu0) {
                throw new syl("Conditions Not Satisfied", syn.c, syu0);
            }
        label_113:
            if(v8 == 0x7F) {
                throw new syl("Conditions Not Satisfied", syn.c);
            }
        }
        else {
            v8 = tma0.j().j();
        }
        ((tkq)tax0).n = v8;
        ((tkn)tam0).c = v8;
        taz1.e = new tku();
        taz1.f = new tla();
        tad tad0 = ((tkq)tax0).a;
        if((tad0 instanceof tac) && ((tac)tad0).b != 1 && ((tac)tad0).c != 1 && ((tmz)tax0.l).l() != null) {
            tam tam1 = ((tko)tax0.c).b();
            tma tma1 = (tma)tam1.d(tma.a);
            byte[] arr_b6 = tky.a;
            if(tma1.a(arr_b6) && (((tkn)tam1).l(tax0).a(0) & 2) == 2) {
                tde tde0 = ((tmz)tax0.l).l();
                tak tak0 = new tak(tma1.b(arr_b6), tky.c);
                if(Long.parseLong(tek.b(tde0.f())) < Long.parseLong(tek.b(tak0.f()))) {
                    tla tla0 = taz1.f;
                    tla0.i(true);
                    tla0.h(tkz.a);
                    goto label_136;
                }
            }
            goto label_133;
        }
        else {
        label_133:
            tla tla1 = taz1.f;
            tla1.i(false);
            tla1.h(tkz.a);
        }
    label_136:
        taz taz2 = tax0.g;
        tkn tkn2 = (tkn)((tko)tax0.c).b();
        tkw tkw0 = new tkw(tkn2.n(tax0).a(24, 2));
        taz2.c(tkw0);
        tkv tkv0 = tkn2.k();
        taz2.c(tkv0);
        tak[] arr_tak = {tkw0, tkv0};
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            for(int v9 = 0; v9 < 2; ++v9) {
                arr_tak[v9].g().c(byteArrayOutputStream0);
            }
            arr_b7 = byteArrayOutputStream0.toByteArray();
        }
        catch(syx syx0) {
            throw new RuntimeException(syx0);
        }
        syj syj0 = new syj(new tak(arr_b7, tby.c).g().d(), syn.i);
        tax0.j = true;
        return syj0;
    }

    public static final void c(int v) {
        if(v != 0 && v != 0x100) {
            throw new syl("Correct Length 00", syn.d);
        }
    }

    @Override
    public final String toString() {
        return this.getClass().getName();
    }
}

