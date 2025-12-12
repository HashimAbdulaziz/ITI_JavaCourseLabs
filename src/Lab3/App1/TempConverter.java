package Lab3.App1;

@FunctionalInterface
interface TempConverter<T, R>{
   R convert(T value);
}
