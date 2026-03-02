package com.google.android.location.quake.ealert;

import ProtoLiteMessage;
import android.content.Intent;
import android.os.Bundle;
import bbcu;
import bboh;
import bsoa;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import fxjt;
import fxkh;
import fxki;
import fxle;
import fxmv;
import hftc;
import hfur;
import hgud;
import huqb;
import java.io.PrintWriter;
import java.util.function.Supplier;

public class GcmReceiverChimeraService extends TracingIntentService {
    public static boolean a;
    public static final Supplier b;
    private static final fxmv c;

    static {
        bboh.c("EAlert", bbcu.g, "Gcm");
        fxki fxki0 = new fxki();
        GcmReceiverChimeraService.b = fxki0;
        GcmReceiverChimeraService.c = new fxmv(50, fxki0);
    }

    public GcmReceiverChimeraService() {
        super("EalertGcmReceiverService");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        try {
            fxmv fxmv0 = GcmReceiverChimeraService.c;
            fxmv0.d(1);
            if(intent0 == null) {
                fxmv0.d(2);
            }
            else {
                boolean z = huqb.F();
                fxmv0.e(3, Boolean.toString(z));
                if(z) {
                    Bundle bundle0 = intent0.getExtras();
                    if(bundle0 == null) {
                        fxmv0.d(4);
                    }
                    else {
                        byte[] arr_b = bundle0.getByteArray("rawData");
                        hgud hgud0 = null;
                        if(arr_b == null) {
                            fxmv0.d(8);
                        }
                        else {
                            fxmv0.d(7);
                            try {
                                hftc hftc0 = hftc.a();
                                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgud.a), arr_b, 0, arr_b.length, hftc0);
                                ProtoLiteMessage.P_makeImmutable(hftv0);
                                fxmv0.d(9);
                                hgud0 = (hgud)hftv0;
                            }
                            catch(hfur unused_ex) {
                                GcmReceiverChimeraService.c.d(10);
                            }
                        }
                        if(hgud0 == null) {
                            String s = bundle0.getString("ea.msg");
                            if(s == null) {
                                GcmReceiverChimeraService.c.d(5);
                            }
                            else {
                                GcmReceiverChimeraService.c.d(6);
                                if(huqb.E()) {
                                    fxjt fxjt1 = fxjt.c;
                                    if(fxjt1 != null) {
                                        fxle fxle2 = fxjt1.g;
                                        if(fxle2 != null) {
                                            fxle2.f(s);
                                        }
                                    }
                                }
                                else {
                                    fxkh fxkh1 = fxkh.c;
                                    if(fxkh1 != null) {
                                        fxle fxle3 = fxkh1.g;
                                        if(fxle3 != null) {
                                            fxle3.f(s);
                                        }
                                    }
                                }
                            }
                        }
                        else if(huqb.E()) {
                            fxjt fxjt0 = fxjt.c;
                            if(fxjt0 != null) {
                                fxle fxle0 = fxjt0.g;
                                if(fxle0 != null) {
                                    fxle0.e(hgud0);
                                }
                            }
                        }
                        else {
                            fxkh fxkh0 = fxkh.c;
                            if(fxkh0 != null) {
                                fxle fxle1 = fxkh0.g;
                                if(fxle1 != null) {
                                    fxle1.e(hgud0);
                                }
                            }
                        }
                    }
                }
            }
        }
        finally {
            bsoa.b(intent0);
        }
    }

    public static void b(PrintWriter printWriter0) {
        printWriter0.println("##GcmS Start");
        GcmReceiverChimeraService.c.c(printWriter0);
        printWriter0.println("##GcmS End");
    }
}

