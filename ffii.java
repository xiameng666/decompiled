import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import j..util.Objects;

final class ffii extends ffee {
    final Uri c;
    final fdiy d;
    final fflv e;

    public ffii(fflv fflv0, String s, Uri uri0, fdiy fdiy0) {
        this.c = uri0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        DataItemParcelable dataItemParcelable0;
        try(Cursor cursor0 = this.e.h.c(this.e.e, this.c)) {
            dataItemParcelable0 = cursor0.moveToNext() ? fdur.d(fdur.f(cursor0)) : null;
            GetDataItemResponse getDataItemResponse0 = new GetDataItemResponse(0, dataItemParcelable0);
            this.d.C(getDataItemResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getDataItem: exception during processing: " + this.c, exception0);
            GetDataItemResponse getDataItemResponse1 = new GetDataItemResponse(8, null);
            this.d.C(getDataItemResponse1);
        }
    }
}

