package com.google.android.gms.googleone.escalation.service;

import buav;
import budd;
import bufn;
import bugc;
import bugk;
import bugm;
import bugn;
import buqz;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import httz;
import ibpu;
import ibuq;
import icck;

public final class EscalationCardChimeraService extends bugn {
    public cjts a;
    public icck b;
    public bugm c;

    public EscalationCardChimeraService() {
        super(436, "com.google.android.gms.googleone.escalation.service.START", ibpu.a, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        icck icck1;
        cjts cjts1;
        ibuq.f(getServiceRequest0, "request");
        if(httz.c()) {
            cjts cjts0 = this.a;
            if(cjts0 == null) {
                ibuq.j("asyncOperationDispatcher");
                cjts1 = null;
            }
            else {
                cjts1 = cjts0;
            }
            bugm bugm0 = this.c;
            if(bugm0 == null) {
                ibuq.j("escalationCardServiceImpl");
                bugm0 = null;
            }
            String s = getServiceRequest0.f;
            ibuq.e(s, "getCallingPackage(...)");
            bugk bugk0 = new bugk(((budd)bugm0.a.a.get()), ((bufn)bugm0.a.b.get()), ((buqz)bugm0.a.c.get()), ((buav)bugm0.a.d.get()), s);
            String s1 = getServiceRequest0.f;
            ibuq.e(s1, "getCallingPackage(...)");
            String s2 = getServiceRequest0.p;
            icck icck0 = this.b;
            if(icck0 == null) {
                ibuq.j("coroutineScope");
                icck1 = null;
            }
            else {
                icck1 = icck0;
            }
            cjtn0.c(new bugc(cjts1, bugk0, s1, s2, icck1));
            return;
        }
        cjtn0.a(23, null);
    }
}

