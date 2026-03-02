package com.google.android.gms.semanticlocation.service.operations;

import android.content.Context;
import cljp;
import clkn;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocation.internal.SemanticLocationParameters;
import hyac;
import j..time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public class SemanticLocationStateCacheService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocation.service.operations.SemanticLocationStateCacheService";
    private static final Map b;

    static {
        SemanticLocationStateCacheService.b = new HashMap();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        long v = hyac.f();
        long v1 = Duration.ofMillis(System.currentTimeMillis()).minusSeconds(v).toSeconds();
        Iterator iterator0 = SemanticLocationStateCacheService.b.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((SemanticLocationState)map$Entry0.getValue()).c < v1) {
                SemanticLocationState semanticLocationState0 = (SemanticLocationState)map$Entry0.getValue();
                iterator0.remove();
            }
        }
        return 0;
    }

    public static SemanticLocationState d(SemanticLocationParameters semanticLocationParameters0) {
        SemanticLocationState semanticLocationState0;
        synchronized(SemanticLocationStateCacheService.class) {
            Map map0 = SemanticLocationStateCacheService.b;
            if(map0.isEmpty()) {
                return null;
            }
            semanticLocationState0 = (SemanticLocationState)map0.get(semanticLocationParameters0);
            if(semanticLocationState0 != null) {
                long v1 = hyac.f();
                if(semanticLocationState0.c < Duration.ofMillis(System.currentTimeMillis()).minusSeconds(v1).toSeconds()) {
                    map0.remove(semanticLocationParameters0);
                    return null;
                }
            }
        }
        return semanticLocationState0;
    }

    public static void e(Context context0, SemanticLocationParameters semanticLocationParameters0, SemanticLocationState semanticLocationState0) {
        synchronized(SemanticLocationStateCacheService.class) {
            if(hyac.f() > 0L) {
                hyac.f();
                SemanticLocationStateCacheService.b.put(semanticLocationParameters0, semanticLocationState0);
                cljp cljp0 = cljp.a(context0);
                clkn clkn0 = new clkn();
                clkn0.w(SemanticLocationStateCacheService.a);
                clkn0.t("SemanticLocationStateCacheService");
                clkn0.v(1);
                clkn0.e(hyac.f(), hyac.f() + 60L);
                cljp0.f(clkn0.a());
            }
        }
    }
}

