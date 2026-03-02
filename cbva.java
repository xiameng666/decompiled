import android.net.Uri;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

public final class cbva {
    public static final void a(xob xob0, String s) {
        ibuq.f(s, "contentUrl");
        GoogleHelp googleHelp0 = new GoogleHelp("android_context");
        googleHelp0.q = Uri.parse(s);
        InProductHelp inProductHelp0 = new InProductHelp(googleHelp0, null, null, 0, null, 0, null);
        inProductHelp0.c = s;
        new bthl(xob0).b(inProductHelp0);
    }
}

