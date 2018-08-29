public class UserDAOFactory{
    private static final UserDAOFactory INSTANCE = new UserDAOFactory();
    private UserDAOFactory(){

    }

    public static UserDAOFactory getINSTANCE() {
        return INSTANCE;
    }

    public UserDao getUserDao(String name){
        switch (name.toUpperCase())
        {
            case "TEST": return new TestUserDao(new TestConnectionMaker(),0);
            case "REAL": return new RealUserDao(new RealConnectionMaker(),1);

            default: return null;
        }
    }

    public TestUserDao getTestUserDao(){
        return new TestUserDao(new TestConnectionMaker(),0);
    }

    public RealUserDao getRealUserDao(){
        return new RealUserDao(new RealConnectionMaker(),1);
    }
}
