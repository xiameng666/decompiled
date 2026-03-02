import com.google.android.gms.findmydevice.spot.GetHistoricalAccountKeysResponse;
import com.google.android.gms.findmydevice.spot.HistoricalAccountKeyInformation;

public final class boip implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        HistoricalAccountKeyInformation[] arr_historicalAccountKeyInformation = (HistoricalAccountKeyInformation[])ggch.j(((gged_interceptors)object0)).i(new boiq()).l(new boir()).u(HistoricalAccountKeyInformation.class);
        Object object1 = new GetHistoricalAccountKeysResponse();
        object1.a = arr_historicalAccountKeyInformation;
        return object1;
    }
}

