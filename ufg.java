import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import jeb.synthetic.FIN;

public final class ufg implements ufa {
    private final ufp a;
    private final File b;
    private final ufe c;
    private tyi d;

    @Deprecated
    public ufg(File file0) {
        this.c = new ufe();
        this.b = file0;
        this.a = new ufp();
    }

    @Override  // ufa
    public final File a(uay uay0) {
        String s = this.a.a(uay0);
        try {
            tyh tyh0 = this.d().a(s);
            return tyh0 == null ? null : tyh0.a[0];
        }
        catch(IOException iOException0) {
            if(!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", iOException0);
            return null;
        }
    }

    @Override  // ufa
    public final void b() {
        int v1;
        synchronized(this) {
            try {
                v1 = FIN.finallyOpen$NT();
                this.d().c();
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", iOException0);
                }
            }
        }
        FIN.finallyCodeBegin$NT(v1);
        this.e();
        FIN.finallyCodeEnd$NT(v1);
    }

    @Override  // ufa
    public final void c(uay uay0, ucr ucr0) {
        ufc ufc1;
        ufc ufc0;
        ufe ufe0 = this.c;
        String s = this.a.a(uay0);
        synchronized(ufe0) {
            ufc0 = (ufc)ufe0.a.get(s);
            if(ufc0 == null) {
                synchronized(ufe0.b.a) {
                    ufc1 = (ufc)ufe0.b.a.poll();
                }
                ufc0 = ufc1 == null ? new ufc() : ufc1;
                ufe0.a.put(s, ufc0);
            }
            ++ufc0.b;
        }
        ufc0.a.lock();
        try {
            tyi tyi0 = this.d();
            if(tyi0.a(s) == null) {
                tyf tyf0 = tyi0.j(s);
                if(tyf0 == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + s);
                }
                try {
                    tyi tyi1 = tyf0.d;
                    synchronized(tyi1) {
                        tyg tyg0 = tyf0.a;
                        if(tyg0.f != tyf0) {
                            throw new IllegalStateException();
                        }
                        if(!tyg0.e) {
                            tyf0.b[0] = true;
                        }
                        File file0 = tyg0.d();
                        tyi1.a.mkdirs();
                    }
                    if(ucr0.a.a(ucr0.b, file0, ucr0.c)) {
                        tyi1.b(tyf0, true);
                        tyf0.c = true;
                    }
                }
                finally {
                    tyf0.b();
                }
            }
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", iOException0);
            }
        }
        finally {
            this.c.a(s);
        }
    }

    private final tyi d() {
        synchronized(this) {
            if(this.d == null) {
                File file0 = this.b;
                File file1 = new File(file0, "journal.bkp");
                if(file1.exists()) {
                    File file2 = new File(file0, "journal");
                    if(file2.exists()) {
                        file1.delete();
                    }
                    else {
                        tyi.g(file1, file2, false);
                    }
                }
                tyi tyi0 = new tyi(file0);
                if(tyi0.b.exists()) {
                    try {
                        tyi0.e();
                        tyi.d(tyi0.c);
                        Iterator iterator0 = tyi0.g.values().iterator();
                        while(true) {
                        label_16:
                            if(!iterator0.hasNext()) {
                                this.d = tyi0;
                                return this.d;
                            }
                            Object object0 = iterator0.next();
                            tyg tyg0 = (tyg)object0;
                            if(tyg0.f == null) {
                                for(int v2 = 0; v2 < tyi0.d; v2 = 1) {
                                    tyi0.e += tyg0.b[0];
                                }
                            }
                            else {
                                tyg0.f = null;
                                for(int v1 = 0; v1 < tyi0.d; v1 = 1) {
                                    tyi.d(tyg0.c());
                                    tyi.d(tyg0.d());
                                }
                                iterator0.remove();
                            }
                        }
                    }
                    catch(IOException iOException0) {
                        System.out.println("DiskLruCache " + file0.toString() + " is corrupt: " + iOException0.getMessage() + ", removing");
                        tyi0.c();
                        goto label_39;
                    }
                    goto label_16;
                }
                else {
                label_39:
                    file0.mkdirs();
                    tyi0 = new tyi(file0);
                    tyi0.f();
                }
                this.d = tyi0;
            }
        }
        return this.d;
    }

    private final void e() {
        synchronized(this) {
            this.d = null;
        }
    }
}

