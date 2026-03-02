import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class tyi implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final int d;
    public long e;
    public Writer f;
    public final LinkedHashMap g;
    public int h;
    final ThreadPoolExecutor i;
    private final File j;
    private final int k;
    private final long l;
    private long m;
    private final Callable n;

    public tyi(File file0) {
        this.e = 0L;
        this.g = new LinkedHashMap(0, 0.75f, true);
        this.m = 0L;
        this.i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new tye());
        this.n = new tyd(this);
        this.a = file0;
        this.k = 1;
        this.b = new File(file0, "journal");
        this.c = new File(file0, "journal.tmp");
        this.j = new File(file0, "journal.bkp");
        this.d = 1;
        this.l = 0xFA00000L;
    }

    public final tyh a(String s) {
        synchronized(this) {
            this.l();
            tyg tyg0 = (tyg)this.g.get(s);
            if(tyg0 != null && tyg0.e) {
                File[] arr_file = tyg0.c;
                for(int v1 = 0; v1 < arr_file.length; v1 = 1) {
                    if(!arr_file[0].exists()) {
                        return null;
                    }
                }
                ++this.h;
                this.f.append("READ");
                this.f.append(' ');
                this.f.append(s);
                this.f.append('\n');
                if(this.i()) {
                    this.i.submit(this.n);
                }
                return new tyh(this, tyg0.c);
            }
        }
        return null;
    }

    public final void b(tyf tyf0, boolean z) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        tyg tyg0 = tyf0.a;
        if(tyg0.f == tyf0) {
            if(((int)z) && !tyg0.e) {
                int v1 = 0;
                while(v1 < this.d) {
                    if(tyf0.b[0]) {
                        if(tyg0.d().exists()) {
                            v1 = 1;
                            continue;
                        }
                        tyf0.a();
                        FIN.finallyExec$NT(v);
                        return;
                    }
                    tyf0.a();
                    throw new IllegalStateException("Newly created entry didn\'t create value for index 0");
                }
            }
            for(int v2 = 0; v2 < this.d; v2 = 1) {
                File file0 = tyg0.d();
                if(!((int)z)) {
                    tyi.d(file0);
                }
                else if(file0.exists()) {
                    File file1 = tyg0.c();
                    file0.renameTo(file1);
                    long v3 = tyg0.b[0];
                    long v4 = file1.length();
                    tyg0.b[0] = v4;
                    this.e = this.e - v3 + v4;
                }
            }
            ++this.h;
            tyg0.f = null;
            if((tyg0.e | ((int)z)) == 0) {
                this.g.remove(tyg0.a);
                this.f.append("REMOVE");
                this.f.append(' ');
                this.f.append(tyg0.a);
                this.f.append('\n');
            }
            else {
                tyg.b(tyg0);
                this.f.append("CLEAN");
                this.f.append(' ');
                this.f.append(tyg0.a);
                this.f.append(tyg0.a());
                this.f.append('\n');
                if(((int)z) != 0) {
                    ++this.m;
                }
            }
            tyi.n(this.f);
            if(this.e <= this.l && !this.i()) {
                FIN.finallyExec$NT(v);
                return;
            }
            this.i.submit(this.n);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException();
    }

    public final void c() {
        this.close();
        tyl.b(this.a);
    }

    @Override
    public final void close() {
        synchronized(this) {
            if(this.f == null) {
                return;
            }
            ArrayList arrayList0 = new ArrayList(this.g.values());
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                tyf tyf0 = ((tyg)arrayList0.get(v2)).f;
                if(tyf0 != null) {
                    tyf0.a();
                }
            }
            this.h();
            tyi.m(this.f);
            this.f = null;
        }
    }

    public static void d(File file0) {
        if(file0.exists() && !file0.delete()) {
            throw new IOException();
        }
    }

    public final void e() {
        String s6;
        tyk tyk0 = new tyk(new FileInputStream(this.b), tyl.a);
        int v = FIN.finallyOpen$NT();
        String s = tyk0.a();
        String s1 = tyk0.a();
        String s2 = tyk0.a();
        String s3 = tyk0.a();
        String s4 = tyk0.a();
        if("libcore.io.DiskLruCache".equals(s) && "1".equals(s1) && Integer.toString(this.k).equals(s2) && Integer.toString(this.d).equals(s3) && "".equals(s4)) {
            int v1 = 0;
            try {
                while(true) {
                    String s5 = tyk0.a();
                    int v2 = s5.indexOf(0x20);
                    if(v2 == -1) {
                        throw new IOException("unexpected journal line: " + s5);
                    }
                    int v3 = s5.indexOf(0x20, v2 + 1);
                    if(v3 == -1) {
                        s6 = s5.substring(v2 + 1);
                        if(v2 == 6) {
                            if(s5.startsWith("REMOVE")) {
                                this.g.remove(s6);
                                goto label_48;
                            }
                            else {
                                v2 = 6;
                                goto label_23;
                            }
                            goto label_22;
                        }
                    }
                    else {
                    label_22:
                        s6 = s5.substring(v2 + 1, v3);
                    }
                label_23:
                    LinkedHashMap linkedHashMap0 = this.g;
                    tyg tyg0 = (tyg)linkedHashMap0.get(s6);
                    if(tyg0 == null) {
                        tyg0 = new tyg(this, s6);
                        linkedHashMap0.put(s6, tyg0);
                    }
                    if(v3 == -1 || v2 != 5) {
                        goto label_31;
                    }
                    if(!s5.startsWith("CLEAN")) {
                        v2 = 5;
                    label_31:
                        if(v3 == -1 && v2 == 5 && s5.startsWith("DIRTY")) {
                            tyg0.f = new tyf(this, tyg0);
                            goto label_48;
                        }
                        else {
                            if(v3 == -1 && v2 == 4 && s5.startsWith("READ")) {
                                goto label_48;
                            }
                            throw new IOException("unexpected journal line: " + s5);
                        }
                    }
                    String[] arr_s = s5.substring(v3 + 1).split(" ");
                    tyg.b(tyg0);
                    tyg0.f = null;
                    if(arr_s.length != tyg0.g.d) {
                        throw tyg.e(arr_s);
                    }
                    for(int v4 = 0; true; ++v4) {
                        try {
                            if(v4 >= arr_s.length) {
                                break;
                            }
                            tyg0.b[v4] = Long.parseLong(arr_s[v4]);
                        }
                        catch(NumberFormatException unused_ex) {
                            throw tyg.e(arr_s);
                        }
                    }
                label_48:
                    ++v1;
                }
            }
            catch(EOFException unused_ex) {
                this.h = v1 - this.g.size();
                if(tyk0.b == -1) {
                    this.f();
                }
                else {
                    this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), tyl.a));
                }
                FIN.finallyCodeBegin$NT(v);
                return;
            }
        }
        throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s3 + ", " + s4 + "]");
    }

    public final void f() {
        synchronized(this) {
            Writer writer0 = this.f;
            if(writer0 != null) {
                tyi.m(writer0);
            }
            BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), tyl.a));
            try {
                bufferedWriter0.write("libcore.io.DiskLruCache");
                bufferedWriter0.write("\n");
                bufferedWriter0.write("1");
                bufferedWriter0.write("\n");
                bufferedWriter0.write(Integer.toString(this.k));
                bufferedWriter0.write("\n");
                bufferedWriter0.write(Integer.toString(this.d));
                bufferedWriter0.write("\n");
                bufferedWriter0.write("\n");
                for(Object object0: this.g.values()) {
                    tyg tyg0 = (tyg)object0;
                    if(tyg0.f == null) {
                        String s = tyg0.a();
                        bufferedWriter0.write("CLEAN " + tyg0.a + s + "\n");
                    }
                    else {
                        bufferedWriter0.write(a.a(tyg0.a, "DIRTY ", "\n"));
                    }
                }
            }
            finally {
                tyi.m(bufferedWriter0);
            }
            File file0 = this.b;
            if(file0.exists()) {
                tyi.g(file0, this.j, true);
            }
            tyi.g(this.c, file0, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0, true), tyl.a));
        }
    }

    public static void g(File file0, File file1, boolean z) {
        if(z) {
            tyi.d(file1);
        }
        if(file0.renameTo(file1)) {
            return;
        }
        throw new IOException();
    }

    public final void h() {
        while(this.e > this.l) {
            Object object0 = this.g.entrySet().iterator().next();
            this.k(((String)((Map.Entry)object0).getKey()));
        }
    }

    public final boolean i() {
        return this.h >= 2000 && this.h >= this.g.size();
    }

    public final tyf j(String s) {
        synchronized(this) {
            this.l();
            LinkedHashMap linkedHashMap0 = this.g;
            tyg tyg0 = (tyg)linkedHashMap0.get(s);
            if(tyg0 == null) {
                tyg0 = new tyg(this, s);
                linkedHashMap0.put(s, tyg0);
                goto label_10;
            }
            if(tyg0.f == null) {
            label_10:
                tyf tyf0 = new tyf(this, tyg0);
                tyg0.f = tyf0;
                this.f.append("DIRTY");
                this.f.append(' ');
                this.f.append(s);
                this.f.append('\n');
                tyi.n(this.f);
                return tyf0;
            }
        }
        return null;
    }

    public final void k(String s) {
        synchronized(this) {
            this.l();
            LinkedHashMap linkedHashMap0 = this.g;
            tyg tyg0 = (tyg)linkedHashMap0.get(s);
            if(tyg0 != null && tyg0.f == null) {
                for(int v1 = 0; v1 < this.d; v1 = 1) {
                    File file0 = tyg0.c();
                    if(file0.exists() && !file0.delete()) {
                        throw new IOException("failed to delete " + file0);
                    }
                    this.e -= tyg0.b[0];
                    tyg0.b[0] = 0L;
                }
                ++this.h;
                this.f.append("REMOVE");
                this.f.append(' ');
                this.f.append(s);
                this.f.append('\n');
                linkedHashMap0.remove(s);
                if(this.i()) {
                    this.i.submit(this.n);
                }
            }
        }
    }

    private final void l() {
        if(this.f != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    private static void m(Writer writer0) {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitUnbufferedIo().build());
        try {
            writer0.close();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    private static void n(Writer writer0) {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitUnbufferedIo().build());
        try {
            writer0.flush();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }
}

