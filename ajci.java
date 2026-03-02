import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Deprecated
public final class ajci {
    public final ReadWriteLock a;
    public final Properties b;
    public boolean c;
    private final File d;

    public ajci(File file0) {
        BufferedInputStream bufferedInputStream1;
        FileInputStream fileInputStream0;
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock0;
        this.d = file0;
        Properties properties0 = new Properties();
        this.b = properties0;
        this.c = false;
        if(!file0.isFile()) {
            if(file0.exists()) {
                file0.delete();
            }
            file0.createNewFile();
            if(!file0.isFile()) {
                throw new IOException("Failed to create a new file");
            }
        }
        Lock lock0 = reentrantReadWriteLock0.writeLock();
        lock0.lock();
        BufferedInputStream bufferedInputStream0 = null;
        try {
            fileInputStream0 = null;
            fileInputStream0 = new FileInputStream(file0);
            bufferedInputStream1 = new BufferedInputStream(fileInputStream0);
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        try {
            properties0.load(bufferedInputStream1);
            goto label_34;
        }
        catch(Throwable throwable1) {
            bufferedInputStream0 = bufferedInputStream1;
            throwable0 = throwable1;
        }
    label_27:
        if(bufferedInputStream0 != null) {
            goto label_31;
        }
        else if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
                goto label_32;
            label_31:
                bufferedInputStream0.close();
            }
            catch(Throwable throwable2) {
                lock0.unlock();
                throw throwable2;
            }
        }
    label_32:
        lock0.unlock();
        throw throwable0;
        try {
        label_34:
            bufferedInputStream1.close();
        }
        catch(Throwable throwable2) {
            lock0.unlock();
            throw throwable2;
        }
        lock0.unlock();
    }

    public final String a(String s) {
        String s1;
        batl.t(s, "Supplied key cannot be null!");
        Lock lock0 = this.a.readLock();
        lock0.lock();
        try {
            s1 = this.b.getProperty(s);
        }
        finally {
            lock0.unlock();
        }
        return s1;
    }

    public final Set b() {
        Set set0;
        Lock lock0 = this.a.readLock();
        lock0.lock();
        try {
            set0 = this.b.stringPropertyNames();
        }
        finally {
            lock0.unlock();
        }
        return set0;
    }

    public final void c() {
        BufferedOutputStream bufferedOutputStream1;
        FileOutputStream fileOutputStream0;
        Lock lock0 = this.a.writeLock();
        lock0.lock();
        BufferedOutputStream bufferedOutputStream0 = null;
        if(this.c) {
            try {
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(this.d);
                bufferedOutputStream1 = new BufferedOutputStream(fileOutputStream0);
            }
            catch(Throwable throwable0) {
                goto label_15;
            }
            try {
                this.b.store(bufferedOutputStream1, null);
                this.c = false;
                goto label_22;
            }
            catch(Throwable throwable0) {
                bufferedOutputStream0 = bufferedOutputStream1;
            }
        label_15:
            if(bufferedOutputStream0 != null) {
                goto label_19;
            }
            else if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                    goto label_20;
                label_19:
                    bufferedOutputStream0.close();
                }
                catch(Throwable throwable1) {
                    lock0.unlock();
                    throw throwable1;
                }
            }
        label_20:
            lock0.unlock();
            throw throwable0;
            try {
            label_22:
                bufferedOutputStream1.close();
            }
            catch(Throwable throwable1) {
                lock0.unlock();
                throw throwable1;
            }
        }
        lock0.unlock();
    }

    public final boolean d(String s, String s1, String s2) {
        batl.t(s, "Supplied key cannot be null!");
        Lock lock0 = this.a.writeLock();
        lock0.lock();
        try {
            Properties properties0 = this.b;
            String s3 = properties0.getProperty(s);
            if(s3 == null && s2 == null || s3 != null && s3.equals(s2)) {
                if(s1 != null) {
                    if(!s1.equals(s3)) {
                        properties0.setProperty(s, s1);
                        this.c = true;
                    }
                }
                else if(properties0.remove(s) != null) {
                    this.c = true;
                }
                return true;
            }
        }
        finally {
            lock0.unlock();
        }
        return false;
    }
}

