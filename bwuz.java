import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public final class bwuz {
    public bwvk a;
    public final Map b;

    public bwuz() {
        this.b = new HashMap();
    }

    public final long a() {
        if(this.a != null) {
            Integer integer0 = (Integer)this.b.get("seqno");
            return integer0 == null ? 0x7FFFFFFFFFFFFFFFL : this.a.b(integer0.intValue());
        }
        return 0x7FFFFFFFFFFFFFFFL;
    }

    public final String b(ContentResolver contentResolver0, Uri uri0, String s, String[] arr_s, String[] arr_s1, long v, String s1) {
        bwvk bwvk1;
        String s2;
        Cursor cursor0;
        Uri uri1;
        bwvk bwvk0;
        ContentProviderClient contentProviderClient0;
        this.d();
        String[] arr_s2 = {s, Long.toString(v), s1};
        try {
            contentProviderClient0 = contentResolver0.acquireUnstableContentProviderClient(uri0);
        }
        catch(Throwable throwable0) {
            throw new bwvj(throwable0);
        }
        if(contentProviderClient0 == null) {
            bwne.t("Could not connect to content provider %s", uri0);
            bwvk0 = null;
            uri1 = uri0;
        }
        else {
            try {
                uri1 = uri0;
                cursor0 = contentProviderClient0.query(uri1, null, null, arr_s2, null);
            }
            catch(Throwable throwable1) {
                contentProviderClient0.release();
                throw new bwvj(throwable1);
            }
            if(cursor0 == null) {
                contentProviderClient0.release();
                bwvk0 = null;
            }
            else {
                bwvk0 = new bwvk(contentProviderClient0, cursor0);
            }
        }
        this.a = bwvk0;
        if(bwvk0 != null) {
            try {
                s2 = abxi.b(bwvk0.b);
                bwvk1 = this.a;
            }
            catch(Throwable throwable2) {
                throw new bwvj(throwable2);
            }
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                String s3 = arr_s[v2];
                int v3 = bwvk1.a(s3);
                if(v3 == -1) {
                    bwne.g("Column %s was not returned by client, refusing to index", s3);
                    this.d();
                    return s2;
                }
                this.b.put(s3, Integer.valueOf(v3));
            }
            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                String s4 = arr_s1[v1];
                int v4 = bwvk1.a(s4);
                if(v4 != -1) {
                    this.b.put(s4, Integer.valueOf(v4));
                }
            }
            this.e();
            return s2;
        }
        bwne.d("Cursor for %s is null, %s", s, uri1);
        return null;
    }

    public final String c(String s) {
        if(this.a != null) {
            Integer integer0 = (Integer)this.b.get(s);
            if(integer0 != null) {
                try {
                    return this.a.b.getString(integer0.intValue());
                }
                catch(Throwable throwable0) {
                    throw new bwvj(throwable0);
                }
            }
        }
        return null;
    }

    public final void d() {
        this.b.clear();
        bwvk bwvk0 = this.a;
        if(bwvk0 != null) {
            try {
                bwvk0.b.close();
            }
            catch(Throwable throwable0) {
                try {
                    throw new bwvj(throwable0);
                }
                catch(Throwable throwable1) {
                    bwvk0.a.release();
                    throw throwable1;
                }
            }
            bwvk0.a.release();
            this.a = null;
        }
    }

    public final boolean e() {
        bwvk bwvk0 = this.a;
        if(bwvk0 != null) {
            try {
                if(bwvk0.b.moveToNext()) {
                    return true;
                }
            }
            catch(Throwable throwable0) {
                throw new bwvj(throwable0);
            }
            this.d();
            return false;
        }
        return false;
    }

    final boolean f() {
        return this.a != null;
    }

    final boolean g() {
        return this.a == null;
    }

    public final byte[] h(String s) {
        if(this.a != null) {
            Integer integer0 = (Integer)this.b.get(s);
            if(integer0 != null) {
                try {
                    return this.a.b.getBlob(integer0.intValue());
                }
                catch(Throwable throwable0) {
                    throw new bwvj(throwable0);
                }
            }
        }
        return null;
    }
}

