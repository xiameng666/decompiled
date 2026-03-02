import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class kbu {
    public int a;
    public jqt b;
    public Object c;
    public boolean d;

    public kbu() {
        this.a = 3000;
        this.d = false;
    }

    public final void a(Object object0) {
        if(!this.d) {
            throw new IllegalStateException("Calling complete() without active operation.");
        }
        jqt jqt0 = this.b;
        if(jqt0 != null) {
            jqt0.b(object0);
            this.c = object0;
        }
    }

    public final void b(Object object0) {
        synchronized(this) {
            if(this.d) {
                jqt jqt0 = this.b;
                if(jqt0 != null) {
                    jqt0.b(object0);
                    this.c = object0;
                }
            }
        }
    }

    public final boolean c(Runnable runnable0, String s) {
        this.c = null;
        if(this.d) {
            throw new IllegalStateException("Calling execOperation() while operation is running.");
        }
        boolean z = true;
        this.d = true;
        gmcd gmcd0 = jqy.a(new kbt(this, runnable0, s));
        try {
            Object object0 = gmcd0.get(((long)this.a), TimeUnit.MILLISECONDS);
            this.c = object0;
            goto label_21;
        }
        catch(TimeoutException timeoutException0) {
            Log.w("UwbBackend", String.format("Callback timeout in Op %s", s), timeoutException0);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(ExecutionException executionException0) {
            Log.w("UwbBackend", String.format("ExecutionException in Op %s", s), executionException0);
        }
        finally {
            this.b = null;
            this.d = false;
        }
        return false;
    label_21:
        if(object0 == null) {
            z = false;
        }
        return z;
    }
}

