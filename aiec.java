import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class aiec implements Runnable {
    public final azyy a;
    public static final int b;
    private static final baun c;
    private final String d;

    static {
        aiec.c = new baun("RevokeAccessOperation", new String[0]);
    }

    public aiec(String s) {
        batl.q(s);
        this.d = s;
        this.a = new azyy(null);
    }

    @Override
    public final void run() {
        Status status0;
        try {
            status0 = Status.d;
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)cjwq.b().a(new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.d), "auth-api");
            httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int v = httpURLConnection0.getResponseCode();
            if(v == 200) {
                status0 = Status.b;
            }
            else {
                aiec.c.f("Unable to revoke access!", new Object[0]);
            }
            aiec.c.d("Response Code: " + v, new Object[0]);
        }
        catch(IOException iOException0) {
            aiec.c.f("IOException when revoking access: " + iOException0.toString(), new Object[0]);
        }
        catch(Exception exception0) {
            aiec.c.f("Exception when revoking access: " + exception0.toString(), new Object[0]);
        }
        this.a.n(status0);
    }
}

