import j..util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public final class duao {
    static final qjd a;
    static final qjd b;
    static final qjd c;
    static final qjd d;
    static final qjd e;
    static final qjd f;
    public static final int g;
    private static final bboh h;

    static {
        duao.h = bboh.b("Pay", bbcu.cZ);
        duao.a = new qjn("issuerAuth");
        duao.b = new qjn("validityInfo");
        duao.c = new qjn("signed");
        duao.d = new qjn("validFrom");
        duao.e = new qjn("validUntil");
        duao.f = new qjn("expectedUpdate");
    }

    public static long a(byte[] arr_b) {
        qjd qjd0 = crah.c(crah.b(qin.c(arr_b))).a(duao.a);
        if(qjd0 == null) {
            throw new qip("issuerAuth item missing");
        }
        qjd qjd1 = crah.c(crah.b(qin.c(crah.a(crah.b(qin.c(duao.c(qjd0)))).a()))).a(duao.b);
        if(qjd1 == null) {
            throw new qip("validity info missing");
        }
        qjd qjd2 = crah.c(qjd1).a(duao.e);
        if(qjd2 != null) {
            return duao.e(crah.d(qjd2).a).getTime();
        }
        throw new qip("valid until item missing");
    }

    public final duan b(byte[] arr_b) {
        qjd qjd0 = crah.c(crah.b(qin.c(arr_b))).a(duao.a);
        if(qjd0 == null) {
            throw new qip("issuerAuth item missing");
        }
        qjd qjd1 = crah.c(crah.b(qin.c(crah.a(crah.b(qin.c(duao.c(qjd0)))).a()))).a(duao.b);
        if(qjd1 == null) {
            throw new qip("validity info missing");
        }
        qjg qjg0 = crah.c(qjd1);
        return new duan(duao.d(qjg0, duao.c), duao.d(qjg0, duao.d), duao.d(qjg0, duao.e), duao.d(qjg0, duao.f));
    }

    public static byte[] c(qjd qjd0) {
        qjf qjf0 = qjd0.c;
        if(!qjf.e.equals(qjf0)) {
            throw new qip(a.O(qjf0, "coseSign1 major type is ", ", but it should be an array; "));
        }
        ArrayList arrayList0 = ((qja)qjd0).a;
        if(arrayList0.size() < 4) {
            throw new qip(a.aA(arrayList0, "coseSign1 array has ", " items, it should have at least 4 items"));
        }
        qjd qjd1 = (qjd)arrayList0.get(2);
        qjf qjf1 = qjd1.c;
        if(qjf.h.equals(qjf1)) {
            qjl qjl0 = ((qjk)qjd1).j;
            if(qjl0 != qjl.a) {
                throw new qip("Unexpected payload special type - expected simple value, but it was " + qjl0);
            }
            qjj qjj0 = ((qji)qjd1).g;
            if(qjj.c.equals(qjj0)) {
                return new byte[0];
            }
            throw new qip(a.O(qjj0, "Enexpected payload simple type - it was ", ", but only SimpleValueType.NULL is allowed"));
        }
        if(qjf.c.equals(qjf1)) {
            return ((qjb)qjd1).a();
        }
        throw new qip("Unexpected payload type " + qjf1);
    }

    private static long d(qjg qjg0, qjd qjd0) {
        qjd qjd1 = qjg0.a(qjd0);
        if(qjd1 != null) {
            try {
                return duao.e(crah.d(qjd1).a).getTime();
            }
            catch(qip | ParseException exception0) {
                a.e(duao.h.j(), "Could not parse key %s", qjd0.c.name(), exception0);
                return -1L;
            }
        }
        return 0L;
    }

    private static Date e(String s) {
        ParseException parseException0 = new ParseException(String.format("Could not parse expiration time: %s", s), 0);
        for(Object object0: hwmp.a.l().s().b) {
            String s1 = (String)object0;
            try {
                SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s1, Locale.US);
                simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                return simpleDateFormat0.parse(s);
            }
            catch(ParseException parseException0) {
            }
        }
        throw parseException0;
    }
}

