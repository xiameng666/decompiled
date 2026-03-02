import android.content.Intent;
import j..util.Objects;

final class aahb implements aacg {
    final aahd a;

    public aahb(aahd aahd0) {
        Objects.requireNonNull(aahd0);
        this.a = aahd0;
        super();
    }

    @Override  // aacg
    public final void a(aaby aaby0) {
        if(aaby0.e) {
            this.a.b.b.i(this.a.b.a.a);
            return;
        }
        Intent intent0 = aaby0.f;
        if(hoju.o()) {
            acp acp0 = this.a.aj;
            if(acp0 != null && intent0 != null) {
                acp0.b(intent0);
                return;
            }
        }
        if(intent0 != null) {
            this.a.startActivityForResult(intent0, 9);
        }
    }
}

