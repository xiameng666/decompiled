import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Collection.-EL;
import j..util.Optional;
import java.util.List;

public final class fxix {
    public final fxhk a;
    public final fxis[] b;
    public final fxhr c;
    public final fxhq d;
    public final fxmt e;
    public final Optional f;
    public final ibnf g;
    public final ibnf h;
    public fxiq i;
    public static final int j;
    private final fxis k;

    static {
        bboh.c("EAlert", bbcu.g, "HandlerC");
    }

    public fxix(fxhk fxhk0, fxhr fxhr0, fxhq fxhq0, fxmt fxmt0, Optional optional0, ibnf ibnf0, ibnf ibnf1) {
        fxiv fxiv0 = new fxiv(this);
        this.k = fxiv0;
        this.i = new fxiq(fxiv0, -1000000L);
        this.a = fxhk0;
        this.c = fxhr0;
        this.d = fxhq0;
        this.e = fxmt0;
        this.f = optional0;
        this.g = ibnf0;
        this.h = ibnf1;
        this.b = new fxis[]{new fxiw(this, fxhr0.a), new fxit(this, fxhr0.b), new fxiu(this, fxhr0.c), fxiv0};
    }

    public static Location a(hjij hjij0) {
        Location location0 = new Location("xtrn");
        location0.setLatitude(hjij0.b);
        location0.setLongitude(hjij0.c);
        return location0;
    }

    public static LatLng b(hjij hjij0) {
        return new LatLng(hjij0.b, hjij0.c);
    }

    public static ghae c(hjij hjij0) {
        return ggzv.i(hjij0.b, hjij0.c).k();
    }

    public static ghae d(Location location0) {
        return ggzv.i(location0.getLatitude(), location0.getLongitude()).k();
    }

    public static List e(hguc hguc0, int v) {
        hgtx hgtx0 = hguc0.g == null ? hgtx.a : hguc0.g;
        return (List)((Optional)Collection.-EL.stream((hgtx0.d == null ? hgty.a : hgtx0.d).b).filter(new fxio(v)).collect(ggkz.a)).map(new fxip()).orElse(ggna.a);
    }

    public static boolean f(Location location0, hguc hguc0, int v) {
        hgtx hgtx0 = hguc0.g == null ? hgtx.a : hguc0.g;
        Optional optional0 = (Optional)Collection.-EL.stream((hgtx0.d == null ? hgty.a : hgtx0.d).b).filter(new fxil(v)).collect(ggkz.a);
        if(optional0.isPresent()) {
            return Collection.-EL.stream(((hgtz)optional0.get()).d).anyMatch(new fxim(location0)) ? true : Collection.-EL.stream(((hgtz)optional0.get()).c).anyMatch(new fxin(location0));
        }
        return false;
    }

    public static void g(EAlertUxArgs eAlertUxArgs0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxoo.a).v_newBuilder();
        hfwn hfwn0 = hfyn.h(eAlertUxArgs0.i);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxoo gxoo0 = (gxoo)hftp0.b_message;
        hfwn0.getClass();
        gxoo0.d = hfwn0;
        gxoo0.b |= 1;
        hfwn hfwn1 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn1.getClass();
        ((gxoo)hftv0).e = hfwn1;
        ((gxoo)hftv0).b |= 2;
        int v = eAlertUxArgs0.k;
        if(v == 3) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gxoo)hftp0.b_message).c = 3;
        }
        else {
            switch(v) {
                case 4: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gxoo)hftp0.b_message).c = 2;
                    break;
                }
                case 5: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gxoo)hftp0.b_message).c = 1;
                    break;
                }
                default: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gxoo)hftp0.b_message).c = 0;
                }
            }
        }
        fxgr.a(((gxoo)hftp0.N_build()));
    }
}

