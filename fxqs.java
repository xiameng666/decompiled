import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class fxqs {
    public final String a;
    private gztn b;
    private long c;
    private boolean d;

    public fxqs(String s) {
        this.b = null;
        this.c = 0L;
        this.d = false;
        this.a = s;
    }

    public final gztn a(Context context0) {
        synchronized(this) {
            if(SystemClock.elapsedRealtime() > this.c) {
                SystemClock.elapsedRealtime();
                this.d(context0);
            }
        }
        return this.b;
    }

    public final void b() {
        synchronized(this) {
            if(!this.d) {
                this.c = 0L;
                this.d = true;
                return;
            }
            this.d = false;
        }
    }

    final void c(ExperimentTokens experimentTokens0) {
        gztn gztn0;
        synchronized(this) {
            if(experimentTokens0 == null) {
                gztn0 = null;
            }
            else {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gztn.a).v_newBuilder();
                byte[] arr_b = experimentTokens0.d;
                ArrayList arrayList0 = fxqs.e(experimentTokens0.e);
                ArrayList arrayList1 = fxqs.e(experimentTokens0.f);
                ArrayList arrayList2 = fxqs.e(experimentTokens0.g);
                ArrayList arrayList3 = fxqs.e(experimentTokens0.h);
                ArrayList arrayList4 = fxqs.e(experimentTokens0.j);
                if(arr_b != null) {
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gztn gztn1 = (gztn)hftp0.b_message;
                    gztn1.b |= 1;
                    gztn1.c = hfsf0;
                }
                if(arrayList0 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gztn gztn2 = (gztn)hftp0.b_message;
                    hfuo hfuo0 = gztn2.d;
                    if(!hfuo0.c()) {
                        gztn2.d = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(arrayList0, gztn2.d);
                }
                if(arrayList1 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gztn gztn3 = (gztn)hftp0.b_message;
                    hfuo hfuo1 = gztn3.e;
                    if(!hfuo1.c()) {
                        gztn3.e = ProtoLiteMessage.E(hfuo1);
                    }
                    hfrj.E(arrayList1, gztn3.e);
                }
                if(arrayList2 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gztn gztn4 = (gztn)hftp0.b_message;
                    hfuo hfuo2 = gztn4.f;
                    if(!hfuo2.c()) {
                        gztn4.f = ProtoLiteMessage.E(hfuo2);
                    }
                    hfrj.E(arrayList2, gztn4.f);
                }
                if(arrayList3 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gztn gztn5 = (gztn)hftp0.b_message;
                    hfuo hfuo3 = gztn5.g;
                    if(!hfuo3.c()) {
                        gztn5.g = ProtoLiteMessage.E(hfuo3);
                    }
                    hfrj.E(arrayList3, gztn5.g);
                }
                if(arrayList4 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gztn gztn6 = (gztn)hftp0.b_message;
                    hfuo hfuo4 = gztn6.h;
                    if(!hfuo4.c()) {
                        gztn6.h = ProtoLiteMessage.E(hfuo4);
                    }
                    hfrj.E(arrayList4, gztn6.h);
                }
                gztn0 = (gztn)hftp0.N_build();
            }
            this.b = gztn0;
            this.f();
            this.d = false;
        }
    }

    public final void d(Context context0) {
        synchronized(this) {
            this.f();
            new fxqr(this, context0).start();
        }
    }

    private static ArrayList e(byte[][] arr2_b) {
        if(arr2_b != null && arr2_b.length != 0) {
            ArrayList arrayList0 = new ArrayList(arr2_b.length);
            for(int v = 0; v < arr2_b.length; ++v) {
                byte[] arr_b = arr2_b[v];
                if(arr_b != null && arr_b.length != 0) {
                    arrayList0.add(ByteString.copyFrom(arr_b));
                }
            }
            return arrayList0;
        }
        return null;
    }

    private final void f() {
        this.c = SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(hzek.a.i().F());
    }
}

