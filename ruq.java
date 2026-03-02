import android.os.IInterface;
import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

public interface ruq extends IInterface {
    int a();

    @Deprecated
    ErasedOnboardingTaskState c(ErasedOnboardingTaskToken arg1);

    rzw d(rzz arg1, rzt arg2);

    rzw e(rzz arg1, rzt arg2);

    void f(rzz arg1, sac arg2);

    @Deprecated
    PersistableBundle fd(ErasedOnboardingTaskToken arg1);

    @Deprecated
    void fh(ErasedOnboardingTaskToken arg1, rut arg2);

    void g(rzz arg1, sac arg2);

    void h(rzz arg1, sac arg2);

    @Deprecated
    void i(ErasedOnboardingTaskToken arg1, run arg2);

    @Deprecated
    void j(ErasedOnboardingTaskToken arg1, PersistableBundle arg2);

    void k(rzz arg1, rzz arg2, saf arg3);

    void m(rzz arg1, rzz arg2, saf arg3);

    @Deprecated
    void n(ErasedOnboardingTaskToken arg1, rut arg2);

    boolean o(ErasedOnboardingTaskToken arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6);

    @Deprecated
    boolean p(ErasedOnboardingTaskToken arg1, PersistableBundle arg2);

    byte[] q(ErasedOnboardingTaskToken arg1, int arg2, int arg3, int arg4, int arg5);
}

