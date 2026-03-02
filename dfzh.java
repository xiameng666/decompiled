final class dfzh {
    public final dcjy a;
    public final int b;

    public dfzh() {
        throw null;
    }

    public dfzh(dcjy dcjy0, int v) {
        this.a = dcjy0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof dfzh)) {
            dcjy dcjy0 = this.a;
            if(dcjy0 == null) {
                if(((dfzh)object0).a == null) {
                    return this.b == 0 ? ((dfzh)object0).b == 0 : this.b == ((dfzh)object0).b;
                }
            }
            else if(((ProtoLiteMessage)dcjy0).equals(((dfzh)object0).a)) {
                return this.b == 0 ? ((dfzh)object0).b == 0 : this.b == ((dfzh)object0).b;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v1;
        dcjy dcjy0 = this.a;
        int v = 0;
        if(dcjy0 == null) {
            v1 = 0;
        }
        else if(((ProtoLiteMessage)dcjy0).isImmutable()) {
            v1 = ((ProtoLiteMessage)dcjy0).s();
        }
        else {
            int v2 = dcjy0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)dcjy0).s();
                dcjy0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = this.b;
        if(v3 != 0) {
            v = v3;
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.a);
        switch(this.b) {
            case 1: {
                return a.d("TIMED_OUT", s, "FrameResult{frame=", ", errorCode=", "}");
            }
            case 2: {
                return a.d("CONNECTION_CLOSED", s, "FrameResult{frame=", ", errorCode=", "}");
            }
            default: {
                return a.d("null", s, "FrameResult{frame=", ", errorCode=", "}");
            }
        }
    }
}

