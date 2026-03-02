package com.google.android.contextmanager.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import azql;
import bauc;
import bbmq;
import bcwf;
import cjpd;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import ggnj;
import gmcg;
import hrgt;
import xrn;
import xro;
import xxe;
import ych;
import ycj;

public class ContextManagerChimeraService extends cjtg {
    public ContextManagerChimeraService() {
        gmcg gmcg0 = xxe.u().d();
        super(new int[]{0x2F}, new String[]{"com.google.android.contextmanager.service.ContextManagerService.START"}, ggnj.a, 3, gmcg0, null);
    }

    @Override  // cjtg
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ContextManagerClientInfo contextManagerClientInfo0;
        Bundle bundle0 = getServiceRequest0.i;
        if(bundle0 == null) {
            contextManagerClientInfo0 = null;
        }
        else {
            byte[] arr_b = bundle0.getByteArray("com.google.android.contextmanager.service.args");
            contextManagerClientInfo0 = arr_b == null ? null : ((ContextManagerClientInfo)bauc.a(arr_b, ContextManagerClientInfo.CREATOR));
        }
        Context context0 = xxe.e();
        String s = getServiceRequest0.f;
        int v = 0;
        if(contextManagerClientInfo0 != null && !contextManagerClientInfo0.d() && !contextManagerClientInfo0.f()) {
            if(!contextManagerClientInfo0.e()) {
                throw new SecurityException("Unknown package connection.");
            }
            hrgt hrgt0 = hrgt.a;
            if(!hrgt0.w().ar()) {
                xxe.G();
                long v1 = System.currentTimeMillis();
                long v2 = cjpd.b(xxe.J().a, s, 0L);
                if(v2 == 0L) {
                    v = ycj.a(contextManagerClientInfo0, s);
                }
                else if(hrgt0.w().am() <= v1 - v2) {
                    ych ych0 = new ych(contextManagerClientInfo0, s);
                    ych0.a.f();
                    xrn xrn0 = xro.a("validate3P", xxe.e(), ych0.b);
                    ych0.a.b(ych0, xrn0);
                }
            }
        }
        else if(!bbmq.Y(context0)) {
            if(contextManagerClientInfo0 != null && !TextUtils.equals(contextManagerClientInfo0.b, s)) {
                throw new SecurityException("Package name does not match.");
            }
            azql.c(context0).d(s);
        }
        if(v == 0) {
            cjtn0.c(new bcwf(contextManagerClientInfo0, getServiceRequest0.f, getServiceRequest0.p));
            return;
        }
        cjtn0.a(v, null);
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        xxe.ai(this.l());
        xxe.s();
        xxe.ah(this.getBaseContext());
        xxe.o().j(3);
    }
}

