package sdf;

@FunctionalInterface
public interface MyRunnableInterface<T> {
    
    //T is generic. When used in function later, can define as String, or int etc
    T process (T a, T b);
}
