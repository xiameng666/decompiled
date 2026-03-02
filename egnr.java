import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.SimPhonebookContract.ElementaryFiles;
import android.provider.SimPhonebookContract.SimRecords;
import java.util.List;
import java.util.Set;
import jeb.synthetic.TWR;

public final class egnr implements egns {
    static final String[] a;
    private final ContentResolver b;
    private Set c;

    static {
        egnr.a = new String[]{"name", "phone_number", "record_number"};
    }

    public egnr(ContentResolver contentResolver0) {
        this.b = contentResolver0;
    }

    @Override  // egns
    public final List a(egnt egnt0) {
        List list0;
        if(!this.b().contains(egnt0)) {
            return ggna.a;
        }
        Uri uri0 = SimPhonebookContract.SimRecords.getContentUri(egnt0.a, egnt0.b);
        Cursor cursor0 = this.b.query(uri0, egnr.a, null, null);
        try {
            if(cursor0 == null) {
                return ggna.a;
            }
            ggdy ggdy0 = gged_interceptors.e(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = gfta.b(cursor0.getString(0));
                String s1 = gfta.b(cursor0.getString(1));
                int v = cursor0.getInt(2);
                if(!s1.isEmpty()) {
                    ggdy0.i(new egnp(egnt0, v, s, s1));
                }
            }
            list0 = ggdy0.h();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return list0;
    }

    public final Set b() {
        synchronized(this) {
            Set set0 = this.c;
            if(set0 != null) {
                return set0;
            }
            Cursor cursor0 = this.b.query(SimPhonebookContract.ElementaryFiles.CONTENT_URI, new String[]{"subscription_id", "ef_type"}, null, null);
            try {
                if(cursor0 == null) {
                    this.c = ggnj.a;
                    return ggnj.a;
                }
                ggfn ggfn0 = ggfp.D(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    ggfn0.i(new egnt(cursor0.getInt(0), cursor0.getInt(1)));
                }
                this.c = ggfn0.h();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
        }
        return this.c;
    }
}

