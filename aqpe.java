import android.content.Context;
import android.net.Uri.Builder;

public final class aqpe {
    public static final baun a;
    public final Context b;
    public final aqnl c;
    public final hjkd d;

    static {
        aqpe.a = aqql.a("ScottyHttpClient");
    }

    public aqpe(Context context0) {
        this.b = context0;
        this.c = new aqnl(context0, aqxr.a());
        hjkf hjkf0 = hrsa.j() ? new hjkf(babh.a().getCronetEngine(), new fgvy(), new bblp(0x7FFFFFFF, 10)) : new hjji(new bbft(-1, 1040));
        this.d = new hjkd(hjkf0);
    }

    public static void a(Uri.Builder uri$Builder0, hise hise0) {
        uri$Builder0.appendQueryParameter("request_header.experiment_overrides", hise0.d).appendQueryParameter("request_header.client_info.version", (hise0.c == null ? hish.a : hise0.c).b).appendQueryParameter("request_header.client_info.client_id", String.valueOf((hise0.c == null ? hish.a : hise0.c).c));
    }
}

