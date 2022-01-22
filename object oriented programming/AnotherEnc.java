public class AnotherEnc {
    private String name;

    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

    public static void main(String[] args)
    {
        AnotherEnc newObj = new AnotherEnc();
        newObj.setName("georgegoldman");
        System.out.println(newObj.getName());
    }
}
