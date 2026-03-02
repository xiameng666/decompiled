import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.storage.StorageManager;
import j..nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.CRC32;

public final class fwvi implements fwyk {
    public final Context a;
    public final ExecutorService b;
    private final fvwz c;
    private final StorageManager d;

    public fwvi(Context context0, fvwz fvwz0) {
        this.a = context0;
        this.c = fvwz0;
        this.b = clhl.b.b(clhr.b);
        this.d = (StorageManager)context0.getSystemService(StorageManager.class);
    }

    @Override  // fwyk
    public final File a() {
        this.r(37);
        return this.a.getFilesDir();
    }

    @Override  // fwyk
    public final File b() {
        this.r(40);
        return this.a.getFilesDir();
    }

    public static File c(Context context0) {
        File file0 = context0.getFilesDir();
        if(file0 == null) {
            return null;
        }
        return hrnt.i() ? new File(ccsb.a.b(file0, "nlp_ioh")) : new File(file0, "nlp_ioh");
    }

    @Override  // fwyk
    public final File d(String s) {
        return this.a.getDir(s, 0);
    }

    @Override  // fwyk
    public final File e() {
        return fwvi.c(this.a);
    }

    @Override  // fwyk
    public final File f() {
        return fwvi.g(this.a);
    }

    public static File g(Context context0) {
        File file0 = context0.getCacheDir();
        if(file0 == null) {
            return null;
        }
        return hrnt.i() ? new File(ccsb.a.b(file0, "nlp_s")) : new File(file0, "nlp_s");
    }

    @Override  // fwyk
    public final File h(String s) {
        File file0 = this.a.getCacheDir();
        if(file0 == null) {
            throw new IOException("no directory for cache files");
        }
        File file1 = hrnt.i() ? new File(ccsb.a.b(file0, "location")) : new File(file0, "location");
        if(file1.getPath().isEmpty()) {
            throw new IOException("can\'t create `location\' subdirectory");
        }
        if(file1.isFile()) {
            file1.delete();
        }
        if(!file1.exists()) {
            file1.mkdirs();
        }
        File file2 = hrnt.i() ? new File(ccsb.a.b(file1, s)) : new File(file1, s);
        if(!file2.getPath().isEmpty()) {
            return file2;
        }
        throw new IOException("improper filename: " + s);
    }

    @Override  // fwyk
    public final File i() {
        this.r(35);
        return this.a.getCacheDir();
    }

    @Override  // fwyk
    public final File j() {
        this.r(38);
        return this.a.getCacheDir();
    }

    @Override  // fwyk
    public final InputStream k(String s) {
        try {
            return this.a.getAssets().openFd("location/" + s).createInputStream();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    @Override  // fwyk
    public final ByteBuffer l(fuwu fuwu0) {
        int v1;
        Throwable throwable6;
        int v;
        InputStream inputStream0;
        byte[] arr_b;
        ByteBuffer byteBuffer0;
        FileChannel fileChannel0;
        Throwable throwable1;
        FileInputStream fileInputStream0;
        AssetFileDescriptor assetFileDescriptor0;
        Closeable closeable0;
        Context context0;
        String s;
        try {
            s = "location/" + fuwu0.t;
            context0 = this.a;
            closeable0 = null;
            assetFileDescriptor0 = null;
            assetFileDescriptor0 = context0.getAssets().openFd(s);
        }
        catch(IOException unused_ex) {
            fileInputStream0 = null;
            fileChannel0 = null;
            goto label_28;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            fileInputStream0 = null;
            goto label_64;
        }
        try {
            fileInputStream0 = null;
            fileInputStream0 = assetFileDescriptor0.createInputStream();
        }
        catch(IOException unused_ex) {
            fileChannel0 = null;
            goto label_28;
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            goto label_64;
        }
        try {
            fileChannel0 = null;
            fileChannel0 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream0.getChannel());
            byteBuffer0 = fileChannel0.map(FileChannel.MapMode.READ_ONLY, fileChannel0.position(), assetFileDescriptor0.getLength());
            goto label_68;
        }
        catch(IOException unused_ex) {
            goto label_28;
        }
        catch(Throwable throwable3) {
        }
        throwable1 = throwable3;
        goto label_64;
        try {
            try {
                byteBuffer0 = fileChannel0.map(FileChannel.MapMode.READ_ONLY, fileChannel0.position(), assetFileDescriptor0.getLength());
                goto label_68;
            }
            catch(IOException unused_ex) {
            }
        label_28:
            arr_b = new byte[0x1000];
        }
        catch(Throwable throwable4) {
            goto label_62;
        }
        try {
            inputStream0 = context0.getAssets().open(s);
            v = 0;
        }
        catch(Throwable throwable5) {
            try {
                throwable6 = throwable5;
                goto label_40;
            }
            catch(Throwable throwable4) {
                goto label_62;
            }
        }
        while(true) {
            try {
                v1 = inputStream0.read(arr_b);
                goto label_42;
            }
            catch(Throwable throwable7) {
                try {
                    throwable6 = throwable7;
                    closeable0 = inputStream0;
                label_40:
                    fyba.b(closeable0);
                    throw throwable6;
                label_42:
                    if(v1 != -1) {
                        v += v1;
                        v1 = inputStream0.read(arr_b);
                        goto label_42;
                    }
                    fyba.b(inputStream0);
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(v);
                    try {
                        closeable0 = context0.getAssets().open(s);
                        int v3;
                        while((v3 = ((InputStream)closeable0).read(arr_b)) != -1) {
                            byteBuffer1.put(arr_b, 0, v3);
                        }
                    }
                    finally {
                        fyba.b(closeable0);
                    }
                    int v4 = byteBuffer1.position();
                    if(v4 != v) {
                        throw new IOException(a.z(v, v4, "Length doesn\'t match: position=", ", length="));
                    }
                    byteBuffer0 = byteBuffer1;
                    goto label_68;
                }
                catch(Throwable throwable4) {
                }
                break;
            }
        }
    label_62:
        throwable1 = throwable4;
        closeable0 = fileChannel0;
    label_64:
        fyba.b(closeable0);
        if(!fyba.b(fileInputStream0)) {
            fyba.b(assetFileDescriptor0);
        }
        throw throwable1;
    label_68:
        fyba.b(fileChannel0);
        if(!fyba.b(fileInputStream0)) {
            fyba.b(assetFileDescriptor0);
        }
        if(byteBuffer0 != null) {
            long v5 = fuwu0.r;
            if(Long.compare(byteBuffer0.getLong(0), v5) != 0) {
                throw new RuntimeException("The version: " + byteBuffer0.getLong(0) + " != " + v5);
            }
            long v6 = fuwu0.s;
            if(v6 != -1L) {
                CRC32 cRC320 = new CRC32();
                if(byteBuffer0.hasArray()) {
                    cRC320.update(byteBuffer0.array());
                }
                else {
                    byteBuffer0.rewind();
                    byte[] arr_b1 = new byte[byteBuffer0.remaining()];
                    byteBuffer0.get(arr_b1);
                    cRC320.update(arr_b1);
                }
                if(cRC320.getValue() != v6) {
                    throw new IOException("The checksum: " + cRC320.getValue() + " != " + v6);
                }
            }
            byteBuffer0.rewind();
            return byteBuffer0;
        }
        return null;
    }

    @Override  // fwyk
    public final Executor m() {
        return this.b;
    }

    @Override  // fwyk
    public final boolean n() {
        return true;
    }

    @Override  // fwyk
    public final boolean o(File file0) {
        return this.d == null ? false : this.d.isCacheBehaviorGroup(file0);
    }

    @Override  // fwyk
    public final void p() {
    }

    @Override  // fwyk
    public final void q(File file0) {
        StorageManager storageManager0 = this.d;
        if(storageManager0 != null) {
            storageManager0.setCacheBehaviorGroup(file0, true);
        }
    }

    private final void r(int v) {
        this.c.g(v);
    }
}

