import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.CRC32;

public final class epdr {
    public final CharSequence a;
    public final List b;
    private static final baun c;

    static {
        epdr.c = new baun("SetupServices", new String[]{"AuditedText"});
    }

    public epdr(CharSequence charSequence0, List list0) {
        this.a = charSequence0;
        this.b = list0;
    }

    public epdr(CharSequence charSequence0, grme[] arr_grme) {
        this(charSequence0, Arrays.asList(arr_grme));
    }

    public final epdr a(String s, epdr epdr0) {
        if(epdr0 == null) {
            return this;
        }
        CharSequence charSequence0 = TextUtils.concat(new CharSequence[]{this.a, s, epdr0.a});
        ArrayList arrayList0 = new ArrayList(this.b);
        arrayList0.addAll(epdr0.b);
        return new epdr(charSequence0, arrayList0);
    }

    public final epdr b(epdr[] arr_epdr) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(this.b);
        CharSequence[] arr_charSequence = {arr_epdr[0].a};
        arrayList0.addAll(arr_epdr[0].b);
        return new epdr(TextUtils.expandTemplate(this.a, arr_charSequence), arrayList0);
    }

    public static epdr c(Context context0, int v) {
        if(v == 0) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grme.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grme grme0 = (grme)hftp0.b_message;
        grme0.b |= 1;
        grme0.c = v;
        grme grme1 = (grme)hftp0.N_build();
        return new epdr(context0.getText(v), new grme[]{grme1});
    }

    public final grmf d() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grmf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grmf grmf0 = (grmf)hftp0.b_message;
        hfuo hfuo0 = grmf0.d;
        if(!hfuo0.c()) {
            grmf0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.b, grmf0.d);
        try {
            CRC32 cRC320 = new CRC32();
            cRC320.update(this.a.toString().getBytes("UTF-8"));
            long v = cRC320.getValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grmf grmf1 = (grmf)hftp0.b_message;
            grmf1.b |= 1;
            grmf1.c = v;
            return (grmf)hftp0.N_build();
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            epdr.c.g("Unable to decode \"" + this.a + "\"", unsupportedEncodingException0, new Object[0]);
            return (grmf)hftp0.N_build();
        }
    }
}

