import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class arhv {
    public static final aqql a;
    public static final arhu b;
    public final byte[] c;
    public final gmcg d;
    public final gmcg e;
    public final arlk f;
    public final arqt g;
    public final BlockingQueue h;
    public final AtomicBoolean i;
    public final Queue j;
    protected final gful_cronetEngineProvider k;
    protected final gful_cronetEngineProvider l;
    protected final gful_cronetEngineProvider m;
    public final gmcg n;
    private final arjh o;

    static {
        arhv.a = (aqql)aqql.a("ContinuousStreamingSender");
        arhv.b = new arhu(null, null, -1L, 0L);
    }

    public arhv(arlk arlk0, arqt arqt0, arjh arjh0) {
        this.i = new AtomicBoolean(false);
        this.k = gfus.a(((gful_cronetEngineProvider)new arhl()));
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new arhm()));
        this.l = gful0;
        gful_cronetEngineProvider gful1 = gfus.a(((gful_cronetEngineProvider)new arhn()));
        this.m = gful1;
        this.f = arlk0;
        this.g = arqt0;
        this.o = arjh0;
        this.h = new ArrayBlockingQueue(((Long)gful0.mr()).intValue());
        this.c = new byte[((Long)gful1.mr()).intValue()];
        this.d = new bblp(1, 9);
        this.e = new bblp(1, 9);
        this.n = arjh0.c;
        this.j = new ArrayDeque();
    }

    public final void a(asbg asbg0) {
        ParcelFileDescriptor[] arr_parcelFileDescriptor1;
        asce asce0 = asbg0.b == null ? asce.a : asbg0.b;
        long v = ghgc.a.d(asbg0.c).c();
        if(this.o.F) {
            arhv.a.m("Protocol instance is disconnected and should not attempt to send items.", new Object[0]);
            return;
        }
        Queue queue0 = this.j;
        if(queue0.isEmpty() && this.h.isEmpty()) {
            queue0.addAll(asce0.d);
        }
        if(!this.i.get()) {
            arhv.a.h("Creating streaming pipe to send complete batch", new Object[0]);
            try {
                ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                arr_parcelFileDescriptor1 = new ParcelFileDescriptor[]{arr_parcelFileDescriptor[0], arr_parcelFileDescriptor[1]};
            }
            catch(IOException iOException0) {
                arhv.a.g("Failed to create pipe for continuous streaming", iOException0, new Object[0]);
                arr_parcelFileDescriptor1 = null;
            }
            if(arr_parcelFileDescriptor1 == null) {
                arhv.a.m("Failed to create streaming pipe. Sending items using normal flow for batchId: %d", new Object[]{v});
                this.b(asce0, this.j);
                return;
            }
            arhv.a.h("Sending items using continuous streaming for batchId: %d", new Object[]{v});
            ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(arr_parcelFileDescriptor1[0]);
            DataOutputStream dataOutputStream0 = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(arr_parcelFileDescriptor1[1]));
            arhk arhk0 = (/* MISSING LAMBDA PARAMETER */) -> try {
                parcelFileDescriptor$AutoCloseInputStream0.close();
            }
            catch(IOException iOException0) {
                arhv.a.g("Failed to close input stream", iOException0, new Object[0]);
            };
            this.f.k(parcelFileDescriptor$AutoCloseInputStream0, v, arhk0, hkyj.c);
            arhp arhp0 = new arhp(this, asce0, this.j);
            this.d.execute(arhp0);
            arhq arhq0 = new arhq(this, asce0, dataOutputStream0);
            gmbu.t(this.e.e(arhq0), new arht(this, v, asbg0), this.e);
            return;
        }
        arhv.a.h("Streaming cancelled for the batchId: %d", new Object[]{v});
    }

    public final void b(asce asce0, Queue queue0) {
        if(this.o.F) {
            arhv.a.m("Protocol instance is disconnected and should not attempt to send items.", new Object[0]);
            return;
        }
        asby asby0 = (asby)queue0.poll();
        if(asby0 != null) {
            arqo arqo0 = this.g.a((asce0.c == null ? asbk.a : asce0.c));
            InputStream inputStream0 = arhv.e(asby0, arqo0);
            long v = arqo0.e(asby0);
            arhr arhr0 = new arhr(this, asce0, asby0, arqo0, inputStream0, queue0);
            this.f.s(inputStream0, v, arhr0, hkyj.c);
        }
    }

    public static final void c(DataOutputStream dataOutputStream0) {
        try {
            dataOutputStream0.close();
        }
        catch(IOException iOException0) {
            arhv.a.g("Failed to close output stream", iOException0, new Object[0]);
        }
    }

    // Detected as a lambda impl.
    public static final void d(InputStream inputStream0) {
        try {
            inputStream0.close();
        }
        catch(IOException iOException0) {
            arhv.a.g("Failed to close input stream", iOException0, new Object[0]);
        }
    }

    public static final InputStream e(asby asby0, arqo arqo0) {
        try {
            return hqlt.z() ? new BufferedInputStream(arqo0.b(asby0), ((int)hqlt.g())) : arqo0.b(asby0);
        }
        catch(arra arra0) {
            arhv.a.g("Unable to get input stream for item: %s", arra0, new Object[]{asby0.e});
            return new arhw();
        }
    }
}

