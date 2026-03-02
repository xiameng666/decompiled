package com.google.android.gms.significantplaces.shim;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import bbpd;
import cclw;
import com.google.android.chimera.BoundService;
import epmt;
import epmw;
import epmx;
import epmy;
import epmz;
import epna;
import ibuq;
import icbb;
import icck;
import iccl;
import ichv;
import icjj;
import icjm;
import icjr;
import iclv;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class SignificantPlacesShimChimeraService extends BoundService {
    private final icck a;
    private epna b;

    public SignificantPlacesShimChimeraService() {
        this.a = iccl.b(cclw.f);
    }

    @Override  // com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        ibuq.f(fileDescriptor0, "fd");
        ibuq.f(printWriter0, "writer");
        ibuq.f(arr_s, "args");
        bbpd bbpd0 = new bbpd(printWriter0, "  ");
        bbpd0.println();
        bbpd0.b();
        epna epna0 = this.b;
        if(epna0 != null) {
            bbpd0.print("mandatory biometrics: ");
            bbpd0.println(epna0.e != null);
        }
        bbpd0.a();
    }

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        if(ibuq.m(intent0.getAction(), "com.android.trust.provider.SignificantPlaceProvider.BIND")) {
            if(Build.VERSION.SDK_INT < 35) {
                throw new IllegalStateException("Check failed.");
            }
            if(this.b == null) {
                epna epna0 = new epna(this, this.a);
                this.b = epna0;
                ibuq.c(epna0);
                epmt epmt0 = new epmt(new icjm(new icjr(new iclv(icjj.a(new ichv(new epmw(epna0, null))), new epmx(epna0, null)), new epmy(null)), new epmz(epna0, null)), null);
                icbb.b(epna0.b, epna0.c, null, epmt0, 2);
            }
            epna epna1 = this.b;
            ibuq.c(epna1);
            return epna1.getBinder();
        }
        return null;
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onDestroy() {
        iccl.i(this.a);
    }
}

