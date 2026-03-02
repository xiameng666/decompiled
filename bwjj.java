import android.util.Log;
import j..util.Objects;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

final class bwjj extends AbstractHttpParams {
    final bwjd a;

    public bwjj(bwjd bwjd0) {
        Objects.requireNonNull(bwjd0);
        this.a = bwjd0;
        super();
    }

    public final HttpParams copy() {
        throw new UnsupportedOperationException();
    }

    public final Object getParameter(String s) {
        if(Objects.equals(s, "http.connection.timeout")) {
            return (int)((bwjm)this.a.a).d;
        }
        Log.w("GoogleHttpClient", "Ignoring to get unsupported parameter: " + s);
        return null;
    }

    public final boolean removeParameter(String s) {
        Log.w("GoogleHttpClient", "Ignoring unsupported remove operation for: " + s);
        return true;
    }

    public final HttpParams setParameter(String s, Object object0) {
        if(Objects.equals(s, "http.conn-manager.timeout")) {
            return this;
        }
        if(Objects.equals(s, "http.socket.timeout")) {
            ((bwjm)this.a.a).c = (int)(((Integer)object0));
            return this;
        }
        if(Objects.equals(s, "http.connection.timeout")) {
            ((bwjm)this.a.a).d = (int)(((Integer)object0));
            return this;
        }
        Log.w("GoogleHttpClient", "Ignoring unsupported parameter: " + s);
        return this;
    }
}

