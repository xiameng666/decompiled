import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

public final class aavw extends clcy {
    public final aamy a;
    public final aamz b;
    private final gmcg d;
    private gmcd e;

    public aavw(aamy aamy0, aamz aamz0, gmcg gmcg0) {
        super(new ByteArrayOutputStream());
        this.a = aamy0;
        this.b = aamz0;
        this.d = gmcg0;
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        try {
            if(clcq0.a() == 200) {
                byte[] arr_b = ((ByteArrayOutputStream)this.i()).toByteArray();
                ibuq.e(arr_b, "toByteArray(...)");
                Charset charset0 = StandardCharsets.UTF_8;
                ibuq.e(charset0, "UTF_8");
                this.g(new aavt(this, new JSONObject(new String(arr_b, charset0))));
                return;
            }
            new clbw("Something went wrong with the network request.");
            this.h();
        }
        catch(UnsupportedEncodingException unused_ex) {
            this.h();
        }
        catch(JSONException unused_ex) {
            this.h();
        }
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        this.h();
    }

    private final void g(ibth ibth0) {
        gmcd gmcd0 = this.e;
        if(gmcd0 != null) {
            gmcd0.cancel(false);
        }
        aavu aavu0 = new aavu(ibth0);
        this.e = this.d.d(aavu0);
    }

    private final void h() {
        this.g(new aavv(this));
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ibuq.f(clcn0, "request");
        ibuq.f(s, "newLocationUrl");
        clcn0.c();
    }
}

