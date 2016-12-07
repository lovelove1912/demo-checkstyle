package checkstyle;

public class AccessLevelMethod {
    private void privateMethod() {
        System.out.println("I am private method");
    }
  
    /**
     * A package method can be called by any class within its package.
     */
    void packageMethod() { 
        System.out.println("I am package method");
    }
  
    protected void protectedMethod() {
        System.out.println("I am protected method");
    }
  
    /**
     * 
     */
    public void publicMethod() {
        System.out.println("I am public method");
    }
}
