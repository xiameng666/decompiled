import java.util.concurrent.ExecutionException;

public final class ezxq {
    public static final fage a;
    private static final baun b;
    private static final ggfp c;
    private static final fagn d;
    private static final fagn e;
    private static final fagn f;
    private final babh g;
    private final fagt h;

    static {
        ezxq.b = fabk.d("ExperimentControl");
        ezxq.c = ggfp.K("", "0");
        ezxq.d = new fagu("control.experiment.exp_id_key", "");
        ezxq.e = new fagu("control.experiment.exp_name_space_key", "");
        ezxq.f = new fagu("control.experiment.exp_log_source_key", "");
        ezxq.a = new ezxp();
    }

    public ezxq(babh babh0) {
        this.g = babh0;
        this.h = (fagt)fagt.a.b();
    }

    public final void a() {
        if(((Boolean)ezwo.a(hwcy.a, Boolean.class)).booleanValue()) {
            String s = (String)ezwo.a(hwcy.i, String.class);
            String s1 = (String)ezwo.a(hwcy.h, String.class);
            String s2 = (String)ezwo.a(hwcy.f, String.class);
            if(s2.equals(((String)ezwo.a(hwcy.g, String.class)))) {
                s2 = (String)this.h.b(ezxq.d);
            }
            if(!this.b(s2) || (!((String)this.h.b(ezxq.e)).equals(s) || !((String)this.h.b(ezxq.f)).equals(s1))) {
                if(this.b(s2) || (!((String)this.h.b(ezxq.e)).equals(s) || !((String)this.h.b(ezxq.f)).equals(s1))) {
                    Object object0 = this.h.b(ezxq.d);
                    if(!ezxq.c.contains(object0) && !this.c(((String)this.h.b(ezxq.e)), ((String)this.h.b(ezxq.f)), "")) {
                        ezxq.b.m("Unable to clear current experiment, abort updating experiment config.", new Object[0]);
                        return;
                    }
                }
                this.c(s, s1, s2);
            }
        }
    }

    private final boolean b(String s) {
        return ((String)this.h.b(ezxq.d)).equals(s) ? true : ezxq.c.contains(this.h.b(ezxq.d)) && ezxq.c.contains(s);
    }

    private final boolean c(String s, String s1, String s2) {
        try {
            evrg.n(new einq(this.g).cA((ezxq.c.contains(s2) ? new int[0] : new int[]{Integer.parseInt(s2)}), s, s1));
            fagh[] arr_fagh = {new fagh(ezxq.d, s2)};
            this.h.e(arr_fagh);
            fagh[] arr_fagh1 = {new fagh(ezxq.e, s)};
            this.h.e(arr_fagh1);
            fagh[] arr_fagh2 = {new fagh(ezxq.f, s1)};
            this.h.e(arr_fagh2);
            ezxq.b.d("Experiment config id: %s name_space: %s log_source: %s", new Object[]{s2, s, s1});
            ezxu ezxu0 = (ezxu)ezxu.a.b();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gihg.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gihg)hftv0).b |= 1;
            ((gihg)hftv0).c = 1L;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gihg gihg0 = (gihg)hftp0.b_message;
            s2.getClass();
            gihg0.b |= 2;
            gihg0.d = s2;
            fabj fabj0 = ezxu0.b;
            gihg gihg1 = (gihg)hftp0.N_build();
            ProtoLiteBuilder hftp1 = fabj0.g(10);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gigw gigw0 = (gigw)hftp1.b_message;
            gihg1.getClass();
            gigw0.m = gihg1;
            gigw0.b |= 0x400;
            fabj0.f(((gigw)hftp1.N_build()));
            return true;
        }
        catch(NumberFormatException | InterruptedException | ExecutionException unused_ex) {
            ezxq.b.f("Unable to set experiment config id: %s name_space: %s, log_source: %s.", new Object[]{s2, s, s1});
            return false;
        }
    }
}

