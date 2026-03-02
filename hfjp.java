import java.security.AlgorithmParameters;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public enum hfjp {
    SECP256R1("secp256r1"),
    SECP384R1("secp384r1");

    public final ECParameterSpec c;
    public final String d;

    private hfjp(String s1) {
        try {
            AlgorithmParameters algorithmParameters0 = AlgorithmParameters.getInstance("EC");
            algorithmParameters0.init(new ECGenParameterSpec(s1));
            this.c = (ECParameterSpec)algorithmParameters0.getParameterSpec(ECParameterSpec.class);
            new ECGenParameterSpec(s1);
            this.d = s1;
        }
        catch(Exception exception0) {
            throw new AssertionError(exception0);
        }
    }
}

