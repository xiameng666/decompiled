import java.util.ArrayList;
import java.util.List;

public final class dnpv {
    public static final dxev a(dxeo dxeo0, String s) {
        ibuq.f(dxeo0, "<this>");
        return dnpv.e(dxeo0, s, new dnpu());
    }

    public static final dxev b(dxeo dxeo0, String s) {
        ibuq.f(dxeo0, "<this>");
        return dnpv.e(dxeo0, s, new dnpr());
    }

    public static final dxev c(dxeo dxeo0, String s) {
        ibuq.f(dxeo0, "<this>");
        return dnpv.e(dxeo0, s, new dnpt());
    }

    public static final List d(dxeo dxeo0, String s) {
        ibuq.f(dxeo0, "<this>");
        dnps dnps0 = new dnps();
        hfuo hfuo0 = dxeo0.b;
        ibuq.e(hfuo0, "getPaymentMethodDataList(...)");
        List list0 = new ArrayList();
        for(Object object0: hfuo0) {
            if(ibuq.m(s, dnps0.a(((dxev)object0)))) {
                list0.add(object0);
            }
        }
        return list0;
    }

    private static final dxev e(dxeo dxeo0, String s, bboe bboe0) {
        hfuo hfuo0 = dxeo0.b;
        ibuq.e(hfuo0, "getPaymentMethodDataList(...)");
        for(Object object0: hfuo0) {
            if(ibuq.m(s, bboe0.a(((dxev)object0)))) {
                return (dxev)object0;
            }
        }
        return null;
    }
}

