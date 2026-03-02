import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeSet;

public final class bwrb implements Closeable {
    public final File a;
    public final Parser b;
    public final bwqy c;
    public final Object d;
    public long e;
    public bwra f;
    public final Object g;
    public bwqz h;
    public volatile String i;
    public volatile String j;
    public final ProtoLiteBuilder k;

    public bwrb(File file0, Parser hfvs0, bwqy bwqy0) {
        this.d = new Object();
        this.g = new Object();
        this.k = ((ProtoLiteMessage)glqk.a).v_newBuilder();
        this.a = file0;
        this.b = hfvs0;
        this.c = bwqy0;
        TreeSet treeSet0 = this.b();
        while(!treeSet0.isEmpty()) {
            String s = (String)treeSet0.last();
            Long long0 = bwrb.a(s);
            if(long0 == null) {
                bwne.t("Invalid shard name: %s. Shard will be skipped and deleted.", s);
                this.d(3);
                File file1 = hrnt.i() ? new File(ccsb.a.b(file0, s)) : new File(file0, s);
                if(file1.delete()) {
                    treeSet0 = this.b();
                    continue;
                }
                this.d(4);
                throw new IOException("Failed to delete file: " + file1.toString());
            }
            this.e = ((long)long0) + 1L;
            break;
        }
    }

    public static Long a(String s) {
        if(s.length() != 16) {
            return null;
        }
        try {
            return Long.parseLong(s, 16);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public final TreeSet b() {
        TreeSet treeSet0 = new TreeSet();
        File file0 = this.a;
        if(!file0.isDirectory()) {
            bwne.t("Request queue work dir \"%s\" disappeared", file0);
            this.d(9);
            return treeSet0;
        }
        String[] arr_s = file0.list();
        if(arr_s == null) {
            bwne.t("Failed to list contents of request queue work dir \"%s\"", file0);
            this.d(10);
            return treeSet0;
        }
        Collections.addAll(treeSet0, arr_s);
        return treeSet0;
    }

    public final void c() {
        bwqz bwqz0 = this.h;
        if(bwqz0 != null) {
            try {
                bwqz0.close();
            }
            catch(IOException unused_ex) {
            }
            File file0 = bwqz0.b;
            if(!file0.delete()) {
                bwne.t("Failed to delete file %s", file0);
                this.d(4);
            }
            this.h = null;
        }
    }

    @Override
    public final void close() {
        synchronized(this.d) {
            bwra bwra0 = this.f;
            if(bwra0 != null) {
                bwra0.close();
                this.f = null;
                this.j = null;
            }
        }
        synchronized(this.g) {
            bwqz bwqz0 = this.h;
            if(bwqz0 != null) {
                bwqz0.close();
                this.h = null;
            }
        }
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.k;
        synchronized(hftp0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glqk glqk0 = (glqk)hftp0.b_message;
            hfuf hfuf0 = glqk0.c;
            if(!hfuf0.c()) {
                glqk0.c = ProtoLiteMessage.C(hfuf0);
            }
            glqk0.c.i(v - 2);
        }
    }
}

