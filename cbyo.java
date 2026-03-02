import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
import java.util.List;

public final class cbyo extends cjtm {
    private final String a;
    private cbwg b;
    private final cbxe c;

    public cbyo(cbxe cbxe0, String s, azug azug0) {
        super(0xA7, "ApplicationLocaleSuggestions", azug0);
        this.c = cbxe0;
        this.a = s;
        this.b = null;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.a;
        if(s == null) {
            this.c.a(Status.d, null, ApiMetadata.b);
            return;
        }
        if(this.b == null) {
            this.b = cbwg.a(null, s);
        }
        cbxe cbxe0 = this.c;
        Status status0 = Status.b;
        cbwg cbwg0 = this.b;
        ccmg ccmg0 = cbwg0.a;
        if(ccmg0 != null) {
            ccmg0.a(bbdg.fK);
        }
        List list0 = cbwg0.c(new LanguagePreferenceParams(-1.0f, 1, 2, null));
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ggdy0.i(gqgo.d(((gqhs)object0).b));
        }
        cbxe0.a(status0, ggdy0.h(), cckf.d(bbdp.cw));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null, ApiMetadata.b);
    }
}

