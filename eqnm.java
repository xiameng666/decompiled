import com.android.volley.Request.Priority;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import java.util.HashMap;

final class eqnm extends bbfv {
    public eqnm(int v, String s, byte[] arr_b, Object object0, Response.Listener response$Listener0, Response.ErrorListener response$ErrorListener0, HashMap hashMap0, int v1) {
        super(v, s, arr_b, object0, response$Listener0, response$ErrorListener0, null, null, false, hashMap0, 0x5300, v1);
    }

    @Override  // bbfv
    public final String getBodyContentType() {
        return "application/protobuf";
    }

    @Override  // com.android.volley.Request
    public final Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}

