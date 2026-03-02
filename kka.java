import java.util.Collection;
import java.util.List;

public final class kka {
    public final List a;
    public final String b;
    public final boolean c;

    public kka(List list0, String s, boolean z) {
        int v = 0;
        ibuq.f(list0, "credentialOptions");
        super();
        this.a = list0;
        this.b = s;
        this.c = z;
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if(list0.size() > 1) {
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    if((((kjn)object0) instanceof kkc)) {
                        ++v;
                        if(v < 0) {
                            ibpo.l();
                        }
                    }
                }
            }
            if(v > 0 && v != this.a.size()) {
                throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            for(Object object1: this.a) {
                if((((kjn)object1) instanceof kkh)) {
                    throw new IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                }
            }
        }
    }
}

