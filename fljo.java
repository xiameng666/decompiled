import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class fljo implements Callable {
    public final fljw a;
    public final gmcd b;
    public final ContactId c;
    public final gmcd d;

    public fljo(fljw fljw0, gmcd gmcd0, ContactId contactId0, gmcd gmcd1) {
        this.a = fljw0;
        this.b = gmcd0;
        this.c = contactId0;
        this.d = gmcd1;
    }

    @Override
    public final Object call() {
        fljw fljw0;
        gmcd gmcd0;
        ContactId contactId0;
        try {
            contactId0 = this.c;
            gmcd0 = this.b;
            fljw0 = this.a;
            gmbu.r(gmcd0);
        }
        catch(ExecutionException executionException0) {
            flbj.g("TyRegController", "Failed to register", executionException0);
            fmai fmai0 = fmaj.a();
            fmai0.g(8);
            fmai0.n(contactId0);
            fmaj fmaj0 = fmai0.a();
            fljw0.a.b(fmaj0);
            flca flca0 = flcb.a();
            flca0.a = 3;
            return flca0.a();
        }
        try {
            gmbu.r(this.d);
        }
        catch(ExecutionException executionException1) {
            flbj.g("TyRegController", "Failed to store registration into registration store", executionException1);
            fmai fmai1 = fmaj.a();
            fmai1.g(8);
            fmai1.n(contactId0);
            fmaj fmaj1 = fmai1.a();
            fljw0.a.b(fmaj1);
            flca flca1 = flcb.a();
            flca1.a = 3;
            return flca1.a();
        }
        int v = ((flkv)((glyq)gmcd0).u()).a;
        flca flca2 = flcb.a();
        switch(v) {
            case 0: {
                flca2.a = 2;
                return flca2.a();
            }
            case 1: {
                flca2.a = 3;
                return flca2.a();
            }
            default: {
                flca2.a = 4;
                return flca2.a();
            }
        }
    }
}

