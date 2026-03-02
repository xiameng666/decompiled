package com.google.android.gms.icing.service;

import Parser;
import ProtoLiteMessage;
import abxn;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import azql;
import bbqe;
import bwne;
import bwoc;
import bwpx;
import bwqb;
import bwsx;
import bwts;
import bwtu;
import bxfz;
import bxgd;
import bxgu;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import gmcg;
import gopj;
import hubn;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

public class LightweightIndexChimeraService extends cjtg {
    private static bxgd a;
    private static bxfz b;
    private static bxgu c;
    private bwts d;

    public LightweightIndexChimeraService() {
        super(19, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        bxgd bxgd0 = LightweightIndexChimeraService.a;
        bxfz bxfz0 = LightweightIndexChimeraService.b;
        bxgu bxgu0 = LightweightIndexChimeraService.c;
        bwts bwts0 = this.d;
        if(bxgd0 != null && bxfz0 != null && bxgu0 != null && bwts0 != null) {
            String s = getServiceRequest0.f;
            int v = getServiceRequest0.e;
            gmcg gmcg0 = this.e;
            cjts cjts0 = this.l();
            new bwtu(this);
            cjtn0.c(new abxn(this, gmcg0, cjts0, s, v, bxgu0, bwts0, bwsx.a(this), bxgd0, bxfz0, azql.c(this), new gopj(this), getServiceRequest0.f, getServiceRequest0.p));
            return;
        }
        bwne.a("LightweightIndexService is unavailable on this device");
        cjtn0.a(16, new Bundle());
    }

    @Override  // cjtg
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        String s3;
        boolean z1;
        printWriter0.println("LightweightIndexChimeraService");
        bxgu bxgu0 = LightweightIndexChimeraService.c;
        if(bxgu0 != null) {
            printWriter0.println("  Pending usage reports:");
            File file0 = bxgu0.a.getFileStreamPath(bxgu0.b);
            try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
                long v = file0.length();
                Parser hfvs0 = (Parser)((ProtoLiteMessage)bwpx.a).jf(7, null);
                bbqe bbqe0 = new bbqe(fileInputStream0, v, bwpx.class, hfvs0);
                boolean z = Log.isLoggable("Icing", 2);
                while(true) {
                    if(!bbqe0.hasNext()) {
                        break;
                    }
                    Object object0 = bbqe0.next();
                    bwpx bwpx0 = (bwpx)object0;
                    String s = bwpx0.c;
                    bwqb bwqb0 = bwqb.b(bwpx0.i);
                    if(bwqb0 == null) {
                        bwqb0 = bwqb.a;
                    }
                    Long long0 = (long)bwpx0.h;
                    z1 = (bwpx0.b & 0x80) != 0;
                    Boolean boolean0 = Boolean.valueOf(z1);
                    String s1 = bwpx0.e;
                    String s2 = bwpx0.f;
                    s3 = z ? bwpx0.g : "<redacted>";
                    bwoc bwoc0 = bwoc.b(bwpx0.m);
                    if(bwoc0 == null) {
                        bwoc0 = bwoc.a;
                    }
                    printWriter0.println("    " + String.format("From %s: type=%s, ts=%d, has_doc=%b Doc[package=%s corpus=%s, uri=%s, status=%s]", s, bwqb0, long0, boolean0, s1, s2, s3, bwoc0));
                }
            }
            catch(IOException unused_ex) {
                printWriter0.println("    <empty>");
            }
            printWriter0.println();
        }
        bxgd bxgd0 = LightweightIndexChimeraService.a;
        if(bxgd0 != null) {
            bxgd0.b(printWriter0);
        }
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        if(hubn.i()) {
            Class class0 = LightweightIndexChimeraService.class;
            synchronized(class0) {
                if(LightweightIndexChimeraService.c == null) {
                    LightweightIndexChimeraService.c = new bxgu(this, "appdatasearch_usage");
                }
            }
            if(LightweightIndexChimeraService.a == null) {
                LightweightIndexChimeraService.a = new bxgd();
            }
            if(LightweightIndexChimeraService.b == null) {
                LightweightIndexChimeraService.b = new bxfz();
            }
            this.d = new bwts(this);
        }
    }

    @Override  // cjtg
    public final void onDestroy() {
        bxgu bxgu0 = LightweightIndexChimeraService.c;
        if(bxgu0 != null) {
            bxgu0.d();
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        return false;
    }
}

