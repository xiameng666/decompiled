import com.google.android.gms.constellation.ui.debug.ConstellationDebugChimeraActivity;
import java.util.Arrays;

public final class bcmy implements Runnable {
    @Override
    public final void run() {
        hofq hofq0 = (hofq)((ProtoLiteMessage)hofs.a).v_newBuilder();
        if(!hofq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hofq0).ensureMutable();
        }
        hofs hofs0 = (hofs)hofq0.b_message;
        hofs0.f = hofr.a(3);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hoft.a).v_newBuilder();
        hoez hoez0 = (hoez)((ProtoLiteMessage)hofa.a).v_newBuilder();
        hofb hofb0 = (hofb)((ProtoLiteMessage)hofc.a).v_newBuilder();
        hofb0.k("1234567891234");
        if(!hoez0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hoez0).ensureMutable();
        }
        hofa hofa0 = (hofa)hoez0.b_message;
        hofc hofc0 = (hofc)((ProtoLiteBuilder)hofb0).N_build();
        hofc0.getClass();
        hofa0.c = hofc0;
        hofa0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hoft hoft0 = (hoft)hftp0.b_message;
        hofa hofa1 = (hofa)((ProtoLiteBuilder)hoez0).N_build();
        hofa1.getClass();
        hoft0.c = hofa1;
        hoft0.b = 1;
        if(!hofq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hofq0).ensureMutable();
        }
        hofs hofs1 = (hofs)hofq0.b_message;
        hoft hoft1 = (hoft)hftp0.N_build();
        hoft1.getClass();
        hofs1.e = hoft1;
        hofs1.b |= 1;
        hofs hofs2 = (hofs)((ProtoLiteBuilder)hofq0).N_build();
        try {
            bbzc.b().i(Arrays.asList(new hofs[]{hofs2}));
        }
        catch(bcrc bcrc0) {
            ConstellationDebugChimeraActivity.j.g("Error updating IMSI", bcrc0, new Object[0]);
        }
    }
}

