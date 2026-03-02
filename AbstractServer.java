import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import java.io.IOException;

public class AbstractServer {
    public final Context context;

    public AbstractServer(Context context0) {
        this.context = context0;
    }

    public final String getAppCert(baqr baqr0) {
        try {
            return new aiga(this.context).b(baqr0.e);
        }
        catch(IOException iOException0) {
            Log.w("AbstractServer", "IOException while getting app cert is being ignored.", iOException0);
            return null;
        }
        catch(acse acse0) {
            Log.w("AbstractServer", "GoogleAuthException while getting app cert is being ignored.", acse0);
            return null;
        }
    }

    public final String getAuthToken(baqr baqr0) {
        String s = baqr0.c("auth_token");
        if(!TextUtils.isEmpty(s)) {
            return s;
        }
        if(baqr0.d() == null) {
            hrle.e();
            return null;
        }
        bbfz bbfz0 = new bbfz(baqr0);
        try {
            return bbfz0.b(this.context);
        }
        catch(IOException iOException0) {
            throw new VolleyError(iOException0);
        }
    }
}

