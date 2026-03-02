import android.net.Uri.Builder;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public final class fedq {
    public static final Uri a;

    static {
        fedq.a = new Uri.Builder().scheme("wear").path("/wearable/app_catalog").build();
    }

    public static Uri a(String s) {
        return fedq.a.buildUpon().authority(s).build();
    }

    public static fdpl b(fexh fexh0) {
        return fdpl.b(fexh0.c, fexh0.d.toByteArray());
    }

    public static fexh c(fdpl fdpl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexh.a).v_newBuilder();
        String s = fdpl0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexh fexh0 = (fexh)hftp0.b_message;
        s.getClass();
        fexh0.b |= 1;
        fexh0.c = s;
        ByteString hfsf0 = ByteString.copyFrom(fdpl0.c());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexh fexh1 = (fexh)hftp0.b_message;
        fexh1.b |= 2;
        fexh1.d = hfsf0;
        return (fexh)hftp0.N_build();
    }

    public static List d(Iterable iterable0) {
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            list0.add(fedq.b(((fexh)object0)));
        }
        return list0;
    }
}

