import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;

public abstract class gyis extends wby implements gyit {
    public gyis() {
        super("com.google.location.nearby.direct.client.internal.INearbyDirectService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                OperationRequest operationRequest0 = (OperationRequest)wbz.a(parcel0, OperationRequest.CREATOR);
                gyis.gr(parcel0);
                OperationResponse operationResponse0 = this.b(operationRequest0);
                parcel1.writeNoException();
                wbz.g(parcel1, operationResponse0);
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                gyis.gr(parcel0);
                OperationResponse operationResponse1 = this.a(s);
                parcel1.writeNoException();
                wbz.g(parcel1, operationResponse1);
                return true;
            }
            case 3: {
                OperationRequest operationRequest1 = (OperationRequest)wbz.a(parcel0, OperationRequest.CREATOR);
                gyis.gr(parcel0);
                OperationResponse operationResponse2 = this.c(operationRequest1);
                parcel1.writeNoException();
                wbz.g(parcel1, operationResponse2);
                return true;
            }
            case 4: {
                OperationRequest operationRequest2 = (OperationRequest)wbz.a(parcel0, OperationRequest.CREATOR);
                gyis.gr(parcel0);
                boolean z = this.e(operationRequest2);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 5: {
                OperationRequest operationRequest3 = (OperationRequest)wbz.a(parcel0, OperationRequest.CREATOR);
                gyis.gr(parcel0);
                boolean z1 = this.d(operationRequest3);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

