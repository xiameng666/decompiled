final class jqq extends jqi {
    @Override  // jqi
    public final void a(jqr jqr0, jqr jqr1) {
        jqr0.next = jqr1;
    }

    @Override  // jqi
    public final void b(jqr jqr0, Thread thread0) {
        jqr0.thread = thread0;
    }

    @Override  // jqi
    public final boolean c(jqs jqs0, jqm jqm0, jqm jqm1) {
        synchronized(jqs0) {
            if(jqs0.listeners == jqm0) {
                jqs0.listeners = jqm1;
                return true;
            }
        }
        return false;
    }

    @Override  // jqi
    public final boolean d(jqs jqs0, Object object0, Object object1) {
        synchronized(jqs0) {
            if(jqs0.value == object0) {
                jqs0.value = object1;
                return true;
            }
        }
        return false;
    }

    @Override  // jqi
    public final boolean e(jqs jqs0, jqr jqr0, jqr jqr1) {
        synchronized(jqs0) {
            if(jqs0.waiters == jqr0) {
                jqs0.waiters = jqr1;
                return true;
            }
        }
        return false;
    }
}

