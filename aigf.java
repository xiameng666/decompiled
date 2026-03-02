import android.content.Context;
import j..nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class aigf {
    public static final baun a;
    public final ReadWriteLock b;
    public final Context c;
    public hkww d;
    private static WeakReference e;

    static {
        aigf.e = new WeakReference(null);
        aigf.a = new baun("GLSUser", new String[]{"DeviceKeyStore"});
    }

    private aigf(Context context0) {
        this.b = new ReentrantReadWriteLock();
        batl.s(context0);
        this.c = context0;
    }

    public static aigf a(Context context0) {
        aigf aigf0;
        synchronized(aigf.class) {
            aigf0 = (aigf)aigf.e.get();
            if(aigf0 == null) {
                aigf aigf1 = new aigf(context0.getApplicationContext());
                aigf.e = new WeakReference(aigf1);
                return aigf1;
            }
        }
        return aigf0;
    }

    public final hkww b() {
        FileInputStream fileInputStream0;
        Lock lock0 = this.b.readLock();
        lock0.lock();
        hkww hkww0 = this.d;
        lock0.unlock();
        if(hkww0 == null) {
            try {
                Lock lock1 = this.b.writeLock();
                lock1.lock();
                try {
                    if(this.d == null) {
                        try {
                            fileInputStream0 = this.c.openFileInput("device_key");
                        }
                        catch(FileNotFoundException fileNotFoundException0) {
                            throw new IOException("Device key file not found.", fileNotFoundException0);
                        }
                        try {
                            int v2 = (int)DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream0.getChannel()).size();
                            aigf.a.j("Retrieving device key, file size: " + v2, new Object[0]);
                        }
                        catch(IOException iOException1) {
                            throw new IOException("Failed to read size of key file. ", iOException1);
                        }
                        finally {
                            fileInputStream0.close();
                        }
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkww.a).v_newBuilder();
                        hftp0.G(fileInputStream0);
                        this.d = (hkww)hftp0.N_build();
                    }
                }
                finally {
                    lock1.unlock();
                }
            }
            catch(IOException iOException0) {
                aigf.a.m("Cannot load key: " + iOException0.getMessage(), new Object[0]);
            }
        }
        Lock lock2 = this.b.readLock();
        lock2.lock();
        hkww hkww1 = this.d;
        lock2.unlock();
        return hkww1;
    }
}

