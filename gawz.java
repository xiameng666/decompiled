import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

public final class gawz {
    public static final hcst a(hdvg hdvg0, Context context0, gaym gaym0, gayt gayt0) {
        hcst hcst0;
        ibuq.f(hdvg0, "uiResponse");
        ibuq.f(context0, "context");
        ibuq.f(gaym0, "eventLogger");
        if(hdvg0.l()) {
            if(gayt0 == null) {
                hcim hcim1 = hdvg0.a();
                ibuq.e(hcim1, "getCompressedFlowInstruction(...)");
                Parser hfvs1 = (Parser)((ProtoLiteMessage)hcst.a).jf(7, null);
                ibuq.e(hfvs1, "parser(...)");
                hcst0 = (hcst)gawz.b(hcim1, hfvs1, context0, gaym0);
            }
            else {
                gdqb gdqb0 = gayy.a("decompress_flow_instruction");
                try {
                    gdqs gdqs0 = gayt0.a("decompress_flow_instruction");
                    try {
                        hcim hcim0 = hdvg0.a();
                        ibuq.e(hcim0, "getCompressedFlowInstruction(...)");
                        Parser hfvs0 = (Parser)((ProtoLiteMessage)hcst.a).jf(7, null);
                        ibuq.e(hfvs0, "parser(...)");
                        hcst0 = (hcst)gawz.b(hcim0, hfvs0, context0, gaym0);
                    }
                    catch(Throwable throwable1) {
                        ibsx.a(gdqs0, throwable1);
                        throw throwable1;
                    }
                    ibsx.a(gdqs0, null);
                }
                catch(Throwable throwable0) {
                    ibsx.a(gdqb0, throwable0);
                    throw throwable0;
                }
                ibsx.a(gdqb0, null);
            }
            ibuq.c(hcst0);
            return hcst0;
        }
        hcst hcst1 = hdvg0.k();
        ibuq.c(hcst1);
        return hcst1;
    }

    private static final MessageLite b(hcim hcim0, Parser hfvs0, Context context0, gaym gaym0) {
        InputStream inputStream1;
        switch((hcin.b(hcim0.c) == null ? hcin.e : hcin.b(hcim0.c)).ordinal()) {
            case 1: {
                MessageLite hfvm0 = hfvs0.m(hcim0.b, hftc.a());
                ibuq.c(hfvm0);
                return hfvm0;
            }
            case 3: {
                InputStream inputStream0 = hcim0.b.newInput();
                gaxl.a();
                if(hziw.a.b().b()) {
                    try {
                        inputStream1 = ccjq.a(context0, inputStream0);
                        goto label_19;
                    }
                    catch(ccjo unused_ex) {
                        goto label_14;
                    }
                    catch(IOException iOException0) {
                    }
                    gavr.e("BE_CMP_02", gaym0, null, "IOException while using native Brotli", iOException0, 4);
                    throw new ibnm();
                }
                else {
                    try {
                    label_14:
                        inputStream1 = new ifuu(inputStream0);
                    }
                    catch(IOException iOException1) {
                        gavr.e("BE_CMP_03", gaym0, null, "IOException while using Java Brotli", iOException1, 4);
                        throw new ibnm();
                    }
                }
            label_19:
                MessageLite hfvm1 = hfvs0.o(inputStream1, hftc.a());
                ibuq.c(hfvm1);
                return hfvm1;
            }
            default: {
                gavr.e("BE_CMP_01", gaym0, null, "Unsupported compression type: " + (hcin.b(hcim0.c) == null ? hcin.e : hcin.b(hcim0.c)).name(), null, 20);
                throw new ibnm();
            }
        }
    }
}

