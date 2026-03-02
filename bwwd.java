import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;

public final class bwwd extends bwwb {
    private final Map c;

    public bwwd(String s, Map map0) {
        super(s);
        this.c = map0;
    }

    public final int j(Pair pair0) {
        if(pair0.second == null) {
            throw this.c("length must specify a value", ((bwwa)pair0.first).a);
        }
        if(!(((bwwa)pair0.second).b instanceof Integer)) {
            throw this.c("Expected an integer", ((bwwa)pair0.second).a);
        }
        int v = (int)(((Integer)((bwwa)pair0.second).b));
        if(v > 0) {
            return v;
        }
        throw this.c("length must be greater than zero", ((bwwa)pair0.second).a);
    }

    public final int k(bwwa bwwa0) {
        Integer integer0 = (Integer)this.c.get(((bwwc)bwwa0.b).a);
        if(integer0 != null) {
            return (int)integer0;
        }
        throw this.c("Corpus doesn\'t have section with such name.", bwwa0.a);
    }

    public static bwpu l(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwpu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwpu bwpu0 = (bwpu)hftp0.b_message;
        bwpu0.b |= 1;
        bwpu0.c = s;
        return (bwpu)hftp0.N_build();
    }

    public final bwwa m() {
        if(this.h()) {
            throw this.b("Expected a name or $");
        }
        this.e();
        if(this.a() == 36) {
            this.f();
        }
        if(this.h() || !bwwd.p(this.a())) {
            throw this.c("Expected a name", this.b);
        }
        this.f();
        while(!this.h() && bwwd.q(this.a())) {
            this.f();
        }
        bwwa bwwa0 = this.d();
        bwwc bwwc0 = new bwwc(((String)bwwa0.b));
        return new bwwa(bwwa0.a, bwwc0);
    }

    public final bwwa n() {
        this.g();
        if(this.h()) {
            throw this.b("Expected a value");
        }
        int v = this.a();
        int v1 = 0;
        if(!bwwd.i(((char)v)) && v != 45) {
            if(!bwwd.p(((char)v))) {
                switch(v) {
                    case 34: {
                        this.f();
                        int v2 = this.a;
                        StringBuilder stringBuilder0 = new StringBuilder();
                        this.e();
                    label_12:
                        while(!this.h()) {
                            switch(this.a()) {
                                case 34: {
                                    break label_12;
                                }
                                case 92: {
                                    goto label_15;
                                }
                            }
                            this.f();
                            continue;
                        label_15:
                            stringBuilder0.append(((String)this.d().b));
                            this.f();
                            if(this.h()) {
                                throw this.b("Expected an escape sequence");
                            }
                            if(this.a() != 34 && this.a() != 92) {
                                throw this.b("Expected \" or \\");
                            }
                            this.e();
                            this.f();
                            continue;
                        }
                        if(this.h()) {
                            throw this.b("Expected string literal end");
                        }
                        stringBuilder0.append(((String)this.d().b));
                        this.f();
                        return new bwwa(v2, stringBuilder0.toString());
                    }
                    case 36: {
                        break;
                    }
                    case 40: {
                        int v3 = this.a;
                        ArrayList arrayList0 = new ArrayList();
                        do {
                            batl.l(!this.h() && (this.a() == 40 || this.a() == 44));
                            this.f();
                            this.g();
                            if(this.h() || this.a() == 41) {
                                break;
                            }
                            arrayList0.add(this.n());
                            this.g();
                        }
                        while(!this.h() && this.a() == 44);
                        if(this.h() || this.a() != 41) {
                            throw this.b("Expected )");
                        }
                        this.f();
                        return new bwwa(v3, arrayList0);
                    }
                    default: {
                        throw this.b("Expected a value");
                    }
                }
            }
            return this.m();
        }
        this.g();
        this.e();
        if(!this.h() && this.a() == 45) {
            this.f();
        }
        while(!this.h() && bwwb.i(this.a())) {
            this.f();
            ++v1;
        }
        if(v1 != 0) {
            return new bwwa(this.b, Integer.valueOf(((String)this.d().b)));
        }
        throw this.c("Expected an integer", this.b);
    }

    public final boolean o(bwwa bwwa0) {
        if(bwwa0 == null) {
            return true;
        }
        Object object0 = bwwa0.b;
        if((object0 instanceof Integer)) {
            int v = (int)(((Integer)object0));
            if(v == 0) {
                return false;
            }
            if(v == 1) {
                return true;
            }
            throw this.c("Expected a boolean", bwwa0.a);
        }
        if(!(object0 instanceof bwwc)) {
            throw this.c("Expected a boolean", bwwa0.a);
        }
        String s = ((bwwc)object0).a;
        if("true".equals(s)) {
            return true;
        }
        if("false".equals(s)) {
            return false;
        }
        throw this.c("Expected a boolean", bwwa0.a);
    }

    public static boolean p(char c) {
        return c >= 97 && c <= 0x7A || c >= 65 && c <= 90 || c == 0x5F;
    }

    public static boolean q(char c) {
        return bwwd.p(c) || bwwd.i(c);
    }
}

