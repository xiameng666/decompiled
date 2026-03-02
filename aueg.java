import android.content.Context;
import android.media.MediaRouter2.DeviceSuggestionsUpdatesCallback;
import android.media.MediaRouter2.RouteCallback;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference.Builder;
import android.media.RouteDiscoveryPreference;
import android.media.session.MediaSessionManager.OnActiveSessionsChangedListener;
import android.media.session.MediaSessionManager;
import android.net.ConnectivityManager;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.os.Parcel;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.cast.devicesuggestions.delegate.RealDeviceSuggestionsDelegate.getNetworkCallbackWrapper.1;
import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionResult;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aueg extends auds {
    public static final bboh b;
    public String c;
    public MediaSessionManager.OnActiveSessionsChangedListener d;
    public final AtomicBoolean e;
    public final Map f;
    public final Object g;
    public atxp h;
    private NetworkCallbackWrapper i;

    static {
        aueg.b = bboh.b("device_suggestions", bbcu.gU);
    }

    public aueg() {
        this.e = new AtomicBoolean(false);
        this.f = new LinkedHashMap();
        this.g = new Object();
    }

    @Override  // auds
    public final void a() {
        Context context0 = AppContextProvider.a();
        MediaSessionManager.OnActiveSessionsChangedListener mediaSessionManager$OnActiveSessionsChangedListener0 = this.d;
        if(mediaSessionManager$OnActiveSessionsChangedListener0 != null) {
            Object object0 = context0.getSystemService("media_session");
            ibuq.d(object0, "null cannot be cast to non-null type android.media.session.MediaSessionManager");
            ((MediaSessionManager)object0).removeOnActiveSessionsChangedListener(mediaSessionManager$OnActiveSessionsChangedListener0);
        }
        this.d = null;
        ibuq.c(context0);
        this.f(context0);
    }

    @Override  // auds
    public final void b(String s, azxs azxs0) {
        ibuq.f(s, "clientAppName");
        Context context0 = AppContextProvider.a();
        ibuq.c(context0);
        if(!aufd.e(ModuleManager.get(context0))) {
            ((ggtj)aueg.b.j()).x("Cannot query intent engine at it is unavailable.");
            Status status0 = new Status(8, "Intent engine unavailable.");
            if(azxs0 != null) {
                azxs0.a(status0);
            }
            return;
        }
        if(azxs0 != null) {
            azxs0.a(Status.b);
        }
        if(!avij.e().G()) {
            Map map0 = aueh.d(s);
            if(map0 == null || map0.isEmpty()) {
                ((ggtj)aueg.b.h()).B("Routes unavailable for %s; won\'t query intent engine", s);
                return;
            }
        }
        aueb aueb0 = new aueb(s, this, context0);
        try {
            String s1 = aufd.b(this.c);
            auek auek0 = aueg.j(s);
            Executor executor0 = context0.getMainExecutor();
            ibuq.e(executor0, "getMainExecutor(...)");
            ibuq.f(executor0, "executor");
            AtomicBoolean atomicBoolean0 = ((auez)auek0).d;
            if(atomicBoolean0.get()) {
                ((ggtj)auez.b.h()).x("Intent engine lookup is throttled due to requests in quick succession.");
                return;
            }
            atomicBoolean0.set(true);
            new clht().postDelayed(new auen(((auez)auek0)), avij.e().c());
            gmbu.t(icpu.e(iccl.b(cclw.f), new auet(s1, ((auez)auek0), null)), aueb0, executor0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(aueg.b.h(), "Failed to get intent engine.", illegalArgumentException0);
        }
    }

    @Override  // auds
    public final boolean c(String s) {
        ibuq.f(s, "clientAppName");
        List list0 = (List)this.f.get(s);
        return list0 != null ? list0.isEmpty() ^ 1 : false;
    }

    @Override  // auds
    public final void d(String s, auoo auoo0) {
        synchronized(this) {
            ibuq.f(s, "clientAppName");
            ibuq.f(auoo0, "callback");
            Map map0 = this.f;
            List list0 = (List)map0.get(s);
            if(list0 != null) {
                list0.add(auoo0);
                return;
            }
            map0.put(s, ibpo.i(new auoo[]{auoo0}));
            Context context0 = AppContextProvider.a();
            ibuq.e(context0, "getApplicationContext(...)");
            this.i(context0, ibpo.b(s));
        }
    }

    @Override  // auds
    public final void e(String s, auoo auoo0) {
        synchronized(this) {
            ibuq.f(s, "clientAppName");
            ibuq.f(auoo0, "callback");
            List list0 = (List)this.f.get(s);
            if(list0 != null) {
                list0.remove(auoo0);
            }
            if(!riq.a() || aufd.d(s)) {
                if(list0 == null || list0.isEmpty()) {
                    Context context0 = AppContextProvider.a();
                    ibuq.e(context0, "getApplicationContext(...)");
                    this.g(context0, s);
                }
                if(aueh.e().isEmpty()) {
                    this.a();
                }
            }
        }
    }

    public final void f(Context context0) {
        for(Object object0: aueh.e().keySet()) {
            this.g(context0, ((String)object0));
        }
        NetworkCallbackWrapper networkCallbackWrapper0 = this.i;
        if(networkCallbackWrapper0 != null) {
            Object object1 = context0.getSystemService(ConnectivityManager.class);
            ibuq.d(object1, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager)object1).unregisterNetworkCallback(networkCallbackWrapper0);
        }
        this.i = null;
    }

    public final void g(Context context0, String s) {
        this.h(context0, s);
        aufc aufc0 = aueg.k(context0, s);
        MediaRouter2.DeviceSuggestionsUpdatesCallback mediaRouter2$DeviceSuggestionsUpdatesCallback0 = null;
        if(aufc0.b()) {
            MediaRouter2 mediaRouter20 = aufc0.a;
            if(mediaRouter20 != null) {
                MediaRouter2.RouteCallback mediaRouter2$RouteCallback0 = aufc0.b;
                if(mediaRouter2$RouteCallback0 == null) {
                    ibuq.j("routeCallback");
                    mediaRouter2$RouteCallback0 = null;
                }
                mediaRouter20.unregisterRouteCallback(mediaRouter2$RouteCallback0);
            }
        }
        if(riq.a()) {
            if(!riq.a()) {
                throw new IllegalArgumentException("MediaRouter2#unregisterDeviceSuggestionsUpdatesCallback unavailable on current Android SDK");
            }
            if(aufc0.a()) {
                MediaRouter2 mediaRouter21 = aufc0.a;
                if(mediaRouter21 != null) {
                    MediaRouter2.DeviceSuggestionsUpdatesCallback mediaRouter2$DeviceSuggestionsUpdatesCallback1 = aufc0.c;
                    if(mediaRouter2$DeviceSuggestionsUpdatesCallback1 == null) {
                        ibuq.j("deviceSuggestionsCallback");
                    }
                    else {
                        mediaRouter2$DeviceSuggestionsUpdatesCallback0 = mediaRouter2$DeviceSuggestionsUpdatesCallback1;
                    }
                    mediaRouter21.unregisterDeviceSuggestionsUpdatesCallback(mediaRouter2$DeviceSuggestionsUpdatesCallback0);
                }
            }
        }
        ibuq.f(s, "clientAppName");
        aueh.a.remove(s);
    }

    public final void h(Context context0, String s) {
        DeviceSuggestionResult deviceSuggestionResult0 = aueh.c(s);
        if(deviceSuggestionResult0 != null) {
            List list0 = (List)this.f.get(s);
            if(list0 != null && !list0.isEmpty()) {
                for(Object object0: list0) {
                    Parcel parcel0 = ((auoo)object0).jo();
                    wbz.f(parcel0, deviceSuggestionResult0);
                    ((auoo)object0).jq(2, parcel0);
                }
            }
            ibuq.f(s, "clientAppName");
            auei auei0 = (auei)aueh.a.get(s);
            if(auei0 != null) {
                auei0.d = null;
            }
        }
        aueg.l(context0, s);
    }

    public final void i(Context context0, List list0) {
        Executor executor0 = context0.getMainExecutor();
        clht clht0 = new clht();
        for(Object object0: list0) {
            String s = (String)object0;
            if(aueh.e().containsKey(s)) {
                continue;
            }
            aueh.b(s);
            ibuq.c(executor0);
            aufc aufc0 = aueg.k(context0, s);
            MediaRouter2.DeviceSuggestionsUpdatesCallback mediaRouter2$DeviceSuggestionsUpdatesCallback0 = null;
            if(!aufc0.b()) {
                ((ggtj)aueg.b.h()).B("Setting route callback on proxy router for %s", s);
                auef auef0 = new auef(s, this);
                ibuq.f(executor0, "executor");
                if(aufc0.b()) {
                    throw new IllegalStateException("Registering RouteCallback when one already set, is not allowed.");
                }
                aufc0.b = auef0;
                RouteDiscoveryPreference routeDiscoveryPreference0 = new RouteDiscoveryPreference.Builder(ibps.a, false).build();
                ibuq.e(routeDiscoveryPreference0, "build(...)");
                MediaRouter2 mediaRouter20 = aufc0.a;
                if(mediaRouter20 != null) {
                    MediaRouter2.RouteCallback mediaRouter2$RouteCallback0 = aufc0.b;
                    if(mediaRouter2$RouteCallback0 == null) {
                        ibuq.j("routeCallback");
                        mediaRouter2$RouteCallback0 = null;
                    }
                    mediaRouter20.registerRouteCallback(executor0, mediaRouter2$RouteCallback0, routeDiscoveryPreference0);
                }
                if(this.c != null && aufd.e(ModuleManager.get(context0))) {
                    aueg.n(context0, clht0, s);
                }
            }
            if(!riq.a() || aufc0.a()) {
                continue;
            }
            ((ggtj)aueg.b.h()).B("Register DeviceSuggestionsUpdatesCallback for %s", s);
            if(!riq.a()) {
                throw new IllegalArgumentException("MediaRouter2#DeviceSuggestionsUpdatesCallback unavailable on current Android SDK");
            }
            auea auea0 = new auea(s, this);
            ibuq.f(executor0, "executor");
            if(!riq.a()) {
                throw new IllegalArgumentException("MediaRouter2#registerDeviceSuggestionsUpdatesCallback unavailable on current Android SDK");
            }
            if(aufc0.a()) {
                throw new IllegalStateException("Registering DeviceSuggestionsUpdatesCallback when one already set is not allowed.");
            }
            aufc0.c = auea0;
            MediaRouter2 mediaRouter21 = aufc0.a;
            if(mediaRouter21 == null) {
                continue;
            }
            MediaRouter2.DeviceSuggestionsUpdatesCallback mediaRouter2$DeviceSuggestionsUpdatesCallback1 = aufc0.c;
            if(mediaRouter2$DeviceSuggestionsUpdatesCallback1 == null) {
                ibuq.j("deviceSuggestionsCallback");
            }
            else {
                mediaRouter2$DeviceSuggestionsUpdatesCallback0 = mediaRouter2$DeviceSuggestionsUpdatesCallback1;
            }
            mediaRouter21.registerDeviceSuggestionsUpdatesCallback(executor0, mediaRouter2$DeviceSuggestionsUpdatesCallback0);
            continue;
        }
        if(this.i == null) {
            RealDeviceSuggestionsDelegate.getNetworkCallbackWrapper.1 realDeviceSuggestionsDelegate$getNetworkCallbackWrapper$10 = new RealDeviceSuggestionsDelegate.getNetworkCallbackWrapper.1(context0, this);
            NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder();
            networkRequest$Builder0.addTransportType(1);
            networkRequest$Builder0.addCapability(12);
            NetworkRequest networkRequest0 = networkRequest$Builder0.build();
            Object object1 = context0.getSystemService(ConnectivityManager.class);
            ibuq.d(object1, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager)object1).registerNetworkCallback(networkRequest0, realDeviceSuggestionsDelegate$getNetworkCallbackWrapper$10);
            this.i = realDeviceSuggestionsDelegate$getNetworkCallbackWrapper$10;
        }
    }

    public static final auek j(String s) {
        ibuq.f(s, "clientAppName");
        auei auei0 = (auei)aueh.a.get(s);
        if(auei0 == null) {
            auei0 = aueh.b(s);
        }
        return auei0.a;
    }

    public static final aufc k(Context context0, String s) {
        ibuq.f(context0, "context");
        ibuq.f(s, "clientAppName");
        auei auei0 = (auei)aueh.a.get(s);
        if(auei0 == null) {
            auei0 = aueh.b(s);
        }
        aufc aufc0 = auei0.b;
        if(aufc0 != null) {
            return aufc0;
        }
        ibuq.f(context0, "context");
        ibuq.f(s, "packageName");
        aufc aufc1 = new aufc(MediaRouter2.getInstance(context0, s));
        auei0.b = aufc1;
        return aufc1;
    }

    public static final void l(Context context0, String s) {
        if(riq.a()) {
            aufc aufc0 = aueg.k(context0, s);
            if(!riq.a()) {
                throw new IllegalArgumentException("MediaRouter2#clearDeviceSuggestions is unavailable on current Android SDK");
            }
            MediaRouter2 mediaRouter20 = aufc0.a;
            if(mediaRouter20 != null) {
                mediaRouter20.clearDeviceSuggestions();
            }
        }
    }

    public static final void m(Context context0) {
        clht clht0 = new clht();
        for(Object object0: aueh.e().keySet()) {
            aueg.n(context0, clht0, ((String)object0));
        }
    }

    private static final void n(Context context0, clht clht0, String s) {
        ((ggtj)aueg.b.h()).B("Scanning routes for %s", s);
        aufc aufc0 = aueg.k(context0, s);
        MediaRouter2 mediaRouter20 = aufc0.a;
        if(mediaRouter20 != null) {
            mediaRouter20.startScan();
        }
        clht0.postDelayed(new audt(aufc0), 10000L);
    }
}

