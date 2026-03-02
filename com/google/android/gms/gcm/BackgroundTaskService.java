package com.google.android.gms.gcm;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.usage.UsageStatsManager;
import android.util.Log;
import bbqa;
import bsmp;
import bsms;
import bsmy;
import bsqc;
import bsqe;
import bsqf;
import bsqg;
import bsqm;
import bsvb;
import bsxk;
import btbr;
import btbs;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import gfqx;
import gfsx;
import gged_interceptors;
import ggqk;
import hfrj;
import hfvv;
import htfp;
import htgo;
import igcx;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;

public class BackgroundTaskService extends GmsTaskChimeraService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        String s = cllr0.a;
        if(Objects.equals(s, "PersistConnectionInfos")) {
            bsmy.b().j().d();
            return 0;
        }
        if(Objects.equals(s, "LogPhenotypeExperimentIds")) {
            bsmy.b().c().b(btbs.a, null);
            return 0;
        }
        if(Objects.equals(s, "affinityUpdateTask")) {
            bsqc bsqc0 = bsmy.b().i();
            if(htfp.e()) {
                igcx igcx0 = igcx.d(htfp.a.d().c());
                bsvb bsvb0 = bsqc0.a;
                ggqk ggqk0 = ((gged_interceptors)bsvb0.f()).E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    bsms bsms0 = (bsms)object0;
                    bsqg bsqg0 = bsqc0.d;
                    gfsx gfsx0 = bsqg0.b(bsms0, 10);
                    gfsx gfsx1 = bsqg0.b(bsms0, 17);
                    gfsx gfsx2 = gfqx.a;
                    if(htgo.C()) {
                        gfsx2 = bsqg0.b(bsms0, 5);
                    }
                    btbr btbr0 = (btbr)((ProtoLiteMessage)btbs.a).v_newBuilder();
                    if(gfsx0.i()) {
                        btbr0.a(bsqc.a(bsms0, ((bsqf)gfsx0.d()), 10));
                    }
                    if(gfsx1.i()) {
                        btbr0.a(bsqc.a(bsms0, ((bsqf)gfsx1.d()), 17));
                    }
                    if(htgo.C() && gfsx2.i()) {
                        btbr0.a(bsqc.a(bsms0, ((bsqf)gfsx2.d()), 5));
                    }
                    if(((btbs)btbr0.b_message).d.size() > 0) {
                        btbs btbs0 = (btbs)((ProtoLiteBuilder)btbr0).N_build();
                        bsqc0.c.b(btbs0, null);
                    }
                    if(gfsx1.i()) {
                        Object object1 = gfsx1.d();
                        if(gfsx0.i()) {
                            Object object2 = gfsx0.d();
                            bsqe bsqe0 = new bsqe();
                            bsqe0.e(((bsqf)object1).a + ((bsqf)object2).a);
                            bsqe0.c(((bsqf)object1).b + ((bsqf)object2).b);
                            bsqe0.d(((bsqf)object1).c + ((bsqf)object2).c);
                            bsqe0.b(((bsqf)object1).d + ((bsqf)object2).d);
                            object1 = bsqe0.a();
                        }
                        gfsx0 = gfsx.m(object1);
                    }
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bsms0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)bsms0));
                    ArrayList arrayList0 = new ArrayList();
                    boolean z = false;
                    for(Object object3: DesugarCollections.unmodifiableList(((bsms)hftp0.b_message).i)) {
                        bsmp bsmp0 = (bsmp)object3;
                        if(System.currentTimeMillis() - bsmp0.c < igcx0.b) {
                            arrayList0.add(bsmp0);
                        }
                        else {
                            z = true;
                        }
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((bsms)hftp0.b_message).i = hfvv.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bsms bsms1 = (bsms)hftp0.b_message;
                    bsms1.b();
                    hfrj.E(arrayList0, bsms1.i);
                    if(gfsx0.i()) {
                        Object object4 = gfsx0.d();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bsmp.a).v_newBuilder();
                        long v = System.currentTimeMillis();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((bsmp)hftv0).b |= 1;
                        ((bsmp)hftv0).c = v;
                        int v1 = ((bsqf)object4).a;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp1.b_message;
                        ((bsmp)hftv1).b |= 2;
                        ((bsmp)hftv1).d = v1;
                        int v2 = ((bsqf)object4).b;
                        if(!hftv1.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp1.b_message;
                        ((bsmp)hftv2).b |= 4;
                        ((bsmp)hftv2).e = v2;
                        int v3 = ((bsqf)object4).c;
                        if(!hftv2.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        bsmp bsmp1 = (bsmp)hftp1.b_message;
                        bsmp1.b |= 8;
                        bsmp1.f = v3;
                        bsmp bsmp2 = (bsmp)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        bsms bsms2 = (bsms)hftp0.b_message;
                        bsmp2.getClass();
                        bsms2.b();
                        bsms2.i.add(bsmp2);
                        if(bbqa.c()) {
                            gfsx gfsx3 = bsqg0.a(bsms0.c);
                            if(gfsx3.i()) {
                                bsqg.c(((UsageStatsManager)gfsx3.d()), bsms0);
                            }
                        }
                    }
                    if(gfsx0.i() || z) {
                        bsms bsms3 = (bsms)hftp0.N_build();
                        bsvb0.i(((ProtoLiteMessage)bsms3));
                        for(Object object5: bsqc0.b) {
                            bsqm bsqm0 = ((bsxk)object5).a;
                            gfsx gfsx4 = bsqm.e(bsms3);
                            if(gfsx4.i()) {
                                bsqm0.k(bsqm.b(bsms3), ((Double)gfsx4.d()).doubleValue());
                            }
                            else {
                                bsqm0.i(bsqm.b(bsms3));
                            }
                        }
                    }
                }
                return 0;
            }
        }
        else {
            Log.w("GCM", "Unknown task: " + s);
        }
        return 0;
    }
}

