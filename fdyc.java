import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicLong;

public final class fdyc implements ffmd, ffmj {
    public final Context a;
    private final File b;

    public fdyc(Context context0) {
        this.a = context0;
        ccsg ccsg0 = ccsb.a;
        File file0 = hrnt.i() ? new File(ccsg0.d(ccsg0.b(context0.getFilesDir(), "assets"), "streamtmp")) : new File(new File(context0.getFilesDir(), "assets"), "streamtmp");
        this.b = file0;
        file0.mkdirs();
        File[] arr_file = file0.listFiles();
        for(int v = 0; v < arr_file.length; ++v) {
            arr_file[v].delete();
        }
    }

    @Override  // ffmd
    public final void G() {
        this.k((hrnt.i() ? new File(ccsb.a.b(this.a.getFilesDir(), "assets")) : new File(this.a.getFilesDir(), "assets")));
    }

    public final File a(String s) {
        if(Log.isLoggable("assets", 3)) {
            Log.d("assets", "Get Asset FD: digest=" + s);
        }
        File file0 = this.b(s);
        if(!file0.exists()) {
            if(Log.isLoggable("assets", 3)) {
                Log.d("assets", "Unable to load asset: " + file0.toString());
            }
            return null;
        }
        return file0;
    }

    public final File b(String s) {
        return hrnt.i() ? new File(ccsb.a.b(this.i(s), fdyc.c(s))) : new File(this.i(s), fdyc.c(s));
    }

    public static String c(String s) {
        return s + ".asset";
    }

    public final String d(InputStream inputStream0, AtomicLong atomicLong0) {
        this.b.mkdirs();
        File file0 = File.createTempFile("asset", ".tmp", this.b);
        MessageDigest messageDigest0 = fdvl.x();
        ghjq ghjq0 = new ghjq();
        try {
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            ghjq0.b(fileOutputStream0);
            byte[] arr_b = new byte[0x2800];
            int v1;
            while((v1 = inputStream0.read(arr_b)) >= 0) {
                messageDigest0.update(arr_b, 0, v1);
                fileOutputStream0.write(arr_b, 0, v1);
                if(atomicLong0 != null) {
                    atomicLong0.addAndGet(((long)v1));
                }
            }
        }
        catch(Exception exception0) {
            throw ghjq0.a(exception0);
        }
        finally {
            ghjp.a(inputStream0);
            ghjq0.close();
        }
        Pair pair0 = Pair.create(fdvl.v(messageDigest0.digest()), file0);
        this.h(((String)pair0.first), ((File)pair0.second));
        return (String)pair0.first;
    }

    public static MessageDigest f() {
        try {
            return MessageDigest.getInstance("SHA1");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new IllegalStateException("proper crypto support not installed", noSuchAlgorithmException0);
        }
    }

    public static void g(File file0) {
        if(!file0.delete()) {
            Log.w("assets", "Fail to delete file: " + file0.toString());
        }
    }

    public final void h(String s, File file0) {
        File file1 = this.b(s);
        if(!file1.exists()) {
            if(file0.renameTo(file1)) {
                if(Log.isLoggable("assets", 3)) {
                    Log.d("assets", "Wrote asset file: " + (s + ".asset"));
                }
                return;
            }
            Log.e("assets", a.ad(file0, file1, "Fail to move input file: ", " to asset file: "));
            file0.delete();
            throw new IOException("error renaming file");
        }
        if(Log.isLoggable("assets", 3)) {
            Log.d("assets", "Skipping write: asset file already exists: " + (s + ".asset"));
        }
        file0.delete();
    }

    private final File i(String s) {
        ccsg ccsg0 = ccsb.a;
        File file0 = hrnt.i() ? new File(ccsg0.d(ccsg0.b(this.a.getFilesDir(), "assets"), fdyc.j(s))) : new File(new File(this.a.getFilesDir(), "assets"), fdyc.j(s));
        if(!file0.mkdirs() && Log.isLoggable("assets", 3)) {
            Log.d("assets", String.format("%s already existed", file0));
        }
        return file0;
    }

    private static String j(String s) {
        return s.substring(s.length() - 2, s.length());
    }

    private final void k(File file0) {
        File[] arr_file = file0.listFiles();
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            if(!file1.getName().equals(".") && !file1.getName().equals("..")) {
                if(file1.isFile()) {
                    if(Log.isLoggable("assets", 2)) {
                        Log.v("assets", "recursivelyDelete: deleting file " + file1.getPath());
                    }
                    if(!file1.delete()) {
                        Log.e("assets", "recursivelyDelete: failed to delete " + file1.getName());
                    }
                }
                else if(file1.isDirectory()) {
                    if(Log.isLoggable("assets", 2)) {
                        Log.v("assets", "recursivelyDelete: recursing into subdir " + file1.getPath());
                    }
                    this.k(file1);
                    if(Log.isLoggable("assets", 2)) {
                        Log.v("assets", "recursivelyDelete: returned from subdir " + file1.getPath());
                    }
                }
            }
        }
        if(Log.isLoggable("assets", 2)) {
            Log.v("assets", "recursivelyDelete: deleting dir that should be empty: " + file0.getPath());
        }
        file0.delete();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        File[] arr_file = (hrnt.i() ? new File(ccsb.a.b(this.a.getFilesDir(), "assets")) : new File(this.a.getFilesDir(), "assets")).listFiles();
        if(arr_file == null) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        long v = 0L;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_file.length; ++v1) {
            File file0 = arr_file[v1];
            if(file0.isDirectory()) {
                File[] arr_file1 = file0.listFiles();
                if(arr_file1 != null) {
                    for(int v3 = 0; v3 < arr_file1.length; ++v3) {
                        File file1 = arr_file1[v3];
                        if(file1.isFile()) {
                            String s = file1.getName();
                            if(s.endsWith(".asset")) {
                                stringBuilder0.append(s.substring(0, s.length() - 6));
                                stringBuilder0.append(" length ");
                                stringBuilder0.append(file1.length());
                                stringBuilder0.append("\n");
                                v += file1.length();
                                ++v2;
                            }
                        }
                    }
                }
            }
        }
        bbpd0.b();
        bbpd0.println(v + " bytes in " + v2 + " files");
        bbpd0.b();
        bbpd0.print(stringBuilder0.toString());
        bbpd0.a();
        bbpd0.a();
    }
}

