import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import java.util.Map.Entry;
import jeb.synthetic.FIN;

abstract class bwwp extends ContentProvider {
    private abya a;
    private final UriMatcher b;

    public bwwp() {
        this.b = new UriMatcher(-1);
    }

    public abstract String b(String arg1);

    protected abstract abxz c();

    protected abstract abya d();

    protected abstract String e();

    protected abstract void f();

    protected abstract Cursor g(Uri arg1, String[] arg2);

    @Override  // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri0) {
        if(this.b.match(uri0) == -1) {
            return this.e();
        }
        abuy.a(this.getContext());
        return "vnd.android.cursor.dir/vnd.goodle.appdatasearch";
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        this.f();
        abya abya0 = this.d();
        this.a = abya0;
        abyc[] arr_abyc = abya0.b;
        String[] arr_s = new String[4];
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_s[v1] = arr_abyc[v1].a;
        }
        for(int v = 0; v < 4; ++v) {
            String s = this.a.a;
            String s1 = this.b(arr_s[v]);
            this.b.addURI(s, s1, v);
        }
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return this.query(uri0, arr_s, s, arr_s1, s1, null);
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
        int v = this.b.match(uri0);
        if(v == -1) {
            return this.g(uri0, arr_s1);
        }
        abuy.a(this.getContext());
        abxh abxh0 = abxh.d(arr_s1);
        abyc abyc0 = this.a.b[v];
        abxz abxz0 = this.c();
        if(abxz0 == null) {
            abxz0 = null;
            goto label_11;
        }
        if(this.a.equals(abxz0.c)) {
        label_11:
            if(abxz0 == null) {
                Log.e(".AppDataSearchProvider", "Could not get appdatasearch database for uri " + uri0);
                return null;
            }
            if(abxh0.c()) {
                SQLiteDatabase sQLiteDatabase0 = abxz0.d();
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.beginTransaction();
                    try {
                        Cursor cursor0 = sQLiteDatabase0.query("incarnation_appdatasearch", new String[]{"seqno_table_complete"}, "corpus_name = ?", new String[]{abyc0.a}, null, null, null);
                        if(cursor0 == null) {
                            abxz.f(sQLiteDatabase0, abyc0);
                            sQLiteDatabase0.setTransactionSuccessful();
                        }
                        else {
                            int v2 = FIN.finallyOpen$NT();
                            if(cursor0.moveToNext()) {
                                int v3 = cursor0.getInt(cursor0.getColumnIndex("seqno_table_complete"));
                                FIN.finallyExec$NT(v2);
                                if(v3 != 1) {
                                    abxz.f(sQLiteDatabase0, abyc0);
                                    sQLiteDatabase0.setTransactionSuccessful();
                                }
                            }
                            else {
                                FIN.finallyCodeBegin$NT(v2);
                                abxz.f(sQLiteDatabase0, abyc0);
                                sQLiteDatabase0.setTransactionSuccessful();
                            }
                        }
                    }
                    finally {
                        sQLiteDatabase0.endTransaction();
                    }
                    goto label_40;
                }
            }
            else {
            label_40:
                if(abxh0.a()) {
                    long v4 = abxh0.a;
                    long v5 = abxh0.b;
                    String s2 = abyc0.c;
                    String s3 = abxy.c(abyc0);
                    String s4 = abxz.e(s2, abyc0.d);
                    StringBuilder stringBuilder0 = new StringBuilder(0x400);
                    stringBuilder0.append("SELECT ");
                    stringBuilder0.append(abxz.e(s3, "seqno"));
                    stringBuilder0.append(" AS seqno, CASE WHEN ");
                    stringBuilder0.append(abxz.e(s3, "action_type"));
                    stringBuilder0.append(" = \'0\' AND ");
                    stringBuilder0.append(s4);
                    stringBuilder0.append(" IS NOT NULL THEN \'add\' ELSE \'del\' END AS action,");
                    stringBuilder0.append(abxz.e(s3, "uri"));
                    stringBuilder0.append(" AS uri,");
                    stringBuilder0.append(abyc0.e);
                    stringBuilder0.append(" AS doc_score,");
                    stringBuilder0.append(abyc0.f);
                    stringBuilder0.append(" AS created_timestamp");
                    for(Object object0: abyc0.g.entrySet()) {
                        String s5 = (String)((Map.Entry)object0).getValue();
                        String s6 = abxg.a(((String)((Map.Entry)object0).getKey()));
                        stringBuilder0.append(",");
                        stringBuilder0.append(abxz.e(s2, s5));
                        stringBuilder0.append(" AS ");
                        stringBuilder0.append(s6);
                    }
                    stringBuilder0.append(" FROM (SELECT * FROM [");
                    stringBuilder0.append(s3);
                    stringBuilder0.append("] WHERE ");
                    stringBuilder0.append(abxz.e(s3, "tag"));
                    stringBuilder0.append(" IS NULL) AS ");
                    stringBuilder0.append(s3);
                    stringBuilder0.append(" LEFT OUTER JOIN [");
                    stringBuilder0.append(s2);
                    stringBuilder0.append("] ON ");
                    stringBuilder0.append(abxz.e(s3, "uri"));
                    stringBuilder0.append(" = ");
                    stringBuilder0.append(s4);
                    stringBuilder0.append(" WHERE ");
                    stringBuilder0.append(abxz.e(s3, "seqno"));
                    stringBuilder0.append(" > ");
                    stringBuilder0.append(v4);
                    if(!abyc0.h) {
                        stringBuilder0.append(" GROUP BY ");
                        stringBuilder0.append(abxz.e(s3, "seqno"));
                    }
                    stringBuilder0.append(" ORDER BY ");
                    stringBuilder0.append(abxz.e(s3, "seqno"));
                    stringBuilder0.append(" LIMIT ");
                    stringBuilder0.append(v5);
                    SQLiteDatabase sQLiteDatabase1 = abxz0.c();
                    return sQLiteDatabase1 == null ? null : abxz.b(sQLiteDatabase1.rawQuery(stringBuilder0.toString(), null), abyc0, sQLiteDatabase1);
                }
                if(abxh0.b()) {
                    SQLiteDatabase sQLiteDatabase2 = abxz0.c();
                    return abxz.b(new MatrixCursor(((String[])abxg.b.toArray(new String[abxg.b.size()]))), abyc0, sQLiteDatabase2);
                }
            }
            return null;
        }
        throw new IllegalStateException("Content provider spec in db does not match content provider\'s");
    }
}

