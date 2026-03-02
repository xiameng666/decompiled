import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

public final class eqtt implements Callable {
    public final eqtu a;
    public final eqtv b;
    public final String c;
    public final String d;
    public final int e;

    public eqtt(eqtu eqtu0, eqtv eqtv0, String s, String s1, int v) {
        this.a = eqtu0;
        this.b = eqtv0;
        this.c = s;
        this.d = s1;
        this.e = v;
    }

    @Override
    public final Object call() {
        gjoc gjoc1;
        gjoc gjoc0;
        ghon ghon1;
        ghon ghon0;
        eqtv eqtv0 = this.b;
        Context context0 = eqtv0.b;
        boolean z = false;
        if(gakk.a(context0)) {
            gakj gakj0 = gakj.a(context0);
            if(gakf.a(context0)) {
                String s = this.c;
                List list0 = gakj0.c(s);
                if(list0 != null && !list0.isEmpty()) {
                    eqtv.a.h("Publishing %d logs under %s directory to clearcut.", new Object[]{list0.size(), s});
                    ayud ayud0 = new aytt(context0, eqtv0.c).a();
                    switch(eqtv0.c) {
                        case "ANDROID_AUTH": {
                            if(hygo.d()) {
                                bafs bafs0 = new bafs(eqtv0.b, 1);
                                for(Object object2: list0) {
                                    byte[] arr_b2 = (byte[])object2;
                                    if(arr_b2 == null) {
                                        continue;
                                        try {
                                        label_73:
                                            hftc hftc2 = hftc.a();
                                            ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ghon.a), arr_b2, 0, arr_b2.length, hftc2);
                                            ProtoLiteMessage.P_makeImmutable(hftv2);
                                            ghon0 = (ghon)hftv2;
                                        }
                                        catch(hfur hfur2) {
                                            eqtv.a.n("Failed to parse AndroidAuthEvent from buffered log.", hfur2, new Object[0]);
                                            gakj0.e(s);
                                            goto label_109;
                                        }
                                        bafs0.a(ghon0);
                                        continue;
                                    }
                                    else {
                                        goto label_73;
                                    }
                                    break;
                                }
                            }
                            else {
                                ayvm ayvm1 = fhbe.b(context0, new zay());
                                for(Object object3: list0) {
                                    byte[] arr_b3 = (byte[])object3;
                                    if(arr_b3 == null) {
                                        continue;
                                        try {
                                        label_93:
                                            hftc hftc3 = hftc.a();
                                            ProtoLiteMessage hftv3 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ghon.a), arr_b3, 0, arr_b3.length, hftc3);
                                            ProtoLiteMessage.P_makeImmutable(hftv3);
                                            ghon1 = (ghon)hftv3;
                                        }
                                        catch(hfur hfur3) {
                                            eqtv.a.n("Failed to parse AndroidAuthEvent from buffered log.", hfur3, new Object[0]);
                                            gakj0.e(s);
                                            goto label_109;
                                        }
                                        ayud0.j(((MessageLite)ghon1), ayvm1).d();
                                        continue;
                                    }
                                    else {
                                        goto label_93;
                                    }
                                    break;
                                }
                            }
                            eqtv.a.h("Logs of %s published and cleared.", new Object[]{s});
                            gakj0.e(s);
                            break;
                        }
                        case "SMART_SETUP": {
                            if(hygo.d()) {
                                eqtx eqtx0 = new eqtx(eqtv0.b);
                                for(Object object0: list0) {
                                    byte[] arr_b = (byte[])object0;
                                    if(arr_b == null) {
                                        continue;
                                        try {
                                        label_26:
                                            hftc hftc0 = hftc.a();
                                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gjoc.a), arr_b, 0, arr_b.length, hftc0);
                                            ProtoLiteMessage.P_makeImmutable(hftv0);
                                            gjoc0 = (gjoc)hftv0;
                                        }
                                        catch(hfur hfur0) {
                                            eqtv.a.n("Failed to parse SmartSetupExtension from buffered log.", hfur0, new Object[0]);
                                            gakj0.e(s);
                                            goto label_109;
                                        }
                                        eqtx0.a(gjoc0);
                                        continue;
                                    }
                                    else {
                                        goto label_26;
                                    }
                                    break;
                                }
                            }
                            else {
                                zdi zdi0 = new zdi();
                                ayvm ayvm0 = fhbe.b(eqtv0.b, zdi0);
                                for(Object object1: list0) {
                                    byte[] arr_b1 = (byte[])object1;
                                    if(arr_b1 == null) {
                                        continue;
                                        try {
                                        label_47:
                                            hftc hftc1 = hftc.a();
                                            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gjoc.a), arr_b1, 0, arr_b1.length, hftc1);
                                            ProtoLiteMessage.P_makeImmutable(hftv1);
                                            gjoc1 = (gjoc)hftv1;
                                        }
                                        catch(hfur hfur1) {
                                            eqtv.a.n("Failed to parse SmartSetupExtension from buffered log.", hfur1, new Object[0]);
                                            gakj0.e(s);
                                            goto label_109;
                                        }
                                        ayuc ayuc0 = ayud0.j(((MessageLite)gjoc1), ayvm0);
                                        gjll gjll0 = gjoc1.k == null ? gjll.a : gjoc1.k;
                                        gjle gjle0 = gjll0.c == null ? gjle.a : gjll0.c;
                                        eqtv.a.j(((ProtoLiteMessage)gjle0).toString(), new Object[0]);
                                        erpl.b(ayuc0, gjle0);
                                        ayuc0.d();
                                        continue;
                                    }
                                    else {
                                        goto label_47;
                                    }
                                    break;
                                }
                            }
                            eqtv.a.h("Logs of %s published and cleared.", new Object[]{s});
                            gakj0.e(s);
                            break;
                        }
                        default: {
                            eqtv.a.m(a.a(s, "Logs of ", " have an unknown source %s and were not published and cleared"), new Object[]{eqtv0.c});
                            goto label_109;
                        }
                    }
                    z = true;
                }
                else {
                    eqtv.a.h("No persisted metrics found.", new Object[0]);
                }
            }
            else {
                eqtv.a.h("User did not optin for usage reporting.", new Object[0]);
                gakj0.d();
            }
        }
        else {
            eqtv.a.m("User setup isn\'t completed yet.", new Object[0]);
        }
    label_109:
        int v = this.e;
        String s1 = this.d;
        ((frpe)this.a.b.g.mr()).b(new Object[]{s1, Boolean.valueOf(z)});
        if(z) {
            Object object4 = v;
            eqtu.a.h("Successfully uploaded %d buffered logs to Clearcut for source %s", new Object[]{object4, s1});
            return object4;
        }
        eqtu.a.f("Failed to upload %d buffered logs to Clearcut for source %s", new Object[]{v, s1});
        return (int)-1;
    }
}

