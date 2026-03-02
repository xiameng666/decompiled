import j..time.Clock;
import j..time.LocalDateTime;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public final class fxcz {
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public final fwze f;
    public int g;
    public int h;
    private boolean i;
    private long j;
    private List k;
    private long l;
    private fvmz m;
    private final Clock n;
    private final fvqn o;
    private final fvrf p;
    private final Random q;
    private final File r;
    private final FileFilter s;
    private int t;

    public fxcz(fwze fwze0, fvqn fvqn0, File file0, fvrf fvrf0) {
        this.a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.i = false;
        this.t = 1;
        this.j = -1L;
        this.e = 0L;
        this.k = new ArrayList();
        this.l = 0L;
        this.q = new Random();
        this.g = 0;
        this.h = 0;
        this.s = new fxcx(this);
        this.f = fwze0;
        this.o = fvqn0;
        this.p = fvrf0;
        this.r = file0;
        this.n = Clock.systemUTC();
    }

    public final void a() {
        if(this.g() && this.h()) {
            return;
        }
        this.p.h();
        this.f();
    }

    public final void b() {
        long v4;
        fwze fwze1;
        fvrf fvrf0 = this.p;
        if(fvrf0.h) {
        alab1:
            while(true) {
                int v = this.t - 1;
                if(this.t == 0) {
                    break;
                }
                switch(v) {
                    case 0: {
                        fwze fwze0 = this.f;
                        long v1 = fwze0.f().b();
                        long v2 = this.j + 7200000L;
                        if(Long.compare(huwo.d(), 1L) == 0) {
                            fwze1 = fwze0;
                            int v3 = (int)(huwo.a.f().f() * 60000L);
                            v4 = (long)this.q.nextInt(v3);
                        }
                        else {
                            fwze1 = fwze0;
                            v4 = 0L;
                        }
                        long v5 = v2 + v4;
                        if(this.g() && v1 >= v5) {
                            if(huwo.d() == 3L) {
                                long v6 = (long)LocalDateTime.now(this.n).getMinute();
                                if(v6 > huwo.c() && v6 < 60L - huwo.c() && (v6 > huwo.c() + 30L || v6 < 30L - huwo.c())) {
                                    goto label_21;
                                }
                            }
                            else {
                            label_21:
                                File file0 = this.r;
                                if(file0 != null && file0.exists()) {
                                    File[] arr_file = file0.listFiles();
                                    if(arr_file != null) {
                                        int v7 = 0;
                                        while(v7 < arr_file.length) {
                                            File file1 = arr_file[v7];
                                            if(file1 != null && file1.isDirectory()) {
                                                if(v1 - this.e < 5000L) {
                                                    this.e(5000L + v1, 0L);
                                                    this.d(v1);
                                                    return;
                                                }
                                                if(!this.i) {
                                                    fwze1.s().i(fwzf.h, 60000L, null);
                                                    if(!this.d) {
                                                        fwze1.v().b();
                                                    }
                                                    this.i = true;
                                                }
                                                this.t = 2;
                                                this.j(fwze1.f().b());
                                                continue alab1;
                                            }
                                            ++v7;
                                        }
                                    }
                                }
                                this.j(v1);
                                continue;
                            }
                        }
                        if(Long.compare(v5, v1) > 0) {
                            this.e(v5, 3600000L);
                        }
                        else if(this.a == -1L || this.a < v1) {
                            this.e(v1 + 7200000L, 3600000L);
                        }
                        this.d(v1);
                        return;
                    }
                    case 1: {
                        if(this.g()) {
                            long v8 = this.f.f().b();
                            long v9 = this.j + 15000L;
                            if(v8 >= v9) {
                                if(this.h()) {
                                    this.t = 3;
                                    this.k = new ArrayList();
                                    File file2 = this.r;
                                    if(file2 != null) {
                                        File[] arr_file1 = file2.listFiles();
                                        if(arr_file1 != null) {
                                            for(int v10 = 0; v10 < arr_file1.length; ++v10) {
                                                File file3 = arr_file1[v10];
                                                if(file3 != null && file3.isDirectory()) {
                                                    if(file3.isDirectory()) {
                                                        File[] arr_file2 = file3.listFiles(this.s);
                                                        if(arr_file2 != null && arr_file2.length > 20) {
                                                            file3.getPath();
                                                            fyba.c(file3);
                                                            continue;
                                                        }
                                                    }
                                                    this.k.add(file3);
                                                }
                                            }
                                        }
                                        this.c();
                                        continue;
                                    }
                                    return;
                                }
                                else {
                                    this.f();
                                    continue;
                                }
                            }
                            this.e(v9, 0L);
                            return;
                        }
                        else {
                            fvrf0.h();
                            this.f();
                            continue;
                        }
                        goto label_85;
                    }
                    case 2: {
                    label_85:
                        long v11 = this.j + 1200000L;
                        if(this.f.f().b() < v11 && this.g() && this.h()) {
                            this.e(v11, 0L);
                            return;
                        }
                        break;
                    }
                    default: {
                        throw new RuntimeException(null, null);
                    }
                }
                this.f();
            }
            throw null;
        }
        if(this.t != 1) {
            fvrf0.h();
            this.f();
            return;
        }
        this.d(this.f.f().b());
    }

    public final void c() {
        if(this.g() && this.h() && this.t == 3) {
            while(!this.k.isEmpty()) {
                File file0 = (File)this.k.remove(this.k.size() - 1);
                if(fvno.a.c(file0)) {
                    file0.getAbsolutePath();
                }
                else {
                    file0.getName();
                    fvmz fvmz0 = this.f.q().e(file0.getAbsolutePath(), this);
                    this.m = fvmz0;
                    if(fvmz0 != null) {
                        fvmz0.a();
                        return;
                    }
                }
            }
        }
        this.f();
    }

    private final void d(long v) {
        if(v - this.l >= 3600000L) {
            this.l = v;
            File file0 = this.r;
            if(file0 != null && file0.exists()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        File file1 = arr_file[v1];
                        if(file1 != null && file1.isDirectory()) {
                            long v2 = this.f.f().c();
                            if(fxcz.i(file1, v2)) {
                                file1.getPath();
                                fyba.c(file1);
                            }
                            else if(file1.isDirectory()) {
                                File[] arr_file1 = file1.listFiles();
                                if(arr_file1 != null) {
                                    for(int v3 = 0; v3 < arr_file1.length; ++v3) {
                                        if(fxcz.i(arr_file1[v3], v2)) {
                                            file1.getPath();
                                            fyba.c(file1);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void e(long v, long v1) {
        if(v != this.a) {
            this.a = v;
            this.f.s().d(fwzf.h, 3, this.a, v1, null);
        }
    }

    private final void f() {
        fvmz fvmz0 = this.m;
        if(fvmz0 != null) {
            fvmz0.b();
            this.m = null;
        }
        this.k.clear();
        if(this.i) {
            this.f.s().j(fwzf.h);
            this.i = false;
        }
        this.t = 1;
        this.e(0L, 0L);
    }

    private final boolean g() {
        return this.r == null || !this.b || this.p.i != 1 ? false : huwo.d() != 2L || this.c;
    }

    private final boolean h() {
        return this.b && this.d;
    }

    private static final boolean i(File file0, long v) {
        long v1 = file0.lastModified();
        long v2 = v - v1;
        return v2 > 604800000L || v1 > v + 3600000L || file0.getName().equals(".lck") && v2 > 3600000L;
    }

    private final void j(long v) {
        this.j = v;
        long v1 = this.f.f().a() + v;
        this.o.q(v1);
        new Date(this.f.f().a() + (v + 7200000L));
    }
}

