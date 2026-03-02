import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class armf {
    public static final aqql a;
    public final BlockingQueue b;
    public final AtomicBoolean c;
    public final AtomicReference d;
    public final gmcg e;
    private final arme f;
    private final armj g;
    private final BlockingQueue h;
    private final gmcg i;

    static {
        armf.a = new aqql(new String[]{"UsbSender"});
    }

    public armf(armj armj0, gmcg gmcg0) {
        ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(((int)hqkp.a.b().a()));
        super();
        this.f = new arme(null, 0, null);
        this.c = new AtomicBoolean(true);
        this.d = new AtomicReference();
        this.g = armj0;
        this.b = arrayBlockingQueue0;
        this.h = new ArrayBlockingQueue(5);
        this.i = gmcg0;
        this.e = new bblp(1, 9);
    }

    public final void a(armd armd0) {
        armc armc0 = new armc(armd0);
        this.i.execute(armc0);
    }

    public final void b(armd armd0, long v) {
        boolean z;
        if(!this.c.get()) {
            this.a(armd0);
            return;
        }
        if(Long.compare(v, 0L) <= 0) {
            z = this.b.offer(armd0);
        }
        else {
            try {
                z = this.b.offer(armd0, v, TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                armf.a.g("Interrupted while waiting for queue; shutting down to avoid undefined behavior.", interruptedException0, new Object[0]);
                this.f();
                this.a(armd0);
                return;
            }
        }
        if(!z) {
            armf.a.f("Queue full; shutting down to avoid undefined behavior.", new Object[0]);
            this.f();
            this.a(armd0);
            return;
        }
        if(!this.c.get()) {
            this.f();
        }
    }

    public final void c(armd armd0) {
        IOException iOException1;
        int v;
        try {
            do {
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(0x100404);
                try {
                    byte[] arr_b = byteBuffer0.array();
                    v = armd0.b.read(arr_b, 0x404, 0x100000);
                    iOException1 = iOException0;
                    armf.a.d("Read number of bytes: %d", new Object[]{v});
                    iOException1 = null;
                }
                catch(IOException iOException0) {
                    armf.a.g("IOException on stream.", iOException1, new Object[0]);
                    v = 0;
                }
                arme arme0 = new arme(byteBuffer0, v, iOException1);
                this.h.put(arme0);
            }
            while(v == 0x100000);
        }
        catch(Throwable throwable0) {
            this.h.put(this.f);
            throw throwable0;
        }
    }

    public final void d() {
        armd armd0;
        while((armd0 = (armd)this.b.poll()) != null) {
            this.a(armd0);
        }
    }

    public final void e(armd armd0) {
        InputStream inputStream0 = armd0.b;
        if(inputStream0 == null) {
            return;
        }
        if((inputStream0 instanceof ByteArrayInputStream) && ((ByteArrayInputStream)inputStream0).available() < 0x100000 && this.h.size() < 5) {
            armf.a.j("Reading stream synchronously", new Object[0]);
            try {
                this.c(armd0);
            }
            catch(InterruptedException interruptedException0) {
                armf.a.g("Reading interrupted: ", interruptedException0, new Object[0]);
                Thread.currentThread().interrupt();
            }
            return;
        }
        armf.a.j("Scheduling asynchronous reading of stream", new Object[0]);
        armb armb0 = new armb(this, armd0);
        this.e.execute(armb0);
    }

    final void f() {
        if(!this.c.getAndSet(false)) {
            armf.a.d("shutdown() has already been called. Ignoring.", new Object[0]);
            return;
        }
        aqql aqql0 = armf.a;
        aqql0.d("The send thread run loop will terminate.", new Object[0]);
        this.d();
        armd armd0 = new armd(-1, null, new arma());
        if(!this.b.offer(armd0)) {
            aqql0.f("Send queue was unexpectedly full during shutdown.", new Object[0]);
        }
    }

    public final boolean g(armd armd0) {
        boolean z;
        int v6;
        try {
            arme arme0 = (arme)this.h.take();
            if(arme0 == this.f) {
                throw new RuntimeException("Unexpected exception happened on the reading thread");
            }
            int v = armd0.a;
            ByteBuffer byteBuffer0 = arme0.a;
            int v1 = arme0.b;
            IOException iOException0 = arme0.c;
            if(iOException0 != null) {
                if(v != 2) {
                    throw new RuntimeException(iOException0);
                }
                v1 = 0;
            }
            if(v1 == -1) {
                v1 = 0;
            }
            byteBuffer0.limit(v1 + 0x404);
            int v2 = v1 < 0x100000 ? 0 : 1;
            if(v != 2 && v2 != 0) {
                armf.a.f("Packet payload is too big: %d, expected max %d", new Object[]{v1, ((int)0x100000)});
                throw new RuntimeException("Packet payload is too big.");
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asco.a).v_newBuilder();
            if(iOException0 != null) {
                v1 = 0;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((asco)hftv0).b |= 2;
            ((asco)hftv0).d = v1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            int v3 = 4;
            ((asco)hftv1).b |= 4;
            ((asco)hftv1).e = v2 ^ 1;
            if(iOException0 == null) {
                v3 = ascq.a(v);
            }
            if(v3 != 0) {
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((asco)hftp0.b_message).c = v3 - 1;
                ((asco)hftp0.b_message).b |= 1;
            }
            long v4 = armd0.d;
            if(v4 != -1L) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                asco asco0 = (asco)hftp0.b_message;
                asco0.b |= 8;
                asco0.f = v4;
            }
            asco asco1 = (asco)hftp0.N_build();
            if(((ProtoLiteMessage)asco1).isImmutable()) {
                v6 = ((ProtoLiteMessage)asco1).t(null);
                if(v6 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v6);
                }
            }
            else {
                int v5 = asco1.memoizedSerializedSize & 0x7FFFFFFF;
                if(v5 == 0x7FFFFFFF) {
                    v5 = ((ProtoLiteMessage)asco1).t(null);
                    if(v5 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + v5);
                    }
                    asco1.memoizedSerializedSize = asco1.memoizedSerializedSize & 0x80000000 | v5;
                }
                v6 = v5;
            }
            byteBuffer0.position(0x400 - v6);
            byteBuffer0.putInt(v6);
            try {
                ((ProtoLiteMessage)(((asco)hftp0.N_build()))).writeTo(((CodedOutputStream)new hfso(byteBuffer0.array(), byteBuffer0.position(), v6)));
            }
            catch(IOException iOException1) {
                throw new RuntimeException(iOException1);
            }
            byteBuffer0.position(0x400 - v6);
            armj armj0 = this.g;
            int v7 = byteBuffer0.position();
            for(int v8 = byteBuffer0.limit() - byteBuffer0.position(); v8 > 0; v8 = 0) {
                armj0.d(byteBuffer0.array(), v7, v8);
                v7 += v8;
            }
            arlz arlz0 = new arlz(armd0, hftp0);
            this.i.execute(arlz0);
            asco asco2 = (asco)hftp0.b_message;
            if(!asco2.e) {
                switch(ascq.a(asco2.c)) {
                    case 0: {
                        z = false;
                        break;
                    }
                    case 3: {
                        z = true;
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
                batl.l(z);
                return true;
            }
        }
        catch(arln unused_ex) {
            armf.a.f("Write failed because of ConnectionShutdownException; shutting down.", new Object[0]);
            this.a(armd0);
            this.f();
        }
        catch(InterruptedException interruptedException0) {
            armf.a.g("Thread interrupted; shutting down.", interruptedException0, new Object[0]);
            Thread.currentThread().interrupt();
            this.a(armd0);
            this.f();
        }
        return false;
    }
}

