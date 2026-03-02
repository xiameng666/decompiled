import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import j..util.Objects;
import java.util.List;

public final class bmpa implements gmbg {
    final List a;
    final bmpc b;

    public bmpa(bmpc bmpc0, List list0) {
        this.a = list0;
        Objects.requireNonNull(bmpc0);
        this.b = bmpc0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.b.d.ii(Boolean.valueOf(false));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Boolean boolean0 = Boolean.valueOf(false);
        if(bbnh.k(((List)object0))) {
            this.b.d.ii(boolean0);
            return;
        }
        List list0 = this.a;
        if(bbnh.k(list0)) {
            Boolean boolean1 = Boolean.valueOf(ggch.j(((List)object0)).s(new bmoy()));
            this.b.d.ii(boolean1);
            return;
        }
        for(Object object1: list0) {
            if(ggch.j(((List)object0)).s(new bmoz(((PublicKeyCredentialDescriptor)object1)))) {
                this.b.d.ii(Boolean.valueOf(true));
                return;
            }
        }
        this.b.d.ii(boolean0);
    }
}

