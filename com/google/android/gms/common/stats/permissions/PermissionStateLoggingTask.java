package com.google.android.gms.common.stats.permissions;

import ProtoLiteMessage;
import android.content.Context;
import bazo;
import bazp;
import bazr;
import bbjx;
import bbjy;
import bbjz;
import bbka;
import bbkb;
import bbkc;
import bbke;
import cclw;
import cdbg;
import cdef;
import cfol;
import cjmf;
import cllr;
import com.google.android.gms.chimera.modules.core.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import gful_cronetEngineProvider;
import ggeo;
import gldc;
import gldd;
import glim;
import glji;
import gljk;
import gljm;
import gmap;
import gmcd;
import hrsz;
import ibnq;
import ibnx;
import ibpo;
import ibrl;
import ibrx;
import ibuq;
import iccl;
import icpu;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class PermissionStateLoggingTask extends GmsTaskBoundService {
    public static final int a;

    public final Object d(Context context0, ibrl ibrl0) {
        bbke bbke1;
        Object object6;
        gljm gljm0;
        bbjz bbjz0;
        if((ibrl0 instanceof bbjz)) {
            bbjz0 = (bbjz)ibrl0;
            int v = bbjz0.d;
            if((v & 0x80000000) == 0) {
                bbjz0 = new bbjz(this, ibrl0);
            }
            else {
                bbjz0.d = v - 0x80000000;
            }
        }
        else {
            bbjz0 = new bbjz(this, ibrl0);
        }
        Object object0 = bbjz0.b;
        Object object1 = ibrx.a;
        switch(bbjz0.d) {
            case 0: {
                ibnx.b(object0);
                ibuq.f(context0, "context");
                ggeo ggeo0 = bazr.b.c();
                ArrayList arrayList0 = new ArrayList(ggeo0.size());
                for(Object object2: ggeo0.entrySet()) {
                    Object object3 = ((Map.Entry)object2).getKey();
                    ibuq.e(object3, "component1(...)");
                    Object object4 = ((Map.Entry)object2).getValue();
                    ibuq.e(object4, "component2(...)");
                    gldd gldd0 = gldc.a(((ProtoLiteMessage)glji.a).v_newBuilder());
                    gljk gljk0 = (gljk)bazo.a().get(((String)object3));
                    if(gljk0 == null) {
                        gljk0 = gljk.a;
                    }
                    gldd0.b(gljk0);
                    switch(((bazp)object4).ordinal()) {
                        case 0: {
                            gljm0 = gljm.c;
                            break;
                        }
                        case 1: {
                            gljm0 = gljm.b;
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                    gldd0.c(gljm0);
                    arrayList0.add(gldd0.a());
                }
                ArrayList arrayList1 = new ArrayList(bbjx.a.size());
                for(Object object5: bbjx.a.entrySet()) {
                    gljk gljk1 = (gljk)((Map.Entry)object5).getKey();
                    String s = (String)((Map.Entry)object5).getValue();
                    gldd gldd1 = gldc.a(((ProtoLiteMessage)glji.a).v_newBuilder());
                    gldd1.b(gljk1);
                    gldd1.c((cjmf.b(context0, s) == 0 ? gljm.c : gljm.b));
                    arrayList1.add(gldd1.a());
                }
                object6 = ibpo.ak(arrayList0, arrayList1);
                bbke bbke0 = new bbke(context0);
                bbjz0.a = object6;
                bbjz0.e = bbke0;
                bbjz0.d = 1;
                Object object7 = bbke0.a(bbjz0);
                if(object7 != object1) {
                    bbke1 = bbke0;
                    object0 = object7;
                    goto label_61;
                }
                return object1;
            }
            case 1: {
                bbke1 = bbjz0.e;
                object6 = bbjz0.a;
                ibnx.b(object0);
            label_61:
                if(hrsz.f()) {
                    cfol.v().d(((gful_cronetEngineProvider)new bbjy(((List)object6), ((List)object0))));
                }
                else {
                    cdbg.a(cdef.ak, glim.class).d(((gful_cronetEngineProvider)new bbjy(((List)object6), ((List)object0))));
                }
                ibuq.f(object6, "states");
                bbkc bbkc0 = new bbkc(new bbkb(((List)object6)));
                gmcd gmcd0 = bbke1.a.b(bbkc0, gmap.a);
                bbjz0.a = null;
                bbjz0.e = null;
                bbjz0.d = 2;
                return icpu.c(gmcd0, bbjz0) != object1 ? new Integer(0) : object1;
            }
            case 2: {
                ibnx.b(object0);
                return new Integer(0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        Context context0 = AppContextProvider.a();
        return icpu.e(iccl.b(cclw.b), new bbka(this, context0, null));
    }
}

