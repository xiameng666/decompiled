package com.google.android.gms.ads.internal.clearcut;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import ccsb;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.m;
import hfrj;
import hfui;
import hfvb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public final class b {
    private final g a;
    private final boolean b;
    private final ProtoLiteBuilder c;

    public b() {
        this.c = ((ProtoLiteMessage)i.a).v_newBuilder();
        this.b = false;
        this.a = new g();
    }

    public b(g g0) {
        this.c = ((ProtoLiteMessage)i.a).v_newBuilder();
        this.a = g0;
        this.b = ((Boolean)s.aD.g()).booleanValue();
    }

    public final void a(a a0) {
        synchronized(this) {
            if(this.b) {
                try {
                    a0.a(this.c);
                }
                catch(NullPointerException nullPointerException0) {
                    c.d().c(nullPointerException0, "AdMobClearcutLogger.modify");
                }
            }
        }
    }

    public final void b(int v) {
        synchronized(this) {
            if(!this.b) {
                return;
            }
            if(((Boolean)s.aE.g()).booleanValue()) {
                this.d(v);
                return;
            }
            this.e(v);
        }
    }

    private final String c(int v) {
        String s;
        synchronized(this) {
            s = String.format("id=%s,timestamp=%s,event=%s,data=%s\n", ((i)this.c.b_message).c, SystemClock.elapsedRealtime(), ((int)(v - 1)), Base64.encodeToString(((i)this.c.N_build()).toBytesArray(), 3));
        }
        return s;
    }

    private final void d(int v) {
        FileOutputStream fileOutputStream0;
        synchronized(this) {
            File file0 = Environment.getExternalStorageDirectory();
            if(file0 == null) {
                return;
            }
            File file1 = new File(ccsb.a.b(file0, "clearcut_events.txt"));
            try {
                fileOutputStream0 = new FileOutputStream(file1, true);
            }
            catch(FileNotFoundException unused_ex) {
                return;
            }
            try {
                fileOutputStream0.write(this.c(v).getBytes());
                goto label_22;
            }
            catch(IOException unused_ex) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                return;
            }
            catch(Throwable throwable0) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                try {
                    throw throwable0;
                }
                catch(FileNotFoundException unused_ex) {
                }
            }
        }
        return;
        try {
        label_22:
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    private final void e(int v) {
        synchronized(this) {
            ProtoLiteBuilder hftp0 = this.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((i)hftp0.b_message).d = hfvb.a;
            List list0 = m.b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            i i0 = (i)hftp0.b_message;
            hfui hfui0 = i0.d;
            if(!hfui0.c()) {
                i0.d = ProtoLiteMessage.D(hfui0);
            }
            hfrj.E(list0, i0.d);
            byte[] arr_b = ((i)hftp0.N_build()).toBytesArray();
            f f0 = new f(this.a, arr_b);
            f0.a = v - 1;
            f0.b();
        }
    }
}

