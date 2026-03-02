import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;

public final class byaq {
    public final BiometricPrompt.AuthenticationResult a;

    public byaq(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        this.a = biometricPrompt$AuthenticationResult0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof byaq) ? ibuq.m(this.a, ((byaq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "BiometricResult(biometricAuthenticationResult=" + this.a + ")";
    }
}

