import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public abstract class aqqn {
    public static final baun a;
    public final Context b;
    public long c;
    public long d;
    public final ProtoLiteBuilder e;
    public ProtoLiteBuilder f;
    private final ArrayList g;

    static {
        aqqn.a = aqql.a("MigrateLogger");
    }

    protected aqqn(Context context0) {
        this.g = new ArrayList();
        this.b = context0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkyf.a).v_newBuilder();
        this.e = hftp0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyf hkyf0 = (hkyf)hftp0.b_message;
        hkyf0.b |= 1;
        hkyf0.c = -10;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkyx.a).v_newBuilder();
        this.f = hftp1;
        hkym hkym0 = hkym.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkyx hkyx0 = (hkyx)hftp1.b_message;
        hkym0.getClass();
        hkyx0.i = hkym0;
        hkyx0.b |= 0x20;
        ProtoLiteBuilder hftp2 = this.f;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hkyx)hftp2.b_message).c = 0;
        ((hkyx)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = this.f;
        int v = this.a();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hkyx hkyx1 = (hkyx)hftp3.b_message;
        hkyx1.b |= 4;
        hkyx1.f = v;
        this.c = SystemClock.elapsedRealtime();
    }

    public final int a() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = jwe.b(this.b, null, intentFilter0, 2);
        if(intent0 != null) {
            int v = intent0.getIntExtra("level", -1);
            int v1 = intent0.getIntExtra("scale", -1);
            return v < 0 || v1 <= 0 ? -1 : v * 100 / v1;
        }
        return -1;
    }

    public abstract void b(hkyx arg1);

    public final void c(int v) {
        aqqn.a.d("logMigrateStatusCode: %d", new Object[]{v});
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyf hkyf0 = (hkyf)hftp0.b_message;
        hkyf0.b |= 1;
        hkyf0.c = v;
    }

    public final void d(int v, long v1) {
        ArrayList arrayList0 = this.g;
        synchronized(arrayList0) {
            if(((long)arrayList0.size()) >= hqhq.a.j().n()) {
                aqqn.a.m("Not logging USB transport error to ClearCut - too many errors", new Object[0]);
                return;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkzf.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hkzf)hftv0).b |= 1;
            ((hkzf)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkzf hkzf0 = (hkzf)hftp0.b_message;
            hkzf0.b |= 2;
            hkzf0.d = v1;
            arrayList0.add(((hkzf)hftp0.N_build()));
        }
    }

    protected void e() {
    }

    public final void f() {
        String s;
        long v = SystemClock.elapsedRealtime();
        ProtoLiteBuilder hftp0 = this.f;
        long v1 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyx hkyx0 = (hkyx)hftp0.b_message;
        hkyx0.b |= 16;
        hkyx0.h = v1;
        ProtoLiteBuilder hftp1 = this.f;
        long v2 = v - this.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkyx hkyx1 = (hkyx)hftp1.b_message;
        hkyx1.b |= 2;
        hkyx1.d = v2;
        ProtoLiteBuilder hftp2 = this.f;
        int v3 = this.a();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hkyx hkyx2 = (hkyx)hftp2.b_message;
        hkyx2.b |= 8;
        hkyx2.g = v3;
        this.b(((hkyx)this.f.N_build()));
        ArrayList arrayList0 = this.g;
        synchronized(arrayList0) {
            ProtoLiteBuilder hftp3 = this.e;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hkyf)hftp3.b_message).g = hfvv.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hkyf hkyf0 = (hkyf)hftp3.b_message;
            hfuo hfuo0 = hkyf0.g;
            if(!hfuo0.c()) {
                hkyf0.g = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, hkyf0.g);
        }
        int v5 = this.g();
        this.e();
        hkyf hkyf1 = (hkyf)this.e.N_build();
        if(hqhq.a.j().aG()) {
            cczb cczb0 = cdrz.v().c(((ProtoLiteMessage)hkyf1));
            if(v5 == 0) {
                throw null;
            }
            cczb0.c = (int)(v5 - 1);
            cczb0.a();
            baun baun0 = aqqn.a;
            int v6 = hkyf1.b;
            if((v6 & 8) != 0) {
                s = (hkyf1.e == null ? hkyg.a : hkyf1.e).c;
            }
            else if((v6 & 16) == 0) {
                s = (v6 & 4) == 0 ? "[no tracer found]" : "[iOS session has no tracer]";
            }
            else {
                s = (hkyf1.f == null ? hkyh.a : hkyf1.f).b;
            }
            baun0.h("Sending log to clearcut with tracer %s", new Object[]{s});
            return;
        }
        File file0 = aqze.c(this.b, "migrate_log_files");
        String s1 = "migrate_logs_" + new Date().getTime() + ".txt";
        File file1 = hrnt.i() ? new File(ccsb.a.b(file0, s1)) : new File(file0, s1);
        Object[] arr_object = {file1.getAbsolutePath()};
        aqze.a.h("Dumping logs to file %s", arr_object);
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file1)) {
            hkyf1.writeToStream(fileOutputStream0);
        }
        catch(IOException iOException0) {
            aqze.a.n("Failed writing logs to file", iOException0, new Object[0]);
        }
    }

    protected abstract int g();

    public final void h(hkyj hkyj0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkyl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hkyl)hftv0).c = hkyj0.d;
        ((hkyl)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkyl)hftp0.b_message).d = v - 1;
        ((hkyl)hftp0.b_message).b |= 2;
        long v1 = SystemClock.elapsedRealtime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyl hkyl0 = (hkyl)hftp0.b_message;
        hkyl0.b |= 4;
        hkyl0.e = v1;
        hkyl hkyl1 = (hkyl)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.f;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkyx hkyx0 = (hkyx)hftp1.b_message;
        hkyl1.getClass();
        hfuo hfuo0 = hkyx0.e;
        if(!hfuo0.c()) {
            hkyx0.e = ProtoLiteMessage.E(hfuo0);
        }
        hkyx0.e.add(hkyl1);
    }
}

