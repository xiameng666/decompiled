import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.List;
import java.util.concurrent.FutureTask;

final class fdmf extends fdlv {
    private final List a;

    public fdmf(azvd azvd0, List list0) {
        super(azvd0);
        this.a = list0;
    }

    @Override  // fdix
    public final void P(PutDataResponse putDataResponse0) {
        this.r(new fdgu(fdlg.a(putDataResponse0.a), putDataResponse0.b));
        if(putDataResponse0.a != 0) {
            for(Object object0: this.a) {
                ((FutureTask)object0).cancel(true);
            }
        }
    }
}

