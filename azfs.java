import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Log;
import j..util.Objects;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

final class azfs implements Closeable {
    final Set a;
    boolean b;
    final Map c;
    final azfv d;

    public azfs(azfv azfv0) {
        Objects.requireNonNull(azfv0);
        this.d = azfv0;
        super();
        this.a = new bxf();
        this.b = false;
        this.c = new bxd();
    }

    final boolean a(File file0, String s, azgc azgc0, int v) {
        if(this.b) {
            throw new IllegalStateException();
        }
        long v1 = file0.length();
        if(!file0.delete()) {
            Log.e("CCTFlatFileLogStore", file0.getAbsolutePath() + " could not be deleted.");
            return false;
        }
        this.d.t(s, -v1);
        azfv.x(this.d, s);
        if(hqzy.f()) {
            azbj azbj0 = azbk.a();
            azbc azbc0 = azgc0.a();
            gftb.check(azbc0);
            azbj0.f(s, azbc0, v);
        }
        String s1 = a.I(azgc0, s, ",");
        Map map0 = this.c;
        Integer integer0 = (Integer)map0.get(s1);
        if(integer0 == null) {
            map0.put(s1, Integer.valueOf(v));
        }
        else {
            map0.put(s1, Integer.valueOf(((int)integer0) + v));
        }
        if(((bzs)map0).d_num > 100) {
            this.c();
        }
        File file1 = file0.getParentFile();
        gftb.check(file1);
        this.a.add(file1);
        return true;
    }

    final void b(File file0) {
        if(this.b) {
            throw new IllegalStateException();
        }
        long v = file0.length();
        File file1 = file0.getParentFile();
        gftb.check(file1);
        if(!file0.delete()) {
            Log.e("CCTFlatFileLogStore", file0.getAbsolutePath() + " could not be deleted.");
            return;
        }
        File file2 = file1.getParentFile();
        gftb.check(file2);
        String s = file2.getName();
        this.d.t(s, -v);
        azfv.x(this.d, s);
        this.a.add(file1);
    }

    private final void c() {
        SharedPreferences sharedPreferences0 = this.d.f.getSharedPreferences("LogDropPref", 0);
        synchronized(this.d.e) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            int v1 = 0;
            for(Object object1: this.c.entrySet()) {
                v1 += (int)(((Integer)((Map.Entry)object1).getValue()));
                sharedPreferences$Editor0.putInt(((String)((Map.Entry)object1).getKey()), sharedPreferences0.getInt(((String)((Map.Entry)object1).getKey()), 0) + ((int)(((Integer)((Map.Entry)object1).getValue()))));
            }
            if(!sharedPreferences$Editor0.commit()) {
                Log.e("CCTFlatFileLogStore", a.f(v1, "Failed to record ", " dropped logs"));
            }
        }
        this.c.clear();
    }

    @Override
    public final void close() {
        if(!this.b) {
            this.b = true;
            if(!this.c.isEmpty()) {
                this.c();
            }
            bxe bxe0 = new bxe(((bxf)this.a));
            while(bxe0.hasNext()) {
                Object object0 = bxe0.next();
                File file0 = (File)object0;
                if(file0.isDirectory()) {
                    File file1 = file0.getParentFile();
                    gftb.check(file1);
                    String s = file1.getName();
                    azfp azfp0 = azfp.a(file0);
                    if(azfp0.b == null || azfp0.b.length <= 1) {
                        Iterator iterator0 = azfp0.iterator();
                        while(iterator0.hasNext()) {
                            File file2 = ((azfo)iterator0).a();
                            long v = file2.length();
                            boolean z = file2.getName().equals("play_logger_context.pb");
                            int v1 = z ? 0 : azfv.z(file2).a;
                            if(!file2.delete()) {
                                Log.e("CCTFlatFileLogStore", file2.getAbsolutePath() + " could not be deleted.");
                            }
                            else if(!z) {
                                this.d.t(s, -v);
                                azfv.x(this.d, s);
                                this.d.r(s, azfl.f, v1);
                            }
                        }
                        if(file0.delete()) {
                            this.d.s(s, -1L);
                            try {
                                Integer integer0 = Integer.parseInt(file0.getName());
                                this.d.i.remove(integer0);
                                this.d.h.remove(integer0);
                            }
                            catch(NumberFormatException unused_ex) {
                                Log.e("CCTFlatFileLogStore", "Failed to parse to int " + file0.getName());
                            }
                        }
                        else {
                            Log.e("CCTFlatFileLogStore", file0.getAbsolutePath() + " could not be deleted.");
                        }
                    }
                }
            }
        }
    }
}

