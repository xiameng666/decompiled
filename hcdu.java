public enum hcdu implements hfub {
    UNKNOWN_FLOW_INSTRUCTION(0),
    CONTINUE_FLOW_WITH_NEW_PAGE(1),
    CONTINUE_FLOW_WITH_CURRENT_PAGE(2),
    CONTINUE_FLOW_WITH_NEXT_WIDGET_AND_SUBMIT_FLOW_IF_WIDGET_IS_CLOSED(23),
    COMPLETE_FLOW_AFTER_DISPLAYING_NEXT_WIDGET(28),
    COMPLETE_FLOW_IMMEDIATELY(3),
    CANCEL_FLOW_IMMEDIATELY(27),
    SUBMIT_FLOW(15),
    COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE(4),
    COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE_IN_OVERLAY(12),
    HANDLE_UI_ERROR(5),
    CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY(6),
    CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY_AND_UPDATE_BASE_PAGE(11),
    CLOSE_OVERLAY_AND_CONTINUE_FLOW_IN_MAIN_PAGE(7),
    CLOSE_OVERLAY_AFTER_DISPLAYING_NEW_PAGE_IN_OVERLAY(8),
    CLOSE_OVERLAY_AND_SUBMIT_MAIN_PAGE(30),
    CONTINUE_FLOW_BY_PARTIALLY_UPDATING_CURRENT_PAGE(10),
    CONTINUE_WITH_PROXY_FLOW(29),
    CONTINUE_FLOW_AND_SEND_CALLBACK_DATA_TO_INTEGRATOR(0x1F),
    CONTINUE_FLOW_WITH_NEW_PAGE_AND_SEND_CALLBACK_DATA_TO_INTEGRATOR(33),
    CONTINUE_FLOW_WITH_O2_WIDGET(35),
    NEW_FLOW_IN_O2_OVERLAY(36);

    public final int w;

    private hcdu(int v1) {
        this.w = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.w;
    }

    public static hcdu b(int v) {
        switch(v) {
            case 0: {
                return hcdu.a;
            }
            case 1: {
                return hcdu.b;
            }
            case 2: {
                return hcdu.c;
            }
            case 3: {
                return hcdu.f;
            }
            case 4: {
                return hcdu.i;
            }
            case 5: {
                return hcdu.k;
            }
            case 6: {
                return hcdu.l;
            }
            case 7: {
                return hcdu.n;
            }
            case 8: {
                return hcdu.o;
            }
            case 10: {
                return hcdu.q;
            }
            case 11: {
                return hcdu.m;
            }
            case 12: {
                return hcdu.j;
            }
            case 15: {
                return hcdu.h;
            }
            case 23: {
                return hcdu.d;
            }
            case 27: {
                return hcdu.g;
            }
            case 28: {
                return hcdu.e;
            }
            case 29: {
                return hcdu.r;
            }
            case 30: {
                return hcdu.p;
            }
            case 0x1F: {
                return hcdu.s;
            }
            case 33: {
                return hcdu.t;
            }
            case 35: {
                return hcdu.u;
            }
            case 36: {
                return hcdu.v;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.w);
    }
}

