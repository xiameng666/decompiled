import java.io.File;
import java.util.Set;
import jeb.synthetic.FIN;

public final class lar implements ibth {
    public final lcc a;

    public lar(lcc lcc0) {
        this.a = lcc0;
    }

    @Override  // ibth
    public final Object a() {
        lcl lcl0 = (lcl)this.a.a;
        File file0 = ((File)lcl0.e.a()).getCanonicalFile();
        Object object0 = lcl.b;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        String s = file0.getAbsolutePath();
        Set set0 = lcl.a;
        if(!set0.contains(s)) {
            ibuq.c(s);
            set0.add(s);
            FIN.finallyCodeBegin$NT(v);
            ibuq.c(file0);
            lct lct0 = (lct)lcl0.d.a(file0);
            lcj lcj0 = new lcj(file0);
            return new lco(file0, lcl0.c, lct0, lcj0);
        }
        throw new IllegalStateException(a.a(s, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled)."));
    }
}

