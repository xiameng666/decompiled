import com.google.android.gms.wearable.backup.wear.RestoreWearListenerChimeraService;
import j..util.Collection.-EL;
import j..util.stream.Collectors;

public final class fcrm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object[] arr_object = {((String)Collection.-EL.stream(((gged_interceptors)object0)).map(new fcro()).collect(Collectors.joining(", ")))};
        RestoreWearListenerChimeraService.a.j("get_devices response: %s", arr_object);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezs.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezs fezs0 = (fezs)hftp0.b_message;
        hfuo hfuo0 = fezs0.c;
        if(!hfuo0.c()) {
            fezs0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(((gged_interceptors)object0), fezs0.c);
        return ((fezs)hftp0.N_build()).toBytesArray();
    }
}

