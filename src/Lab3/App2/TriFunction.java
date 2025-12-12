package Lab3.App2;

@FunctionalInterface
interface TriFunction<A, B, C, R>{
  R apply(A a, B b, C c);

}

