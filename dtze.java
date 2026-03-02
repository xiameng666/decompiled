import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Locale;

public final class dtze {
    public final Context a;
    public final azts b;

    public dtze(Context context0, azts azts0) {
        this.a = context0;
        this.b = azts0;
    }

    public final Drawable a(int v, int v1) {
        return fsce.a(this.a) ? this.a.getDrawable(v1) : this.a.getDrawable(v);
    }

    public final evql b(String s, String s1) {
        return this.c(s, s1, true);
    }

    public final evql c(String s, String s1, boolean z) {
        Locale locale0 = this.a.getResources().getConfiguration().getLocales().get(0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcd ftcd0 = (ftcd)hftp0.b_message;
        s.getClass();
        ftcd0.b |= 1;
        ftcd0.e = s;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftcb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftcb ftcb0 = (ftcb)hftp1.b_message;
        s1.getClass();
        ftcb0.c = s1;
        String s2 = locale0.toLanguageTag();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s2.getClass();
        ((ftcb)hftv0).b |= 1;
        ((ftcb)hftv0).d = s2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftcb ftcb1 = (ftcb)hftp1.b_message;
        ftcb1.b |= 2;
        ftcb1.e = z;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcd ftcd1 = (ftcd)hftp0.b_message;
        ftcb ftcb2 = (ftcb)hftp1.N_build();
        ftcb2.getClass();
        ftcd1.d = ftcb2;
        ftcd1.c = 3;
        byte[] arr_b = ((ftcd)hftp0.N_build()).toBytesArray();
        return this.b.bc(arr_b).c(new dtzd());
    }
}

