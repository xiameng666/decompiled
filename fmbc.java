import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class fmbc {
    public abstract ContactId a();

    public abstract ConversationId.GroupId b();

    public static gfsx c(JSONObject jSONObject0) {
        try {
            switch(fmbd.b(jSONObject0.getInt("EVENT_CALLBACK_DESTINATION_TYPE")) - 1) {
                case 0: {
                    return gfsx.m(fmca.a);
                }
                case 1: {
                    gfsx gfsx1 = ContactId.f(jSONObject0.getJSONObject("EVENT_CALLBACK_DESTINATION"));
                    if(gfsx1.i()) {
                        return gfsx.m(fmcc.a(((ContactId)gfsx1.d())));
                    }
                    break;
                }
                default: {
                    gfsx gfsx0 = ConversationId.GroupId.c(jSONObject0.getJSONObject("EVENT_CALLBACK_DESTINATION"));
                    if(gfsx0.i()) {
                        return gfsx.m(fmcc.b(((ConversationId.GroupId)gfsx0.d())));
                    }
                }
            }
        }
        catch(JSONException unused_ex) {
            flbj.c("Action", "failed to convert JSONObject to EventCallbackDestination");
        }
        return gfqx.a;
    }

    public abstract int d();
}

