import android.os.IBinder;
import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;

public final class gyir extends wbx implements gyit {
    public gyir(IBinder iBinder0) {
        super(iBinder0, "com.google.location.nearby.direct.client.internal.INearbyDirectService");
    }

    @Override  // gyit
    public final OperationResponse a(String s) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(2, parcel0);
        OperationResponse operationResponse0 = (OperationResponse)wbz.a(parcel1, OperationResponse.CREATOR);
        parcel1.recycle();
        return operationResponse0;
    }

    @Override  // gyit
    public final OperationResponse b(OperationRequest operationRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, operationRequest0);
        Parcel parcel1 = this.hM(1, parcel0);
        OperationResponse operationResponse0 = (OperationResponse)wbz.a(parcel1, OperationResponse.CREATOR);
        parcel1.recycle();
        return operationResponse0;
    }

    @Override  // gyit
    public final OperationResponse c(OperationRequest operationRequest0) {
        throw null;
    }

    @Override  // gyit
    public final boolean d(OperationRequest operationRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, operationRequest0);
        Parcel parcel1 = this.hM(5, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // gyit
    public final boolean e(OperationRequest operationRequest0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, operationRequest0);
        Parcel parcel1 = this.hM(4, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }
}

