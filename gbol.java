import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

public final class gbol {
    public static final gbon a(fbch fbch0, gatj gatj0) {
        switch((fbca.b(fbch0.e) == null ? fbca.a : fbca.b(fbch0.e)).ordinal()) {
            case 1: {
                gaxl.a();
                hzly hzly0 = hzly.a;
                if(!hzly0.b().a() && gatj0.a.b().b == 6) {
                    hcke hcke0 = gatj0.a.b();
                    hcjz hcjz0 = hcke0.b == 6 ? ((hcjz)hcke0.c) : hcjz.a;
                    if((hcjy.b(hcjz0.c) == null ? hcjy.a : hcjy.b(hcjz0.c)).compareTo(hcjy.c) >= 0) {
                        return gbny.a;
                    }
                }
                gaxl.a();
                return hzly0.b().b() ? gbny.a : gbnx.a;
            }
            case 5: {
                return gboo.a;
            }
            default: {
                fbca fbca0 = fbca.b(fbch0.e) == null ? fbca.a : fbca.b(fbch0.e);
                String s = String.format(Locale.US, "Unknown static page type: %d.", Arrays.copyOf(new Object[]{fbca0}, 1));
                ibuq.e(s, "format(...)");
                throw new IllegalArgumentException(s);
            }
        }
    }

    public static final byte[] b(byte[] arr_b, hddo hddo0, hdcu hdcu0, gatj gatj0) {
        ibuq.f(hddo0, "finishAction");
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fbch.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((fbch)hftv0), "parseFrom(...)");
        gbon gbon0 = gbol.a(((fbch)hftv0), gatj0);
        if(hdcu0 != null) {
            hfuo hfuo0 = hdcu0.c;
            ibuq.e(hfuo0, "getDataValueList(...)");
            ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
            for(Object object0: hfuo0) {
                arrayList0.add(new ibns(((long)((hcos)object0).c), ((hcos)object0)));
            }
            Map map0 = ibpz.p(arrayList0);
            return map0 == null ? gbon0.b(new gboe(ibpt.a), hddo0) : gbon0.b(new gboe(map0), hddo0);
        }
        return gbon0.b(new gboe(ibpt.a), hddo0);
    }
}

