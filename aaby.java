import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import j..util.Objects;

public final class aaby {
    public final String a;
    public final String b;
    public final String c;
    public final grwe d;
    public final boolean e;
    public final Intent f;

    public aaby(String s, String s1, String s2, grwe grwe0, boolean z, Intent intent0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = grwe0;
        this.e = z;
        this.f = intent0;
    }

    public static aaby a(Throwable throwable0, Context context0) {
        if((throwable0 instanceof iapl)) {
            iaph iaph0 = ((iapl)throwable0).a.t;
            if(iaph0 != iaph.e && iaph0 != iaph.o) {
                return aaby.c(context0);
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwe.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grwe grwe0 = (grwe)hftp0.b_message;
            grwe0.b |= 1;
            grwe0.c = 18;
            return new aaby("Can\'t connect to the internet", "Some info may be outdated or not show. Refresh when you\'re back online.", "Try again", ((grwe)hftp0.N_build()), true, null);
        }
        if((throwable0 instanceof UserRecoverableAuthException)) {
            Intent intent0 = ((UserRecoverableAuthException)throwable0).a();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grwe.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grwe grwe1 = (grwe)hftp1.b_message;
            grwe1.b |= 1;
            grwe1.c = 13;
            return new aaby("Finish signing in to continue", "Something went wrong and you need to sign in again.", "Sign in", ((grwe)hftp1.N_build()), false, intent0);
        }
        return throwable0 == null ? null : aaby.c(context0);
    }

    public final boolean b() {
        return this.d != null;
    }

    private static aaby c(Context context0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grwe grwe0 = (grwe)hftp0.b_message;
        grwe0.b |= 1;
        grwe0.c = 19;
        return new aaby("Something went wrong", "Some info may be out of date. Try again later.", null, ((grwe)hftp0.N_build()), false, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof aaby) ? this.e == ((aaby)object0).e && Objects.equals(this.a, ((aaby)object0).a) && Objects.equals(this.b, ((aaby)object0).b) && Objects.equals(this.c, ((aaby)object0).c) && Objects.equals(this.d, ((aaby)object0).d) && Objects.equals(this.f, ((aaby)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f});
    }
}

