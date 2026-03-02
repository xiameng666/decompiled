import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.api.Status;
import jeb.synthetic.TWR;

public final class ejwf extends ejvr {
    private final String b;

    public ejwf(ejtq ejtq0, String s, azug azug0) {
        super(ejtq0, "HasUpcomingReminders", azug0);
        this.b = s;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String[] arr_s = {String.valueOf(ejte.b(context0, this.b).a), "0", "0"};
        Cursor cursor0 = context0.getContentResolver().query(ejtz.a, null, "account_id=? AND deleted=? AND archived=?", arr_s, null);
        boolean z = false;
        Status status0 = new Status(0);
        if(cursor0 != null) {
            try {
                z = cursor0.moveToFirst();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
        }
        this.a.a(z, status0, cckf.d(bbdp.ex));
    }
}

