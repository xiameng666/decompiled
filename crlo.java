import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import j..util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

final class crlo implements Runnable {
    final EventParcel a;
    final AppMetadata b;
    final crih c;

    public crlo(crih crih0, EventParcel eventParcel0, AppMetadata appMetadata0) {
        this.a = eventParcel0;
        this.b = appMetadata0;
        Objects.requireNonNull(crih0);
        this.c = crih0;
        super();
    }

    @Override
    public final void run() {
        Iterator iterator0;
        vzp vzp0;
        vzo vzo0;
        String s1;
        EventParcel eventParcel1;
        EventParcel eventParcel0 = this.a;
        if("_cmp".equals(eventParcel0.a)) {
            EventParams eventParams0 = eventParcel0.b;
            if(eventParams0 != null && eventParams0.a.size() != 0) {
                String s = eventParams0.d("_cis");
                if("referrer broadcast".equals(s) || "referrer API".equals(s)) {
                    this.c.a.aJ().i.b("Event has been filtered ", eventParcel0.toString());
                    eventParcel1 = new EventParcel("_cmpx", eventParams0, eventParcel0.c, eventParcel0.d, eventParcel0.e);
                }
                else {
                    eventParcel1 = eventParcel0;
                }
            }
            else {
                eventParcel1 = eventParcel0;
            }
        }
        else {
            eventParcel1 = eventParcel0;
        }
        crih crih0 = this.c;
        AppMetadata appMetadata0 = this.b;
        crqq crqq0 = crih0.a;
        crkk crkk0 = crqq0.v();
        vys vys0 = TextUtils.isEmpty(appMetadata0.a) ? null : ((vys)crkk0.g.d(appMetadata0.a));
        if(vys0 != null) {
            try {
                Map map0 = crqq0.z().s(eventParcel1.b.a(), true);
                s1 = eventParcel1.a;
                vzo0 = new vzo((crmc.a(s1) == null ? s1 : crmc.a(s1)), eventParcel1.d, map0);
            }
            catch(vyt unused_ex) {
                crih0.a.aJ().c.c("EES error. appId, eventName", appMetadata0.b, eventParcel1.a);
                crih0.a.aJ().k.b("EES was not applied to event", eventParcel1.a);
                crih0.s(eventParcel1, appMetadata0);
                return;
            }
            try {
                vzp0 = vys0.c;
                vzp0.a = vzo0;
                vzp0.b = vzp0.a.a();
                List list0 = vzp0.c;
                list0.clear();
                vys0.a.c.g("runtime.counter", new vzv(((double)0.0)));
                vzn vzn0 = vys0.d;
                vyw vyw0 = vys0.b.a();
                vzb vzb0 = new vzb(vzp0);
                TreeMap treeMap0 = vzn0.a;
                iterator0 = treeMap0.keySet().iterator();
                while(true) {
                label_34:
                    if(iterator0.hasNext()) {
                        goto label_56;
                    }
                    TreeMap treeMap1 = vzn0.b;
                    for(Object object0: treeMap1.keySet()) {
                        vzn.a(vyw0, ((wac)treeMap1.get(((Integer)object0))), vzb0);
                    }
                    if(!vys0.c()) {
                        break;
                    }
                    goto label_43;
                }
            }
            catch(Throwable throwable0) {
                throw new vyt(throwable0);
            }
            if(vys0.b()) {
            label_43:
                if(vys0.c()) {
                    crqq0.aJ().k.b("EES edited event", s1);
                    crih0.s(crqq0.z().j(vzp0.b), appMetadata0);
                }
                else {
                    crih0.s(eventParcel1, appMetadata0);
                }
                if(vys0.b()) {
                    for(Object object1: list0) {
                        crqq0.aJ().k.b("EES logging created event", ((vzo)object1).a);
                        crih0.s(crqq0.z().j(((vzo)object1)), appMetadata0);
                    }
                }
                return;
                try {
                label_56:
                    Object object2 = iterator0.next();
                    vzo vzo1 = vzp0.b.a();
                    switch(vzn.a(vyw0, ((wac)treeMap0.get(((Integer)object2))), vzb0)) {
                        case -1: 
                        case 2: {
                            vzp0.b = vzo1;
                            goto label_34;
                        }
                        default: {
                            goto label_34;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    try {
                        throw new vyt(throwable0);
                    }
                    catch(vyt unused_ex) {
                    }
                }
                crih0.a.aJ().c.c("EES error. appId, eventName", appMetadata0.b, eventParcel1.a);
            }
            crih0.a.aJ().k.b("EES was not applied to event", eventParcel1.a);
            crih0.s(eventParcel1, appMetadata0);
            return;
        }
        crih0.a.aJ().k.b("EES not loaded for", appMetadata0.a);
        crih0.s(eventParcel1, appMetadata0);
    }
}

