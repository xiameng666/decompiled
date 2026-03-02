import java.util.Iterator;

public final class nwa implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        nsz nsz0 = ((nrl)((cbm)object0).f()).a;
        ibuq.d(nsz0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        Iterator iterator0 = nsx.c(((nuu)nsz0)).a();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            nsz nsz1 = (nsz)object1;
            if((nsz1 instanceof nuu)) {
                nuu nuu0 = (nuu)nsz1;
            }
            else {
                if(!(nsz1 instanceof nus)) {
                    continue;
                }
                nus nus0 = (nus)nsz1;
            }
        }
        return null;
    }
}

