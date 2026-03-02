import android.content.ComponentName;
import android.os.SystemClock;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public final class cajw implements Runnable {
    public final String a;

    public cajw(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        PrintWriter printWriter0;
        cajs cajs0 = cajs.c();
        if(cajs0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisx)hftp0.b_message).b = 1;
            long v = SystemClock.elapsedRealtime();
            gged_interceptors gged0 = cajt.d(cajs0.e, this.a);
            if(gged0 == null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gisx)hftp0.b_message).i = 2;
                cakj.a().b(((gisx)hftp0.N_build()));
                cakj.a().c(30);
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            for(int v1 = 0; v1 < ((ggna)gged0).c; ++v1) {
                cajj cajj0 = (cajj)gged0.get(v1);
                if(cajj0.b()) {
                    arrayList1.add(cajj0.c);
                }
                gops gops0 = cajs.d(cajj0);
                if(gops0 != null) {
                    arrayList0.add(gops0);
                }
            }
            int v2 = arrayList0.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisx)hftp0.b_message).c = v2;
            if(arrayList0.isEmpty()) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gisx)hftp0.b_message).i = 1;
                long v3 = SystemClock.elapsedRealtime() - v;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gisx)hftp0.b_message).j = v3;
                cakj.a().b(((gisx)hftp0.N_build()));
                return;
            }
            evql evql0 = cajs0.c.g(((gops[])arrayList0.toArray(new gops[arrayList0.size()])));
            evql0.b(new cajq(((gisx)hftp0.N_build()), v));
            evql0.A(new cajr(0x1F, ((gisx)hftp0.N_build()), v));
            Object object0 = caju.b;
            __monitor_enter(object0);
            try {
                printWriter0 = null;
                try {
                    printWriter0 = new PrintWriter(new BufferedWriter(new FileWriter(cajs0.d.c.getFileStreamPath("apps_3p_corpus_component_names.txt"), true)));
                    Iterator iterator0 = arrayList1.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_62;
                        }
                        Object object1 = iterator0.next();
                        printWriter0.println(((ComponentName)object1).flattenToString());
                    }
                }
                catch(IOException iOException0) {
                }
                a.ae(caju.a.i(), "Failed to append to component name file.", iOException0);
                if(printWriter0 != null) {
                    goto label_56;
                }
                goto label_67;
            }
            catch(Throwable throwable0) {
                goto label_59;
            }
            try {
            label_56:
                printWriter0.close();
                goto label_67;
            }
            catch(RuntimeException unused_ex) {
                goto label_67;
            }
            catch(Throwable throwable1) {
                __monitor_exit(object0);
                throw throwable1;
            }
        label_59:
            if(printWriter0 != null) {
                try {
                    try {
                        printWriter0.close();
                    }
                    catch(RuntimeException unused_ex) {
                    }
                    throw throwable0;
                    try {
                    label_62:
                        printWriter0.close();
                    }
                    catch(RuntimeException unused_ex) {
                    }
                    goto label_67;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(object0);
                    throw throwable1;
                }
            }
            throw throwable0;
        label_67:
            __monitor_exit(object0);
        }
    }
}

