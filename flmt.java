import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flmt implements Runnable {
    public final flmu a;
    public final String b;
    public final String[] c;
    public final ConversationId d;

    public flmt(flmu flmu0, String s, String[] arr_s, ConversationId conversationId0) {
        this.a = flmu0;
        this.b = s;
        this.c = arr_s;
        this.d = conversationId0;
    }

    @Override
    public final void run() {
        flmu flmu0 = this.a;
        Uri uri0 = flmu0.l("messages");
        String[] arr_s = this.c;
        flmu0.e.a(uri0, this.b, arr_s);
        for(int v = 0; v <= 0; ++v) {
            flmu0.P(arr_s[v]);
        }
        flmu0.J(this.d);
    }
}

