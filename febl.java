import android.content.Context;
import android.os.Handler;
import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;

public final class febl extends febd {
    public final Context c;
    public final String d;
    public final String e;
    public AccountsMatcher.AccountsMatcherResult f;
    public final feaz g;
    private int h;

    public febl(String s, String s1, feaz feaz0, Context context0, fduk fduk0, Handler handler0, String s2) {
        super(s, fduk0, handler0);
        this.f = null;
        this.h = 0;
        this.d = s1;
        this.g = feaz0;
        this.c = context0;
        this.e = s2;
    }

    @Override  // febd
    protected final febb a() {
        return new febk(this);
    }

    @Override  // febd
    protected final void b(fean fean0) {
        if((fean0 instanceof feaq)) {
            fewy fewy0 = ((feaq)fean0).a;
            if((fewy0.b & 1) != 0 && feww.b(fewy0.c) == 3 && ((long)this.h) < hzyg.a.b().a()) {
                this.k();
                ++this.h;
                return;
            }
        }
        super.b(fean0);
    }

    @Override  // febd
    public final void h() {
        super.h();
        this.h = 0;
        this.k();
    }

    @Override  // febd
    protected final void i() {
        super.i();
        this.f = null;
    }

    public final void l(Iterable iterable0) {
        fewx fewx0 = (fewx)((ProtoLiteMessage)fewy.a).v_newBuilder();
        if(!fewx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fewx0).ensureMutable();
        }
        ((fewy)fewx0.b_message).c = 3;
        ((fewy)fewx0.b_message).b |= 1;
        fewx0.a(iterable0);
        this.e(((fewy)((ProtoLiteBuilder)fewx0).N_build()), true);
    }
}

