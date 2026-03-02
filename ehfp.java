import android.accounts.Account;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.List;
import jeb.synthetic.TWR;

abstract class ehfp {
    public final ehbp a;
    public final Account b;
    public final egzp c;
    public volatile Thread d;

    public ehfp(ehbp ehbp0, Account account0, egzp egzp0) {
        this.a = ehbp0;
        this.b = account0;
        this.c = egzp0;
    }

    public final void a(List list0, ehic ehic0) {
        this.b(list0, ehic0);
        list0.clear();
    }

    public abstract void b(List arg1, ehic arg2);

    public final void c(ehic ehic0, ehic ehic1) {
        this.d = new Thread(new ehfn(this, ehic0, ehic1));
        this.c.a(this.d);
        this.d.start();
    }

    static void d(ehfp ehfp0) {
        ehfp0.d = null;
    }

    public final int e(Uri uri0, String s) {
        int v;
        Cursor cursor0 = this.a.a(uri0, ehab.a, s, null, null);
        try {
            if(cursor0 == null) {
                egig.b("FSA2_DatabaseReader", "Failed to query CP2.");
                throw new ehfh(new RemoteException("Unable to query CP2."));
            }
            cursor0.moveToLast();
            v = cursor0.getInt(0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }
}

