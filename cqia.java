import android.content.Context;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;

public final class cqia {
    public static cqig a() {
        Context context0 = AppContextProvider.a();
        ckcq ckcq0 = ckun.b;
        ckcq ckcq1 = ckul.b;
        ckcq ckcq2 = ckum.b;
        if(ckcq2 == null) {
            throw new NullPointerException("Null setSecurityQuestionAndAnswer");
        }
        ckcq ckcq3 = ckuk.b;
        if(ckcq3 == null) {
            throw new NullPointerException("Null deleteSecurityQuestionAndAnswer");
        }
        cqif cqif0 = new cqif(ckcq2, ckcq3);
        cqim cqim0 = new cqim();
        if(cqig.a == null) {
            synchronized(cqig.class) {
                if(cqig.a == null) {
                    cqig.a = new cqig(context0, ckcq0, ckcq1, cqif0, cqim0);
                }
            }
            return cqig.a;
        }
        return cqig.a;
    }
}

