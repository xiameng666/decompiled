import android.os.Bundle;

public class kvm extends kvg {
    public kvm(String s, String s1, Bundle bundle0) {
        ibuq.f(s, "id");
        ibuq.f(s1, "type");
        ibuq.f(bundle0, "candidateQueryData");
        super(s, s1, bundle0);
        if(s.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if(s1.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("type should not be empty");
    }
}

