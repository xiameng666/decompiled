import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public final class bnpn implements gfsi {
    public final bnqg a;

    public bnpn(bnqg bnqg0) {
        this.a = bnqg0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        HashSet hashSet0 = new HashSet();
        bnqg bnqg0 = this.a;
        for(Object object1: ((fqyf)object0).b) {
            hashSet0.addAll(((fqxl)object1).l);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: hashSet0) {
            String s = (String)object2;
            try {
                if(bpsq.b(bnqg0.b, s).i()) {
                    continue;
                }
                arrayList0.add(s);
            }
            catch(IOException | acse exception0) {
                a.ae(bnqg.a.i(), "Failed checking for a deleted account, skipping...", exception0);
            }
        }
        if(!arrayList0.isEmpty()) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
            if(!((fqyd)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((fqyd)hftp0))).ensureMutable();
            }
            hfvv hfvv0 = hfvv.a;
            ((fqyf)((fqyd)hftp0).b_message).b = hfvv0;
            for(Object object3: ((fqyf)object0).b) {
                fqxl fqxl0 = (fqxl)object3;
                HashSet hashSet1 = new HashSet(fqxl0.l);
                hashSet1.removeAll(arrayList0);
                if(hashSet1.size() == fqxl0.l.size()) {
                    ((fqyd)hftp0).l(fqxl0);
                }
                else {
                    if(hashSet1.isEmpty()) {
                        continue;
                    }
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxl0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)fqxl0));
                    fqxk fqxk0 = (fqxk)hftp1;
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    ((fqxl)fqxk0.b_message).l = hfvv0;
                    fqxk0.l(hashSet1);
                    if(!((fqyd)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((fqyd)hftp0))).ensureMutable();
                    }
                    fqyf fqyf0 = (fqyf)((fqyd)hftp0).b_message;
                    fqxl fqxl1 = (fqxl)((ProtoLiteBuilder)fqxk0).N_build();
                    fqxl1.getClass();
                    fqyf0.c();
                    fqyf0.b.add(fqxl1);
                }
            }
            return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
        }
        return (fqyf)object0;
    }
}

