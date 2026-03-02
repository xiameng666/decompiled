import android.text.TextUtils;
import java.util.Arrays;

public final class bctl {
    public final hetz a;

    public bctl(hetz hetz0) {
        batl.s(hetz0);
        this.a = hetz0;
    }

    public static bctl a(String s, String s1, String s2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hetz.a).v_newBuilder();
        int v = TextUtils.isEmpty(s) ^ 1;
        int v1 = TextUtils.isEmpty(s1) ^ 1;
        int v2 = TextUtils.isEmpty(s2);
        batl.b(v || v1 || v2 == 0);
        if(v) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hetz hetz0 = (hetz)hftp0.b_message;
            s.getClass();
            hetz0.b |= 1;
            hetz0.c = s;
        }
        if(v1) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hetz hetz1 = (hetz)hftp0.b_message;
            s1.getClass();
            hetz1.b |= 2;
            hetz1.d = s1;
        }
        if((v2 ^ 1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hetz hetz2 = (hetz)hftp0.b_message;
            s2.getClass();
            hetz2.b |= 4;
            hetz2.e = s2;
        }
        return new bctl(((hetz)hftp0.N_build()));
    }

    public final String b() {
        return this.e() ? this.a.c : null;
    }

    public final String c() {
        return this.f() ? this.a.d : null;
    }

    public final String d() {
        return this.g() ? this.a.e : null;
    }

    public final boolean e() {
        return !this.a.c.isEmpty();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bctl) ? TextUtils.equals(this.b(), ((bctl)object0).b()) && TextUtils.equals(this.c(), ((bctl)object0).c()) && TextUtils.equals(this.d(), ((bctl)object0).d()) : false;
    }

    public final boolean f() {
        return !this.a.d.isEmpty();
    }

    public final boolean g() {
        return !this.a.e.isEmpty();
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b(), this.c(), this.d()});
    }
}

