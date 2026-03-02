import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class cank {
    public final SharedPreferences a;
    public final Object b;

    public cank(SharedPreferences sharedPreferences0) {
        this.b = new Object();
        this.a = sharedPreferences0;
    }

    public final Long a() {
        return this.a.getLong("index_built_until_state", 0L);
    }

    public final void b(canj canj0) {
        synchronized(this.b) {
            HashSet hashSet0 = new HashSet(this.a.getStringSet("batch_indexing_windows", ggnj.a));
            hashSet0.add(canj0.toString());
            this.a.edit().putStringSet("batch_indexing_windows", hashSet0).commit();
        }
    }

    public final void c() {
        this.a.edit().clear().commit();
    }

    public final void d() {
        this.a.edit().putStringSet("batch_indexing_windows", new HashSet()).commit();
    }

    public final Set e() {
        HashSet hashSet0 = new HashSet(this.a.getStringSet("batch_indexing_windows", ggnj.a));
        Set set0 = new HashSet();
        for(Object object0: hashSet0) {
            List list0 = gfud.e(' ').n(((String)object0));
            if(list0.size() == 2) {
                set0.add(new canj(Long.valueOf(((String)list0.get(0))), Long.valueOf(((String)list0.get(1)))));
            }
        }
        return set0;
    }

    public final void f() {
        this.c();
        this.a.edit().putLong("index_built_until_state", 0L).putBoolean("audio_media_files_indexing_enabled", huhz.k()).putBoolean("id_based_mediastore_indexing_enabled", huhz.m()).commit();
    }

    public final void g(long v) {
        this.a.edit().putLong("index_built_until_state", v).commit();
    }
}

