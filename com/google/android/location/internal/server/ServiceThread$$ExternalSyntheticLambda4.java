package com.google.android.location.internal.server;

import bzs;
import com.google.android.gms.libs.platform.foreground.ForegroundHelper.ForegroundListener;
import fwom;
import fwoo;
import fwqq;
import fwqt;
import humv;

public final class ServiceThread..ExternalSyntheticLambda4 implements ForegroundHelper.ForegroundListener {
    public final fwqt a;

    public ServiceThread..ExternalSyntheticLambda4(fwqt fwqt0) {
        this.a = fwqt0;
    }

    @Override  // com.google.android.gms.libs.platform.foreground.ForegroundHelper$ForegroundListener
    public final void a(int v, boolean z) {
        fwqq fwqq0 = new fwqq(this.a);
        fwoo fwoo0 = this.a.s;
        synchronized(fwoo0) {
            for(int v2 = 0; true; ++v2) {
                bzs bzs0 = fwoo0.i;
                if(v2 >= bzs0.d_num) {
                    break;
                }
                fwom fwom0 = (fwom)bzs0.i(v2);
                if(fwom0.j != null && fwom0.j.getCreatorUid() == v) {
                    if(z) {
                        long v3 = fwom0.e;
                        if(fwom0.t > v3) {
                            fwom0.b(v3);
                            fwoo0.e();
                            fwqq0.a(fwoo0.l);
                            break;
                        }
                    }
                    else if(fwom0.t < humv.b()) {
                        fwom0.b(humv.b());
                        fwoo0.e();
                        fwqq0.a(fwoo0.l);
                        break;
                    }
                }
            }
        }
    }
}

