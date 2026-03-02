import java.util.ArrayList;
import java.util.Queue;

public final class cqta implements Runnable {
    public final cqtn a;

    public cqta(cqtn cqtn0) {
        this.a = cqtn0;
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        cqtn cqtn0 = this.a;
        while(!cqtn0.k) {
            try {
                arrayList0.clear();
                synchronized(cqtn0.w) {
                    arrayList0.addAll(cqtn0.w);
                    cqtn0.w.clear();
                }
                if(((Boolean)cqtn0.b.mr()).booleanValue()) {
                    arrayList1.clear();
                    synchronized(cqtn0.x) {
                        arrayList1.addAll(cqtn0.x);
                        cqtn0.x.clear();
                    }
                    cqsz cqsz0 = cqtn0.m;
                    if(cqsz0 != null) {
                        cqtn0.e(arrayList1, cqsz0);
                    }
                }
                cqsz cqsz1 = cqtn0.l;
                if(cqsz1 != null) {
                    cqtn0.e(arrayList0, cqsz1);
                }
                Queue queue0 = cqtn0.w;
                synchronized(queue0) {
                    boolean z = false;
                    Queue queue1 = cqtn0.x;
                    synchronized(queue1) {
                        if(queue0.isEmpty() && queue1.isEmpty()) {
                            z = true;
                        }
                    }
                }
                if(!z) {
                    continue;
                }
                Thread.sleep(((Long)cqtn0.c.mr()).longValue());
                continue;
            }
            catch(InterruptedException unused_ex) {
                continue;
            }
            catch(Throwable throwable0) {
            }
            cqtn.a.a("Send thread stopped.");
            try {
                cqsz cqsz2 = cqtn0.l;
                if(cqsz2 != null) {
                    cqsz2.c();
                }
            }
            catch(Exception exception0) {
                a.ae(cqtn.a.a.i(), "Failed to leave the group.", exception0);
            }
            try {
                cqsz cqsz3 = cqtn0.l;
                if(cqsz3 != null) {
                    cqsz3.b();
                }
                cqsz cqsz4 = cqtn0.m;
                if(cqsz4 != null) {
                    cqsz4.b();
                }
            }
            catch(RuntimeException runtimeException0) {
                a.ae(cqtn.a.a.i(), "Failed to close the mdns socket.", runtimeException0);
            }
            throw throwable0;
        }
        cqtn.a.a("Send thread stopped.");
        try {
            cqsz cqsz5 = cqtn0.l;
            if(cqsz5 != null) {
                cqsz5.c();
            }
        }
        catch(Exception exception1) {
            a.ae(cqtn.a.a.i(), "Failed to leave the group.", exception1);
        }
        try {
            cqsz cqsz6 = cqtn0.l;
            if(cqsz6 != null) {
                cqsz6.b();
            }
            cqsz cqsz7 = cqtn0.m;
            if(cqsz7 != null) {
                cqsz7.b();
            }
        }
        catch(RuntimeException runtimeException1) {
            a.ae(cqtn.a.a.i(), "Failed to close the mdns socket.", runtimeException1);
        }
    }
}

