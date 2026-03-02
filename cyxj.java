import android.content.Context;
import j..util.DesugarCollections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class cyxj {
    private final HashSet a;

    public cyxj() {
        this.a = new HashSet();
    }

    public final cyxs a(Context context0, cyxp cyxp0, cyxs cyxs0) {
        boolean z1;
        cyxd cyxd0;
        int v = cuul.a.nextInt();
        String s = cwfb.J.b(v);
        cust cust0 = cwfa.a(cwfa.c(s, cxlb.p), s);
        cyxs cyxs1 = null;
        if(cyxs0 == null) {
            ((ggtj)cust0.g().ar(8290)).x("SwitchCandidateUpdater: local node is null");
            return null;
        }
        Iterator iterator0 = DesugarCollections.unmodifiableList(((cyxs)cyxp0.b_message).h).iterator();
    label_8:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            cyxd0 = (cyxd)object0;
            if(!cyxd0.f.contains(Integer.valueOf(4360))) {
                continue;
            }
            if(hvpp.aa()) {
                if(!((ProtoLiteMessage)cyxs0).equals(cyxs.b) && !cyxs0.h.isEmpty()) {
                    for(Object object1: cyxs0.h) {
                        cyxd cyxd1 = (cyxd)object1;
                        if(cyxd1.i || !cyvx.h(cyxd0, cyxd1)) {
                            continue;
                        }
                        cyxd0 = cyxd1;
                        goto label_22;
                    }
                    cyxd0 = null;
                label_22:
                    ggtj ggtj0 = (ggtj)cyjh.a.d().ar(0x204D);
                    cyxd cyxd2 = cyxd0 == null ? "Null" : cyxd0;
                    ggtj0.B("TriangleNodeUtils: getLocalMatchedPeripheral with %s", cyxd2);
                }
                else {
                    ((ggtj)cyjh.a.g().ar(0x204C)).x("TriangleNodeUtils: getLocalMatchedPeripheral no local node or no peripheral into local node");
                    cyxd0 = null;
                }
            }
            else if(!this.a.contains(cyxd0.c)) {
                cyxd0 = null;
            }
            if(cyxd0 == null || !cyvx.f(context0, cyxd0)) {
                continue;
            }
            if(hvpp.br()) {
                Iterator iterator2 = cyxs0.h.iterator();
                do {
                    if(!iterator2.hasNext()) {
                        continue label_8;
                    }
                    Object object2 = iterator2.next();
                    cyxd cyxd3 = (cyxd)object2;
                }
                while((cyxd3.b & 1) == 0 || !cyxd3.c.equals(cyxd0.c));
                if(cyvx.i(context0, cyxd3)) {
                    goto label_42;
                }
                continue;
            }
        label_42:
            ((ggtj)cust0.d().ar(0x2061)).B("SwitchCandidateUpdater: update local calling candidate to %s into remote node", cyus.i(cyxd0));
            if(!cyxp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)cyxp0).ensureMutable();
            }
            ((cyxs)cyxp0.b_message).n = cyxd0;
            ((cyxs)cyxp0.b_message).c |= 0x100;
            goto label_49;
        }
        cyxd0 = null;
    label_49:
        if(cyxd0 == null) {
            if(!cyxp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)cyxp0).ensureMutable();
            }
            ((cyxs)cyxp0.b_message).n = null;
            ((cyxs)cyxp0.b_message).c &= 0xFFFFFEFF;
        }
        String s1 = ((cyxs)cyxp0.b_message).d;
        ggdy ggdy0 = new ggdy();
        ProtoLiteMessage hftv0 = null;
        ProtoLiteMessage hftv1 = null;
        for(Object object3: cyxs0.h) {
            cyxd cyxd4 = (cyxd)object3;
            boolean z = false;
            if(cyxd0 != null) {
                if(!hvpp.aa()) {
                    if(cyxd4.c.equals(cyxd0.c)) {
                        z1 = true;
                        goto label_72;
                    }
                }
                else if(cyvx.h(cyxd0, cyxd4)) {
                    z1 = true;
                    goto label_72;
                }
            }
            z1 = false;
        label_72:
            if((cyxd4.b & 0x100) != 0 && cyxd4.l.equals(s1)) {
                z = true;
            }
            if(z1) {
                if(z) {
                    z = true;
                }
                else {
                    hftv0 = cyxd4;
                    continue;
                }
            }
            if(!z1 && z) {
                hftv1 = cyxd4;
            }
            else {
                ggdy0.i(cyxd4);
            }
        }
        if(hftv0 != null || hftv1 != null) {
            if(hftv0 != null) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)hftv0.jf(5, null);
                hftp0.X(hftv0);
                if(!((cyxc)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((cyxc)hftp0))).ensureMutable();
                }
                cyxd cyxd5 = (cyxd)((cyxc)hftp0).b_message;
                s1.getClass();
                cyxd5.b |= 0x100;
                cyxd5.l = s1;
                ggdy0.i(((cyxd)((ProtoLiteBuilder)(((cyxc)hftp0))).N_build()));
            }
            if(hftv1 != null) {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)hftv1.jf(5, null);
                hftp1.X(hftv1);
                if(!((cyxc)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((cyxc)hftp1))).ensureMutable();
                }
                cyxd cyxd6 = (cyxd)((cyxc)hftp1).b_message;
                cyxd6.b &= 0xFFFFFEFF;
                cyxd6.l = cyxd.a.l;
                ggdy0.i(((cyxd)((ProtoLiteBuilder)(((cyxc)hftp1))).N_build()));
            }
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)cyxs0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)cyxs0));
            if(!((cyxp)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((cyxp)hftp2))).ensureMutable();
            }
            ((cyxs)((cyxp)hftp2).b_message).h = hfvv.a;
            ((cyxp)hftp2).a(ggdy0.h());
            cyxs1 = (cyxs)((ProtoLiteBuilder)(((cyxp)hftp2))).N_build();
        }
        ((ggtj)cust0.a(cyjh.a()).ar(0x2060)).B("SwitchCandidateUpdater: updated node %s", (cyxs1 == null ? "na" : cyus.j(cyxs1)));
        return cyxs1;
    }

    public final void b(cyxs cyxs0, Collection collection0) {
        if(cyxs0 == null) {
            ((ggtj)cyjh.a.g().ar(0x205F)).x("SwitchCandidateUpdater: skip updating local bonded headset since the local node is null");
            return;
        }
        this.a.clear();
        HashSet hashSet0 = cyvx.d(cyxs0, collection0);
        this.a.addAll(hashSet0);
    }
}

