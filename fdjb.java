import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import java.util.List;

public interface fdjb extends IInterface {
    void a(ChannelEventParcelable arg1);

    void c(CapabilityInfoParcelable arg1);

    void d(List arg1);

    void e(ConnectionStateEventParcelable arg1);

    void f(ConsentResponse arg1);

    void g(DataHolder arg1);

    void h(AmsEntityUpdateParcelable arg1);

    void i(MessageEventParcelable arg1);

    void j(NodeMigratedEventParcelable arg1);

    void k(AncsNotificationParcelable arg1);

    void l(NodeParcelable arg1);

    void m(NodeParcelable arg1);

    void n(MessageEventParcelable arg1, fdiv arg2);

    void o(RestoreCompletedEventParcelable arg1);
}

