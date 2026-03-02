import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import jeb.synthetic.TWR;

final class ahzt extends ContentObserver {
    private final baun a;
    private final ahzz b;
    private final aial c;

    public ahzt(Context context0, aial aial0) {
        super(null);
        this.a = new baun("RcsMessageContentObserver");
        this.b = new ahzz(context0);
        this.c = aial0;
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri0) {
        if(uri0 != null) {
            this.onChange(z, gged_interceptors.l(uri0), 0);
        }
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri0, int v) {
        if(uri0 != null) {
            this.onChange(z, gged_interceptors.l(uri0), v);
        }
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z, Collection collection0, int v) {
        for(Object object0: collection0) {
            Uri uri0 = (Uri)object0;
            if(uri0 != null) {
                ahzz ahzz0 = this.b;
                Cursor cursor0 = ahzz0.e.getContentResolver().query(uri0, new String[]{"_id", "sub_id", "date", "ct_cls"}, null, null, null);
                ahzs ahzs0 = null;
                try {
                    if(cursor0 == null) {
                        ahzz.a.d("can\'t load rcs message; null message cursor", new Object[0]);
                    }
                    else {
                        cursor0.moveToNext();
                        int v1 = cursor0.getInt(cursor0.getColumnIndexOrThrow("ct_cls"));
                        baun baun0 = ahzz.a;
                        baun0.d("loading rcs message", new Object[0]);
                        if(v1 == 0x87) {
                            long v2 = cursor0.getLong(cursor0.getColumnIndexOrThrow("_id"));
                            ahzv ahzv0 = new ahzv();
                            String s = (String)ahzz0.a(new ahzu(ahzz0, Uri.parse(a.D(v2, "content://mms/", "/addr"))), ahzv0, "getSenderAddress").orElse(null);
                            List list0 = (List)ahzz0.a(new ahzw(ahzz0, String.format(Locale.US, "%s != \'%s\' AND %s = %d", "ct", "application/smil", "mid", v2)), new ahzx(), "loadRcsMessageParts").orElseGet(new ahzy());
                            if(s != null && !list0.isEmpty()) {
                                int v3 = (int)cursor0.getLong(cursor0.getColumnIndexOrThrow("sub_id"));
                                gged_interceptors gged0 = gged_interceptors.i(list0);
                                if(gged0 == null) {
                                    throw new IllegalStateException("Missing required properties: rcsMessageParts");
                                }
                                ahzs0 = new ahzs(s, v3, gged0);
                            }
                            else {
                                baun0.d("can\'t load rcs message: either no sender address or no content", new Object[0]);
                            }
                        }
                        else {
                            baun0.d("message is not RCS message %s", new Object[]{v1});
                        }
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                if(cursor0 != null) {
                    cursor0.close();
                }
                this.a.h("Received rcs message", new Object[0]);
                aial aial0 = this.c;
                if(ahzs0 != null) {
                    synchronized(aiam.class) {
                        aian aian0 = aiam.a(aial0.a, aial0.c);
                        aiar aiar0 = new aiar(ahzs0);
                        aian0.c(ahzs0.b, aiar0);
                    }
                }
            }
        }
    }
}

