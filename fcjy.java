import j..util.Collection.-EL;
import j..util.stream.Collectors;

public final class fcjy implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fezs.a), ((byte[])object0), 0, ((byte[])object0).length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        int v = 1;
        if((((fezs)hftv0).b & 1) != 0) {
            baun baun0 = fckl.a;
            int v1 = fezr.b(((fezs)hftv0).d);
            if(v1 == 0) {
                v1 = 1;
            }
            baun0.m("get_devices error: %s", new Object[]{fezr.a(v1)});
            int v2 = fezr.b(((fezs)hftv0).d);
            if(v2 != 0) {
                v = v2;
            }
            return evrg.c(new fcjq(v));
        }
        Object[] arr_object = {((String)Collection.-EL.stream(((fezs)hftv0).c).map(new fckd()).collect(Collectors.joining(", ")))};
        fckl.a.j("get_devices response: %s", arr_object);
        return evrg.d(((fezs)hftv0).c);
    }
}

