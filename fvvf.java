import java.nio.charset.Charset;

public final class fvvf {
    public static int a(String s) {
        Charset charset0 = Charset.defaultCharset();
        return (char)ghfs.a.c(s, charset0).a();
    }

    public static void b(ProtoLiteBuilder hftp0, int v) {
        int v1 = gxtu.b(v);
        if(v1 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwvc gwvc0 = (gwvc)hftp0.b_message;
            gwvc0.b |= 4;
            gwvc0.c = v1;
            if(v >= 5035 && v <= 5990) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gwvc)hftp0.b_message).g = 1;
                ((gwvc)hftp0.b_message).b |= 0x200;
            }
        }
    }
}

