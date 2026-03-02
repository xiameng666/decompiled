import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.LanguagePreference;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
import java.util.List;

public final class cbyr extends cjtm {
    private final String a;
    private final String b;
    private final LanguagePreferenceParams c;
    private final gfsx d;
    private final cbxe e;

    public cbyr(cbxe cbxe0, String s, String s1, LanguagePreferenceParams languagePreferenceParams0, azug azug0) {
        super(0xA7, "LanguagePreference", azug0);
        this.e = cbxe0;
        this.a = s;
        this.b = s1;
        this.c = languagePreferenceParams0;
        this.d = gfqx.a;
    }

    public cbyr(cbxe cbxe0, String s, String s1, LanguagePreferenceParams languagePreferenceParams0, Integer integer0, azug azug0) {
        super(0xA7, "LanguagePreference", azug0);
        this.e = cbxe0;
        this.a = s;
        this.b = s1;
        this.c = languagePreferenceParams0;
        this.d = gfsx.m(integer0);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.b;
        if(s == null) {
            this.e.d(Status.d, null, ApiMetadata.b);
            return;
        }
        cbxe cbxe0 = this.e;
        LanguagePreferenceParams languagePreferenceParams0 = this.c;
        cbwg cbwg0 = cbwg.b(this.a, s, this.d);
        ccmg ccmg0 = cbwg0.a;
        Status status0 = Status.b;
        if(ccmg0 != null) {
            ccmg0.a(bbdg.fJ);
        }
        List list0 = cbwg0.c(languagePreferenceParams0);
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ggdy0.i(new LanguagePreference(gqgo.d(((gqhs)object0).b), ((gqhs)object0).c, ((gqhs)object0).d));
        }
        cbxe0.d(status0, ggdy0.h(), cckf.d(bbdp.cw));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e.d(status0, null, ApiMetadata.b);
    }
}

