import android.content.Context;
import android.text.TextUtils;

class ehcl {
    public final baqr a;
    public final egke b;
    public final String c;
    public final ehif d;
    public final ehim e;
    public final gsts f;
    public final ehje g;

    public ehcl(Context context0, baqr baqr0, egke egke0, String s, bbng bbng0, gfug gfug0, ehim ehim0, gsts gsts0, ehje ehje0) {
        this.a = baqr0;
        this.b = egke0;
        this.g = ehje0;
        this.c = TextUtils.isEmpty(s) ? "" : "AID_" + s;
        this.f = gsts0;
        this.e = ehim0;
        this.d = new ehif(context0, ehim0, gfug0);
    }
}

