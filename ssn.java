import j..util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class ssn extends stc {
    public static final ssy a;
    public final ssm b;
    public final String c;
    public final String d;
    public final Calendar e;
    public final Calendar f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Map k;
    private final sso l;
    private final byte[] m;

    static {
        ssn.a = new ssy(0xFF41);
    }

    public ssn(sso sso0, byte[] arr_b, ssm ssm0, String s, String s1, Calendar calendar0, Calendar calendar1, String s2, String s3, String s4, String s5, Map map0) {
        super(ssn.a, new byte[0], false, ssa.e);
        this.l = sso0;
        this.m = stm.a(arr_b);
        this.b = ssm0;
        this.c = s;
        this.d = s1;
        this.e = calendar0;
        this.f = calendar1;
        this.g = s2;
        this.h = s3;
        this.i = s4;
        this.j = s5;
        this.k = DesugarCollections.unmodifiableMap(new HashMap(map0));
    }

    @Override  // ssx, ssw
    public final byte[] a() {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            idqk idqk0 = idqk.d(byteArrayOutputStream0, "DER");
            byte[] arr_b = this.b();
            sso sso0 = this.l;
            if(arr_b != null && sso0 != sso.a) {
                idsd idsd0 = new idsd(this.b());
                idqk0.o(new idsi(false, sso0.d, idsd0));
            }
            int v = sso0.d;
            idqk0.o(new idsi(false, v + 1, new idpx(((long)this.b.d))));
            idqk0.o(new idsi(false, v + 2, new idrk(sso.c(this.c))));
            String s = this.d;
            if(s != null && s.length() != 0) {
                idqk0.o(new idsi(false, v + 3, new idrk(s)));
            }
            Calendar calendar0 = this.e;
            if(calendar0 != null) {
                idqk0.o(new idsi(false, v + 4, new idre(calendar0.getTime())));
            }
            Calendar calendar1 = this.f;
            if(calendar1 != null) {
                idqk0.o(new idsi(false, v + 5, new idre(calendar1.getTime())));
            }
            String s1 = this.g;
            if(s1 != null && s1.length() != 0) {
                idqk0.o(new idsi(false, v + 6, new idqn(s1)));
            }
            if(sso0 == sso.b) {
                String s2 = this.h;
                if(s2 != null && s2.length() != 0) {
                    idqk0.o(new idsi(false, v + 7, new idrk(s2)));
                }
                String s3 = this.i;
                if(s3 != null && s3.length() != 0) {
                    idqk0.o(new idsi(false, v + 8, new idrk(s3)));
                }
            }
            else {
                idqk0.o(new idsi(false, v + 7, new idrk(sso.c(this.h))));
                idqk0.o(new idsi(false, v + 8, new idrk(sso.c(this.i))));
            }
            String s4 = this.j;
            if(s4 != null && s4.length() != 0) {
                idqk0.o(new idsi(false, v + 9, new idrk(s4)));
            }
            for(Object object0: this.k.entrySet()) {
                idqk0.o(new idsi(false, ((int)(((Integer)((Map.Entry)object0).getKey()))) + v, new idsd(((byte[])((Map.Entry)object0).getValue()))));
            }
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new IllegalStateException("Failed to DER encode metadata", iOException0);
        }
    }

    public final byte[] b() {
        return stm.a(this.m);
    }
}

