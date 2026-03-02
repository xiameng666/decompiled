import android.view.KeyEvent;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;

public final class cru {
    public static final hfc a(hfc hfc0, dgg dgg0, ctj ctj0, boolean z, String s, its its0, ibth ibth0) {
        if((ctj0 instanceof ctp)) {
            return hfc0.a(new ClickableElement(dgg0, ((ctp)ctj0), false, z, s, its0, ibth0));
        }
        if(ctj0 == null) {
            return hfc0.a(new ClickableElement(dgg0, null, false, z, s, its0, ibth0));
        }
        if(dgg0 != null) {
            return hfc0.a(ctm.a(hfc.e, dgg0, ctj0).a(new ClickableElement(dgg0, null, false, z, s, its0, ibth0)));
        }
        crs crs0 = new crs(ctj0, z, s, its0, ibth0);
        return hfc0.a(hew.d(hfc.e, crs0));
    }

    public static final boolean b(KeyEvent keyEvent0) {
        long v = hul.b(keyEvent0);
        return hui.a(v, hui.h) || hui.a(v, hui.k) || hui.a(v, hui.o) || hui.a(v, hui.j);
    }

    public static hfc c(hfc hfc0, dgg dgg0, ctj ctj0, boolean z, String s, its its0, ibth ibth0, int v) {
        if((v & 8) != 0) {
            s = null;
        }
        if((v & 16) != 0) {
            its0 = null;
        }
        return cru.a(hfc0, dgg0, ctj0, ((boolean)(((int)z) | ((v & 4) == 0 ? 1 : 0) ^ 1)), s, its0, ibth0);
    }

    public static hfc d(hfc hfc0, boolean z, String s, its its0, dgg dgg0, ibth ibth0, int v) {
        return hfc0.a(new ClickableElement(((v & 8) == 0 ? dgg0 : null), null, true, 1 == (((int)z) | v & 1), ((v & 2) == 0 ? s : null), ((v & 4) == 0 ? its0 : null), ibth0));
    }

    public static hfc e(hfc hfc0, dgg dgg0, ctj ctj0, boolean z, ibth ibth0, int v) {
        int v1 = ((int)z) | ((v & 4) == 0 ? 1 : 0) ^ 1;
        if((ctj0 instanceof ctp)) {
            return hfc0.a(new CombinedClickableElement(dgg0, ((ctp)ctj0), ((boolean)v1), ibth0));
        }
        if(ctj0 == null) {
            return hfc0.a(new CombinedClickableElement(dgg0, null, ((boolean)v1), ibth0));
        }
        if(dgg0 != null) {
            return hfc0.a(ctm.a(hfc.e, dgg0, ctj0).a(new CombinedClickableElement(dgg0, null, ((boolean)v1), ibth0)));
        }
        crt crt0 = new crt(ctj0, ((boolean)v1), ibth0);
        return hfc0.a(hew.d(hfc.e, crt0));
    }
}

