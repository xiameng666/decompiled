import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.util.List;
import java.util.Map;

final class ebwd extends ibsl implements ibtw {
    int a;
    final ebwf b;
    final List c;

    public ebwd(ebwf ebwf0, List list0, ibrl ibrl0) {
        this.b = ebwf0;
        this.c = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebwd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebwd(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        Boolean boolean0 = Boolean.valueOf(true);
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.a(this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyjo.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((dyjo)hftp0.b_message).b);
        ibuq.e(list0, "getSuccessCardIdsList(...)");
        new hfxu(list0);
        List list1 = (List)((Map)object0).get(boolean0);
        if(list1 == null) {
            list1 = ibps.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyjo dyjo0 = (dyjo)hftp0.b_message;
        hfuo hfuo0 = dyjo0.b;
        if(!hfuo0.c()) {
            dyjo0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list1, dyjo0.b);
        List list2 = DesugarCollections.unmodifiableList(((dyjo)hftp0.b_message).c);
        ibuq.e(list2, "getFailureCardIdsList(...)");
        new hfxu(list2);
        List list3 = (List)((Map)object0).get(Boolean.valueOf(false));
        if(list3 == null) {
            list3 = ibps.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyjo dyjo1 = (dyjo)hftp0.b_message;
        hfuo hfuo1 = dyjo1.c;
        if(!hfuo1.c()) {
            dyjo1.c = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(list3, dyjo1.c);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyjo)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyjo)hftv0).getClass();
        dyfy0.c = (dyjo)hftv0;
        dyfy0.b = 20;
        dyfy dyfy1 = dyga0.a();
        List list4 = (List)((Map)object0).get(boolean0);
        if(list4 != null) {
            ebwf ebwf0 = this.b;
            for(Object object2: list4) {
                String s = (String)object2;
                ebst ebst0 = ebwf0.e;
                if(ebst0 == null) {
                    ibuq.j("emoneyOperationUtils");
                    ebst0 = null;
                }
                ebst0.a(ebwf0.f, 0x3D7A4);
            }
        }
        ((ggtj)ebwf.a.h()).B("Successfully parked Octopus cards: %s", ((Map)object0).get(boolean0));
        ((ggtj)ebwf.a.h()).B("Unable to park Octopus cards: %s", ((Map)object0).get(Boolean.valueOf(false)));
        byte[] arr_b = dyfy1.toBytesArray();
        this.b.c.b(Status.b, arr_b);
        return ibom.a;
    }
}

