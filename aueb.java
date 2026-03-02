import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.SuggestedDeviceInfo.Builder;
import android.media.SuggestedDeviceInfo;
import android.os.Parcel;
import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionResult;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public final class aueb implements gmbg {
    final String a;
    final aueg b;
    final Context c;

    public aueb(String s, aueg aueg0, Context context0) {
        this.a = s;
        this.b = aueg0;
        this.c = context0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        a.ae(aueg.b.h(), "getActionProbabilities failed", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        atxp atxp11;
        atxp atxp8;
        atxp atxp6;
        int v;
        atxp atxp3;
        atxp atxp1;
        ibuq.f(((SortedMap)object0), "result");
        if(((SortedMap)object0).isEmpty()) {
            bboh bboh0 = aueg.b;
            ((ggtj)bboh0.h()).x("Intent engine results empty; nothing to suggest.");
            String s = this.a;
            if(aueh.c(s) != null) {
                ((ggtj)bboh0.h()).x("Expiring previously suggested device.");
                this.b.h(this.c, s);
            }
            atxp atxp0 = this.b.h;
            if(atxp0 == null) {
                ibuq.j("castAnalytics");
                atxp1 = null;
            }
            else {
                atxp1 = atxp0;
            }
            atxp1.ak(s);
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object1: ((SortedMap)object0).values()) {
            ibuq.e(object1, "next(...)");
            String s1 = String.format(Locale.US, "\n%s", Arrays.copyOf(new Object[]{new aaxk(((aaxk)object1).a)}, 1));
            ibuq.e(s1, "format(...)");
            stringBuilder0.append(s1);
        }
        bboh bboh1 = aueg.b;
        ggtj ggtj0 = (ggtj)bboh1.h();
        String s2 = this.a;
        ggtj0.R("Intent engine results for %s =\n%s", s2, stringBuilder0.toString());
        Map map0 = aueh.d(s2);
        if(map0 != null && !map0.isEmpty()) {
            ((ggtj)bboh1.h()).B("Cached routes for %s=", s2);
            for(Object object2: map0.values()) {
                ((ggtj)bboh1.h()).X("%s: %s, dedupIds=%s\n", ((MediaRoute2Info)object2).getName(), ((MediaRoute2Info)object2).getId(), ((MediaRoute2Info)object2).getDeduplicationIds());
            }
            aueg aueg0 = this.b;
            ibuq.f(((SortedMap)object0), "resultsMap");
            ibuq.f(s2, "pkgName");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            Collection collection0 = ((SortedMap)object0).values();
            ibuq.e(collection0, "<get-values>(...)");
            LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(collection0, 10)), 16));
            for(Object object3: collection0) {
                ibns ibns0 = new ibns(((aaxk)object3).a.a, ((float)((aaxk)object3).a.b));
                linkedHashMap1.put(ibns0.a, ibns0.b);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for(Object object4: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object4;
                if(ibzk.G(((CharSequence)map$Entry0.getKey()), s2)) {
                    linkedHashMap2.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for(Object object5: map0.entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object5;
                if(!ibzk.G(((CharSequence)map$Entry1.getKey()), s2)) {
                    linkedHashMap3.put(map$Entry1.getKey(), map$Entry1.getValue());
                }
            }
            for(Object object6: ibpz.f(((SortedMap)object0), new audz(((SortedMap)object0))).entrySet()) {
                Map.Entry map$Entry2 = (Map.Entry)object6;
                String s3 = ((aaxk)map$Entry2.getValue()).a.a;
                for(Object object7: linkedHashMap2.values()) {
                    MediaRoute2Info mediaRoute2Info0 = (MediaRoute2Info)object7;
                    if(ibuq.m(mediaRoute2Info0.getId(), s3)) {
                        goto label_84;
                    }
                    Set set0 = mediaRoute2Info0.getDeduplicationIds();
                    ibuq.e(set0, "getDeduplicationIds(...)");
                    Iterator iterator7 = set0.iterator();
                label_79:
                    if(!iterator7.hasNext()) {
                        continue;
                    }
                    Object object8 = iterator7.next();
                    if(!ibzk.G(s3, ((String)object8))) {
                        goto label_79;
                    }
                    goto label_84;
                }
                object7 = null;
            label_84:
                MediaRoute2Info mediaRoute2Info1 = (MediaRoute2Info)object7;
                if(mediaRoute2Info1 == null) {
                    for(Object object9: linkedHashMap3.values()) {
                        if(!ibuq.m(((MediaRoute2Info)object9).getId(), s3)) {
                            continue;
                        }
                        goto label_92;
                    }
                    object9 = null;
                label_92:
                    mediaRoute2Info1 = (MediaRoute2Info)object9;
                }
                if(mediaRoute2Info1 == null) {
                    continue;
                }
                else {
                    linkedHashMap0.put(mediaRoute2Info1, map$Entry2.getValue());
                }
                break;
            }
            if(linkedHashMap0.isEmpty()) {
                atxp atxp2 = aueg0.h;
                if(atxp2 == null) {
                    ibuq.j("castAnalytics");
                    atxp3 = null;
                }
                else {
                    atxp3 = atxp2;
                }
                atxp3.am(s2, linkedHashMap1);
                return;
            }
            double f = avij.e().a();
            Map.Entry map$Entry3 = (Map.Entry)ibpo.Q(linkedHashMap0.entrySet());
            double f1 = (double)((aaxk)map$Entry3.getValue()).a.b;
            if(Double.compare(f1, f) > 0) {
                v = 3;
            }
            else {
                v = f1 > f / 2.0 ? 2 : 1;
            }
            DeviceSuggestionResult deviceSuggestionResult0 = new DeviceSuggestionResult(((MediaRoute2Info)map$Entry3.getKey()).getId(), ((MediaRoute2Info)map$Entry3.getKey()).getName().toString(), v);
            List list0 = (List)aueg0.f.get(s2);
            if(list0 != null && !list0.isEmpty()) {
                ggtj ggtj1 = (ggtj)bboh1.h();
                String s4 = deviceSuggestionResult0.a;
                ggtj1.R("Suggesting %s to %s", s4, s2);
                atxp atxp4 = aueg0.h;
                if(atxp4 == null) {
                    ibuq.j("castAnalytics");
                    atxp4 = null;
                }
                atxp4.ad(3, s2, linkedHashMap1, s4);
                for(Object object10: list0) {
                    Parcel parcel0 = ((auoo)object10).jo();
                    wbz.f(parcel0, deviceSuggestionResult0);
                    ((auoo)object10).jq(1, parcel0);
                }
                aueh.a(s2, deviceSuggestionResult0);
                return;
            }
            if(!aufd.d(s2)) {
                if(!riq.a()) {
                    ((ggtj)bboh1.h()).x("Won\'t suggest; MediaRouter version incompatible.");
                    atxp atxp5 = aueg0.h;
                    if(atxp5 == null) {
                        ibuq.j("castAnalytics");
                        atxp6 = null;
                    }
                    else {
                        atxp6 = atxp5;
                    }
                    atxp6.al(s2, linkedHashMap1);
                    return;
                }
                if(deviceSuggestionResult0.c != 3) {
                    ((ggtj)bboh1.h()).x("Won\'t suggest; confidence score is not HIGH.");
                    atxp atxp7 = aueg0.h;
                    if(atxp7 == null) {
                        ibuq.j("castAnalytics");
                        atxp8 = null;
                    }
                    else {
                        atxp8 = atxp7;
                    }
                    atxp8.an(s2, linkedHashMap1);
                    return;
                }
                ggtj ggtj2 = (ggtj)bboh1.h();
                String s5 = deviceSuggestionResult0.a;
                ggtj2.R("Suggesting %s to %s UMO", s5, s2);
                atxp atxp9 = aueg0.h;
                if(atxp9 == null) {
                    ibuq.j("castAnalytics");
                    atxp9 = null;
                }
                atxp9.ad(2, s2, linkedHashMap1, s5);
                Context context0 = AppContextProvider.a();
                MediaRoute2Info mediaRoute2Info2 = (MediaRoute2Info)map0.get(s5);
                Integer integer0 = mediaRoute2Info2 == null ? null : mediaRoute2Info2.getType();
                ibuq.c(context0);
                aufc aufc0 = aueg.k(context0, s2);
                ibuq.e(s5, "getRouteId(...)");
                String s6 = deviceSuggestionResult0.b;
                ibuq.e(s6, "getDeviceName(...)");
                ibuq.f(s5, "id");
                ibuq.f(s6, "name");
                if(!riq.a()) {
                    throw new IllegalArgumentException("MediaRouter2#setDeviceSuggestions is unavailable on current Android SDK");
                }
                SuggestedDeviceInfo suggestedDeviceInfo0 = new SuggestedDeviceInfo.Builder(s6, s5, (integer0 == null ? 0 : ((int)integer0))).build();
                ibuq.e(suggestedDeviceInfo0, "build(...)");
                MediaRouter2 mediaRouter20 = aufc0.a;
                if(mediaRouter20 != null) {
                    mediaRouter20.setDeviceSuggestions(ibpo.b(suggestedDeviceInfo0));
                }
                aueh.a(s2, deviceSuggestionResult0);
                return;
            }
            ((ggtj)bboh1.h()).B("Won\'t suggest; GMS suggestion provider disabled for %s", s2);
            return;
        }
        ((ggtj)bboh1.h()).B("No device suggestions as routes unavailable for %s", s2);
        atxp atxp10 = this.b.h;
        if(atxp10 == null) {
            ibuq.j("castAnalytics");
            atxp11 = null;
        }
        else {
            atxp11 = atxp10;
        }
        atxp11.aj(s2);
    }
}

