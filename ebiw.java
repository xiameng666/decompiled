import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.ChangeSePostpaidDefaultStatusRequest;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.Optional;
import java.io.IOException;

public final class ebiw extends ebav {
    public static final bboh a;
    public final donp b;
    final Optional c;
    dypj d;
    dmgi e;
    public static final int f;
    public static final int g;
    private final ChangeSePostpaidDefaultStatusRequest h;

    static {
        ebiw.a = bboh.b("Pay", bbcu.cZ);
        ebiw.f = 3;
        ebiw.g = 4;
    }

    public ebiw(ChangeSePostpaidDefaultStatusRequest changeSePostpaidDefaultStatusRequest0, String s, donp donp0, azug azug0) {
        super("ChangeSePostpaidDefaultStatusOperation", s, azug0);
        this.c = Optional.empty();
        this.h = changeSePostpaidDefaultStatusRequest0;
        this.b = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        String s1;
        String s;
        try {
            s = this.h.c.name;
            s1 = acso.e(context0, s);
        }
        catch(acse | IOException exception0) {
            a.aq(ebiw.a.i(), "Failed to fetch account ID", '\u2FE0', exception0);
            this.b.x(Status.d);
            return;
        }
        dola dola0 = dlmg.a(AppContextProvider.a(), s, bbqr.c(s1));
        done done0 = new done();
        edop edop0 = new edop();
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        ebjp ebjp0 = new ebjp(dola0, new dmgr("com.google.android.gms"), done0, edop0, domv0);
        ((AndroidInjector)this.c.orElse(ebjp0)).inject(this);
        String s2 = this.h.a;
        switch(this.h.b) {
            case 1: {
                dyxt dyxt0 = this.d.b;
                evql evql0 = dyxt0.d(new dywk(new dyxe(dyxt0, s2)));
                evql0.y(new bblp(0x7FFFFFFF, 9), new ebis(this));
                evql0.v(new bblp(0x7FFFFFFF, 9), new ebit(this, s2));
                return;
            }
            case 2: {
                dyxt dyxt1 = this.d.b;
                evql evql1 = dyxt1.d(new dywk(new dyww(dyxt1, s2)));
                evql1.y(new bblp(0x7FFFFFFF, 9), new ebiu(this, s2));
                evql1.v(new bblp(0x7FFFFFFF, 9), new ebiv(this, s2));
                return;
            }
            default: {
                this.b.x(eccq.b);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.x(status0);
    }
}

