import android.accounts.Account;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

public final class egtp implements lqj {
    public final egwu a;

    public egtp(egwu egwu0) {
        this.a = egwu0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        egwu egwu0 = this.a;
        SparseIntArray sparseIntArray0 = egwu0.a;
        sparseIntArray0.delete(4);
        if(hwyp.k()) {
            sparseIntArray0.delete(5);
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: ((List)object0)) {
                egux egux0 = (egux)object1;
                if(egux0.d) {
                    arrayList1.add(egux0);
                }
                else {
                    arrayList0.add(egux0);
                }
            }
            if(egwu0.H(arrayList0)) {
                egwu0.G(arrayList0);
            }
            if(!arrayList1.isEmpty()) {
                sparseIntArray0.put(5, 0x7F0E01C8);  // layout:card_layout_3_gm3
                egwu0.h = arrayList1;
                if(hwyp.l()) {
                    Account account0 = egwu0.i;
                    if(account0 != null) {
                        String s = account0.name;
                        int v = ((List)object0).size();
                        efpr efpr0 = egwu0.e.a;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((giqu)hftv0).c = 25;
                        ((giqu)hftv0).b |= 1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        int v1 = 2;
                        ((giqu)hftv1).e = 2;
                        ((giqu)hftv1).b |= 4;
                        if(v != 1) {
                            v1 = 3;
                        }
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giqu)hftp0.b_message).i = v1 - 1;
                        ((giqu)hftp0.b_message).b |= 0x40;
                        efpr0.j(((giqu)hftp0.N_build()), s);
                    }
                }
            }
        }
        else {
            egwu0.G(((List)object0));
        }
        egwu0.q();
    }
}

