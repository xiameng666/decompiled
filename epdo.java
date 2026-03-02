import android.text.Html;
import android.text.Spanned;
import com.android.volley.Response.Listener;

public final class epdo implements Response.Listener {
    public final String a;
    public final evqp b;

    public epdo(String s, evqp evqp0) {
        this.a = s;
        this.b = evqp0;
    }

    @Override  // com.android.volley.Response$Listener
    public final void onResponse(Object object0) {
        Spanned spanned0 = Html.fromHtml(((String)object0));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grme.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grme grme0 = (grme)hftp0.b_message;
        grme0.b |= 4;
        grme0.d = this.a;
        epdr epdr0 = new epdr(spanned0, new grme[]{((grme)hftp0.N_build())});
        this.b.c(epdr0);
    }
}

