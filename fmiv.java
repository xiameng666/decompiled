import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..net.URLEncoder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fmiv implements fmid {
    static final AtomicBoolean a;
    public final Context b;
    public final fmjd c;
    public final String d;
    public final String e;
    public final flky f;
    public final gmcg g;
    public final gmcg h;
    public static final int i;
    private final File j;
    private final File k;
    private final File l;
    private final File m;
    private boolean n;

    static {
        fmiv.a = new AtomicBoolean(false);
    }

    public fmiv(Context context0, fmjd fmjd0, flky flky0, String s) {
        this.b = context0;
        this.c = fmjd0;
        this.f = flky0;
        this.g = flbs.b().a;
        this.n = false;
        flsl.a(context0);
        this.h = gmcn.a(Executors.newSingleThreadExecutor());
        this.d = s;
        this.e = new File(s).getName();
        this.j = new File(s + File.separator + "tmp");
        File file0 = new File(s + File.separator + "photos");
        this.k = file0;
        File file1 = new File(file0.getAbsolutePath() + File.separator + "images");
        this.l = file1;
        this.m = new File(file1.getAbsolutePath() + File.separator + "tmp");
    }

    @Override  // fmid
    public final gmcd a(AccountContext accountContext0, fmga fmga0, fmic fmic0) {
        fmip fmip0 = new fmip(this, fmic0, fmga0, accountContext0);
        return this.g.e(fmip0);
    }

    @Override  // fmid
    public final String b(ConversationId conversationId0, String s) {
        return this.l.getAbsolutePath() + File.separator + fmiv.g(conversationId0) + File.separator + ghgc.a.c(s, StandardCharsets.UTF_8).toString();
    }

    public final fmga c(AccountContext accountContext0, ConversationId conversationId0, fmjo fmjo0, fmga fmga0, byte[] arr_b, String s) {
        fmio fmio0 = new fmio(this, fmjo0);
        byte[] arr_b1 = (byte[])fmjo0.c.e(((gful_cronetEngineProvider)fmio0));
        fmjn fmjn0 = new fmjn(fmjo0);
        fmjn0.e(arr_b1);
        fmjn0.b = s;
        fmjo fmjo1 = fmjn0.a();
        fmfm fmfm0 = new fmfm(fmga0);
        fmfo fmfo0 = new fmfo();
        fmfo0.c("photos");
        fmfo0.b(((byte[])fmia.c(fmjo1).d()));
        fmfm0.q(fmfo0.a());
        fmga fmga1 = fmfm0.a();
        this.f.b(accountContext0).V(fmga1);
        flqv flqv0 = flqw.a();
        flqv0.a = "ScottyUpload";
        flqv0.b(flra.c);
        flqw flqw0 = flqv0.a();
        fmai fmai0 = fmaj.a();
        fmai0.g(28);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        fmaj fmaj0 = fmai0.a();
        this.c.c.b(fmaj0);
        UUID uUID0 = UUID.randomUUID();
        fmjk fmjk0 = new fmjk(accountContext0, conversationId0, arr_b);
        fmjf fmjf0 = new fmjf(null);
        gmcd gmcd0 = gmbu.i(new fmiz(this.c.a, fmjf0));
        gmcd gmcd1 = this.c.b.b(uUID0, fmjk0, gmcd0, accountContext0, flqw0, true);
        gmbu.t(gmcd1, new fmjc(this.c, accountContext0, fmga0), gmap.a);
        fmiy fmiy0 = (fmiy)gmcd1.get();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        int v = bitmapFactory$Options0.outHeight;
        int v1 = bitmapFactory$Options0.outWidth;
        fmjn fmjn1 = new fmjn(fmjo0);
        fmjn1.a = fmiy0.a;
        fmjn1.e(arr_b1);
        fmjn1.f(v1);
        fmjn1.c(v);
        fmjn1.d(arr_b.length);
        fmjn1.b = s;
        fmjo fmjo2 = fmjn1.a();
        fmfm fmfm1 = new fmfm(fmga0);
        fmfo fmfo1 = new fmfo();
        fmfo1.c("photos");
        fmfo1.b(((byte[])fmia.c(fmjo2).d()));
        fmfm1.q(fmfo1.a());
        fmga fmga2 = fmfm1.a();
        this.f.b(accountContext0).V(fmga2);
        return fmga2;
    }

    public final File d() {
        return new File(this.d + File.separator + "photos" + File.separator + this.e + File.separator);
    }

    public final InputStream e(Uri uri0) {
        return this.b.getContentResolver().openInputStream(uri0);
    }

    public static String f(ContactId contactId0) {
        return URLEncoder.encode((contactId0.d() + "_" + contactId0.e()), "UTF-8");
    }

    public static String g(ConversationId conversationId0) {
        try {
            switch(conversationId0.e().ordinal()) {
                case 0: {
                    return fmiv.f(conversationId0.c());
                }
                case 1: {
                    return URLEncoder.encode((conversationId0.d().b() + "_" + conversationId0.d().a()), "UTF-8");
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Unexpected encoding exception", unsupportedEncodingException0);
        }
    }

    public static String h(ContactId contactId0) {
        try {
            return fmiv.f(contactId0);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Unexpected encoding exception", unsupportedEncodingException0);
        }
    }

    public final String i(String s, ConversationId conversationId0) {
        File file0 = new File(s);
        this.d().mkdirs();
        return new File(this.d().getAbsolutePath() + File.separator + fmiv.h(conversationId0.a()) + fmiv.g(conversationId0) + "_" + file0.getName()).getAbsolutePath();
    }

    final String j(ConversationId conversationId0, String s) {
        return this.m.getAbsolutePath() + File.separator + fmiv.g(conversationId0) + File.separator + ghgc.a.c(s, StandardCharsets.UTF_8).toString();
    }

    final void k() {
        synchronized(this) {
            if(!this.n) {
                File file0 = this.k;
                File file1 = this.j;
                File file2 = this.l;
                File file3 = this.m;
                String s = file0.getAbsolutePath();
                String s1 = file1.getAbsolutePath();
                String s2 = file2.getAbsolutePath();
                String s3 = file3.getAbsolutePath();
                if(!fmiv.a.getAndSet(true)) {
                    if(!this.l(file1, null)) {
                        flbj.c("PhotosMsgController", "Failed to delete temporary photos directory: " + s1);
                    }
                    if(!this.l(file3, null)) {
                        flbj.c("PhotosMsgController", "Failed to delete temporary images directory: " + s3);
                    }
                }
                if(!file1.exists()) {
                    if(!file1.mkdirs()) {
                        throw new IOException("Failed to create photo tmp dir: " + s1);
                    }
                    flbj.e("PhotosMsgController", "Created photo tmp dir: " + s1);
                    if(!new File(this.d + File.separator + "tmp" + File.separator + ".nomedia").createNewFile()) {
                        throw new IOException("Failed to create tmp dir file");
                    }
                }
                if(!file0.exists()) {
                    if(!file0.mkdirs()) {
                        throw new IOException("Failed to create photo dir: " + s);
                    }
                    flbj.e("PhotosMsgController", "Created photo dir: " + s);
                }
                if(!file3.exists()) {
                    if(!file3.mkdirs()) {
                        throw new IOException("Failed to create temporary images dir: " + s3);
                    }
                    flbj.e("PhotosMsgController", "Created temporary images dir: " + s3);
                    if(!new File(s3 + File.separator + ".nomedia").createNewFile()) {
                        throw new IOException("Failed to create temporary images directory file");
                    }
                }
                if(!file2.exists()) {
                    if(!file2.mkdirs()) {
                        throw new IOException("Failed to create images directory: " + s2);
                    }
                    flbj.e("PhotosMsgController", "Created images directory: " + s2);
                }
                this.n = true;
            }
        }
    }

    public final boolean l(File file0, String s) {
        String s3;
        String s1 = file0.getCanonicalFile().getName();
        if(!file0.exists()) {
            return true;
        }
        if(file0.isDirectory()) {
            String[] arr_s = file0.list();
            if(arr_s != null) {
                int v = 0;
                while(v < arr_s.length) {
                    String s2 = arr_s[v];
                    if(s1.equals(new File(file0, s2).getCanonicalFile().getParentFile().getName())) {
                        if(s == null) {
                            s3 = null;
                        label_15:
                            if(!this.l(new File(file0, s2), s3)) {
                                return false;
                            }
                        }
                        else if(s2.startsWith(s)) {
                            s3 = s;
                            goto label_15;
                        }
                    }
                    else if(!new File(file0, s2).delete()) {
                        return false;
                    }
                    ++v;
                }
                return s == null || file0.getName().startsWith(s) ? file0.delete() : true;
            }
            return false;
        }
        return s == null || file0.getName().startsWith(s) ? file0.delete() : true;
    }

    public static final String m(String s) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyyMMdd", Locale.US);
        flba.a();
        return simpleDateFormat0.format(new Date(System.currentTimeMillis())) + "_" + s + ".jpg";
    }
}

