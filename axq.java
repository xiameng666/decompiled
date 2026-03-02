import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build.VERSION;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class axq {
    public final SessionConfiguration a;

    public axq(int v, List list0, Executor executor0, CameraCaptureSession.StateCallback cameraCaptureSession$StateCallback0) {
        Object object2;
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            arrayList0.add(((OutputConfiguration)((axh)object0).a.b()));
        }
        SessionConfiguration sessionConfiguration0 = new SessionConfiguration(v, arrayList0, executor0, cameraCaptureSession$StateCallback0);
        super();
        this.a = sessionConfiguration0;
        List list1 = sessionConfiguration0.getOutputConfigurations();
        ArrayList arrayList1 = new ArrayList(list1.size());
        for(Object object1: list1) {
            OutputConfiguration outputConfiguration0 = (OutputConfiguration)object1;
            if(outputConfiguration0 == null) {
                object2 = null;
            }
            else {
                axn axn0 = Build.VERSION.SDK_INT >= 33 ? new axo(outputConfiguration0) : new axn(new axm(outputConfiguration0));
                object2 = new axh(axn0);
            }
            arrayList1.add(object2);
        }
        DesugarCollections.unmodifiableList(arrayList1);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof axq) ? Objects.equals(this.a, ((axq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

