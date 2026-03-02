import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2.RouteCallback;
import android.media.MediaRouter2;
import android.media.RouteListingPreference.Item;
import android.media.RouteListingPreference;
import android.os.Build.VERSION;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionResult;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class auef extends MediaRouter2.RouteCallback {
    final String a;
    final aueg b;

    public auef(String s, aueg aueg0) {
        this.a = s;
        this.b = aueg0;
        super();
    }

    @Override  // android.media.MediaRouter2$RouteCallback
    public final void onRoutesUpdated(List list0) {
        MediaRoute2Info mediaRoute2Info1;
        Object object4;
        atxp atxp0;
        Set set0;
        ibuq.f(list0, "routes");
        bboh bboh0 = aueg.b;
        ggtj ggtj0 = (ggtj)bboh0.h();
        String s = this.a;
        ggtj0.B("onRoutesUpdated for %s", s);
        if(list0.isEmpty()) {
            return;
        }
        aueg aueg0 = this.b;
        Context context0 = AppContextProvider.a();
        ibuq.c(context0);
        aufc aufc0 = aueg.k(context0, s);
        if(Build.VERSION.SDK_INT >= 35) {
            MediaRouter2 mediaRouter20 = aufc0.a;
            if(mediaRouter20 == null) {
                set0 = ibpu.a;
            }
            else {
                RouteListingPreference routeListingPreference0 = mediaRouter20.getRouteListingPreference();
                if(routeListingPreference0 == null) {
                    set0 = ibpu.a;
                }
                else {
                    List list1 = routeListingPreference0.getItems();
                    if(list1 == null) {
                        set0 = ibpu.a;
                    }
                    else {
                        ArrayList arrayList0 = new ArrayList(ibpo.q(list1, 10));
                        for(Object object0: list1) {
                            arrayList0.add(((RouteListingPreference.Item)object0).getRouteId());
                        }
                        set0 = ibpo.ay(arrayList0);
                        if(set0 == null) {
                            set0 = ibpu.a;
                        }
                    }
                }
            }
        }
        else {
            set0 = ibpu.a;
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: list0) {
            MediaRoute2Info mediaRoute2Info0 = (MediaRoute2Info)object1;
            if(!mediaRoute2Info0.isSystemRoute() && (set0.isEmpty() || set0.contains(mediaRoute2Info0.getId()))) {
                arrayList1.add(object1);
            }
        }
        Map map0 = aueh.d(s);
        if(map0 != null && !map0.isEmpty()) {
            ggtj ggtj1 = (ggtj)bboh0.h();
            ArrayList arrayList2 = new ArrayList(map0.size());
            for(Object object2: map0.entrySet()) {
                arrayList2.add(new ibns(((MediaRoute2Info)((Map.Entry)object2).getValue()).getName(), ((MediaRoute2Info)((Map.Entry)object2).getValue()).getConnectionState()));
            }
            ggtj1.B("Cached: %s", arrayList2);
            ggtj ggtj2 = (ggtj)bboh0.h();
            ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList1, 10));
            for(Object object3: arrayList1) {
                arrayList3.add(new ibns(((MediaRoute2Info)object3).getName(), ((MediaRoute2Info)object3).getConnectionState()));
            }
            ggtj2.B("New: %s", arrayList3);
            Iterator iterator4 = arrayList1.iterator();
            do {
                do {
                    atxp0 = null;
                    if(!iterator4.hasNext()) {
                        goto label_70;
                    }
                    object4 = iterator4.next();
                    mediaRoute2Info1 = (MediaRoute2Info)object4;
                }
                while(mediaRoute2Info1.getConnectionState() != 2);
                MediaRoute2Info mediaRoute2Info2 = (MediaRoute2Info)map0.get(mediaRoute2Info1.getId());
            }
            while(mediaRoute2Info2 == null || mediaRoute2Info2.getConnectionState() != 0);
            goto label_71;
        label_70:
            object4 = null;
        label_71:
            if(((MediaRoute2Info)object4) != null) {
                ((ggtj)bboh0.h()).R("Stream transferred to %s for %s", ((MediaRoute2Info)object4).getId(), s);
                String s1 = ((MediaRoute2Info)object4).getId();
                ibuq.e(s1, "getId(...)");
                ibuq.f(s, "clientAppName");
                ibuq.f(s1, "routeId");
                Context context1 = AppContextProvider.a();
                ibuq.c(context1);
                if(aufd.e(ModuleManager.get(context1))) {
                    try {
                        String s2 = aufd.b(aueg0.c);
                        auek auek0 = aueg.j(s);
                        Executor executor0 = context1.getMainExecutor();
                        ibuq.e(executor0, "getMainExecutor(...)");
                        ibuq.f(s1, "routeId");
                        ibuq.f(executor0, "executor");
                        gmbu.t(icpu.e(iccl.b(cclw.f), new auey(((auez)auek0), s1, s2, null)), new aueq(((auez)auek0).c, "sendAction"), executor0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        a.ae(aueg.b.h(), "Failed to get intent engine.", illegalArgumentException0);
                    }
                }
                else {
                    ((ggtj)bboh0.j()).x("Cannot save action; intent engine unavailable.");
                }
                DeviceSuggestionResult deviceSuggestionResult0 = aueh.c(s);
                String s3 = deviceSuggestionResult0 == null ? null : deviceSuggestionResult0.a;
                String s4 = ((MediaRoute2Info)object4).getId();
                ibuq.e(s4, "getId(...)");
                if(s3 == null) {
                    atxp atxp1 = aueg0.h;
                    if(atxp1 == null) {
                        ibuq.j("castAnalytics");
                    }
                    else {
                        atxp0 = atxp1;
                    }
                    atxp0.T(s);
                }
                else if(ibuq.m(s3, s4)) {
                    atxp atxp2 = aueg0.h;
                    if(atxp2 == null) {
                        ibuq.j("castAnalytics");
                    }
                    else {
                        atxp0 = atxp2;
                    }
                    atxp0.S(s, s4);
                }
                else {
                    atxp atxp3 = aueg0.h;
                    if(atxp3 == null) {
                        ibuq.j("castAnalytics");
                    }
                    else {
                        atxp0 = atxp3;
                    }
                    atxp0.R(s, s3, s4);
                }
                if(deviceSuggestionResult0 != null) {
                    ((ggtj)aueg.b.h()).x("Clearing previous suggestion after casting to some device.");
                    Context context2 = AppContextProvider.a();
                    ibuq.e(context2, "getApplicationContext(...)");
                    aueg.l(context2, s);
                }
            }
        }
        String s5 = this.a;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(arrayList1, 10)), 16));
        for(Object object5: arrayList1) {
            linkedHashMap0.put(((MediaRoute2Info)object5).getId(), object5);
        }
        ibuq.f(s5, "clientAppName");
        auei auei0 = (auei)aueh.a.get(s5);
        if(auei0 == null) {
            auei0 = aueh.b(s5);
        }
        auei0.c.putAll(linkedHashMap0);
        ((ggtj)aueg.b.h()).B("Updating routes cache for %s", s5);
        ggtj ggtj3 = (ggtj)aueg.b.h();
        ArrayList arrayList4 = new ArrayList(linkedHashMap0.size());
        for(Object object6: linkedHashMap0.entrySet()) {
            arrayList4.add(new ibns(((MediaRoute2Info)((Map.Entry)object6).getValue()).getName(), ((Map.Entry)object6).getKey()));
        }
        ggtj3.B("%s", arrayList4);
    }
}

