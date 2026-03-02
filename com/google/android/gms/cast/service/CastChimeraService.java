package com.google.android.gms.cast.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import atrp;
import atzn;
import aurl;
import aurn;
import avcp;
import avcw;
import avds;
import avek;
import avjf;
import avjh;
import bbpj;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;
import hqrm;
import hque;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class CastChimeraService extends cjtg {
    private static final AtomicInteger a;
    private atrp b;
    private cjts c;

    static {
        CastChimeraService.a = new AtomicInteger(0);
    }

    public CastChimeraService() {
        super(new int[]{10, 0xA1}, new String[]{"com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE", "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"}, ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        aurn aurn0;
        CastDevice castDevice0;
        String s = getServiceRequest0.f;
        if(avjf.b().i()) {
            avcp avcp0 = avcp.a(this.getApplicationContext());
            if(avcp0.b != 3) {
                avcp0.d(2);
                avcp0.c(s);
            }
        }
        switch(getServiceRequest0.d) {
            case 10: {
                avjh avjh0 = new avjh("CastService", String.format(Locale.ROOT, "instance-%d", CastChimeraService.a.incrementAndGet()));
                Bundle bundle0 = getServiceRequest0.i;
                try {
                    castDevice0 = CastDevice.c(bundle0);
                }
                catch(Exception exception0) {
                    avjh0.e(exception0, "CastDevice was not valid.", new Object[0]);
                    castDevice0 = null;
                }
                if(castDevice0 == null) {
                    avjh0.d("CastDevice can not be null.", new Object[0]);
                    cjtn0.a(10, null);
                    return;
                }
                boolean z = bundle0.getBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED");
                boolean z1 = bundle0.getBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED");
                boolean z2 = bundle0.getBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED");
                boolean z3 = bundle0.getBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION");
                String s1 = bundle0.getString("connectionless_client_record_id");
                String s2 = getServiceRequest0.f;
                long v = bundle0.getLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
                if(hque.a.d().g().b.contains(s2)) {
                    v |= 8L;
                }
                avjh0.c("getCastService: %s", new Object[]{s2});
                if(s1 == null) {
                    BinderWrapper binderWrapper0 = (BinderWrapper)bundle0.getParcelable("listener");
                    if(binderWrapper0 == null) {
                        aurn0 = null;
                    }
                    else {
                        IBinder iBinder0 = binderWrapper0.a;
                        if(iBinder0 == null) {
                            aurn0 = null;
                        }
                        else {
                            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                            aurn0 = (iInterface0 instanceof aurn) ? ((aurn)iInterface0) : new aurl(iBinder0);
                        }
                    }
                    if(aurn0 == null) {
                        avjh0.d("ICastDeviceControllerListener can\'t be null.", new Object[0]);
                        cjtn0.a(10, null);
                        return;
                    }
                    String s3 = bundle0.getString("last_application_id");
                    String s4 = bundle0.getString("last_session_id");
                    avjh0.q("%s, connecting to device with lastApplicationId=%s, lastSessionId=%s", s2, String.valueOf(s3), String.valueOf(s4));
                    int v1 = getServiceRequest0.e;
                    String s5 = getServiceRequest0.p == null ? "" : getServiceRequest0.p;
                    atrp atrp0 = this.b;
                    if(atrp0 == null) {
                        avjh0.d("CastComponent can\'t be null.", new Object[0]);
                        return;
                    }
                    new avek(this.getApplicationContext(), cjtn0, castDevice0, s3, s4, z, z1, aurn0, v1, s2, v, avjh0, this.c, atrp0.l, atrp0.q, s5);
                    return;
                }
                if(!hqrm.a.b().b()) {
                    cjtn0.a(3, null);
                    return;
                }
                avjh0.n("%s, creating cxless service stub", s2);
                int v2 = getServiceRequest0.e;
                atrp atrp1 = this.b;
                if(atrp1 == null) {
                    avjh0.d("CastComponent can\'t be null.", new Object[0]);
                    return;
                }
                new avds(this.getApplicationContext(), cjtn0, castDevice0, z, z1, z2, z3, v2, s2, v, avjh0, this.c, atrp1.n, atrp1.r, atrp1.g, atrp1.p, atrp1.l.a, atrp1.i, atrp1.q, getServiceRequest0.p);
                return;
            }
            case 0xA1: {
                atrp atrp2 = this.b;
                if(atrp2 != null) {
                    Context context0 = this.getApplicationContext();
                    cjts cjts0 = this.c;
                    bbpj bbpj0 = bbpj.a(this.getApplicationContext());
                    cjtn0.c(new avcw(context0, atrp2.o, cjts0, bbpj0, atrp2.e, getServiceRequest0.f, getServiceRequest0.p));
                    return;
                }
            }
        }
        cjtn0.a(1, null);
    }

    @Override  // cjtg
    protected final void gh(Bundle bundle0, IBinder iBinder0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        ClassLoader classLoader0 = CastDevice.class.getClassLoader();
        if(classLoader0 != null) {
            bundle0.setClassLoader(classLoader0);
        }
        bundle0.putParcelable("listener", new BinderWrapper(iBinder0));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        this.b = atrp.a(this.getApplicationContext(), "CastService");
        this.c = this.m(atzn.a());
    }

    @Override  // cjtg
    public final void onDestroy() {
        if(this.b != null) {
            atrp.b("CastService");
            this.b = null;
        }
        super.onDestroy();
    }
}

