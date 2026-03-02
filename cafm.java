import android.content.Intent;
import androidx.activity.result.ActivityResult;

public final class cafm implements ibts {
    public final bboh a;
    public final ibts b;

    public cafm(bboh bboh0, ibts ibts0) {
        this.a = bboh0;
        this.b = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        int v = ((ActivityResult)object0).a;
        bboh bboh0 = this.a;
        if(v != -1) {
            ((ggtj)bboh0.j()).z("Account picker failed with result code: %d", v);
            return ibom.a;
        }
        Intent intent0 = ((ActivityResult)object0).b;
        if(intent0 == null) {
            ((ggtj)bboh0.j()).x("Account picker returned OK but data is null.");
            return ibom.a;
        }
        String s = intent0.getStringExtra("authAccount");
        if(s == null) {
            ((ggtj)bboh0.j()).x("Account name is null.");
            return ibom.a;
        }
        this.b.a(s);
        return ibom.a;
    }
}

