package dio.gof.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonEager eager = SingletonEager.getInstance();
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(eager);
        System.out.println(lazy);
        System.out.println(lazyHolder);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        eager = SingletonEager.getInstance();
        System.out.println(eager);

    }
}
