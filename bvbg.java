import com.google.android.gms.googlesettings.ui.GoogleSettingsChimeraActivity;
import java.util.concurrent.CancellationException;

final class bvbg extends ibsl implements ibtw {
    int a;
    final GoogleSettingsChimeraActivity b;
    private Object c;

    public bvbg(GoogleSettingsChimeraActivity googleSettingsChimeraActivity0, ibrl ibrl0) {
        this.b = googleSettingsChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvbg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bvbg(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck0 = (icck)this.c;
            ((ggtj)GoogleSettingsChimeraActivity.j.h()).x("started visibility updater");
        }
        else {
            icck0 = (icck)this.c;
            try {
                ibnx.b(object0);
            }
            catch(CancellationException cancellationException0) {
                ((ggtj)GoogleSettingsChimeraActivity.j.h()).x("stopped visibility updater");
                throw cancellationException0;
            }
        }
        while(iccl.g(icck0)) {
            buzq.a = this.b.l().a();
            try {
                this.c = icck0;
                this.a = 1;
                if(iccv.d(GoogleSettingsChimeraActivity.k, this) == object1) {
                    return object1;
                }
                continue;
            }
            catch(CancellationException cancellationException0) {
                ((ggtj)GoogleSettingsChimeraActivity.j.h()).x("stopped visibility updater");
                throw cancellationException0;
            }
            return object1;
        }
        return ibom.a;
    }
}

