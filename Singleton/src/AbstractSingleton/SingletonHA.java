package AbstractSingleton;

public abstract class SingletonHA {

    private static SingletonHA instance;

    public static SingletonHA getInstance(){
        if(instance == null){
            throw new RuntimeException("No registerd singletion");
        }
        return instance;
    }

    public static<T extends SingletonHA> void register(Class<T> c) throws Exception
    {
        if (SingletonHA.instance != null){
            throw new RuntimeException("Singleton alredy registerd");
        }

        SingletonHA.instance = (SingletonHA) c.newInstance();
    }
    
}
