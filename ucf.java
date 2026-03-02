import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class ucf implements ubl {
    private final Uri a;
    private final uch b;
    private InputStream c;

    public ucf(Uri uri0, uch uch0) {
        this.a = uri0;
        this.b = uch0;
    }

    @Override  // ubl
    public final Class a() {
        return InputStream.class;
    }

    public static ucf c(Context context0, Uri uri0, ucg ucg0) {
        ues ues0 = txc.b(context0).f;
        return new ucf(uri0, new uch(txc.b(context0).c().b(), ucg0, ues0, context0.getContentResolver()));
    }

    @Override  // ubl
    public final void d() {
    }

    @Override  // ubl
    public final void e() {
        InputStream inputStream0 = this.c;
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // ubl
    public final uag fw() {
        return uag.a;
    }

    @Override  // ubl
    public final void g(txn txn0, ubk ubk0) {
        int v;
        InputStream inputStream0;
        String s;
        Cursor cursor1;
        Cursor cursor0;
        Uri uri0;
        uch uch0;
        try {
            uch0 = this.b;
            uri0 = this.a;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            goto label_57;
        }
        try {
            cursor0 = null;
            cursor1 = null;
            cursor1 = uch0.a.a(uri0);
            goto label_8;
        }
        catch(SecurityException unused_ex) {
            goto label_12;
        }
        catch(Throwable throwable0) {
        }
        try {
            goto label_17;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            goto label_57;
        }
    label_8:
        if(cursor1 == null) {
            goto label_22;
        }
        else {
            try {
                if(cursor1.moveToFirst()) {
                    s = cursor1.getString(0);
                    goto label_20;
                }
                else {
                    goto label_22;
                }
                goto label_25;
            }
            catch(SecurityException unused_ex) {
            }
            catch(Throwable throwable0) {
                goto label_16;
            }
            try {
            label_12:
                if(cursor1 != null) {
                    cursor1.close();
                    goto label_24;
                label_16:
                    cursor0 = cursor1;
                label_17:
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    throw throwable0;
                label_20:
                    cursor1.close();
                    goto label_25;
                label_22:
                    if(cursor1 != null) {
                        cursor1.close();
                    }
                }
            label_24:
                s = null;
            label_25:
                if(TextUtils.isEmpty(s)) {
                    inputStream0 = null;
                }
                else {
                    File file0 = new File(s);
                    if(file0.exists() && file0.length() > 0L) {
                        Uri uri1 = Uri.fromFile(file0);
                        try {
                            inputStream0 = uch0.b.openInputStream(uri1);
                        }
                        catch(NullPointerException nullPointerException0) {
                            throw (FileNotFoundException)new FileNotFoundException(a.Q(uri1, uri0, "NPE opening uri: ", " -> ")).initCause(nullPointerException0);
                        }
                    }
                    else {
                        inputStream0 = null;
                    }
                }
                goto label_36;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                goto label_57;
            }
        }
        goto label_25;
    label_36:
        if(inputStream0 == null) {
            goto label_50;
        }
        else {
            try {
                cursor0 = this.b.b.openInputStream(this.a);
                v = uax.e(this.b.c, ((InputStream)cursor0), this.b.d);
            }
            catch(IOException | NullPointerException unused_ex) {
                if(cursor0 != null) {
                    try {
                        ((InputStream)cursor0).close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                goto label_50;
            }
            catch(Throwable throwable1) {
                if(cursor0 != null) {
                    try {
                        ((InputStream)cursor0).close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                try {
                    throw throwable1;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    goto label_57;
                }
            }
            if(cursor0 != null) {
                try {
                    ((InputStream)cursor0).close();
                    goto label_51;
                label_50:
                    v = -1;
                }
                catch(IOException unused_ex) {
                }
            }
        }
        try {
        label_51:
            if(v != -1) {
                inputStream0 = new ubr(inputStream0, v);
            }
            this.c = inputStream0;
            ubk0.c(inputStream0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
        label_57:
            ubk0.f(fileNotFoundException0);
        }
    }
}

