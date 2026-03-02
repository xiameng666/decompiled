import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class arhq implements Callable {
    public final arhv a;
    public final asce b;
    public final DataOutputStream c;

    public arhq(arhv arhv0, asce asce0, DataOutputStream dataOutputStream0) {
        this.a = arhv0;
        this.b = asce0;
        this.c = dataOutputStream0;
    }

    @Override
    public final Object call() {
        arhv arhv0 = this.a;
        asce asce0 = this.b;
        DataOutputStream dataOutputStream0 = this.c;
        try {
            try {
                while(true) {
                    AtomicBoolean atomicBoolean0 = arhv0.i;
                    if(atomicBoolean0.get()) {
                        break;
                    }
                    BlockingQueue blockingQueue0 = arhv0.h;
                    arhu arhu0 = (arhu)blockingQueue0.take();
                    if(arhu0 == arhv.b) {
                        arhv.a.h("All items of the batch sent.", new Object[0]);
                        blockingQueue0.clear();
                        break;
                    }
                    InputStream inputStream0 = arhu0.b;
                    long v = arhu0.c;
                    try {
                        try {
                            dataOutputStream0.writeLong(v);
                            dataOutputStream0.writeLong(arhu0.d);
                            if(inputStream0 == null) {
                                throw new IOException("InputStream cannot be null");
                            }
                            long v1;
                            for(v1 = 0L; true; v1 += (long)v2) {
                                byte[] arr_b = arhv0.c;
                                int v2 = inputStream0.read(arr_b);
                                if(v2 == -1 || atomicBoolean0.get()) {
                                    break;
                                }
                                dataOutputStream0.write(arr_b, 0, v2);
                            }
                            arhv.a.d("Bytes written: %d", new Object[]{v1});
                            dataOutputStream0.flush();
                        }
                        catch(IOException iOException0) {
                            arhv.a.f("IOException occurred while streaming. Sending error packet for itemId %d ", new Object[]{v});
                            arho arho0 = new arho(arhu0, asce0);
                            arhv0.f.r(v, arho0, hkyj.c);
                            throw iOException0;
                        }
                    }
                    catch(Throwable throwable1) {
                        if(inputStream0 != null) {
                            arhv.d(inputStream0);
                        }
                        throw throwable1;
                    }
                    arhv.d(inputStream0);
                }
            }
            catch(InterruptedException interruptedException0) {
                arhv.a.m("StreamingThread interrupted", new Object[0]);
                arhv0.i.set(true);
                Thread.currentThread().interrupt();
                throw interruptedException0;
            }
        }
        catch(Throwable throwable0) {
            arhv.c(dataOutputStream0);
            throw throwable0;
        }
        arhv.c(dataOutputStream0);
        return null;
    }
}

