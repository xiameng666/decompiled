import android.accounts.Account;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.Groups;
import android.provider.ContactsContract.Settings;
import java.util.List;
import jeb.synthetic.TWR;

public final class ehag extends ehaf {
    public static final String b;
    public static final String c;

    static {
        ehag.b = String.format("%s IS NULL AND %s !=0", "data_set", "should_sync");
        ehag.c = String.format("%s IS NULL", "data_set");
    }

    private ehag(Cursor cursor0) {
        super(cursor0);
    }

    public final egzx a() {
        if(!this.k()) {
            return null;
        }
        egzw egzw0 = egzx.b();
        egzw0.a = this.g("_id");
        egzw0.d = this.h("sourceid");
        egzw0.e = this.h("system_id");
        egzw0.f = this.h("title");
        egzw0.c = this.g("sync3");
        egzw0.g = this.h("sync2");
        egzw0.h = this.h("account_name");
        egzw0.b = this.g("version");
        if(hxba.a.e().I()) {
            egzw0.i = this.h("account_type");
        }
        if(hxba.p()) {
            egzw0.j = this.h("data_set");
        }
        if(hxcc.h()) {
            egzw0.m = this.f();
        }
        if(this.j("favorites")) {
            egzw0.e(true);
        }
        if(this.j("group_visible")) {
            egzw0.h(true);
        }
        if(this.j("group_is_read_only")) {
            egzw0.f(true);
        }
        if(this.j("auto_add")) {
            egzw0.b(true);
        }
        if(!this.j("should_sync")) {
            egzw0.g(false);
        }
        if(this.j("dirty")) {
            egzw0.d(true);
        }
        if(this.j("deleted")) {
            egzw0.c(true);
        }
        return egzw0.a();
    }

    @Override  // ehaf
    public final Object b() {
        return this.a();
    }

    public static ehag c(ehbp ehbp0, Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        Cursor cursor0 = ehbp0.a(uri0, arr_s, s, arr_s1, s1);
        if(cursor0 != null) {
            return new ehag(cursor0);
        }
        throw new RemoteException("Unable to query CP2.");
    }

    public static ehag d(ehbp ehbp0, Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        try {
            return ehag.c(ehbp0, uri0, arr_s, s, arr_s1, s1);
        }
        catch(RemoteException remoteException0) {
            throw new ehfh(remoteException0);
        }
    }

    public static List n(ehbp ehbp0, Account account0, String s) {
        return ehag.d(ehbp0, ehab.c(ContactsContract.Groups.CONTENT_URI, account0), new String[]{"_id", "sourceid"}, s, null, null).i();
    }

    public static boolean o(ehbp ehbp0, Account account0) {
        boolean z;
        Cursor cursor0 = ehbp0.a(ehab.c(ContactsContract.Settings.CONTENT_URI, account0), new String[]{"should_sync"}, null, null, null);
        if(cursor0 != null) {
        alab1:
            while(true) {
                z = true;
                try {
                    while(true) {
                    label_3:
                        if(!cursor0.moveToNext()) {
                            break alab1;
                        }
                        if(cursor0.getLong(0) == 0L) {
                            break;
                        }
                        continue alab1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_12;
                }
                z = false;
                goto label_3;
            }
            cursor0.close();
            return z;
        }
        try {
            throw new ehfh(new RemoteException("Unable to query CP2."));
        }
        catch(Throwable throwable0) {
        label_12:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    }
}

