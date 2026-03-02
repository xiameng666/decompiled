import j..util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;

final class crqh implements crjk {
    final String a;
    final crqs b;
    final crqq c;

    public crqh(crqq crqq0, String s, crqs crqs0) {
        this.a = s;
        this.b = crqs0;
        Objects.requireNonNull(crqq0);
        this.c = crqq0;
        super();
    }

    @Override  // crjk
    public final void a(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        crqq crqq0 = this.c;
        crqq0.E();
        crqq0.G();
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            crqs crqs0 = this.b;
            String s1 = this.a;
            switch(v) {
                case 200: {
                label_11:
                    if(throwable0 == null) {
                        crqq0.o().I(Long.valueOf(crqs0.a));
                        crqq0.aJ().k.c("Successfully uploaded batch from upload queue. appId, status", s1, Integer.valueOf(v));
                        if(crqq0.t().f() && crqq0.o().T(s1)) {
                            crqq0.ak(s1);
                        }
                        else {
                            crqq0.ae();
                        }
                    }
                    else {
                    label_19:
                        String s2 = new String(arr_b, StandardCharsets.UTF_8);
                        String s3 = s2.substring(0, Math.min(0x20, s2.length()));
                        crjg crjg0 = crqq0.aJ().h;
                        Integer integer0 = v;
                        if(throwable0 == null) {
                            throwable0 = s3;
                        }
                        crjg0.d("Network upload failed. Will retry later. appId, status, error", s1, integer0, throwable0);
                        crqq0.o().K(Long.valueOf(crqs0.a));
                        crqq0.ae();
                    }
                    break;
                }
                case 204: {
                    v = 204;
                    goto label_11;
                }
                default: {
                    goto label_19;
                }
            }
        }
        finally {
            crqq0.p = false;
            crqq0.H();
        }
    }
}

