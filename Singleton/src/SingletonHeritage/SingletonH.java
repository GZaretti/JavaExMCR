package SingletonHeritage;



public class SingletonH {
    private static SingletonH instance;

    public static SingletonH getInstance(){
        if(instance == null){
            throw new RuntimeException("No registerd singletion");
        }
        return instance;
    }

    public static void register(String className) throws Exception
    {
        if (SingletonH.instance != null){
            throw new RuntimeException("Singleton alredy registerd");
        }

        Class c = Class.forName(className);
        if(!SingletonH.class.isAssignableFrom(c)){
            throw new RuntimeException("Invalid Singleton subclass");
        }
        SingletonH.instance = (SingletonH) c.newInstance();
    }

}
