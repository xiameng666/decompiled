import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class ifpn {
    public static idzh a(ienr ienr0) {
        byte[] arr_b21;
        if((ienr0 instanceof iftf)) {
            return new idzh(ifpo.y(((iftf)ienr0).b), iftq.j(((iftf)ienr0).c));
        }
        if((ienr0 instanceof ifny)) {
            ifhs ifhs0 = new ifhs(ifpo.z(((ifny)ienr0).b));
            return new idzh(new idyk(ifhr.d, ifhs0), ((ifny)ienr0).a());
        }
        if((ienr0 instanceof iflq)) {
            return new idzh(new idyk(ifhr.e), ((iflq)ienr0).a());
        }
        if((ienr0 instanceof ifjx)) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            ifjj.d(1, byteArrayOutputStream0);
            ifjj.a(((ifjx)ienr0), byteArrayOutputStream0);
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            return new idzh(new idyk(idvi.am), arr_b);
        }
        if((ienr0 instanceof ifjn)) {
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            ifjj.d(((ifjn)ienr0).b, byteArrayOutputStream1);
            ifjj.a(((ifjn)ienr0).c, byteArrayOutputStream1);
            byte[] arr_b1 = byteArrayOutputStream1.toByteArray();
            return new idzh(new idyk(idvi.am), arr_b1);
        }
        if((ienr0 instanceof ifnq)) {
            byte[] arr_b2 = ((ifnq)ienr0).a();
            return new idzh(new idyk(ifpo.r(((ifnq)ienr0).b)), arr_b2);
        }
        if((ienr0 instanceof ifoi)) {
            byte[] arr_b3 = ((ifoi)ienr0).a();
            return new idzh(new idyk(ifpo.u(((ifoi)ienr0).b)), arr_b3);
        }
        if((ienr0 instanceof ifim)) {
            byte[] arr_b4 = ((ifim)ienr0).a();
            return new idzh(new idyk(ifpo.j(((ifim)ienr0).b)), arr_b4);
        }
        if((ienr0 instanceof ifqw)) {
            byte[] arr_b5 = ifqy.g(((ifqw)ienr0).e);
            byte[] arr_b6 = ifqy.g(((ifqw)ienr0).d);
            byte[] arr_b7 = ((ifqw)ienr0).a();
            if(arr_b7.length > arr_b5.length + arr_b6.length) {
                return new idzh(new idyk(ieth.a), new idsd(arr_b7));
            }
            idyk idyk0 = ifpo.A(((ifqw)ienr0).b);
            ifhv ifhv0 = new ifhv(((ifqw)ienr0).c.c, idyk0);
            return new idzh(new idyk(ifhr.f, ifhv0), new ifia(arr_b5, arr_b6));
        }
        if((ienr0 instanceof ifqo)) {
            byte[] arr_b8 = ((ifqo)ienr0).a();
            byte[] arr_b9 = ((ifqo)ienr0).b();
            byte[] arr_b10 = ((ifqo)ienr0).c();
            if(arr_b10.length > arr_b8.length + arr_b9.length) {
                return new idzh(new idyk(ieth.b), new idsd(arr_b10));
            }
            idyk idyk1 = ifpo.A(((ifqo)ienr0).b);
            ifhw ifhw0 = new ifhw(((ifqo)ienr0).c.d, ((ifqo)ienr0).c.e, idyk1);
            return new idzh(new idyk(ifhr.g, ifhw0), new ifhy(((ifqo)ienr0).a(), ((ifqo)ienr0).b()));
        }
        if((ienr0 instanceof iftd)) {
            idyk idyk2 = ifpo.x(((iftd)ienr0).b);
            ifhq ifhq0 = new ifhq(((iftd)ienr0).c, ((iftd)ienr0).d, ((iftd)ienr0).e, idyk2);
            return new idzh(new idyk(ifhr.c), ifhq0);
        }
        if((ienr0 instanceof ifje)) {
            byte[] arr_b11 = iftq.j(((ifje)ienr0).c);
            return new idzh(new idyk(ifpo.g(((ifje)ienr0).b)), new idsd(arr_b11));
        }
        if((ienr0 instanceof ifmt)) {
            byte[] arr_b12 = iftq.j(((ifmt)ienr0).c);
            return new idzh(new idyk(ifpo.q(((ifmt)ienr0).b)), new idsg(new idsd(arr_b12)));
        }
        if((ienr0 instanceof ifmg)) {
            byte[] arr_b13 = ((ifmg)ienr0).a();
            return new idzh(new idyk(ifpo.o(((ifmg)ienr0).b)), new idsd(arr_b13));
        }
        if((ienr0 instanceof iflu)) {
            byte[] arr_b14 = ((iflu)ienr0).a();
            return new idzh(new idyk(ifpo.m(((iflu)ienr0).b)), arr_b14);
        }
        if((ienr0 instanceof ifja)) {
            byte[] arr_b15 = iftq.j(((ifja)ienr0).c);
            idyk idyk3 = new idyk(ifpo.f(((ifja)ienr0).b));
            byte[] arr_b16 = new byte[arr_b15.length + 1];
            arr_b16[0] = (byte)((ifja)ienr0).b.d;
            System.arraycopy(arr_b15, 0, arr_b16, 1, arr_b15.length);
            return new idzh(idyk3, arr_b16);
        }
        if((ienr0 instanceof iflj)) {
            return new idzh(new idyk(ifpo.l(((iflj)ienr0).b)), ((iflj)ienr0).a());
        }
        if((ienr0 instanceof ifly)) {
            byte[] arr_b17 = new byte[((ifly)ienr0).b.g];
            System.arraycopy(((ifly)ienr0).c, 0, arr_b17, 0, ((ifly)ienr0).c.length);
            System.arraycopy(((ifly)ienr0).d, 0, arr_b17, ((ifly)ienr0).c.length, ((ifly)ienr0).d.length);
            return new idzh(new idyk(ifpo.n(((ifly)ienr0).b)), new idsd(arr_b17));
        }
        if((ienr0 instanceof ifmc)) {
            byte[] arr_b18 = iftq.j(((ifmc)ienr0).c);
            return new idzh(new idyk(ifpo.t(((ifmc)ienr0).b)), new idsd(arr_b18));
        }
        if((ienr0 instanceof ifiv)) {
            return new idzh(new idyk(ifpo.e(((ifiv)ienr0).b)), ((ifiv)ienr0).a());
        }
        if((ienr0 instanceof ifkp)) {
            return new idzh(new idyk(ifpo.k(((ifkp)ienr0).b)), ((ifkp)ienr0).a());
        }
        if((ienr0 instanceof ifig)) {
            byte[] arr_b19 = ((ifig)ienr0).a();
            return new idzh(new idyk(ifpo.d(((ifig)ienr0).b)), arr_b19);
        }
        if((ienr0 instanceof ifji)) {
            byte[] arr_b20 = ((ifji)ienr0).a();
            return new idzh(new idyk(ifpo.h(((ifji)ienr0).b)), arr_b20);
        }
        if((ienr0 instanceof ifmn)) {
            ifml ifml0 = ((ifmn)ienr0).b;
            if(ifml0.m != 1) {
                arr_b21 = iftq.m(iftq.m(iftq.m(iftq.m(iftq.m(((ifmn)ienr0).d, ifmo.d(((ifmn)ienr0).e, false)), ifmo.d(((ifmn)ienr0).f, true)), ifmo.d(((ifmn)ienr0).g, false)), ifmo.d(((ifmn)ienr0).h, true)), ifmo.d(((ifmn)ienr0).i, true));
                return new idzh(new idyk(ifpo.p(ifml0)), new idsd(arr_b21));
            }
            arr_b21 = ifmo.d(((ifmn)ienr0).c, true);
            return new idzh(new idyk(ifpo.p(ifml0)), new idsd(arr_b21));
        }
        if((ienr0 instanceof ifkh)) {
            byte[] arr_b22 = ((ifkh)ienr0).a();
            return new idzh(new idyk(ifpo.i(((ifkh)ienr0).b)), new idsd(arr_b22));
        }
        if(!(ienr0 instanceof ifnv)) {
            throw new IOException("key parameters not recognized");
        }
        byte[] arr_b23 = ((ifnv)ienr0).a();
        return new idzh(new idyk(ifpo.s(((ifnv)ienr0).b)), new idsd(arr_b23));
    }
}

