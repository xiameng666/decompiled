import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.util.Log;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

public final class feew implements fduo {
    public static final Uri a;
    public final fdvl b;
    public final fdpl c;
    public feev d;
    public final fdye e;

    static {
        feew.a = new Uri.Builder().scheme("wear").path("/ble_support").build();
    }

    public feew(fdvl fdvl0, fdpl fdpl0, fdye fdye0) {
        this.b = fdvl0;
        this.c = fdpl0;
        this.e = fdye0;
    }

    public final void a(fduq fduq0) {
        feev feev0 = this.d;
        batl.s(feev0);
        fdun fdun0 = fduq0.b;
        String s = fdun0.a;
        try {
            byte[] arr_b = fdun0.c();
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fexw.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            boolean z = ((fexw)hftv0).c;
            ffmn.a("BleSupportService", "sendBleSupportStateUpdate: %s, %b", new Object[]{s, Boolean.valueOf(z)});
            ffds ffds0 = ((felm)feev0).c;
            Iterator iterator0 = ffds0.h().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                fczq fczq0 = (fczq)object0;
                if(fczq0.j != null && fczq0.j.equals(s) && z != fczq0.v) {
                    Log.d("Wear_ConnectionMgr", "Config " + fczq0.b + " updated BLE support: " + z);
                    String s1 = fczq0.b;
                    ffmn.a("ConnectionConfig", "updatePeerSupportsBle(%s, %s)", new Object[]{s1, Boolean.valueOf(z)});
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("peerSupportsBle", Integer.valueOf(((int)z)));
                    if(s1 == null) {
                        s1 = "NULL_STRING";
                    }
                    try {
                        ffds0.a.getWritableDatabase().updateWithOnConflict("connectionConfigurations", contentValues0, "name=?", new String[]{s1}, 5);
                    }
                    catch(SQLiteException sQLiteException0) {
                        if(Log.isLoggable("ConnectionConfig", 6)) {
                            Log.e("ConnectionConfig", "updating configuration peerSupportsBle flag failed", sQLiteException0);
                        }
                    }
                    if(z && felm.a && ((felm)feev0).y && fczq0.u != 3) {
                        fdne.a(2, true);
                    }
                }
            }
        }
        catch(hfur hfur0) {
            ffmn.c("BleSupportService", hfur0, "Failed to parse BLE support data item.", new Object[0]);
        }
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            if(this.c.equals(fduq0.a) && Objects.equals(fduq0.b.b, "/ble_support") && !fduq0.c) {
                this.a(fduq0);
            }
        }
    }
}

