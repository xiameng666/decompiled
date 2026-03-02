import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

public interface eiqg extends IInterface {
    void a(Status arg1);

    void b(Status arg1, DogfoodsToken arg2);

    void c(Status arg1);

    void d(Status arg1, ExperimentTokens arg2);

    void e(Status arg1, Configurations arg2);

    void f(Status arg1, Configurations arg2);

    void g(Status arg1, Flag arg2);

    void h(Status arg1, long arg2);

    void i(Status arg1, FlagOverrides arg2);

    void j(Status arg1);

    void k(Status arg1);

    void l(Status arg1);

    void m(Status arg1);

    void n(Status arg1);

    void o(Status arg1);
}

