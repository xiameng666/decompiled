import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flub {
    public final fmhr a;
    public final boolean b;
    public final flua c;

    public flub() {
        throw null;
    }

    public flub(fmhr fmhr0, boolean z, flua flua0) {
        this.a = fmhr0;
        this.b = z;
        this.c = flua0;
    }

    public final fltj a() {
        return this.c.a();
    }

    public final fltu b() {
        return this.c.e();
    }

    public final fltw c() {
        return this.c.f();
    }

    public final fltx d() {
        return this.c.d();
    }

    public final flud e() {
        return this.c.g();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof flub)) {
            fmhr fmhr0 = this.a;
            if(fmhr0 == null) {
                return ((flub)object0).a == null ? this.b == ((flub)object0).b && this.c.equals(((flub)object0).c) : false;
            }
            return fmhr0.equals(((flub)object0).a) ? this.b == ((flub)object0).b && this.c.equals(((flub)object0).c) : false;
        }
        return false;
    }

    public final ConversationId f() {
        switch(this.h() - 1) {
            case 0: {
                return this.g().c;
            }
            case 2: {
                return this.c().e;
            }
            case 3: {
                return this.e().b;
            }
            case 4: {
                this.a();
                return this.a().a().a;
            }
            case 5: {
                return this.d().a;
            }
            default: {
                return null;
            }
        }
    }

    public final fmga g() {
        return this.c.c();
    }

    public final int h() {
        return this.c.b();
    }

    @Override
    public final int hashCode() {
        int v = this.a == null ? 0 : this.a.hashCode();
        return this.b ? this.c.hashCode() ^ ((v ^ 1000003) * 1000003 ^ 0x4CF) * 1000003 : this.c.hashCode() ^ ((v ^ 1000003) * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "TachyonMessage{suggestionList=" + this.a + ", skipNotification=" + this.b + ", oneOfType=" + this.c + "}";
    }
}

