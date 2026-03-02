import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class ehkj {
    private final File a;

    static {
        bboh.b("PerfettoUtils", bbcu.ea);
    }

    public ehkj(File file0) {
        this.a = file0;
    }

    public final File a(UUID uUID0) {
        File file0 = hrnt.i() ? new File(ccsb.a.b(this.a, uUID0.toString())) : new File(this.a, uUID0.toString());
        try {
            if(file0.createNewFile()) {
                return file0;
            }
        }
        catch(IOException unused_ex) {
        }
        return null;
    }

    public final List b() {
        File file0 = this.a;
        if(!file0.exists()) {
            return new ArrayList();
        }
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            return new ArrayList();
        }
        List list0 = new ArrayList(Arrays.asList(arr_file));
        Collections.sort(list0, new ehki());
        return list0;
    }

    public final void c(int v) {
        for(Object object0: this.b()) {
            ehks.a(v, ehkt.e(((File)object0)));
        }
        bboc.e(this.a);
    }

    public final boolean d() {
        return this.a.exists() || this.a.mkdirs();
    }

    public final boolean e() {
        return this.g(((int)iaby.a.g().i()), ((int)iaby.f()), ((int)iaby.a.g().j()));
    }

    public static boolean f(File file0) {
        long v = ehkt.e(file0).getLeastSignificantBits();
        return iaby.a.g().l().b.contains(Long.valueOf(v));
    }

    public final boolean g(int v, int v1, int v2) {
        List list0 = ggia.g(this.b());
        if(!list0.isEmpty()) {
            long v3 = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(iaby.a.g().g());
            for(Object object0: list0) {
                File file0 = (File)object0;
                if(file0.lastModified() < v3 && !ehkj.h(file0)) {
                    return false;
                }
            }
            List list1 = list0.subList(0, ehkj.k(list0, v, v1, v2));
            for(Object object1: list1) {
                if(!ehkj.h(((File)object1))) {
                    return false;
                }
            }
            list1.clear();
            return ehkj.k(list0, v, v1, v2) == 0;
        }
        return true;
    }

    public static final boolean h(File file0) {
        UUID uUID0 = ehkt.e(file0);
        if(!file0.delete()) {
            return false;
        }
        ehks.a(19, uUID0);
        return true;
    }

    public static final boolean i(long v) {
        return v <= iaby.a.g().h();
    }

    public final boolean j(List list0) {
        for(Object object0: list0) {
            File file0 = (File)object0;
            if(!file0.delete()) {
                ehks.a(18, ehkt.e(file0));
                this.c(23);
                return false;
            }
        }
        return true;
    }

    private static final int k(List list0, int v, int v1, int v2) {
        int v3 = 0;
        int v4 = Math.max(0, list0.subList(0, list0.size()).size() - v);
        List list1 = list0.subList(v4, list0.size());
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        long v5 = statFs0.getBlockSizeLong() * statFs0.getAvailableBlocksLong();
        int v6;
        for(v6 = 0; true; ++v6) {
            if(v6 >= list1.size()) {
                v6 = list1.size();
                break;
            }
            if(v5 >= ((long)v1)) {
                break;
            }
            v5 += ((File)list1.get(v6)).length();
        }
        int v7 = v4 + v6;
        List list2 = list0.subList(v7, list0.size());
        long v8 = 0L;
        for(Object object0: list2) {
            v8 += ((File)object0).length();
        }
        while(true) {
            if(v3 >= list2.size()) {
                v3 = list2.size();
                break;
            }
            if(v8 <= ((long)v2)) {
                break;
            }
            v8 -= ((File)list2.get(v3)).length();
            ++v3;
        }
        return v7 + v3;
    }
}

