import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

public final class atgh {
    private static final aqql a;
    private final Parser b;
    private final File c;

    static {
        atgh.a = new aqql(new String[]{"ProtoStore"});
    }

    public atgh(Parser hfvs0, File file0) {
        gftb.check(hfvs0);
        this.b = hfvs0;
        if(file0.exists() && !file0.isDirectory()) {
            throw new IOException("Store folder already exists, but isn\'t a directory.");
        }
        if(!file0.exists() && !file0.mkdir()) {
            throw new IOException("Unable to create store folder.");
        }
        this.c = file0;
    }

    public static atgh a(Context context0) {
        Parser hfvs0 = (Parser)((ProtoLiteMessage)arad.a).jf(7, null);
        return hrnt.i() ? new atgh(hfvs0, new File(ccsb.a.b(context0.getFilesDir().getAbsoluteFile(), "backup_chunk_listings"))) : new atgh(hfvs0, new File(context0.getFilesDir().getAbsoluteFile(), "backup_chunk_listings"));
    }

    public static atgh b(Context context0) {
        Parser hfvs0 = (Parser)((ProtoLiteMessage)araq.a).jf(7, null);
        return hrnt.i() ? new atgh(hfvs0, new File(ccsb.a.b(context0.getFilesDir().getAbsoluteFile(), "backup_kv_listings"))) : new atgh(hfvs0, new File(context0.getFilesDir().getAbsoluteFile(), "backup_kv_listings"));
    }

    public final gfsx c(String s) {
        File file0 = this.g(s);
        if(!file0.exists()) {
            atgh.a.d("No chunk listing existed for %s, returning empty listing.", new Object[]{s});
            return gfqx.a;
        }
        try {
            byte[] arr_b = ghju.d(file0);
            hftc hftc0 = hftc.a();
            return gfsx.m(this.b.p(arr_b, hftc0));
        }
        catch(hfur unused_ex) {
            atgh.a.f("The stored listing for %s contained an invalid proto, deleting saved listing.", new Object[]{s});
            file0.delete();
            return gfqx.a;
        }
    }

    public final void d() {
        File[] arr_file = this.c.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                arr_file[v].delete();
            }
        }
    }

    public final void e(String s) {
        this.g(s).delete();
    }

    public final void f(String s, MessageLite hfvm0) {
        gftb.check(hfvm0);
        File file0 = this.g(s);
        try {
            ghju.c(hfvm0.toBytesArray(), file0);
        }
        catch(IOException iOException0) {
            atgh.a.f("Exception occurred when saving the listing for %s, deleting saved listing.", new Object[]{s, iOException0});
            file0.delete();
            throw iOException0;
        }
    }

    private final File g(String s) {
        if(!TextUtils.isEmpty(s) && !s.contains("/")) {
            return hrnt.i() ? new File(ccsb.a.b(this.c, s)) : new File(this.c, s);
        }
        throw new IllegalArgumentException("Package name must not contain \'/\' or be empty: " + s);
    }
}

