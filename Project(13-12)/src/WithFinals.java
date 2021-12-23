class WithFinals
    {    private final void f()
        {    System.out.println("WithFinals.f()");
          }
        private void g()
        {    System.out.println("WithFinals.g()");
        }
    }
    class OverridingPrivate extends WithFinals
    {    private final void f()
        {    System.out.println("OverridingPrivate.f()");
          }
        private void g()
        {    System.out.println("OverridingPrivate.g()");
          }
    }
    class OverridingPrivate2 extends OverridingPrivate
    {    public final void f()
        {    System.out.println("OverridingPrivate2.f()");
          }
        public void g()
        {    System.out.println("OverridingPrivate2.g()");
          }
    }
    