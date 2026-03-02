import java.util.ArrayList;
import java.util.List;

public final class akua {
    public static final int a;
    private static final baun b;

    static {
        akua.b = new baun("ProximityAuth", new String[]{"BeaconSeedConverter"});
    }

    public static List a(List list0) {
        Object object1;
        byte[] arr_b;
        List list1 = new ArrayList();
        for(Object object0: list0) {
            alhc alhc0 = (alhc)object0;
            try {
                arr_b = bbmu.f(alhc0.g());
            }
            catch(IllegalArgumentException unused_ex) {
                akua.b.m("Couldn\'t decode v1 beacon seed", new Object[0]);
                object1 = null;
                goto label_24;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)allu.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((allu)hftp0.b_message).b = hfsf0;
            long v = alhc0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((allu)hftp0.b_message).c = v;
            long v1 = alhc0.c();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((allu)hftp0.b_message).d = v1;
            object1 = (allu)hftp0.N_build();
        label_24:
            if(object1 == null) {
                return null;
            }
            list1.add(object1);
        }
        return list1;
    }
}

