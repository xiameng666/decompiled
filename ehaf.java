import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public abstract class ehaf implements AutoCloseable {
    public final Cursor a;

    protected ehaf(Cursor cursor0) {
        this.a = cursor0;
    }

    public abstract Object b();

    @Override
    public final void close() {
        this.a.close();
    }

    public final int e() {
        return this.a.getCount();
    }

    protected final eggh f() {
        if(gfta.c(this.h("sync1"))) {
            return null;
        }
        try {
            byte[] arr_b = Base64.decode(this.h("sync1"), 2);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)eggh.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (eggh)hftv0;
        }
        catch(IllegalArgumentException | hfur exception0) {
            egig.c("FSA2_CursorWrapper", "SyncOneColumnData parsing error", exception0);
            return null;
        }
    }

    protected final Long g(String s) {
        int v = this.a.getColumnIndex(s);
        return v == -1 || this.a.isNull(v) ? null : this.a.getLong(v);
    }

    protected final String h(String s) {
        int v = this.a.getColumnIndex(s);
        return v == -1 || this.a.isNull(v) ? null : this.a.getString(v);
    }

    public final List i() {
        List list0 = new ArrayList();
        try {
            while(true) {
                this = TWR.getResource$NT(this);
                TWR.declareResource(this);
                TWR.useResource$NT(this);
                Object object0 = this.b();
                if(object0 == null) {
                    break;
                }
                TWR.useResource$NT(this);
                list0.add(object0);
            }
            return list0;
        }
        catch(Throwable throwable0) {
            TWR.moot$NT();
            throw throwable0;
        }
    }

    protected final boolean j(String s) {
        int v = this.a.getColumnIndex(s);
        return v != -1 && !this.a.isNull(v) && this.a.getLong(v) != 0L;
    }

    protected final boolean k() {
        return this.a.moveToNext();
    }

    protected final byte[] l(String s) {
        int v = this.a.getColumnIndex(s);
        return v == -1 || this.a.isNull(v) ? null : this.a.getBlob(v);
    }

    protected final void m() {
        this.a.moveToFirst();
    }
}

